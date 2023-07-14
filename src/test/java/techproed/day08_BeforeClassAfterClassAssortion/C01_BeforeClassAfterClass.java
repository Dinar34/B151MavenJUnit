package techproed.day08_BeforeClassAfterClassAssortion;

import org.junit.*;

public class C01_BeforeClassAfterClass {
     /*
    @BeforeClass ve @AfterClass methodları static olmak zorundadir
     */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Her classdan önce BeforeClass Metodu bir kez çalışır");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Her classdan sonra AfterClass Methodu bir kez çalışır");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her mehhoddan önce bir kez çalışır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her method'dan sonra After(tearDown) method'u bir kez çalışır");
    }

    @Test
    public void test01() {
        System.out.println("Test01 methodu çalıştı");
    }

    @Test
    public void tets02() {
        System.out.println("Test02 methodu çalıştı");
    }

    @Test
    public void test03() {
        System.out.println("Test03 methodu çalıştı");
    }
}
