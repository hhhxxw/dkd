package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Region;
import lombok.Data;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-16 21:11
 */
@Data
public class RegionVo extends Region {
    // 点位数量
    private int nodeCount;
}
