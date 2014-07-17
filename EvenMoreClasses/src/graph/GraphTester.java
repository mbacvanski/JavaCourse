package graph;

public class GraphTester {

	private static final String CHUKAR = "Chukar";
	private static final String ANDROID = "Android";
	private static final String PIGGY = "Piggy";

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addNode(CHUKAR);
		graph.addNode(ANDROID);
		graph.addNode(PIGGY);
		graph.makeConnection(CHUKAR, PIGGY);
		graph.makeConnection(CHUKAR, ANDROID);
		System.out.println("Android's connections: " + graph.getConnections(ANDROID));
		System.out.println("Chukar's connections: " + graph.getConnections(CHUKAR));
		System.out.println("Piggy's connectionss: " + graph.getConnections(PIGGY));
	}

}
