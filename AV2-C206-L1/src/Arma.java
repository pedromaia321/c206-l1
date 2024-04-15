public class Arma {

    private String arma;
    private int dano;


    public void mostraInfos() {
        System.out.println("Infos da arma: " + arma + " | " + dano);
    }

    setDano(dano) {
        this.dano = dano;
    }

    setArma(arma) {
        this.arma = arma;
    }

    getDano() {
        return this.dano;
    }

    getArma() {
        return this.arma;
    }
}


