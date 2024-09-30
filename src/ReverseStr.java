import java.util.Arrays;

public class ReverseStr {
  public String reverseStr(String str){
    char[] sol = str.toCharArray();
    Arrays.sort(sol);
    return new StringBuilder(new String(sol)).reverse().toString();
  }

  public static void main(String[] args) {
    ReverseStr rs = new ReverseStr();
    System.out.println(rs.reverseStr("Zbcdefg"));
  }
}