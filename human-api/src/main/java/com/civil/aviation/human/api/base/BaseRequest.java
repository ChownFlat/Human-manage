/**
 * 文 件 名:  BaseRequest
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2018/3/20 0020
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.civil.aviation.human.api.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zping
 * @version 2018/3/20 0020
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class BaseRequest implements Serializable
{
	/**
	 * 扩展字段
	 */
	private Map<String, String> exts = null;

	@Override
	public String toString ()
	{
		final StringBuilder sb = new StringBuilder ("BaseRequest{");
		sb.append ("exts=").append (exts);
		sb.append ('}');
		return sb.toString ();
	}
}
