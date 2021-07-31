package products.model.dto;

public class Products {
	
	private int code;
	private String name;
	private int price;
	private String imgPath;
	private String type;
	
	public Products(int code, String name, int price, String imgPath, String type) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.imgPath = imgPath;
		this.type = type;
	}
	
	public Products(String name, int price, String imgPath, String type) {
		super();
		this.name = name;
		this.price = price;
		this.imgPath = imgPath;
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getImgPath() {
		return imgPath;
	}

	public String getType() {
		return type;
	}
	
}
