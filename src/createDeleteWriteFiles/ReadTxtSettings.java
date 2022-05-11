package createDeleteWriteFiles;


import calculateCoordinat.CoordinatesGapsSizes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadTxtSettings {
    private String settingsPath;

    public ReadTxtSettings(String settingsPath) {
        this.settingsPath = settingsPath;
    }

    public void printConsoleSettingFile() {

        File file = new File(this.settingsPath);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] cols = line.split("[;()]");

                if (cols[0].equals("BLACK_WIDTH")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.BLACK_WIDTH.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("BLACK_HEIGHT")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.BLACK_HEIGHT.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("BLACK_START_X")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.BLACK_START_X.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("BLACK_START_Y")) {System.out.println(cols[1]);
                    CoordinatesGapsSizes.BLACK_START_Y.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("WHITE_WIDTH")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.WHITE_WIDTH.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("WHITE_HEIGHT")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.WHITE_HEIGHT.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("GAP_HORISONTAL")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.GAP_HORISONTAL.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("GAP_VERTICAL")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.GAP_VERTICAL.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("GAP_BETWEEN_WHITE_RECTANGULAR")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.setValue(Double.parseDouble( cols[1]));
                }
                if (cols[0].equals("QUANTITY_LINE_WHITE_RECTANGULAR")) {
                    System.out.println(cols[1]);
                    CoordinatesGapsSizes.QUANTITY_LINE_WHITE_RECTANGULAR.setValue(Double.parseDouble( cols[1]));
                }

            }

        } finally {
            scanner.close();
        }
    }

    public void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("[%d] = %s\n",i,strings[i]);
        }
    }
}
