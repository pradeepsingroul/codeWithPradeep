package com.pdf.Services;

import com.pdf.Exceptions.SellerExceptions;
import com.pdf.Model.Seller;

public interface SellerService {

    Seller registerSellerAndBuyerWithItem(Seller seller) throws SellerExceptions;

    Seller getSellerByThereId(Integer sellerId) throws SellerExceptions;


}
