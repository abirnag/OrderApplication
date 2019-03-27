package com.demo.axon.OrderApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/orders")
public class OrderRestController {
	@Autowired
	private CommandGateway cmdg; 
	
	@Autowired
	private QueryGateway qry; 
	
	@PostMapping()
	public void createOrder(@RequestBody CreateOrderCommand req) {
		String orderId= UUID.randomUUID().toString(); 
		req.setOrderId(orderId);
		cmdg.send(req); 
	}

	
	@GetMapping
	public List<OrderEntity> getAllOrders()
	{
		return qry.query(new FindAllOrderedProductsQuery(),ResponseTypes.multipleInstancesOf(OrderEntity.class)).join();
	}
}
