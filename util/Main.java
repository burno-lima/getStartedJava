import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.FilenameFilter;
import java.util.zip.ZipEntry;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CreateZip {
  public static void main(String[] args) throws IOException {
    Calendar now = Calendar.getInstance();

    SimpleDateFormat sdf =  new SimpleDateFormat("yyyyMMdd_HHmmss");

    String formattedDateTime = sdf.format(now.getTime());

    String zip = formattedDateTime + ".zip";

    String directoryPath = "output";

    File directory = new File(directoryPath);
  
    List<String> csvFilePaths = new ArrayList<>();

    if (directory.exists() && directory.isDirectory()){
      File[] csvFiles = directory.listFiles(new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
          return name.toLowerCase().endsWith(".csv");
        }
      });

      if (csvFiles != null) {
        for (File file: csvFiles) {
          csvFilePaths.add(file.getAbsolutePath());
        }
      } else {
        System.out.println("Diretório não encontrado ou não é um diretório válido.");
      }
    }
 
    FileOutputStream fos = new FileOutputStream(zip);
  
    ZipOutputStream zipOut = new ZipOutputStream(fos);   

    for (String file : csvFilePaths) {

      File fileToZip = new File(file);

      FileInputStream fis = new FileInputStream(fileToZip);
  
      ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
  
      zipOut.putNextEntry(zipEntry);
  
      byte[] bytes = new byte[1024];
  
      int length;
  
      while((length = fis.read(bytes)) >= 0) {
        zipOut.write(bytes, 0, length);
      }

      fis.close();
    }

    zipOut.close();
    fos.close();
  }
}
