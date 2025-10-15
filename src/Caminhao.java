public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando carga pela rodovia.");
    }

    public void carregarCarga(double peso) {
        System.out.println("Carregando " + peso + " toneladas de carga...");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}
