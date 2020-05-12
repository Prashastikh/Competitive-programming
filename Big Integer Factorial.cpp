#include <iostream>
using namespace std;
void multiply(int *a,int &n,int no)
{
    int carry = 0;
    for(int i=0;i<n;i++)
    {
        int product = a[i]*no + carry;
        a[i] = product%10;
        carry = product/10;
    }
    //while carry !=0
    while(carry)
    {
        a[n] = carry%10;
        carry = carry/10;
        n++;
    }
}
void big_factorial(int number)
{
    //Initialize an array 
    int *a = new int[1000];
    for(int i=0;i<1000;i++)
    {
        a[i]=0;
    }
    //Starting of factorial is from 1
    a[0]=1; 
    int n =1;
    //Every Iteration
    for(int i=2;i<=number;i++)
    {
    multiply(a,n,i);
    }
    //Print
    for(int i=n-1;i>=0;i--)
    {
        cout<<a[i]<<" ";
    }
    delete [] a;
    return;
}
int main() {
    int number;
    cin>>number;
    big_factorial(number);
    return 0;
}
