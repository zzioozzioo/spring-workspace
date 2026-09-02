package kr.ac.kopo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.MemberDAO;
import kr.ac.kopo.mapper.MemberMapper;
import kr.ac.kopo.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDao;

	@Override
	public void registerMember(MemberVO member) throws Exception {
		memberDao.insert(member);
	}
	
	@Override
	public List<MemberVO> getMemberList() throws Exception {
		
		List<MemberVO> memberList = memberDao.selectAll();
		return memberList;
	}
}
