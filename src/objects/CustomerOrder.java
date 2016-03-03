package objects;

import java.sql.Date;
import java.util.ArrayList;
import enums.OrderStatus;

public class CustomerOrder {
	private int orderID;
	private int customerAccountID;
	private ArrayList<CustomerOrderLine> customerOrderLines;
	private String deliveryAddress;
	private OrderStatus state;
	private Date dateMade;
	private Date dateDispatched;
	
	/**
	 * this is the constructor of the for the customer order
	 * @param orderID
	 * @param customerAccountID
	 * @param customerOrderLines
	 * @param deliveryAddress
	 * @param state
	 * @param dateMade
	 * @param dateDispatched
	 */
	public CustomerOrder(int orderID, int customerAccountID, ArrayList<CustomerOrderLine> customerOrderLines,
			String deliveryAddress, OrderStatus state, Date dateMade, Date dateDispatched) {
		this.orderID = orderID;
		this.customerAccountID = customerAccountID;
		this.customerOrderLines = customerOrderLines;
		this.deliveryAddress = deliveryAddress;
		this.state = state;
		this.dateMade = dateMade;
		this.dateDispatched = dateDispatched;
	}

	
	public int getOrderID() {
		return orderID;
	}

	public int getCustomerAccountID() {
		return customerAccountID;
	}

	public ArrayList<CustomerOrderLine> getCustomerOrderLines() {
		return customerOrderLines;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public OrderStatus getState() {
		return state;
	}

	public Date getDateMade() {
		return dateMade;
	}

	public Date getDateDispatched() {
		return dateDispatched;
	}
	
	
	
	
}
