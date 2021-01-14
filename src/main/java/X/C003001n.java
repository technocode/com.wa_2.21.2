package X;

import android.content.Context;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.01n  reason: invalid class name and case insensitive filesystem */
public class C003001n {
    public static final long A00 = SystemClock.uptimeMillis();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -95
        	at java.base/java.util.BitSet.get(Unknown Source)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public static void A00(android.app.Application r183) {
        /*
        // Method dump skipped, instructions count: 3407
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003001n.A00(android.app.Application):void");
    }

    public static void A01(Context context, C006903j r5, AnonymousClass00T r6, C03160Fa r7, AnonymousClass0HN r8, C02100Aq r9, AnonymousClass094 r10) {
        if (r10.A01.A08(false)) {
            Log.i("app-init/main/msgstoredb/healthy");
            r7.A01();
            AnonymousClass0I7 r3 = r8.A06;
            r3.A0Q.execute(new RunnableEBaseShape2S0100000_I0_2(r3, 28));
            r8.A04();
            r6.ANF(new RunnableEBaseShape0S0300000_I0_0(context, r5, r9, 7));
        }
    }
}
