#include<bits/stdc++.h>
using namespace std;
int main()
{
	int item;
	cin>>item;
	
	int price_list[item],distance[item],Sqm[item];
	
	for(int i=0;i<item;i++)
	cin>>price_list[i];	
	
	for(int i=0;i<item;i++)
	cin>>distance[i];
	
	for(int i=0;i<item;i++)
	cin>>Sqm[i];
	
	int final[item],count=0;
	
	for(int j=0;j<item;j++)
	{
		if(Sqm[j]>0)
		{
			final[count]=price_list[j]*distance[j];
			count++;
		}
	}
	for(int i=0;i<count;i++)
	{
		cout<<final[i]<<" ";
	}
	
	
	return 0;
	
}
