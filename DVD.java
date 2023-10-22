public class DVD extends ItemBiblioteca{
    private int DuracaoMin;

    public DVD(String titulo, int anoPublicacao, int numCopias, int DuracaoMin) {
        super(titulo, anoPublicacao, numCopias);
        this.DuracaoMin = DuracaoMin;
    }

    public int getDuracaoMin() {
        return DuracaoMin;
    }

    public void setDuracaoMin(int DuracaoMin) {
        this.DuracaoMin = DuracaoMin;
    }
    
    @Override
    protected int calcularMultaEspecifica(int diasAtraso) {
        return diasAtraso * 3;
    }
}

