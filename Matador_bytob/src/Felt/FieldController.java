package Felt;

public class FieldController {
	private int[] noob = {1,2,3,4,5};
	private Field[] gameFields = new Field[40];
	
	
	
	
	public int getOwnerShips(Ownable f, Player p) {
		int count = 0;
		for(int i = 0 ; i<=40; i++){
			if (f instanceof gameFields[i]  && gameFields[i].getOwner == p){
				count +=1;
			}
			
		}
	}
}

