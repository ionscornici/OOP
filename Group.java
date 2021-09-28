package utm.md;

public class Group {
    String name;
    int nrStudenti;
    int promotia;
    boolean buget;
    String limbaStudii = "RO";

    Group(String name, int nrStudenti, int promotia, boolean buget) {
        this.name = name;
        this.nrStudenti = nrStudenti;
        this.promotia = promotia;
        this.buget = buget;
    }
    void print() {
        System.out.println("Nume: " + this.name + "\n" +  "Nr.studenti: " + this.nrStudenti + "\n" + "Promotia: " + this.promotia);
    }


}
