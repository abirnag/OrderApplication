package com.demo.axon.OrderApplication;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CreateOrderCommand {

	@TargetAggregateIdentifier
	private String orderId;
	private String productId;
	private int qty;
	private double netPrice;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public CreateOrderCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateOrderCommand(String orderId, String productId, int qty, double netPrice) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.qty = qty;
		this.netPrice = netPrice;
	}
	
	
	
}
