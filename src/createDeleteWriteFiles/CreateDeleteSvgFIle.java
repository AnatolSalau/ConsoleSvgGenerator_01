package createDeleteWriteFiles;

import java.io.File;

public class CreateDeleteSvgFIle {
    private String fullFilePath = "out" + File.separator +"SVG.svg";
    // Возьмите файл
    private File newFileSVG;

    public CreateDeleteSvgFIle(String fullFilePath) {
        this.fullFilePath = fullFilePath;
        this.newFileSVG = new File(fullFilePath);
    }

    public boolean checkFileYesNo() {
        try {
            if (newFileSVG.exists()) {
                System.out.println("The file is already there");
                return true;
            }
            else {
                System.out.println("The file is not detected");
                return false;
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
    public void createFile() {
        try {
            //Создайте новый файл
            // Убедитесь, что он не существует
            if (newFileSVG.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
    public void deleteFile() {
        try {
            //Удалите новый файл
            if (newFileSVG.delete())
                System.out.println("File deleted");
            else
                System.out.println("File cant't deleted");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
