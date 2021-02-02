//Declaring class Test
class Test 
{ 
     
       
     static int recSearch(int arr[], int start, int end, int search) 
     { //checking the array end value is greater than start, if condition satisfies returns -1
          if (end < start) 
             return -1; 
		 //checking if the key is found at start of the array, if condition satisfies returns start
          if (arr[start] == search) 
             return start; 
		 
		 //checking if the key is found at end of the array, if condition satisfies returns end value
          if (arr[end] == search) 
             return end; 
		 //calling the recursion function here 
          return recSearch(arr, start+1, end-1, search); 
     } 
       
     //declaring main method
     public static void main(String[] args)  
     { //declarin the list
     int arr[] = {12, 34, 54, 2, 3}; 
        //key value to search
		int search = 12;  
		//assigning start value
          int start =0;
		  //length of the array
		int end =arr.length-1;
        //calling the function with passging the parameters array list,start value ,end and search key
        int index = recSearch(arr, start,end, search); 
		//if the index returns -1 no element is found otherwise element is displayed at specified position
        if (index != -1) 
           System.out.println("Element " + search + " is present at index " +  
                                                    index); 
        else
            System.out.println("Element " + search + " is not present"); 
        } 
 } 