public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int numCopias, int edicao) {
        super(titulo, anoPublicacao, numCopias);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    protected int calcularMultaEspecifica(int diasAtraso) {
        return diasAtraso * 2;
    }
}
