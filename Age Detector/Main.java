#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e;
 cin>>a;
  cin>>b;
  if(a>b)
  {c=1900+a;
   d=2000+b;
   e=d-c;
   cout<<e;
  }
  else
  {c=2000+a;
   d=2000+b;
   e=d-c;
   cout<<e;
  }
}