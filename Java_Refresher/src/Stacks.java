
import java.util.*;

public class Stacks {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	A
		/\
	   B  C
	  /\
	 D  F
	/
	E*/
				
		Graph graph = new Graph(6);
		graph.addVertices("package A",0);
		graph.addVertices("package B",1);
		graph.addVertices("package C",2);
		graph.addVertices("package D",3);
		graph.addVertices("package E",4);
		graph.addVertices("package F",5);
		
		graph.addEdges("package E", "package D");
		graph.addEdges("package D", "package B");
		graph.addEdges("package F", "package B");
		graph.addEdges("package B", "package A");
		graph.addEdges("package C", "package A");
		
		/*if(graph.search("package A", "package X")){
			System.out.println("There is a link");
		}
		else{
			System.out.println("No link");
		}*/
		System.out.println("Order of compilation :");
		
		graph.topologoical();
		
	}

}
