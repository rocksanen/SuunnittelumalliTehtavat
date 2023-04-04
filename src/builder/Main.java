package builder;


public class Main {

    public static void main(String[] args) {

        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();

        hesburgerBuilder.addBun();
        hesburgerBuilder.addPatty();
        hesburgerBuilder.addCheese();
        hesburgerBuilder.addSauce();

        System.out.println("Hesburgerin mausteet: ");
        System.out.println(hesburgerBuilder.getBurger());

        McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();
        mcDonaldsBuilder.addBun();
        mcDonaldsBuilder.addCheese();
        mcDonaldsBuilder.addPatty();
        mcDonaldsBuilder.addSauce();

        System.out.println("");

        System.out.println("McDonalds mausteet: ");
        System.out.println(mcDonaldsBuilder.getBurger());
    }
}
