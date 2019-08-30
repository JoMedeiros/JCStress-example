package br.ufrn;

import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.II_Result;

public class jcstressTest {
    @State
    public static class MyState extends Counter {}
    @JCStressTest
    @Description("Test description")
    @Outcome(id="0, 1", expect = Expect.ACCEPTABLE, desc = "get back 0-1")
    @Outcome(id="1, 0", expect = Expect.ACCEPTABLE, desc = "get back 1-0")
    public static class StressTest1 { //Classe de teste
        @Actor
        public void actor1(MyState myState, II_Result r) {
            r.r1 = myState.getNext();
        }
        @Actor
        public void actor2(MyState myState, II_Result r) {
            r.r2 = myState.getNext();
        }
    }
}
