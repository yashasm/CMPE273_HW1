import java.util.HashMap;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dataSet = new HashMap<String, String>();

 
        dataSet.put("Austin", "New york");
        dataSet.put("Dallas", "Washington");
        dataSet.put("San Jose", "Austin");
        dataSet.put("New york", "Dallas");
        
        printResult(dataSet);

	}
	
	
    private static void printResult(Map<String, String> dataSet)
    {
        
        Map<String, String> reverseMap = new HashMap<String, String>();
 
        
        for (Map.Entry<String,String> entry: dataSet.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());
 
        
        String start = null;
        for (Map.Entry<String,String> entry: dataSet.entrySet())
        {
              if (!reverseMap.containsKey(entry.getKey()))
              {
                   start = entry.getKey();
                   break;
              }
        }
 
        
        if (start == null)
        {
           System.out.println("Invalid Input");
           return;
        }
 

        String to = dataSet.get(start);
        while (to != null)
        {
            System.out.print(start +  "->" + to + ", ");
            start = to;
            to = dataSet.get(to);
        }
    }
}


