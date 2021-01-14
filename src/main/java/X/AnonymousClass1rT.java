package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.1rT  reason: invalid class name */
public final class AnonymousClass1rT implements AnonymousClass1KW {
    public final AnonymousClass02M A00;
    public final C014308b A01;
    public final AnonymousClass01X A02;
    public final C007003k A03;
    public final boolean A04;

    public AnonymousClass1rT(C007003k r1, boolean z, AnonymousClass02M r3, C014308b r4, AnonymousClass01X r5) {
        this.A03 = r1;
        this.A04 = z;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    @Override // X.AnonymousClass1KW
    public void AJg(boolean z) {
        if (z) {
            boolean z2 = this.A04;
            int i = R.string.unblock_confirmation;
            if (z2) {
                i = R.string.block_confirmation;
            }
            this.A00.A0C(this.A02.A0D(i, this.A01.A08(this.A03, false)), 1);
        }
    }
}
