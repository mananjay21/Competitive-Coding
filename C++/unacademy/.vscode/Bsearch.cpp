#include<iostream>
#include<algorithm>
using namespace std;

int binarySearch(int arr[],int n,int key)
{
    int start=0;
    int end=n;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]>key)
        {
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;
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
    /*sort(arr,arr+n);
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }*/
    cout<<"enter the value of key" <<endl;
    cin>>key;
    cout<<binarySearch(arr,n,key);
    return 0;
}