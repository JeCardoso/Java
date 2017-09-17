package socketdemoserver;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemoServer {

	public static void main(String[] args) {
		try { // Cria um socket e indica qual porta devera escutar
			ServerSocket ss = new ServerSocket(10000);
			while(true){
				Socket s = ss.accept(); // Aguarda conexão
				
				/* Bufferizados - retira os dados da área do SO (driver de rede) e coloca na aplicação, liberando recursos da maquina*/
				BufferedInputStream bis = new BufferedInputStream(
				s.getInputStream()); // canal de transferencia de dados de entrada
				BufferedOutputStream bos = new BufferedOutputStream(
				s.getOutputStream());// canal de transferencia de dados de saida

				while(true){
					int ch = bis.read();
					System.out.println("recebido no servidor "+ (char) ch);
					bos.write((byte) ch);
					bos.flush(); // mandar os dados de saída para o cliente
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
