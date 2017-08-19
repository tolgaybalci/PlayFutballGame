
public class ApplicationClass {

	public static void main(String[] args) {
		
		FootballClub fc1 = new FootballClub("Genclerbirligi", "Kara Kızıl", 123456, "19 Mayıs", 22500);
		FootballClub fc2 = new FootballClub("Ankaragücü", "Sarı Lacivert", 23124, "19 Mayıs", 22500);
		FootballEmulator emulator = new FootballEmulator();
				
		emulator.setHomeTeam(fc1);
		emulator.setGuestTeam(fc2);
		emulator.anOpponentScores(fc1);
		emulator.anOpponentScores(fc2);
		emulator.anOpponentScores(fc1);
		emulator.hasWinner();
	}
}
