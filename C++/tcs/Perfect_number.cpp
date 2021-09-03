#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int num1,num2;
	cin>>num1>>num2;
	int count=0,sum=0,temp=0;
	for(int i=num1;i<=num2;i++)
	{
	    for(int j=1;j<i;j++)
	    {
	        if(i%j==0)
	        {
	            count++;
	            sum=sum+j;
	            
	        }
	    }
	    //cout<<endl;
	    temp=sum;
	    sum=0;
	    if(temp==i)
	    {
	        cout<<"Perfect nummber" <<i<<endl;
	        //cout<<27%10;
	    }
	    else
	    {
	        //cout<<"not perfect"<<endl;
	    }
	}
	return 0;
}

