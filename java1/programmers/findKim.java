
//class Solution {
//    public String solution(String[] seoul) {
//        String answer = "";
//        for(int i = 0; i < seoul.length; i++) {
//        	if(seoul[i].equals("Kim")) {
//        		answer = "김서방은 "+i+"에 있다";
//        		break;
//        	}
//        }
//        return answer;
//    }


public class findKim {

	public static void main(String[] args) {
		String arr[] = { "Jane", "Kim" };
		
		Solution s1 = new Solution();
		System.out.println(s1.solution(arr));

	}

}
