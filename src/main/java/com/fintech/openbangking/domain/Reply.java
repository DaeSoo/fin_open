package com.fintech.openbangking.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Reply {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String name;

    @Column
    private Long no;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime modifyDate;

    @Column
    private String password;

    @Column
    private String content;
}
