package socketdemoserverthreaded;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemoServerThreaded {

	public static void main(String[] args) {
		try {
			// Cria um socket e indica qual porta devera escutar
			ServerSocket ss = new ServerSocket(10000);
			while(true){
				Socket s = ss.accept(); // Aguarda conexão
				Service servico = new Service(s);
				servico.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static class Service extends Thread{
		
		Socket socket = null;
		
		Service(Socket s){
			socket = s;
		}
		
		public void run(){
			try{
				
				/* Bufferizados - retira os dados da área do SO (driver de rede) e coloca na aplicação, liberando recursos da maquina*/
				BufferedInputStream bis = new BufferedInputStream(
				socket.getInputStream()); // canal de transferencia de dados de entrada
				BufferedOutputStream bos = new BufferedOutputStream(
				socket.getOutputStream());// canal de transferencia de dados de saida
				
				while(true){
					int ch = bis.read();
					System.out.println("recebido no servidor "+ (char) ch);
					bos.write((byte) ch);
					bos.flush(); // mandar os dados de saída para o cliente
				}
				
				
				
			}catch(Exception e){
				
			}
		}
		
	}
}

	