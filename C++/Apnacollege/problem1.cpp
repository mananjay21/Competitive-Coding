#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n,p,s=0,count=0;
	cin>>n;
	int m=n;
	
	while(n>0)
	{
	  p=n%10;
	  //cout<<p<<endl;
	  if(n%p==0)
	  {
	      s=s+p;
	      //cout<<s<<endl;
	  }
	  else
	  {
	      count++;
	  }
	  n=n/10;
	}
	if(count==0)
	  {
	      cout<<m/s<<endl;
	  }
	  else
	  {
	      cout<<"kuch nahi mila ";
	  }
	
	
	return 0;
}

