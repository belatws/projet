class Bicicleta extends Transporte {
    public Bicicleta(String condutor) {
        super(condutor);
    }

    @Override
    public void transportar() {
        System.out.println("Bicicleta conduzida por " + condutor + " leva um aluno.");
    }
}
