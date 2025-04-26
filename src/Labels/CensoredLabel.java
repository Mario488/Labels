package Labels;

public class CensoredLabel implements Label{
    private final Label label;
    public CensoredLabel(Label label){
        this.label = label;
    }

    @Override
    public String getText() {

        return "";
    }
}
