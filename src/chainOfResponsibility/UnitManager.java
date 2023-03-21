package chainOfResponsibility;

public class UnitManager implements Approver{

    private Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
    @Override
    public void processRequest(RaiseRequest request) {

        if (request.increase() <= 0.05 * request.employee().getSalary()) {
            System.out.println("Yksikön päällikkö hyväksyy palkankorotuspyynnön " + request.increase() + " €");
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }

    }
}
