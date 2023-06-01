package com.mid.alcohol.repository;

import java.util.List;

import com.mid.alcohol.domain.Comment;

public interface CommentRepository {
    
    int insert(Comment comment);
    List<Comment> selectByBoardId(long boardId);
    int update(Comment entity);
    int delete(long id);
    // 포스트 댓글 개수 세기
    long selectCommentCountWithBoardId(long boardId);
    
}
