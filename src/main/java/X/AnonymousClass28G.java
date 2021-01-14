package X;

import android.text.TextUtils;

/* renamed from: X.28G  reason: invalid class name */
public class AnonymousClass28G extends C05490Ot implements AnonymousClass0Z8, AbstractC02870Du, AbstractC02880Dv, AnonymousClass0M0 {
    public AnonymousClass0OF A00;

    @Override // X.AnonymousClass0Z8
    public int A6k() {
        return 0;
    }

    public AnonymousClass28G(C007303n r2, long j) {
        super(r2, j, (byte) 27);
    }

    public AnonymousClass28G(AnonymousClass28G r8, C007303n r9, long j) {
        super(r8, r9, j, true);
        this.A00 = r8.A00.A00();
    }

    public String A0z() {
        if (TextUtils.isEmpty(A0D())) {
            return this.A00.A00;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder A0S = AnonymousClass008.A0S("*");
        A0S.append(A0D());
        A0S.append("*");
        sb.append(A0S.toString());
        sb.append("\n");
        sb.append(this.A00.A00);
        return sb.toString();
    }

    @Override // X.AnonymousClass0Z8
    public String A6W() {
        AnonymousClass0OF r2;
        String str;
        if (!TextUtils.isEmpty(A0D())) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0D());
            sb.append(" ");
            r2 = this.A00;
            sb.append(r2.A00);
            str = sb.toString();
        } else {
            r2 = this.A00;
            str = r2.A00;
        }
        if (TextUtils.isEmpty(r2.A01)) {
            return str;
        }
        StringBuilder A0Y = AnonymousClass008.A0Y(str, " ");
        A0Y.append(this.A00.A01);
        return A0Y.toString();
    }

    @Override // X.AnonymousClass0Z8
    public String A7h(AnonymousClass01X r2) {
        return !TextUtils.isEmpty(A0D()) ? A0D() : this.A00.A00;
    }

    @Override // X.AnonymousClass0Z8
    public String A8X() {
        return !TextUtils.isEmpty(A0D()) ? A0D() : this.A00.A00;
    }

    @Override // X.AnonymousClass0Z8
    public String A8d() {
        return A0z();
    }

    @Override // X.AnonymousClass0Z8
    public AnonymousClass0OF A9K() {
        return this.A00;
    }

    @Override // X.AnonymousClass0Z8
    public void APA(AnonymousClass0OF r1) {
        this.A00 = r1;
    }
}
