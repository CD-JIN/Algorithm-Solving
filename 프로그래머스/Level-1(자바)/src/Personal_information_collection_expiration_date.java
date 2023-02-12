import java.util.*;

public class Personal_information_collection_expiration_date {
	// 나의 풀이
	public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> al = new ArrayList<>();
        String[] todayArr = today.split("[.]");
        HashMap<String, Integer> termsMap = new HashMap<>();
        for(String str : terms) {
            String[] arr = str.split(" ");
            String kind = arr[0];
            int period = Integer.parseInt(arr[1]);
            termsMap.put(kind, period);
        }
        
        for(int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            String date = arr[0];
            String kind = arr[1];
            String[] dateArr = date.split("[.]");
            int year = Integer.parseInt(dateArr[0]);
            int month = Integer.parseInt(dateArr[1]);
            int day = Integer.parseInt(dateArr[2]);
            int plusYear = termsMap.get(kind)/12;
            int plusMonth = termsMap.get(kind)%12;
            year += plusYear;
            month += plusMonth;
            if(month > 12) {
                year += 1;
                month = month%12;
            }
            // 기한 오버 체크
            if(Integer.parseInt(todayArr[0]) < year) continue;
            else if(Integer.parseInt(todayArr[0]) == year) {
                if(Integer.parseInt(todayArr[1]) < month) continue;
                else if(Integer.parseInt(todayArr[1]) == month) {
                    if(Integer.parseInt(todayArr[2]) <= day) continue;
                    else {
                        al.add(i+1);
                    }
                } else {
                    al.add(i+1);
                }
            } else {
                al.add(i+1);
            }
        }
        
        return al.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
	
	// 다른사람 풀이
	public int[] solution1(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        int date = getDate(today);

        for (String s : terms) {
            String[] term = s.split(" ");

            termMap.put(term[0], Integer.parseInt(term[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");

            if (getDate(privacy[0]) + (termMap.get(privacy[1]) * 28) <= date) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(integer -> integer).toArray();
    }

    private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
