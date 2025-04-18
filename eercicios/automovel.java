package eercicios;

public class automovel{
    private String placa;
    private String cor;
    private int nrPortas;
    private String combustivel;
    private long quilometragem;
    private String renavam;
    private String chassi;
    private int nrMarchas;
    private boolean ligado;
    private int velocidade;

    // Constructor
    public automovel(String placa, String cor, int nrPortas, String combustivel, long quilometragem, 
                     String renavam, String chassi, int nrMarchas, boolean ligado, int velocidade) {
        this.placa = placa;
        this.cor = cor;
        this.nrPortas = nrPortas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.renavam = renavam;
        this.chassi = chassi;
        this.nrMarchas = nrMarchas;
        this.ligado = ligado;
        this.velocidade = velocidade;
    }

    // Método para ligar ou desligar o automóvel
    public void ligarDesligar(boolean ligaDesliga) {
        this.ligado = ligaDesliga;
    }

    // Getters e Setters
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Método para exibir informações do automóvel
    public void exibirInformacoes() {
        System.out.println("Placa: " + placa + "\n");
        System.out.println("Cor: " + cor + "\n");
        System.out.println("Número de Portas: " + nrPortas +"\n");
        System.out.println("Combustível: " + combustivel +"\n");
        System.out.println("Quilometragem: " + quilometragem +"\n");
        System.out.println("Renavam: " + renavam +"\n");
        System.out.println("Chassi: " + chassi +"\n");
        System.out.println("Número de Marchas: " + nrMarchas +"\n");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não") + "\n");
        System.out.println("Velocidade: " + velocidade + " km/h" + "\n");
    }
}