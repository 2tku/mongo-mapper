package eu.dozd.mongo.entity;

import eu.dozd.mongo.annotation.Embedded;
import eu.dozd.mongo.annotation.EncryptField;
import eu.dozd.mongo.annotation.Entity;
import eu.dozd.mongo.annotation.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class TestEntityWithEncrypt2 implements Serializable {
    @Id
    private String id;
    private String name;

    @EncryptField
    private String embedded;

    private List<TestEntityWithEncrypt> listObj;

    private TimeTicketStatus times_ticket_status;

    // ----

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmbedded() {
        return embedded;
    }

    public void setEmbedded(String embedded) {
        this.embedded = embedded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TestEntityWithEncrypt> getListObj() {return this.listObj;}

    public void setListObj(List<TestEntityWithEncrypt> listObj) {this.listObj = listObj;}

    public TimeTicketStatus getTimes_ticket_status() { return times_ticket_status; }

    public void setTimes_ticket_status(TimeTicketStatus times_ticket_status) { this.times_ticket_status = times_ticket_status; }

    @Embedded
    public static class TimeTicketStatus implements Serializable {

        private Long total_time;
        private Long last_updated_time;
        @EncryptField
        private String encryptString;

        public TimeTicketStatus () { }

        public TimeTicketStatus (Long total, Long updateTime, String encryptString) {
            this.total_time = total;
            this.last_updated_time = updateTime;
            this.encryptString = encryptString;
        }

        public Long getTotal_time() {
            return total_time;
        }

        public Long getLast_updated_time() {
            return last_updated_time;
        }

        public String getEncryptString() {
            return encryptString;
        }

        public void setTotal_time(Long total_time) {
            this.total_time = total_time;
        }

        public void setLast_updated_time(Long last_updated_time) {
            this.last_updated_time = last_updated_time;
        }

        public void setEncryptString(String encryptString) {
            this.encryptString = encryptString;
        }
    }
}
