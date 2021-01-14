package X;

import com.whatsapp.util.Log;

/* renamed from: X.2it  reason: invalid class name and case insensitive filesystem */
public class C56602it implements AbstractC03150Ez {
    public int A00 = -1;
    public int A01;
    public final /* synthetic */ C40531tQ A02;
    public final /* synthetic */ C04420Kh A03;
    public final /* synthetic */ C56862jJ A04;

    public C56602it(C04420Kh r2, C40531tQ r3, C56862jJ r4) {
        this.A03 = r2;
        this.A02 = r3;
        this.A04 = r4;
    }

    @Override // X.AbstractC03150Ez
    public void A1e(Object obj) {
        Number number = (Number) obj;
        int intValue = number.intValue();
        if (intValue != this.A00) {
            this.A00 = intValue;
            if (intValue >= this.A01 + 5) {
                this.A01 = intValue;
                StringBuilder A0S = AnonymousClass008.A0S("mediajobmanager/processmedia/progress for ");
                A0S.append(this.A02.A01.size());
                A0S.append(" messages; job=");
                A0S.append(this.A04);
                Log.d(A0S.toString());
            }
            C04420Kh r3 = this.A03;
            C04430Ki r2 = r3.A08;
            C40531tQ r1 = this.A02;
            if (C04430Ki.A01(number, r1, new C56412ia(r2))) {
                r3.A05.A07(r1.A01, 8);
            }
        }
    }
}
