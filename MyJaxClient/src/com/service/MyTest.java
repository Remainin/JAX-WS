/**
 * 
 */
package com.service;

/**
 * CreateDate：2017-4-19下午09:43:35
 * Location：HIT
 * Author: Zhang Mingshuai
 * TODO
 * return
 */
public class MyTest {
	
	private ProductManagementService my_WS;
	private ProductManagementDelegate back;
	
	public MyTest(){	//连接对应的WSDL
		my_WS = new ProductManagementService();
		back = my_WS.getProductManagementPort();
		//System.out.println(back.getProductList());
	}			//以下对应各类服务器端的方法
	public String add(String id, String description, String count,
			String price){
		return back.add(id, description, count, price);
	}
	public String getOne(String id){
		return back.getOne(id);
	}
	public String getProductList(){
		return back.getProductList();
	}
	public String getDescription(String id){
		return back.getDescription(id);
	}
	public String getCount(String id){
		return back.getCount(id);
	}
	public String getPrice(String id){
		return back.getPrice(id);
	}
	public String buy(String id){
		return back.buy(id);
	}
	public String confirm(String id){
		return back.confirm(id);
	}
	
}
