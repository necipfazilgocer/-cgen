package hipotenüs;
import java.util.Scanner;
public class hipotenüs {

	public static void main(String[] args) {
		float birinciKenar,ikinciKenar;
		double hipotenüs;
		System.out.print("Üçkenin birinci kenarını giriniz.");
		Scanner scanner=new Scanner(System.in);
		birinciKenar=scanner.nextInt();
		System.out.print("Üçkenin ikinci kenarını giriniz.");
		ikinciKenar=scanner.nextInt();
		hipotenüs=Math.sqrt((birinciKenar*birinciKenar)+(ikinciKenar*ikinciKenar));
		System.out.println("Üçkenin hipotenüsü="+hipotenüs);
		
		

	}

}
