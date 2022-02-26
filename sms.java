import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class sms {
    private String msisdn;
    private String recipient;
    private String sender;
    private String shortCode;
    private String transID;
    private LocalDateTime timestamp;

    public sms(String msisdn, String recipient, String sender, String shortCode, String transID, LocalDateTime timestamp) {
        this.msisdn = msisdn;
        this.recipient = recipient;
        this.sender = sender;
        this.shortCode = shortCode;
        this.transID = transID;
        this.timestamp = timestamp;
    }

    public String getMsisdn() {return msisdn;}
    public String getRecipient() {return recipient;}
    public String getSender() {return sender;}
    public String getShortCode() {return shortCode;}
    public String getTransID() {return transID;}
    public LocalDateTime getTimestamp() {return timestamp;}

    public Map<String, String> getSMS(){
        Map<String, String> getSMS = new HashMap<>();
    }


}
