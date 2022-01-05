package com.cjss.rm.CustomerOnetoOne.service;

import com.cjss.rm.CustomerOnetoOne.entity.CustomerEntity;
import com.cjss.rm.CustomerOnetoOne.entity.PersonalDetailsEntity;
import com.cjss.rm.CustomerOnetoOne.model.CustomerModel;
import com.cjss.rm.CustomerOnetoOne.model.PersonalDetails;
import com.cjss.rm.CustomerOnetoOne.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repo;

    public void savaCustomer(CustomerModel model) {
        System.out.println(model.getPersonalDetails().getEmail());
        repo.save(getEntity(model));
    }
public List<CustomerModel> getAll(){

    return repo.findAll().stream().map(entity -> getModel(entity)).collect(Collectors.toList());
}





    private CustomerEntity getEntity(CustomerModel model) {
PersonalDetailsEntity personalDetailsEntity = new PersonalDetailsEntity(model.getPersonalDetails().getId(),
        model.getPersonalDetails().getPhoneNum(),
        model.getPersonalDetails().getEmail())        ;
        return new CustomerEntity(model.getId(), model.getName(),personalDetailsEntity);
    }


    private CustomerModel getModel(CustomerEntity entity) {
        PersonalDetails personalDetails = new PersonalDetails(
              entity.getPersonalDetailsEntity().getId(),
              entity.getPersonalDetailsEntity().getPhoneNum(),
              entity.getPersonalDetailsEntity().getEmail()
        );
        CustomerModel customerModel = new CustomerModel(entity.getId(), entity.getName(),personalDetails);
        return customerModel;
    }

}


