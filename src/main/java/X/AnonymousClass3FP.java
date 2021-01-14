package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3FP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FP implements AbstractC48012Ko {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ Map A01;

    public /* synthetic */ AnonymousClass3FP(C28021Sn r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    @Override // X.AbstractC48012Ko
    public final void ACf(List list) {
        C28021Sn r5 = this.A00;
        Map map = this.A01;
        if (r5.A00) {
            r5.A03.A00(new RunnableEBaseShape0S1200000_I0(r5, map, "on_failure", 8));
        }
    }
}
