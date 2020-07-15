package services.impl;

import Commons.FuncWriteFileCSV;
import Models.House;
import Models.Room;
import Models.Villa;
import services.ShowInfoService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ShowInForServiceImpl implements ShowInfoService {
    @Override
    public void showInfoVilla() {
        ArrayList<Villa> listvilla = FuncWriteFileCSV.getVillaListFromCSVFile();
        for (Villa villa : listvilla) {
            System.out.println("----------------------");
            System.out.println(villa.ShowInfo());
            System.out.println("----------------------");
        }
    }

    @Override
    public void showInfoHouse() {
        ArrayList<House> listHouse = FuncWriteFileCSV.getHouseListFromCSVFile();
        for (House house : listHouse) {
            System.out.println("----------------------");
            System.out.println(house.ShowInfo());
            System.out.println("----------------------");
        }
    }

    @Override
    public void showInfoRoom() {
        ArrayList<Room> listRoom = FuncWriteFileCSV.getRoomListFromCSVFile();
        for (Room room : listRoom) {
            System.out.println("----------------------");
            System.out.println(room.ShowInfo());
            System.out.println("----------------------");
        }
    }

    @Override
    public void showAllNameVillaNotDuplicate() {
        String FILE_ROOM ="src/Data/Villa.csv";
        TreeSet<String> villaNameList =FuncWriteFileCSV.getServiceListFromCSVFile(FILE_ROOM);
        int i=1;
        System.out.println("Danh sách Villa không trùng nhau:");
        for (String villaName: villaNameList){
            System.out.println(i+"."+villaName);
            i++;
        }
        System.out.println("-------------------------");
        Scanner input =new Scanner(System.in);
        input.nextLine();
    }

    @Override
    public void showAllNameHouseNotDuplicate() {
        String FILE_HOUSE ="src/Data/House.csv";
        TreeSet<String> houseNameList =FuncWriteFileCSV.getServiceListFromCSVFile(FILE_HOUSE);
        int i=1;
        System.out.println("Danh sách House không trùng nhau:");
        for (String houseName: houseNameList){
            System.out.println(i+"."+houseName);
            i++;
        }
        System.out.println("-------------------------");
        Scanner input =new Scanner(System.in);
        input.nextLine();
    }

    @Override
    public void showAllNameRoomNotDuplicate() {
        String FILE_ROOM ="src/Data/Room.csv";
        TreeSet<String> roomNameList =FuncWriteFileCSV.getServiceListFromCSVFile(FILE_ROOM);
        int i=1;
        System.out.println("Danh sách Room không trùng nhau:");
        for (String roomName: roomNameList){
            System.out.println(i+"."+roomName);
            i++;
        }
        System.out.println("-------------------------");
        Scanner input =new Scanner(System.in);
        input.nextLine();
    }
}
