import java.util.StringTokenizer;

/**
 * Un semplice dizionario
 * @author Greta Maria Brugnatti
 */
public class Dizionario {
    private Parola[] arrayParole;
    /**
     * Crea un dizionario vuoto
     */
    public Dizionario() {

    }

    /**
     * Crea un dizionario data una stringa di parole
     * @param frase Stringa di parole
     */
    public Dizionario (String frase){
        int i=0, k;
        String parola, testo;



        //Pulizia della stringa
        frase = frase.toLowerCase();
        frase = frase.replace(",", "");
        frase = frase.replace(".", "");
        frase = frase.replace(":", "");
        frase = frase.replace(";", "");
        frase = frase.replace("\"", "");
        frase = frase.replace("'", "");
        frase = frase.replace("!", "");
        frase = frase.replace("?", "");
        frase = frase.replace("(", "");
        frase = frase.replace(")", "");
        frase = frase.replace("<", "");
        frase = frase.replace(">", "");

        //Dichiarazione String Tokenizer
        StringTokenizer st = new StringTokenizer(frase, " ");
        arrayParole = new Parola[st.countTokens()];
        testo = frase;

        testo = testo.replace(" ", "");

        //System.out.println(frase);

        while(st.hasMoreTokens()){
            parola = st.nextToken();
            arrayParole[i] = new Parola(parola);
            i++;
        }

        for(i=0; i<arrayParole.length; i++){
            if(numOccorrenze(arrayParole[i].getParola())>1){
                for(k=i+1; k < arrayParole.length; k++){
                    if(arrayParole[i].getParola().equals(arrayParole[k])){
                        //scalare tutte le parole
                    }
                }
            }
        }

    }

    /**
     * Conta il numero di occorrenze di una parola
     * @param parola Parola da cercare
     * @return Numero di occorrenze
     */
    public int numOccorrenze(String parola){
        int numOcc=0;
        for (int i=0; i< arrayParole.length; i++) {
            if (arrayParole[i].getParola().equals(parola)) {
                numOcc++;
            }
        }
        return numOcc;
    }

    /**
     * Stampa l'array di parole
     */
    public void stampaArray(){
        for(int i=0; i< arrayParole.length; i++){
            System.out.println(arrayParole[i].getParola());
        }
    }
    public static void main(String [] args){
        Dizionario diz = new Dizionario("Ciao a tutti quanti belli e brutti");

    }
}
