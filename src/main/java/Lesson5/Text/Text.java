package Lesson5.Text;

public class Text {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public void mainTextComparison() {
        if (!isCharactersInTheText()) {
            System.out.println(isPalindrome());
            System.out.println(textLenght());
        }
    }

    public boolean isPalindrome() {
        String palindrome = (stringBuilder(text).reverse().toString());
        return palindrome.equals(text);
    }

    public int textLenght() {
        return stringBuilder(text).length();
    }

    public boolean isCharactersInTheText() {
        return stringBuilder(text).isEmpty();
    }

    private StringBuilder stringBuilder(String text) {
        return new StringBuilder(text);
    }


}