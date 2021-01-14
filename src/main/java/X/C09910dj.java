package X;

import android.util.Pair;
import java.lang.ref.WeakReference;

/* renamed from: X.0dj  reason: invalid class name and case insensitive filesystem */
public class C09910dj extends AnonymousClass0JW {
    public final AnonymousClass00D A00;
    public final AnonymousClass2Nx A01;
    public final AnonymousClass0KP A02;
    public final C70833Mo A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    public C09910dj(String str, String str2, String str3, AnonymousClass2Nx r8, AbstractC03820Hw r9, AnonymousClass00D r10, AnonymousClass0KP r11, C70833Mo r12) {
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A01 = r8;
        this.A03 = r12;
        this.A07 = new WeakReference(r9);
        this.A02 = r11;
        this.A00 = r10;
        C70833Mo r3 = this.A03;
        int i = r10.A00.getInt("reg_attempts_verify_code", 0) + 1;
        AnonymousClass008.A0k(r10, "reg_attempts_verify_code", i);
        ((AnonymousClass30Z) r3).A00 = i;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        AnonymousClass008.A1U(AnonymousClass008.A0S("verifycode/"), this.A05);
        AbstractC03820Hw r0 = (AbstractC03820Hw) this.A07.get();
        if (r0 != null) {
            r0.APx();
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Pair pair = (Pair) obj;
        AbstractC03820Hw r3 = (AbstractC03820Hw) this.A07.get();
        if (r3 != null) {
            r3.AAU();
            r3.AEL(this.A05, (AnonymousClass2O7) pair.first, (AnonymousClass2O6) pair.second);
        }
    }
}
