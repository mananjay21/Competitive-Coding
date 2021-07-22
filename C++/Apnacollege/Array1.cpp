#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    //for taking input...
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    // now for calculating maximum age ....
    //and for minimum age ...
    int maxnum=0;
    int minnum=0;

    for(int i=0;i<n;i++)
    {
       maxnum=max(maxnum,arr[i]); 
       minnum = min(minnum,arr[i]);
    }
    cout<<"maximum age of rahul girlfriend="<<maxnum;
    cout<<"minimum age of rahul girlfriend= "<<minnum;


}