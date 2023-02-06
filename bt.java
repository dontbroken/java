public class bt {
    int kt(int a ){
        if( a %2 ==0)
            return 1; 
        return 0 ;
    }// so fibo
    static int fibo(int n){
        if( n == 0 )
             return 0 ;
        if( n == 1)
            return 1 ;
        return fibo(n-1)+fibo(n-2);


    }// giai thua 
    static int giaithua(int n){
        int s = 1 ;
        for(int i =1;i<=n ;i++){
            s= s *i;
        }
        return s ;

    } // phuong trinh bac 2
    static float delta(int a,int b ,int c){  // a x mũ 2 + bx +c =0 
        return b*b - 4*a*c; // tam giac = b mũ 2  - 4 a c
    }
    static void nghiem(int a ,int b,int c){
        float z = delta(a,b,c);
        if(z == 0){ // == bằng  nếu != khác nếu = chắc là phép gán   
            System.out.println("nghiem kep : "+ -b/2*a );

        } // z khác 0  và nếu z >0 thì có 2 nghiệm 
        else if( z > 0 ){ // cấu trúc lệnh so sánh 
            System.out.println("2 nghiem ");
            System.out.println(((-b+Math.sqrt(z))/2*a)); // lệnh in ra màn hình 
            System.out.println(((-b-Math.sqrt(z))/2*a));
            // chuoi dinh dang 
            // String s = String.format("pt co 2 nghiem , x1=%f, x2= %f",x1,x2 ");
            // System.out.print(s);

        } // =0 và >0 là bé hơn không o ke chưa
        else {
            System.out.println("vo  nghiem");
        }

    }
    // boi uoc chung 
    static int ucln( int a , int b){
        if (b == 0) return a;
        if (a % b == 0) return b;
        return ucln(b, a%b);
    }
    
    static int bcnn (int a ,int b ){
        return a*b/ ucln(a,b);

    }
    static int check(int n){
      
        if( n <2 )
            return 0;
        else {
            for ( int i =2 ; i<=Math.sqrt(n);i++)
                if(n %i==0 )
                    return 0;
                return 1;
        } 


    }
    static void snt(int n){
        for(int i =0 ;i<=n;i++){
            if(check(i)==1)
                System.out.print(i+" ");
              

        }


    }
    
    static void lietke(int n){
        int dem =0;
        int i =0;
        while( dem <n){
            if(check(i)==1){
                System.out.print(i+" ");
                dem++;
                
            }
            ++i;
            


        }}
    static int tongchuso(String z){
        int tong =0;
        for( int i =0;i <z.length();i++)
            {
                tong = tong + z.charAt(i)-'0'; 
            }
        return tong;
    }
 
    static void sothuannghich(){
        for( int i = 100000;i <=999999;i++){
            { 
            String k = Integer.toString(i);
            StringBuilder str = new StringBuilder(k);
            String z= str.reverse().toString();
            if(k.equals(z ))
                    System.out.print(i+" ");
            }
        }

    }
    static int checkfb(int n)
    {
        if(n==1||n==0||n==2||n==3) return n;//fb la fibonacci
       return checkfb(n-2)+checkfb(n-1);
    }
    static boolean  isPerfectSquare(int  x)
    {   
    
    return (Math.sqrt(x) * Math.sqrt(x) == x);
    }
 
// Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n)
{
    // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or
    // both is a perfect square
    return isPerfectSquare(5 * n * n + 4)
           || isPerfectSquare(5 * n * n - 4);
}
    static void mangfibo(int n ){
        int dem =0;
        int i =0;
        while( dem <n){
            if(isFibonacci(n)==true && check(i)==1){
                System.out.print(i+" ");
                dem++;
                
            }
            ++i;
            


        }}
    static void sont5chuso(){
        for(int i = 10000;i <= 99999;i++)
            if(check(i)==1)
                System.out.print(i+" ");

    }



        }


    


    
           


            
        

    


