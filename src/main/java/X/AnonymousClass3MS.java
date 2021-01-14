package X;

import android.os.ConditionVariable;
import java.util.Map;

/* renamed from: X.3MS  reason: invalid class name */
public class AnonymousClass3MS implements AnonymousClass0J2 {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C64962z5 A01;

    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
    }

    public AnonymousClass3MS(C64962z5 r1, ConditionVariable conditionVariable) {
        this.A01 = r1;
        this.A00 = conditionVariable;
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        C64962z5 r1 = this.A01;
        r1.A03.A01(str);
        r1.A00 = false;
        this.A00.open();
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        this.A01.A00 = true;
        this.A00.open();
    }
}
