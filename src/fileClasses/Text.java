package fileClasses;

import java.util.ArrayList;

public abstract class Text {
 protected ArrayList<String> fullText;
 protected String defaultText;

    public Text() {
        this.fullText =new ArrayList<>();
    }

    public void addStringToList_fullText(String string) {
        this.fullText.add(string);
    }

    public ArrayList<String> getFullText() {
        return fullText;
    }

    public void setFullText(ArrayList<String> fullText) {
        this.fullText = fullText;
    }

    public String getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(String defaultText) {
        this.defaultText = defaultText;
    }
}
