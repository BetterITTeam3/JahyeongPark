
public class AuthApp {

	public static void main(String[] args) {
		String[][] users = {
				{"Oh", "1111"},
				{"Kim", "2222"},
				{"Park", "3333"}
		};
		String inputID = args[0];
		String inputPW = args[1];
		
		boolean isLogined = false;
		for (int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if (current[0].equals(inputID) && current[1].equals(inputPW)) {
				isLogined = true;
				break;
			}
		}
		// 2차원 배열인 users 과 1차원 배열인 current. 
		
		System.out.println("Hi, ");
		if (isLogined) {
			System.out.println("Master.");
		}
		else {
			System.out.println("Who are you?");
		}
		
	}

}
