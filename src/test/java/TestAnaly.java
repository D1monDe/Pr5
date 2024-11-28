import org.example.testingTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  TestAnaly {

    @ParameterizedTest
    @CsvSource({
            "TEST, F",
            "T, 1",
            "TE, 2",
            "TES, 3",
            "abcd, 0",
            "abcTESTabc, F",
            "TESabc, 0",
            "abcTEabc, 0",
            "abcTabc, 0",
            "TESTTEST, F",
            "abcTESTabcTEST, F"

    })
    void testAutomaton(String input, String expected) {
        testingTest automaton = new testingTest(input);
        assertEquals(expected, automaton.analyze(),
                "Wrong result: " + input);
    }
}