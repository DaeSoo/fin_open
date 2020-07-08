package com.fintech.openbangking.dto;


import com.fintech.openbangking.domain.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private Long idx;

    private String id;

    private String password;

    private String phone;

    private String address;

    private String email;

    private String name;

    public MemberEntity toMember(){
        return MemberEntity.builder()
                .idx(idx)
                .id(id)
                .password(password)
                .phone(phone)
                .address(address)
                .email(email)
                .name(name)
                .build();
    }

    public MemberDto(Long idx, String id, String password, String phone, String address, String email, String name){
        this.idx=idx;
        this.id=id;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.name = name;
    }
}
