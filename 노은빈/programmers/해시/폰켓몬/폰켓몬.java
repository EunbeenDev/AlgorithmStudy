import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length/2; // 선택할 수 있는 포켓몬 수
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int size = set.size(); // 포켓몬 종류의 크기

        if(size >= len) { //포켓몬 종류가 선택지보다 많으면 -> 길이 그대로 반환
            answer = len;
        }
        else {
            answer = size; // 종류의 수는 변하지 않으므로 포켓몬의 종류수 반환
        }
        return answer;
    }
}


