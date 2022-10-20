package oop1;

public class Product {

	public Product(int id, String name, String description, double price, int stocAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stocAmount;
	}
	
	public Product() {
		
	}

	// attribute / field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		// this.id=id;
		// this yerine yukarıdaki metinlere alt çizgi eklenir.
		id = this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getkod() {
		return this.name.substring(0, 1) + id;
	}

	public void setkod(String kod) {
		this.setKod(kod);
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	// public void set_kod(String kod) {
	// this._kod = kod;
}
