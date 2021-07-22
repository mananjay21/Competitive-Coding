//write a function to check string is palindrom or not .
#include<iostream>
#include<string>
using namespace std;
string is_palindrom(string s)
{
    int i=0;
    int l= s.length();
    for(i=0;i<l;i++)
    {
        if(s[i]!=s[l-1])
        {
            return "false";
        }
        else{
            l=l-1;
        }
    }
    return "true";
}
int main()
{
    string str;
    int i=0;
    std::cin>>str;
    std::cout<<is_palindrom(str);
    return 0;
}