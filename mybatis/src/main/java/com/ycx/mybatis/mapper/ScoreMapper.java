package com.ycx.mybatis.mapper;

import com.ycx.mybatis.model.Score;
import java.util.List;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    Score selectByPrimaryKey(Integer id);

    List<Score> selectAll();

    int updateByPrimaryKey(Score record);
}