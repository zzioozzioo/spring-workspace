package kr.ac.kopo.member.service;

import java.util.List;

import kr.ac.kopo.member.vo.MemberVO;

public interface MemberService {

	void registerMember(MemberVO member) throws Exception;
	List<MemberVO> getMemberList() throws Exception;
}
