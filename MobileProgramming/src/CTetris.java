public class CTetris extends Tetris {
    private static Matrix[][] setOfCBlockObjects;    // Matrix object arrays of all blocks

    public static void init(int[][][][] setOfBlockArrays) throws Exception { // initialize static variables
        nBlockTypes = setOfBlockArrays.length;
        nBlockDegrees = setOfBlockArrays[0].length;
        setOfCBlockObjects = createSetOfBlocks(setOfBlockArrays);
        iScreenDw = findLargestBlockSize(setOfBlockArrays);
    }

    @Override
    protected int[][] createArrayScreen(int dy, int dx, int dw) {
        int y, x;
        int[][] array = new int[dy + dw][dx + 2 * dw];
        for (y = 0; y < array.length; y++)
            for (x = 0; x < dw; x++)
                array[y][x] = 1;
        for (y = 0; y < array.length; y++)
            for (x = dw + dx; x < array[0].length; x++)
                array[y][x] = 1;
        for (y = dy; y < array.length; y++)
            for (x = 0; x < array[0].length; x++)
                array[y][x] = 1;
        return array;
    }

    private Matrix deleteFullLines() throws Exception {
        int fullLine = getFullLine(oScreen);
        if (fullLine != NO_FULL_LINE) {
            clearLine(oScreen, fullLine);
            Matrix screenBelowFullLine = oScreen.clip(fullLine, iScreenDw, iScreenDy, iScreenDw + iScreenDx);
            Matrix screenAboveFullLine = oScreen.clip(0, iScreenDw, fullLine, iScreenDw + iScreenDx);
            oScreen = new Matrix(createArrayScreen(iScreenDy, iScreenDx, iScreenDw));
            oScreen.paste(screenBelowFullLine, fullLine, iScreenDw);
            oScreen.paste(screenAboveFullLine, 1, iScreenDw);
        }
        return oScreen;
    }

    public CTetris(int cy, int cx) throws Exception {
        super(cy, cx); // initialize dynamic variables
    }

    @Override
    public TetrisState accept(char key) throws Exception {
        Matrix tempBlk, tempBlk2;
        TetrisState _state = super.accept(key);
        currBlk = setOfCBlockObjects[super.idxBlockType][super.idxBlockDegree];
        tempBlk = super.iScreen.clip(top, left, top + currBlk.get_dy(), left + currBlk.get_dx());
        tempBlk2 = tempBlk.add(currBlk);
        super.oScreen.paste(super.iScreen, 0, 0);
        super.oScreen.paste(tempBlk2, top, left);
        if (_state == TetrisState.NewBlock) {
            oScreen = deleteFullLines();
            iScreen.paste(oScreen, 0, 0);
        }
        return _state;
    }

    private void clearLine(Matrix screen, int fullLine) {
        int[][] array = screen.get_array();
        int[] lineToClear = array[fullLine];
        for (int x = iScreenDw; x < iScreenDw + iScreenDx; x++) {
            lineToClear[x] = 0;
        }
    }

    private int getFullLine(Matrix screen) {
        int[][] array = screen.get_array();
        for (int line = 0; line < iScreenDy; line++) {
            boolean isFullLine = true;
            for (int x = iScreenDw; x < iScreenDx + iScreenDw; x++) {
                if (array[line][x] < 1) {
                    isFullLine = false;
                    break;
                }
            }
            if (isFullLine) {
                return line;
            }
        }
        return NO_FULL_LINE;
    }

    private static final int NO_FULL_LINE = -1;
}