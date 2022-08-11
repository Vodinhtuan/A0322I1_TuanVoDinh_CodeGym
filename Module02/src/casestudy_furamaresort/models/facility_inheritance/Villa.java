package casestudy_furamaresort.models.facility_inheritance;

public class Villa extends Facility {
    /* -	Riêng loại Villa sẽ có thêm thông tin:
    Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng. */
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceName, String rentalType, double area, double cost, int amount, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceName, rentalType, area, cost, amount);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +     super.toString()+
                " roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
