/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.model.Product;
import com.model.ProductContent;
import com.model.ProductRes;
import com.service.ProductService;
import com.util.BaseAction;

/**
 * @description: 产品管理Action类
 * @date: 2013-9-10 下午2:31:08
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class ProductAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8492619600274041444L;
	private Product product;
	private ProductRes productRes;
	private ProductContent productContent;
	private ProductService productService;
	private List list;
	private int totalRecords;
	private int pageSize;
	private int pageNo;
	private String msg;
	/**
	 * @description: 新增产品
	 * @date: 2013-9-16 下午4:30:22
	 * @author： lintz
	 * @return
	 */
	public String addProduct() {
		if(product!=null&&productRes!=null&&productContent!=null){
			if (productService.addProduct(product,productRes, productContent)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}		
		return SUCCESS;
	}
	/**
	 * @description: 删除产品
	 * @date: 2013-9-16 下午4:30:39
	 * @author： lintz
	 * @return
	 */
	public String deleteProduct() {
		HttpServletRequest req = getRequest();
		int cpid00 =Integer.parseInt(req.getParameter("cpid00"));
		if (cpid00 != 0) {
			Product product = new Product();
			product.setCpid00(cpid00);
			if (productService.deleteProduct(product)) {
				msg = "success";
			} else {
				msg = "error_sys";
			}
		} else {
			msg = "error_none";
		}
		return SUCCESS;
	}
	/**
	 * @description: 更新产品
	 * @date: 2013-9-16 下午4:30:54
	 * @author： lintz
	 * @return
	 */
	public String updateProduct() {
		if(product!=null&&productRes!=null&&productContent!=null){
			if (productService.updateProduct(product,productRes, productContent)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}		
		return SUCCESS;
	}
	/**
	 * @description: 查询产品
	 * @date: 2013-9-16 下午4:31:18
	 * @author： lintz
	 * @return
	 */
	public String queryProduct() {
		HttpServletRequest req = ServletActionContext.getRequest();
		String pageindex = req.getParameter("pageNo");
		String pagesize = req.getParameter("pageSize");
		Map properties = req.getParameterMap();
		if (pageindex != null && !pageindex.equals("")) {
			pageNo = Integer.valueOf(pageindex).intValue();
		} else {
			pageNo = 1;
		}
		if (pagesize != null && !pagesize.equals("")) {
			pageSize = Integer.valueOf(pagesize).intValue();
		} else {
			pageSize = 10;
		}
		totalRecords = this.productService.countProduct(properties);
		if (totalRecords != 0) {
			list = productService.queryProduct(properties, pageNo, pageSize);
		} else {
			list = new ArrayList();
		}
		return SUCCESS;
	}
	/**
	 * @description: 产品详情
	 * @date: 2013-9-16 下午4:31:32
	 * @author： lintz
	 * @return
	 */
	public String queryProductDetail() {
		return SUCCESS;
	}

	/*---------------------set and get method----------------------------------*/
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductRes getProductRes() {
		return productRes;
	}

	public void setProductRes(ProductRes productRes) {
		this.productRes = productRes;
	}

	public ProductContent getProductContent() {
		return productContent;
	}

	public void setProductContent(ProductContent productContent) {
		this.productContent = productContent;
	}

	public ProductService getProductService() {
		return productService;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
