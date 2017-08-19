
public class FootballEmulator extends Football {

	private FootballClub homeTeam;
	private FootballClub guestTeam;
	private int scoresOfHomeTeam;
	private int scoresOfGuestTeam;

	public FootballClub getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(FootballClub homeTeam) {
		this.homeTeam = homeTeam;
	}

	public FootballClub getGuestTeam() {
		return guestTeam;
	}

	public void setGuestTeam(FootballClub guestTeam) {
		this.guestTeam = guestTeam;
	}

	public int getScoresOfHomeTeam() {
		return scoresOfHomeTeam;
	}

	public void setScoresOfHomeTeam(int scoresOfHomeTeam) {
		this.scoresOfHomeTeam = scoresOfHomeTeam;
	}

	public int getScoresOfGuestTeam() {
		return scoresOfGuestTeam;
	}

	public void setScoresOfGuestTeam(int scoresOfGuestTeam) {
		this.scoresOfGuestTeam = scoresOfGuestTeam;
	}

	@Override
	public void anOpponentScores(FootballClub fc) {
		if(fc.equals(homeTeam)) {
			scoresOfHomeTeam = scoresOfHomeTeam + 1;
		}
		else if(fc.equals(guestTeam)) {
			scoresOfGuestTeam = scoresOfGuestTeam + 1;
		}
		
	}

	@Override
	void hasWinner() {
		System.out.println(homeTeam.getClubName() + ": " + scoresOfHomeTeam + " " + guestTeam.getClubName() + ": " + scoresOfGuestTeam);
		if(scoresOfHomeTeam > scoresOfGuestTeam) {
			System.out.println("Kazanan: " + homeTeam.getClubName() );
		}
		else if(scoresOfGuestTeam > scoresOfHomeTeam) {
			System.out.println("Kazanan: " + guestTeam.getClubName());
		}
		else System.out.println("Berabere.");
		
	}
}
