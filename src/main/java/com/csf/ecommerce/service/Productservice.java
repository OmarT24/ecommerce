package com.csf.ecommerce.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import com.csf.ecommerce.model.Product;
import com.csf.ecommerce.repository.Productrepository;



//defining the business logic  
@Service 

public class Productservice {

	@Autowired  
	Productrepository PR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Product> getAllProducts()   
	{  
		List<Product> products = new ArrayList<Product>();  
		PR.findAll().forEach(p -> products.add(p));  
		return products;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Product getproductById(int id)   
	{  
		try {
				return PR.findById(id).get();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Product p)   
	{  
		PR.save(p);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		PR.deleteById(id);  
	} 
}