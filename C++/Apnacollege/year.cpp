#include<bits/stdc++.h>
using namespace std;
int main()
{
	int days,year,week,month,r;
	cin>>days;
	cout<<"The number years="<<days/365<<endl;
	month=days%365;
	cout<<"the number of month="<<month/30<<endl;
	week=month%30;
	cout<<"the number of weeks="<<week/7<<endl;
	days=week%7;
	cout<<"The number of days= "<<days<<endl;
	
	
	return 0;
}
