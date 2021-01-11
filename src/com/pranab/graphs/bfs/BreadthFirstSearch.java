package com.pranab.graphs.bfs;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.pranab.graphs.GraphNode;

public class BreadthFirstSearch<T> {

	public void search(Map<GraphNode<T>,LinkedList<GraphNode<T>>> graphData,GraphNode<T> start) {
		Queue<GraphNode<T>> queue=new LinkedList<>();
		start.setVisited(true);
		System.out.print(start.getData()+", ");
		queue.offer(start);
		while(queue.peek()!=null) {
			for(GraphNode<T> node:graphData.get(queue.poll())){
				if(!node.isVisited()) {
					node.setVisited(true);
					System.out.print(node.getData()+", ");
					queue.offer(node);
				}
			}
		}
	}
	
	public void searchMatrix(boolean[][] graph,int startIndex,Map<Integer,GraphNode<Integer>> nodeDictionary) {
		Queue<Integer> queue=new LinkedList<>();
		int nodesCount=graph.length;
		GraphNode<Integer> node=nodeDictionary.get(startIndex);
		System.out.print(node.getData()+", ");
		node.setVisited(true);
		queue.offer(startIndex);
		while(queue.peek()!=null) {
			int i=queue.poll();
			for(int j=0;j<nodesCount;j++) {
				if(graph[i][j]) {
					GraphNode<Integer> nodeData=nodeDictionary.get(j);
					if(!nodeData.isVisited()) {
						queue.offer(j);
						nodeData.setVisited(true);
						System.out.print(nodeData.getData()+", ");
					}
				}
			}
		}
	}
}
