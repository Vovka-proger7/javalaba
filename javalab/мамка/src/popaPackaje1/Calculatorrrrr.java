package popaPackaje1;
import java.util.Scanner;

public class Calculatorrrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("������� ��������: "); 
			System.out.println("1. ��������");
			System.out.println("2. ���������");
			System.out.println("3. ���������");
			System.out.println("4. �������"); 
			Scanner scanner = new Scanner(System.in);
			int operation = scanner.nextInt();
			System.out.println("������� ������ �����: ");
			int x = scanner.nextInt();
			System.out.println("������� ������ �����: "); int y = scanner.nextInt();
			int resultttt = 0;
			if (operation == 1)
				resultttt = x + y;
			else if (operation == 2)
				resultttt = x - y;
			else if (operation == 3) 
				resultttt = x * y;
			else if (operation == 4)
				resultttt = x / y;
			System.out.println("��������� = " + resultttt); 
			System.out.println("��������");
	}

}
