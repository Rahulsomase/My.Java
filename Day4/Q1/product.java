package Day4.Q1;

public class product {
	private int productId;
	private  String productName;
	private int	price;
	private int	quantity;
	
	
	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}


	public product(int productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
