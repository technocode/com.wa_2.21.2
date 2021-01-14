package X;

import java.util.List;

/* renamed from: X.0ry  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17680ry {
    public AbstractC17640rt A00(String str) {
        C31221cl r0 = (C31221cl) this;
        C31511dL r1 = new C31511dL(r0, str);
        ((C31581dS) r0.A06).A01.execute(r1);
        return ((AbstractRunnableC18070sj) r1).A00;
    }

    public AbstractC17640rt A01(String str) {
        C31221cl r2 = (C31221cl) this;
        C31521dM r1 = new C31521dM(r2, str, true);
        ((C31581dS) r2.A06).A01.execute(r1);
        return ((AbstractRunnableC18070sj) r1).A00;
    }

    public AbstractC17640rt A02(String str, EnumC17570rl r8, List list) {
        return new C31101cY((C31221cl) this, str, r8, list, null).A00();
    }
}
