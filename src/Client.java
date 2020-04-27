
public interface Client {
	
	final int membership_status=1; //setting permanent value
		
	public abstract void addCustomer(int membership_status); //class that implements this interface must define the body of this method
}
