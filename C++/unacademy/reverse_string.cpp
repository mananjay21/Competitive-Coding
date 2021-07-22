/*The library below must be included for the reverse function to work
#include<bits/stdc++.h> 
using namespace std;

int main() {
  
  string greeting = "Hello";
  //Note that it takes the iterators to the start and end of the string as arguments
  reverse(greeting.begin(),greeting.end());
  cout<<greeting<<endl;
}*/
#include <iostream>
using namespace std;
int main()
{
    string greeting = "Hello";
  int len = greeting.length();
  int n = len-1;
  int i = 0;
  while(i<=n){
    //Using the swap method to switch values at each index
    swap(greeting[i],greeting[n]);
    n = n-1;
    i = i+1;

  }
  std::cout<<greeting<<endl;
  return 0;
}
