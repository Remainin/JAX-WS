package com.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.RandomAccessFile;

@javax.jws.WebService(targetNamespace = "http://service.com/", serviceName = "ProductManagementService", portName = "ProductManagementPort", wsdlLocation = "WEB-INF/wsdl/ProductManagementService.wsdl")
public class ProductManagementDelegate {

	com.service.ProductManagement productManagement = new com.service.ProductManagement();

	public String getOne(String id) {
		return productManagement.getOne(id);
	}

	public String add(String id, String description, String count, String price) {
		return productManagement.add(id, description, count, price);
	}

	public String getProductList() {
		return productManagement.getProductList();
	}

	public String getDescription(String id) {
		return productManagement.getDescription(id);
	}

	public String getCount(String id) {
		return productManagement.getCount(id);
	}

	public String getPrice(String id) {
		return productManagement.getPrice(id);
	}

	public String buy(String id) {
		return productManagement.buy(id);
	}

	public String confirm(String id) {
		return productManagement.confirm(id);
	}

}