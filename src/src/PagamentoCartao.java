class PagamentoCartao extends Transacao {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    public void processarPagamento() {
        autenticar(); 
        System.out.println("Processando pagamento com cartão: " + numeroCartao + " no valor de R$" + valor);
    }
}