package chainOfResponsibility;

public class Supervisor implements Approver{

    private Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
    @Override
    public void processRequest(RaiseRequest request) {

        if (request.increase() <= 0.02 * request.employee().getSalary()) {
            System.out.println("Lähiesimies  hyväksyy palkankorotuspyynnön " + request.increase() + " €");
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
