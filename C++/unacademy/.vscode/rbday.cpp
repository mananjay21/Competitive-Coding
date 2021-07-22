#include<iostream>
#include<climits>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    
    if(n==1)
    {
        cout<<"1"<<endl;
        return 0;
    }
    int m=INT_MIN;
    int ans=0;
    arr[n]=-1;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>m && arr[i]>arr[i+1])
        {
            ans++;
        }
        m=max(m,arr[i]);  
    }
    cout<<ans;
    return 0;

}