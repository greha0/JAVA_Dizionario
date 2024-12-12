/**
 * Rappresenta una parola
 * @author Greta Maria Brugnatti
 */
public class Parola {
    private String testo;
    private int occorrenze;

    /**
     * Crea una parola dato il testo
     * Non inserire caratteri speciali e/o punteggiatura
     * @param testo Lettere della parola
     */
    public Parola(String testo) {
        this.testo = testo;
        occorrenze = 1;
    }

    /**
     * Crea una parola dato il testo e il numero delle occorrenze
     * @param testo Stringa di lettere della parola
     * @param numOccorrenze Numero intero con il numero di occorrenze
     */
    public Parola (String testo, int numOccorrenze){
        this.testo = testo;
        occorrenze = numOccorrenze;
    }

    /**
     * Metodo getter che restituisce il numero di lettere della parola
     * @return Numero di lettere
     */
    public int getNumLettere(){
        return testo.length();
    }

    /**
     * Metodo getter che restituisce il numero di occorrenze della parola
     * @return Numero di occorrenze
     */
    public int getOccorrenze(){
        return occorrenze;
    }

    /**
     * Metodo getter che restituisce il testo della parola
     * @return Stringa di lettere della parola
     */
    public String getParola(){
        return testo;
    }

    /**
     * Aggiunge 1 al numero di occorrenze
     */
    public void incOccorrenza(){
        occorrenze++;
    }
}
