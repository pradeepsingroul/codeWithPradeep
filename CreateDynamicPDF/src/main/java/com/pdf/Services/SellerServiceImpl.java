package com.pdf.Services;

import com.pdf.Exceptions.SellerExceptions;
import com.pdf.Model.Item;
import com.pdf.Model.Seller;
import com.pdf.Repository.ItemRepository;
import com.pdf.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class SellerServiceImpl implements SellerService{
    @Autowired
    private SellerRepository sDao;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Seller registerSellerAndBuyerWithItem(Seller seller) throws SellerExceptions {
//        List<Item> items = seller.getItems();
//        for(Item item : items){
//            itemRepository.save(item);
//        }
        return sDao.save(seller);
    }

    @Override
    public Seller getSellerByThereId(Integer sellerId) throws SellerExceptions {
        Optional<Seller> optionalSeller = sDao.findById(sellerId);
        if(optionalSeller.isPresent()){
            return optionalSeller.get();
        }else{
            throw  new SellerExceptions("Seller does not exist with the id "+sellerId);
        }
    }
}
