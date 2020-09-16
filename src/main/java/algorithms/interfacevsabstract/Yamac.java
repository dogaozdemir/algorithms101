package algorithms.interfacevsabstract;

import java.util.Date;

public class Yamac extends Insan implements NufusCuzdani,OgrenciKarti{



    @Override
    public int getBoy() {
        return getAnne().getBoy()+getBaba().getBoy()/2;
    }

    @Override
    public int getKilo() {
        return getAnne().getKilo()+getBaba().getKilo()/2;
    }

    @Override
    public String getGozRengi() {
        return getAnne().getGozRengi();
    }

    @Override
    public String getCinsiyet() {
        return super.getCinsiyet();
    }

    @Override
    public String getAd() {
        return "Yamac";
    }

    @Override
    public String getSoyad() {
        return "Oz";
    }

    @Override
    public String getSehir() {
        return "Istanbul";
    }

    @Override
    public Date getDogumTarihi() {
        return null;
    }

    @Override
    public String getOkulAdi() {
        return "Bahcesehir Uni";
    }
}
