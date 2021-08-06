package products.model.dto;

public class ProductsBasket {

	private String name;
	private String imgPath;
	private String price;
	private String quantity;
	
	public ProductsBasket() {}
	
	public ProductsBasket(String name, String imgPath, String price, String quantity) {
		super();
		this.name = name;
		this.imgPath = imgPath;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductsBasket(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
}
