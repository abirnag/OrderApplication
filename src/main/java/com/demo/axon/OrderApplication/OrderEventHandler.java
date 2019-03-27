package com.demo.axon.OrderApplication;

import java.util.ArrayList;
import java.util.List;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderEventHandler {

	@Autowired
	private OrderQueryRepository ordrepo;
	
	@EventHandler
	public void on(CreateOrderEvent coe) {
		ordrepo.save(new OrderEntity(coe.getOrderId(), coe.getProductId(),coe.getQty(), coe.getNetPrice()));
	}
	@QueryHandler
	public List<OrderEntity> handle(FindAllOrderedProductsQuery query) {
	    return ordrepo.findAll();
	}
}

class FindAllOrderedProductsQuery { }
