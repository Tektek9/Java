class Kotak{
double panjang;
double lebar;
double tinggi;

Kotak() {//konstruktor dari kelas utama
panjang = 4;
lebar = 3;
tinggi = 2;
}

double hitungVolume(){
return(panjang*lebar*tinggi);}

public static void main(String[] args){
    Kotak k= new Kotak();
    System.out.println
   ("volume k = "+k.hitungVolume());}}

