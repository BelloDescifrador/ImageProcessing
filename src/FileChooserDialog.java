import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooserDialog {
  public static void main(String[] args) {

	 
	  
	JFileChooser fileopen = new JFileChooser();
    FileFilter filter = new FileNameExtensionFilter("c files", "c");
    fileopen.addChoosableFileFilter(filter);

    int ret = fileopen.showDialog(null, "Open file");

    if (ret == JFileChooser.APPROVE_OPTION) {
      File file = fileopen.getSelectedFile();
      System.out.println(file);
      
      // Objects of various classes
		BlueImage bi = new BlueImage();
		GrayScale gs = new GrayScale();
		GreenImage gi = new GreenImage();
		Negative n = new Negative();
		RedImage ri = new RedImage();
		Sepia s = new Sepia();
		
		// Calling functions
		
		try {
			bi.func(file+"");
			gs.func(file+"");
			gi.func(file+"");
			n.func(file+"");
			ri.func(file+"");
			s.func(file+"");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
  }
}