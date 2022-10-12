#include<iostream>
using namespace std;
class Rational
{
public:
    int p;
    int q;

public:
    Rational(){}
    Rational(int p1, int q1)
    {
        this->p = p1;
        this->q = q1;
    }
   friend Rational operator+(Rational a1,Rational a2);
};
 Rational operator+(Rational a1,Rational a2){
     Rational c3;
     c3.p=a1.p+a2.p;
     c3.q=a1.q+a2.q;
     return c3;
 }

int main()
{
    Rational r1(3,7), r2(4,7), a3;
    a3=r1+r2;
    cout<<a3.q;
}
