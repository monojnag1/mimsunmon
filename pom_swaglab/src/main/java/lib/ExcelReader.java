package lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	Sheet sh;
	public ExcelReader(String filename,String sheetname) throws IOException {
	FileInputStream fis = new FileInputStream(filename);
	Workbook wb = new XSSFWorkbook(fis);
	sh = wb.getSheet(sheetname);
	}	
	public Object[][]excelToArry(){
		Object[][]t;
		int totalRows=sh.getPhysicalNumberOfRows();
		int totalCol =sh.getRow(0).getPhysicalNumberOfCells();
		t= new Object[totalRows-1][totalCol];
		for(int r=1;r<totalRows;r=r+1) {
			for(int c =0;c<totalCol;c=c+1) {
				t[r-1][c]=getCellData(r,c);
				
			}
			}
		 
		
		return t;
	}

public String getCellData(int r, int col){

String value="";
Cell c=	sh.getRow(r).getCell(col);
				
				if(c.getCellType() == Cell.CELL_TYPE_STRING) {
					//string:
					 value = c.getStringCellValue();
									}
				else {
					//numeric: int or double
					
					if(c.getNumericCellValue()%1==0) {
						//int part:
						//covert double to int:      int to char: file read.
						 value  = ""+(int)c.getNumericCellValue();
						
						
					}
					else {
							//double part:
						 value = ""+c.getNumericCellValue();
						
					}
					
				}
				
				return value;
}			
}
