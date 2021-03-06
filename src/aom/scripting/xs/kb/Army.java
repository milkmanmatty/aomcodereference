package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of KB commands concerning Armies.
 * An army is a logical grouping of units. Units can only be part of 1 army 
 * and an army can only consist of 30 unit max.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Army {
	/** Creates a army with the given name. */
	public native int kbArmyCreate(string name, bool exclusiveUnits);
	/** Destroys the given army. */
	public native bool kbArmyDestroy(int armyID);
	/** Returns the number of armies. */
	public native int kbArmyGetNumber();
	/** Returns the ID of the given army. */
	public native int kbArmyGetID(string name);
	/** Returns the index'th army ID. */
	public native int kbArmyGetIDByIndex(long index);
	/** Returns the name of the given army. */
	public native string kbArmyGetName(int amryID);
	/** Returns the number of units in the given army. */
	public native int kbArmyGetNumberUnits(int armyID);
	/** Returns the appropriate unitID from the given army. */
	public native int kbArmyGetUnitID(int armyID, long unitNumber);
	/** Adds the unitID to the given army. */
	public native bool kbArmyAddUnit(int armyID, int unitID);
	/** Removes the unitID from the given army. */
	public native bool kbArmyRemoveUnit(int armyID, int unitID);
	/** Removes the unitIndex'th unit from the given army. */
	public native bool kbArmyRemoveUnitByIndex(int armyID, int unitIndex);
	/** Removes all units from the given army. */
	public native bool kbArmyRemoveUnits(int armyID);
	/** Returns the planID for the given army. */
	public native int kbArmyGetPlanID(int armyID);
	/** Returns the creation time for the given army. */
	public native int kbArmyGetCreationTime(int armyID);
	/** Returns the creation time for the given army. */
	public native int kbArmyGetMembershipTime(int armyID);
	/** Returns the vector location for the given army. */
	public native vector kbArmyGetLocation(int armyID);
	/** Returns the number of units within range of the given point in the given army. */
	public native int kbArmyGetNumberWithinLocation(int armyID, vector point, float range);
	/** Returns the current total hitpoints for the given army. */
	public native float kbArmyGetCurrentHitpoints(int armyID);
	/** Returns the maximum total hitpoints for the given army. */
	public native float kbArmyGetMaximumHitpoints(int armyID);
	/** Returns the health for the given army. */
	public native float kbArmyGetHealth(int armyID);
	/** Returns the number of units with at least the minimum amount of health specified for the given army. */
	public native int kbArmyGetNumberWithHealth(int armyID, float minimumHealth);
	/** Returns the current AI cost (worth) for the given army. */
	public native float kbArmyGetCurrentAICost(int armyID);
	/** Returns the maximum AI cost (worth) for the given army. */
	public native float kbArmyGetMaximumAICost(int armyID);
	/** Returns the APS damage taken by the given army. */
	public native float kbArmyGetAPSDamageTaken(int armyID, float timeSpan);
	/** Returns the APS damage given by the given army. */
	public native float kbArmyGetAPSDamageGiven(int armyID, float timeSpan);
	/** Returns the APS resources gathered by the given army. */
	public native float kbArmyGetAPSResourcesGathered(int armyID, float timeSpan, int resourceID);
	
	//hide constructor
	private Army() {}
}
