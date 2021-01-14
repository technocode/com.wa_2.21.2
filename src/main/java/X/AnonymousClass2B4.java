package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.2B4  reason: invalid class name */
public class AnonymousClass2B4 extends AnonymousClass0MI implements AnonymousClass0Z8, AbstractC02870Du, AbstractC02880Dv {
    public AnonymousClass0OF A00;

    public AnonymousClass2B4(C007303n r2, long j) {
        super(r2, j, (byte) 25);
    }

    public AnonymousClass2B4(AnonymousClass2B4 r9, C007303n r10, long j, AnonymousClass0M4 r13) {
        super((AnonymousClass0MI) r9, r10, j, r13, true);
        this.A00 = r9.A00.A00();
    }

    @Override // X.AnonymousClass0Z8
    public String A6W() {
        if (TextUtils.isEmpty(this.A00.A01)) {
            return this.A00.A00;
        }
        StringBuilder sb = new StringBuilder();
        AnonymousClass0OF r1 = this.A00;
        sb.append(r1.A00);
        sb.append(" ");
        sb.append(r1.A01);
        return sb.toString();
    }

    @Override // X.AnonymousClass0Z8
    public int A6k() {
        return R.drawable.msg_status_image;
    }

    @Override // X.AnonymousClass0Z8
    public String A7h(AnonymousClass01X r3) {
        StringBuilder A0S = AnonymousClass008.A0S("📷 ");
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
