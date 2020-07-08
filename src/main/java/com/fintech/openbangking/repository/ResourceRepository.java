package com.fintech.openbangking.repository;

import com.fintech.openbangking.domain.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
