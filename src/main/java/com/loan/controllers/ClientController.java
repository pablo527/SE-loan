package com.loan.controllers;

import com.loan.models.Credit;
import com.loan.models.ResponseSystem;
import com.loan.utils.Constantes;
import com.loan.utils.formulas.DebtCapacity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ClientController {

    @PostMapping(value="/sendCredit")
    public ResponseSystem sendCredit (@RequestBody Credit credit){
        boolean approved = DebtCapacity.createData(credit);
        ResponseSystem response = new ResponseSystem();
        System.out.println(Constantes.MSG);
        response.setMsg(Constantes.MSG);
        response.setApproved(approved);
        return response;
    }

}
