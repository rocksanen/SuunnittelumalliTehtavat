package chainOfResponsibility;

public class Employee {

    private final String name;
    private final double salary;
    private final Approver approver; // Työntekijän esimies, joka käsittelee palkankorotuspyyntöjä

    public Employee(String name, double salary, Approver approver) {
        this.name = name;
        this.salary = salary;
        this.approver = approver;
    }

    public double getSalary() {
        return salary;
    }

    // Metodi, jolla työntekijä lähettää palkankorotuspyynnön esimiehelleen
    public void sendRequest(double increase) {
        approver.processRequest(new RaiseRequest(this, increase));
    }
}
