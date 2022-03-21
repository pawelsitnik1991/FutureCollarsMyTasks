package Lesson5.Text;

public class Text {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public void mainTextComparison() {
        if (!isTextEmpty()) {
            System.out.println(isPalindrome());
            System.out.println(textLenght());
        }
    }

    public boolean isPalindrome() {
        StringBuilder stringBuilder = new StringBuilder(text);
        String palindrome = (stringBuilder.reverse().toString());
        return palindrome.equals(text);
    }

    public int textLenght() {
        return text.length();
    }

    public boolean isTextEmpty() {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.isEmpty();
    }


}