package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0dk  reason: invalid class name and case insensitive filesystem */
public class C09920dk extends AnonymousClass0JW {
    public final AnonymousClass03P A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass0KP A03;
    public final C70823Mn A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final WeakReference A09;
    public final boolean A0A;

    public C09920dk(boolean z, String str, String str2, String str3, String str4, AnonymousClass00G r8, C70823Mn r9, AnonymousClass03P r10, AbstractC03830Hx r11, AnonymousClass00D r12, AnonymousClass0KP r13) {
        this.A0A = z;
        this.A06 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A01 = r8;
        this.A04 = r9;
        this.A00 = r10;
        this.A09 = new WeakReference(r11);
        this.A03 = r13;
        this.A02 = r12;
        if (this.A07.equals("sms")) {
            AnonymousClass00E.A03(this.A05);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        StringBuilder A0S = AnonymousClass008.A0S("requestcode/");
        String str = this.A07;
        AnonymousClass008.A1U(A0S, str);
        AbstractC03830Hx r1 = (AbstractC03830Hx) this.A09.get();
        if (r1 != null) {
            r1.APw(this.A0A, str);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass02R r5 = (AnonymousClass02R) obj;
        Log.d("RequestCodeTask/onPostExecute");
        AbstractC03830Hx r3 = (AbstractC03830Hx) this.A09.get();
        if (r3 == null) {
            StringBuilder A0S = AnonymousClass008.A0S("requestcode/");
            A0S.append(this.A07);
            A0S.append("/error/callback null");
            Log.e(A0S.toString());
            return;
        }
        boolean z = this.A0A;
        String str = this.A07;
        r3.AAT(z, str);
        Object obj2 = r5.A00;
        if (obj2 != null) {
            r3.AEK(str, (AnonymousClass2O3) obj2, (AnonymousClass2O2) r5.A01);
            return;
        }
        throw null;
    }
}
