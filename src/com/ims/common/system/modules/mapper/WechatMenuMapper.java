package com.ims.common.system.modules.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ims.common.core.annotation.Mapper;
import com.ims.common.core.matatype.Dto;
import com.ims.common.system.modules.po.WechatMenuPO;

/**
 * 
 * 类描述：<b>微信菜单信息[wechat_menu]数据访问接口</b>
 * 创建人：陈骑元
 * 邮箱：240823329@qq.com
 * 创建时间：2017-05-02 12:29:51
 * 修改人：
 * 修改时间：
 * 修改备注： 
 * @version 1.0
 */
@Mapper
public interface WechatMenuMapper {

	/**
	 * 插入一个数据持久化对象(插入字段为传入PO实体的非空属性)
	 * <p> 防止DB字段缺省值需要程序中再次赋值
	 *
	 * @param wechatMenuPO
	 *            要插入的数据持久化对象
	 * @return 返回影响行数
	 */
	int insert(WechatMenuPO wechatMenuPO);
	
	/**
	 * 插入一个数据持久化对象(含所有字段)
	 * 
	 * @param wechatMenuPO
	 *            要插入的数据持久化对象
	 * @return 返回影响行数
	 */
	int insertAll(WechatMenuPO wechatMenuPO);

	/**
	 * 根据主键修改数据持久化对象
	 * 
	 * @param wechatMenuPO
	 *            要修改的数据持久化对象
	 * @return int 返回影响行数
	 */
	int updateByKey(WechatMenuPO wechatMenuPO);

	/**
	 * 根据主键查询并返回数据持久化对象
	 * 
	 * @return WechatMenuPO
	 */
	WechatMenuPO selectByKey(@Param(value = "menu_id") String menu_id);

	/**
	 * 根据唯一组合条件查询并返回数据持久化对象
	 * 
	 * @return WechatMenuPO
	 */
	WechatMenuPO selectOne(Dto pDto);

	/**
	 * 根据Dto查询并返回数据持久化对象集合
	 * 
	 * @return List<WechatMenuPO>
	 */
	List<WechatMenuPO> list(Dto pDto);

	/**
	 * 根据Dto查询并返回分页数据持久化对象集合
	 * 
	 * @return List<WechatMenuPO>
	 */
	List<WechatMenuPO> listPage(Dto pDto);
		
	/**
	 * 根据Dto模糊查询并返回数据持久化对象集合(字符型字段模糊匹配，其余字段精确匹配)
	 * 
	 * @return List<WechatMenuPO>
	 */
	List<WechatMenuPO> like(Dto pDto);

	/**
	 * 根据Dto模糊查询并返回分页数据持久化对象集合(字符型字段模糊匹配，其余字段精确匹配)
	 * 
	 * @return List<WechatMenuPO>
	 */
	List<WechatMenuPO> likePage(Dto pDto);

	/**
	 * 根据主键删除数据持久化对象
	 *
	 * @return 影响行数
	 */
	int deleteByKey(@Param(value = "menu_id") String menu_id);
	
	/**
	 * 批量根据主键删除数据持久化对象
	 *
	 * @return 影响行数
	 */
    int batchDeleteByKey(List<String> menu_idList);
	
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
