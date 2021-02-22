import java.util.ArrayList;
import java.util.Arrays;

public class TravelToVisit extends Place {

	private String season, information;
	private int price, distance_to_center;
	private boolean[] facilities;
	private ArrayList<String[]> comments;
	private int rate;
	

	public TravelToVisit(String name, String type, Address address, Phone phone, String season, String information,
			int price, int distance_to_center, boolean[] facilities, int rate) {
		super(name, type, address, phone);
		this.season = season;
		this.information = information;
		this.price = price;
		this.distance_to_center = distance_to_center;
		this.facilities = facilities;
		this.rate = rate;
		comments = new ArrayList<String[]>();
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDistance_to_center() {
		return distance_to_center;
	}

	public void setDistance_to_center(int distance_to_center) {
		this.distance_to_center = distance_to_center;
	}

	public boolean[] getFacilities() {
		return facilities;
	}

	public void setFacilities(boolean[] facilities) {
		this.facilities = facilities;
	}

	public ArrayList<String[]> getComments() {
		return comments;
	}

	public void setComments(ArrayList<String[]> comments) {
		this.comments = comments;
	}

	public int getRates() {
		return rate;
	}

	public void setRates(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "\nTravelToVisit [ " + super.toString() + " season=" + season + ", information=" + information
				+ ", price=" + price + ", distance_to_center=" + distance_to_center + ", facilities="
				+ Arrays.toString(facilities) + ", rates=" + rate + "]\n";
	}

	@Override
	public void addComment(String userId, String comment) {
		String[] comment_array = new String[2];
		comment_array[0] = userId;
		comment_array[1] = comment;
		comments.add(comment_array);
	}

}
