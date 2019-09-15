package br.ufrn;

import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.II_Result;

public class jcstressTest {
    @State
    public static class MyState extends Result {}
    @JCStressTest
    @Description("Test description")
    @Outcome(id="1, 2", expect = Expect.ACCEPTABLE, desc = "get back 1-2")
    @Outcome(id="2, 1", expect = Expect.ACCEPTABLE, desc = "get back 2-1")
    @Outcome(id="2, 2", expect = Expect.ACCEPTABLE, desc = "get back 2-2")
    public static class StressTest1 { //Classe de teste
        @Actor
        public void actor1(MyState myState, II_Result r) {
            byte[] respostas = new byte[45];
            for (int i = 0; i < respostas.length; i++) {
                respostas[i] = 0;
            }
            respostas[44] = 1;
            try {
                myState.putResult(respostas, "CN");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            r.r1 = myState.getAcertos().get("CN")[44].get();
        }
        @Actor
        public void actor2(MyState myState, II_Result r) {
            byte[] respostas = new byte[45];
            for (int i = 0; i < respostas.length; i++) {
                respostas[i] = 0;
            }
            respostas[44] = 1;
            try {
                myState.putResult(respostas, "CN");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            r.r2 = myState.getAcertos().get("CN")[44].get();
        }
    }
}
