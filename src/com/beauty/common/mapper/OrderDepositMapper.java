package com.beauty.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ims.common.core.annotation.Mapper;
import com.ims.common.core.matatype.Dto;
import com.beauty.common.po.OrderDepositPO;

/**
 * 
 * 类描述：<b>定金信息[bis_order_deposit]数据访问接口</b>
 * 创建人：陈骑元
 * 邮箱：240823329@qq.com
 * 创建时间：2017-05-07 22:47:13
 * 修改人：
 * 修改时间：
 * 修改备注： 
 * @version 1.0
 */
@Mapper
public interface OrderDepositMapper {

	/**
	 * 插入一个数据持久化对象(插入字段为传入PO实体的非空属性)
	 * <p> 防止DB字段缺省值需要程序中再次赋值
	 *
	 * @param orderDepositPO
	 *            要插入的数据持久化对象
	 * @return 返回影响行数
	 */
	int insert(OrderDepositPO orderDepositPO);
	
	/**
	 * 插入一个数据持久化对象(含所有字段)
	 * 
	 * @param orderDepositPO
	 *            要插入的数据持久化对象
	 * @return 返回影响行数
	 */
	int insertAll(OrderDepositPO orderDepositPO);

	/**
	 * 根据主键修改数据持久化对象
	 * 
	 * @param orderDepositPO
	 *            要修改的数据持久化对象
	 * @return int 返回影响行数
	 */
	int updateByKey(OrderDepositPO orderDepositPO);

	/**
	 * 根据主键查询并返回数据持久化对象
	 * 
	 * @return OrderDepositPO
	 */
	OrderDepositPO selectByKey(@Param(value = "deposit_id") String deposit_id);

	/**
	 * 根据唯一组合条件查询并返回数据持久化对象
	 * 
	 * @return OrderDepositPO
	 */
	OrderDepositPO selectOne(Dto pDto);

	/**
	 * 根据Dto查询并返回数据持久化对象集合
	 * 
	 * @return List<OrderDepositPO>
	 */
	List<OrderDepositPO> list(Dto pDto);

	/**
	 * 根据Dto查询并返回分页数据持久化对象集合
	 * 
	 * @return List<OrderDepositPO>
	 */
	List<OrderDepositPO> listPage(Dto pDto);
		
	/**
	 * 根据Dto模糊查询并返回数据持久化对象集合(字符型字段模糊匹配，其余字段精确匹配)
	 * 
	 * @return List<OrderDepositPO>
	 */
	List<OrderDepositPO> like(Dto pDto);

	/**
	 * 根据Dto模糊查询并返回分页数据持久化对象集合(字符型字段模糊匹配，其余字段精确匹配)
	 * 
	 * @return List<OrderDepositPO>
	 */
	List<OrderDepositPO> likePage(Dto pDto);

	/**
	 * 根据主键删除数据持久化对象
	 *
	 * @return 影响行数
	 */
	int deleteByKey(@Param(value = "deposit_id") String deposit_id);
	
	/**
	 * 批量根据主键删除数据持久化对象
	 *
	 * @return 影响行数
	 */
    int batchDeleteByKey(List<String> deposit_idList);
	
	/**
	 * 根据Dto统计行数
	 * 
	 * @param pDto
	 * @return
	 */
	int rows(Dto pDto);
	
	/**
	 * 根据数学表达式进行数学运算
	 * 
	 * @param pDto
	 * @return String
	 */
	String calc(Dto pDto);
	
}
