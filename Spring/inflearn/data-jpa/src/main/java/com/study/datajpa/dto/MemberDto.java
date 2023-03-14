package com.study.datajpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

}
