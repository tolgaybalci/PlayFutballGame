
public abstract class Football extends BallGame{

	public void hasHoliganism() {
		System.out.println("Holiganlık kötüdür.");
	}
	
	public void playableWith22Players() {
		System.out.println("Futbol 22 kişiyle oynanır. ");
	}

	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	abstract void hasWinner();

}
