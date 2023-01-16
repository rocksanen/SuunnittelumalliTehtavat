package FactoryMethod;



public abstract class AterioivaOtus {

    Juoma juoma = null;

    public abstract Juoma createJuoma();


    public void aterioi(){
        syö();
        juo();
    }

    public void syö(){
        System.out.println("Kylläpä ruoka maistuukin hyvältä, jos se on pitsaa");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää" + "\n");
    }
}
