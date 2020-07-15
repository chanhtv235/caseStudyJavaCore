package Models;

public class House extends Services {
    private String roomStandard;
    private String convenient;
    private int floorNumber;

    public House() {
    }

    public House(String iDService, String nameService, double area, double rentCost, int personLimit, String rentType, String roomStandard, String convenient, int floorNumber) {
        super(iDService, nameService, area, rentCost, personLimit, rentType);
        this.roomStandard=roomStandard;
        this.convenient=convenient;
        this.floorNumber=floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String ShowInfo() {
        return super.ShowInfo()+
                "\nRoom standard: " + getRoomStandard() +
                "\nConvenient: " + getConvenient() +
                "\nFloor Number: " + getFloorNumber();

    }
}
