abstract class Transacao implements Processavel, Autenticavel {
    protected double valor;

    public Transacao(double valor) {
        this.valor = valor;
    }

    public void autenticar() {
        System.out.println("Autenticando transação de R$" + valor);
    }

    public abstract void processarPagamento();
}