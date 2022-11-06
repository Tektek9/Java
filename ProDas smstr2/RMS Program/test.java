 import java.util.Scanner;

class Regresi { 
    Scanner input = new Scanner(System.in); 
    double[] x;
    double[] y;
    double[] x2;
    double[] y2;
    double[] xy;
    int n;
    double a1,a0,b1,b0,r;
    
    public Regresi()    {
        System.out.println("------------------");
        System.out.println("| Menu Utama     |");
        System.out.println("| 1. Input       |");
        System.out.println("| 2. Regresi Y-X |");
        System.out.println("| 3. Regresi X-Y |");
        System.out.println("| 4. Korelasi    |");
        System.out.println("| 5. Keluar      |");
        System.out.println("------------------");
        System.out.print("Masukkan Pilihanmu  : " );
        int pil = input.nextInt();}
       
    
     public void clean() {
       for (int i=0;i<=20;i++) {
              System.out.println("\n"); }
    }
    public void input()    {
        System.out.print("masukan jumlah data :");
        n = input.nextInt();
        x= new double[n];
        y= new double[n];
        x2 = new double[n];
        y2=new double[n];
        xy=new double[n];
        
        System.out.print("\nmasukkan data x :\n");
        for(int i=0;i<n;i++)    {
            System.out.print("data ke-"+(i+1)+":");
            x[i]= input.nextInt();    }
        
        System.out.println("\nmasukkan data y :");
        for(int i=0;i<n;i++)    {
            System.out.print("data ke-"+(i+1)+":");
            y[i]= input.nextInt();    }
       
       for(int i=0 ; i<n;i++)   {
           x2[i]=Math.pow(x[i],2);
           y2[i]=Math.pow(y[i],2);
           xy[i]= x[i] * y[i] ;   }
    }
    
    public double sigma(double k[])    {
       double data = 0;
        for(int i=0; i<n;i++)    {
         data = data + k[i]; }
       return(data); }
     
     public void regresiYX() {
     a1 = ((n*sigma(xy)) - (sigma(x) * sigma(y))) / ((n*sigma(x2))-Math.pow(sigma(x),2));
     a0 = ((sigma(y) * sigma(x2)) - (sigma(x) * sigma(xy))) / ((n*sigma(x2))-Math.pow(sigma(x),2));
     System.out.println("Persamaan Regrsi Y terhadap X");
          
     if (a1> 0)
     System.out.println("Y = "+a0+" + "+a1+"x");
     else
     System.out.println("Y = "+a0+a1+ "x"); }
     
     public void regresiXY()  {
      b1 = ((n*sigma(xy)) - (sigma(y) * sigma(x))) / ((n*sigma(y2))-Math.pow(sigma(y),2));
      b0 = ((sigma(x) * sigma(y2)) - sigma(y) * sigma(xy)) / (n* sigma(y2)-Math.pow(sigma(y),2));
      System.out.println("Persamaan Regresi X terhadap Y");
      
      if (b1>0)
      System.out.println("X = "+b0+" + "+b1+"y");
      else
    System.out.println("X = "+b0+b1+"y"); }

     public void Korelasi() {
      r = ((n*(sigma(xy))) - (sigma(x) * sigma(y))) / (Math.sqrt(n*(sigma(x2)))-Math.pow(sigma(x),2))*(Math.sqrt(n*(sigma(y2)))-Math.pow(sigma(y),2));
      System.out.println("Nilai Korelasi adalah ");
      System.out.println("r = "+r+" ");     }    
    
    
    public static void main(String[] args)     {
        new Regresi();     }
    }
