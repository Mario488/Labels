package Labels;

public class CensoredLabel implements Label{
    private final Label label;
    private final String word;
    public CensoredLabel(Label label, String word){
        this.label = label;
        this.word = word;
    }

    @Override
    public String getText() {
        String text = label.getText();
        return text.replaceAll(word, "*".repeat(word.length()));
    }
}
