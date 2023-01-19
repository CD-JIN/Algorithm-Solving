
public class I_hate_English {
	public long solution(String numbers) {
        String[] arr = numbers.split("");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("o")) {
                ans.append("1");
                i += 2;
            } else if(arr[i].equals("t")) {
                if(arr[i+1].equals("w")) {
                    ans.append("2");
                    i += 2;
                } else {
                    ans.append("3");
                    i += 4;
                }
            } else if(arr[i].equals("f")) {
                if(arr[i+1].equals("o")) {
                    ans.append("4");
                    i += 3;
                } else {
                    ans.append("5");
                    i += 3;
                }
            } else if(arr[i].equals("s")) {
                if(arr[i+1].equals("i")) {
                    ans.append("6");
                    i += 2;
                } else {
                    ans.append("7");
                    i += 4;
                }
            } else if(arr[i].equals("e")) {
                ans.append("8");
                i += 4;
            } else if(arr[i].equals("n")) {
                ans.append("9");
                i += 3;
            } else if(arr[i].equals("z")) {
                ans.append("0");
                i += 3;
            }
        }
        long answer = Long.parseLong(ans.toString());
        return answer;
    }
	// replaceAll 메소드 쓰는것을 원한 문제인것 같지만...ㅋㅋ
	 public long solution1(String numbers) {
         String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
         for (int i = 0; i < numbers_arr.length; i++) {
             numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
         }
         long answer = Long.parseLong(numbers);
         return answer;
     }
}
