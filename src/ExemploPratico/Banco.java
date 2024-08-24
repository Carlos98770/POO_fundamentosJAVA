package ExemploPratico;

public class Banco {
    public static void main(String [] args){
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1234);
        pessoa1.setDono("Carlos");
        pessoa1.abrirConta("CC");
        pessoa1.depositar(1000);
        pessoa1.imprimirDados();

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(3456);
        pessoa2.setDono("Eduardo");
        pessoa2.abrirConta("CP");
        pessoa2.depositar(3000);
        pessoa2.imprimirDados();

    }

}
