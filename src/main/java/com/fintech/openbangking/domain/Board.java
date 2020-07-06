package com.fintech.openbangking.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fintech.openbangking.domain.enums.BoardType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Board {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long idx;
	
	@Column
	private String title;
	
	@Column
	private String subTitle;
	
	@Column
	private String content;
	
	@Column
	@Enumerated(EnumType.STRING)
	private BoardType boardType;
	
	@Column
	private LocalDateTime createdDate;
	
	@Column
	private LocalDateTime updatedDate;
	
	@OneToOne(fetch = FetchType.LAZY)
	private User user;
	
	
}
