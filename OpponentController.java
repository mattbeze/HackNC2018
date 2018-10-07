package guesswho;

import java.util.ArrayList;

public class OpponentController {
private CharacterImpl choice;
public CharacterImpl opponentChoice;
ArrayList<CharacterImpl> possible;
gameView gv;

public OpponentController(CharacterImpl choice, gameView gv)
{
	CharacterCreator c = new CharacterCreator();
	ArrayList freshCharacters = c.createPeople();
	this.possible = freshCharacters;
	this.gv = gv;
	this.choice = choice;
}
public void guess() {
	int typeGuess = new Random().nextInt(6); //Sex,Aff,Hair,Skin,Age,Name
	if (typeGuess == 0) { //SexCheck
			handleSexGuess(opponentChoice.isMale());
	}
	if (typeGuess == 1) { //AgeCheck
		handleAgeGuess(opponentChoice.getAge());
	}
	if (typeGuess == 2) { //HairCheck
		int nextGuess = new Random().nextInt(4);
		if (nextGuess == 0){
			handleHairGuess(Character_Interface.hairColor.BLACK);
		}
		if (nextGuess == 1){
			handleHairGuess(Character_Interface.hairColor.BLONDE);
		}
		if (nextGuess == 2){
			handleHairGuess(Character_Interface.hairColor.BROWN);
		}
		if (nextGuess == 3){
			handleHairGuess(Character_Interface.hairColor.OTHER);
		}
	}
	if (typeGuess == 3) { //AffCheck
		handleAffiliationGuess(opponentChoice.getAffiliation());
	}
	if (typeGuess == 4) { //SkinCheck
		int nextGuess = new Random().nextInt(2);
		if (nextGuess == 0){
			handleSkinGuess(Character_Interface.skinColor.BLACK);
		}
		if (nextGuess == 1){
			handleSkinGuess(Character_Interface.skinColor.WHITE);
		}
		if (nextGuess == 2){
			handleSkinGuess(Character_Interface.skinColor.OTHER);
		}
	}
	if (typeGuess == 5) { //NameCheck
		handleNameGuess(opponentChoice.getName());
}
public void handleHairGuess(CharacterImpl.hairColor hair) {
	boolean opponentChar = hairCheck(opponentChoice, hair);
	for (int i=0; i<possible.size(); i++)
	{	
		boolean check = hairCheck(possible.get(i), hair);
		if (opponentChar && check) 
		{
			//do nothing, leaves it in
		}
		else 
		{
			possible.remove(i);
		}
		
	}
}
public void handleSkinGuess(CharacterImpl.skinColor skin) {
	boolean opponentChar = skinCheck(opponentChoice, skin);
	for (int i=0; i<possible.size(); i++) {
		boolean check = skinCheck(possible.get(i), skin);
		if (opponentChar && check) {
			//Leave them in since they have matching skin colors
		}
		else
		{
			possible.remove(i);
		}
	}
	
}
public void handleAgeGuess(CharacterImpl.age age) {
	boolean opponentChar = ageCheck(opponentChoice, age);
	for (int i=0; i<possible.size(); i++) {
		boolean check = ageCheck(possible.get(i), age);
		if (opponentChar && check) {
			//Leave them in since they have matching ages
		}
		else
		{
			possible.remove(i);
		}
	}
	
}
public void handleNameGuess(String name) {
	boolean opponentChar = nameCheck(opponentChoice,  name);
	for (int i=0; i<possible.size(); i++) {
		boolean check = nameCheck(possible.get(i), name);
		if (opponentChar && check) {
			//Leave them in since they have names
		}
		else
		{
			possible.remove(i);
		}
	}
	
}
public void handleAffiliationGuess(CharacterImpl.Affiliation aff) {
	boolean opponentChar = affiliationCheck(opponentChoice, aff);
	for (int i=0; i<possible.size(); i++) {
		boolean check = affiliationCheck(possible.get(i), aff);
		if (opponentChar && check) {
			//Leave them in since they have matching affiliations
		}
		else
		{
			possible.remove(i);
		}
	}
	
	
}
public boolean hairCheck(CharacterImpl character, CharacterImpl.hairColor hair) {
	if (character.getHair().equals(hair))
	return true;
	return false;
}
public boolean skinCheck(CharacterImpl character, CharacterImpl.skinColor skin) {
	if (character.getSkin().equals(skin))
	return true;
	return false;
}
public boolean ageCheck(CharacterImpl character, CharacterImpl.age age) {
	if (character.getAge().equals(age))
	return true;
	return false;
}
public boolean affiliationCheck(CharacterImpl character, CharacterImpl.Affiliation aff) {
	if (character.getAffiliation().equals(aff))
	return true;
	return false;
}
public boolean sexCheck(CharacterImpl character, boolean isMale) {
	if (character.isMale())
	return true;
	return false;
}
public boolean nameCheck(CharacterImpl character, String name) {
	if (character.getName().equals(name))
	return true;
	return false;
}

public void setOpponentChoice(CharacterImpl oc) {
	opponentChoice = oc;
}

}
