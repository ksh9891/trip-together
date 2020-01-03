package com.toyproject.api.triptogetherapi.api;

import com.toyproject.api.triptogetherapi.model.Board;
import com.toyproject.api.triptogetherapi.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/board")
@RestController
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping
    public void addBoard(@RequestBody Board board) {
        boardService.addBoard(board);
    }

    @GetMapping
    public List<Board> retrieveAllBoard() {
        return boardService.retrieveAllBoard();
    }

    @GetMapping(path = "{id}")
    public Optional<Board> retrieveBoard(@PathVariable("id") int id) {
        return boardService.retrieveBoard(id);
    }
}
