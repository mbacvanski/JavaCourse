package graph;

import java.util.ArrayList;

public class GraphTester {

	private static final String CHUKAR = "Chukar";
	private static final String ANDROID = "Android";
	private static final String PIGGY = "Piggy";
	private static final String POW = "Pow";

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addNode(CHUKAR);
		graph.addNode(ANDROID);
		graph.addNode(PIGGY);
		graph.makeConnection(CHUKAR, PIGGY);
		graph.makeConnection(CHUKAR, ANDROID);
		System.out.println("Android's connections: " + graph.getConnections(ANDROID));
		System.out.println("Chukar's connections: " + graph.getConnections(CHUKAR));
		System.out.println("Piggy's connections: " + graph.getConnections(PIGGY));
		ArrayList<String> powsConnections = new ArrayList<>();
		powsConnections.add(ANDROID);
		powsConnections.add(CHUKAR);
		powsConnections.add(PIGGY);
		graph.addNode(POW, powsConnections);
		System.out.println("Pow's connections: " + graph.getConnections(POW));
		System.out.println("Android's connections: " + graph.getConnections(ANDROID));
		System.out.println("Chukar's connections: " + graph.getConnections(CHUKAR));
		System.out.println("Piggy's connections: " + graph.getConnections(PIGGY));
	}

}
