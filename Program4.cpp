#include<iostream>
using namespace std;
template <typename T >//too many declarations are needed when there are many methods
void sum(T a, T b)
{
    cout<<a+b<<endl;
}
template <class T>//defining class underneath of the template declaration would avoid many declarations and efficient
class Template {
    public:
        void sum(T a, T b)
    {
        cout<<a+b<<endl;
    }
    void sub(T a, T b)
    {
        cout<<a-b<<endl;
    }
    void mul(T a, T b)
    {
        cout<<a*b<<endl;
    }
    void div(T a, T b)
    {
        cout<<a/b<<endl;
    }


};

int main()
{
    sum(2.8,3.8);//there is no need of instantiation of object for template functions
    sum(4,5);
    Template <double> obj1;//object datatype is mandatory while instantiating
    obj1.sub(5.7,4.5);
   //Template<string>obj2; not possible for strings
   Template <int> obj3;
    obj3.mul(6,7);
    Template <double> obj4;
    obj4.div(90,4);



}