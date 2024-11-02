package finalProject;

public class Home {

	private int squareFeet;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private String modelName;
	private String saleStatus;
	
	// Constructor
	public Home(int squareFeet, String address, String city, String state, int zipCode, String modelName, String saleStatus)	{
		this.squareFeet = squareFeet;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.modelName = modelName;
		this.saleStatus = saleStatus;
	}
	
	// Add a New Home
	public String addHome()	{
		try	{
			return "*Home Added Successfully*";
		} catch (Exception e)	{
			return "Failed to add home: " + e.getMessage();
		}
	}
	
	// Remove a Home
	public String removeHome()	{
		try	{
			this.squareFeet = 0;
			this.address = "";
			this.city = "";
			this.state = "";
			this.zipCode = 0;
			this.modelName = "";
			this.saleStatus = "";
			return "\n*Home Removed Successfully*";
		} catch (Exception e)	{
			return "Failed to remove home: " + e.getMessage();
		}
	}
	
	// Update Home Attributes
	public String updateHome(String newSaleStatus)	{
		try	{
			this.saleStatus = newSaleStatus;
			return "\n*Home Updated Successfully*";
		} catch (Exception e)	{
			return "\nFailed To Update Home: " + e.getMessage();
		}
	}
	
	// Getters and Setters
	public int getSquareFeet() {return squareFeet;}
	public void setSquareFeet(int squareFeet) {this.squareFeet = squareFeet;}
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public String getCity() {return city;}
	public void setCity(String city) {this.city = city;}
	public String getState() {return state;}
	public void setState(String state) {this.state = state;}
	public int getZipCode() {return zipCode;}
	public void setZipCode(int zipCode) {this.zipCode = zipCode;}
	public String getModelName() {return modelName;}
	public void setModelName(String modelName) {this.modelName = modelName;}
	public String getSaleStatus() {return saleStatus;}
	public void setSaleStatus(String saleStatus) {this.saleStatus = saleStatus;}
}
