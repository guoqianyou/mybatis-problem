package com.test.common;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author guoqianyou
 * @date 2018/9/26 14:41
 */
@Slf4j
public class BaseController<BS extends BaseService, M extends BaseModel> {
    @Autowired
    protected BS baseService;

}
