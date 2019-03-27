package com.demo.axon.OrderApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderQueryRepository extends JpaRepository<OrderEntity,String> {

}
