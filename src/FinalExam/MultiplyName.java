package FinalExam;

public class MultiplyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multipliedString("Cheese", 4));
		}
		public static String multipliedString(String str, int num) {
			String result = " ";
			for (int i = 0; i < num; i++) {
				result += str;
		}
			return result;
		}

	}
