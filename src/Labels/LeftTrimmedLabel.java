package Labels;

public class LeftTrimmedLabel implements Label {
    private final Label label;
    public LeftTrimmedLabel(Label l){
        this.label = l;
    }

    @Override
    public String getText() {
        String text = label.getText();
        int charIndex = 0;
        for(char c: text.toCharArray()){
            if(c == ' '){
                charIndex++;
                continue;
            }
            break;
        }
        return text.substring(charIndex);
    }
}
