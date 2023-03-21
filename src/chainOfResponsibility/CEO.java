package chainOfResponsibility;

public class CEO implements Approver{
    @Override
    public void processRequest(RaiseRequest request) {
        System.out.println("Toimitusjohtaja hyväksyy palkankorotuspyynnön " + request.increase() + " €");
    }
}
