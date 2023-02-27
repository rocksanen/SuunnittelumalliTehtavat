package decorator;

public class Main {


    public static void main(String[] args) {

        //jep
        IDataStructure dataStructure = new ConcreteDataStructure();
        dataStructure.addData("tärkeä data ilman salasanaa");
        dataStructure.printData();
        dataStructure.removeData("tärkeä data ilman salasanaa");
        dataStructure.printData();

        System.out.println("Seuraavana decorator: " + "\n");

        // Luo pääsynvalvontaa toteuttava dekoraattori
        IDataStructure secureDataStructure = new AccessControlDecorator(dataStructure, "simo1234");



        // Käytä suojattua data-rakennetta oikealla salasanalla

        secureDataStructure.addData("tärkeä data salasanalla vahvennettuna");
        secureDataStructure.printData();
        secureDataStructure.removeData("tärkeä data salasanalla vahvennettuna");
        secureDataStructure.printData();

        // Yritä käyttää suojattua data-rakennetta ilman salasanaa,t ämä aiheuttaa RuntimeExceptionin ("Access denied")
        secureDataStructure.addData("tärkeä data salasanalla vahvennettuna, mutta väärä salasana, voi veikkonen sentään..");





    }
}
