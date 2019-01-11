package com.sales.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sales.dto.CustomerDto;
import com.sales.entity.Customers;

@Component
public interface CustomerService {
	
	public List<Customers> getAllCustomer();
	public CustomerDto getoneCustomer(Long productId,String firstName);
	public CustomerDto  createCustomer(CustomerDto custDto);
    public CustomerDto getonedelete(Long productId);
    public CustomerDto getOneId(Long productId);

    }

