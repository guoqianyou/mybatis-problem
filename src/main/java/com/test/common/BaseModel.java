package com.test.common;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

import static com.baomidou.mybatisplus.annotation.IdType.ASSIGN_ID;

/**
 * @author guoqianyou
 * @date 2018/9/21 15:02
 */
@Setter
@Getter
public abstract class BaseModel implements Serializable {

    private static final long serialVersionUID = 6855206694751049289L;

    @TableId(type = ASSIGN_ID)
    private String id;
    /**
     *  创建时间
     */
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    private LocalDateTime updateTime;
}
