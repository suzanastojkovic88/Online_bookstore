package online_bookstore.support;

public class DeliveryManager {

	public double deliveryService(double total) {
		if (total < 15) {
			total = total + 2;
			System.out.println(
					"Adding 2 euros for delivery service. The total price of your order is " + total + " euros.");
		} else {
			total = total + 0;
			System.out.println("The total price of your order is " + total + " euros. Delivery service is free.");
		}
		return total;
	}

}
