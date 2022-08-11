package casestudy_furamaresort.models;

public class Contract extends Booking{
    private int numberContract;
    private double deposit,totalPayment;

    public Contract() {
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" + super.toString() +
                " numberContract=" + numberContract +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
