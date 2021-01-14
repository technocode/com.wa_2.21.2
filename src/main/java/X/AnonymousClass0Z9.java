package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.0Z9  reason: invalid class name */
public class AnonymousClass0Z9 extends AnonymousClass0MI implements AbstractC02870Du, AbstractC02880Dv {
    public int A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public BigDecimal A08;

    public AnonymousClass0Z9(C007303n r2, long j) {
        super(r2, j, (byte) 23);
    }

    public AnonymousClass0Z9(C007303n r5, long j, C76393eT r8, boolean z, boolean z2) {
        super(r5, j, (byte) 23);
        try {
            this.A01 = UserJid.get(r8.A04);
        } catch (AnonymousClass02Y unused) {
        }
        C76383eS r3 = r8.A03;
        r3 = r3 == null ? C76383eS.A0B : r3;
        this.A04 = r3.A07;
        this.A07 = r3.A09;
        this.A03 = r3.A05;
        String str = r3.A04;
        this.A02 = str;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.A08 = AnonymousClass1S6.A02(new C05910Qz(this.A02), r3.A02);
            } catch (IllegalArgumentException unused2) {
                this.A02 = null;
            }
        }
        this.A06 = r3.A08;
        this.A05 = r3.A0A;
        this.A00 = r3.A01;
        C76143e4 r0 = r3.A03;
        A13(r0 == null ? C76143e4.A0N : r0, z, z2);
    }

    public AnonymousClass0Z9(AnonymousClass0Z9 r2, C007303n r3, long j, AnonymousClass0M4 r6, boolean z) {
        super(r2, r3, j, r6, z);
        this.A01 = r2.A01;
        this.A04 = r2.A04;
        this.A07 = r2.A07;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A08 = r2.A08;
        this.A06 = r2.A06;
        this.A05 = r2.A05;
        this.A00 = r2.A00;
    }

    public void A14(C48052Ks r2) {
        this.A04 = r2.A06;
        this.A07 = r2.A08;
        this.A03 = r2.A03;
        C05910Qz r0 = r2.A01;
        if (r0 != null) {
            this.A02 = r0.A00;
            this.A08 = r2.A09;
        }
        this.A06 = r2.A07;
        this.A05 = r2.A05;
        this.A00 = r2.A0A.size();
    }
}
