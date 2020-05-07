package online_bookstore.models;

import java.time.LocalDate;

public class Delivery {

	private LocalDate start;
	private LocalDate end;

	public Delivery(LocalDate start, LocalDate end) {

		this.start = start;
		this.end = end;
	}

	public Delivery() {

		LocalDate now = LocalDate.now();
		this.start = now;
		this.end = now;

	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

	public static Delivery delivery() {
		return new Delivery();
	}

	public Delivery startInDays(int days) {
		this.start = getStart().plusDays(days);
		return this;
	}

	public Delivery endInDays(int days) {
		this.end = getEnd().plusDays(days);
		return this;
	}
}
