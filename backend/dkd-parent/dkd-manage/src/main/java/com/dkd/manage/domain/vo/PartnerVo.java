package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Partner;
import lombok.Data;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-07 10:52
 */
@Data
public class PartnerVo extends Partner {
    // 点位的数量
    private int nodeCount;
}
