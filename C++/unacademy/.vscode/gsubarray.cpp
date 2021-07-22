#include<iostream>
using namespace std;
int main ()
{
    
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
    
        int ans=2;
        int cd=arr[1]-arr[0];
        int counter=2;
        int j=2;
        while(j<n)
        {
            if(cd==arr[j]-arr[j-1])
            {
                counter++;
            
            }
            else
            {
                cd=arr[j]-arr[j-1];
                counter=2;
            }
            ans=max(ans,counter);
            j++;    
        }
        cout<<ans;
    
    return 0;
}