package com.ensat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ensat.entities.Hotel;
import com.ensat.entities.Product;
import com.ensat.services.HotelService;
import com.ensat.services.ProductService;

public class HotelController {

	
	  private HotelService hotelService;

	    @Autowired
	    public void setProductService(HotelService hotelService) {
	        this.hotelService = hotelService;
	    }

	    /**
	     * List all products.
	     *
	     * @param model
	     * @return
	     */
	    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
	    public String list(Model model) {
	        model.addAttribute("hotel", hotelService.listAllProducts());
	        System.out.println("Returning hoteles:");
	        return "hotel";
	    }

	    /**
	     * View a specific product by its id.
	     *
	     * @param id
	     * @param model
	     * @return
	     */
	    @RequestMapping("hotel/{id}")
	    public String showProduct(@PathVariable Integer id, Model model) {
	        model.addAttribute("hotel", hotelService.getProductById(id));
	        return "hotelVer";
	    }

	    // Afficher le formulaire de modification du Product
	    @RequestMapping("hotel/edit/{id}")
	    public String edit(@PathVariable Integer id, Model model) {
	        model.addAttribute("hotel", hotelService.getProductById(id));
	        return "hotelFrmulario";
	    }

	    /**
	     * New product.
	     *
	     * @param model
	     * @return
	     */
	    @RequestMapping("hotel/new")
	    public String newHotel(Model model) {
	        model.addAttribute("hotel", new Hotel());
	        return "hotelFromulario";
	    }

	    /**
	     * Save product to database.
	     *
	     * @param product
	     * @return
	     */
	    @RequestMapping(value = "hotel", method = RequestMethod.POST)
	    public String saveProduct(Hotel hotel) {
	        hotelService.saveProduct(hotel);
	        return "redirect:/hotel/" + hotel.getId_hotel();
	    }

	    /**
	     * Delete product by its id.
	     *
	     * @param id
	     * @return
	     */
	    @RequestMapping("hotel/delete/{id}")
	    public String delete(@PathVariable Integer id) {
	    	hotelService.deleteProduct(id);
	        return "redirect:/hotel";
	    }
}
