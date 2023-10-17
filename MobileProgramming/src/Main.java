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
                    {0, 0, 1},
                    {1, 1, 1},
                    {0, 0, 0},
            });

            degree90LTetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {0, 1, 1},
            });

            degree180LTetromino = new Matrix(new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {1, 0, 0},
            });

            degree270LTetromino = new Matrix(new int[][]{
                    {1, 1, 0},
                    {0, 1, 0},
                    {0, 1, 0},
            });

            degree0STetromino = new Matrix(new int[][]{
                    {0, 1, 1},
                    {1, 1, 0},
                    {0, 0, 0},
            });

            degree90STetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {0, 1, 1},
                    {0, 0, 1},
            });

            degree180STetromino = new Matrix(new int[][]{
                    {0, 0, 0},
                    {0, 1, 1},
                    {1, 1, 0},
            });

            degree270STetromino = new Matrix(new int[][]{
                    {1, 0, 0},
                    {1, 1, 0},
                    {0, 1, 0},
            });

            degree0ZTetromino = new Matrix(new int[][]{
                    {1, 1, 0},
                    {0, 1, 1},
                    {0, 0, 0},
            });

            degree90ZTetromino = new Matrix(new int[][]{
                    {0, 0, 1},
                    {0, 1, 1},
                    {0, 1, 0},
            });

            degree180ZTetromino = new Matrix(new int[][]{
                    {0, 0, 0},
                    {1, 1, 0},
                    {0, 1, 1},
            });

            degree270ZTetromino = new Matrix(new int[][]{
                    {0, 1, 0},
                    {1, 1, 0},
                    {1, 0, 0},
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

    private static int iScreenDy = 15; // 사용 가능한 빈 칸의 세로 길이
    private static int iScreenDx = 10; // 사용 가능한 빈 칸의 가로 길이
    private static int iScreenDw = 4; // large enough to cover the largest block : 벽의 두께

    private static int[][] createArrayScreen(int dy, int dx, int dw) {
        int y, x;
        int[][] array = new int[dy + dw][dx + 2 * dw]; // 전체 크기(벽 포함)
        for (y = 0; y < array.length; y++) // array.length = dy + dx == 전체 세로 길이만큼 반복(15 + 4)
            for (x = 0; x < dw; x++) // 벽 두께만큼 가로로 반복 (4)
                array[y][x] = 1; // 왼쪽 벽
        for (y = 0; y < array.length; y++) // 전체 세로 크기만큼
            for (x = dw + dx; x < array[0].length; x++) // dw+dx 부터(흰 공간의 끝) 가로 끝 까지
                array[y][x] = 1; // 오른쪽 벽
        for (y = dy; y < array.length; y++) // 흰 부분 끝부터 바닥까지
            for (x = 0; x < array[0].length; x++) // 가로 전체
                array[y][x] = 1; // 바닥 벽
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

    private static final Random random = new Random();
    private static int idxBlockType = random.nextInt(blockTypes);
    private static int idxBlockDegree = 0;

    private static Matrix getClockwiseRotatedBlock() {
        idxBlockDegree = (idxBlockDegree + 1) % blockDegrees;
        return setOfBlockObjects[idxBlockType][idxBlockDegree];
    }

    private static Matrix getCounterClockwiseRotatedBlock() {
        idxBlockDegree = (idxBlockDegree - 1) % blockDegrees;
        return setOfBlockObjects[idxBlockType][idxBlockDegree];
    }

    public static void main(String[] args) throws Exception {
        Matrix currBlk = setOfBlockObjects[idxBlockType][idxBlockDegree]; // 현재 블록
        boolean newBlockNeeded = false;
        int top = 0;
        int left = iScreenDw + iScreenDx / 2 - 2;
        int[][] arrayScreen = createArrayScreen(iScreenDy, iScreenDx, iScreenDw);
        char key;
        Matrix iScreen = new Matrix(arrayScreen); // 빈 테트리스
        // tempBlk = 블록이 들어갈 공간
        Matrix tempBlk = iScreen.clip(top, left, top + currBlk.get_dy(), left + currBlk.get_dx());
        tempBlk = tempBlk.add(currBlk); // 공간에 현 블록 더함
        Matrix oScreen = new Matrix(iScreen); // 출력할 테트리스
        oScreen.paste(tempBlk, top, left); // 출력할 테트리스에 tempBlk 추가
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
                    currBlk = getClockwiseRotatedBlock();
                    break; // rotate the block clockwise
                case ' ':
                    top = iScreenDy;
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
                    case ' ':
                        do {
                            top--;
                            tempBlk = iScreen.clip(top, left, top + currBlk.get_dy(), left + currBlk.get_dx());
                            tempBlk = tempBlk.add(currBlk);
                        } while (tempBlk.anyGreaterThan(1));
                        newBlockNeeded = true;
                        break; // undo: move up
                    case 'w':
                        currBlk = getCounterClockwiseRotatedBlock();
                        break; // undo: rotate the block counter-clockwise
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
                idxBlockType = random.nextInt(blockTypes);
                idxBlockDegree = 0;
                currBlk = setOfBlockObjects[idxBlockType][idxBlockDegree];
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
