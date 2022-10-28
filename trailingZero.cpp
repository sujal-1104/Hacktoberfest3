#include<bits/stdc++.h>
using namespace std;

int trailingZero(int n){
    int res=0;
    for(int i=5;i<=n;i*=5){
        res=res+n/i;
    }
    return res;
}

int main(){

    int num;
    cin>>num;
    
    cout<<trailingZero(num);

    return 0;
}