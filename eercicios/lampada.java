package eercicios;

public class lampada {
public boolean estado;

public void ligar() {
	estado = true;
}

public void desligar() {
	   estado = false;
	   
}

public void mostrarestado() {
	if(estado) {
		System.out.println("ligado" +"\n");
	}
	else {
		System.out.println("desligado" +"\n");
	}
	
}



}
 