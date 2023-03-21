package chainOfResponsibility;

public class Main {

    public static void main(String[] args) {

        // Luodaan ketju hyväksyjiä
        CEO ceo = new CEO();
        UnitManager unitManager = new UnitManager();
        unitManager.setNextApprover(ceo);
        Supervisor supervisor = new Supervisor();
        supervisor.setNextApprover(unitManager);

        // Luodaan työntekijöitä ja asetetaan heidän esimiehensä
        Employee employee1 = new Employee("Pertti", 5000, supervisor);
        Employee employee2 = new Employee("Keijo", 8000, supervisor);

        // Työntekijät lähettävät palkankorotuspyynnön
        employee1.sendRequest(100); // Hyväksytään lähiesimiehen toimesta (2 %)
        employee2.sendRequest(400); // Hyväksytään yksikön päällikön toimesta (5 %)
        employee1.sendRequest(600); // Hyväksytään toimitusjohtajan toimesta (12 %)
    }
}
