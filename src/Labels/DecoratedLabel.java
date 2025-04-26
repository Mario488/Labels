package Labels;

public class DecoratedLabel implements Label{
    private final Label label;
    public DecoratedLabel(Label label){
        this.label = label;
    }
    @Override
    public String getText() {
        return "-={ " + label.getText() + " }=-";
    }
}
