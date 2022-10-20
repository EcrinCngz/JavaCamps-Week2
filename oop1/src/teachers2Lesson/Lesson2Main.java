package teachers2Lesson;

public class Lesson2Main {
	// PascalCase
	// set value

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Lesson2Product product1 = new Lesson2Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		// get
		// System.out.println(product1.name);

		Lesson2Product product2 = new Lesson2Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");

		Lesson2Product product3 = new Lesson2Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");

		Lesson2Product[] products = { product1, product2, product3 };
         System.out.println("<ul>");
		for (Lesson2Product product : products) {
			System.out.println("<li>" + product.getName() + "<li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0123456");
		individualCustomer.setCustomerNumber("987654");
		individualCustomer.setFirstName("Ecrin");
		individualCustomer.setLastName("Cengiz");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("123456");
		corporateCustomer.setTaxNumber("11111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
	}
}
