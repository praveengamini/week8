#include<iostream>
using namespace std;
class A{
    public:
    virtual void displayHi()=0;
};
class B: public A{
    public:
    void displayHi(){
        cout<<"hii"<<endl;
    }
};
int main()
{   
    B obj;
    obj.displayHi();
    
}