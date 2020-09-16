package algorithms.interfacevsabstract;

import java.util.Set;

public abstract class Insan {
    private String cinsiyet;
    private Insan baba;
    private Insan anne;

    public Insan() {
    }

    public Insan(String cinsiyet, Insan baba, Insan anne) {
        this.cinsiyet = cinsiyet;
        this.baba = baba;
        this.anne = anne;
    }

    public abstract int getBoy();
    public abstract int getKilo();
    public abstract String getGozRengi();

    public Set<Insan> getKardesler;

    public void kardesEkle(Insan kardes){
        if(kardes.anne==this.anne || kardes.baba==this.baba){
            this.getKardesler.add(kardes);
            kardes.getKardesler.add(this);
        }

    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Insan getBaba() {
        return baba;
    }

    public void setBaba(Insan baba) {
        this.baba = baba;
    }

    public Insan getAnne() {
        return anne;
    }

    public void setAnne(Insan anne) {
        this.anne = anne;
    }
}
