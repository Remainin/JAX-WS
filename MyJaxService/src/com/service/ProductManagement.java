package com.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.RandomAccessFile;

/**
 * 
 * CreateDate：2017-4-19下午08:15:02
 * Location：HIT
 * Author: Zhang Mingshuai
 * TODO JAX_WS Service Server
 * return many mathods can be called by clients
 */
public class ProductManagement {
	
	public String getOne(String id) { //获取某一个特定产品的全部信息
		String sb = null;
		String tempstr = null;
		String[] a = null; // 字符串数组用于保存从文件中读出的内容
		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) { // 当文件不存在时，创建一个
				file.createNewFile();
				PrintStream ps = new PrintStream(new FileOutputStream(file));
				String temp = "-产品名- -描述- -库存- -价格- -收货标志位-";
				for (int i = 0; i < 64; i++) {
					temp += " ";
				}
				byte[] k = new byte[64];
				k = temp.getBytes("utf-8");
				ps.write(k, 0, 62);
				ps.write("\r\n".getBytes());
			}
			FileInputStream fis = new FileInputStream(file); // 文件输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,
					"utf-8"));// 设置编码规则，放置中文乱码
			while ((tempstr = br.readLine()) != null) {
				sb = new String(tempstr);
				a = sb.split("\\s"); // 将缓冲区的字符串以空格进行分割保存至a中
				// System.out.println(a[0] + " " + a[1] + " " + a[2]);
				// //调试过程中用于debug了...
				if (a[0].equals(id)) {
					return "产品名：" + a[0] + "\n描述：" + a[1] + "\n库存：" + a[2]
							+ "\n价格：" + a[3] + "\n收货标志位：" + a[4]; // 匹配成功，返回相应的产品信息
				}

			}

			return "User not exist!";
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "System Error!"; // 意外情况时
		}
	}

	public String add(String id, String description, String count,
			String price) { // 注册

		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) { // 当文件不存在时，创建一个
				file.createNewFile();
				PrintStream ps = new PrintStream(new FileOutputStream(file));
				String temp = "-产品名- -描述- -库存- -价格- -收货标志位-";
				for (int i = 0; i < 64; i++) {
					temp += " ";
				}
				byte[] k = new byte[64];
				k = temp.getBytes("utf-8");
				ps.write(k, 0, 62);
				ps.write("\r\n".getBytes());
			}
			FileOutputStream out = new FileOutputStream(file, true); // 采用追加方式用true
			StringBuffer sb = new StringBuffer();
			sb.append(id + "\t" + description + "\t" + count + "\t" + price
					+ "\t" + "0"); // windows中换行符为\r\n,linux中换行符为\r,Mac换行符为\n
			String sbString = sb.toString();
			byte[] w = new byte[64];
			for (int i = 0; i < 64; i++) {
				sbString += " ";
			}
			w = sbString.getBytes("utf-8");
			out.write(w, 0, 62);// 转换对应的字符集utf-8,防止中文乱码。
			out.write("\r\n".getBytes());
			out.close();
			return "Add Successfully!";
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "Error when adding!";
		}
	}
	
	public String getProductList() {	//获取全部产品的名称
		String sb = null;
		String tempstr = null;
		String[] a = null; // 字符串数组用于保存从文件中读出的内容
		StringBuffer resultBuffer = new StringBuffer();
		String result = null;
		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) { // 当文件不存在时，创建一个
				return "don't have this product";
			}
			FileInputStream fis = new FileInputStream(file); // 文件输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,
					"utf-8"));// 设置统一的编码规则，放置中文乱码
			while ((tempstr = br.readLine()) != null) {
				sb = new String(tempstr);
				a = sb.split("\\s"); // 将缓冲区的字符串以空格进行分割保存至a中
				if (!a[0].equals("-产品名-")) {
					resultBuffer.append(a[0]);
					resultBuffer.append(" ");
				}

			}
			result = resultBuffer.toString();
			return " 产品清单为： " + result;
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "System Error!";
		}
	}


