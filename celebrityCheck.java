// given a matrix value .find the celebrity
//celebrity is the one who is known by everyone but celebrity doesnot know anyone
//if mat[i][j]==1 then i knows j
//if mat[i][j]==0 then i doesnot know j


import java.util.*;

class celebrityCheck{
	public static void main(String[] args){
		int[][] mat={{0,1,0},
					{0,0,0},
					{0,1,0}};
		int n=mat.length;
		System.out.println(celebrityCheck3(mat,n));
	}
		static int celebrityCheck1(int[][] mat,int n){
		int[] outdegree=new int[n];
		int[] indegree=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int x=mat[i][j];
				
				outdegree[i]+=x;
				indegree[j]+=x;
			}
		}
		for(int i=0;i<n;i++){
			if(indegree[i]==n-1 && outdegree[i]==0){
				return i;
				
			}
		}
		return -1;
	}
	static int celebrityCheck2(int[][] mat,int n){
		Stack<Integer> stk=new Stack<>();
		for(int i=0;i<n;i++){
			stk.push(i);
		}
		
		while(stk.size() > 1){
			int a=stk.peek();
			stk.pop();
			
			int b=stk.peek();
			stk.pop();
			
			if(mat[a][b] !=0 ){
				stk.push(b);
			}
			else{
				stk.push(a);	
			}
	    }
		int c=stk.peek();
		stk.pop();
		for(int i=0;i<n;i++){
			if(i==c) continue;
		
			if(mat[c][i]!=0 || mat[i][c]==0){
				return -1;
			}
		
		}
		return c;
	}
	static int celebrityCheck3(int[][] mat,int n){
		int i=0;
		int j=n-1;
		while(i<j){
			if(mat[i][j]==1){
				i++;
			}
			else{
				j--;
			}
		}
		int c=i;
		for(int k=0;k<n;k++){
			if(k==c) continue;
		
			if(mat[c][k]!=0 || mat[k][c]==0){
				return -1;
			}
		
		}
		return c;
	}
}





#undefined

			
