package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Delonghi Ütü");
		product1.setDiscount(5);
		product1.setUnitPrice(1500);
		product1.setUnitsInStock(15);
		product1.setImageUrl("bilmemne.jpg");
		
		Product product2 = new Product();
		product2.setName("Semek Ütü");
		product2.setDiscount(6);
		product2.setUnitPrice(1500);
		product2.setUnitsInStock(5);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Air Craft ütü");
		product3.setDiscount(4);
		product3.setUnitPrice(1500);
		product3.setUnitsInStock(15);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		for (Product product:products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhone("5553332222");
		individualCustomer.setFirstName("Duhan");
		individualCustomer.setLastName("Turan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05553332221");
		corporateCustomer.setTaxNumber("111111");
		corporateCustomer.setCustomerNumber("4");
	}

}
