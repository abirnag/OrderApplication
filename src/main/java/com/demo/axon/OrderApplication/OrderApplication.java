package com.demo.axon.OrderApplication;

import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}
@Configuration
class AxonConfig {

    @Bean
    EventSourcingRepository<OrderAggregate> accountAggregateEventSourcingRepository(EventStore eventStore){
        EventSourcingRepository<OrderAggregate> repository = EventSourcingRepository.builder(OrderAggregate.class).eventStore(eventStore).build();
        return repository;
    }
}