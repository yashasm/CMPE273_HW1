import java.util.ArrayList;
import java.util.LinkedList;


public class UndirectedGraph {
	String names[];
	ArrayList<LinkedList<String>> adj;
	int V;
	
	UndirectedGraph(int v){
		V = v;
		names = new String[v];
		adj = new ArrayList<LinkedList<String>>();
		for(int i=0;i<v;i++){
			adj.add(new LinkedList<String>());
		}
						
	}
	
	public int getIndex(String name){
		for(int i=0;i<V;i++){
			if(name.equals(names[i])){
				return i;
			}
		}
		return -1;
	}	
	
	public void addVertices(String name, int index){
		names[index] = name;
	}
	
	public void addEdges(String name1, String name2){
		int index1 = getIndex(name1);
		int index2 = getIndex(name2);
		adj.get(index1).add(name2);
		adj.get(index2).add(name1);
	}
	
	public boolean search(String name1, String name2){
		if(name1.equals(name2)){
			return true;
		}
		
		LinkedList<String> queue = new LinkedList<String>();
		boolean visited[] = new boolean[V];
		
		queue.add(name1);
		int index = getIndex(name1);
		visited[index] = true;
		String test;
		while(!queue.isEmpty()){
			test = queue.removeFirst();
			if(test != null){
				int index1 = getIndex(test);
				for(String v: adj.get(index1)){
					int index2 = getIndex(v);
					if(!visited[index2]){
						if(v.equals(name2)){
							return true;
						}
						else{
							visited[index2] = true;
							queue.add(v);
						}
					}
				}
			}
		}
		
		return false;
	}
		
}
