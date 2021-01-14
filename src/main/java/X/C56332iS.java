package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2iS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56332iS implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0EJ A00;
    public final /* synthetic */ C56862jJ A01;
    public final /* synthetic */ AnonymousClass2TG A02;

    public /* synthetic */ C56332iS(AnonymousClass0EJ r1, C56862jJ r2, AnonymousClass2TG r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0EJ r5 = this.A00;
        C56862jJ r3 = this.A01;
        AnonymousClass2TG r2 = this.A02;
        AnonymousClass2TV r9 = (AnonymousClass2TV) obj;
        StringBuilder sb = new StringBuilder("app/mediajobmanager/onFinishProcessMedia response for jobId=");
        sb.append(r3);
        sb.append(" success=");
        sb.append(r9.A02);
        Log.d(sb.toString());
        synchronized (r3.A00()) {
            SystemClock.uptimeMillis();
        }
        File file = r9.A01;
        boolean z = false;
        if (file != null) {
            r3.A07.A04(new AnonymousClass1WE(file, false));
        }
        r3.A0C.A04(r9);
        AnonymousClass0EN r7 = r5.A0A;
        AnonymousClass1XO r0 = r3.A02().A05;
        if (r7 != null) {
            if (AnonymousClass0CK.A01(r0)) {
                if ((C002001d.A09(r7.A05, r7.A03.A03(false)) & 1) != 0) {
                    z = true;
                }
            }
            AnonymousClass2T3 A002 = r3.A00();
            synchronized (A002) {
                A002.A0A = true;
            }
            if (r3.A0S != null || r3.A02 || z) {
                StringBuilder sb2 = new StringBuilder("app/mediajobmanager/onFinishProcessMedia upload reason found, job cancelled or optimism enabled for jobId=");
                sb2.append(r3);
                Log.d(sb2.toString());
                r5.A0F(r9, r3);
            } else {
                StringBuilder sb3 = new StringBuilder("app/mediajobmanager/onFinishProcessMedia optimism unsafe, failing jobId=");
                sb3.append(r3);
                Log.d(sb3.toString());
                r3.A00().A04(new C50162Tq());
                r3.A04(14);
            }
            r2.A02.A01();
            r2.A03.A01();
            r2.A04.A01();
            r2.A01.A01();
            return;
        }
        throw null;
    }
}
