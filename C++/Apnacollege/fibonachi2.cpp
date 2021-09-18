#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	int a=0;int b=1;
		cin>>n;
	cout<<a<<" "<<b<<" ";
	int c;

	for(int i=0;i<n;i++)
	{
		c=a+b;
		cout<<c<<" ";
		a=b;
		b=c;
		
	}
	return 0;
}
