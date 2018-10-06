package guesswho;

public class CharacterImpl implements Character_Interface {
	
	 
	 private String name;
	 private boolean isMale;
	 private hairColor hairColor;
	 private age age;
	 private skinColor skinColor;
	private Affiliation Affiliation;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isMale() {
		if (isMale)
			return true;
		else
			return false;
	}
	public CharacterImpl(hairColor hair, age age, skinColor skin, Affiliation aff, String name, boolean isMale)
	{
		this.hairColor = hair;
		this.age = age;
		this.skinColor = skin;
		this.Affiliation = aff;
		this.name = name;
		this.isMale = isMale;
	}

	public String toString() {
		if (isMale)
		return name + " is a male that has " + hairColor + " hair, " + skinColor + " skin, is affiliated with "+ Affiliation +  ", and is " + age + " 25.";
		else
		return name + " is a female that has " + hairColor + " hair, " + skinColor + " skin, is affiliated with "+ Affiliation +  ", and is " + age + " 25.";
	}
	
	public Character_Interface.hairColor getHair() {
		return hairColor;
	}
	public Character_Interface.Affiliation getAffiliation() {
		return Affiliation;
	}
	public Character_Interface.age getAge() {
		return age;
	}
	public Character_Interface.skinColor getSkin() {
		return skinColor;
	}
}
