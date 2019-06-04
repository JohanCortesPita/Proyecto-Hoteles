package com.ensat.services;

import com.ensat.entities.Hotel;

public interface HotelService {
	
		Iterable<Hotel> listAllProducts();

		Hotel getProductById(Integer id);

		Hotel saveProduct(Hotel hotel);

	    void deleteProduct(Integer id);

}
