package com.mrc.oauth2Java.dto;

import com.mrc.oauth2Java.domain.member.Member;
import com.mrc.oauth2Java.domain.member.MemberRole;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
public class MemberJoinRequestDto {


    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String name;
    @NotNull
    private MemberRole role;

    @Builder
    public MemberJoinRequestDto(String email, String password, String name, MemberRole role) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.role = role;
    }


}