package guesswho;

public interface Character_Interface {
	 public enum hairColor {BLACK, BLONDE, BROWN, OTHER}
	 public enum eyeColor {GREEN, BLUE, BROWN, HAZEL, OTHER}
	 public enum skinColor {WHITE, BLACK, OTHER}
	 public enum Affiliation {ATHLETICS, OTHER}
	 public String getName();
	 public boolean isMale();
}
