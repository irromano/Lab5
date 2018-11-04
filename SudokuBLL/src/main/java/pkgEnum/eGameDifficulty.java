package pkgEnum;
import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;


/**
 * eGameDifficulty -This enum represents a puzzle's difficulty based on how many
 * possible number values can be placed in the empty spots of the
 * puzzle.
 *
 */
public enum eGameDifficulty {
	
	EASY(100), MEDIUM(500), HARD(1000);		//The possible difficulties the puzzle can be
	
	/**
	 * iDifficulty -The value which represents a game difficulty
	 */
	private final int iDifficulty;
	/**
	 * lookup -A map pairing iDifficulty with gameDifficulty
	 */
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();
	
	static {		//Pairing every difficulty (value) with an int iDifficulty (key) in the map 'lookup'.
		for (eGameDifficulty diff : eGameDifficulty.values()) {
			lookup.put(diff.getiDifficulty(), diff);
		}
	}
	
	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}
	
	
	/**
	 * getiDifficulty -Returns the enum's difficulty int value.
	 * @return iDifficultyValue
	 */
	public int getiDifficulty() {
		return iDifficulty;
	}
	/**
	 * getLookup -Returns an enum difficulty based on parameter int value.
	 * @param iDifficulty
	 * @return	difficulty
	 */
	public static eGameDifficulty get(int iDifficulty) {
		eGameDifficulty difficulty = null;
		if (iDifficulty >= HARD.getiDifficulty()) {
			difficulty = HARD;
		} else if (iDifficulty >= MEDIUM.getiDifficulty()) {
			difficulty = MEDIUM;
		} else if (iDifficulty >= EASY.getiDifficulty()) {
			difficulty = EASY;
		}
		return difficulty;
	}
	
	
	
}
