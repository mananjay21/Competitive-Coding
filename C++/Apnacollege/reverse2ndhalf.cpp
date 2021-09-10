#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,m;
cin>>n;
int arr[n];
int arr1[n];
for(int i=0;i<n;i++)	
{
	cin>>arr[i];
}
//for reversing 2nd half of an array 
m=n;
for(int i=0;i<n;i++)
{
	
	if(i<=n/2)
	{
		arr1[i]=arr[i];
	}
	else
	{
		arr1[i]=arr[m];
			m--;
		/*for(int j=n;j>n/2;j--)
		{
			
		}*/
	}	
}
for(int i=0;i<n;i++)
{
	cout<<arr1[i]<<" ";
}
return 0;	
}
