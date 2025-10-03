package cn.kgc.service.huang;

import cn.kgc.entity.h.Comments;

import java.util.List;

public interface CommentsService2 {
    public List<Comments> getAllComments(Integer rid, Boolean content);
}
