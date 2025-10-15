public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void mover() {
        System.out.println("A moto está acelerando pela pista!");
    }

    public void empinar() {
        System.out.println("A moto está empinando!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }
}
