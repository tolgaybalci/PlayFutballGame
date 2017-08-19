
public abstract class Club {

	private String clubName;
	private String colors;
	private int clubValue;

	public Club(String clubName, String colors, int clubValue) {

		this.clubName = clubName;
		this.colors = colors;
		this.clubValue = clubValue;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public int getClubValue() {
		return clubValue;
	}

	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}

}
