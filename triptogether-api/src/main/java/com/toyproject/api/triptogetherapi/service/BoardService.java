package com.toyproject.api.triptogetherapi.service;

import com.toyproject.api.triptogetherapi.dao.BoardDao;
import com.toyproject.api.triptogetherapi.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    private final BoardDao boardDao;

    @Autowired
    public BoardService(@Qualifier("fakeDao") BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public void addBoard(Board board) {
        boardDao.insertBoard(board);
    }

    public List<Board> retrieveAllBoard() {
        return boardDao.selectAllBoard();
    }

    public Optional<Board> retrieveBoard(int id) {
        return boardDao.selectBoard(id);
    }
}
