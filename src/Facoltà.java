import java.util.ArrayList;

public class Facoltà {
    private String nome;
    ArrayList<String> corsiDisponibili;
    ArrayList<Esame> esamiSostenuti;

    public Facoltà(String nome) {
        this.nome = nome;
        this.corsiDisponibili = new ArrayList<String>();
        this.esamiSostenuti = new ArrayList<>();
    }

    public void aggiungiEsame (String esame) {
        this.corsiDisponibili.add(esame);
    }

    public void registraEsame (Esame esame) {
        this.esamiSostenuti.add(esame);
    }

    public double calcolaMediaVoti () {
        int totaleVoti = 0;
        for (Esame esame : esamiSostenuti) {
            totaleVoti += esame.voto;
        }
        return (double) totaleVoti / esamiSostenuti.size();
    }
}
