#include<iostream.h>

void main()
{
    int n,c;
    cin>>n;

    for(i=0;i<=n;i++)
{
    if(n%i==0)
    {
        c++;
    }
    else
    {
        n++;
    }
}
cout<<n;

}
