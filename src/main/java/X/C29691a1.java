package X;

import androidx.biometric.FingerprintHelperFragment;

/* renamed from: X.1a1  reason: invalid class name and case insensitive filesystem */
public class C29691a1 extends AbstractC04060Iw {
    public final /* synthetic */ FingerprintHelperFragment A00;

    public C29691a1(FingerprintHelperFragment fingerprintHelperFragment) {
        this.A00 = fingerprintHelperFragment;
    }

    public final void A04(int i, CharSequence charSequence) {
        FingerprintHelperFragment fingerprintHelperFragment = this.A00;
        fingerprintHelperFragment.A04.A00.obtainMessage(3).sendToTarget();
        AnonymousClass0WP r0 = AnonymousClass0WP.A09;
        if (r0 == null || !r0.A08) {
            fingerprintHelperFragment.A06.execute(new RunnableEBaseShape1S0201000_I1(charSequence, i, this, 1));
        }
    }
}
