package Labels;

public class CapitalizedLabel implements Label{
    private final Label label;
    public CapitalizedLabel(Label l){
        this.label = l;
    }

    @Override
    public String getText() {
        String text = label.getText();
        if(!text.isEmpty() && Character.isLetter(text.charAt(0))){
            text = Character.toUpperCase(text.charAt(0)) + text.substring(1);
        }
        return text;
    }
}
