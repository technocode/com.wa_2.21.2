package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0Gl  reason: invalid class name and case insensitive filesystem */
public class C03490Gl {
    public static volatile C03490Gl A09;
    public String A00;
    public boolean A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass08B A05;
    public final AnonymousClass00D A06;
    public final AnonymousClass01X A07;
    public final AnonymousClass09H A08;

    public C03490Gl(AnonymousClass02M r1, AnonymousClass009 r2, AnonymousClass01I r3, AnonymousClass09H r4, AnonymousClass01X r5, AnonymousClass08B r6, AnonymousClass00D r7) {
        this.A03 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A08 = r4;
        this.A07 = r5;
        this.A05 = r6;
        this.A06 = r7;
    }

    public static C03490Gl A00() {
        if (A09 == null) {
            synchronized (C03490Gl.class) {
                if (A09 == null) {
                    A09 = new C03490Gl(AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass09H.A01(), AnonymousClass01X.A00(), AnonymousClass08B.A00, AnonymousClass00D.A00());
                }
            }
        }
        return A09;
    }

    public String A01() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        A02(null);
        String string = this.A06.A00.getString("my_current_status", null);
        if (string != null) {
            return string;
        }
        return this.A07.A06(R.string.info_default_empty);
    }

    public void A02(AbstractC03810Hu r5) {
        if (!this.A01) {
            AnonymousClass3LF r3 = new AnonymousClass3LF(this.A02, this.A08, new C40381tB(this, r5));
            AnonymousClass01I r0 = this.A04;
            r0.A04();
            UserJid userJid = r0.A03;
            if (userJid != null) {
                r3.A00(userJid, 0);
                this.A01 = true;
                return;
            }
            throw null;
        }
    }

    public void A03(String str, String str2) {
        this.A00 = str;
        this.A01 = false;
        this.A06.A0X(str, str2);
        AnonymousClass08B r1 = this.A05;
        AnonymousClass01I r0 = this.A04;
        r0.A04();
        r1.A08(r0.A03);
    }
}
