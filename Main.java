import java.util.Scanner;

public class Main{
    
    public static void main(String[] args ){
        while(true){
             System.out.println("xin moi nhap lua chon: ");
             System.out.println("1: Giai Phuong Trinh bac 2: ");
             System.out.println("2: Giai Thua: ");
             System.out.println("3:Tim so Fibonacci: ");
             System.out.println("4: Boi chung va Uoc Chung: ");
             System.out.println("5: Liet Ke cac so nguyen to be hon so cho truoc: ");
             System.out.println("6: N so nguyen to dau tien: ");
             System.out.println("7: Cac so nguyen to co 5 chu so: ");
             System.out.println("8: Tong cac chu so trong so cho truoc: ");
             System.out.println("9: Liet ke cac so thuan nghich: ");
             System.out.println("10: Liet ke cac so Fibonacci vua la so nguyen to: ");
             Scanner sc = new Scanner(System.in);
             int a ;
             a = sc.nextInt();
             if ( a == 1 ){
                System.out.println("1: Giai Phuong Trinh bac 2: ");
                int x,y,z;
                System.out.println("Nhap he so a: ");
                x= sc.nextInt();
                System.out.println("Nhap he so b: ");
                y= sc.nextInt();
                System.out.println("Nhap he so c: ");
                z=sc.nextInt();
                bt.nghiem(x, y, z);

             }
             else if( a == 2 ){
                System.out.println("2: Giai thua ");
                int gt;
                gt = sc.nextInt();
                bt.giaithua(gt);
            


             }
             else if( a== 3 ){
                System.out.println("3:Tim so Fibonacci: ");
                System.out.println("nhap so fibonacci can tim");
                int k ;
                k = sc.nextInt();
                bt.fibo(k);
             }
             else if( a==4){
                System.out.println("4: Boi chung va Uoc Chung: ");
                int bc,bf ;
                System.out.println("nhap a");
                
                bc= sc.nextInt();
                System.out.print("nhap b ");
                bf = sc.nextInt();
                System.out.println("boi chung nho nhat" + bt.bcnn(bc, bf));
                System.out.println("uoc chung lon nhat" +bt.ucln(bc, bf) );
                
             }
             else if( a==5){
                System.out.println("5: Liet Ke cac so nguyen to be hon so cho truoc: ");
                int son;
                son=sc.nextInt();
                bt.lietke(son);
             }
             else if(a == 6 ){ 
               int nn;
               System.out.println("6: N so nguyen to dau tien: ");
               nn = sc.nextInt();
               bt.lietke(nn);

             }
             else if(a==7){
               
               System.out.println("7: Cac so nguyen to co 5 chu so: ");
               
               bt.sont5chuso();

             }
             else if(a==9){
               
               System.out.println("9: Liet ke cac so thuan nghich: ");
               
               bt.sothuannghich();;

             }
             else if(a==8){
               String z;
               System.out.println("8: Tong cac chu so trong so cho truoc: ");
               z= sc.next();
               
               System.out.println(bt.tongchuso(z));

             }
             else if(a==10){
               int uy;
               System.out.println("10: Liet ke cac so Fibonacci vua la so nguyen to: ");
               System.out.println("nhap n:  ");
               uy = sc.nextInt();
               bt.mangfibo(uy);
             }
             else {
               System.out.print("ket thuc!!");
               break;
             }
               





        }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // System.out.println("Hello world");
        //int n = 100;
       // Main x = new Main() ; // tao doi tuong lop men 
       /*  int  z =  x.kt(n); 
         if(z==1 )
            System.out.print(n+" la so chan");
        else    // chuoi co dinh dang 
            System.out.printf(" %d  la so le "); */
        
       // String a;// string 
       // Scanner sc = new Scanner(System.in);
       // a= sc.next();

        //b= sc.nextInt();
      //System.out.print( bt.tongchuso(a) );
      //c= sc.nextInt();
      //  System.out.println(bt.fibo(a));
        //System.out.println(bt.giaithua(a));
        //bt.nghiem(a,b,c);

      //  bt.mangfibo(4);
    } // chan le 
    
}