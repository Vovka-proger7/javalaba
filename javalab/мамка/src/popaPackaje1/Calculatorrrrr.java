package popaPackaje1;
import java.util.Scanner;

public class Calculatorrrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Введите операцию: "); 
			System.out.println("1. Сложение");
			System.out.println("2. Вычитание");
			System.out.println("3. Умножение");
			System.out.println("4. Деление"); 
			Scanner scanner = new Scanner(System.in);
			int operation = scanner.nextInt();
			System.out.println("Введите первое число: ");
			int x = scanner.nextInt();
			System.out.println("Введите второе число: "); int y = scanner.nextInt();
			int resultttt = 0;
			if (operation == 1)
				resultttt = x + y;
			else if (operation == 2)
				resultttt = x - y;
			else if (operation == 3) 
				resultttt = x * y;
			else if (operation == 4)
				resultttt = x / y;
			System.out.println("Результат = " + resultttt); 
			System.out.println("Микушина");
	}

}
