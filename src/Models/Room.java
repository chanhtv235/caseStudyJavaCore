package Models;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }

    public Room(String iDService, String nameService, double area, double rentCost, int personLimit, String rentType,String freeServices) {
        super(iDService, nameService, area, rentCost, personLimit, rentType);
        this.freeServices=freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String  ShowInfo() {
        return super.ShowInfo()+"\nFree Service:"+freeServices;
    }
}
