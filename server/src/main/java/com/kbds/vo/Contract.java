package com.kbds.vo;

import lombok.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Contract {
    private int contractno;
    private String lender;
    private String borrower;
    private int type;
    private String goods;
    private String duedate;
    private String picture;
    private String record;
    private String description;
    private int agreed;

    public void setDueDate(Timestamp timestamp){
        this.duedate = new SimpleDateFormat("yyyy-MM-dd").format(timestamp);
    }
}