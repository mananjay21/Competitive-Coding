#include<iostream>
using namespace std;
void bubbleSearch(int arr[],int n)
{
    int counter=1;
    for(int i=0;i<n-1;i++)
    //while(counter<n)
    {
        for(int i=0;i<n-counter;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        counter++;

    }
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
 return;   
}

int main()
{
    int n,key;
    cout<<"Enter number element in array"<<endl;
    cin>>n;
    int arr[n];
    cout<<"enter elements in array"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    
    bubbleSearch(arr,n);
    return 0;
}