public class Escola {
    public static void main(String[] args) {
        Transporte[] meios = {
            new Onibus("Seu João"),
            new Bicicleta("Lucas"),
            new Van("Dona Maria")
        };

        for (Transporte t : meios) {
            t.transportar(); 
        }
    }
}
