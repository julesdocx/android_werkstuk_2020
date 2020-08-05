package com.example.jules_docx_werkstuk_versie2;

import java.util.Date;

public class HighFive {
    private Long highFive;
    private Date date;

    public HighFive(Long highFive, Date date) {
        this.highFive = highFive;
        this.date = date;
    }

    public Long getHighFive() {
        return highFive;
    }

    public void setHighFive(Long highFive) {
        this.highFive = highFive;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
