package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufatureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufatureDate) {
		super(name, price);
		this.manufatureDate = manufatureDate;
	}
	
	public Date getManufatureData() {
		return manufatureDate;
	}
	
	public void setManufatureDate(Date manufatureDate) {
		this.manufatureDate = manufatureDate;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ "(used) $ " 
				+ String.format("%.2f", getPrice()) 
				+ "(Manufature date: " 
				+ sdf.format(manufatureDate) 
				+ ")";
	}

}
