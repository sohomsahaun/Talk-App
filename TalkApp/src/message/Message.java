package message;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sahaun
 */
public class Message {
    private String from, body;
    private int conversation;
    private Timestamp time;
    
    public Message(String from, int conversation, Timestamp time, String body) {
        this.from = from;
        this.conversation = conversation;
        this.time = time;
        this.body = body;
    }
    
    public String getFrom() {
        return this.from;
    }
    
    public int getConversation() {
        return this.conversation;
    }
    
    public String getBody() {
        return this.body;
    }
    
    public Timestamp getTime() {
        return this.time;
    }
    
    /*public static int getConversationId(ArrayList<String> usernames) {
        Collections.sort(usernames);
        String id =  usernames.get(0);
        for (int i = 1; i < usernames.size(); ++i) id += "_" + usernames.get(i);
        return id;
    }
    
    public static int getConversationId(String... usernames) {
        ArrayList<String> list = new ArrayList<>();
        for (String username : usernames) list.add(username);
        return getConversationId(list);
    }
    
    public static ArrayList<String> getConversationUsers(String conversation) {
        String[] arr = conversation.split("_");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
        return list;
    }*/
}
