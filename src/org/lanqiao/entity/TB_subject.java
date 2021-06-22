package org.lanqiao.entity;

import java.math.BigDecimal;

public class TB_subject {
    private BigDecimal subject_id;
    private String subject_name;

    public BigDecimal getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(BigDecimal subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
}
