package org.zerock.domain;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {

	private int pageNum; // 페이지 번호
	private int amount;  // 한 페이지당 데이터의 개수 
	
	private String type;
	private String keyword;
	
	public Criteria() {
		this(1,10); // 1페이지 / 10개 데이터
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		
		return type == null? new String[] {}: type.split("");
	}
	
	public String getListLink() {
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
				.queryParam("pageNum", this.pageNum)
				.queryParam("amount", this.getAmount())
				.queryParam("type", this.getType())
				.queryParam("keyword", this.getKeyword());
		
		return builder.toUriString();
	}
}
