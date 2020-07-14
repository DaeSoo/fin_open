package com.fintech.openbangking.controller;


import com.fintech.openbangking.dto.BoardDto;
import com.fintech.openbangking.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    @GetMapping
    public String boardList(){
        return "/board/list";
    }

    @GetMapping
    public String boardWrite(){
        return "board/write";
    }

    @PostMapping("/post")
    public String write(BoardDto boardDto){
        boardService.savePost(boardDto);
        return "board/write";
    }


    @GetMapping
    public String boardUpdate(){
        return "/board/update";
    }

    @GetMapping
    public String boardDelte(){
        return "/board/delete";
    }

}
