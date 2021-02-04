import java.util.Arrays;

//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        int j = 1; //for case 1
//        Arrays.sort(participant); Arrays.sort(completion);
//        for(int i = 0; i < completion.length; i++) {
//        	if(participant[i] != completion[i]) { //for case 2
//        		answer = participant[i];
//        		j = -1;
//        		break;
//        	}
//        }
//        if(j == 1) {
//    	answer = participant[ participant.length - 1 ];
//        }
//        
//        return answer;
//    }
//}

public class playerX {

	public static void main(String[] args) {
		String testp1[] = { "leo", "kiki", "eden" };
		String testc1[] = { "eden", "kiki" };
		
		String testp2[] = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String testc2[] = { "josipa", "filipa", "marina", "nikola" };
		
		String testp3[] = { "leo", "kiki", "kiki", "eden" };
		String testc3[] = { "eden", "kiki", "leo" };
		
		Solution s1 = new Solution(); 
		String answer1 = s1.solution(testp1, testc1);
		
		Solution s2 = new Solution(); 
		String answer2 = s2.solution(testp2, testc2);
		
		Solution s3 = new Solution(); 
		String answer3 = s3.solution(testp3, testc3);
		
		System.out.println(answer1 + "\n" + answer2 + "\n" + answer3);
	}

}
