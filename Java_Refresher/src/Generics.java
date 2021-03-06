
public class Generics
{
   // generic method printArray                         
   public static < E > void printReverse( E[] inputArray )
   {
      
         for(int i=(inputArray.length-1);i>=0;i--){
        	 System.out.print( " "+inputArray[i] );
         }
         System.out.println();
    }
   
   public static < E > void printArray( E[] inputArray )
   {
                    
         for ( E element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         
         System.out.println();
    }

    public static void main( String args[] )
    {
      
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        String[] stringArray ={"yashas","emma","naruto","keerthi"};

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); 
        System.out.println( "Array integerArray after reverse:" );
        printReverse( intArray  ); 

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); 
        System.out.println( "Array doubleArray after reverse:" );
        printReverse( doubleArray  );

        System.out.println( "\nArray stringArray contains:" );
        printArray( stringArray ); 
        System.out.println( "Array stringArray after reverse:" );
        printReverse( stringArray  );
    } 
}