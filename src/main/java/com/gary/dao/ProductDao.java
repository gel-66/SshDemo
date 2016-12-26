package com.gary.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.gary.entity.Product;

/**
 * 商品管理的DAO的类
 * @author genle
 *
 */
public class ProductDao extends HibernateDaoSupport{
	//业务层注入DAO的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	/**
	 * Dao中的保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("Dao中的save方法执行了...");
		this.getHibernateTemplate().save(product);
	}
	
}
