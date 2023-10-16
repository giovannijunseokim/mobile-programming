import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    // 테트리스 조각들
    private static int[][][][] setOfBlockArrays = { // [7][4][?][?]
            {
                    {
                            {1, 1},
                            {1, 1}
                    },
                    {
                            {1, 1},
                            {1, 1}
                    },
                    {
                            {1, 1},
                            {1, 1}
                    },
                    {
                            {1, 1},
                            {1, 1}
                    }
            },
            {
                    {
                            {0, 1, 0},
                            {1, 1, 1},
                            {0, 0, 0},
                    },
                    {
                            {0, 1, 0},
                            {0, 1, 1},
                            {0, 1, 0},
                    },
                    {
                            {0, 0, 0},
                            {1, 1, 1},
                            {0, 1, 0},
                    },
                    {
                            {0, 1, 0},
                            {1, 1, 0},
                            {0, 1, 0},
                    },
            },
            {
                    {
                            {1, 0, 0},
                            {1, 1, 1},
                            {0, 0, 0},
                    },
                    {
                            {0, 1, 1},
                            {0, 1, 0},
                            {0, 1, 0},
                    },
                    {
                            {0, 0, 0},
                            {1, 1, 1},
                            {0, 0, 1},
                    },
                    {
                            {0, 1, 0},
                            {0, 1, 0},
                            {1, 1, 0},
                    },
            },
            {
                    {
                            {0, 0, 1},
                            {1, 1, 1},
                            {0, 0, 0},
                    },
                    {
                            {0, 1, 0},
                            {0, 1, 0},
                            {0, 1, 1},
                    },
                    {
                            {0, 0, 0},
                            {1, 1, 1},
                            {1, 0, 0},
                    },
                    {
                            {1, 1, 0},
                            {0, 1, 0},
                            {0, 1, 0},
                    },
            },
            {
                    {
                            {0, 1, 0},
                            {1, 1, 0},
                            {1, 0, 0},
                    },
                    {
                            {1, 1, 0},
                            {0, 1, 1},
                            {0, 0, 0},
                    },
                    {
                            {0, 1, 0},
                            {1, 1, 0},
                            {1, 0, 0},
                    },
                    {
                            {1, 1, 0},
                            {0, 1, 1},
                            {0, 0, 0},
                    },
            },
            {
                    {
                            {0, 1, 0},
                            {0, 1, 1},
                            {0, 0, 1},
                    },
                    {
                            {0, 0, 0},
                            {0, 1, 1},
                            {1, 1, 0},
                    },
                    {
                            {0, 1, 0},
                            {0, 1, 1},
                            {0, 0, 1},
                    },
                    {
                            {0, 0, 0},
                            {0, 1, 1},
                            {1, 1, 0},
                    },
            },
            {
                    {
                            {0, 0, 0, 0},
                            {1, 1, 1, 1},
                            {0, 0, 0, 0},
                            {0, 0, 0, 0},
                    },
                    {
                            {0, 1, 0, 0},
                            {0, 1, 0, 0},
                            {0, 1, 0, 0},
                            {0, 1, 0, 0},
                    },
                    {
                            {0, 0, 0, 0},
                            {1, 1, 1, 1},
                            {0, 0, 0, 0},
                            {0, 0, 0, 0},
                    },
                    {
                            {0, 1, 0, 0},
                            {0, 1, 0, 0},
                            {0, 1, 0, 0},
                            {0, 1, 0, 0},
                    },
            },
    }; // end of setOfBlockArrays
    // 입력받는 객체
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 입력 String
    private static String line = null;
    // String 내부 char의 개수
    private static int nKeys = 0;

    // 입력 키 받기
    private static char getKey() throws IOException {
        char ch;
        // 아직 입력받은 String이 있음.
        if (nKeys != 0) {
            // 맨 첫 번째(아직 안 쓴) 사용
            ch = line.charAt(line.length() - nKeys);
            nKeys--;
            return ch;
        }
        do {
            line = br.readLine();
            nKeys = line.length();
        } while (nKeys == 0);
        // String의 맨 첫번째 char
        ch = line.charAt(0);
        // char 하나 줄음
        nKeys--;
        return ch;
    }

    // 0이면 □, 1이면 ■로 그림
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

    public static void main(String[] args) throws Exception {
        char key;
        TetrisState state;
        Tetris.init(setOfBlockArrays);
        Tetris board = new Tetris(15, 10);
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
