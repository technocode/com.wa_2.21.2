package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2aR  reason: invalid class name and case insensitive filesystem */
public final class C52012aR extends AnonymousClass2JB {
    public final AnonymousClass0CO A00 = AnonymousClass0CO.A00();
    public final AnonymousClass01I A01 = AnonymousClass01I.A00();
    public final C017009c A02 = C017009c.A00();
    public final AnonymousClass01A A03 = AnonymousClass01A.A00();
    public final AnonymousClass00G A04 = AnonymousClass00G.A01;
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();

    public C52012aR(Context context) {
        super(context);
    }

    @Override // X.AnonymousClass2JB
    public int getNegativeButtonTextResId() {
        return R.string.contact_qr_reciprocal_footer_dismiss;
    }

    @Override // X.AnonymousClass2JB
    public int getPositiveButtonIconResId() {
        return R.drawable.ic_settings_name;
    }

    @Override // X.AnonymousClass2JB
    public int getPositiveButtonTextResId() {
        return R.string.contact_qr_share_my_contact_button;
    }
}
