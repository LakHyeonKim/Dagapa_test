package com.kbds.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private int userno;
    private String id;
    private String pw;
    private String nickname;
    private String phone;
}
