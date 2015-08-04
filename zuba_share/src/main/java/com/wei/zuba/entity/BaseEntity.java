package com.wei.zuba.entity;

import java.io.Serializable;

/**
 * @author Ric.W
 * @version 2015-07-09
 */
public abstract class BaseEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 实体编号（唯�?��识）
	 */
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
