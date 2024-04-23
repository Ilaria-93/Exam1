/***Traccia Bonus**
 **Classe Esame e Facoltà:**
 - Crea una classe `Esame` con attributi titolo, docente (istanza di `Docente`),
 data e voto.
 - Crea una classe `Facolta` che rappresenta una facoltà universitaria,
 con attributi nome, elenco dei corsi disponibili e elenco degli esami
 sostenuti dagli studenti.
 - Implementa un metodo per registrare un nuovo esame sostenuto da uno studente e un metodo per calcolare la media dei voti degli esami di uno studente.
 - Utilizza la classe e la funzione nel main */

public class Main {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Prof. Smith");
        Docente docente2 = new Docente("Prof. Pollock");
        Docente docente3 = new Docente("Prof. Rossi");

        Esame esame1 = new Esame("Matematica", docente1, "23/04/2024", 27);
        Esame esame2 = new Esame("Fisica", docente2, "28/04/2024", 23);
        Esame esame3 = new Esame("Analisi", docente3, "12/05/2024", 28);

        Facoltà facoltà = new Facoltà("Matematica");
        facoltà.aggiungiEsame("Informatica");
        facoltà.aggiungiEsame("Fisica");
        facoltà.aggiungiEsame("Analisi");

        facoltà.registraEsame(esame1);
        facoltà.registraEsame(esame2);
        facoltà.registraEsame(esame3);


        System.out.println("Media voti degli esami: " + facoltà.calcolaMediaVoti());
    }
}