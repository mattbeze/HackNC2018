package guesswho;

public interface Character_Interface {
	 public enum hairColor {BLACK, BLONDE, BROWN, OTHER}
	 public enum age {OVER, UNDER}
	 public enum skinColor {WHITE, BLACK, OTHER}
	 public enum Affiliation {ATHLETICS, OTHER}
	 public String getName();
	 public boolean isMale();
}
