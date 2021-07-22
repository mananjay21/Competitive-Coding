#include<iostream>
using namespace std;
int main()
{
    cout<<"Enter the number of element in array "<<endl;
    int n;
    cin>>n;
    int arr[n];
    cout<<"enter the elemnet of array "<<endl;
    for (int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"sum of subarray"<<endl;
    int count=0;
    for(int i=0;i<n;i++)
    {
        count=0;
        for(int j=i;j<n;j++)
        {
            count+=arr[j];
            cout<<count<<endl;
        }
    }
    return 0;
}