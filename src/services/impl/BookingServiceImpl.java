package services.impl;

import Commons.FuncWriteFileCSV;
import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;
import services.BookingService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BookingServiceImpl implements BookingService {

    @Override
    public void addNewBookingResort() {
        Scanner input =new Scanner(System.in);
        ArrayList<Customer> bookingList =new ArrayList<>();
        ArrayList<Customer> customers= FuncWriteFileCSV.getCustomerListFromCSVFile();
        System.out.println("Chọn tên khách hàng cần booking");
        for (int i = 0; i<customers.size();i++){
            System.out.println("\n"+i+1+"."+customers.get(i).getCustomerName());

        }
        System.out.println("-----------------------------------------------");
        int chooseCustomer= input.nextInt();
        Customer customer = customers.get(chooseCustomer-1);

        boolean check=true;
        while (check){
            System.out.println("Chọn loại hình dịch vụ\n" +
                    "1. Villa\n" +
                    "2. House\n" +
                    "3. Room");
            Scanner input1 =new Scanner(System.in);
            int choose =input1.nextInt();
            switch (choose){
                case 1:
                    ArrayList<Villa> villaList = FuncWriteFileCSV.getVillaListFromCSVFile();
                    String str1="";
                    for (int i=0; i<villaList.size();i++){
                        str1 += (i+1)+"."+ villaList.get(i).getNameService()+"\n";
                    }
                    System.out.println("Chọn dịch vụ villa\n" +str1);
                    int choose1 =input1.nextInt();
                    customer.setCustomerUseServieceType(villaList.get(choose1-1));
                    check=false;
                    break;
                case 2:
                    ArrayList<House> houseList = FuncWriteFileCSV.getHouseListFromCSVFile();
                    String str2="";
                    for (int i=0; i<houseList.size();i++){
                        str2 += (i+1)+"."+ houseList.get(i).getNameService()+"\n";
                    }
                    System.out.println("Chọn dịch vụ House\n" +str2);
                    int choose2 =input1.nextInt();
                    customer.setCustomerUseServieceType(houseList.get(choose2-1));
                    check=false;
                    break;
                case 3:
                    ArrayList<Room> rooms = FuncWriteFileCSV.getRoomListFromCSVFile();
                    String str3="";
                    for (int i=0; i<rooms.size();i++){
                        str3 += (i+1)+"."+ rooms.get(i).getNameService()+"\n";
                    }
                    System.out.println("Chọn dịch vụ Room\n" +str3);
                    int choose3=input1.nextInt();
                    customer.setCustomerUseServieceType(rooms.get(choose3-1));
                    check=false;
                    break;
                default:
                    System.out.println("Bạn chọn dịch vụ chưa đúng. Vui lòng chọn lại");
                    input1.nextLine();
            }
        }
        bookingList = FuncWriteFileCSV.getBookingCustomerListFromCSVFile();
        bookingList.add(customer);
        FuncWriteFileCSV.wirteBookingToCSVFile(bookingList);
        input.nextLine();
    }
}
