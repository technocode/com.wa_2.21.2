package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.2kA  reason: invalid class name and case insensitive filesystem */
public class C57352kA implements AnonymousClass09O {
    public final C000300f A00;
    public final C50082Ti A01;
    public final AnonymousClass09H A02;
    public final AnonymousClass0I1 A03 = new AnonymousClass0I1();

    public C57352kA(C000300f r2, AnonymousClass09H r3, C50082Ti r4) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        AnonymousClass008.A18("ResumeCheckProtocolHelper/onDeliveryFailure iqId:", str);
        this.A03.A00(new C64212xo(str));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r6) {
        StringBuilder sb = new StringBuilder("ResumeCheckProtocolHelper/onError iqId:");
        sb.append(str);
        Log.i(sb.toString());
        Pair A002 = AnonymousClass30d.A00(r6);
        if (A002 != null) {
            this.A01.A00(((Number) A002.first).intValue(), ((Number) A002.second).intValue());
        } else {
            this.A01.A00(0, 0);
        }
        this.A03.A01(null);
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r10) {
        StringBuilder sb = new StringBuilder("ResumeCheckProtocolHelper/onSuccess iqId:");
        sb.append(str);
        Log.i(sb.toString());
        AnonymousClass0M5 A0D = r10.A0D("resume");
        if (A0D != null) {
            String A0G = A0D.A0G("url", null);
            String A0G2 = A0D.A0G("resume", null);
            String A0G3 = A0D.A0G("direct_path", null);
            C50082Ti r3 = this.A01;
            synchronized (r3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("chatdresumecheck/response=");
                sb2.append(A0G2);
                Log.d(sb2.toString());
                if (A0G2 == null) {
                    AnonymousClass2U3 r1 = new AnonymousClass2U3();
                    r1.A03 = AnonymousClass1WF.FAILURE;
                    r1.A05 = "empty response";
                    r3.A00 = r1;
                } else if (A0G2.equals("complete")) {
                    AnonymousClass2U3 r12 = new AnonymousClass2U3();
                    r3.A00 = r12;
                    r12.A06 = A0G;
                    r12.A04 = A0G3;
                    r12.A03 = AnonymousClass1WF.COMPLETE;
                } else {
                    AnonymousClass2U3 r13 = new AnonymousClass2U3();
                    r3.A00 = r13;
                    r13.A02 = Integer.parseInt(A0G2);
                    r13.A03 = AnonymousClass1WF.RESUME;
                }
            }
        } else {
            C50082Ti r6 = this.A01;
            if (r6 != null) {
                StringBuilder sb3 = new StringBuilder("ResumeCheckProtocolHelper/onMalformedResponse response:");
                sb3.append(r10);
                Log.i(sb3.toString());
                StringBuilder sb4 = new StringBuilder("tags:");
                AnonymousClass0M5[] r32 = r10.A03;
                if (r32 != null) {
                    for (AnonymousClass0M5 r0 : r32) {
                        sb4.append(r0.A00);
                        sb4.append(',');
                    }
                } else {
                    sb4.append("null");
                }
                AnonymousClass009 r33 = r6.A02;
                r33.A04("resume_check/unexpected iq response", sb4.toString(), true);
                r33.A03("resume_check/unexpected iq response", 2);
                r6.A00(0, 0);
            } else {
                throw null;
            }
        }
        this.A03.A01(null);
    }
}
