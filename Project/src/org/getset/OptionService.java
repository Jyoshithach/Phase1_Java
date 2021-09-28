package org.getset;

import org.businesslevel.FilesOption;
import org.businesslevel.Operations;
import org.businesslevel.Option;
import org.ascending.Files;
public class OptionService {
	public static Operations ops = new Operations();
    public static FilesOption fo = new FilesOption();
    
    

    public static Option CurrentScreen = ops;

    
    public static Option getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Option currentScreen) {
        CurrentScreen = currentScreen;
    }
    

}
