import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    static Matrix degree0ITetromino;
    static Matrix degree90ITetromino;
    static Matrix degree180ITetromino;
    static Matrix degree270ITetromino;
    static Matrix degree0OTetromino;
    static Matrix degree90OTetromino;
    static Matrix degree180OTetromino;
    static Matrix degree270OTetromino;
    static Matrix degree0TTetromino;
    static Matrix degree90TTetromino;
    static Matrix degree180TTetromino;
    static Matrix degree270TTetromino;
    static Matrix degree0JTetromino;
    static Matrix degree90JTetromino;
    static Matrix degree180JTetromino;
    static Matrix degree270JTetromino;
    static Matrix degree0LTetromino;
    static Matrix degree90LTetromino;
    static Matrix degree180LTetromino;
    static Matrix degree270LTetromino;
    static Matrix degree0STetromino;
    static Matrix degree90STetromino;
    static Matrix degree180STetromino;
    static Matrix degree270STetromino;

    static Matrix degree0ZTetromino;
    static Matrix degree90ZTetromino;
    static Matrix degree180ZTetromino;
    static Matrix degree270ZTetromino;


    static {
        try {
            degree0ITetromino = new Matrix(new int[][]{
                    {0, 0, 0, 0},
                    {1, 1, 1, 1},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}
            });

            degree90ITetromino = new Matrix(new int[][]{
                    {0, 1, 0, 0},
                    {0, 1, 0, 0},
                    {0, 1, 0, 0},
                    {0, 1, 0, 0}
            });

            degree180ITetromino = new Matrix(new int[][]{
                    {0, 0, 0, 0},
                    {1, 1, 1, 1},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}
            });

            degree270ITetromino = new Matrix(new int[][]{
                    {0, 1, 0, 0},
                    {0, 1, 0, 0},
                    {0, 1, 0, 0},
                    {0, 1, 0, 0}
            });

            degree0OTetromino = new Matrix(new int[][]{
                    {1, 1},
                    {1, 1}
            });

            degree90OTetromino = new Matrix(new int[][]{
                    {1, 1},
                    {1, 1}
            });

            degree180OTetromino = new Matrix(new int[][]{
                    {1, 1},
                    {1, 1}
            });

            degree270OTetromino = new Matrix(new int[][]{
                    {1, 1},
                    {1, 1}
            });

            degree0TTetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {1, 1, 1},
                    {0, 0, 0}
            });

            degree90TTetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {0, 1, 1},
                    {0, 1, 0}
            });

            degree180TTetromino = new Matrix(new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {0, 1, 0}
            });

            degree270TTetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {1, 1, 0},
                    {0, 1, 0}
            });

            degree0JTetromino = new Matrix(new int[][]{
                    {1, 0, 0},
                    {1, 1, 1},
                    {0, 0, 0},
            });

            degree90JTetromino = new Matrix(new int[][]{
                    {0, 1, 1},
                    {0, 1, 0},
                    {0, 1, 0},
            });

            degree180JTetromino = new Matrix(new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {0, 0, 1},
            });

            degree270JTetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {1, 1, 0},
            });

            degree0LTetromino = new Matrix(new int[][]{
                    {1, 0, 0},
                    {1, 1, 1},
                    {0, 0, 0},
            });

            degree90LTetromino = new Matrix(new int[][]{
                    {0, 1, 1},
                    {0, 1, 0},
                    {0, 1, 0},
            });

            degree180LTetromino = new Matrix(new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {0, 0, 1},
            });

            degree270LTetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {1, 1, 0},
            });

            degree0STetromino = new Matrix(new int[][]{
                    {1, 0, 0},
                    {1, 1, 1},
                    {0, 0, 0},
            });

            degree90STetromino = new Matrix(new int[][]{
                    {0, 1, 1},
                    {0, 1, 0},
                    {0, 1, 0},
            });

            degree180STetromino = new Matrix(new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {0, 0, 1},
            });

            degree270STetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {1, 1, 0},
            });

            degree0ZTetromino = new Matrix(new int[][]{
                    {1, 0, 0},
                    {1, 1, 1},
                    {0, 0, 0},
            });

            degree90ZTetromino = new Matrix(new int[][]{
                    {0, 1, 1},
                    {0, 1, 0},
                    {0, 1, 0},
            });

            degree180ZTetromino = new Matrix(new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {0, 0, 1},
            });

            degree270ZTetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {1, 1, 0},
            });
        } catch (MatrixException e) {
            throw new RuntimeException(e);
        }
    }

    static Matrix[] iTetrominos = new Matrix[]{
            degree0ITetromino, degree90ITetromino, degree180ITetromino, degree270ITetromino
    };

    static Matrix[] oTetrominos = new Matrix[]{
            degree0OTetromino, degree90OTetromino, degree180OTetromino, degree270OTetromino
    };

    static Matrix[] tTetrominos = new Matrix[]{
            degree0TTetromino, degree90TTetromino, degree180TTetromino, degree270TTetromino
    };

    static Matrix[] jTetrominos = new Matrix[]{
            degree0JTetromino, degree90JTetromino, degree180JTetromino, degree270JTetromino
    };

    static Matrix[] lTetrominos = new Matrix[]{
            degree0LTetromino, degree90LTetromino, degree180LTetromino, degree270LTetromino
    };

    static Matrix[] sTetrominos = new Matrix[]{
            degree0STetromino, degree90STetromino, degree180STetromino, degree270STetromino
    };

    static Matrix[] zTetrominos = new Matrix[]{
            degree0ZTetromino, degree90ZTetromino, degree180ZTetromino, degree270ZTetromino
    };

    static Matrix[][] setOfBlockObjects = new Matrix[][]{iTetrominos, oTetrominos, tTetrominos, jTetrominos, lTetrominos, sTetrominos, zTetrominos};

    static int[][] arrayBlk = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 0},
    };
    private static int iScreenDy = 15;
    private static int iScreenDx = 10;
    private static int iScreenDw = 4; // large enough to cover the largest block

    private static int[][] createArrayScreen(int dy, int dx, int dw) {
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

    public static void drawMatrix(Matrix m) {
        int dy = m.get_dy();
        int dx = m.get_dx();
        int array[][] = m.get_array();
        for (int y = 0; y < dy; y++) {
            for (int x = 0; x < dx; x++) {
                if (array[y][x] == 0) System.out.print("□ ");
                else if (array[y][x] == 1) System.out.print("■ ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String line = null;
    private static int nKeys = 0;

    private static char getKey() throws IOException {
        char ch;
        if (nKeys != 0) {
            ch = line.charAt(line.length() - nKeys);
            nKeys--;
            return ch;
        }
        do {
            line = br.readLine();
            nKeys = line.length();
        } while (nKeys == 0);
        ch = line.charAt(0);
        nKeys--;
        return ch;
    }

    private static final int blockTypes = 7;
    private static final int blockDegrees = 4;

    static Random random = new Random();
    static int idxBlockType = random.nextInt(blockTypes);
    static int idxBlockDegree = random.nextInt(blockDegrees);

    private static void rotateBlock() {
        idxBlockDegree = (idxBlockDegree + 1) % 4;
    }

    public static void main(String[] args) throws Exception {
        Matrix currBlk = setOfBlockObjects[idxBlockType][idxBlockDegree];

        boolean newBlockNeeded = false;
        int top = 0;
        int left = iScreenDw + iScreenDx / 2 - 2;
        int[][] arrayScreen = createArrayScreen(iScreenDy, iScreenDx, iScreenDw);
        char key;
        Matrix iScreen = new Matrix(arrayScreen);
        Matrix tempBlk = iScreen.clip(top, left, top + currBlk.get_dy(), left + currBlk.get_dx());
        tempBlk = tempBlk.add(currBlk);
        Matrix oScreen = new Matrix(iScreen);
        oScreen.paste(tempBlk, top, left);
        drawMatrix(oScreen);
        System.out.println();
        while ((key = getKey()) != 'q') {
            switch (key) {
                case 'a':
                    left--;
                    break; // move left
                case 'd':
                    left++;
                    break; // move right
                case 's':
                    top++;
                    break; // move down
                case 'w':
                    break; // rotate the block clockwise
                case ' ':
                    break; // drop the block
                default:
                    System.out.println("unknown key!");
            }
            tempBlk = iScreen.clip(top, left, top + currBlk.get_dy(), left + currBlk.get_dx());
            tempBlk = tempBlk.add(currBlk);
            if (tempBlk.anyGreaterThan(1)) {
                switch (key) {
                    case 'a':
                        left++;
                        break; // undo: move right
                    case 'd':
                        left--;
                        break; // undo: move left
                    case 's':
                        top--;
                        newBlockNeeded = true;
                        break; // undo: move up
                    case 'w':
                        break; // undo: rotate the block counter-clockwise
                    case ' ':
                        break; // undo: move up
                }
                tempBlk = iScreen.clip(top, left, top + currBlk.get_dy(), left + currBlk.get_dx());
                tempBlk = tempBlk.add(currBlk);
            }
            oScreen = new Matrix(iScreen);
            oScreen.paste(tempBlk, top, left);
            drawMatrix(oScreen);
            System.out.println();
            if (newBlockNeeded) {
                iScreen = new Matrix(oScreen);
                top = 0;
                left = iScreenDw + iScreenDx / 2 - 2;
                newBlockNeeded = false;
                currBlk = new Matrix(arrayBlk);
                tempBlk = iScreen.clip(top, left, top + currBlk.get_dy(), left + currBlk.get_dx());
                tempBlk = tempBlk.add(currBlk);
                if (tempBlk.anyGreaterThan(1)) {
                    System.out.println("Game Over!");
                    System.exit(0);
                }
                oScreen = new Matrix(iScreen);
                oScreen.paste(tempBlk, top, left);
                drawMatrix(oScreen);
                System.out.println();
            }
        }
    }
}
