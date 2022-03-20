package Lesson4.UppercaseAndLowercaseLetters;

public class UpperCase implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
