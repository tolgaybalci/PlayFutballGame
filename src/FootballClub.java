
public class FootballClub extends Club {

	private String stadiumName;
	private int stadiumCapacity;

	public FootballClub(String clubName, String colors, int clubValue, String stadiumName, int stadiumCapacity) {
		super(clubName, colors, clubValue);
		this.stadiumCapacity = stadiumCapacity;
		this.stadiumName = stadiumName;
		// TODO Auto-generated constructor stub
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

}
