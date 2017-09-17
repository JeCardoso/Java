package negocios;

import org.junit.*;

public class VendaTest {
	
	private Venda venda;
	  private Integer quantidade;
	  private Double valor;

	  // Esta anotação define que este método será executado antes do início de cada teste.

	  @Before
	  public void iniciarTeste(){
	     valor = 100.00;
	     quantidade = 5;
	  }

	  // Aqui faremos um caso que teste um comportamento de sucesso do método.

	  @Test
	  public void deveCalcularValorTotalCorreto(){
	     // Instância uma nova Venda baseado nos atributos quantidade e valor.

	     venda = new Venda(quantidade, valor);
	     // Definimos um valor que esperado que o método retorne.

	     Double resultadoEsperado = 500.00;

	     // Executamos o método da classe Venda.

	     Double resultadoObtido = venda.calcularValorTotal();

	     // Comparamos os valores com objetivo de testar se o valor esperado é igual ao valor do resultado obtido pelo método: venda.calcularValorTotal().

	     Assert.assertEquals(resultadoEsperado, resultadoObtido);
	  }

	  // Aqui iremos testar um comportamento de falha do método. Na linha abaixo definimos que esse caso de teste irá lançar uma exceção como sucesso.

	  @Test(expected = IllegalArgumentException.class)
	  public void deveGerarUmaExcecaoAoTentarCalcularAtributosNulos(){
	     // Definimos aqui os atributos com falhas.

	     Double valorNulo = null;
	     Integer quantidadeNula = null;
	     // Instanciamos uma Venda com valores nulos.

	     venda = new Venda(quantidadeNula, valorNulo);
	     // É executado o método, pelo qual será lançada uma exceção como caso de sucesso.

	     venda.calcularValorTotal();
	  }

	  // Esta anotação define que este método será executado depois do término de cada teste.

	  @After
	  public void finalizarTeste(){
	     venda = null;
	     valor = null;
	     quantidade = null;
	  }

}
