package uml.hibernate;

// Generated 2012-6-16 9:24:29 by Hibernate Tools 3.4.0.CR1

/**
 * BookTable generated by hbm2java
 */
public class BookTable implements java.io.Serializable {

	private Integer id;
	private Dinningtable dinningtable;
	private BookingBill bookingBill;

	public BookTable() {
	}

	public BookTable(Dinningtable dinningtable, BookingBill bookingBill) {
		this.dinningtable = dinningtable;
		this.bookingBill = bookingBill;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dinningtable getDinningtable() {
		return this.dinningtable;
	}

	public void setDinningtable(Dinningtable dinningtable) {
		this.dinningtable = dinningtable;
	}

	public BookingBill getBookingBill() {
		return this.bookingBill;
	}

	public void setBookingBill(BookingBill bookingBill) {
		this.bookingBill = bookingBill;
	}

}