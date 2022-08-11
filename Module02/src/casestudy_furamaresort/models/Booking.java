package casestudy_furamaresort.models;

public class Booking {
    protected String idBooking, startDay, endDate, idCustomer, service, typeService;

    public Booking() {
    }

    public Booking(String idBooking, String startDay, String endDate, String idCustomer, String service, String typeService) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.service = service;
        this.typeService = typeService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" + super.toString()+
                " idBooking='" + idBooking + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", service='" + service + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
