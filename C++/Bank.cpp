#include <iostream>
#include <math.h>
using namespace std;

int main(int argc, char **argv)
{
	cout<<"welcome\n";
	double principal,emi,a,sum;
	int tenure;
	int bank[5];
	
	cout<<"enter the value of  principal and tenure\n";
	cin>>principal;
	cin>>tenure;
	
	//code for bank ....
	for(int i=0;i<2;i++)
	{
		int n=0;
		sum=0;
		cout<<"enter the value of slab\n";
		cin>>n;//slab of interest
		cout<<"enter the value of intrate & period\n";
		double inrate;
		int period;
		
		for(int j=0;j<n;j++)
		{
			cin>>period;
			cin>>inrate;
			a=pow((1+inrate),(period*12));
			
			emi=(principal*inrate)/(1-1/a);
			//cout<<"emi after first iteration\n";
			int sum=sum+emi;
			
		}
		bank[i]=sum;
		cout<<sum;
	}
	if(bank[0]<bank[1])
	{
		cout<<"Bank A";
	}
	else
	{
		cout<<"Bank B";
	}
	return 0;
}


