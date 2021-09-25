#include <bits/stdc++.h>
using namespace std;

int main() {
    int n,m,val=0;
    int i=0;
    cin>>n;
    while (n>0)
    {
       m=n%10;
       
       if(m%2==0)
       {
           m=m+1;
       }
       else
       {
            m=m-1;
       }
       //cout<<m<<endl;
       val=val+m*pow(10,i);
       i++;
       n=n/10;
    }
    cout<<val;

	return 0;
}

