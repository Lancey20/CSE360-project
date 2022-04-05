package project360;

abstract class User {
	protected String name;
	protected String password;
	protected String email;
	protected Boolean loginStatus;
	protected int phoneNum; 
	protected String cardName; 
	protected int creditCard; 
	protected String billingAddr; 
	protected int ccvNum; 
	protected String exprDate; 
	
	public void createUser(String name, String password, String email, int phoneNum, String cardName, int cardNum, String addr, int ccv, String expr)
	{
		this.name = name; 
		this.password = password; 
		this.email = email; 
		this.phoneNum = phoneNum; 
		this.cardName = cardName; 
		creditCard = cardNum; 
		billingAddr = addr; 
		ccvNum = ccv; 
		exprDate = expr; 
		loginStatus = true; 
	}
	
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public Boolean getLoginStatus() {
		return loginStatus;
	}

	public int getPhoneNumber()
	{
		return phoneNum; 
	}
	
	public String getCardName()
	{
		return cardName;
	}
	
	public int getCreditCard()
	{
		return creditCard; 
	}
	
	public String getBillingAddr()
	{
		return billingAddr; 
	}
	
	public int getCCVNum()
	{
		return ccvNum; 
	}
	
	public String getExpirationDate()
	{
		return exprDate; 
	}
	
	public void setLoginStatus(Boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhoneNumber(int num)
	{
		phoneNum = num; 
	}
	
	public void setCardName(String name)
	{
		cardName = name;
	}
	
	public void setCreditCard(int card)
	{
		creditCard = card; 
	}
	
	public void setBillingAddr(String addr)
	{
		billingAddr = addr; 
	}
	
	public void setCCVNum(int ccv)
	{
		ccvNum = ccv; 
	}
	
	public void setExpirationDate(String date)
	{
		exprDate = date; 
	}
	
	public abstract Boolean login(String email, String password);

}
