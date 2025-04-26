package Labels;

public class ReplacedLabel implements Label{
    private final Label label;
    private final String word1;
    private final String word2;
    public ReplacedLabel(Label label, String word1, String word2){
        this.label = label;
        this.word1 = word1;
        this.word2 = word2;
    }
    @Override
    public String getText() {
        String text = label.getText();
        return text.replaceAll(word1, word2);
    }
}
