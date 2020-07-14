package com.fintech.openbangking.dto;

import com.fintech.openbangking.domain.BoardEntity;
import com.fintech.openbangking.domain.User;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long idx;
    private String title;
    private String subTitle;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private User user;


    public BoardEntity toEntity(){
        BoardEntity boardEntity = BoardEntity.builder()
                .idx(idx)
                .title(title)
                .subTitle(subTitle)
                .content(content)
                .build();
                return boardEntity;
    }

    @Builder
    public BoardDto(Long idx, String title, String subTitle, String content, LocalDateTime createdDate,
    LocalDateTime updatedDate){
        this.idx = idx;
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
