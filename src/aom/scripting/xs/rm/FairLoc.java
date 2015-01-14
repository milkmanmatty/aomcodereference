package aom.scripting.xs.rm;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * <p>This class provides a collection of RM commands concerning Fair Locations.</p>
 * <p>
 * These special commands are designed to place critical resources, 
 * such as Settlements and sometimes Gold Mines. 
 * They are expensive and slow, so should not be used for many objects, 
 * but can ensure that objects that "must place" are present on a map.
 * </p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class FairLoc {
	/**Adds some fairLoc placement info. 
	** For each fairLoc you specify the following settings: 
	** optional object name to use (for check placement), 
	** forward or back (forward means towards the enemy), 
	** inside or outside (inside means towards an ally), 
	** min/max distance from the player, 
	** min distance from other locations, 
	** and min distance from the edge of the map. 
	** You can also add regular constraints to it. 
	** Specifying playerArea or teamArea forces the location to that area, providing these areas are defined. Useful for keeping a Settlement on a player’s island rather than across a river. */ 
	public native int rmAddFairLoc(string unitName, bool forward, bool inside, float minPlayerDist, float maxPlayerDist, float locDist, float edgeDist, bool playerArea, bool teamArea);

	/**Add specified constraint to a fairLoc placement.*/ 
	public native bool rmAddFairLocConstraint(int fairLocID, int constraintID);
	
	/**Gets a player's fairLoc x fraction.*/
	public native float rmFairLocXFraction(int playerID, int index);

	/**Gets a player's fairLoc z fraction.*/
	public native float rmFairLocZFraction(int playerID, int index);

	/**Gets a player's number of fairLocs.*/
	public native int rmGetNumberFairLocs(int playerID);
	
	/**Places down a fairLoc and returns whether or not it was succesful.*/
	public native bool rmPlaceFairLocs();
	
	/**Resets fairLoc placement info.*/
	public native void rmResetFairLocs();
	
	private FairLoc() {}
}
