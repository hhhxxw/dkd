package com.dkd.manage.mapper;

import java.util.List;
import com.dkd.manage.domain.Node;

/**
 * 点位管理Mapper接口
 * 
 * @author hxw
 * @date 2025-06-15
 */
public interface NodeMapper 
{
    /**
     * 查询点位管理
     * 
     * @param id 点位管理主键
     * @return 点位管理
     */
    public Node selectNodeById(Long id);

    /**
     * 查询点位管理列表
     * 
     * @param node 点位管理
     * @return 点位管理集合
     */
    public List<Node> selectNodeList(Node node);

    /**
     * 新增点位管理
     * 
     * @param node 点位管理
     * @return 结果
     */
    public int insertNode(Node node);

    /**
     * 修改点位管理
     * 
     * @param node 点位管理
     * @return 结果
     */
    public int updateNode(Node node);

    /**
     * 删除点位管理
     * 
     * @param id 点位管理主键
     * @return 结果
     */
    public int deleteNodeById(Long id);

    /**
     * 批量删除点位管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNodeByIds(Long[] ids);
}
