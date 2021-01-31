//Declaring class Demobs
public class Demobs{
 //declaring a method binarysearch with parameters array list ,first index,last index and key value
    public static void binarySearch(int arr[],int first,int last,int key)
    {
        //finding the middle element from the list and storing inthe mid
        int mid=(first +last)/2;
        //looping through the list, checking the condition 
        while(first<=last){
            //if middle value is greater than the key, change the first value 0 to 4(here)
            if(arr[mid]<key) {
                first=mid+1;
            }
            //if above condition fails,then drops to else if.
            //if element matches then it prints the index number with message and break the loop
            else if (arr[mid]==key){
                System.out.println("Element is found at index"+mid);
                break;
            }
            //if both the condiftion fails and drops to else condition
            //changees the last value to 2 in this case
            else{
                last=mid-1;
                
            }
            //acoording above cases the first and last value are again averaged and loop repeats
            mid=(first+last)/2;
            }
            //if condition satisfies,no elements
            if(first>last){
                System.out.println("Element not found");
            }
        }
        //declaring main method
        public static void main(String args[]){
            //declarin the list
            int arr[]={10,20,30,40,50};
             //key value to search
            int key = 30;
            //length of the array
            int last=arr.length-1;
            //calling the method
            binarySearch(arr,0,last,key);
        
    }
}