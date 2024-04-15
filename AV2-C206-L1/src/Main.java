
public class Main {
    public static void main(String[] args) {

     Arma arma1 = new Arma();
     arma1.setArma("Espada");
     arma1.setDano(60);

     Arma arma2 = new Arma();
     arma2.setArma("Adaga");
     arma2.setDano(30);


    Personagem personagem = new Guerreiro();
    personagem.setNome("Inca");
    personagem.setVida (100);
    personagem.setPoder (50);
    personagem.setEnergia(100);
    personagem.mostraInfos();

        Personagem personagem2 = new Assassino();
        personagem2.setNome("Maya");
        personagem2.setVida (160);
        personagem2.setPoder (90);
        personagem2.setEnergia(50);
        personagem2.mostraInfos();

        Personagem personagem3 = new Mago();
        personagem3.setNome("Harry");
        personagem3.setVida (70);
        personagem3.setPoder (150);
        personagem3.setEnergia(300);
        personagem3.mostraInfos();




        }


    }
}