/*	public String getProductAll(String id) {	//此方法和getOne方法重复了，写多了。。。删除
		String sb = null;
		String tempstr = null;
		String[] a = null; // 字符串数组用于保存从文件中读出的内容
		StringBuffer resultBuffer = new StringBuffer();
		String result = null;
		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) { // 当文件不存在时，创建一个
				return "don't have this product";
			}
			FileInputStream fis = new FileInputStream(file); // 文件输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,
					"utf-8"));// 设置统一的编码规则，放置中文乱码
			while ((tempstr = br.readLine()) != null) {
				sb = new String(tempstr);
				a = sb.split("\\s"); // 将缓冲区的字符串以空格进行分割保存至a中
				if (a[0].equals(id)) {
					resultBuffer.append("产品描述：");
					resultBuffer.append(a[1]);
					resultBuffer.append(" ");
					resultBuffer.append("库存：");
					resultBuffer.append(a[2]);
					resultBuffer.append(" ");
					resultBuffer.append("价格：");
					resultBuffer.append(a[3]);
					resultBuffer.append(" ");
					resultBuffer.append("收货标志位：");
					resultBuffer.append(a[4]);
					resultBuffer.append("\n");
				}

			}
			result = resultBuffer.toString();
			return id+" 详情为： " + result;
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "System Error!";
		}
	}
*/
	public String getDescription(String id) { // 获取产品的描述信息
		String sb = null;
		String tempstr = null;
		String[] a = null; // 字符串数组用于保存从文件中读出的内容
		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) { // 当文件不存在时，创建一个
				return "don't have this product";
			}
			FileInputStream fis = new FileInputStream(file); // 文件输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,
					"utf-8"));// 设置编码规则，放置中文乱码
			while ((tempstr = br.readLine()) != null) {
				sb = new String(tempstr);
				a = sb.split("\\s"); // 将缓冲区的字符串以空格进行分割保存至a中
				// System.out.println(a[0] + " " + a[1] + " " + a[2]);
				// //调试过程中用于debug了...
				if (a[0].equals(id)) {
					return "该产品描述：" + a[1]; // 匹配成功，返回相应的产品描述信息
				}

			}

			return "User not exist!";
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "System Error!"; // 意外情况
		}
	}
	
	public String getCount(String id) { // 获取产品的库存信息
		String sb = null;
		String tempstr = null;
		String[] a = null; // 字符串数组用于保存从文件中读出的内容
		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) { // 当文件不存在时，创建一个
				return "don't have this product";
			}
			FileInputStream fis = new FileInputStream(file); // 文件输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,
					"utf-8"));// 设置编码规则，放置中文乱码
			while ((tempstr = br.readLine()) != null) {
				sb = new String(tempstr);
				a = sb.split("\\s"); // 将缓冲区的字符串以空格进行分割保存至a中
				// System.out.println(a[0] + " " + a[1] + " " + a[2]);
				// //调试过程中用于debug了...
				if (a[0].equals(id)) {
					return "该产品库存为：" + a[2]+"件"; // 匹配成功，返回相应的产品库存信息
				}

			}

			return "User not exist!";
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "System Error!"; // 意外情况
		}
	}
	
	public String getPrice(String id) { // 获取产品的价格信息
		String sb = null;
		String tempstr = null;
		String[] a = null; // 字符串数组用于保存从文件中读出的内容
		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) { // 当文件不存在时，创建一个
				return "don't have this product";
			}
			FileInputStream fis = new FileInputStream(file); // 文件输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(fis,
					"utf-8"));// 设置编码规则，放置中文乱码
			while ((tempstr = br.readLine()) != null) {
				sb = new String(tempstr);
				a = sb.split("\\s"); // 将缓冲区的字符串以空格进行分割保存至a中
				// System.out.println(a[0] + " " + a[1] + " " + a[2]);
				// //调试过程中用于debug了...
				if (a[0].equals(id)) {
					return "该产价格为：" + a[3]+"元"; // 匹配成功，返回相应的产品价格信息
				}

			}

			return "User not exist!";
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "System Error!"; // 意外情况
		}
	}

	public String buy(String id) {	//实现对产品的购买功能
		String sb = null;
		String tempstr = null;
		String write = null;
		String[] a = null;
		String countString = null;
		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) {
				return "don't have this product";
			}
			RandomAccessFile raFile = new RandomAccessFile(file, "rw");
			byte[] rd = new byte[64];
			rd = null;
			Long beforelong = (long) 0;
			//System.out.println("pointer:" + raFile.getFilePointer());
			while ((tempstr = raFile.readLine()) != null) {
				//System.out.println("pointer:" + raFile.getFilePointer());
				sb = new String(tempstr.getBytes("ISO-8859-1"), "utf-8");
				a = sb.split("\\s");
				// System.out.println("a0:" + a[0] + "a1:" + a[1] + "a2:" +
				// a[2]);
				if (a[0].equals(id)) {
					// Long tLong = raFile.getFilePointer();
					raFile.seek(beforelong);
					countString = String.valueOf(Integer.valueOf(a[2])-1);
					write = a[0] + "\t" + a[1] + "\t" + countString + "\t" + a[3]
							+ "\t" + "1";// 收获标志位设置为1，标志着货物正在运送途中
					for (int i = 0; i < 64; i++) {
						write += " ";
					}
					rd = write.getBytes("utf-8");
					// System.out.println("pointer:"+tLong);
					raFile.write(rd, 0, 62);
					raFile.write("\r\n".getBytes());
					break;
				}
				beforelong = raFile.getFilePointer();
			}
			return "下单成功！您的产品正在配送！";
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "System Error!";
		}
	}

	public String confirm(String id) {	//实现产品的收货回执单确认功能
		String sb = null;
		String tempstr = null;
		String write = null;
		String[] a = null;
		try {
			String path = "D:/Jax-WS.txt";
			File file = new File(path);
			if (!file.exists()) {
				return "don't have this product";
			}
			RandomAccessFile raFile = new RandomAccessFile(file, "rw");
			byte[] rd = new byte[64];
			rd = null;
			Long beforelong = (long) 0;
			//System.out.println("pointer:" + raFile.getFilePointer());
			while ((tempstr = raFile.readLine()) != null) {
				//System.out.println("pointer:" + raFile.getFilePointer());
				sb = new String(tempstr.getBytes("ISO-8859-1"), "utf-8");
				a = sb.split("\\s");
				// System.out.println("a0:" + a[0] + "a1:" + a[1] + "a2:" +
				// a[2]);
				if (a[0].equals(id)) {
					// Long tLong = raFile.getFilePointer();
					raFile.seek(beforelong);
					write = a[0] + "\t" + a[1] + "\t" + a[2] + "\t" + a[3]
							+ "\t" + "0"; // 收获标志位设置为0，标志着用户已经收到货物
					for (int i = 0; i < 64; i++) {
						write += " ";
					}
					rd = write.getBytes("utf-8");
					// System.out.println("pointer:"+tLong);
					raFile.write(rd, 0, 62);
					raFile.write("\r\n".getBytes());
					break;
				}
				beforelong = raFile.getFilePointer();
			}
			return "用户已经成功收到货物！";
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
			return "System Error!";
		}
	}

}
