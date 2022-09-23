package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";

		Product product1 = new Product(); 
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.url");
		//write set //read get
		
		Product product2 = new Product(); 
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.url");
		
		
		Product product3 = new Product(); 
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.url");
		
		
		Product[] products = {product1,product2,product3}; //products gez.
		
		System.out.println("<ul>");
		
		for (Product product : products) {
			System.out.println("<li>"+product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setNumber("052215558");
		individualCustomer.setCustomerNumber("12355");
		individualCustomer.setFirstName("Babür");
		individualCustomer.setLastName("Keser");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.iö");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setNumber("053322215");
		corporateCustomer.setTaxNumber("2555");
		
		Customer[] customers = {individualCustomer,corporateCustomer};

	}

}
