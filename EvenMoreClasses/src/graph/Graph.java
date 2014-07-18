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
		
		/**
		 * @param name of the node to create
		 * @param connections of the node to create
		 */
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
				break;
			}
				
		}
		
		/**
		 * @return an ArrayList containing the nodes that the node is connected to
		 */
		public ArrayList<Node> getConnections() {
			return connections;
		}
		
		/**
		 * @param an ArrayList of the connections of the node to be set
		 */
		public void setConnections(ArrayList<Node> connections) {
			this.connections = connections;
			Collections.sort(connections);
		}
		
		/**
		 * @param a node to add a connection to
		 */
		public void addConnection(Node node) {
			connections.add(node);
		}
		
		/**
		 * @param new name for the node
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		/**
		 * @return the name of the node
		 */
		public String getName() {
			return name;
		}

		@Override
		public int compareTo(Node o) {
			return this.name.compareTo(o.name); //Delegation
		}
	}
	
	/**
	 * @return ArrayList of Strings of all the names of nodes
	 */
	public ArrayList<String> getNodeNames() {
		ArrayList<String> names = new ArrayList<>();
		for (Node n : nodes) {
			names.add(n.name);
		}
		return names;
	}	

	/**
	 * @param a String of the name of the node 
	 * @return an ArrayList of connections of the node.  If no connections are found, it returns null.
	 */
	public ArrayList<String> getConnections(String name) {
		ArrayList<String> connections = new ArrayList<>();
		
		if (hasNode(name)) {
			Node node = findNode(name);
			ArrayList<Node> connectionsOfNode = node.getConnections();
			if (connectionsOfNode != (null)) {
				for (Node n : connectionsOfNode) {
					connections.add(n.name);
				}
			}
			else {
				return null;
			}
		}
		
		return connections;
	}
	
	/**
	 * @param connections of the nodes to find
	 * @return ArrayList of the nodes that have such connections
	 */
	private ArrayList<Node> findNode(ArrayList<Node> connections) {
		ArrayList<Node> nodesThatMatch = new ArrayList<>();
		for (Node n : nodes) {
			if (n.connections.equals(connections)) {
				nodesThatMatch.add(n);
			}
		}
		return nodesThatMatch;
	}
	
	/**
	 * @param name of the node to be searched for
	 * @return the node that was found
	 */
	private Node findNode(String name) {
		Node node = null;
		
		for (Node n : nodes) {
			if (n.name.toLowerCase().equals(name.toLowerCase())) {
				node = n;
			}
		}
		
		return node;
	}
	
	/**
	 * @param name of the node
	 * @return boolean of if the node was found or not
	 */
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
	
	/**
	 * @param connections of the nodes to be found
	 * @return boolean of if any nodes have such connections
	 */
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

	/**
	 * @param name of the new node
	 * @param connections of the new node
	 */
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

	/**
	 * @param name of the node to be created
	 */
	public void addNode(String name) {
		if (!hasNode(name)) {
			Node node = new Node(name, null);
			nodes.add(node);
		}
	}

	/**
	 * @param nodeA to make a connection to nodeB
	 * @param nodeB to make a connection to nodeA
	 */
	public void makeConnection(String nodeA, String nodeB) {
		if (hasNode(nodeA) && hasNode(nodeB)) {
			Node a = findNode(nodeA);
			Node b = findNode(nodeB);
			a.addConnection(b);
			b.addConnection(a);
		}
	}
}
