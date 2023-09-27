import java.util.ArrayList;

public class History {

    private static final History history = new History();
    private ArrayList<String> list = new ArrayList<String>();

    private History() {

    }

    public static History getHistoryInstance() {
        return history;
    }

    public void update(String str) {
        list.add(str);
    }

    public String getList() {
        String str = "";
        for(String s : list) {
            str+=s+"\n";
        }
        return str;
    }
    
}
