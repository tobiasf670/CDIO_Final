package Felt;

public class Chance extends Field {

	public Chance(String Titel, String Sub, String Desc, int fieldNo) {
		super(Titel, Sub, Desc, fieldNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean landOn(GameController gameController) {
		GameController.ChanceCardController.drawCard(gameController);
		return false;
	}

}
