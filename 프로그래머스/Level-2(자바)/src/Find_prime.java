import java.util.*;

public class Find_prime {
	public static void main(String[] args) {
		Find_prime fm = new Find_prime();
		String num1 = "17";
		String num2 = "011";
		fm.solution(num1);
//		fm.solution(num2);
	}
	
	static HashSet<Integer> set = new HashSet<>(); // 중복값 제거 위한 set
    static char[] arr; 
    static boolean[] visited; 
    
    public int solution(String numbers) {
        int answer = 0;
        arr = numbers.toCharArray();
        visited = new boolean[numbers.length()];
                
        recursion("", 0); // 재귀함수
        
        answer = set.size();
        return answer;
    }
    
    public void recursion(String str, int idx){
        
        int num;
        if(str != ""){
            num = Integer.parseInt(str);
            if(isPrime(num)) set.add(num); 
        }
        if(idx==arr.length) return; // 끝까지 다했을 때 
        
        for(int i=0; i < arr.length; i++){
            if(visited[i]) continue; 
            visited[i] = true; 
            recursion(str+arr[i], idx+1); 
            visited[i] = false;
        }
    }
    
    // 소수 판별
    public boolean isPrime(int num){
        if(num==0 || num==1) return false;
        for(int i=2; i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    /* 다른사람 풀이
     * 
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }        
        return count;
    }

    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }

        public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        //if (n == 0) System.out.println(prefix);
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
          permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
    }
    */
}
