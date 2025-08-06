class Onibus extends Transporte {
    public Onibus(String condutor) {
        super(condutor);
    }

    @Override
    public void transportar() {
        System.out.println("Ônibus conduzido por " + condutor + " transporta vários alunos.");
    }
}