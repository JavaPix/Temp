package com.nag.designPatterns.ChainOfResponsibility;

public class ChainPatternMain {

	private static AbstractLogger getChainOfLoggers(){
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(consoleLogger);
		fileLogger.setNextLogger(fileLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.DEBUG, "this is the debug message");
		loggerChain.logMessage(AbstractLogger.ERROR, "this is the error message");
		loggerChain.logMessage(AbstractLogger.INFO, "this is the info message");
	}
}
