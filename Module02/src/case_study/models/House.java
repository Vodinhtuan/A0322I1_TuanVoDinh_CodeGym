package case_study.models;

public class House extends Facility{
    public House() {
    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
    }

}
