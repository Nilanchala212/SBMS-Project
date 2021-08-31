package com.nilatech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nilatech.domain.Product;

@Controller
public class ProductController {

	@GetMapping("/productdata")
	public ModelAndView getProductData() {

		ModelAndView mav = new ModelAndView();
		Product pObj = new Product();
		pObj.setProductId(12);
		pObj.setProductName("KeyBoard");
		pObj.setProductPrice(250);
		mav.addObject("product", pObj);
		mav.setViewName("product-data");
		return mav;

	}

}
