public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void mover() {
        System.out.println("O carro está dirigindo pela estrada.");
    }

    public void ligarArCondicionado() {
        System.out.println("O ar-condicionado foi ligado!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + quantidadePortas);
    }
}
