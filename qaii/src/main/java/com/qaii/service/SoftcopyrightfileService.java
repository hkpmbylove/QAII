package com.qaii.service;

import java.util.List;

import com.qaii.domain.Softcopyrightfile;

public interface SoftcopyrightfileService {
	
	int insert(Softcopyrightfile record);
	
	List<Softcopyrightfile> listBysid(int sid);
}
