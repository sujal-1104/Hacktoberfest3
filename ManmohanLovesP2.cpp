/*
Sample Input: 5
Output Format: Pattern.
Sample Output: 
1
11
202
3003
40004
*/
#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            if(i>=1 && j>0 && j<=i-1){
                cout<<0;
            }
            else if(i>=1){
                cout<<i;
            }
            else {cout<<1;}

        }
        printf("\n");
    }
}