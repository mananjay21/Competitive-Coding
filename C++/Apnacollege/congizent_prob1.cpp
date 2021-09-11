#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;

int main()
{
    
    ll b,e,m;
    cin>>b>>e>>m;
    
    ll ans = pow(b,e);
    ans = ans%m;
    
    
    cout<<ans;
    
    return 0;
}
