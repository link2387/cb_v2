package com.example.cb_v2.model;

import com.example.cb_v2.entity.AddressEntity;

import java.util.List;

public class CompanyAddr {
    private Long Id;
    private String city;
    private String street;
    private String fullname;
    private String inn;
    private String ogrn;
    private List<AddressEntity> address;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    private String building;

    public static CompanyAddr toModel(AddressEntity entity){
        CompanyAddr model = new CompanyAddr();
        model.setId(entity.getId());
        model.setCity(entity.getCity());
        model.setBuilding(entity.getBuilding());
       // model.setAddress(entity.getAddress().stream().map(Todo::toModel).collect(Collectors.toList()));

    //    public List<AddressEntity> setAddress() {
    //        return address;
   //     }

    //    public void setAddress(List<AddressEntity> address) {
    //        this.address = address;
   //     }
        return model;
    }
}
