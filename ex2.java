package utm.md.lab1;

public class ex2 {
    String tara;
    int nrPopulatie;
    int orase;
    boolean taraEuropeana = false;

    ex2(String tara, int nrPopulatie, int orase, boolean taraEuropeana) {
        this.tara = tara;
        this.nrPopulatie = nrPopulatie;
        this.orase = orase;
        this.taraEuropeana = taraEuropeana;
    }
    void print() {
        System.out.println("Tara: " + this.tara +
                "\n" +  "nrPopulatiei: " + this.nrPopulatie +
                "\n" + "Nr. de orase: " + this.orase +"\n" + "Tara Europena: " + this.taraEuropeana);
    }

}
