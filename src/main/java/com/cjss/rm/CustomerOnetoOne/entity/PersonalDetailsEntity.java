package com.cjss.rm.CustomerOnetoOne.entity;

import com.cjss.rm.CustomerOnetoOne.model.PersonalDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonalDetailsEntity {
    public PersonalDetailsEntity(Integer id, String phoneNum, String email) {
        this.id = id;
        this.phoneNum = phoneNum;
        Email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String phoneNum;
    private  String Email;

    @OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL,mappedBy = "personalDetailsEntity")
    private  CustomerEntity customerEntity;



}
