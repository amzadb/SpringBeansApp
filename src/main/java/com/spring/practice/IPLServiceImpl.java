package com.spring.practice;

import org.springframework.stereotype.Service;

@Service
public class IPLServiceImpl implements IPLService {

	public IPLTeam newTeam() {
		IPLTeam team = new IPLTeam("SRH", "Sunrisers Hyderabad");
		return team;
	}

}
