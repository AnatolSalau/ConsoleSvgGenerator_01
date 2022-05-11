package fileClasses;

import createDeleteWriteFiles.CreateDeleteSvgFIle;
import createDeleteWriteFiles.WriteToSvg;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;

public class FullText extends Text{
    private ArrayList<Text> allEnteredBlockText;

    public FullText() {
        super();
        this.allEnteredBlockText = new ArrayList<>();
    }

    public FullText(Text... textBlock) {
        super();
        this.allEnteredBlockText = new ArrayList<>(Arrays.asList(textBlock));
        for (Text object: textBlock) {
            for (String str:object.getFullText()) {
                this.fullText.add(str);
            }
        }
    }

    public void addTextBlockTolistOfBlocks(Text textBlock) {
        this.allEnteredBlockText.add(textBlock);
    }

    public void rewriteFullTextFrom_allEnteredBlockText() {
        fullText.removeAll(fullText);
        for (Text object: allEnteredBlockText) {
            for (String str:object.getFullText()) {
                this.fullText.add(str);
            }
        }
    }


    public void rewriteFullTextToDefaulFromObjects () {
        fullText.removeAll(fullText);
        for (Text object: allEnteredBlockText) {
            this.fullText.add(object.getDefaultText());
        }
    }

    public void writeToFile_fullText(String fullPath) {
//Проверяем есть ли файл, если есть удаляем старый файл
        CreateDeleteSvgFIle createDeleteSvgFIle = new CreateDeleteSvgFIle(fullPath);
        if (createDeleteSvgFIle.checkFileYesNo() == true) {
            createDeleteSvgFIle.deleteFile();
        }
       else {
            createDeleteSvgFIle.createFile();
            //Создаем строку из ArrayList
            StringBuilder builder = new StringBuilder();
            for (String value : fullText) {
                builder.append(value);
            }
            String text = builder.toString();

            //Начинаем запись в файл
//            WriteToSvg writeToSvg = new WriteToSvg(fullFilePath,this.fullText.toString());
            WriteToSvg writeToSvg = new WriteToSvg(fullPath,text);
            writeToSvg.fileWrite(true);

        }
    }
    public void writeToFile_allEnteredBlockText(String fullFilePath) {
//Проверяем есть ли файл, если есть удаляем старый файл
        CreateDeleteSvgFIle createDeleteSvgFIle = new CreateDeleteSvgFIle(fullFilePath);
        if (createDeleteSvgFIle.checkFileYesNo() == true) {
            createDeleteSvgFIle.deleteFile();
        }
//        else {
            createDeleteSvgFIle.createFile();
            //Создаем строку из ArrayList
            StringBuilder builder = new StringBuilder();
            for (Text text : allEnteredBlockText) {
                for (String value:text.getFullText()) {
                    builder.append(value);
                }
            }
            String text = builder.toString();

            //Начинаем запись в файл
//            WriteToSvg writeToSvg = new WriteToSvg(fullFilePath,this.fullText.toString());
            WriteToSvg writeToSvg = new WriteToSvg(fullFilePath,text);
            writeToSvg.fileWrite(true);
//        }
    }

    public void clearAllEnteredBlockText() {
        allEnteredBlockText.removeAll(allEnteredBlockText);
    }
}
