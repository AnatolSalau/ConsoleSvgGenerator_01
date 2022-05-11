package graphicUserInterface.graphicUserInterface_2_FromConsole;


import calculateCoordinat.CalculateBlack;
import calculateCoordinat.CalculateGapHorisontalTwo;
import calculateCoordinat.CalculateWhiteRectangular;
import calculateCoordinat.CoordinatesGapsSizes;
import createDeleteWriteFiles.ReadTxtSettings;
import fileClasses.*;
import graphicUserInterface.WhiteRectangularTrueFalse;

import java.io.File;

public class GraphicUserInterface_2_FromConsole {
    public static void main(String[] args) {

        GetCodeFromUser getCodeFromUser = new GetCodeFromUser();

            String str = getCodeFromUser.getStringFromUser();

            ManagerWhiteRectangularTrueFalse managerWhiteRectangularTrueFalse = new ManagerWhiteRectangularTrueFalse();

                managerWhiteRectangularTrueFalse.setEnumFromString(str);

                //        Путь к файлу
                String fullFilePath =
                        "Templates" + File.separator +
                                str+".svg";
                //Путь к настройкам
                String settingsPath =
                        "Settings" + File.separator + "Settings.txt";

                ReadTxtSettings readTxtSettings = new ReadTxtSettings(settingsPath);
                readTxtSettings.printConsoleSettingFile();

//        Координаты и длины черного прямоуголника
                double blackWidth = CoordinatesGapsSizes.BLACK_WIDTH.getValue();
                double blackHeight = CoordinatesGapsSizes.BLACK_HEIGHT.getValue();
                double startBlackX = CoordinatesGapsSizes.BLACK_START_X.getValue();
                double startBlackY = CoordinatesGapsSizes.BLACK_START_Y.getValue();

//        Длины  и отступы нижнего белого прямоугольника
                double whiteWidth = CoordinatesGapsSizes.WHITE_WIDTH.getValue();
                double whiteHeight = CoordinatesGapsSizes.WHITE_HEIGHT.getValue();
                double gapHorisontal = CoordinatesGapsSizes.GAP_HORISONTAL.getValue();
                double gapVertical =  CoordinatesGapsSizes.GAP_VERTICAL.getValue();

//        Зазор между белыми прямоуголниками
                double gapBetweenWhiteRectangular = CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue();
//        Cчитаем отсут для правого стобца белых прямоуголников
                CalculateGapHorisontalTwo calculateGapHorisontalTwo = new CalculateGapHorisontalTwo();
                double gapHorisontalTwo = calculateGapHorisontalTwo.calculateGapHorisontalTwo_X(
                        whiteWidth,
                        whiteHeight,
                        blackWidth,
                        startBlackX,
                        gapHorisontal
                );

//        Создаем Начало файла
//        Записываем в него текст по умолчанию
                TextTopFile_0 textTopFile0 = new TextTopFile_0();
                textTopFile0.addStringToList_fullText(textTopFile0.getDefaultText());

//        Создаем черный прямоугольник
                TextBlackRectangularFile_1 textBlackRectangularFile1 =
                        new TextBlackRectangularFile_1();
//        Считаем координаты для черного прямоуголника
                CalculateBlack calculateBlack = new CalculateBlack(
                        blackWidth,
                        blackHeight,
                        startBlackX ,
                        startBlackY
                );
//        Записываем посчитанные координа из объекта в черный прямоуголник
                textBlackRectangularFile1.writeFullText(calculateBlack.getBlackX(), calculateBlack.getBlackY(),
                        calculateBlack.getBlackWidth(), calculateBlack.getBlackHeight());

//        Создаем объект для всего текста
                FullText fullText = new FullText();
//        Добавляем в него верх файла
                fullText.addTextBlockTolistOfBlocks(textTopFile0);
//        Добавляем в него черный прямоуголник
                fullText.addTextBlockTolistOfBlocks(textBlackRectangularFile1);

                if (WhiteRectangularTrueFalse.P1.getTrueFalse()) {
//      Создаем белый прямоугольник #1
                    TextWhiteSlotFile_2 whiteRectangular_1 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника
                    CalculateWhiteRectangular calculateWhiteRectangular = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontalTwo,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*0),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #1
                    System.out.print("P1 ");
                    calculateWhiteRectangular.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #1
                    whiteRectangular_1.reWriteFullText(
                            calculateWhiteRectangular.getWhiteX(),
                            calculateWhiteRectangular.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular.getCircleOneX(),
                            calculateWhiteRectangular.getCircleOneY(),
                            calculateWhiteRectangular.getCircleOneR(),
                            calculateWhiteRectangular.getCircleTwoX(),
                            calculateWhiteRectangular.getCircleTwoY(),
                            calculateWhiteRectangular.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #1
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_1);

                }
                if (WhiteRectangularTrueFalse.P2.getTrueFalse()){
//      Создаем белый прямоугольник #2
                    TextWhiteSlotFile_2 whiteRectangular_2 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #2
                    CalculateWhiteRectangular calculateWhiteRectangular_2 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontalTwo,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*1),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #2
                    System.out.print("P2 ");
                    calculateWhiteRectangular_2.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #2
                    whiteRectangular_2.reWriteFullText(
                            calculateWhiteRectangular_2.getWhiteX(),
                            calculateWhiteRectangular_2.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_2.getCircleOneX(),
                            calculateWhiteRectangular_2.getCircleOneY(),
                            calculateWhiteRectangular_2.getCircleOneR(),
                            calculateWhiteRectangular_2.getCircleTwoX(),
                            calculateWhiteRectangular_2.getCircleTwoY(),
                            calculateWhiteRectangular_2.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #2
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_2);
                }
                if (WhiteRectangularTrueFalse.P3.getTrueFalse()){
//      Создаем белый прямоугольник #3
                    TextWhiteSlotFile_2 whiteRectangular_3 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #3
                    CalculateWhiteRectangular calculateWhiteRectangular_3 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontalTwo,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*2),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #3
                    System.out.print("P3 ");
                    calculateWhiteRectangular_3.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #3
                    whiteRectangular_3.reWriteFullText(
                            calculateWhiteRectangular_3.getWhiteX(),
                            calculateWhiteRectangular_3.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_3.getCircleOneX(),
                            calculateWhiteRectangular_3.getCircleOneY(),
                            calculateWhiteRectangular_3.getCircleOneR(),
                            calculateWhiteRectangular_3.getCircleTwoX(),
                            calculateWhiteRectangular_3.getCircleTwoY(),
                            calculateWhiteRectangular_3.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #3
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_3);
                }
                if (WhiteRectangularTrueFalse.P4.getTrueFalse()){
//      Создаем белый прямоугольник #4
                    TextWhiteSlotFile_2 whiteRectangular_4 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #4
                    CalculateWhiteRectangular calculateWhiteRectangular_4 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontalTwo,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*3),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #3
                    System.out.print("P4 ");
                    calculateWhiteRectangular_4.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #3
                    whiteRectangular_4.reWriteFullText(
                            calculateWhiteRectangular_4.getWhiteX(),
                            calculateWhiteRectangular_4.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_4.getCircleOneX(),
                            calculateWhiteRectangular_4.getCircleOneY(),
                            calculateWhiteRectangular_4.getCircleOneR(),
                            calculateWhiteRectangular_4.getCircleTwoX(),
                            calculateWhiteRectangular_4.getCircleTwoY(),
                            calculateWhiteRectangular_4.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #3
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_4);
                }
                if (WhiteRectangularTrueFalse.P5.getTrueFalse()){
//      Создаем белый прямоугольник #5
                    TextWhiteSlotFile_2 whiteRectangular_5 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #5
                    CalculateWhiteRectangular calculateWhiteRectangular_5 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontalTwo,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*4),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #5
                    System.out.print("P5 ");
                    calculateWhiteRectangular_5.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #5
                    whiteRectangular_5.reWriteFullText(
                            calculateWhiteRectangular_5.getWhiteX(),
                            calculateWhiteRectangular_5.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_5.getCircleOneX(),
                            calculateWhiteRectangular_5.getCircleOneY(),
                            calculateWhiteRectangular_5.getCircleOneR(),
                            calculateWhiteRectangular_5.getCircleTwoX(),
                            calculateWhiteRectangular_5.getCircleTwoY(),
                            calculateWhiteRectangular_5.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #5
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_5);
                }
                if (WhiteRectangularTrueFalse.P6.getTrueFalse()){

//      Создаем белый прямоугольник #6
                    TextWhiteSlotFile_2 whiteRectangular_6 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #6
                    CalculateWhiteRectangular calculateWhiteRectangular_6 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontal,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*4),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #5
                    System.out.print("P6 ");
                    calculateWhiteRectangular_6.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #6
                    whiteRectangular_6.reWriteFullText(
                            calculateWhiteRectangular_6.getWhiteX(),
                            calculateWhiteRectangular_6.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_6.getCircleOneX(),
                            calculateWhiteRectangular_6.getCircleOneY(),
                            calculateWhiteRectangular_6.getCircleOneR(),
                            calculateWhiteRectangular_6.getCircleTwoX(),
                            calculateWhiteRectangular_6.getCircleTwoY(),
                            calculateWhiteRectangular_6.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #6
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_6);
                }
                if (WhiteRectangularTrueFalse.P7.getTrueFalse()){

//      Создаем белый прямоугольник #7
                    TextWhiteSlotFile_2 whiteRectangular_7 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #7
                    CalculateWhiteRectangular calculateWhiteRectangular_7 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontal,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*3),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #5
                    System.out.print("P7 ");
                    calculateWhiteRectangular_7.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #6
                    whiteRectangular_7.reWriteFullText(
                            calculateWhiteRectangular_7.getWhiteX(),
                            calculateWhiteRectangular_7.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_7.getCircleOneX(),
                            calculateWhiteRectangular_7.getCircleOneY(),
                            calculateWhiteRectangular_7.getCircleOneR(),
                            calculateWhiteRectangular_7.getCircleTwoX(),
                            calculateWhiteRectangular_7.getCircleTwoY(),
                            calculateWhiteRectangular_7.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #7
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_7);
                }
                if (WhiteRectangularTrueFalse.P8.getTrueFalse()){

//      Создаем белый прямоугольник #8
                    TextWhiteSlotFile_2 whiteRectangular_8 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #8
                    CalculateWhiteRectangular calculateWhiteRectangular_8 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontal,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*2),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #8
                    System.out.print("P8 ");
                    calculateWhiteRectangular_8.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #8
                    whiteRectangular_8.reWriteFullText(
                            calculateWhiteRectangular_8.getWhiteX(),
                            calculateWhiteRectangular_8.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_8.getCircleOneX(),
                            calculateWhiteRectangular_8.getCircleOneY(),
                            calculateWhiteRectangular_8.getCircleOneR(),
                            calculateWhiteRectangular_8.getCircleTwoX(),
                            calculateWhiteRectangular_8.getCircleTwoY(),
                            calculateWhiteRectangular_8.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #8
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_8);
                }
                if (WhiteRectangularTrueFalse.P9.getTrueFalse()){

//      Создаем белый прямоугольник #9
                    TextWhiteSlotFile_2 whiteRectangular_9 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #9
                    CalculateWhiteRectangular calculateWhiteRectangular_9 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontal,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*1),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #9
                    System.out.print("P9 ");
                    calculateWhiteRectangular_9.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #9
                    whiteRectangular_9.reWriteFullText(
                            calculateWhiteRectangular_9.getWhiteX(),
                            calculateWhiteRectangular_9.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_9.getCircleOneX(),
                            calculateWhiteRectangular_9.getCircleOneY(),
                            calculateWhiteRectangular_9.getCircleOneR(),
                            calculateWhiteRectangular_9.getCircleTwoX(),
                            calculateWhiteRectangular_9.getCircleTwoY(),
                            calculateWhiteRectangular_9.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #9
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_9);
                }
                if (WhiteRectangularTrueFalse.P10.getTrueFalse()){

//      Создаем белый прямоугольник #10
                    TextWhiteSlotFile_2 whiteRectangular_10 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника #10
                    CalculateWhiteRectangular calculateWhiteRectangular_10 = new CalculateWhiteRectangular(
                            blackWidth,
                            blackHeight,
                            startBlackX,
                            startBlackY,
                            gapHorisontal,
                            gapVertical +(CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue()*0),
                            whiteHeight,
                            whiteWidth
                    );
                    //       Выводим в консоль координаты  прямоугольника #10
                    System.out.print("P10 ");
                    calculateWhiteRectangular_10.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #10
                    whiteRectangular_10.reWriteFullText(
                            calculateWhiteRectangular_10.getWhiteX(),
                            calculateWhiteRectangular_10.getWhiteY(),
                            whiteWidth,
                            whiteHeight,
                            calculateWhiteRectangular_10.getCircleOneX(),
                            calculateWhiteRectangular_10.getCircleOneY(),
                            calculateWhiteRectangular_10.getCircleOneR(),
                            calculateWhiteRectangular_10.getCircleTwoX(),
                            calculateWhiteRectangular_10.getCircleTwoY(),
                            calculateWhiteRectangular_10.getCircleTwoR()
                    );
//        Добавляем в FullText  белый прямоуголник #10
                    fullText.addTextBlockTolistOfBlocks(whiteRectangular_10);
                }

//        Создаем Конец файла
//        Записываем в него текст по умолчанию
                TextEndFile_3 textEndFile3 = new TextEndFile_3();
                textEndFile3.addStringToList_fullText(textEndFile3.getDefaultText());
                //        Добавляем в него конец файла
                fullText.addTextBlockTolistOfBlocks(textEndFile3);

//        Записываем в файл текст со всех добавленных блоков текста
                fullText.writeToFile_allEnteredBlockText(fullFilePath);

        getCodeFromUser.closeScanner();
    }
}

