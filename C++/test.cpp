/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter a number to check the number is special number or  not :-";
    cin>>n;
    int fact=1;
    while(n>0)
    {
        n=n%10;
        cout<<n;
    }

    return 0;
}
