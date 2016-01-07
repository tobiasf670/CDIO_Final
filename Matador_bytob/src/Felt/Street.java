package Felt;

import java.util.Arrays;

import desktop_resources.GUI;




public class Street extends Ownable {
	private int rents [] = new int [7];
	private int buildingPrice;
	private int amountOfHouses;
	private boolean isPawn;
	public Street(String Titel, String Sub, String Desc, int fieldNo, int price, int pawnPrice,int rents[],int buildingPrice) {
		super(Titel, Sub, Desc, fieldNo, price, pawnPrice);
		this.rents = rents;
		this.buildingPrice = buildingPrice;
		
	}

	
	public boolean buyBuilding (String playerName){
		if (GameController.getPlayerController().getPlayer()[GameController.getTurn].getBalance() >= buildingPrice){
		String i = GUI.getUserButtonPressed("Do you want to buy a building?", "Yes","No");
		if (i == "Yes"){
			this.amountOfHouses +=1; // Ved ikke helt med denne, vi skal have noget der holder styr p� dette.
			return true;
		}
		else {
			return true;
		}
		}	
			
	}
	public int getamountOfHouses(){
		return this.amountOfHouses;
		
	}

	public int[] getRents() {
		return rents;
	}


	public void setRents(int[] rents) {
		this.rents = rents;
	}


	@Override
	public String toString() {
		return "Street [rents=" + Arrays.toString(rents) + "]";
	}
	
}
