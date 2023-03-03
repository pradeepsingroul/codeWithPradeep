package com.pdf.Controller;

import com.pdf.Model.Seller;

import com.pdf.Services.CreatePdfServiceImpl;

import javax.validation.Valid;

import com.pdf.Services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class CreatePdfController {

	@Autowired
    private CreatePdfServiceImpl createPdfFileService;
    
    @Autowired
    private SellerService sellerService;
    

    @PostMapping("/createPdf")
    public ResponseEntity<Seller> createPdf(@Valid @RequestBody Seller seller) {

        createPdfFileService.createPdf(seller);
        Seller seller1 = sellerService.registerSellerAndBuyerWithItem(seller);
        return new ResponseEntity<>(seller1, HttpStatus.CREATED);

    }

   
    

}
