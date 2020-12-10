package com.ycx.mybatis.dto;

import com.ycx.mybatis.model.Student;
import lombok.Data;

import java.util.List;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 17:20
 * @description
 **/
@Data
public class PageDto<T> {
    private Integer total;
    private List<T> data;
    private Integer totalPage;
}
