package utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import helper.ExcelReaderManager;

public class TestDataReader {
	
	private static String excelFilePath = "./src/main/resources/TestData.xlsx";
	
	public static String getCustomLeftTitle() {
		ExcelReaderManager reader = new ExcelReaderManager();
		String title = null;
		try {
			List<Map<String,String>> testData = reader.getData(excelFilePath, "Custom Title");
			 title = testData.get(0).get("Left Title");
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return title;
	}
	
	public static String getCustomRightTitle() {
		ExcelReaderManager reader = new ExcelReaderManager();
		String title = null;
		try {
			List<Map<String,String>> testData = reader.getData(excelFilePath, "Custom Title");
			 title = testData.get(0).get("Right Title");
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return title;
	}
	
	public static String getCommand() {
		ExcelReaderManager reader = new ExcelReaderManager();
		String command = null;
		try {
			List<Map<String,String>> testData = reader.getData(excelFilePath, "Alert");
			 command = testData.get(0).get("Command");
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return command;
	}
	
	public static String getOption() {
		ExcelReaderManager reader = new ExcelReaderManager();
		String option = null;
		try {
			List<Map<String,String>> testData = reader.getData(excelFilePath, "Alert");
			 option = testData.get(0).get("Option");
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return option;
	}

}
