#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,num;
    cout<<"Enter max number elements "<<endl;
    cin>>num;
    //cin>>n;

    int i=-2;
    int j=-1;
    while(num>0)
    {
        i=i+2;
        cout<<i<<" ";
        j=j+1;
        cout<<j<<" ";
        num--;
        
    }
    return 0;
}