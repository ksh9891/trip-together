package com.toyproject.api.triptogetherapi.dao;

import com.toyproject.api.triptogetherapi.model.Board;

import java.util.List;
import java.util.Optional;

public interface BoardDao {
    int insertBoard(Board board);

    List<Board> selectAllBoard();

    Optional<Board> selectBoard(int id);

    int deleteBoard(int id);

    int updateBoard(int id, Board newBoard);
}
