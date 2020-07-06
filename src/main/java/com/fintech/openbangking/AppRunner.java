package com.fintech.openbangking;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.fintech.openbangking.domain.Board;
import com.fintech.openbangking.domain.User;
import com.fintech.openbangking.domain.enums.BoardType;
import com.fintech.openbangking.repository.BoardRepository;
import com.fintech.openbangking.repository.UserRepository;

@Component
public class AppRunner implements ApplicationRunner{

	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	BoardRepository boardRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		User user = userRepository.save(User.builder()
				.name("daesoo")
				.password("tlseotn1@")
				.email("daesoo@example.com")
				.createdDate(LocalDateTime.now())
				.build()
				);
		
		IntStream.rangeClosed(1, 200).forEach(index ->
			boardRepository.save(Board.builder()
					.title("Content" + index)
					.subTitle("Order" + index)
					.content("Content Example"+ index)
					.boardType(BoardType.free)
                    .createdDate(LocalDateTime.now())
                    .updatedDate(LocalDateTime.now())
                    .user(user).build()));		
	}
}
