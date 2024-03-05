package com.onlineshop.controls;

import com.onlineshop.controls.service.CustomerService;
import com.onlineshop.controls.service.ProductService;
import com.onlineshop.model.dto.CustomerDto;
import com.onlineshop.model.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MainPageController {

    CustomerService customerService;
    ProductService productService;

    public MainPageController(CustomerService customerService, ProductService productService) {
        this.customerService = customerService;
        this.productService = productService;
    }

    @GetMapping(value = {"/", "/index", "/home"})
    public ModelAndView index(
            @ModelAttribute("response") ModelMap model,
            @RequestParam(value = "name", required = false) String name) {
        Optional<CustomerDto> customerDaoOptional = customerService.getUserInfoByName(name);

        String responseString = customerDaoOptional.isEmpty()
                ? "User was not found"
                : customerDaoOptional.toString();
        model.addAttribute("responseString", responseString);
        return new ModelAndView("/pages/index", model);
    }

    @GetMapping("/customers")
    public ModelAndView getCustomersByFirstName(
            @ModelAttribute("response") ModelMap model,
            @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("customers", customerService.getCustomerByName(name));
        model.addAttribute("customerType", CustomerDto.class);
        return new ModelAndView("/pages/customers", model);
    }

    @GetMapping("/products")
    public ModelAndView getProductsList(ModelMap modelMap){
        return new ModelAndView(
                "pages/products",
                modelMap
                        .addAttribute("products", productService.getAllProducts())
                        .addAttribute("productType", ProductDto.builder().build()));
    }

}
