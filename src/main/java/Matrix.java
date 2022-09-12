import java.util.Random;

public class Matrix {
   int rand1;
   int p;
   int o;
   int[][] a;
   int[][] b;

    public void dostat(int p, int o){
        this.p = p;
        this.o = o;
    }

    Random random = new Random(100);

   public void sozdanie(int p, int o){
       int a[][] = new int[p][o];{
           for(int i = 0; i<a.length;i++) {
               for(int j = 0; j<a[i].length; j++){
                   rand1 = random.nextInt(100);
                   a[i][j] = rand1;
                   System.out.print(a[i][j]+" ");
               }
               System.out.println();
           }
       }
       System.out.println();
       int b[][] = new int[p][o];{
           for(int i = 0; i<b.length;i++) {
               for(int j = 0; j<b[i].length; j++){
                   rand1 = random.nextInt(100);
                   b[i][j] = rand1;
                   System.out.print(b[i][j]+" ");
               }
               System.out.println();
           }
       }
       this.a = a;
       this.b = b;
   }
    public void slozenie(int[][] a, int[][] b){
        int c[][] = new int[p][o];{
            for(int i = 0; i<c.length;i++) {
                for(int j = 0; j<c[i].length; j++){
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    int f = random.nextInt(10);

    public void umnoznachislo(int[][]a,int f){
        int d[][] = new int[p][o];{
            for(int i = 0; i<d.length;i++){
                for(int j = 0;j<d[i].length;j++){
                    d[i][j] = a[i][j] * f;
                    System.out.print(d[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public void umnozmatrix(int[][]a, int[][]b){
        int[][]m = new int[a.length][a[0].length];
        int x = 0;
        for(int i = 0;i<a.length || i< b.length; i++){
            for(int j = 0;j<a[0].length || j< b[0].length; j++){
                if(a.length<a[0].length){
                    for(int k = 0; k<a.length; k++){
                        x = x + (a[i][k] * b[k][j]);
                    }
                }
                else {
                    for(int k=0; k<a[p].length; k++){
                        x = x + (a[i][k] * b[k][j]);
                    }
                }
                m[i][j] = x;
                x = 0;
                System.out.println(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
