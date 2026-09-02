package kr.ac.kopo.board.dao;

import java.util.List;

import kr.ac.kopo.vo.MemberVO;

public interface MemberDAO {

	/**
	 * 회원가입
	 */
	void insert(MemberVO member);
	
	/**
	 * 전체 회원 조회 기능
	 */
	List<MemberVO> selectAll();
}
