package fileClasses;

public class TextBlackRectangularFile_1 extends Text{

    public TextBlackRectangularFile_1() {
        super();
        this.defaultText = DefaultText.BLACK_RECTANGULAR_1.getText();
    }

    public TextBlackRectangularFile_1(double blackX, double blackY, double blackWidth, double blackHeight) {
        this();
        addStringToList_fullText("""

                                          <rect class="fil0 str0" x="             		  
                                """);
        addStringToList_fullText(Double.toString(blackX));
        addStringToList_fullText("""
                    
                		         " y="                		  
                                 """);
        addStringToList_fullText(Double.toString(blackY));
        addStringToList_fullText("""
                    
		                         " width="		                  
                                """);
        addStringToList_fullText(Double.toString(blackWidth));
        addStringToList_fullText("""
                                        
                                 " height="		                  
                                """);
        addStringToList_fullText(Double.toString(blackHeight));
        addStringToList_fullText("""
                                                               
                                      "/>

                                          <g id="Rect_inclined_red_x0020__x2014__x0020_03.svg">
                                               <g id="RectWhite">	

                                """);

    }

    public void writeFullText(double blackX, double blackY, double blackWidth, double blackHeight) {
        fullText.removeAll(fullText);
        addStringToList_fullText("""
                                          <rect class="fil0 str0" x="             		  
                                """);
        addStringToList_fullText(Double.toString(blackX));
        addStringToList_fullText("""
                    
                		         " y="                		  
                                 """);
        addStringToList_fullText(Double.toString(blackY));
        addStringToList_fullText("""
                    
		                         " width="		                  
                                """);
        addStringToList_fullText(Double.toString(blackWidth));
        addStringToList_fullText("""
                                        
                                 " height="		                  
                                """);
        addStringToList_fullText(Double.toString(blackHeight));
        addStringToList_fullText("""
                                                               
                                      "/>
                                          <g id="Rect_inclined_red_x0020__x2014__x0020_03.svg">
                                               <g id="RectWhite">	
                                """);
    }

}
