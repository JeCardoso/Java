package webserversimples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServerSimples {

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

				String str = "";
				int recEndLine = 0;
				
				while(true){
					int ch = bis.read();
					str += (char) ch;
					if(ch == 10){ // As mensagens acabam no código ASC 10
						System.out.println(str);
						str="";
					}
					if(ch == 10 || ch==13){
						recEndLine++;
					}else{
						recEndLine = 0;
					}
					
				}				
			}catch(Exception e){

			}
		}

	}
}
