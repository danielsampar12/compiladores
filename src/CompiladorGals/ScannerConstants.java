package CompiladorGals;

public interface ScannerConstants
{
    int[] SCANNER_TABLE_INDEXES = 
    {
        0,
        57,
        57,
        58,
        250,
        441,
        441,
        441,
        441,
        441,
        451,
        451,
        461,
        461,
        473,
        473,
        473,
        473,
        474,
        474,
        477,
        514,
        515,
        515,
        515,
        525,
        535,
        545,
        555,
        567,
        567,
        567,
        603,
        794,
        804,
        814,
        826,
        863,
        1055,
        1057,
        1067,
        1077,
        1077,
        1079
    };

    int[][] SCANNER_TABLE = 
    {
        {9, 1},
        {10, 1},
        {32, 1},
        {33, 2},
        {36, 3},
        {39, 4},
        {40, 5},
        {41, 6},
        {42, 7},
        {43, 8},
        {44, 9},
        {45, 10},
        {46, 11},
        {47, 12},
        {48, 13},
        {49, 13},
        {50, 13},
        {51, 13},
        {52, 13},
        {53, 13},
        {54, 13},
        {55, 13},
        {56, 13},
        {57, 13},
        {58, 14},
        {59, 15},
        {60, 16},
        {61, 17},
        {62, 18},
        {92, 19},
        {97, 20},
        {98, 20},
        {99, 20},
        {100, 20},
        {101, 20},
        {102, 20},
        {103, 20},
        {104, 20},
        {105, 20},
        {106, 20},
        {107, 20},
        {108, 20},
        {109, 20},
        {110, 20},
        {111, 20},
        {112, 20},
        {113, 20},
        {114, 20},
        {115, 20},
        {116, 20},
        {117, 20},
        {118, 20},
        {119, 20},
        {120, 20},
        {121, 20},
        {122, 20},
        {123, 21},
        {61, 22},
        {9, 3},
        {13, 3},
        {32, 3},
        {33, 3},
        {34, 3},
        {35, 3},
        {36, 3},
        {37, 3},
        {38, 3},
        {39, 3},
        {40, 3},
        {41, 3},
        {42, 3},
        {43, 3},
        {44, 3},
        {45, 3},
        {46, 3},
        {47, 3},
        {48, 3},
        {49, 3},
        {50, 3},
        {51, 3},
        {52, 3},
        {53, 3},
        {54, 3},
        {55, 3},
        {56, 3},
        {57, 3},
        {58, 3},
        {59, 3},
        {60, 3},
        {61, 3},
        {62, 3},
        {63, 3},
        {64, 3},
        {65, 3},
        {66, 3},
        {67, 3},
        {68, 3},
        {69, 3},
        {70, 3},
        {71, 3},
        {72, 3},
        {73, 3},
        {74, 3},
        {75, 3},
        {76, 3},
        {77, 3},
        {78, 3},
        {79, 3},
        {80, 3},
        {81, 3},
        {82, 3},
        {83, 3},
        {84, 3},
        {85, 3},
        {86, 3},
        {87, 3},
        {88, 3},
        {89, 3},
        {90, 3},
        {91, 3},
        {92, 3},
        {93, 3},
        {94, 3},
        {95, 3},
        {96, 3},
        {97, 3},
        {98, 3},
        {99, 3},
        {100, 3},
        {101, 3},
        {102, 3},
        {103, 3},
        {104, 3},
        {105, 3},
        {106, 3},
        {107, 3},
        {108, 3},
        {109, 3},
        {110, 3},
        {111, 3},
        {112, 3},
        {113, 3},
        {114, 3},
        {115, 3},
        {116, 3},
        {117, 3},
        {118, 3},
        {119, 3},
        {120, 3},
        {121, 3},
        {122, 3},
        {123, 3},
        {124, 3},
        {125, 3},
        {126, 3},
        {161, 3},
        {162, 3},
        {163, 3},
        {164, 3},
        {165, 3},
        {166, 3},
        {167, 3},
        {168, 3},
        {169, 3},
        {170, 3},
        {171, 3},
        {172, 3},
        {173, 3},
        {174, 3},
        {175, 3},
        {176, 3},
        {177, 3},
        {178, 3},
        {179, 3},
        {180, 3},
        {181, 3},
        {182, 3},
        {183, 3},
        {184, 3},
        {185, 3},
        {186, 3},
        {187, 3},
        {188, 3},
        {189, 3},
        {190, 3},
        {191, 3},
        {192, 3},
        {193, 3},
        {194, 3},
        {195, 3},
        {196, 3},
        {197, 3},
        {198, 3},
        {199, 3},
        {200, 3},
        {201, 3},
        {202, 3},
        {203, 3},
        {204, 3},
        {205, 3},
        {206, 3},
        {207, 3},
        {208, 3},
        {209, 3},
        {210, 3},
        {211, 3},
        {212, 3},
        {213, 3},
        {214, 3},
        {215, 3},
        {216, 3},
        {217, 3},
        {218, 3},
        {219, 3},
        {220, 3},
        {221, 3},
        {222, 3},
        {223, 3},
        {224, 3},
        {225, 3},
        {226, 3},
        {227, 3},
        {228, 3},
        {229, 3},
        {230, 3},
        {231, 3},
        {232, 3},
        {233, 3},
        {234, 3},
        {235, 3},
        {236, 3},
        {237, 3},
        {238, 3},
        {239, 3},
        {240, 3},
        {241, 3},
        {242, 3},
        {243, 3},
        {244, 3},
        {245, 3},
        {246, 3},
        {247, 3},
        {248, 3},
        {249, 3},
        {250, 3},
        {251, 3},
        {252, 3},
        {253, 3},
        {254, 3},
        {255, 3},
        {9, 4},
        {13, 4},
        {32, 4},
        {33, 4},
        {34, 4},
        {35, 4},
        {36, 4},
        {37, 4},
        {38, 4},
        {39, 23},
        {40, 4},
        {41, 4},
        {42, 4},
        {43, 4},
        {44, 4},
        {45, 4},
        {46, 4},
        {47, 4},
        {48, 4},
        {49, 4},
        {50, 4},
        {51, 4},
        {52, 4},
        {53, 4},
        {54, 4},
        {55, 4},
        {56, 4},
        {57, 4},
        {58, 4},
        {59, 4},
        {60, 4},
        {61, 4},
        {62, 4},
        {63, 4},
        {64, 4},
        {65, 4},
        {66, 4},
        {67, 4},
        {68, 4},
        {69, 4},
        {70, 4},
        {71, 4},
        {72, 4},
        {73, 4},
        {74, 4},
        {75, 4},
        {76, 4},
        {77, 4},
        {78, 4},
        {79, 4},
        {80, 4},
        {81, 4},
        {82, 4},
        {83, 4},
        {84, 4},
        {85, 4},
        {86, 4},
        {87, 4},
        {88, 4},
        {89, 4},
        {90, 4},
        {91, 4},
        {93, 4},
        {94, 4},
        {95, 4},
        {96, 4},
        {97, 4},
        {98, 4},
        {99, 4},
        {100, 4},
        {101, 4},
        {102, 4},
        {103, 4},
        {104, 4},
        {105, 4},
        {106, 4},
        {107, 4},
        {108, 4},
        {109, 4},
        {110, 4},
        {111, 4},
        {112, 4},
        {113, 4},
        {114, 4},
        {115, 4},
        {116, 4},
        {117, 4},
        {118, 4},
        {119, 4},
        {120, 4},
        {121, 4},
        {122, 4},
        {123, 4},
        {124, 4},
        {125, 4},
        {126, 4},
        {161, 4},
        {162, 4},
        {163, 4},
        {164, 4},
        {165, 4},
        {166, 4},
        {167, 4},
        {168, 4},
        {169, 4},
        {170, 4},
        {171, 4},
        {172, 4},
        {173, 4},
        {174, 4},
        {175, 4},
        {176, 4},
        {177, 4},
        {178, 4},
        {179, 4},
        {180, 4},
        {181, 4},
        {182, 4},
        {183, 4},
        {184, 4},
        {185, 4},
        {186, 4},
        {187, 4},
        {188, 4},
        {189, 4},
        {190, 4},
        {191, 4},
        {192, 4},
        {193, 4},
        {194, 4},
        {195, 4},
        {196, 4},
        {197, 4},
        {198, 4},
        {199, 4},
        {200, 4},
        {201, 4},
        {202, 4},
        {203, 4},
        {204, 4},
        {205, 4},
        {206, 4},
        {207, 4},
        {208, 4},
        {209, 4},
        {210, 4},
        {211, 4},
        {212, 4},
        {213, 4},
        {214, 4},
        {215, 4},
        {216, 4},
        {217, 4},
        {218, 4},
        {219, 4},
        {220, 4},
        {221, 4},
        {222, 4},
        {223, 4},
        {224, 4},
        {225, 4},
        {226, 4},
        {227, 4},
        {228, 4},
        {229, 4},
        {230, 4},
        {231, 4},
        {232, 4},
        {233, 4},
        {234, 4},
        {235, 4},
        {236, 4},
        {237, 4},
        {238, 4},
        {239, 4},
        {240, 4},
        {241, 4},
        {242, 4},
        {243, 4},
        {244, 4},
        {245, 4},
        {246, 4},
        {247, 4},
        {248, 4},
        {249, 4},
        {250, 4},
        {251, 4},
        {252, 4},
        {253, 4},
        {254, 4},
        {255, 4},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {48, 25},
        {49, 25},
        {50, 25},
        {51, 25},
        {52, 25},
        {53, 25},
        {54, 25},
        {55, 25},
        {56, 25},
        {57, 25},
        {44, 26},
        {46, 27},
        {48, 28},
        {49, 28},
        {50, 28},
        {51, 28},
        {52, 28},
        {53, 28},
        {54, 28},
        {55, 28},
        {56, 28},
        {57, 28},
        {61, 29},
        {110, 30},
        {115, 30},
        {116, 30},
        {48, 20},
        {49, 20},
        {50, 20},
        {51, 20},
        {52, 20},
        {53, 20},
        {54, 20},
        {55, 20},
        {56, 20},
        {57, 20},
        {95, 31},
        {97, 20},
        {98, 20},
        {99, 20},
        {100, 20},
        {101, 20},
        {102, 20},
        {103, 20},
        {104, 20},
        {105, 20},
        {106, 20},
        {107, 20},
        {108, 20},
        {109, 20},
        {110, 20},
        {111, 20},
        {112, 20},
        {113, 20},
        {114, 20},
        {115, 20},
        {116, 20},
        {117, 20},
        {118, 20},
        {119, 20},
        {120, 20},
        {121, 20},
        {122, 20},
        {10, 32},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {48, 33},
        {49, 33},
        {50, 33},
        {51, 33},
        {52, 33},
        {53, 33},
        {54, 33},
        {55, 33},
        {56, 33},
        {57, 33},
        {48, 24},
        {49, 24},
        {50, 24},
        {51, 24},
        {52, 24},
        {53, 24},
        {54, 24},
        {55, 24},
        {56, 24},
        {57, 24},
        {48, 34},
        {49, 34},
        {50, 34},
        {51, 34},
        {52, 34},
        {53, 34},
        {54, 34},
        {55, 34},
        {56, 34},
        {57, 34},
        {44, 26},
        {46, 27},
        {48, 35},
        {49, 35},
        {50, 35},
        {51, 35},
        {52, 35},
        {53, 35},
        {54, 35},
        {55, 35},
        {56, 35},
        {57, 35},
        {48, 36},
        {49, 36},
        {50, 36},
        {51, 36},
        {52, 36},
        {53, 36},
        {54, 36},
        {55, 36},
        {56, 36},
        {57, 36},
        {97, 36},
        {98, 36},
        {99, 36},
        {100, 36},
        {101, 36},
        {102, 36},
        {103, 36},
        {104, 36},
        {105, 36},
        {106, 36},
        {107, 36},
        {108, 36},
        {109, 36},
        {110, 36},
        {111, 36},
        {112, 36},
        {113, 36},
        {114, 36},
        {115, 36},
        {116, 36},
        {117, 36},
        {118, 36},
        {119, 36},
        {120, 36},
        {121, 36},
        {122, 36},
        {9, 32},
        {10, 37},
        {13, 32},
        {32, 32},
        {33, 32},
        {34, 32},
        {35, 32},
        {36, 32},
        {37, 32},
        {38, 32},
        {39, 32},
        {40, 32},
        {41, 32},
        {42, 32},
        {43, 32},
        {44, 32},
        {45, 32},
        {46, 32},
        {47, 32},
        {48, 32},
        {49, 32},
        {50, 32},
        {51, 32},
        {52, 32},
        {53, 32},
        {54, 32},
        {55, 32},
        {56, 32},
        {57, 32},
        {58, 32},
        {59, 32},
        {60, 32},
        {61, 32},
        {62, 32},
        {63, 32},
        {64, 32},
        {65, 32},
        {66, 32},
        {67, 32},
        {68, 32},
        {69, 32},
        {70, 32},
        {71, 32},
        {72, 32},
        {73, 32},
        {74, 32},
        {75, 32},
        {76, 32},
        {77, 32},
        {78, 32},
        {79, 32},
        {80, 32},
        {81, 32},
        {82, 32},
        {83, 32},
        {84, 32},
        {85, 32},
        {86, 32},
        {87, 32},
        {88, 32},
        {89, 32},
        {90, 32},
        {91, 32},
        {92, 32},
        {93, 32},
        {94, 32},
        {95, 32},
        {96, 32},
        {97, 32},
        {98, 32},
        {99, 32},
        {100, 32},
        {101, 32},
        {102, 32},
        {103, 32},
        {104, 32},
        {105, 32},
        {106, 32},
        {107, 32},
        {108, 32},
        {109, 32},
        {110, 32},
        {111, 32},
        {112, 32},
        {113, 32},
        {114, 32},
        {115, 32},
        {116, 32},
        {117, 32},
        {118, 32},
        {119, 32},
        {120, 32},
        {121, 32},
        {122, 32},
        {124, 32},
        {126, 32},
        {161, 32},
        {162, 32},
        {163, 32},
        {164, 32},
        {165, 32},
        {166, 32},
        {167, 32},
        {168, 32},
        {169, 32},
        {170, 32},
        {171, 32},
        {172, 32},
        {173, 32},
        {174, 32},
        {175, 32},
        {176, 32},
        {177, 32},
        {178, 32},
        {179, 32},
        {180, 32},
        {181, 32},
        {182, 32},
        {183, 32},
        {184, 32},
        {185, 32},
        {186, 32},
        {187, 32},
        {188, 32},
        {189, 32},
        {190, 32},
        {191, 32},
        {192, 32},
        {193, 32},
        {194, 32},
        {195, 32},
        {196, 32},
        {197, 32},
        {198, 32},
        {199, 32},
        {200, 32},
        {201, 32},
        {202, 32},
        {203, 32},
        {204, 32},
        {205, 32},
        {206, 32},
        {207, 32},
        {208, 32},
        {209, 32},
        {210, 32},
        {211, 32},
        {212, 32},
        {213, 32},
        {214, 32},
        {215, 32},
        {216, 32},
        {217, 32},
        {218, 32},
        {219, 32},
        {220, 32},
        {221, 32},
        {222, 32},
        {223, 32},
        {224, 32},
        {225, 32},
        {226, 32},
        {227, 32},
        {228, 32},
        {229, 32},
        {230, 32},
        {231, 32},
        {232, 32},
        {233, 32},
        {234, 32},
        {235, 32},
        {236, 32},
        {237, 32},
        {238, 32},
        {239, 32},
        {240, 32},
        {241, 32},
        {242, 32},
        {243, 32},
        {244, 32},
        {245, 32},
        {246, 32},
        {247, 32},
        {248, 32},
        {249, 32},
        {250, 32},
        {251, 32},
        {252, 32},
        {253, 32},
        {254, 32},
        {255, 32},
        {48, 38},
        {49, 38},
        {50, 38},
        {51, 38},
        {52, 38},
        {53, 38},
        {54, 38},
        {55, 38},
        {56, 38},
        {57, 38},
        {48, 39},
        {49, 39},
        {50, 39},
        {51, 39},
        {52, 39},
        {53, 39},
        {54, 39},
        {55, 39},
        {56, 39},
        {57, 39},
        {44, 26},
        {46, 27},
        {48, 40},
        {49, 40},
        {50, 40},
        {51, 40},
        {52, 40},
        {53, 40},
        {54, 40},
        {55, 40},
        {56, 40},
        {57, 40},
        {48, 36},
        {49, 36},
        {50, 36},
        {51, 36},
        {52, 36},
        {53, 36},
        {54, 36},
        {55, 36},
        {56, 36},
        {57, 36},
        {95, 31},
        {97, 36},
        {98, 36},
        {99, 36},
        {100, 36},
        {101, 36},
        {102, 36},
        {103, 36},
        {104, 36},
        {105, 36},
        {106, 36},
        {107, 36},
        {108, 36},
        {109, 36},
        {110, 36},
        {111, 36},
        {112, 36},
        {113, 36},
        {114, 36},
        {115, 36},
        {116, 36},
        {117, 36},
        {118, 36},
        {119, 36},
        {120, 36},
        {121, 36},
        {122, 36},
        {9, 32},
        {10, 37},
        {13, 32},
        {32, 32},
        {33, 32},
        {34, 32},
        {35, 32},
        {36, 32},
        {37, 32},
        {38, 32},
        {39, 32},
        {40, 32},
        {41, 32},
        {42, 32},
        {43, 32},
        {44, 32},
        {45, 32},
        {46, 32},
        {47, 32},
        {48, 32},
        {49, 32},
        {50, 32},
        {51, 32},
        {52, 32},
        {53, 32},
        {54, 32},
        {55, 32},
        {56, 32},
        {57, 32},
        {58, 32},
        {59, 32},
        {60, 32},
        {61, 32},
        {62, 32},
        {63, 32},
        {64, 32},
        {65, 32},
        {66, 32},
        {67, 32},
        {68, 32},
        {69, 32},
        {70, 32},
        {71, 32},
        {72, 32},
        {73, 32},
        {74, 32},
        {75, 32},
        {76, 32},
        {77, 32},
        {78, 32},
        {79, 32},
        {80, 32},
        {81, 32},
        {82, 32},
        {83, 32},
        {84, 32},
        {85, 32},
        {86, 32},
        {87, 32},
        {88, 32},
        {89, 32},
        {90, 32},
        {91, 32},
        {92, 32},
        {93, 32},
        {94, 32},
        {95, 32},
        {96, 32},
        {97, 32},
        {98, 32},
        {99, 32},
        {100, 32},
        {101, 32},
        {102, 32},
        {103, 32},
        {104, 32},
        {105, 32},
        {106, 32},
        {107, 32},
        {108, 32},
        {109, 32},
        {110, 32},
        {111, 32},
        {112, 32},
        {113, 32},
        {114, 32},
        {115, 32},
        {116, 32},
        {117, 32},
        {118, 32},
        {119, 32},
        {120, 32},
        {121, 32},
        {122, 32},
        {124, 32},
        {125, 41},
        {126, 32},
        {161, 32},
        {162, 32},
        {163, 32},
        {164, 32},
        {165, 32},
        {166, 32},
        {167, 32},
        {168, 32},
        {169, 32},
        {170, 32},
        {171, 32},
        {172, 32},
        {173, 32},
        {174, 32},
        {175, 32},
        {176, 32},
        {177, 32},
        {178, 32},
        {179, 32},
        {180, 32},
        {181, 32},
        {182, 32},
        {183, 32},
        {184, 32},
        {185, 32},
        {186, 32},
        {187, 32},
        {188, 32},
        {189, 32},
        {190, 32},
        {191, 32},
        {192, 32},
        {193, 32},
        {194, 32},
        {195, 32},
        {196, 32},
        {197, 32},
        {198, 32},
        {199, 32},
        {200, 32},
        {201, 32},
        {202, 32},
        {203, 32},
        {204, 32},
        {205, 32},
        {206, 32},
        {207, 32},
        {208, 32},
        {209, 32},
        {210, 32},
        {211, 32},
        {212, 32},
        {213, 32},
        {214, 32},
        {215, 32},
        {216, 32},
        {217, 32},
        {218, 32},
        {219, 32},
        {220, 32},
        {221, 32},
        {222, 32},
        {223, 32},
        {224, 32},
        {225, 32},
        {226, 32},
        {227, 32},
        {228, 32},
        {229, 32},
        {230, 32},
        {231, 32},
        {232, 32},
        {233, 32},
        {234, 32},
        {235, 32},
        {236, 32},
        {237, 32},
        {238, 32},
        {239, 32},
        {240, 32},
        {241, 32},
        {242, 32},
        {243, 32},
        {244, 32},
        {245, 32},
        {246, 32},
        {247, 32},
        {248, 32},
        {249, 32},
        {250, 32},
        {251, 32},
        {252, 32},
        {253, 32},
        {254, 32},
        {255, 32},
        {44, 26},
        {46, 11},
        {48, 42},
        {49, 42},
        {50, 42},
        {51, 42},
        {52, 42},
        {53, 42},
        {54, 42},
        {55, 42},
        {56, 42},
        {57, 42},
        {48, 40},
        {49, 40},
        {50, 40},
        {51, 40},
        {52, 40},
        {53, 40},
        {54, 40},
        {55, 40},
        {56, 40},
        {57, 40},
        {44, 26},
        {46, 27}
    };

