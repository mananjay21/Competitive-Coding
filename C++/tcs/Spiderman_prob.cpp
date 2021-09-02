#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	int count=1;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
	    cin>>arr[i];
	}
	for(int j=0;j<n;j++)
	{
	    if(arr[j]<=arr[j-1])
	    {
	        
	        count=count+1;
	    }
	    else
	    {
	     count=count+2; 
	     
	    }
	}
	cout<<count;
	return 0;
}

