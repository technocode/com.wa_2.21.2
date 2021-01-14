package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.0cU  reason: invalid class name and case insensitive filesystem */
public class C09220cU extends C09230cV {
    public final /* synthetic */ AnonymousClass02M A00;
    public final /* synthetic */ C09200cS A01;
    public final /* synthetic */ C09210cT A02;

    public C09220cU(C09200cS r1, C09210cT r2, AnonymousClass02M r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.C09230cV
    public void A00(String str) {
        AnonymousClass00E.A01();
        C09200cS r5 = this.A01;
        C09250cY r6 = r5.A0L;
        StringBuilder sb = new StringBuilder("app/startOutgoingCall/onCreateOutgoingConnection ");
        sb.append(str);
        sb.append(", pendingCallCommand: ");
        sb.append(r6);
        Log.i(sb.toString());
        if (r6 == null || !str.equals(r6.A03)) {
            this.A02.A02().A06(str);
            return;
        }
        long j = r5.A00;
        if (j > 0) {
            r6.A00 = SystemClock.elapsedRealtime() - j;
        } else {
            AnonymousClass00E.A08(false, "selfManagedConnectionNewCallTs is not set");
        }
        r5.A0I.ANF(new RunnableEBaseShape4S0200000_I0_3(r5, r6, 19));
        r5.A0L = null;
        r5.A01.removeMessages(1);
    }
}
