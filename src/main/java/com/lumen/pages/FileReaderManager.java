package com.lumen.pages;


public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	 private static Basepage configFileReader;
	 
	 private FileReaderManager() {
	 }
	 
	 public static FileReaderManager getInstance( ) {
	       return fileReaderManager;
	 }
	 
	 public Basepage getConfigReader() {
	 return (configFileReader == null) ? new Basepage() : configFileReader;
	 }
	 
	 
	
	 
	}

