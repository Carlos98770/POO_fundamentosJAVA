package Encapsulamento;

public class Tester {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();

        controle1.ligar();
        for(int i = 0; i < 3; i++){
            controle1.maisVolume();
        }
        controle1.menosVolume();
        //controle1.play();
        controle1.abrirMenu();
        controle1.fecharMenu();


    }
}
