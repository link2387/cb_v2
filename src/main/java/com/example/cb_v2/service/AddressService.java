package com.example.cb_v2.service;

import com.example.cb_v2.entity.AddressEntity;
import com.example.cb_v2.model.Todo;
import com.example.cb_v2.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;
//    @Autowired
  //  private CompanyRepo companyRepo;
    public List<AddressEntity> findAdress(AddressEntity addr) {
        List<AddressEntity> newList = addressRepo.findAllByCityStartingWithAndStreetStartingWithAndBuildingStartingWith(addr.getCity(),addr.getStreet(),addr.getBuilding());
       // List<AddressEntity> newList = addressRepo.findAllByCity(addr);
        return newList;
    }
    public AddressEntity createAddr(AddressEntity addr) {
   //     List<AddressEntity> start = addressRepo.findByCityStartingWith(addr.getCity());
       // List<AddressEntity> start = addressRepo.findAllByCityStartingWith(addr.getCity());
      //  List<AddressEntity> end = addressRepo.findByStartingWith(addr.getCity());
        return addressRepo.save(addr);
    }

}
