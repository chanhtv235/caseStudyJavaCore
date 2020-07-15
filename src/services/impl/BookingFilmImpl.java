package services.impl;

import Models.Customer;
import services.BookingFilm;
import services.CustomerService;

import java.util.LinkedList;
import java.util.Queue;

public class BookingFilmImpl implements BookingFilm {
   static Queue<Customer> customerQueues =new LinkedList<>();
    CustomerService customerService= new CustomerServiceImp();
    @Override
    public void addBookingFilm() {
        Customer customer = customerService.addNewCustomer();
        customerQueues.add(customer);
    }

    @Override
    public void showListBookingFilm() {
        while (true) {
            Customer customer = customerQueues.poll();
            if (customer == null) {
                break;
            }
            System.out.println(customer.getCustomerName());
        }
    }
}
