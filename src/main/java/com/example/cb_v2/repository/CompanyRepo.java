package com.example.cb_v2.repository;

import com.example.cb_v2.entity.AddressEntity;
import com.example.cb_v2.entity.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyRepo extends CrudRepository<CompanyEntity , Long> {
    List<CompanyEntity> findAllByFullnameStartingWithAndInnStartingWithAndOgrnStartingWithAndAddressCityStartingWithAndAddressStreetStartingWithAndAddressBuildingStartingWith(String Fullname, String Inn, String Ogrn ,String City,String Street,String Building);

}
