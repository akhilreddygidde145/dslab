//Declaring class Test
public class Main {
public static void findRecursively(int arr[],int start,int end,int search)
{
	//checking the array end value is greater than start, if condition satisfies returns -1
if(start >end) {
return ;
}
//calculating the mid value 
int mid =(start+end)/2;
//if mid value is key to search then printing the mid and index  value and returns
if(arr[mid]==search) {
System.out.println("Element " + search + " is present at index " +  
                                                    mid);
return;
}
//if search greater than mid , increment the mid value and recall the function 
else if(search >arr[mid] ) {
findRecursively(arr,mid+1,end,search);
}else{
	
// else decrement the mid value and recall the function 
findRecursively(arr,start,mid-1,search);}
}
//declaring main method
public static void main(String[] args) {
	//declarin the list
int arr[]= { 10,12,14,15,16,20};
 //key value to search
int search =23;
//assigning start value
int start =0;
//length of the array
int end =arr.length-1;
 //calling the function with passging the parameters array list,start value ,end and search key
findRecursively(arr,start,end,search);


}}

