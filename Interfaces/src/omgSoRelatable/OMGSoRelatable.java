package omgSoRelatable;

/**
 * 
 * @author marc
 * 
 * Simple interface for relatable posts
 */

public interface OMGSoRelatable {
	public int isMoreRelatableThan(OMGSoRelatable Other);
	public int getRelatabilityIndex();
	// Default implementation in case we get lazy.
	default public boolean isItRelatable() {
		return true;
	}
}
