
public class Conta extends Thread {

	private int id;
	private int valor;
	private int tempo;
	
	public Conta(int id, int valor, int tempo){
		this.id = id;
		this.valor = valor;
		this.tempo = tempo;
	}
	
	public void run(){
		try{
			for (int i = 0; i < valor; i++) {
				System.out.println("Thread ID: "+id+" valor:"+i);
				Thread.sleep(tempo);
			}
		}
		catch(Exception ex){
			System.out.println("Deu ruim... " +ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		
		Conta c1 = new Conta(1, 10,500);
		Conta c2 = new Conta(2, 10, 800);
		
		c1.start();
		c2.start();
		
		c1.join();
		c2.join();
		
		System.out.println("Terminei");
		
		}
		catch(Exception ex){
			System.out.println("Deu ruim na Main..." + ex.getMessage());
		}
	}

}
