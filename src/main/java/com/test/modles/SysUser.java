package com.test.modles;

import com.test.common.BaseModel;
import lombok.Getter;
import lombok.Setter;


/**
 * @author guoqianyou
 * @date 2018/11/5 18:35
 */
@Setter
@Getter
public class SysUser extends BaseModel {

    private String username;
    private String password;
    private Boolean status;
}
