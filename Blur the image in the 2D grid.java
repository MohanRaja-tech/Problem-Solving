
// 1 1 1
// 1 7 1
// 1 1 1
public class Main
{
    public static  boolean check(int row,int col,int m,int n){
        if(row >= 0 && row < m && col >= 0 && col < n) return true;
        return false;
    }
    public static void helper(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=1;i<=m-2;i++){
            for(int j=1;j<=n-2;j++){
                if(check(i-1,j,m,n) && check(i+1,j,m,n) && check(i,j-1,m,m) && check(i,j+1,m,n) && 
                check(i-1,j-1,m,n) && check(i-1,j+1,m,n) && check(i+1,j-1,m,n) && check(i+1,j+1,m,n) ){
                    int sum = arr[i][j] + arr[i-1][j] + arr[i+1][j] + arr[i][j-1] + arr[i][j+1] +
                    arr[i-1][j-1] + arr[i-1][j+1] + arr[i+1][j-1] + arr[i+1][j+1];
                    int avg = (int)sum/9;
                    arr[i][j] = avg;
                }
            }
        }
    }
	public static void main(String[] args) {
		int[][] arr  = {{1,1,1},{1,7,1},{1,1,1}};
	    
		helper(arr);
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}
