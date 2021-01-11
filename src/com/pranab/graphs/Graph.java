package com.pranab.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph<T> {

	private Map<GraphNode<T>,LinkedList<GraphNode<T>>> graph=new HashMap<>();

	public Map<GraphNode<T>,LinkedList<GraphNode<T>>> getGraph() {
		return graph;
	}
	
}
