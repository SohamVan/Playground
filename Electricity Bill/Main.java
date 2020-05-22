#include<iostream>
using namespace std;
int main()
{
  int a,b;
  float c,d,e,f;
  c=0.5;
  d=0.65;
  e=0.80;
  f=1.25;
    cin>>a;
  if(a<=200)
  { b=a*c;
    cout<<"Rs."<<b;
  }
  else if(a<=400)
  { b=a*d+100;
   cout<<"Rs."<<b;
  }
}