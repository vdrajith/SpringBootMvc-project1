package com.sales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.sales.entity.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long>{

	          @Query("select c from Customers c")
	         List<Customers> viewAll();
	
	          @Query("select c from Customers c where c.productId=?1 and firstName=?2")
	          Customers viewone(Long productId,String firstName);
	          
	          

}
	

