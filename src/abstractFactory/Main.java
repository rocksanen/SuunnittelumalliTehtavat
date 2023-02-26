package abstractFactory;

public class Main {

    public static void main(String[] args) {

        VaateTehdas boss = new BossTehdas();
        VaateTehdas adidas = new AdidasTehdas();

        Jasper opiskelija = new Jasper(adidas);
        Jasper massipaallikko = new Jasper(boss);

        System.out.println(opiskelija);
        System.out.println(massipaallikko);


    }
}
