package main.java.set.OperacoesBasicas;

public class PalavraUnica {
    //Atributos

    private String palavraUnica;

    public PalavraUnica(String palavraUnica) {
        this.palavraUnica = palavraUnica;
    }

    public String getPalavraUnica() {
        return palavraUnica;
    }

    @Override
    public String toString() {
        return
                "palavraUnica: " + palavraUnica + "|" +
                " ";
    }
}
