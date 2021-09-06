//5 9 8 7 6 
//5 6 7 8 9
#include<bits/stdc++.h>
using namespace std;
int main()
{
    cout<<"Bubble sort"<<endl;
    //for taking input..
    int n;
    cout<<"Enter the number of Elements "<<endl;
    cin>>n;
    int arr[n],temp;
    cout<<"Enter the values"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    //now logic for bubble sort.......
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        
    }
    //now for printitng output.............
    for(int j=0;j<n;j++)
    {
        cout<<arr[j]<<" ";
    }
    return 0;
}