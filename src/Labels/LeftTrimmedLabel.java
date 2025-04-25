package Labels;

public class LeftTrimmedLabel implements Label {
    private Label label;
    public LeftTrimmedLabel(Label l){
        this.label = l;
    }

    @Override
    public String getText() {
        String text = label.getText();
        int charIndex = 0;
        if(!text.isEmpty()){
            for(int i = 0; i < text.length(); i++){
                if(text.charAt(i) != ' '){
                    charIndex++;
                    continue;
                }
                break;
            }
        }
        return text;
    }
}
