public class SetOfBlockArrays {
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

    public static int[][][][] getSetOfBlockArrays() {
        return setOfBlockArrays;
    }

    public static int[][] getBlock(int type, int degree) {
        return setOfBlockArrays[type][degree];
    }
}