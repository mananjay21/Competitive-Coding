#include<iostream>
using namespace std;
int lsearch(int arr[],int n, int key)
{
    for(int i=0;i<n;i++)
    {
        if(key==arr[i])
        {
            return i;
        }
       
    }
    return -1;
}

int main()
{
    int n,key;
    cout<<"Enter the size of array"<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the elements in array"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter the value of key that  we need to Search "<<endl;
    cin>>key;
    cout<<lsearch(arr,n,key)<<endl;
    
    return 0;


}