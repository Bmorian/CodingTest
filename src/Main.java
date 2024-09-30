import java.util.*;

public class Main {
  public static String solution(String s) {
    // 문자열을 문자 배열로 변환
    Character[] charArray = new Character[s.length()];
    for (int i = 0; i < s.length(); i++) {
      charArray[i] = s.charAt(i);
    }

    // 문자 배열을 내림차순으로 정렬
    Arrays.sort(charArray, Collections.reverseOrder());

    // 정렬된 문자 배열을 문자열로 변환
    StringBuilder sortedString = new StringBuilder(charArray.length);
    for (char c : charArray) {
      sortedString.append(c);
    }

    return sortedString.toString();
  }

  public static void main(String[] args) {
    String s = "Zbcdefg"; // 입력: Zbcdefg
    System.out.println(solution(s));  // 출력: gfedcbZ
  }
}

