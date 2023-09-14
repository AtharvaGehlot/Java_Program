/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*  //1.
#include<iostream>
using namespace std;
int main(){
     int n;
    cout<<"Enter the range of an array: ";
    cin>>n;
    int a[n];
    cout<<"Enter the elements in an array:  ";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<"Our array is, [ ";
    for(int i=0;i<n;i++){
        cout<<" "<<a[i];
    }
    cout<<" ]";
    return 0;
}   */

 //2.
#include<iostream>
using namespace std;
int main(){
    int n,s,t=0;
    cout<<"Enter the range of an array: ";
    cin>>n;
    cout<<"Enter the number you wanna search:  ";
    cin>>s;
    int a[n];
    cout<<"Enter the elements in an array:  ";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<"Our array is, [";
    for(int i=0;i<n;i++){
        cout<<" "<<a[i];
    }
    cout<<" ]\n";
    for(int i=0;i<n;i++){
        if (a[i]==s){
            t+=1;
            continue;
        }
    }
    if(t==0){
        cout<<"Number not found";
    }
    if (t==1){
        cout<<"Number found";
    }
    if(t>=1){
        cout<<"Number found "<<t<<" times.";
    }
    return 0;
}   

