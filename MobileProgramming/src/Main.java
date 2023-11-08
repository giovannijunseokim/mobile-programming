import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    private static int[][][][] setOfBlockArrays = { // [7][4][?][?]
            {
                    {
                            {11, 11},
                            {11, 11}
                    },
                    {
                            {11, 11},
                            {11, 11}
                    },
                    {
                            {11, 11},
                            {11, 11}
                    },
                    {
                            {11, 11},
                            {11, 11}
                    }
            },
            {
                    {
                            {0, 21, 0},
                            {21, 21, 21},
                            {0, 0, 0},
                    },
                    {
                            {0, 21, 0},
                            {0, 21, 21},
                            {0, 21, 0},
                    },
                    {
                            {0, 0, 0},
                            {21, 21, 21},
                            {0, 21, 0},
                    },
                    {
                            {0, 21, 0},
                            {21, 21, 0},
                            {0, 21, 0},
                    },
            },
            {
                    {
                            {31, 0, 0},
                            {31, 31, 31},
                            {0, 0, 0},
                    },
                    {
                            {0, 31, 31},
                            {0, 31, 0},
                            {0, 31, 0},
                    },
                    {
                            {0, 0, 0},
                            {31, 31, 31},
                            {0, 0, 31},
                    },
                    {
                            {0, 31, 0},
                            {0, 31, 0},
                            {31, 31, 0},
                    },
            },
            {
                    {
                            {0, 0, 41},
                            {41, 41, 41},
                            {0, 0, 0},
                    },
                    {
                            {0, 41, 0},
                            {0, 41, 0},
                            {0, 41, 41},
                    },
                    {
                            {0, 0, 0},
                            {41, 41, 41},
                            {41, 0, 0},
                    },
                    {
                            {41, 41, 0},
                            {0, 41, 0},
                            {0, 41, 0},
                    },
            },
            {
                    {
                            {0, 51, 0},
                            {51, 51, 0},
                            {51, 0, 0},
                    },
                    {
                            {51, 51, 0},
                            {0, 51, 51},
                            {0, 0, 0},
                    },
                    {
                            {0, 51, 0},
                            {51, 51, 0},
                            {51, 0, 0},
                    },
                    {
                            {51, 51, 0},
                            {0, 51, 51},
                            {0, 0, 0},
                    },
            },
            {
                    {
                            {0, 61, 0},
                            {0, 61, 61},
                            {0, 0, 61},
                    },
                    {
                            {0, 0, 0},
                            {0, 61, 61},
                            {61, 61, 0},
                    },
                    {
                            {0, 61, 0},
                            {0, 61, 61},
                            {0, 0, 61},
                    },
                    {
                            {0, 0, 0},
                            {0, 61, 61},
                            {61, 61, 0},
                    },
            },
            {
                    {
                            {0, 0, 0, 0},
                            {71, 71, 71, 71},
                            {0, 0, 0, 0},
                            {0, 0, 0, 0},
                    },
                    {
                            {0, 71, 0, 0},
                            {0, 71, 0, 0},
                            {0, 71, 0, 0},
                            {0, 71, 0, 0},
                    },
                    {
                            {0, 0, 0, 0},
                            {71, 71, 71, 71},
                            {0, 0, 0, 0},
                            {0, 0, 0, 0},
                    },
                    {
                            {0, 71, 0, 0},
                            {0, 71, 0, 0},
                            {0, 71, 0, 0},
                            {0, 71, 0, 0},
                    },
            },
    }; // end of setOfBlockArrays
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

    public static void drawMatrix(Matrix m) {
        int dy = m.get_dy();
        int dx = m.get_dx();
        int array[][] = m.get_array();
        for (int y = 0; y < dy; y++) {
            for (int x = 0; x < dx; x++) {
                switch (array[y][x]) {
                    case 0 -> System.out.print("□ ");
                    case 11 -> System.out.print("★ ");
                    case 21 -> System.out.print("● ");
                    case 31 -> System.out.print("◆ ");
                    case 41 -> System.out.print("▲ ");
                    case 51 -> System.out.print("♣ ");
                    case 61 -> System.out.print("♠ ");
                    case 71 -> System.out.print("♥ ");
                    default -> System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        char key;
        TetrisState state;
        Tetris.init(setOfBlockArrays);
        CTetris.init(setOfBlockArrays);
        CTetris board = new CTetris(15, 10);
        Random random = new Random();
        key = (char) ('0' + random.nextInt(7));
        board.accept(key);
        drawMatrix(board.get_oScreen());
        System.out.println();

        while ((key = getKey()) != 'q') {
            state = board.accept(key);
            drawMatrix(board.get_oScreen());
            System.out.println();
            if (state == TetrisState.NewBlock) {
                key = (char) ('0' + random.nextInt(7));
                state = board.accept(key);
                drawMatrix(board.get_oScreen());
                System.out.println();
                if (state == TetrisState.Finished) break; // Game Over!
            }
        }
        System.out.println("Program terminated!");
    }
}
