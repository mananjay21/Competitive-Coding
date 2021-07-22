//WAP to check whether the given string is vowel or not ;

#include<iostream>
#include<string>
using namespace std;
int vowel_st(string s)
{
    int i=0;
    int ans=0;
    while(s[i]!='\0')
    {
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
            ans++;
        i++;        
    }
    return ans;
}

int main()
{
    string str;
    std::cin>>str; 
    cout<<vowel_st(str);

    return 0;
}