import java.util.Random;

public class Matrix {
   int a;
   int b;
   int[][]m;

   public void set(int a, int b, int c){
       m[a][b] = c;
   }
   public int get(int a,int b){
       return m[a][b];
   }

   public Matrix(int a, int b){
       Random random = new Random();
       m = new int[a][b];
       for(int i=0;i<m.length;i++){
           for(int j=0;j<m[i].length;j++){
               set(i,j,random.nextInt(10));
           }
       }
       this.a = a;
       this.b = b;
   }

   public void output(){
       for (int i=0;i<m.length;i++){
           for(int j=0;j<m[i].length;j++){
               System.out.print(get(i,j)+" ");
           }
           System.out.println();
       }
   }
   Matrix mplus(Matrix m){
       Matrix matr = new Matrix(m.a,m.b);
       for(int i=0;i<m.a;i++){
           for(int j=0;j<m.b;j++){
               matr.set(i,j,get(i,j)+m.get(i,j));
           }
       }
       return matr;
   }
   Matrix umnoznachislo(int t){
       Matrix matr = new Matrix(a,b);
       for(int i=0;i<m.length;i++){
           for(int j=0;j<m[i].length;j++){
               matr.set(i,j,get(i,j)*t);
           }
       }
       return matr;
   }
   Matrix umnozmatrix(Matrix m){
       Matrix matr = new Matrix(a,b);
       int q = 0;
       for(int i=0;i<matr.a;i++){
           for(int j=0;j<matr.b;j++){
               if(matr.a<matr.b){
                   for(int p=0;p<matr.a;p++){
                       q = q + get(i,p)*matr.get(p,j);
                   }
               }
               else {
                   for(int p=0;p<matr.b;p++){
                       q = q + (get(i,p)*matr.get(p,j));
                   }
               }
               matr.set(i,j,q);
               q=0;
           }
       }
       return matr;
   }
}
