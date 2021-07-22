#include<iostream>
using namespace std;

template <class T>
class calculator{
    public:
    T num1,num2;
    public:
    calculator(T n1, T n2)
    {
        num1=n1;
        num2=n2;
    }
    
    T add(T,T){    return num1+num2;    }
    //T sub(T,T){    return num1-num2;    }
    //T mult(T num1, T num2){    return num1*num2;    }
    //T div(T num1, T num2){    return num1/num2;    }

};
template<class T>
T Large(T n1,T n2)
{
    return(n1>n2?n1:n2);
}
int main()
{
    //calculator <float> ob2;
    calculator <int> ob1;
    int a,b;
  
    cout<<"Enter the two value"<<endl;
    cin>>a>>b;
    cout<<Large(a,b)<<endl<<endl;
    cout<<"Addition of two number ="<<ob1.add(a,b)<<endl;
    //cout<<"substraction of two number ="<<ob1.sub(a,b)<<endl;
    //cout<<"Multiplication of two number ="<<ob1.mult(a,b)<<endl;
   // cout<<"Division of two number ="<<ob1.div(a,b)<<endl;

    
    return 0;
}