package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3PW  reason: invalid class name */
public class AnonymousClass3PW implements AnonymousClass1W7 {
    public final /* synthetic */ C09140cM A00;

    public AnonymousClass3PW(C09140cM r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass1W7
    public void AFF(boolean z) {
        Log.i("statusdownload/status-cancelled");
        C09140cM r1 = this.A00;
        r1.A00 = null;
        r1.A01 = null;
    }

    @Override // X.AnonymousClass1W7
    public void AFG(AnonymousClass1W8 r7, C49982Sy r8) {
        int i;
        AnonymousClass0M3 r2;
        AnonymousClass0M4 r0;
        Log.i("statusdownload/status-completed");
        C09140cM r5 = this.A00;
        while (true) {
            ArrayList arrayList = r5.A03;
            i = 0;
            if (arrayList.size() <= 0) {
                r2 = null;
                break;
            }
            r2 = (AnonymousClass0M3) arrayList.remove(0);
            AnonymousClass0M3 r02 = r5.A00;
            if ((r02 == null || !r2.A0n.equals(r02.A0n)) && (r0 = r2.A02) != null && !r0.A0P) {
                break;
            }
        }
        r5.A00 = null;
        r5.A01 = null;
        if (r2 != null) {
            if (AnonymousClass0FI.A0e(r2)) {
                i = 3;
            }
            r5.A01(r2, i);
        }
    }
}
