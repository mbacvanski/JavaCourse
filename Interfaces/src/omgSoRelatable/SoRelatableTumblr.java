package omgSoRelatable;
/**
 * 
 * @author marc
 *
 */
public class SoRelatableTumblr implements OMGSoRelatable {
	
	private int relatabilityIndex;
	
	public SoRelatableTumblr(int relatabilityIndex) {
		this.relatabilityIndex = relatabilityIndex;
	}
	
	public int getRelatabilityIndex() {
		return relatabilityIndex;
	}
	
	@Override
	public int isMoreRelatableThan(OMGSoRelatable Other) {
		if (this.relatabilityIndex > Other.getRelatabilityIndex()) {
			return 1;
		}
		else if (this.relatabilityIndex == Other.getRelatabilityIndex()) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
