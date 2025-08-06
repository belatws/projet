class Van extends Transporte {
    public Van(String condutor) {
        super(condutor);
    }

    @Override
    public void transportar() {
        System.out.println("Van conduzida por " + condutor + " leva pequenos grupos de alunos.");
    }
}