import java.util.Scanner;
class Client {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] vector=new int[6];
    for(int i=0;i<6;i++){
       int number = sc.nextInt();
       vector[i]=number;
       //System.out.println("Numarul" +i+ "este:"+ number);
     }
     for(int i=0;i<6;i++){
       System.out.print(vector[i]+" ");
     }
  }
}
#AtelierGoogle
#ADG
#AtelierulDigitalJava
