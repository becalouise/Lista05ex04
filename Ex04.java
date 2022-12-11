package Lista05ex04;
    import java.util.Scanner;
    public class Ex04 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        System.out.print("Insira um número: ");
        int numero=sc.nextInt();
        sc.close();
        confere(numero);
    }
    
    public static void confere(int numero){
        if(numero<=0){
            System.out.println("N");
        }else{
            System.out.println("P");
        }
    }
}