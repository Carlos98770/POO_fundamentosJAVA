package introducao;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    public Caneta(){

    }

    public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
    private void imprimir(){
        System.out.println("Modelo: "+ modelo + "\nCor: " + cor +"\nPonta: " + ponta +"\nCarga: "+ carga + "\nTamapada: "+ tampada);

    }

    public void status(){
        imprimir();
    }

    public void rabiscar(){
        if (tampada){
            System.out.println("ERRO");

        }
        else{
            System.out.println("RABISCOU");
        }
    }
    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}

