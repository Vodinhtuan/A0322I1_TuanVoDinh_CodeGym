package casestudy_furamaresort.models.facility_inheritance;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, String rentalType, double area, double cost, int amount, String freeService) {
        super(serviceName, rentalType, area, cost, amount);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                " freeService='" + freeService + '\'' +
                '}';
    }
}
