import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramsTest {

    @Test
    public void makeAnagramsTest(){

        int result = Anagrams.anagrams("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        assertEquals(30, result);
        result = Anagrams.anagrams("bugexikjevtubidpulaelsbcqlupwetzyzdvjphn", "lajoipfecfinxjspxmevqxuqyalhrsxcvgsdxxkacspbchrbvvwnvsdtsrdk");
        assertEquals(40, result);
        result = Anagrams.anagrams("fsqoiaidfaukvngpsugszsnseskicpejjvytviya", "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget");
        assertEquals(42, result);
        result = Anagrams.anagrams("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        assertEquals(30, result);

    }


}