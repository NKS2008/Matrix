class Main{
  public static void spiral(int[][]m){
    int t = 0;
    int b = m.length-1;
    int r = 0;
    int l = m[0].length-1;
    while(l <= r && t <= b){
      for(int i = l; i <= r; i++)
        System.out.println(m[t][i]);
      t++;
      for(int i = b; i <= t; i++)
        System.out.println(m[i][r]);
      r--;
      for(l<=r)
        for(int i = r; i >= l; i--)
          System.out.println(m[b][i]);
        b--;
      for(b<=t)
          for(int i = t; i>=b;i--)
            System.out.println(m[i][l])
          l++;
    }
  }
  public static void main(String[] args) {
      int[][] matrix = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
       };
      spiral(matrix);
    }
}
        
