package eu.dozd.mongo.entity;

import eu.dozd.mongo.annotation.EncryptField;
import eu.dozd.mongo.annotation.Entity;
import eu.dozd.mongo.annotation.Id;

@Entity
public class TestEntityWithEncrypt {
    @Id
    private String id;
    private String name;

    @EncryptField
    private String embedded;

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
}
