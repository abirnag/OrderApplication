package com.demo.axon.OrderApplication;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;


@Aggregate
public class OrderAggregate {
	@AggregateIdentifier
	private String orderId; 
	
	
	
	public OrderAggregate() {
		super();
		// TODO Auto-generated constructor stub
	}


	@CommandHandler
	public OrderAggregate(CreateOrderCommand coc) {
		AggregateLifecycle.apply(new CreateOrderEvent(coc.getOrderId(),coc.getProductId(), coc.getQty(), coc.getNetPrice()));
	}
	
	
	@EventSourcingHandler
	public void on(CreateOrderEvent coe) {
		this.orderId= coe.getOrderId();
		
	}
	
}
