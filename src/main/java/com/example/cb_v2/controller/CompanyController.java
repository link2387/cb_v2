package com.example.cb_v2.controller;

import com.example.cb_v2.entity.AddressEntity;
import com.example.cb_v2.entity.CompanyEntity;
import com.example.cb_v2.service.AddressService;
import com.example.cb_v2.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity findAllCompany(@RequestBody CompanyEntity company){
       try {
           return ResponseEntity.ok(companyService.findCompany(company));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка 1");
        }
    }
}
