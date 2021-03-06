package fr.bestdevelop.launcher.sse;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

import fr.bestdevelop.ml.logger.LoggerLib;
import fr.bestdevelop.launcher.sse.utils.OperatingSystem;
import fr.bestdevelop.launcher.sse.utils.Utils;

public class Launcher {
	public static final LoggerLib logger = new LoggerLib(Constants.LAUNCHER_NAME);
	
	public void start(String[] args) {
		logger.info(Constants.LAUNCHER_NAME + " started on " + OperatingSystem.getCurrentPlatform().getName() + "...");
		logger.info("Current time is " + DateFormat.getDateTimeInstance(2, 2, Locale.US).format(new Date()));
		if (!OperatingSystem.getCurrentPlatform().isSupported()) {
			logger.warning("This operating system is unknown or unsupported, we cannot guarantee that the game will launch successfully.");
			JOptionPane.showMessageDialog(Main.getInstance(), "This operating system is unknown or unsupported, we cannot guarantee that the game will launch successfully.", Constants.LAUNCHER_NAME, JOptionPane.WARNING_MESSAGE);
		}
		
		logger.info("System.getProperty('os.name') == '" + System.getProperty("os.name") + "'");
		logger.info("System.getProperty('os.version') == '" + System.getProperty("os.version") + "'");
		logger.info("System.getProperty('os.arch') == '" + System.getProperty("os.arch") + "'");
		logger.info("System.getProperty('java.version') == '" + System.getProperty("java.version") + "'");
		logger.info("System.getProperty('java.vendor') == '" + System.getProperty("java.vendor") + "'");
		logger.info("System.getProperty('sun.arch.data.model') == '" + System.getProperty("sun.arch.data.model") + "'");
		
		if(Utils.getJavaProcess()) {
			logger.warning("You use Java 32-bits when you have a 64 bits processor.");
		}
	}
}
