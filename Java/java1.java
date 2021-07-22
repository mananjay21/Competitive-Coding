//program for reversing a number ...............
import java.util.*;

//import javax.swing.plaf.synth.SynthEditorPaneUI;

//import java.lang.*;

public class java1 {
    public void Reverse()
    {
        for(int i=num-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println("Reverse the array");
        Scanner sc=new Scanner(System.in);
        //taking input num for no. of elements 
    int num=sc.nextInt();
    int arr[] = new int[num];
    System.out.println("number: "+num);//taking input scessfully....
    //now taking total no  foe elements as input
    
    for(int i=0;i<num;i++)
    {
        arr[i]=sc.nextInt();
    }
    // for printing the value in forward direction ....
    System.out.println("normal form number :- ");
    
    for(int i=0;i<num;i++)
    {
        System.out.print(arr[i]+" ");
    }
    //System.out.println(arr[2]);
    //for print in reverse form ...
    System.out.println("");
    System.out.println("Reverse form :- ");
    java1 obj= new java1();
    obj.Reverse();
    
    
    sc.close();    
    }
    
}
