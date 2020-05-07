package online_bookstore.support;

import static java.lang.String.format;

import java.time.LocalDate;
import java.util.List;

import online_bookstore.items.Item;
import online_bookstore.models.Delivery;
import online_bookstore.models.Order;

public class CheckoutHandler {

	private LocalDate deliveryStart;
	private LocalDate deliveryEnd;

	private DeliveryManager deliveryManager = new DeliveryManager();

	public double calculateTotal(Order order) {

		double total = sumItemPrices(order.getItems());

		total = deliveryManager.deliveryService(total);

		return total;
	}

	private double sumItemPrices(List<Item> items) {
		double sum = 0;
		for (Item item : items) {
			sum = sum + item.price();
		}
		return sum;
	}

	public void setDeliveryTime(LocalDate start, LocalDate end) {
		this.deliveryStart = start;
		this.deliveryEnd = end;

		System.out.println(format("Your order will be delivered between %s and %s.", deliveryStart, deliveryEnd));
	}

	public void setDelivery(Delivery delivery) {

	}
}