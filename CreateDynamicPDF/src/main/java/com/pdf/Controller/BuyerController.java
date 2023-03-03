package com.pdf.Controller;

import com.pdf.Model.Buyer;
import com.pdf.Model.Seller;
import com.pdf.Services.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;


    @PostMapping("/registerBuyer")
    public ResponseEntity<Buyer> getBuyerHandler(@Valid @RequestBody Buyer buyer) {

        Buyer buyer1 = buyerService.registerBuyerHandler(buyer);
        return new ResponseEntity<>(buyer1, HttpStatus.CREATED);

    }


    @GetMapping("/getBuyer/{buyerId}")
    public ResponseEntity<Buyer> getBuyerHandler(@Valid @PathVariable("buyerId") Integer buyerId) {

        Buyer buyer = buyerService.getBuyerByIdHandler(buyerId);
        return new ResponseEntity<>(buyer, HttpStatus.CREATED);

    }

}
