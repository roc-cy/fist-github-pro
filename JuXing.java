import java.util.Scanner;
public class JuXing{
	public static void main(String[] args){
		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println("");
		}*/
		Scanner input = new Scanner(System.in);
		System.out.print("������������");
		int n=input.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}

			for(int j=1;j<=i*2-1;j++){
				System.out.print(i);
			}
			System.out.println("");
		}

		
	}
}