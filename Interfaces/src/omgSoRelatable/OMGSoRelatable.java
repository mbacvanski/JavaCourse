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
}
