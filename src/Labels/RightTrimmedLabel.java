package Labels;

public class RightTrimmedLabel implements Label{
    private final Label label;
    public RightTrimmedLabel(Label label){
        this.label = label;
    }
    @Override
    public String getText() {
        String text = label.getText();
        final int len = text.length();
        int charIndex = len;
        for(int i = len - 1; i >= 0; i--){
            if(text.charAt(i) == ' '){
                charIndex--;
                continue;
            }
            break;
        }
        return text.substring(0, charIndex);
    }
}
