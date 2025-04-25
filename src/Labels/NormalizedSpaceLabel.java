package Labels;

public class NormalizedSpaceLabel implements Label{
    private final Label label;
    public NormalizedSpaceLabel(Label label){
        this.label = label;
    }
    @Override
    public String getText() {
        String text = label.getText();
        StringBuilder res = new StringBuilder();
        boolean prevWasSpace = false;
        for(char c: text.toCharArray()){
            if(c == ' '){
                if(!prevWasSpace){
                    res.append(' ');
                    prevWasSpace = true;
                }
            }
            else{
                res.append(c);
                prevWasSpace = false;
            }
        }
        return res.toString();
    }
}
