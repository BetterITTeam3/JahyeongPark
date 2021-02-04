import java.util.Arrays;

//class Solution {
//    
//    public int[] solution(int[] array, int[][] commands) {
//    	int[] answer = new int[commands.length];
//        for(int i = 0; i < commands.length; i++) {
//        	int[] box = new int[ commands[i][1] - commands[i][0] + 1 ]; // box: 정렬을 위한 배열을 담을 곳 
//        	for(int j = 0; j < box.length; j++) {
//        		box[j] = array[ j + commands[i][0] - 1 ];
//        	}
//        	 Arrays.sort(box);
//            answer[i] = box[ commands[i][2] - 1 ];
//        }
//        return answer;
//    }
//    
//}

public class kNumber {

	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] com = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3} };
		
		Solution s1 = new Solution();
		
		System.out.println(Arrays.toString(s1.solution(arr, com)));

	}

}
/*
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
*/