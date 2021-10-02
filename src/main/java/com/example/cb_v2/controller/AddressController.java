package com.example.cb_v2.controller;

import com.example.cb_v2.entity.AddressEntity;
import com.example.cb_v2.entity.ToDoEntity;
import com.example.cb_v2.repository.ToDoRepo;
import com.example.cb_v2.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addr")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PutMapping
    public ResponseEntity createToDo(@RequestBody AddressEntity addr){
        System.out.println("Info createToDo");
        try {
         //   return ResponseEntity.ok(addr.getCity()+addr.getStreet() + addr.getBuilding());
           return ResponseEntity.ok(addressService.createAddr(addr));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка 1");
        }
    }
    @GetMapping
    public ResponseEntity findAlladdr(@RequestParam Long id,@RequestParam Long day){
        System.out.println("Info findAlladdr");
        try {
            //int day = 90;
            float res=id;

            //   return ResponseEntity.ok(addr.getCity()+addr.getStreet() + addr.getBuilding());
            for(int i = 0; i < day ; i++){
                res += res*0.01;
            }
            //return ResponseEntity.ok(addressService.findAdress(addr));
            return ResponseEntity.ok("Result " + res);
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка 1");
        }
    }
    @PostMapping
    public ResponseEntity findAll(@RequestBody AddressEntity addr){
        //System.out.println("Info find "+city.toString());
        try {
            //   return ResponseEntity.ok(addr.getCity()+addr.getStreet() + addr.getBuilding());
            //return ResponseEntity.ok(addressService.findAdress(addr));
            return ResponseEntity.ok(addressService.findAdress(addr));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка 1");
        }
    }



}
