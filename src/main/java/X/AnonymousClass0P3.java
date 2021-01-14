package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0P3  reason: invalid class name */
public class AnonymousClass0P3 {
    public static volatile AnonymousClass0P3 A0B;
    public final AnonymousClass009 A00;
    public final AnonymousClass00Y A01;
    public final AnonymousClass0P4 A02;
    public final C70943Mz A03;
    public final AnonymousClass3N0 A04;
    public final AnonymousClass3N1 A05;
    public final AnonymousClass3N2 A06;
    public final AnonymousClass3N3 A07;
    public final AnonymousClass3N4 A08;
    public final AnonymousClass0P5 A09;
    public final Map A0A;

    public AnonymousClass0P3(AnonymousClass009 r4, AnonymousClass00Y r5, AnonymousClass0P4 r6, AnonymousClass0P5 r7, AnonymousClass0P6 r8, AnonymousClass0P7 r9, AnonymousClass0P8 r10) {
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A09 = r7;
        AnonymousClass3N0 r1 = new AnonymousClass3N0(r8);
        this.A04 = r1;
        this.A03 = new C70943Mz(r8);
        this.A07 = new AnonymousClass3N3(r9);
        this.A06 = new AnonymousClass3N2(r9);
        this.A05 = new AnonymousClass3N1(r9);
        this.A08 = new AnonymousClass3N4(r10);
        HashMap hashMap = new HashMap();
        hashMap.put(2, r1);
        hashMap.put(3, this.A03);
        hashMap.put(4, this.A07);
        hashMap.put(5, this.A06);
        hashMap.put(6, this.A05);
        hashMap.put(7, this.A08);
        this.A0A = Collections.unmodifiableMap(hashMap);
    }

    public final void A00() {
        int A012 = this.A02.A01();
        AnonymousClass008.A0t("SchExpManager/init; bucket=", A012);
        for (Map.Entry entry : this.A0A.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            AbstractC655430e r2 = (AbstractC655430e) entry.getValue();
            if (Build.VERSION.SDK_INT >= r2.A7U()) {
                boolean ABV = r2.ABV();
                if (intValue == A012) {
                    if (ABV) {
                        StringBuilder sb = new StringBuilder("SchExpManager/init; consistency check for ");
                        sb.append(intValue);
                        Log.d(sb.toString());
                        r2.A2z();
                    } else {
                        StringBuilder sb2 = new StringBuilder("SchExpManager/init; scheduling for ");
                        sb2.append(intValue);
                        Log.d(sb2.toString());
                        r2.ANP();
                    }
                } else if (ABV) {
                    StringBuilder sb3 = new StringBuilder("SchExpManager/init; cancelling ");
                    sb3.append(intValue);
                    Log.d(sb3.toString());
                    r2.cancel();
                }
            } else if (A012 == intValue) {
                AnonymousClass008.A0t("SchExpManager/init; unsupported OS version for ", intValue);
            }
        }
    }
}
