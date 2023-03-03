package com.pdf.Services;

import com.pdf.Exceptions.SellerExceptions;
import com.pdf.Model.Seller;

public interface CreatePdfService {

	void createPdf(Seller seller)throws SellerExceptions;
	
}
