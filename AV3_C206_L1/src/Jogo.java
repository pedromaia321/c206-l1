public class Jogo implements java.io.Serializable {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) throws PrecoNegativoException {
        if (preco < 0) {
            throw new PrecoNegativoException("Preço não pode ser negativo!");
        }
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Preço: " + preco);
    }
}
