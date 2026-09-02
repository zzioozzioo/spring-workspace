package kr.ac.kopo.board.service;

import java.util.List;

import kr.ac.kopo.vo.MemberVO;

public interface MemberService {

	void registerMember(MemberVO member) throws Exception;
	List<MemberVO> getMemberList() throws Exception;
}
