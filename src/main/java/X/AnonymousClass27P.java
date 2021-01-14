package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.27P  reason: invalid class name */
public final class AnonymousClass27P extends AbstractC39391rQ {
    public final AnonymousClass01I A00 = AnonymousClass01I.A00();
    public final C007003k A01;

    public AnonymousClass27P(Context context, int i, C007003k r4) {
        super(context, i);
        this.A01 = r4;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        AnonymousClass01I r1 = this.A00;
        C007003k r2 = this.A01;
        if (!r1.A09(r2.A09)) {
            ContactInfoActivity.A07(r2, C02780Dk.A00(view.getContext()), null);
        }
    }
}
