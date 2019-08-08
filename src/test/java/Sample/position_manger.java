package Sample;

public class position_manger {

    public String[][] boardR;//board array

    private String[] shipTypes = new String[]{"ss", "m", "dddd", "ccc"};

    public position_manger(String[][] br) {
        boardR = br;

    }//end constructor

    public boolean placeShip(int row, int column, int dir, int shipT) {


        return true;

    }//end place_ship

    public boolean isValidPos(int row, int column, int dir, int len) {

boolean b = false;
        for (int i = 0; i < boardR.length; i++) {

            if (boardR[i].length > boardR.length - row && dir == 1 && len <= boardR.length - row) {
                b= true;
            }

            else {
                b = false;
            }
            //end isValidPos


        }
return b;
    }
}