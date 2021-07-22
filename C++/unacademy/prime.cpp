#include<iostream>
using namespace std;

int main()
{
    int n,c=0;
    cout<<"enter";
    cin>>n;

    for(int i=0;i<=n;i++)
    {
        if(i%n==0)
        {
            c++;
            cout<<n%i;

        }
    }
    if(c==2)
    {
        cout<<"prime nummber";
    }
    else{
        cout<<"non prime number ";
    }

return 0;

}