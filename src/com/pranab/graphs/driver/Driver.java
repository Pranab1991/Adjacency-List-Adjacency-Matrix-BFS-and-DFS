package com.pranab.graphs.driver;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.pranab.graphs.Graph;
import com.pranab.graphs.GraphMatrix;
import com.pranab.graphs.GraphNode;
import com.pranab.graphs.bfs.BreadthFirstSearch;
import com.pranab.graphs.dfs.DepthFirstSearch;

public class Driver {

	public static void main(String[] args) {
		/*Graph<Integer> graph=new Graph<>();
		Map<GraphNode<Integer>,LinkedList<GraphNode<Integer>>> graphAdjcentList=graph.getGraph();
		GraphNode<Integer> node0=new GraphNode<>(0,false);
		GraphNode<Integer> node1=new GraphNode<>(1,false);
		GraphNode<Integer> node2=new GraphNode<>(2,false);
		GraphNode<Integer> node3=new GraphNode<>(3,false);
		GraphNode<Integer> node4=new GraphNode<>(4,false);
		GraphNode<Integer> node5=new GraphNode<>(5,false);
		GraphNode<Integer> node6=new GraphNode<>(6,false);
		GraphNode<Integer> node7=new GraphNode<>(7,false);
		GraphNode<Integer> node8=new GraphNode<>(8,false);
		GraphNode<Integer> node9=new GraphNode<>(9,false);
		LinkedList<GraphNode<Integer>> node0List=new LinkedList<>();
		node0List.addFirst(node2);
		node0List.addFirst(node3);
		node0List.addFirst(node7);
		node0List.addFirst(node9);
		LinkedList<GraphNode<Integer>> node1List=new LinkedList<>();
		node1List.addFirst(node4);
		node1List.addFirst(node6);
		node1List.addFirst(node2);
		node1List.addFirst(node7);
		LinkedList<GraphNode<Integer>> node2List=new LinkedList<>();
		node2List.addFirst(node1);
		node2List.addFirst(node6);
		node2List.addFirst(node5);
		node2List.addFirst(node7);
		node2List.addFirst(node0);
		LinkedList<GraphNode<Integer>> node4List=new LinkedList<>();
		node4List.addFirst(node8);
		node4List.addFirst(node5);
		node4List.addFirst(node6);
		node4List.addFirst(node1);
		LinkedList<GraphNode<Integer>> node5List=new LinkedList<>();
		node5List.addFirst(node6);
		node5List.addFirst(node4);
		node5List.addFirst(node8);
		node5List.addFirst(node9);
		node5List.addFirst(node2);
		LinkedList<GraphNode<Integer>> node6List=new LinkedList<>();
		node6List.addFirst(node1);
		node6List.addFirst(node2);
		node6List.addFirst(node4);
		node6List.addFirst(node5);
		LinkedList<GraphNode<Integer>> node7List=new LinkedList<>();
		node7List.addFirst(node0);
		node7List.addFirst(node1);
		node7List.addFirst(node2);
		node7List.addFirst(node3);
		LinkedList<GraphNode<Integer>> node8List=new LinkedList<>();
		node8List.addFirst(node4);
		node8List.addFirst(node5);
		node8List.addFirst(node9);
		LinkedList<GraphNode<Integer>> node9List=new LinkedList<>();
		node9List.addFirst(node0);
		node9List.addFirst(node5);
		node9List.addFirst(node8);
		LinkedList<GraphNode<Integer>> node3List=new LinkedList<>();
		node3List.addFirst(node0);
		node3List.addFirst(node7);
		graphAdjcentList.put(node0,node0List);
		graphAdjcentList.put(node1,node1List);
		graphAdjcentList.put(node2,node2List);
		graphAdjcentList.put(node4,node4List);
		graphAdjcentList.put(node5,node5List);
		graphAdjcentList.put(node6,node6List);
		graphAdjcentList.put(node7,node7List);
		graphAdjcentList.put(node8,node8List);
		graphAdjcentList.put(node9,node9List);
		graphAdjcentList.put(node3,node3List);
		//BreadthFirstSearch<Integer> bfs=new BreadthFirstSearch<>();
		//bfs.search(graph.getGraph(), node3);
		DepthFirstSearch<Integer> dfs=new DepthFirstSearch<>();
		//dfs.search(graph.getGraph(), node3);
		dfs.searchRecurssion(graph.getGraph(), node3);*/
		matrix_rep_traversal();
	}
	
	public static void matrix_rep_traversal() {
		Map<Integer,GraphNode<Integer>> nodeDictionary=new HashMap<>();
		nodeDictionary.put(0,new GraphNode<>(0,false));
		nodeDictionary.put(1,new GraphNode<>(1,false));
		nodeDictionary.put(2,new GraphNode<>(2,false));
		nodeDictionary.put(3,new GraphNode<>(3,false));
		nodeDictionary.put(4,new GraphNode<>(4,false));
		nodeDictionary.put(5,new GraphNode<>(5,false));
		nodeDictionary.put(6,new GraphNode<>(6,false));
		nodeDictionary.put(7,new GraphNode<>(7,false));
		nodeDictionary.put(8,new GraphNode<>(8,false));
		nodeDictionary.put(9,new GraphNode<>(9,false));
		//GraphMatrix gmatrix=new GraphMatrix();
		//boolean[][] matrix=gmatrix.getMatrix(10);
		boolean[][] matrix= {{false,false,true,true,false,false,false,true,false,true},
							 {false,false,true,false,true,false,true,true,false,false},
							 {true,true,false,false,false,true,true,true,false,false},
							 {true,false,false,false,false,false,false,true,false,false},
							 {false,true,false,false,false,true,true,false,true,false},
							 {false,false,true,false,true,false,true,false,true,true},
							 {false,true,true,false,true,true,false,false,false,false},
							 {true,true,true,true,false,false,false,false,false,false},
							 {false,false,false,false,true,true,false,false,false,true},
							 {true,false,false,false,false,true,false,false,true,false}};
		BreadthFirstSearch<Integer> bfs=new BreadthFirstSearch<>();
		bfs.searchMatrix(matrix,3, nodeDictionary);
	} 
}
