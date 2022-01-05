package com.cjss.rm.CustomerOnetoOne.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDetails {
    private  Integer id;
    private  String phoneNum;
    private  String Email;

}