package casestudy_furamaresort.models.facility_inheritance;

public abstract class Facility {    // cơ sở vật chất
    protected String serviceName, rentalType;
    protected double area, cost;
    protected int amount;

    public Facility() {
    }

    public Facility(String serviceName, String rentalType, double area, double cost, int amount) {
        this.serviceName = serviceName;
        this.rentalType = rentalType;
        this.area = area;
        this.cost = cost;
        this.amount = amount;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", rentalType='" + rentalType + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", amount=" + amount +
                '}';
    }
}
