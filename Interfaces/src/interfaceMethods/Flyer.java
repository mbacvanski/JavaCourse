package interfaceMethods;

public interface Flyer {
	default public String identifyMyself() {
		return "I can fly!";
	}
}
