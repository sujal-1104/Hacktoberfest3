#include<bits/stdc++.h>
using namespace std;

int main(){
    int arr[]={2,5,91,2,0,-1};
    int n=6;

    for(int i=0;i<n-1;i++){ //passes
        for(int j=0;j<n-i-1;j++){//comparision
            if(arr[j+1]<arr[j]){
                swap(arr[j],arr[j+1]);
            }
        }
    }

    for(int i:arr){
        cout<<i<<" ";
    }
}

// Time Complexity-->O(n^2);
// Space Complexity-->O(1);
