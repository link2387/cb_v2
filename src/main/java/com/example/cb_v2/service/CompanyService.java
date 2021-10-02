package com.example.cb_v2.service;

import com.example.cb_v2.entity.AddressEntity;
import com.example.cb_v2.entity.CompanyEntity;
import com.example.cb_v2.repository.AddressRepo;
import com.example.cb_v2.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepo companyRepo;
        public List<CompanyEntity> findCompany(CompanyEntity company) {
        List<CompanyEntity> newList = companyRepo.findAllByFullnameStartingWithAndInnStartingWithAndOgrnStartingWithAndAddressCityStartingWithAndAddressStreetStartingWithAndAddressBuildingStartingWith(company.getFullname(), company.getInn(),company.getOgrn(),company.getAddress().getCity(),company.getAddress().getStreet(),company.getAddress().getBuilding());
        // List<AddressEntity> newList = addressRepo.findAllByCity(addr);
        return newList;
    }
}
