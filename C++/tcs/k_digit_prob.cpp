#include <iostream>
#include<math.h>
using namespace std;
int main() {
	// your code goes here
	int num1,num2;
	cin>>num1>>num2;
	int mult=pow(num1,num2);
	int k,p=0,num=0;
	cin>>k;
	while(mult>0)
	{
	    num=mult%10;
	    mult=mult/10;
	    p++;
	    if(p==k)
	    cout<<num;
	}
	return 0;
}

