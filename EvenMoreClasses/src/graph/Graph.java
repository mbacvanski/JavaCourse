package graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Graph {
	
	private static ArrayList<Node> nodes = new ArrayList<>();
	
	public Graph() {}
	
	private class Node implements Comparable<Node> {
		private ArrayList<Node> connections = new ArrayList<>();
		private String name = "";
		
		public Node(String name, ArrayList<Node> connections) {
			
			boolean found = false;
			
			while(!found) {
				for (Node n : nodes) {
					if (n.name.toLowerCase().equals(name.toLowerCase())) {
						found = true;
						break;
					}
					else {
						this.connections = connections;
						this.name = name;
					}
				}
			}
				
		}
		
		public ArrayList<Node> getConnections() {
			return connections;
		}
		
		public void setConnections(ArrayList<Node> connections) {
			this.connections = connections;
			Collections.sort(connections);
		}
		
		public void addConnection(Node node) {
			connections.add(node);
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}

		@Override
		public int compareTo(Node o) {
			return this.name.compareTo(o.name); //Delegation
		}
	}
	
	public ArrayList<String> getNodeNames() {
		ArrayList<String> names = new ArrayList<>();
		for (Node n : nodes) {
			names.add(n.name);
		}
		return names;
	}	

	public ArrayList<String> getConnections(String name) {
		ArrayList<String> connections = new ArrayList<>();
		
		if (hasNode(name)) {
			Node node = findNode(name);
			for (Node n : node.connections) {
				connections.add(n.name);
			}
		}
		
		return connections;
	}
	
	public ArrayList<Node> findNode(ArrayList<Node> connections) {
		ArrayList<Node> nodesThatMatch = new ArrayList<>();
		for (Node n : nodes) {
			if (n.connections.equals(connections)) {
				nodesThatMatch.add(n);
			}
		}
		return nodesThatMatch;
	}
	
	public Node findNode(String name) {
		Node node = null;
		
		for (Node n : nodes) {
			if (n.name.toLowerCase().equals(name.toLowerCase())) {
				node = n;
			}
		}
		
		return node;
	}
	
	public boolean hasNode(String name) {
		boolean found = false;

		for (Node n : nodes) {
			if (n.name.toLowerCase().equals(name.toLowerCase())) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	public boolean hasNode(ArrayList<Node> connections) {
		boolean found = false;

		for (Node n : nodes) {
			if (n.connections.equals(connections)) {
				found = true;
				break;
			}
		}
		return found;
	}

	public void addNode(String name, ArrayList<String> connections) {
		ArrayList<Node> possibleConnections = new ArrayList<>();
		for (String s : connections) {
			if (hasNode(s)) {
				Node n = findNode(s);
				possibleConnections.add(n);
			}
		}
		
		if (!hasNode(name)) {
			Node node = new Node(name, possibleConnections);
			nodes.add(node);
			for (Node n : node.connections) {
				n.addConnection(node);
			}
		}
		
	}

	public void addNode(String name) {
		if (!hasNode(name)) {
			Node node = new Node(name, null);
			nodes.add(node);
		}
	}

	public void makeConnection(String nodeA, String nodeB) {
		if (hasNode(nodeA) && hasNode(nodeB)) {
			Node a = findNode(nodeA);
			Node b = findNode(nodeB);
			a.addConnection(b);
			b.addConnection(a);
		}
	}
}
