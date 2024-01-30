package p4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardController {
	
	@Autowired private BoardDAO dao;
	// 클래스간의 객체연결은 Spring이 알아서 할테니 필요한 내용만 써라!
	
	public List<BoardDTO> getBoardList() throws Exception {
		return dao.selectList();
	}

}
