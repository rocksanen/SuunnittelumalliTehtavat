package chainOfResponsibility;

public interface Approver {

    void processRequest(RaiseRequest request);
}
