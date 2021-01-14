package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.03k  reason: invalid class name and case insensitive filesystem */
public class C007003k {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04 = -1;
    public long A05;
    public long A06;
    public long A07;
    public AnonymousClass0QW A08;
    public Jid A09;
    public UserJid A0A;
    public C11220fu A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public Locale A0P;
    public boolean A0Q;
    public boolean A0R = true;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;

    public C007003k(AnonymousClass0QW r3, String str, int i, String str2) {
        this.A08 = r3;
        this.A0F = str;
        this.A0C = Integer.valueOf(i);
        this.A0J = str2;
    }

    public C007003k(Jid jid) {
        this.A09 = jid;
        this.A0X = true;
        this.A08 = null;
        if (AnonymousClass1VY.A0Y(jid)) {
            this.A0B = C11220fu.A04;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r2 > 20) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C007003k(com.whatsapp.jid.Jid r4, boolean r5, java.lang.String r6, long r7, java.lang.String r9, int r10, java.lang.String r11) {
        /*
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.A04 = r0
            r0 = 1
            r3.A0R = r0
            r3.A09 = r4
            r3.A0X = r5
            r3.A0F = r9
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001c
            r1 = -2
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
        L_0x001c:
            if (r6 == 0) goto L_0x002a
            r0 = 5
            int r2 = r6.length()
            if (r0 > r2) goto L_0x002a
            r1 = 20
            r0 = 1
            if (r2 <= r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 == 0) goto L_0x0034
            X.0QW r0 = new X.0QW
            r0.<init>(r7, r6)
            r3.A08 = r0
        L_0x0034:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3.A0C = r0
            r3.A0J = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007003k.<init>(com.whatsapp.jid.Jid, boolean, java.lang.String, long, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (android.text.TextUtils.equals(r2.A04(), r3.A04()) == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.util.List r7, X.AnonymousClass1VH r8) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007003k.A00(java.util.List, X.1VH):boolean");
    }

    public long A01() {
        if (!(this instanceof AnonymousClass08S)) {
            return this.A04;
        }
        return -2;
    }

    public Jid A02(Class cls) {
        if (cls.isInstance(this.A09)) {
            return (Jid) cls.cast(this.A09);
        }
        return null;
    }

    public String A03() {
        AnonymousClass0QW r3 = this.A08;
        if (r3 == null) {
            return AnonymousClass1VY.A0D(this.A09);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A00);
        sb.append(":");
        sb.append(r3.A01);
        return sb.toString();
    }

    public String A04() {
        if (!(this instanceof AnonymousClass08S)) {
            return this.A0N;
        }
        return ((AnonymousClass08S) this).A00.A06(R.string.whatsapp_name);
    }

    public String A05(int i, float f) {
        StringBuilder sb = new StringBuilder();
        sb.append(A03());
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(f);
        return sb.toString();
    }

    public boolean A06() {
        return A08() && this.A03 == 3;
    }

    public boolean A07() {
        int i;
        if (AnonymousClass1VY.A0T(this.A09) || !TextUtils.isEmpty(this.A0F)) {
            return false;
        }
        if (A04() == null || (i = this.A03) == 2 || i == 1) {
            return true;
        }
        return false;
    }

    public boolean A08() {
        int i;
        return (A04() == null || (i = this.A03) == 0 || i == -1) ? false : true;
    }

    public boolean A09() {
        if (this instanceof C11230fv) {
            return true;
        }
        Jid jid = this.A09;
        if (jid != null) {
            return AnonymousClass1VY.A0Y(jid);
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("row_id=");
        A0S2.append(A01());
        A0S2.append(" jid=");
        if (jid == null) {
            jid = "(null)";
        }
        A0S2.append(jid);
        A0S2.append(" key=");
        AnonymousClass0QW r2 = this.A08;
        if (r2 == null) {
            A0S2.append("(null)");
        } else {
            A0S2.append(r2.A00);
            A0S2.append("-");
            A0S2.append(r2.A01);
        }
        A0S2.append(" phone=");
        A0S2.append(this.A0C);
        A0S2.append(" iswa=");
        A0S2.append(this.A0X);
        if (A01() == -1) {
            return false;
        }
        StringBuilder A0S3 = AnonymousClass008.A0S("problematic contact:");
        A0S3.append(A0S2.toString());
        Log.e(A0S3.toString());
        return false;
    }

    public boolean A0A() {
        if (!(this instanceof AnonymousClass08S)) {
            return A08() && A06();
        }
        return true;
    }

    public boolean A0B() {
        if (!(this instanceof AnonymousClass08S)) {
            return A09() && this.A0S;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C007003k r5 = (C007003k) obj;
        if (!C006803i.A0q(this.A09, r5.A09)) {
            return false;
        }
        AnonymousClass0QW r1 = this.A08;
        AnonymousClass0QW r0 = r5.A08;
        if (r1 != null) {
            return r1.equals(r0);
        }
        if (r0 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass0QW r0 = this.A08;
        if (r0 != null) {
            return r0.hashCode();
        }
        Jid jid = this.A09;
        if (jid != null) {
            return jid.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder A0S2 = AnonymousClass008.A0S("row_id=");
        A0S2.append(A01());
        A0S2.append(" jid=");
        Jid jid = this.A09;
        if (jid == null) {
            jid = "(null)";
        }
        A0S2.append(jid);
        A0S2.append(" key=");
        AnonymousClass0QW r2 = this.A08;
        if (r2 == null) {
            A0S2.append("(null)");
        } else {
            A0S2.append(r2.A00);
            A0S2.append("-");
            A0S2.append(C003701u.A06(r2.A01, 4));
        }
        A0S2.append(" phone=");
        A0S2.append(this.A0C);
        A0S2.append(" iswa=");
        A0S2.append(this.A0X);
        if (A09()) {
            A0S2.append(" status=");
            A0S2.append(this.A0L);
        }
        return A0S2.toString();
    }
}
