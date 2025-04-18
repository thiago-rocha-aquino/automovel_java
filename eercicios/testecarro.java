package eercicios;

public class testecarro {
	 public static void main(String[] args) {
	        automovel carro = new automovel("ABC1234", "Preto", 4, "Gasolina", 50000,
	                                        "123456789", "1HGCM82633A123456", 5, false, 0);
	        
	        //Exibir informações
	        carro.exibirInformacoes();
	        
	        // Ligar o carro
	        System.out.println("Ligando o carro...");
	        carro.ligarDesligar(true);
	        System.out.println("Carro está ligado: " + carro.isLigado() +"\n");
	        
	        // Desligar o carro
	        System.out.println("Desligando o carro...");
	        carro.ligarDesligar(false);
	        System.out.println("Carro está ligado: " + carro.isLigado());
	    }
}
