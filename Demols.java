//Declaring class Demols
public class Demols {
   //declaring a method linearsearch with parameters array list and key value
   
   public static int linearsearch(int[] arr,int key){
       
       //traversing  through the list 
       //arr.length gives the length of the array
       //i traverses through each index in the list
        for (int i=0;i<arr.length;i++){
           
           //if the element in the list and key matches , it will return the index number.
           if (arr[i]==key){
                return i;
            }
        }
        //if doesnot match ,it will return the index -1
        return -1;
    }
    
    //declaring main method
    public static void main(String args[]){
        //declarin the list
        int a1[]={ 10,20,30,40,50,70};
        //key value to search
        int key =90;
        //callling the method with passing the values
       int x=linearsearch(a1,key);
       //checking the cases and displaying the result
       //if index return -1 no element is found 
       //if condition fails it goes to else and prints the position of the string.
       if(x==-1){
           System.out.println("no key found");
       }else{
           System.out.println(key+"is found at the index"+x);
       }
        
    }
}