package eercicios;

public class testeLampada {
	 public static void main(String[] args) {
	        lampada Lampada = new lampada();
	        
	        Lampada.mostrarestado();
	        
	        System.out.println("ligando a lampada... " +"\n");
	        Lampada.ligar();
	        Lampada.mostrarestado();
	        
	        System.out.println("desligando a lampada.... " +"\n");
	        Lampada.desligar();
	        Lampada.mostrarestado();
	 }
}
