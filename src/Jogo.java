public class Jogo {
    public static void main(String[] args) {
        Personagem[] equipe = {
            new Mago("Merlin"),
            new Guerreiro("Arthur"),
            new Arqueiro("Legolas")
        };

        for (Personagem p : equipe) {
            p.atacar(); 
        }
    }
}
