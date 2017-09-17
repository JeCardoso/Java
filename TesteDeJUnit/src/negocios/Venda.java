package negocios;

public class Venda {
	
	   private Integer quantidade;
	   private Double valor;

	   public Venda(Integer quantidade, Double valor){
	      this.quantidade = quantidade;
	      this.valor = valor;
	   }

	   // método a testar.

	   public Double calcularValorTotal(){
	      if(quantidade == null || valor == null){
	         throw new IllegalArgumentException();
	      }
	      return quantidade * valor;
	   }

	   public Integer getQuantidade(){
	      return this.quantidade;
	   }

	   public Double getValor(){
	      return this.valor;
	   }
}
