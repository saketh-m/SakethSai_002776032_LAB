/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2;

/**
 *
 * @author saketh
 */
public class Question2 {
    public static void parttwo(int arr[])
{
    for (int i = 0; i < arr.length; i++) {
    if (i % 2 == 0) {
      arr[i]= arr[i] * 2;
     } else {
       arr[i]= arr[i] * 3;
     }
   }  
  }
 
public static void main(String[] args){
   int arr[]= {4,8,13,25,32};
   parttwo(arr);
   System.out.println("The elements in array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" "+"\n");  
        }
}
}

