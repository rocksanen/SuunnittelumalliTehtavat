package singleton;

public class Main {

    public static void main(String[] args) {

        User user = User.getInstance();
        user.signUp("kalle nallersson", "yykaakoonee");

        System.out.println(user);

        user.login("kalle nallersson","yykaakoonee");
        user.login("ville vääränimi","kanada");


    }
}
