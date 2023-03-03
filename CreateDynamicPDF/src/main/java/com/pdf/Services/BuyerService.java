package com.pdf.Services;

import com.pdf.Exceptions.BuyerExceptions;
import com.pdf.Exceptions.SellerExceptions;
import com.pdf.Model.Buyer;
import com.pdf.Model.Seller;

public interface BuyerService {

    Buyer registerBuyerHandler(Buyer buyer) throws BuyerExceptions;
    Buyer getBuyerByIdHandler(Integer buyerId) throws BuyerExceptions;

}
