#include<iostream>
using namespace std;
int funct(int a, int c,int b=10)
{
    return a+b+c;

}
int main()
{
    //int a;
    //cin>>a;
    cout<<funct(5,10)<<endl;
    cout<<funct(5,5,5)<<endl;
    cout<<funct(5,5)<<endl;
    cout<<funct(10,10);
    return 0;

}