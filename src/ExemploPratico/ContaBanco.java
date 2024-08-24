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
        this.setStatus(true);
        if (tipo.equals("CC") ){
            this.setSaldo(this.getSaldo() + 50);
            this.setTipo("CC");
        }
        else if (tipo.equals("CP")){
            this.setSaldo(this.getSaldo() + 150);
            this.setTipo("CP");
        }

    }
    public void fecharConta() {
        if (this.getSaldo() < 0){
            System.out.println("Conta em débito, Não é possivel realizar o fechamento da conta");
        }
        else if( this.getSaldo() > 0){
            System.out.println("Dinheiro em conta, Não é possivel realizar o fechamento da conta");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso");
        }
    }

    public void depositar(float valor){
        if( this.isStatus() && valor>0){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito efetuado com sucesso");
        }
        else{
            System.out.println("Deposito não efetuado");
        }
    }
    public void sacar(float valor){
        if(this.isStatus() && this.getSaldo() > 0 && this.getSaldo() > valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso");
        }
        else{
            System.out.println("impossivel fazer o saque");
        }
    }
    public void pagarMensal(){
        if(this.getTipo().equals("CC")){
            this.setSaldo(this.getSaldo() - 50);
            System.out.println("Pagamento mensal realizado");
        }
        else if (this.getTipo().equals("CP")){
            this.setSaldo(this.getSaldo() - 30);
            System.out.println("Pagamento mensal realizado");
        }

    }
    public void imprimirDados(){
        System.out.println("-----------------------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta() +
                "\nTipo da conta: " + this.getTipo() +
                "\nDono da conta: " + this.getDono() +
                "\nSaldo da conta: " + this.getSaldo() +
                "\nStatus da conta: "+ this.isStatus());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        if( numConta > 0 ) {
            this.numConta = numConta;
        }
        else{
            System.out.println("Numero da conta precisa ser negativo");
        }
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
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
