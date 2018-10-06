package guesswho;

import java.util.ArrayList;

public class PlayerController {
private CharacterImpl choice;
public CharacterImpl opponentChoice;
ArrayList<CharacterImpl> possible;
gameView gv;

public PlayerController(CharacterImpl choice, gameView gv)
{
	CharacterCreator c = new CharacterCreator();
	ArrayList freshCharacters = c.createPeople();
	this.possible = freshCharacters;
	this.gv = gv;
	this.choice = choice;
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
