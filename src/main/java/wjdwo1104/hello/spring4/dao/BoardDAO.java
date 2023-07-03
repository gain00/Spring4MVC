package wjdwo1104.hello.spring4.dao;

import wjdwo1104.hello.spring4.model.Board;

import java.util.List;

public interface BoardDAO {
    List<Board> selectBoard(int snum);

    Board selectOneBoard(String bno);

    int insertBoard(Board bd);//데이터가 실제로 들어갔는지 볼려고 int


}
