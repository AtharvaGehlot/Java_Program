#include<iostream>
using namespace std;
int main(){
    // Aditya Sharma, Roll no. 12.
    int n,s,t;
    cout<<"Enter the size of array:";
    cin>>n;
    int a[n];
    cout<<"Enter the elements of array:";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<"Our array is [ ";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    cout<<"] ";
    s=a[0];
    //For largest and second number,
    for(int i=0;i<n;i++){
        if(a[i]>s){
            t=s;
            s=a[i];
        }
        else{
            continue;
        }
    }
    cout<<"\nThe largest number is "<<s;
    cout<<"\nThe second largest number is "<<t;
    return 0;
}
