package Encapsulamento;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("Ligado ----------  " + this.isLigado());
            System.out.println("\nTocando---------- " + this.isTocando());
            System.out.println("Volume: ");
            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.printf("|" + " ");
            }
            System.out.println("      " + this.getVolume());
        }
        else {
            System.out.println("TV DESLIGADA");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu Fechando...........");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }

    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.isTocando()){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.isTocando()){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if( !(this.isTocando()) && this.isLigado()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if( this.isTocando() && this.isLigado()){
            this.setTocando(false);
        }
    }
}
