package com.fintech.openbangking.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class MemberEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idx;

    @Column
    public String id;

    @Column
    public String password;

    @Column
    public String phone;

    @Column
    public String address;

    @Column
    public String email;

    @Column
    public String name;

}
