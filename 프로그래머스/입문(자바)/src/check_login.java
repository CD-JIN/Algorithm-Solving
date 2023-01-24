import java.util.*;

public class check_login {
	public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int i = 0; i < db.length; i++){
            if(id_pw[0].equals(db[i][0])) {
                if(id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                }
            } 
        }
        return answer;
    }
	//map 이용
	public String solution1(String[] idPw, String[][] db) {
        return getDb(db).get(idPw[0]) != null ? getDb(db).get(idPw[0]).equals(idPw[1]) ? "login" : "wrong pw" : "fail";
    }

    private Map<String, String> getDb(String[][] db) {
        Map<String, String> map = new HashMap<>();

        for (String[] array : db) {
            map.put(array[0], array[1]);
        }
        return map;
    }
}
