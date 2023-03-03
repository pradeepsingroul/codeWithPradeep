package com.pdf.Controller;

import com.pdf.Model.Seller;
import com.pdf.Services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class SellerController {



    @Autowired
    private SellerService sellerService;


    @PostMapping("/registerSeller")
    public ResponseEntity<Seller> createPdf(@Valid @RequestBody Seller seller) {

        Seller seller1 = sellerService.registerSellerAndBuyerWithItem(seller);
        return new ResponseEntity<>(seller1, HttpStatus.CREATED);

    }

    @GetMapping("/getSeller/{sellerId}")
    public ResponseEntity<Seller> getSellerHandler(@Valid @PathVariable("sellerId") Integer sellerId) {

        Seller seller1 = sellerService.getSellerByThereId(sellerId);
        return new ResponseEntity<>(seller1, HttpStatus.CREATED);

    }


}
