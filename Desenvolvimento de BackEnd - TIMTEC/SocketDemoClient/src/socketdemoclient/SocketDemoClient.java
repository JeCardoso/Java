package socketdemoclient;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemoClient {

	public static void main(String[] args) {
		try {
			// Cria um socket e indica qual host e porta devera escutar
			Socket s = new Socket("localhost",10000);
			
			
			/* Bufferizados - retira os dados da área do SO (driver de rede) e coloca na aplicação, liberando recursos da maquina*/
			BufferedInputStream bis = new BufferedInputStream(
			s.getInputStream()); // canal de transferencia de dados de entrada
			BufferedOutputStream bos = new BufferedOutputStream(
			s.getOutputStream());// canal de transferencia de dados de saida
			
			String str = "Olá mundo";
			
			/*Manda a string caractere por caractere para o servidor e recebe uma resposta*/
			while(true){
				for(int i = 0; i < str.length(); i++){
					byte b = (byte) str.charAt(i);
					bos.write(b);
					bos.flush(); // mandar os dados de saída para o servidor
					char ch = (char) bis.read();
					System.out.println("Recebido no client: "+ ch);
				}
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
