#include<iostream>
using namespace std;
void insertionsort(int arr[],int n)
{
    for(int i=1;i<n;i++)
    {
        int current= arr[i];
        int j=i-1;
        while(arr[j]>current && j>=0)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;

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
    int n;
    cout<<"Enter number element in array"<<endl;
    cin>>n;
    int arr[n];
    cout<<"enter elements in array"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    
    insertionsort(arr,n);
    return 0;
}