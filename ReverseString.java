public class ReverseString {
    String[] str = { "s", "t", "r" };

    public String main(String str) {

        String ans = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            ans += str.charAt(i);
        }
        return ans;
    }
}
