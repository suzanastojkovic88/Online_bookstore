package online_bookstore.app;

import static online_bookstore.models.Delivery.delivery;
import static java.time.LocalDate.now;
import static java.util.Arrays.asList;

import java.time.LocalDate;
import java.util.List;

import online_bookstore.items.Item;
import online_bookstore.items.Magazine;
import online_bookstore.items.Notebook;
import online_bookstore.items.Novel;
import online_bookstore.models.Customer;
import online_bookstore.models.Delivery;
import online_bookstore.models.Order;
import online_bookstore.support.CheckoutHandler;

public class App {

	public static void main(String[] args){

        CheckoutHandler checkout = new CheckoutHandler();

        Customer customer1 = new Customer("Ivan Ivić", "Dunavska 15, Novi Sad");

        List<Item> list1 = asList(new Novel(), new Novel(), new Magazine(), new Notebook());
        Order order1 = new Order(list1);
        order1.setCustomer(customer1);


        double total1 = checkout.calculateTotal(order1);
        System.out.println(total1);

        LocalDate start = now().plusDays(1);
        LocalDate end = now().plusDays(7);
        checkout.setDeliveryTime(start, end);

        Delivery delivery = new Delivery(now().plusDays(1), now().plusDays(7));
        checkout.setDelivery(delivery);

        delivery = delivery().startInDays(1).endInDays(7);
        checkout.setDelivery(delivery);


    }
}
