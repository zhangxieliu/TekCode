package org.tek.code.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.SimpleTimeZone;

/**
 * @Author Nick
 * @CreateTime 2020/9/17
 */
@Entity
@Data
public class Times implements Serializable{

    private static final long serialVersionUID = -1;

    private String id;
    private String dates;

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
