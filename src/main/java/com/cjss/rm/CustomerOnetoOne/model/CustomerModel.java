package com.cjss.rm.CustomerOnetoOne.model;

import com.cjss.rm.CustomerOnetoOne.entity.PersonalDetailsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {
    private  Integer id;
    private String name;


    private PersonalDetails personalDetails;


}
