package negocios;

import org.junit.*;

public class VendaTest {
	
	private Venda venda;
	  private Integer quantidade;
	  private Double valor;

	  // Esta anota��o define que este m�todo ser� executado antes do in�cio de cada teste.

	  @Before
	  public void iniciarTeste(){
	     valor = 100.00;
	     quantidade = 5;
	  }

	  // Aqui faremos um caso que teste um comportamento de sucesso do m�todo.

	  @Test
	  public void deveCalcularValorTotalCorreto(){
	     // Inst�ncia uma nova Venda baseado nos atributos quantidade e valor.

	     venda = new Venda(quantidade, valor);
	     // Definimos um valor que esperado que o m�todo retorne.

	     Double resultadoEsperado = 500.00;

	     // Executamos o m�todo da classe Venda.

	     Double resultadoObtido = venda.calcularValorTotal();

	     // Comparamos os valores com objetivo de testar se o valor esperado � igual ao valor do resultado obtido pelo m�todo: venda.calcularValorTotal().

	     Assert.assertEquals(resultadoEsperado, resultadoObtido);
	  }

	  // Aqui iremos testar um comportamento de falha do m�todo. Na linha abaixo definimos que esse caso de teste ir� lan�ar uma exce��o como sucesso.

	  @Test(expected = IllegalArgumentException.class)
	  public void deveGerarUmaExcecaoAoTentarCalcularAtributosNulos(){
	     // Definimos aqui os atributos com falhas.

	     Double valorNulo = null;
	     Integer quantidadeNula = null;
	     // Instanciamos uma Venda com valores nulos.

	     venda = new Venda(quantidadeNula, valorNulo);
	     // � executado o m�todo, pelo qual ser� lan�ada uma exce��o como caso de sucesso.

	     venda.calcularValorTotal();
	  }

	  // Esta anota��o define que este m�todo ser� executado depois do t�rmino de cada teste.

	  @After
	  public void finalizarTeste(){
	     venda = null;
	     valor = null;
	     quantidade = null;
	  }

}
