#include<iostream>
#include<climits>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the no of elemnet in arrar "<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the element in array"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int maxNo=INT_MIN;
    int minNo=INT_MAX;
    //int maxNo=0;
    //int minNo=0;
    cout<<"output"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    for(int i=0;i<n;i++)
    {
        maxNo=max(maxNo,arr[i]);
        minNo=min(minNo,arr[i]);
    }
    cout<<endl<<"maximum value "<<maxNo;
    cout<<endl<<"minimum value "<<minNo;
    return 0;
}