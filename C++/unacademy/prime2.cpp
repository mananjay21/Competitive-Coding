#include<iostream>
using namespace std;
int display(int j)
{
    cout<<j<<" ";
    return j;
}
int primenum(int j)
{
    int n=j;
    int c=0;
    for(int i=1;i<=n;i++)
    {
        //if(i%n==0)

        if(n%i==0)
        {c++;
        }
    }
    if(c==2)
    {
        display(j);
    }
    
    return j;
    
}
int numsend(int lowerlimit,int upperlimit)
{
    for(int i=lowerlimit;i<=upperlimit;i++)
    {
        primenum(i);
    }
    
    return 0;

}
int main()
{

    int lowerlimit,upperlimit;
    cout<<"enter a number to check  prime or not "<<endl;
    cout<<"Enter tne lower limit "<<endl;
    cin>>lowerlimit;
    cout<<"Enter tne Upper limit "<<endl;
    cin>>upperlimit;

    numsend(lowerlimit,upperlimit);
    return 0;
}