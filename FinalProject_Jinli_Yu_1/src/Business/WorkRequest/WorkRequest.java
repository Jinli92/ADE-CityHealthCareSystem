/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jinliyu
 */
public class WorkRequest {
    private String message;
    private String sender;
    private Date sendDate;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
    
    @Override
    public String toString(){
    SimpleDateFormat format =  new SimpleDateFormat("dd-MM-yyyy hh:mm z");
        return format.format(sendDate);
    }
    
}
