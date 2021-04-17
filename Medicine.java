package Assignment5;

public abstract class Medicine {
		private double price;
		private String Expirydate;
		
		abstract void displayLabel();

		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getExpirydate() {
			return Expirydate;
		}
		public void setExpirydate(String expirydate) {
			Expirydate = expirydate;
		}
		void getDetails(){
			System.out.println("Price : "+price+"\n"+"ExpiryDate : "+Expirydate);
		}	
}
class Tablet extends Medicine{
	@Override
	public void displayLabel(){
		System.out.println("It should be stored in a dry place");
	}
}
class Syrup extends Medicine{
	@Override
	void displayLabel() {
		System.out.println("Used for Treat a cough or common cold");	
	}	
}
class Ointment extends Medicine{
	@Override
	void displayLabel() {
		System.out.println("Must be used for External Use Only");
	}
}
