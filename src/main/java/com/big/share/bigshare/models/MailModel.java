package com.big.share.bigshare.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MailModel {

    private String email;
    private String name;
    private String phone;
    private String company;
    private String comment;
}
