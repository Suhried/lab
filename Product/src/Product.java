public class Product {
 String code;
 String description;
 double price;
 
public Product() {                                                   //constructor
	super();
}
public Product(String code, String description, double price) {
	super();
	this.code = code;
	this.description = description;                       //constructor
	this.price = price;
}
public String getCode() {
	return code;
	
}
public void setCode(String code) {
	this.code = code;
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
@Override
public String toString() {
	return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
}
 
}
