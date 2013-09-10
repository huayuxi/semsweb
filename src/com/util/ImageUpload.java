/**
 * Copyright:Copyright(c)2012-2013
 * Company:易联众信息技术股份有限公司
 * @version 1.0
 */
package com.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;


/**
 * @description:
 * @date: 2012-11-1 下午03:02:37
 * @author: Lintz
 */
@SuppressWarnings({ "serial" })
public class ImageUpload extends BaseAction {
	private File fileInput;
	private String fileInputFileName;
	private String msg;
	
	/**
	 * @return 上传结果
	 * @throws IOException
	 * @description:
	 * @date: 2012-11-1 下午04:17:38
	 * @author： Lintz
	 */
	public String uploadFile() {
		String extName = "";// 扩展名
		
		String newFileName = "";// 新文件名
		
		String nowTime = new SimpleDateFormat("yyyymmddHHmmss").format(new Date());// 当前时间
		
		String savePath = ServletActionContext.getServletContext().getRealPath("");
		
		savePath = savePath + "/uploads/";
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		
		// 获取扩展名
		if (fileInputFileName.lastIndexOf(".") >= 0) {
			extName = fileInputFileName.substring(fileInputFileName.lastIndexOf("."));
		}
		newFileName = nowTime + extName;
		
		fileInput.renameTo(new File(savePath + newFileName));
		msg = "uploads/" + newFileName;
		return SUCCESS;
	}
	
	/**
	 * @return the fileInput
	 */
	public File getFileInput() {
		return fileInput;
	}
	
	/**
	 * @param fileInput the fileInput to set
	 */
	public void setFileInput(File fileInput) {
		this.fileInput = fileInput;
	}
	
	/**
	 * @return the fileInputFileName
	 */
	public String getFileInputFileName() {
		return fileInputFileName;
	}
	
	/**
	 * @param fileInputFileName the fileInputFileName to set
	 */
	public void setFileInputFileName(String fileInputFileName) {
		this.fileInputFileName = fileInputFileName;
	}
	
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
