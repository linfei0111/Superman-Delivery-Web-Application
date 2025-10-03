package cn.kgc.service.h.impl;

import cn.kgc.entity.h.Comments;
import cn.kgc.mapper.h.CommentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.CommentsService;

import java.util.Collections;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    private CommentsMapper commentsMapper;
    public Boolean addComment(Comments comment) {
        return commentsMapper.insertComments(comment) > 0;
    }


}
