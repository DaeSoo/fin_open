package com.fintech.openbangking.service;

import com.fintech.openbangking.dto.BoardDto;
import com.fintech.openbangking.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@AllArgsConstructor
@Service
public class BoardService {
	private BoardRepository boardRepository;

	@Transactional
	public Long savePost(BoardDto boardDto) {
		return boardRepository.save(boardDto.toEntity()).getIdx();
	}
}
