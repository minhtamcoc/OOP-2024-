#include <bits/stdc++.h>
using namespace std;
bool nto(int n){
    for(int i=2;i*i<=n;i++){
        if(n%i==0)  return false;
    }
    return n>1;
}
int gcd(int a,int b){
    if(b==0) return a;
    return gcd(b,a%b);
}
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        cout<<n<<endl;
    }
}