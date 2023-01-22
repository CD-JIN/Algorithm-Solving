
public class Add_polynomial {
	// StringBuilder 쓰고 if문 손 더 볼수 있을 것 같다. 성능향상 개선가능
	public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int linear = 0;
        int constant = 0;
        for(String s : arr) {
            if (s.equals("x")) {
                linear += 1;
            } else if (s.contains("x")) {
                linear += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                constant += Integer.parseInt(s);
            }
        }
        if (linear != 0 && constant == 0) {
            if (linear == 1) {
                answer += "x";
            } else {
                answer += linear + "x";
            }
        }
        if (linear != 0 && constant != 0) {
            if (linear == 1) {
                answer += "x" + " + " + constant;
            } else {
                answer += linear + "x" + " + " + constant;
            }
        }
        if (linear == 0 && constant != 0) {
            answer += constant;
        }
        return answer;
    }
	// 객체 지향
	private String replace_charcter = " + ";
    private String split_character = ",";
    private char variable = 'x';
    private int coefficientOfX = 0;
    private int constant = 0;
    boolean checkX = false;
    public String solution1(String polynomial) {
        if (polynomial.indexOf(variable) >= 0) {
            checkX = true;
        }
        polynomial = polynomial.replace(replace_charcter, split_character);
        String[] splitted = polynomial.split(split_character);
        for (String word : splitted) {
            setCoefficientAndConstant(word);
        }
        return getAnswer(polynomial);
    }

    private String getAnswer(String polynomial) {
        String answer = "";
        if (coefficientOfX > 1) {
            answer = "" + coefficientOfX + variable;
            if (constant > 0) {
                answer += replace_charcter + constant;
            }
        } else {
            if (checkX) {
                answer += variable;
                if (constant > 0) {
                    answer += replace_charcter + constant;
                }
            } else {
                answer += constant;
            }
        }
        return answer;
    }

    private void setCoefficientAndConstant(String word) {
        char x = word.charAt(word.length() - 1);
        String number = word.replace(String.valueOf(variable), "");
        if (Character.compare(variable, x) == 0) {
            coefficientOfX += getConstant(number);
        } else {
            constant += Integer.parseInt(number);
        }
    }

    private int getConstant(String number) {
        if (!number.isEmpty()) {
            return Integer.parseInt(number);
        }
        return 1;
    }
    //
    public String solution2(String polynomial) {
        int x = 0;
        int n = 0;
        String[] operands = polynomial.split(" ");
        for (String op : operands) {
            if ("+".equals(op)) {
                continue;
            }
            if (op.charAt(op.length() - 1) == 'x') {
                if (op.length() == 1) {
                    ++x;
                } else {
                    x += Integer.parseInt(op.substring(0, op.length() - 1));
                }
                continue;
            }
            n += Integer.parseInt(op);
        }
        if (x == 0 && n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if (x != 0) {
            if (x != 1) {
                sb.append(x);
            }
            sb.append('x');
        }
        if (x != 0 && n != 0) {
            sb.append(" + ");
        }
        if (n != 0) {
            sb.append(n);
        }
        return sb.toString();
    }
}
