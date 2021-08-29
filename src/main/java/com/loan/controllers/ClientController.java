package com.loan.controllers;

import com.loan.models.Credit;
import com.loan.models.ResponseSystem;
import com.loan.utils.formulas.DebtCapacity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ClientController {

    @PostMapping(value="/sendCredit")
    public ResponseEntity sendCredit (@RequestBody Credit credit){
        boolean approved = DebtCapacity.createData(credit);
        return new ResponseEntity<>(approved, HttpStatus.OK);
    }

}
