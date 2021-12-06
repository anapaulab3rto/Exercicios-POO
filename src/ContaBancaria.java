public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;



    public void estadoAtual(){
        System.out.println(getStatus());
        System.out.println(getDono());
        System.out.println(getSaldo());
        System.out.println(getNumConta());
        System.out.println(getTipo());
    }
    public ContaBancaria() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void abrirConta(String type){
        this.setTipo(type);
        this.setStatus(true);
        if (type.equals("CC")){
           this.setSaldo(50);
        }
        else if(type.equals("CP")){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Não foi possivel fechar conta, saldo positivo");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Não foi possivel fechar conta, saldo negativo");
        }
        else{
            this.setStatus(false);
        }
    }
    public void depositar(float valor){
        if (status){
            this.setSaldo(getSaldo() + valor);
        }
        else{
            System.out.println("Não foi possivel depositar, conta fechada");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor)
            this.setSaldo(this.getSaldo() - valor);
        }
        else{
            System.out.println("Saldo insufiiciente");
        }
    }

    public void pagarMensal(){
        float valor = 0;
        if (tipo.equals("CC")){
            valor = 12;
        }
        else if (tipo.equals("CP")){
            valor = 20;
        }
        if (status) {
            this.setSaldo(getSaldo() - valor);
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
