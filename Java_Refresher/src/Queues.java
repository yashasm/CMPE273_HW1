
public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndirectedGraph graph = new UndirectedGraph(6);
		graph.addVertices("Tom",0);
		graph.addVertices("Luffy",1);
		graph.addVertices("John",2);
		graph.addVertices("Steve",3);
		graph.addVertices("Yashas",4);
		graph.addVertices("Emma",5);
		
		graph.addEdges("Tom", "Luffy");
		graph.addEdges("Luffy", "Steve");
		graph.addEdges("Tom", "Steve");
		graph.addEdges("Yashas", "Emma");
		graph.addEdges("Yashas", "Steve");
		
		if(graph.search("Tom", "John")){
			System.out.println("Present in your friends list");
		}
		else{
			System.out.println("No link");
		}
		//System.out.println("Order of compilation :");


	}

}
