package com.pdf.Services;

import com.pdf.Exceptions.BuyerExceptions;
import com.pdf.Exceptions.SellerExceptions;
import com.pdf.Model.Buyer;
import com.pdf.Repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BuyerServiceImpl implements  BuyerService{

    @Autowired
    private BuyerRepository bDao;

    @Override
    public Buyer registerBuyerHandler(Buyer buyer) throws BuyerExceptions {
//        Optional<Buyer> optionalSeller = bDao.findById(buyer.getBuyer_Id());
//        if(optionalSeller.isPresent()){
//            throw  new SellerExceptions("buyer already exist with the id "+buyer.getBuyer_Id());
//        }else{
           return bDao.save(buyer);
//        }
    }

    @Override
    public Buyer getBuyerByIdHandler(Integer buyerId) throws BuyerExceptions {
        Optional<Buyer> optionalSeller = bDao.findById(buyerId);
        if(optionalSeller.isPresent()){
            return optionalSeller.get();
        }else{
            throw  new SellerExceptions("buyer does not exist with the id "+buyerId);
        }
    }
}
