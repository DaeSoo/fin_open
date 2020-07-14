package com.fintech.openbangking.repository;

import com.fintech.openbangking.domain.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>{

}
