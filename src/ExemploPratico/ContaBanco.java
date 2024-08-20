package ExemploPratico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo){
        setStatus(true);
        if (tipo.equals("CC") ){
            setSaldo(getSaldo() + 50);
        }
        else if (tipo.equals("CP")){
            setSaldo(getSaldo() + 150);
        }

    }
    public void fecharConta() {
        if (getSaldo() < 0){
            System.out.println("Conta em débito");
        }
        else if( getSaldo() > 0){
            System.out.println("Dinheiro em conta");
        }
        else{
            setStatus(false);
        }
    }

    public void depositar(float valor){
        if( isStatus() && valor>0){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito efetuado com sucesso");
        }
        else{
            System.out.println("Deposito não efetuado");
        }
    }
    public void sacar(float valor){
        if(isStatus() && getSaldo() > 0){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso");
        }
        else{
            System.out.println("Conta em débito, impossivel fazer o saque");
        }
    }
    public void pagarMensal(){
        if(getTipo().equals("CC")){
            setSaldo(getSaldo() - 50);
            System.out.println("Pagamento mensal realizado");
        }
        else if (getTipo().equals("CP")){
            setSaldo(getSaldo() - 30);
            System.out.println("Pagamento mensal realizado");
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
