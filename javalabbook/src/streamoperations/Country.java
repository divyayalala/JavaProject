package streamoperations;

public class Country {
     private int countryId;
     private String CountryName;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		CountryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", CountryName=" + CountryName + "]";
	}
     
     
}
