public class App {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setDono("Amanda");
        conta1.setNumConta(11111);

        conta1.abrirConta("CP");
        conta1.depositar(700);
        conta1.estadoAtual();
    }
}
