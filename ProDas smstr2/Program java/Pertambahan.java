class Pertambahan{
    public void tambah1(){
        int a=5, b=10;
        System.out.println("Hasil Pertambahan dari method tambah1 ke-1 = "+(a+b)); 
    }
    public void tambah1(int x, int y){
        System.out.println("Hasil Pertambahan dari method tambah ke-2 = "+(x+y));
    }
    
    public static void main(String []args){
        Pertambahan pp;
        pp = new Pertambahan();
        pp.tambah1(); //memanggil method tambah ke-1
        pp.tambah1(5,6); //memanggil method tambah ke-2
    }
}
