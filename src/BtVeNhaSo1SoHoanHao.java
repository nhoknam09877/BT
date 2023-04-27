import java.util.Scanner;

public class BtVeNhaSo1SoHoanHao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số hoàn hảo");
        int x = sc.nextInt();
        if (sohoanhao(x)){
            System.out.println(x+"là số hoàn hao");
        }else {
            System.out.println(x+"không phải số hoàn hảo");
        }
    }

    public static boolean sohoanhao(int x){
        int n=0;
        for (int i=1;i<x;i++){
            if (x%i==0){
                n+=i;
                System.out.println();
            }

        }
        if (n==x){
            return true;
        }else return false;
        }
}
