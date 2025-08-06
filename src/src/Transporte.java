abstract class Transporte {
    protected String condutor;

    public Transporte(String condutor) {
        this.condutor = condutor;
    }

    public abstract void transportar(); 
}