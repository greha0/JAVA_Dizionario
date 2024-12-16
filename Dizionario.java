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
            testo = testo.substring(parola.length());
            System.out.println(testo);

            if(testo.contains(parola)){

            }
            arrayParole[i] = new Parola(parola);
            if(testo.contains(parola)){

            }

            i++;
        }
    }

    /*public int numOccorrenze(String parola){

    }*/
    public static void main(String [] args){
        Dizionario diz = new Dizionario("Ciao a tutti quanti belli e brutti");

    }
}
