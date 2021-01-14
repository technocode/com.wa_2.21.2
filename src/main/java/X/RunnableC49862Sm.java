package X;

import com.whatsapp.util.Log;

/* renamed from: X.2Sm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC49862Sm extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C40531tQ A00;
    public final /* synthetic */ C04420Kh A01;
    public final /* synthetic */ C56862jJ A02;
    public final /* synthetic */ C50132Tn A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ byte[] A06;

    public /* synthetic */ RunnableC49862Sm(C04420Kh r1, C56862jJ r2, C40531tQ r3, C50132Tn r4, boolean z, boolean z2, byte[] bArr) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = bArr;
    }

    public final void run() {
        AnonymousClass2TV r3;
        AnonymousClass1O7 r1;
        C04420Kh r32 = this.A01;
        C56862jJ r2 = this.A02;
        C40531tQ r8 = this.A00;
        C50132Tn r7 = this.A03;
        boolean z = this.A04;
        boolean z2 = this.A05;
        byte[] bArr = this.A06;
        if (r2 != null) {
            Number number = (Number) r2.A09.A00();
            if (!r2.A02 && (number == null || number.intValue() == 0)) {
                if (r2.A0S == null) {
                    StringBuilder sb = new StringBuilder("mediajobmanager/enqueuemediaupload/optimistic; existingJob=");
                    sb.append(r2);
                    Log.d(sb.toString());
                    StringBuilder sb2 = new StringBuilder("app/mediajobmanager/handleOptimisticAttachment for mediaJob=");
                    sb2.append(r2);
                    Log.d(sb2.toString());
                    r32.A05(r2, r8);
                    AnonymousClass2T3 A002 = r2.A00();
                    synchronized (A002) {
                        if (!A002.A0A) {
                            A002.A06 = 0;
                        } else if (!A002.A09) {
                            A002.A06 = 3;
                        } else {
                            A002.A06 = 2;
                        }
                    }
                    r2.A00().A01();
                    r32.A07.A08(r2);
                    return;
                }
                StringBuilder sb3 = new StringBuilder("mediajobmanager/enqueuemediaupload/existing job; existingJob=");
                sb3.append(r2);
                Log.d(sb3.toString());
                r32.A05(r2, r8);
                return;
            }
        }
        StringBuilder sb4 = new StringBuilder("mediajobmanager/enqueuemediaupload/new job; existingJob=");
        sb4.append(r2);
        Log.d(sb4.toString());
        AnonymousClass2TE A003 = AnonymousClass2TE.A00(r32.A0A, r7, r8, r32.A01, r32.A0B, z);
        AnonymousClass0EJ r6 = r32.A07;
        C56862jJ A062 = r6.A06(A003, z2);
        r32.A05(A062, r8);
        if (!(r2 == null || (r3 = (AnonymousClass2TV) r2.A0C.A00()) == null || !r3.A02)) {
            StringBuilder sb5 = new StringBuilder("mediajobmanager/enqueuemediaupload/reusing optimistic transcode result from job=");
            sb5.append(r2);
            sb5.append(" in job=");
            sb5.append(A062);
            Log.d(sb5.toString());
            Object A004 = r2.A07.A00();
            if (A004 != null) {
                A062.A07.A04(A004);
            }
            A062.A0C.A04(r3);
            AnonymousClass2T3 A005 = r2.A00();
            synchronized (A005) {
                r1 = A005.A03;
            }
            if (r1 != null) {
                A062.A00().A03(r1);
            }
        }
        AnonymousClass1XO r22 = A062.A02().A05;
        if (r6.A06.A0E(247) && r22 == AnonymousClass1XO.A07) {
            A062.A03 = bArr;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(r8.A02());
        sb6.append("; action_params: ");
        sb6.append(r7);
        r6.A0E(A062, sb6.toString());
    }
}
