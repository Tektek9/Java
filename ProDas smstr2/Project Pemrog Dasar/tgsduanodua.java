class tgsduanodua {
public static void main(String[] args) {
String thk="Tahun Kabisat",thbk="Bukan Tahun Kabisat";
int th;
Scanner input=new Scanner(System.in);
System.out.println("Hitung Tahun Kabisat");
System.out.println("--------------------");
System.out.print("Masukan Tahun : ");
th=input.nextInt();
if(th%400==0 || th%4==0){
System.out.println("Tahun " + th + " Adalah " + thk);
}else{
System.out.println("Tahun " + th + " Adalah " + thbk);
}
}
}