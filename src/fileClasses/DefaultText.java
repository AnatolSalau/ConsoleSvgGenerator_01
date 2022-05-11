package fileClasses;

public enum DefaultText {
    TOP_FILE_0(0, """
            <?xml version="1.0" encoding="UTF-8"?>
            <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
            <!-- Creator: CorelDRAW 2020 (64-Bit) -->
            <svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" width="320mm" height="280mm" version="1.1" style="shape-rendering:geometricPrecision; text-rendering:geometricPrecision; image-rendering:optimizeQuality; fill-rule:evenodd; clip-rule:evenodd"
            viewBox="0 0 320 280"
             xmlns:xlink="http://www.w3.org/1999/xlink"
             xmlns:xodm="http://www.corel.com/coreldraw/odm/2003">
             <defs>
            	  <style type="text/css">
            	   <![CDATA[
            		.str1 {stroke:black;stroke-width:0;stroke-miterlimit:22.9256}
            		.str0 {stroke:black;stroke-width:0;stroke-miterlimit:22.9256}
            		.fil1 {fill:white}
            		.fil0 {fill:black}
            	   ]]>
            	  </style>
             </defs>
            	   <g id="RectBlack">
            		 <g id="Layer_x0020_1_0">
            		  <metadata id="CorelCorpID_1Corel-Layer"/>
            """),
    BLACK_RECTANGULAR_1(1, """
            		  <rect class="fil0 str0" x="
            		  100
            		  " y="
            		  99
            		  " width="
            		  5.4
            		  " height="
            		  15
            		  "/>
            			  <g id="Rect_inclined_red_x0020__x2014__x0020_03.svg">
            				   <g id="RectWhite">	
            """),
    WHITE_SLOT_2(2, """
            						<rect class="fil1" transform="matrix
            						(0.707106 -0.707106 0.707106 0.707106\s
            						100.38
            						102.41
            						)
            						" width="
            						1.05
            						" height="
            						2.3
            						"/>
            						<circle class="fil1" cx="
            						100.751
            						" cy="
            						102.039
            						" r="
            						0.525
            						"/>
            						<circle class="fil1" cx="
            						102.378
            						" cy="
            						103.665
            						" r="
            						0.525
            						"/>
            """),
    END_FILE_3(3, """
            				   </g>
            			  </g>	 \s
            		 </g>
            	  </g>
            </svg>
            """);
    private int index;
    private String text;

    DefaultText (int index, String text) {
        this.index = index;
        this.text= text;
    }
    public int getIndex() {return index;}
    public String getText() {return text;}
}
