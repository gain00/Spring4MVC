package wjdwo1104.hello.spring4.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import wjdwo1104.hello.spring4.model.Board;
import wjdwo1104.hello.spring4.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService bsrv;
    private Logger logger = LogManager.getLogger(BoardController.class);

    @GetMapping("/list")
    public String list(Model m, int cpg){

        logger.info("/board/list호출");

        m.addAttribute("boards",bsrv.readBoard(cpg));
//        m.addAttribute("psnum",cpg); // 페이지네이션 시작번호1 11 21
//        m.addAttribute("allpg",cpg); //총페이지



        //return "index"; //jsp biew resolver
        return "board/list.tiles";
    }

    @GetMapping("/write")
    public String write(Model m){

        logger.info("/board/list호출");

        //return "index"; //jsp biew resolver
        return "board/write.tiles";
    }

    @GetMapping("/view")
    public String view(Model m, String bno){
        logger.info("/board/view호출");
        Board board = bsrv.readOneBoard(bno);

        m.addAttribute("board", board);

        //return "index"; //jsp biew resolver
        return "board/view.tiles";
    }



}
