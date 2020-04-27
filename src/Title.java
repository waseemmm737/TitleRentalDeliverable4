
public interface Title {
	
	final int movie_status = 0;	//setting permanent value 0 mean title available for rent
	
	public abstract void addTitle(int movie_status); //class that implements this interface must define the body of this method
}
