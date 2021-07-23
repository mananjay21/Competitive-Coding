#include<iostream>
using namespace std;
int main()
{
    int n,k,sold;
    cout<<"Enter total number of candies :- "<<endl;
    cin>>n;
    int c=n;
    cout<<"Enter minimum number of candies:- "<<endl;
    cin>>k;
    cout<<"Enter number of candies sold:"<<endl;
    cin>>sold;
    while(n<=k)
    {
        n=c;
    }
    cout<<"number of candies sold:- "<<sold<<endl;
    cout<<"Number of candies available:- "<<n-sold<<endl;
    return 0;
}