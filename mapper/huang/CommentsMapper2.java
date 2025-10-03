package cn.kgc.mapper.huang;

import cn.kgc.entity.h.Comments;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentsMapper2 {
    public List<Comments> selectComments(@Param("rid") Integer rid, @Param("content") Boolean content);
}
