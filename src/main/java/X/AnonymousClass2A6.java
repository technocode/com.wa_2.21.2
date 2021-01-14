package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.2A6  reason: invalid class name */
public class AnonymousClass2A6 extends AnonymousClass0M2 implements AnonymousClass0Z8, AbstractC02870Du, AbstractC02880Dv {
    public AnonymousClass0OF A00;

    public AnonymousClass2A6(C007303n r2, long j) {
        super(r2, j, (byte) 26);
    }

    public AnonymousClass2A6(AnonymousClass2A6 r9, C007303n r10, long j, AnonymousClass0M4 r13) {
        super((AnonymousClass0M2) r9, r10, j, r13, true);
        this.A00 = r9.A00.A00();
    }

    @Override // X.AnonymousClass0Z8
    public String A6W() {
        String str;
        if (!TextUtils.isEmpty(this.A00.A01)) {
            StringBuilder sb = new StringBuilder();
            AnonymousClass0OF r1 = this.A00;
            sb.append(r1.A00);
            sb.append(" ");
            sb.append(r1.A01);
            str = sb.toString();
        } else {
            str = this.A00.A00;
        }
        String A0w = A0w();
        return !TextUtils.isEmpty(A0w) ? AnonymousClass008.A0L(A0w, " ", str) : str;
    }

    @Override // X.AnonymousClass0Z8
    public int A6k() {
        return R.drawable.msg_status_doc;
    }

    @Override // X.AnonymousClass0Z8
    public String A7h(AnonymousClass01X r3) {
        StringBuilder A0S = AnonymousClass008.A0S("📄 ");
        A0S.append(this.A00.A00);
        return A0S.toString();
    }

    @Override // X.AnonymousClass0Z8
    public String A8X() {
        return this.A00.A00;
    }

    @Override // X.AnonymousClass0Z8
    public String A8d() {
        return this.A00.A00;
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
