package com.sales.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.dto.CustomerDto;
import com.sales.entity.Customers;
import com.sales.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public List<Customers> getAllCustomer() {
		List<Customers> customer=new ArrayList();
		try {
		customer=customerRepository.viewAll();
		}catch(Exception e) {
			System.out.println("Exception:MethodName:getAllCustomer"+e);
		}
		return customer;
	}


	@Override
	public CustomerDto getoneCustomer(Long productId,String firstName) {
		Customers customer=new Customers();
		CustomerDto custDto= new CustomerDto();
		try {
		customer=customerRepository.viewone(productId,firstName);
		
		BeanUtils.copyProperties(customer, custDto);
		}catch(Exception e) {
			System.out.println("Exception:MethodName:getoneCustomer"+e);
		}
		return custDto;
	}


	@Override
	public CustomerDto createCustomer(CustomerDto custDto) {
       Customers customer= new Customers();
       CustomerDto custmDto= new CustomerDto();
       try {
       BeanUtils.copyProperties(custDto, customer);
       customer=customerRepository.save(customer);
       BeanUtils.copyProperties(customer,custmDto);
       }catch(Exception e) {
    	   System.out.println("Exception:MethodName:createCustomer"+e);
       }
        return custmDto;
	}


	@Override
	public CustomerDto getonedelete(Long productId) {
		Customers customer= new Customers();
		CustomerDto CustomerDto = new CustomerDto();
		try {
		customer=customerRepository.getOne(productId);
		customerRepository.delete(customer);
		}catch(Exception e) {
			System.out.println("Exception:MethodName:getonedelete"+e);
		}
		return CustomerDto;
	}


	@Override
	public CustomerDto getOneId(Long productId) {
		Customers customer=new Customers();
		CustomerDto custDto=new CustomerDto();
		customer=customerRepository.findOne(productId);
		BeanUtils.copyProperties(customer,custDto);
	    return custDto;
	}


	
	}
	

