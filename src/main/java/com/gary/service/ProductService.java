package com.gary.service;

import org.springframework.transaction.annotation.Transactional;

import com.gary.dao.ProductDao;
import com.gary.entity.Product;

/**
 * 商品管理的业务层的类
 * @author genle
 *
 */
@Transactional
public class ProductService {
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	/**
	 * 业务层保存商品的方法
	 */
	public void save(Product product){
		System.out.println("Service中的save方法执行了....");
		productDao.save(product);
	}
	
}
