
public class MergeString {
	
	public static String merge(String a, String b){
		String temp="";
		
		int aLength = a.length();
		int bLength = b.length();
		int loopLength = aLength > bLength ? aLength : bLength;
		
		for(int i=0;i<loopLength;i++){
			if(i< aLength){
				temp = temp+a.charAt(i);
			}
			if(i< bLength){
				temp = temp+b.charAt(i);
			}
		}
		
		return temp;
	}
	
	public static int balance(int[] a){
		int right = 0;
		int left = 0;
		
		
		
		for(int i =0;i<a.length;i++){
			right += a[i];
		}
		
		for(int i=0;i<a.length;i++){
			right = right - a[i];
			if(left == right){
				return i;
			}
			left = left + a[i];
			
		}
		
		return 0;
	}
	
	public static int bitGame(int n,int k){
		int a = k-1;
		int b = n;
		int maxLen = 0; 
		
		for(int i = b;i>0;i--){
			if((a&i)<k){
				if((a&i) > maxLen){
					maxLen = a&i;
				}
			}
		}			
		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(merge("ab","def"));
		//int[] arr = {1,2,3,3};
		//System.out.println(balance(arr));
		System.out.println(bitGame(4,2));
	}

}

Public class Point2D{
	protected int x;
	protected int y;
	
	point2D(int x, int y){
		this.x = x;
		this.y = y;		
	}
	
	public double dist2D(Point2D p){
		return Math.sqrt(((p.x - x)*(p.x - x)) + ((p.y - y)*(p.y - y)));
	}
	
	public void printDistance(double d){
		System.out.println("2D distance = "+ Math.ceil(d));
	}
}

Public class Point3D extends Point2D{
	int z;
	
	point3D(int x, int y,int y){
		super(x,y);
		this.z = z;		
	}
	
	public double dist3D(Point3D p){
		return Math.sqrt(((p.x - x)*(p.x - x)) + ((p.y - y)*(p.y - y))++ ((p.z - z)*(p.z - z)));
	}
	
	public void printDistance(double d){
		System.out.println("3D distance = "+ Math.ceil(d));
	}
}

public class Subsequence {
	
	public static ArrayList<String> getSub(String input){
		ArrayList<String> result = new ArrayList();
		
		int opCount = (int) Math.pow(2, input.length());
		int stringLength = input.length();
		
		String temp = "";
		for(int counter=1;counter < opCount; counter++){
			temp = "";
			for (int j = 0; j < stringLength;j++ ){				
				if((counter & (1 << j)) != 0 ){
					temp = temp + input.charAt(j);
				}								
			}			
			result.add(temp);			
		}		
		return result;
	}

	public static void main(String[] args) {
		System.out.println("start");
		ArrayList<String> result = new ArrayList();
		result = getSub("abc");
		Collections.sort(result);
		for(int i = 0;i<result.size(); i ++){
			System.out.println(result.get(i));
		}
	}

}


SubArray:

package subsequence;
import java.util.*;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> result = new ArrayList();
		/*result.add(1);
		result.add(2);
		result.add(3);*/
		
		result.add(3);
		result.add(1);
		result.add(2);
		result.add(1);
		
		int maxSum = 4;
		int arraySize = 4;
		int maxLength = Integer.MIN_VALUE;
		int sum = Integer.MIN_VALUE;
		
		for(int i = 0; i< arraySize;i++){
			for(int j = i; j< arraySize;j++){
				sum = 0;
				for(int k =i; k<=j;k++){
					System.out.print(result.get(k));
					sum += result.get(k);
				}
				System.out.println("");
				//System.out.println("diff"+(j-i+1));
				//System.out.println("sum"+sum);
				if((sum <= maxSum) && ((j-i +1)> maxLength)){
					
					
				maxLength = j -i+1;
				//System.out.println("inside"+maxLength);
				}
				
			}						
		}
		
		System.out.println(maxLength);
	}
	

}

----------------------

/*
 * Complete the function below.
 */
    public static class TreeNode{
        int data;
        TreeNode left,right;

        TreeNode(int data){
            this.data = data;
            left = right = null;
        }

    }
    
    static int counter = 0;

    static void createBST(int[] keys) {
        
        TreeNode root = null;
        for  (int key : keys){
            if (root != null){
                insert(root,key);
            }
            else {
                root = new TreeNode(key);
            }
            
            System.out.println(counter);
        }

    }

static void insert(TreeNode root, int key){
    counter++;
    
    if(key < root.data){
        if(root.left == null ){
            root.left = new TreeNode(key);
        }
        else{
            insert(root.left,key);
        }
    }
    else{
        if(root.right == null ){
            root.right = new TreeNode(key);
        }
        else{
            insert(root.right,key);
        }
    }
}
----------------

public static void permutation(String str) { 
    permutation("", str); 
}

private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}