package com.pranab.graphs;

public class GraphNode<T> {

	private boolean visited;
	
	private T data;

	public GraphNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GraphNode(T data,boolean visited) {
		super();
		this.visited = visited;
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
