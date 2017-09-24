package com.easymis.commons.office;

import java.io.OutputStream;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class ExcelUtil {
    /** 
     * 导出Excel模板 
     * 
     * @param fieldMap 
     *            类的英文属性和Excel中的中文列名的对应关系 
     * @param sheetName 
     *            工作表的名称 
     * @param response 
     *            使用response可以导出到浏览器 
     * @throws ExcelException 
     *             异常 
     */  
    public <T> void leadToExcel(LinkedHashMap<String, String> fieldMap,  
            String sheetName, HttpServletResponse response)   {/*  
  
        // 设置默认文件名为当前时间：年月日时分秒  
        String fileName = new SimpleDateFormat("yyyyMMddhhmmss").format(  
                new Date()).toString();  
  
        // 如果文件名没提供，则使用时间戳  
        if (fileName == null || fileName.trim().equals("")) {  
            // 设置默认文件名为当前时间：年月日时分秒  
            fileName = new SimpleDateFormat("yyyyMMddhhmmss")  
                    .format(new Date()).toString();  
        }  
  
        // 设置response头信息  
        response.reset();  
        response.setContentType("application/vnd.ms-excel"); // 改成输出excel文件  
        response.setHeader("Content-disposition", "attachment; filename="  
                + fileName + ".xls");  
        OutputStream output=response.getOutputStream();  
        response.reset();  
        response.setHeader("Content-disposition", "attachment; filename=details.xls");  
        response.setContentType("application/msexcel");          
        wkb.write(output);  
        output.close();  
        // 创建工作簿并发送到浏览器  
        try {  
  
            OutputStream out = response.getOutputStream();  
  
            int sheetSize = 65535;  
  
            // 创建工作簿并发送到OutputStream指定的地方  
            WritableWorkbook wwb;  
            try {  
                wwb = Workbook.createWorkbook(out);  
  
                // 因为2003的Excel一个工作表最多可以有65536条记录，除去列头剩下65535条  
                // 所以如果记录太多，需要放到多个工作表中，其实就是个分页的过程  
                // 1.计算一共有多少个工作表  
                // double sheetNum = Math.ceil(list.size()  
                // / new Integer(sheetSize).doubleValue());  
  
                double sheetNum = 1;  
  
                // 2.创建相应的工作表，并向其中填充数据  
                // 如果只有一个工作表的情况  
                if (1 == sheetNum) {  
                    WritableSheet sheet = wwb.createSheet(sheetName, 1);  
  
                    // 定义存放英文字段名和中文字段名的数组  
                    String[] enFields = new String[fieldMap.size()];  
                    String[] cnFields = new String[fieldMap.size()];  
  
                    // 填充数组  
                    int count = 0;  
                    for (Entry<String, String> entry : fieldMap.entrySet()) {  
                        enFields[count] = entry.getKey();  
                        cnFields[count] = entry.getValue();  
                        count++;  
                    }  
                    // 填充表头  
                    for (int i = 0; i < cnFields.length; i++) {  
                        Label label = new Label(i, 0, cnFields[i]);  
                        sheet.addCell(label);  
                    }  
  
                    // 设置自动列宽  
                    setColumnAutoSize(sheet, 5);  
  
                }  
  
                wwb.write();  
                wwb.close();  
  
            } catch (Exception e) {  
                e.printStackTrace();  
                // 如果是ExcelException，则直接抛出  
                if (e instanceof ExcelException) {  
                    throw (ExcelException) e;  
  
                    // 否则将其它异常包装成ExcelException再抛出  
                } else {  
                    throw new ExcelException("导出Excel失败");  
                }  
            }  
  
        } catch (Exception e) {  
            e.printStackTrace();  
  
            // 如果是ExcelException，则直接抛出  
            if (e instanceof ExcelException) {  
                throw (ExcelException) e;  
  
                // 否则将其它异常包装成ExcelException再抛出  
            } else {  
                throw new ExcelException("导出Excel失败");  
            }  
        }  
    */
    	
    
    }  
}
