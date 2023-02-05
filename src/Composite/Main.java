package Composite;

public class Main {

    public static void main(String[] args) {

        Tietokone intelTietokone = new Tietokone();
        LaiteTehdas intel = new IntelTehdas();
        Kotelo kotelo = intel.luoKotelo();
        Emolevy emolevy = intel.luoEmolevy();
        Muistipiiri muistipiiri = intel.luoMuistiPiiri();
        Naytonohjain naytonohjain = intel.luoNaytonOhjain();
        Prosessori prosessori = intel.luoProsessori();
        Verkkokortti verkkokortti = intel.luoVerkkoKortti();

        emolevy.lisaaOsa(muistipiiri);
        emolevy.lisaaOsa(naytonohjain);
        emolevy.lisaaOsa(prosessori);
        emolevy.lisaaOsa(verkkokortti);
        kotelo.lisaaOsa(emolevy);
        intelTietokone.lisaaOsa(kotelo);

        System.out.println("Intel " + intelTietokone);

        LaiteTehdas amdTehdas = new AMDTehdas();

        kotelo = amdTehdas.luoKotelo();
        emolevy = amdTehdas.luoEmolevy();
        muistipiiri = amdTehdas.luoMuistiPiiri();
        naytonohjain = amdTehdas.luoNaytonOhjain();
        prosessori = amdTehdas.luoProsessori();
        verkkokortti = amdTehdas.luoVerkkoKortti();

        emolevy.lisaaOsa(amdTehdas.luoKotelo());
        emolevy.lisaaOsa(naytonohjain);
        emolevy.lisaaOsa(muistipiiri);
        emolevy.lisaaOsa(prosessori);
        emolevy.lisaaOsa(verkkokortti);
        kotelo.lisaaOsa(emolevy);

        Tietokone amdkone = new Tietokone();

        amdkone.lisaaOsa(kotelo);

        System.out.println("AMD " + amdkone);








    }
}
