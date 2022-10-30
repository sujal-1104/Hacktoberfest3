#include<bits/stdc++.h>
using namespace std;

void shineSolve()
{
    long long n;
    cin>>n;
    long long arr[n];
    for(int p=0;p<n;p++) {cin>>arr[p];}
    long long maxSumPower=arr[0];
    long long currSumPower=arr[0];
    long long m=1000000007;

    for(long long idx=1;idx<n;idx++)
    {
            currSumPower=max(arr[idx],currSumPower+arr[idx]);
            maxSumPower=max(maxSumPower,currSumPower);   
    }

    cout<<(maxSumPower)%m<<"\n"; return;

}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        shineSolve();
    }
    return 0;
}