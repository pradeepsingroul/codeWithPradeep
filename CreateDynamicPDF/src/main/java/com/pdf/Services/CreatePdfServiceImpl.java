package com.pdf.Services;


import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.pdf.PdfName;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.font.FontFamilySplitter;
import com.itextpdf.layout.property.TextAlignment;
import com.pdf.Model.Item;
import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.pdf.Model.Seller;
import org.springframework.web.servlet.function.ServerRequest;

import java.awt.*;
import java.util.List;

import static com.itextpdf.kernel.pdf.PdfName.*;

@Service
public class CreatePdfServiceImpl implements  CreatePdfService{

    @Override
	public void createPdf(Seller seller){
        String filePath = "C:/Users/prade/OneDrive/Desktop/pdf creation/samplePdfFile.pdf";
        try {

            PdfWriter writer = new PdfWriter(filePath);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);

            // here decalaring the column widht and creating the table
            float[] columnWidht = {300f,300f};
            Table table = new Table(columnWidht);

            //into the next two line i am defining the heading of collums;
            table.addCell(new Cell().add("Seller").setMarginLeft(35f));
            table.addCell(new Cell().add("Buyer").setMarginLeft(35f));

            //here i am setting the details of seller and buyer in next two line
            table.addCell(new Cell().add(seller.getSeller()).add("Gstin :"+seller.getSellerGstin()).add(seller.getSellerAddress()).setMarginLeft(35f).setItalic());
            table.addCell(new Cell().add(seller.getBuyer().getBuyer()).add("Gstin : "+seller.getBuyer().getBuyerGstin()).add(seller.getBuyer().getBuyerAddress()).setMarginLeft(35f).setItalic());

            // defining the column and creating thetable
            float[] columnWidth2 = {210f,130f,130f,130f};
            Table table1 = new Table(columnWidth2);

            //defining heading for next 4 column
            table1.addCell(new Cell().add("Item"));
            table1.addCell(new Cell().add("Quantity"));
            table1.addCell(new Cell().add("Rate"));
            table1.addCell(new Cell().add("Ampount"));

            //getting the list of ites
            List<Item> items = seller.getItems();

            //setting the value inside the table
            for(Item it : items){
                table1.addCell(new Cell().add(it.getName()));
                table1.addCell(new Cell().add(String.valueOf(it.getQuantity())));
                table1.addCell(new Cell().add(String.valueOf(it.getRate())));
                table1.addCell(new Cell().add(String.valueOf(it.getAmount())));

            }


            //simply adding these two table inside our pdf
            table1.setTextAlignment(TextAlignment.CENTER);
            document.add(table.setItalic());
            document.add(table1.setItalic());

            //closing the document
            document.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
