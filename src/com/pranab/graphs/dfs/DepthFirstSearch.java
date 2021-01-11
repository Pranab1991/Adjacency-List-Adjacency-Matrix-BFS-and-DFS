package com.pranab.graphs.dfs;

import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

import com.pranab.graphs.GraphNode;

public class DepthFirstSearch<T> {

	public void search(Map<GraphNode<T>,LinkedList<GraphNode<T>>> graphData,GraphNode<T> start) {
		Stack<GraphNode<T>> stack=new Stack<>();
		start.setVisited(true);
		System.out.print(start.getData()+", ");
		stack.push(start);
		while(!stack.isEmpty()) {
			int totalOutGoing=graphData.get(stack.peek()).size(),totalVisited=0;
			for(GraphNode<T> node:graphData.get(stack.peek())) {
				if(!node.isVisited()) {
					node.setVisited(true);
					System.out.print(node.getData()+", ");
					stack.push(node);
					break;
				}else {
					totalVisited++;
				}
			}
			if(totalVisited==totalOutGoing) {
				stack.pop();
			}
		}
	}
	
	public void searchRecurssion(Map<GraphNode<T>,LinkedList<GraphNode<T>>> graphData,GraphNode<T> start) {
		LinkedList<GraphNode<T>> linkedNodes=graphData.get(start);
		start.setVisited(true);
		System.out.print(start.getData()+", ");
		for(GraphNode<T> node:linkedNodes) {
			if(!node.isVisited()) {				
				searchRecurssion(graphData,node);
			}
		}
	}
	
	
}
