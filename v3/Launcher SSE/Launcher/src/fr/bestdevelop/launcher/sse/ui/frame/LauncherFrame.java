package fr.bestdevelop.launcher.sse.ui.frame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import fr.bestdevelop.launcher.sse.Constants;
import fr.bestdevelop.launcher.sse.ui.contents.LanguageContent;
import fr.bestdevelop.launcher.sse.ui.contents.LaunchGameContent;
import fr.bestdevelop.launcher.sse.ui.contents.LauncherContent;
import fr.bestdevelop.launcher.sse.ui.contents.OptionsContent;
import fr.bestdevelop.launcher.sse.ui.contents.PseudoContent;
import fr.bestdevelop.launcher.sse.ui.contents.SaveAndRestoreContent;

public class LauncherFrame extends JFrame {
	
	public LauncherContent launcherContent = new LauncherContent();
	public PseudoContent pseudoContent = new PseudoContent();
	public LanguageContent languageContent = new LanguageContent();
	public OptionsContent optionsContent = new OptionsContent();
	public SaveAndRestoreContent saveAndRestoreContent = new SaveAndRestoreContent();
	public LaunchGameContent launchGameContent = new LaunchGameContent();
	
	public LauncherFrame() {
		this.setTitle(Constants.LAUNCHER_NAME + " " + Constants.LAUNCHER_VERSION);
		this.setSize(516, 458);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
		this.setResizable(false);
		//this.setIconImage(Utils.getResource("favicon.png"));
		this.setContentPane(languageContent);
		
		this.setVisible(true);
	}
	
	public LauncherContent getLauncherContent() {
		return launcherContent;
	}
	
	public PseudoContent getPseudoContent() {
		return pseudoContent;
	}
	
	public LanguageContent getLanguageContent() {
		return languageContent;
	}
	
	public OptionsContent getOptionsContent() {
		return optionsContent;
	}
	
	public SaveAndRestoreContent getSaveAndRestoreContent() {
		return saveAndRestoreContent;
	}
	
	public LaunchGameContent getLaunchGameContent() {
		return launchGameContent;
	}
}