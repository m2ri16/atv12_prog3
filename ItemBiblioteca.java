import java.time.LocalDate;

 class ItemBiblioteca {
    private String Titulo;
    private int anoPublicacao;
    private int numCopias;
    private LocalDate dataEmprestimo; // Data de empréstimo

    public ItemBiblioteca(String titulo, int anoPublicacao, int numCopias) {
        this.Titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.numCopias = numCopias;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
    
    public void emprestar() {
        if (numCopias > 0) {
            numCopias--;
            dataEmprestimo = LocalDate.now();
            System.out.println("Item emprestado!");
        } else {
            System.out.println("Não há cópias disponíveis.");
        }
    }

    public void devolver() {
        if (dataEmprestimo != null) {
            numCopias++;
            dataEmprestimo = null;
            System.out.println("Item devolvido!");
        } else {
            System.out.println("O item não está emprestado.");
        }
    }

    public void calcularMulta(LocalDate dataDevolucao) {//calcular multa pela diferença de datas.
        if (dataEmprestimo != null) {
            int diasAtraso = (int) dataEmprestimo.until(dataDevolucao).getDays();
            int multa = calcularMultaEspecifica(diasAtraso);
            System.out.println("Multa: R$" + multa);
        } else {
            System.out.println("O item não está emprestado.");
        }
    }

    protected int calcularMultaEspecifica(int diasAtraso) {
        return 0; // Multa padrão de 0
    }
    
}