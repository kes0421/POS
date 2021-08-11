package admin.model.dto;

public class ProductsInventory {

	private String code;
	private String name;
	private int quantity;
	private int price;
	
	public ProductsInventory(String code, String name, int quantity, int price) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public ProductsInventory(String code) {
		super();
		this.code = code;
	}
	
	public ProductsInventory(String name, int quantity, int price, String code) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
