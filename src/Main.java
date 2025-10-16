public class Main {
    public static void fazerMover(Veiculo v) {
        v.mover();
    }

    public static void main(String[] args) {

        Veiculo v1 = new Carro("Toyota", "Corolla", 2020, 4);
        Veiculo v2 = new Moto("Honda", "CB500", 2022, true);
        Veiculo v3 = new Caminhao("Volvo", "FH", 2019, 25.5);


        System.out.println(" Testando método polimórfico mover() ");
        fazerMover(v1);
        fazerMover(v2);
        fazerMover(v3);

        System.out.println("\nChamando métodos exclusivos dos filhos ");

        if (v1 instanceof Carro) {
            ((Carro) v1).ligarArCondicionado();
        }

        if (v2 instanceof Moto) {
            ((Moto) v2).empinar();
        }

        if (v3 instanceof Caminhao) {
            ((Caminhao) v3).carregarCarga(10.0);
        }
    }
}
