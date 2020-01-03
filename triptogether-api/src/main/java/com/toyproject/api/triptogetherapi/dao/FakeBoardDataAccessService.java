package com.toyproject.api.triptogetherapi.dao;

import com.toyproject.api.triptogetherapi.model.Board;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDao")
public class FakeBoardDataAccessService implements BoardDao {

    private final List<Board> DB = new ArrayList<>();

    @Override
    public int insertBoard(Board board) {
        int id = DB.size() + 1;
        DB.add(new Board(id, board.getTitle(), board.getContent()));
        return 1;
    }

    @Override
    public List<Board> selectAllBoard() {
        return DB;
    }

    @Override
    public Optional<Board> selectBoard(int id) {
        return DB.stream()
                .filter(board -> board.getId() == id)
                .findFirst();
    }

    @Override
    public int deleteBoard(int id) {
        return 0;
    }

    @Override
    public int updateBoard(int id, Board newBoard) {
        return 0;
    }
}
