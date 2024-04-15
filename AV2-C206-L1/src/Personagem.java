public class Personagem {
        private String nome;
        private int vida;
        private int energia;
        private int poder;

        public void mostraInfos() {
                System.out.println();
                System.out.println("Infos dos personagens:");
                super.mostraInfos();
                System.out.println("Nome: " + this.nome);
                System.out.println("Vida: " + this.vida);
                System.out.println("poder: " + this.poder);
                System.out.println("Energia: " + this.energia);
        }

        setNome(nome) {
                this.nome = nome;
        }

        setVida(vida) {
                this.vida = vida;
        }

        setEnergia(energia) {
                this.energia = energia;
        }

        setPoder(poder) {
                this.poder = poder;
        }

        getNome() {
                return this.nome;
        }

        getVida() {
                return this.vida;
        }

        getEnergia() {
                return this.energia;
        }

        getPoder() {
                return this.poder;
        }

        public void usarHabilidades() {
                
        }
}