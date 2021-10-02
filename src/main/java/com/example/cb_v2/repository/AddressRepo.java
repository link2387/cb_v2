package com.example.cb_v2.repository;

import com.example.cb_v2.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
//SELECT * FROM cbv2.address WHERE 'eкате' LIKE cbv2.address.city || '%';
public interface AddressRepo extends CrudRepository <AddressEntity,Long>{
    List<AddressEntity> findAllByCity(String addr);
  //  List<AddressEntity> findByCityStartingWith

    List<AddressEntity> findAllByCityStartingWithAndStreetStartingWithAndBuildingStartingWith(String City,String Street,String Building);

  //  @Override
 //   Iterable<AddressEntity> findAll();
    // List<AddressEntity> findByNameEndingWith(String addr);
   // List<AddressEntity> findByNameContaining(String addr);
}
