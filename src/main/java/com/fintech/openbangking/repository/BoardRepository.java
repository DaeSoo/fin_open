package com.fintech.openbangking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fintech.openbangking.domain.Board;
import com.fintech.openbangking.domain.User;

public interface BoardRepository extends JpaRepository<Board, Long>{

	Board findByUser(User user);
}
