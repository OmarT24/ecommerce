package com.csf.ecommerce.repository;


import org.springframework.data.repository.CrudRepository;

import com.csf.ecommerce.model.Product;
  
//repository that extends CrudRepository  
public interface Productrepository extends CrudRepository<Product, Integer>  
{  
}  

