package com.test.common;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @author guoqianyou
 * @date 2018/9/21 15:07
 */
@Slf4j
public abstract class BaseService<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {
}

