#include<iostream>
using namespace std;
int n;

void largest(int a[]){
    int L=0,ln=0,m=0;
    L=a[0];
    for(int i=0;i<n;i++){
        if(L<a[i]){
            ln=L;
            L=a[i];
            m+=1;
        }
        if(L>=a[i]){
            continue;
        }
    }
    if(m==0){
        for(int i=1;i<n;i++){
            if(ln<a[i]){
                ln=a[i];
            }
        }
    }
    cout<<"\nThe largest element is "<<L;
    cout<<"\nThe second largest element is "<<ln;
}
int main(){
    cout<<"Enter the range of elements of an array: ";
    cin>>n;
    int A[n];
    cout<<"Enter the elements of an array: ";
    for(int i=0;i<n;i++){
        cin>>A[i];
    }
    cout<<"Our array is [   ";
    for(int i=0;i<n;i++){
        cout<<A[i]<<"   ";
    }
    cout<<"]";
    return 0;
}