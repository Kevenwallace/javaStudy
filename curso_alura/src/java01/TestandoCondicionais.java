package java01;

public class TestandoCondicionais {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 21;
		if (idade >= 22) {
			System.out.println("sua idade é " + idade);
		} else if (idade < 22) {
			System.out.println("sua idade é menor " + idade);
		} else {
			System.out.println("out of range");
		}

	}
}
