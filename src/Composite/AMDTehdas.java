package Composite;

public class AMDTehdas implements LaiteTehdas{
    @Override
    public Kotelo luoKotelo() {
        return new Kotelo(150);
    }

    @Override
    public Emolevy luoEmolevy() {
        return new Emolevy(300);
    }

    @Override
    public Prosessori luoProsessori() {
        return new Prosessori(600);
    }

    @Override
    public Muistipiiri luoMuistiPiiri() {
        return new Muistipiiri(150);
    }

    @Override
    public Naytonohjain luoNaytonOhjain() {
        return new Naytonohjain(1000);
    }

    @Override
    public Verkkokortti luoVerkkoKortti() {
        return new Verkkokortti(100);
    }
}
