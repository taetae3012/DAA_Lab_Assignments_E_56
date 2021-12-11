#include<iostream>
using namespace std;

int knapsack(int wt[],int v[],int n,int k){
    if(n==0||k==0){
        return 0;
    }
    if(wt[n-1]>k){
        return knapsack(wt,v,n-1,k);
    }
    else{
        return max(knapsack(wt,v,n-1,k),v[n-1]+knapsack(wt,v,n-1,k-wt[n-1]));
    }
}

int main(){
    int wt[]={10,20,30};
    int v[]={60,100,120};
  int res=  knapsack(wt,v,3,50);
  cout<<res<<endl;

}
