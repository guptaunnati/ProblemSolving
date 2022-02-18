// You are given an array of N non-negative integers: A1, A2, ..., AN. An alternating subsequence is a subsequence in which the indices of any two consecutive elements differ by exactly two in the original array. That is, if Ai1, Ai2, ..., Aik is some subsequence, then for it to be an alternating subsequence, (i2 - i1 = 2), (i3 - i2 = 2), and so on should all hold true. Among all alternating subsequences, find the one which has maximum sum of elements, and output that sum.

// Input
// The first line of the input contains an integer T denoting the number of test cases.

// The first line of each test case contains an integer N denoting the number of elements in the array.

// The second line contains N space-separated integers A1, A2, ..., AN denoting the array A.

// Output
// For each test case, output a single line containing the answer.

// Note
// A subsequence with only a single integer is also an alternating subsequence.
// Constraints
// 1 ≤ T ≤ 10
// 1 ≤ N ≤ 105
// 0 ≤ Ai ≤ 105

// Example
// Input:
// 1
// 3
// 1 2 5

// Output:
// 6
// Explanation
// Example case 1.
// For the given array [1, 2, 5], there are 7 non-empty subsequences out of which there are 4 alternating subsequences. These will be {[1], [2], [5], [1, 5]}. The alternating subsequence [1, 5] will have the largest sum i.e 6.
//Problem Code:CHEFALT
#include<iostream>

using namespace std;
int subsequence(int arr[], int n){
    long int ans=0;
    for(int i=0; i<2; i++){
        long int sum=0;
        for(int j=i; j<n; ){
            sum+=arr[j];
            ans=max(ans, sum);
            j=j+2;
        }
    }
    cout<<ans<<endl;
    return 0;
    
}
int main(){
    int T;
    cin>>T;
    for(int i=0; i<T; i++){
        int N;
        cin>>N;
        int A[N];
        for(int j=0; j<N; j++){
            cin>>A[j];
        }
        subsequence(A, N);
    }
    return 0;
}