package com.hyb.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyb.reader.entity.Test;

public interface TestMapper extends BaseMapper<Test> {
    public void insertSample();
}
