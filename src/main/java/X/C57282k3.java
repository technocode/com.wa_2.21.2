package X;

import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2k3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57282k3 implements AnonymousClass1W4 {
    public final /* synthetic */ AnonymousClass2U4 A00;

    public /* synthetic */ C57282k3(AnonymousClass2U4 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass1W4
    public final AnonymousClass1W3 AN8(AnonymousClass0J5 r27) {
        boolean z;
        AnonymousClass2U4 r2 = this.A00;
        AnonymousClass1WF r6 = AnonymousClass1WF.FAILURE;
        AnonymousClass2U3 r3 = null;
        if (r2.A0F) {
            AnonymousClass0CX r10 = r2.A06;
            synchronized (r10) {
                z = false;
                if (r10.A01.A05() <= r10.A00) {
                    z = true;
                }
            }
            if (z) {
                Log.i("resumecheck/chatd resume check throttled");
            } else {
                AnonymousClass009 r12 = r2.A03;
                C000300f r102 = r2.A04;
                AnonymousClass09H r5 = r2.A0C;
                AnonymousClass2U1 r8 = r2.A0A;
                String str = r2.A0E;
                AnonymousClass3ZL r0 = r2.A0D;
                String str2 = ((AbstractC450522r) r0).A01;
                r0.A03();
                String str3 = r0.A01;
                if (str3 != null) {
                    int i = r2.A02;
                    String str4 = r27.A01;
                    if (str4 != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        C50082Ti r9 = new C50082Ti(r12, str2, str, str3, str4, i);
                        C57352kA r11 = new C57352kA(r102, r5, r9);
                        AnonymousClass09H r02 = r11.A02;
                        String A02 = r02.A02();
                        C50082Ti r103 = r11.A01;
                        ArrayList arrayList = new ArrayList(Arrays.asList(new AnonymousClass0OS("media_type", r103.A05, null, (byte) 0), new AnonymousClass0OS("hash", r103.A04, null, (byte) 0), new AnonymousClass0OS("token", r103.A06, null, (byte) 0), new AnonymousClass0OS("auth", r103.A03, null, (byte) 0)));
                        if (r11.A00.A0D(AbstractC000400g.A1c)) {
                            arrayList.add(new AnonymousClass0OS("resume", String.valueOf(r103.A01), null, (byte) 0));
                        }
                        AnonymousClass0M5 r13 = new AnonymousClass0M5("resume_check", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null);
                        r02.A06(162, A02, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A02, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:m", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, r13), r11, 20000);
                        try {
                            r11.A03.get(20000, TimeUnit.MILLISECONDS);
                            r8.A02 = SystemClock.uptimeMillis() - uptimeMillis;
                            r8.A00 = 0;
                            r8.A03 = Boolean.TRUE;
                            synchronized (r9) {
                                r3 = r9.A00;
                                if (r3 == null) {
                                    throw null;
                                }
                            }
                        } catch (Exception e) {
                            Log.e(e);
                            r3 = new AnonymousClass2U3();
                            r3.A03 = r6;
                            r3.A05 = "timeout exception";
                        }
                        r3.A04 = r2.A07.A01(r3.A04);
                        StringBuilder sb = new StringBuilder("resumecheck/chatd/result=");
                        sb.append(r3);
                        sb.append("; hash=");
                        AnonymousClass008.A1S(sb, str);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
        if (r3 == null || r3.A03 == r6) {
            Uri.Builder A022 = r2.A0D.A02(r27);
            A022.appendQueryParameter("resume", "1");
            C57312k6 r4 = new C57312k6(r2.A08, r2.A05, A022.build().toString(), r2.A0A);
            r4.A00 = new AnonymousClass2U3();
            AnonymousClass0CW r03 = r4.A01;
            String str5 = r4.A04;
            AnonymousClass0J3 A01 = r03.A01(str5, r4);
            try {
                int A012 = A01.A01(r27);
                AnonymousClass2U1 r82 = r4.A03;
                r82.A00 = A01.A00;
                r82.A02 = A01.A01;
                r82.A01 = (long) A012;
                r82.A03 = A01.A02;
                if (A012 < 0 || A012 >= 400) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mediaupload/MMS upload resume form post failed/error=");
                    sb2.append(A012);
                    sb2.append("; url=");
                    sb2.append(str5);
                    Log.w(sb2.toString());
                    AnonymousClass2U3 r04 = r4.A00;
                    r04.A01 = A012;
                    r04.A03 = r6;
                }
            } catch (IOException e2) {
                StringBuilder A0S = AnonymousClass008.A0S("mediaupload/MMS upload resume form post failed; url=");
                A0S.append(str5);
                Log.w(A0S.toString(), e2);
                if (r4.A02.A04(e2)) {
                    r4.A00.A03 = AnonymousClass1WF.WATLS_ERROR;
                } else {
                    r4.A00.A03 = r6;
                }
                AnonymousClass2U1 r32 = r4.A03;
                r32.A00 = A01.A00;
                r32.A02 = A01.A01;
                r32.A03 = A01.A02;
            }
            r3 = r4.A00;
            r3.A04 = r2.A07.A01(r3.A04);
            StringBuilder sb3 = new StringBuilder("resumecheck/http/result=");
            sb3.append(r3);
            sb3.append("; hash=");
            AnonymousClass008.A1S(sb3, r2.A0E);
        }
        AnonymousClass1WF r1 = r3.A03;
        if (r1 == null) {
            r3.A03 = r6;
            r1 = r6;
        }
        if (r1 == AnonymousClass1WF.WATLS_ERROR) {
            Log.i("resumecheck/attempting fallback MMS upload form post - watls error");
            r2.A05.A04();
            return AnonymousClass1W3.A03(r3, r3.A01);
        } else if (r1 == r6) {
            Log.i("resumecheck/attempting fallback MMS upload form post");
            return AnonymousClass1W3.A03(r3, r3.A01);
        } else {
            if (r1 == AnonymousClass1WF.RESUME) {
                r2.A0B.A02 = Long.valueOf((long) r3.A02);
            }
            return AnonymousClass1W3.A02(r3);
        }
    }
}
