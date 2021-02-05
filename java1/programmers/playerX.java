import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";	// 리턴할 변수 정의 
        int temp = 0;	// 카운트 변수 정의 
        Arrays.sort(participant); Arrays.sort(completion);	// 알파벳 순으로 배열 정렬 
        
        for(int i = 0; i < completion.length; i++) {	// 완주자 수 만큼 반복 
        	if(participant[i] == completion[i]) {
        		temp += 1;	// 완주하지 못한 선수의 이름이 정렬된 participant 배열의 가장 마지막에 나올 경우를 대비 
        	} else {
        		answer = participant[i];	// 정렬된 두 배열을 비교하였을 때, 불일치 시 그 순간 정렬된 participant 배열에 존재하는 선수가 정답 
        		break;	// 정답이 도출 되었으니 반복문 탈출 
        	}
        }
        
        if(temp == completion.length) { // 아직 answer 문자열은 비어있음 
    	answer = participant[ completion.length ];
        }
        
        return answer;
    }
}

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
