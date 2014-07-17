package tests;

public class Jeeb implements Comparable<Jeeb>{
	String location  = "";
	String name = "";
	
	public Jeeb(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int compareTo(Jeeb o) {
		return this.location.compareTo(o.location);
	}
}
