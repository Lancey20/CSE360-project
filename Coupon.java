package application;

public class Coupon 
{
	private String code; 
	private double discountAmt; 
	private Boolean available; 	//is there a coupon or not
	
	public void createCoupon(String code, double discount)
	{
		this.code = code; 
		discountAmt = discount; 
		available = true; 
	}
	
	public void setCode(String couponCode)
	{
		code = couponCode; 
	}
	
	public void setDiscount(double discount)
	{
		discountAmt = discount; 
	}
	
	public void setAvailable(Boolean avail)
	{
		available = avail; 
	}
	
	public String getCode()
	{
		return code; 
	}
	
	public double getDiscount()
	{
		return discountAmt; 
	}
	
	public Boolean getAvailable()
	{
		return available; 
	}
}
