package Composite;

public class IntelTehdas implements LaiteTehdas{
    @Override
    public Kotelo luoKotelo() {
        return new Kotelo(200);
    }

    @Override
    public Emolevy luoEmolevy() {
        return new Emolevy(400);
    }

    @Override
    public Prosessori luoProsessori() {
        return new Prosessori(500);
    }

    @Override
    public Muistipiiri luoMuistiPiiri() {
        return new Muistipiiri(200);
    }

    @Override
    public Naytonohjain luoNaytonOhjain() {
        return new Naytonohjain(1200);
    }

    @Override
    public Verkkokortti luoVerkkoKortti() {
        return new Verkkokortti(100);
    }
}
