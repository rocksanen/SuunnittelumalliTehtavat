package singleton;

public class User {
    private static User instance;
    private String userName;
    private String password;
    private int userID;

    public static User getInstance() {

        if(instance == null) {

            instance = new User();
        }
        return instance;
    }

    public void signUp(String name,String password) {

        this.userName = name;
        this.password = password;
        this.userID = (int) Math.round(Math.random() * 500);

    }

    public void login(String name, String password) {

        if(name.equals(this.userName) && password.equals(this.password)) {

            System.out.println("Tervetuloa takaisin " + this.userName);

        }else{

            System.out.println("Ei mitään asiaa tänne!");
        }
    }

    public String toString() {

        return userName + ", " + password + ", " + userID;
    }
}
