#include<iostream>
#include<climits>
using namespace std;
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
    int key=INT_MIN;
    for(int i=0;i<n;i++)
    {
         key=max(key,arr[i]);
    }
    cout<<key<<endl;
    return 0;
}