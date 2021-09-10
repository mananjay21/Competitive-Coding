#include<bits/stdc++.h>
using namespace std ;
int main()
{
	int n;
	int small,large;
	
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	large = arr[0];
    small = arr[0];
    
    for(int i=1; i<n; i++)
    {
    
        if(arr[i] > large)
            large = arr[i];
        if(arr[i] < small)
            small = arr[i];
    }
    cout<<small<<" "<<large;
    
return 0;	
}
