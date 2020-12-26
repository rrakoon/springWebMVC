package org.zerock.domain;

import java.util.ArrayList;

import lombok.Data;

@Data
public class SampleDTOList {
	public ArrayList<SampleDTO> list;
	
	public SampleDTOList() {
		list = new ArrayList<>();
	}
}
