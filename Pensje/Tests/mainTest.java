import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.io.*;

class mainTest {

    public static String answer(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);
        StringBuilder answer = new StringBuilder();
        while(in.hasNextLine()){
            answer.append(String.valueOf(in.nextLine())).append(" ");
        }
        return answer.toString();
    }

    @Test
    void pen0() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen0.out"), main.main(new String[]{"Tests/in/pen0.in"}));
    }

    @Test
    void pen1a() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen1a.out"), main.main(new String[]{"Tests/in/pen1a.in"}));
    }

    @Test
    void pen1b() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen1b.out"), main.main(new String[]{"Tests/in/pen1b.in"}));
    }

    @Test
    void pen1c() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen1c.out"), main.main(new String[]{"Tests/in/pen1c.in"}));
    }

    @Test
    void pen1d() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen1d.out"), main.main(new String[]{"Tests/in/pen1d.in"}));
    }

    @Test
    void pen1e() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen1e.out"), main.main(new String[]{"Tests/in/pen1e.in"}));
    }

    @Test
    void pen1ocen() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen1ocen.out"), main.main(new String[]{"Tests/in/pen1ocen.in"}));
    }

    @Test
    void pen2a() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen2a.out"), main.main(new String[]{"Tests/in/pen2a.in"}));
    }

    @Test
    void pen2b() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen2b.out"), main.main(new String[]{"Tests/in/pen2b.in"}));
    }

    @Test
    void pen2c() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen2c.out"), main.main(new String[]{"Tests/in/pen2c.in"}));
    }

    @Test
    void pen2d() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen2d.out"), main.main(new String[]{"Tests/in/pen2d.in"}));
    }

    @Test
    void pen2e() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen2e.out"), main.main(new String[]{"Tests/in/pen2e.in"}));
    }

    @Test
    void pen2ocen() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen2ocen.out"), main.main(new String[]{"Tests/in/pen2ocen.in"}));
    }

    @Test
    void pen3a() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen3a.out"), main.main(new String[]{"Tests/in/pen3a.in"}));
    }

    @Test
    void pen3b() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen3b.out"), main.main(new String[]{"Tests/in/pen3b.in"}));
    }

    @Test
    void pen3ocen() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen3ocen.out"), main.main(new String[]{"Tests/in/pen3ocen.in"}));
    }

    @Test
    void pen4a() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen4a.out"), main.main(new String[]{"Tests/in/pen4a.in"}));
    }

    @Test
    void pen4b() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen4b.out"), main.main(new String[]{"Tests/in/pen4b.in"}));
    }

    @Test
    void pen4ocen() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen4ocen.out"), main.main(new String[]{"Tests/in/pen4ocen.in"}));
    }

    @Test
    void pen5a() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen5a.out"), main.main(new String[]{"Tests/in/pen5a.in"}));
    }

    @Test
    void pen5b() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen5b.out"), main.main(new String[]{"Tests/in/pen5b.in"}));
    }

    @Test
    void pen5ocen() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen5ocen.out"), main.main(new String[]{"Tests/in/pen5ocen.in"}));
    }

    @Test
    void pen6() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen6.out"), main.main(new String[]{"Tests/in/pen6.in"}));
    }

    @Test
    void pen7() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen7.out"), main.main(new String[]{"Tests/in/pen7.in"}));
    }

    @Test
    void pen8() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen8.out"), main.main(new String[]{"Tests/in/pen8.in"}));
    }

    @Test
    void pen9() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen9.out"), main.main(new String[]{"Tests/in/pen9.in"}));
    }

    @Test
    void pen10() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen10.out"), main.main(new String[]{"Tests/in/pen10.in"}));
    }

    @Test
    void pen11() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen11.out"), main.main(new String[]{"Tests/in/pen11.in"}));
    }

    @Test
    void pen12() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen12.out"), main.main(new String[]{"Tests/in/pen12.in"}));
    }

    @Test
    void pen13() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen13.out"), main.main(new String[]{"Tests/in/pen13.in"}));
    }

    @Test
    void pen14() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen14.out"), main.main(new String[]{"Tests/in/pen14.in"}));
    }

    @Test
    void pen15() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen15.out"), main.main(new String[]{"Tests/in/pen15.in"}));
    }

    @Test
    void pen16() throws FileNotFoundException {
        assertEquals(answer("Tests/out/pen16.out"), main.main(new String[]{"Tests/in/pen16.in"}));
    }
}