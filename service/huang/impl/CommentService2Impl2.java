package cn.kgc.service.huang.impl;

import cn.kgc.entity.h.Comments;
import cn.kgc.mapper.huang.CommentsMapper2;
import cn.kgc.service.huang.CommentsService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService2Impl2 implements CommentsService2 {
    @Autowired
    private CommentsMapper2 commentsMapper2;

    public List<Comments> getAllComments(Integer rid,Boolean content) {
        return commentsMapper2.selectComments(rid,content);
    }
}