    int[] TOKEN_STATE = {-1,  0, -1,  7, -1, 30, 31, 38, 36, 27, 37, -1, 39,  3, 26, 28, 34, 29, 35, -1,  2, -1, 33,  6,  4, -1, -1, -1,  3, 32,  5,  2, -1, -1, -1,  3,  2, -1, -1, -1,  3,  8,  3 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17 };

    String[] SPECIAL_CASES_KEYS =
        {  "and", "bool", "char", "check", "do", "else", "end", "false", "float", "if", "int", "not", "or", "read", "str", "true", "write" };

    int[] SPECIAL_CASES_VALUES =
        {  23, 13, 11, 21, 22, 19, 20, 16, 10, 18, 9, 25, 24, 14, 12, 17, 15 };

    String[] SCANNER_ERROR =
    {
        "símbolo inválido",
        "",
        "Erro identificando \"!=\"",
        "",
        "Erro identificando const_string",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando const_float",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando const_char",
        "",
        "Erro identificando comentario_bloco",
        "",
        "",
        "",
        "Erro identificando const_float",
        "Erro identificando const_float",
        "Erro identificando const_int ou const_float",
        "",
        "",
        "",
        "",
        "Erro identificando comentario_bloco",
        "Erro identificando const_float",
        "Erro identificando const_int ou const_float",
        "",
        "",
        "Erro identificando comentario_bloco",
        "Erro identificando const_float",
        "Erro identificando const_int ou const_float",
        "",
        "",
        ""
    };

}