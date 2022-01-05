package com.cjss.rm.CustomerOnetoOne.restController;

import com.cjss.rm.CustomerOnetoOne.model.CustomerModel;
import com.cjss.rm.CustomerOnetoOne.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestCustomer {
@Autowired
private CustomerService service;
    @PostMapping("/customer-save")
    public  void save(@RequestBody CustomerModel model){
        System.out.println(model.getPersonalDetails().getEmail());
service.savaCustomer(model);
    }
    @GetMapping("/customer-get-all")
    public List<CustomerModel> getCustomerAll(){
        return  service.getAll();
    }

}
