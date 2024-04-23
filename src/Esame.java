public class Esame {
    private String titolo;
    private Docente docente;
    private String data;
    int voto;

    public Esame(String titolo, Docente docente, String data, int voto) {
        this.titolo = titolo;
        this.docente = docente;
        this.data = data;
        this.voto = voto;
    }
}
