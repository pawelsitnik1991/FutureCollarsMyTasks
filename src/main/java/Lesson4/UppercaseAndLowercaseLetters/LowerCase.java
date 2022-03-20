package Lesson4.UppercaseAndLowercaseLetters;

public class LowerCase implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
