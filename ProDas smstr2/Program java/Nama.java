class Nama{
    public void Sapa(){
        System.out.println("Achmad Cahya Aditya");
    }
    
    public static void main(String []args){
        Siapa ss;
        Nama nn;
        ss = new Siapa();
        nn = new Nama(); //memanggil method Sapa() pada Siapa
        ss.Sapa();//memanggil method Sapa() pada class Nama
        nn.Sapa();
    }}
        class Siapa extends Nama{//Method sapa() pada class
            public void Sapa(){
                System.out.println("Yesica Dwi Lestari");}}
