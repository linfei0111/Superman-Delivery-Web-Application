package cn.kgc.mapper.h;

import cn.kgc.entity.h.Comments;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentsMapper {
    public int insertComments(Comments comments);
}
