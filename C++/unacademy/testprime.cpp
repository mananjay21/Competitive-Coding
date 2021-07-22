#include<iostream>
using namespace std;
int main()
{
    int lowerlimit,upperlimit;
    cout<<"enter a number to check  prime or not "<<endl;
    cout<<"Enter tne lower limit "<<endl;
    cin>>lowerlimit;
    cout<<"Enter tne Upper limit "<<endl;
    cin>>upperlimit;

    
    for(int i=lowerlimit;i<=upperlimit;i++)
    {
        int c=0,d=0;
        for(int j=1;j<=lowerlimit;j++)
        {
            if(lowerlimit%j==0)
            {  
                c++;
            }
            if(lowerlimit%j!=0)
            {
                d++;
            }
        }
        if(c==2)
        {
            cout<<i<<" ";
        }

    }
    return 0;
}
