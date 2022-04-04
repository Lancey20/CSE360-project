package application;

public class Coupon 
{
	private String code; 
	private double discountAmt; 
	
	public void createCoupon(String code, double discount)
	{
		this.code = code; 
		discountAmt = discount; 
	}
	
	public void setCode(String couponCode)
	{
		code = couponCode; 
	}
	
	public void setDiscount(double discount)
	{
		discountAmt = discount; 
	}
	
	public String getCode()
	{
		return code; 
	}
	
	public double getDiscount()
	{
		return discountAmt; 
	}
}
