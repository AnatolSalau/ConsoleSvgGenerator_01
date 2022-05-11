package fileClasses;

public class TextWhiteSlotFile_2 extends Text{
    public TextWhiteSlotFile_2() {
        super();
        this.defaultText = DefaultText.WHITE_SLOT_2.getText();
    }
    public TextWhiteSlotFile_2(double whiteX, double whiteY, double whiteWidth, double whiteHeight,
                               double circleOneX, double circleOneY, double circleOneR,
                               double circleTwoX, double circleTwoY, double circleTwoR
                               ) {
    this();
    addStringToList_fullText("""
                        <rect class="fil1" transform="matrix
                        (0.707106 -0.707106 0.707106 0.707106
                            
            """);
        addStringToList_fullText(Double.toString(whiteX)+"\n");
        addStringToList_fullText(Double.toString(whiteY)+"\n");
        addStringToList_fullText("""
      
						)
						" width="                           
            """);
        addStringToList_fullText(Double.toString(whiteWidth)+"\n");
        addStringToList_fullText("""
      
						)
						" height="                      
            """);
        addStringToList_fullText(Double.toString(whiteHeight)+"\n");
        addStringToList_fullText("""
      
						"/>
						<circle class="fil1" cx="                    
            """);
        addStringToList_fullText(Double.toString(circleOneX)+"\n");
        addStringToList_fullText("""
      
						" cy="                  
            """);
        addStringToList_fullText(Double.toString(circleOneY)+"\n");
        addStringToList_fullText("""
      
						" r="              
            """);
        addStringToList_fullText(Double.toString(circleOneR)+"\n");
        addStringToList_fullText("""
      
						"/>
						<circle class="fil1" cx="          
            """);
        addStringToList_fullText(Double.toString(circleTwoX)+"\n");
        addStringToList_fullText("""
      
						" cy="                  
            """);
        addStringToList_fullText(Double.toString(circleTwoY)+"\n");
        addStringToList_fullText("""
      
						" r="              
            """);
        addStringToList_fullText(Double.toString(circleTwoR)+"\n");
        addStringToList_fullText("""
      
						"/>         
            """);
    }
    public void reWriteFullText(double whiteX, double whiteY, double whiteWidth, double whiteHeight,
                                double circleOneX, double circleOneY, double circleOneR,
                                double circleTwoX, double circleTwoY, double circleTwoR
    ) {
        this.fullText.removeAll(fullText);
        addStringToList_fullText("""
                        <rect class="fil1" transform="matrix
                        (0.707106 -0.707106 0.707106 0.707106
                            
            """);
        addStringToList_fullText(Double.toString(whiteX)+"\n");
        addStringToList_fullText(Double.toString(whiteY)+"\n");
        addStringToList_fullText("""
      
						)
						" width="                           
            """);
        addStringToList_fullText(Double.toString(whiteWidth)+"\n");
        addStringToList_fullText("""
      
						)
						" height="                      
            """);
        addStringToList_fullText(Double.toString(whiteHeight)+"\n");
        addStringToList_fullText("""
      
						"/>
						<circle class="fil1" cx="                    
            """);
        addStringToList_fullText(Double.toString(circleOneX)+"\n");
        addStringToList_fullText("""
      
						" cy="                  
            """);
        addStringToList_fullText(Double.toString(circleOneY)+"\n");
        addStringToList_fullText("""
      
						" r="              
            """);
        addStringToList_fullText(Double.toString(circleOneR)+"\n");
        addStringToList_fullText("""
      
						"/>
						<circle class="fil1" cx="          
            """);
        addStringToList_fullText(Double.toString(circleTwoX)+"\n");
        addStringToList_fullText("""
      
						" cy="                  
            """);
        addStringToList_fullText(Double.toString(circleTwoY)+"\n");
        addStringToList_fullText("""
      
						" r="              
            """);
        addStringToList_fullText(Double.toString(circleTwoR)+"\n");
        addStringToList_fullText("""
      
						"/>       
            """);
    }
}
