package Labels;

public class SimpleLabel implements Label {
    public String value;

    public SimpleLabel(String value){
        this.value = value;
    }

    @Override
    public String getText() {
        return value;
    }
}
