package wjdwo1104.hello.spring4.service;

import wjdwo1104.hello.spring4.model.Board;

import java.util.List;

public interface BoardService {

    List<Board> readBoard(int cpg);


   Board readOneBoard(String bno);//string int의차이는 산수식에 사용하는지 안하는지



}
