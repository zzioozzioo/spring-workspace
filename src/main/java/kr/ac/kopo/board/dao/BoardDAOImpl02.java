package kr.ac.kopo.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.mapper.BoardMapper;
import kr.ac.kopo.vo.BoardVO;

@Repository
public class BoardDAOImpl02 implements BoardDAO {
	
	@Autowired
	private BoardMapper boardMapper;
	
	public BoardDAOImpl02(BoardMapper boardMapper) {
		super();
		this.boardMapper = boardMapper;
	}

	@Override
	public List<BoardVO> selectAll() {
		System.out.println("전체 게시글 조회");
		return boardMapper.selectAll();
	}

	@Override
	public void insert(BoardVO board) {
		boardMapper.insert(board);
	}
}
