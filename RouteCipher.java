public class RouteCipher{
    /** A two-dimensional array of single-character strings,
     instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    public RouteCipher(int rows, int columns){
        numRows = rows;
        numCols = columns;
        letterBlock = new String[numRows][numCols];
    }

    public String[][] getLetterBlock(){
        return letterBlock;
    }

        
    /** Places a string into letterBlock in row-major order.
     *   @param str the string to be processed
    *   Postcondition:
    *     if str.length() < numRows * numCols, "A" in each unfilled cell
    *     if str.length() > numRows * numCols, trailing characters are ignored
    */
    public void fillBlock(String str){ 
        /* to be implemented in part (a) */ 
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     *   Precondition: letterBlock has been filled
    *   @return the encrypted string from letterBlock
    */
    public String encryptBlock(){ 
        String str ="";
        for(int x = 0; x < letterBlock[0].length; x++){
            for(int y = 0; y<letterBlock.length; y++){
                str += letterBlock[y][x];
            }
        }
        return str;
     }

    /** Encrypts a message.
     *   @param message the string to be encrypted
    *   @return the encrypted message;
    *           if message is the empty string, returns the empty string
    */
    public String encryptMessage(String message){ 
        /* to be implemented in part (b) */ 
    }

    // There may be instance variables, constructors, and methods that are not shown
}