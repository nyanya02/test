
public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[][] country = {{"日本","タイ"}, {"アメリカ", "ブラジル"}, {"フランス", "ロシア"}};

		for(int i = 0; i < country.length; i++){
			for(int j = 0; j < country[i].length; j++){
				System.out.print(country[i][j]);
			}
			System.out.println(" ");
		}


		int i = 1;

		do{
			System.out.println(i);

			i--;
		}while(i > 1);
	}

}
