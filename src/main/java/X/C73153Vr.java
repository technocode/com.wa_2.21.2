package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.wabloks.ui.PrivacyNoticeFragment;
import java.util.List;

/* renamed from: X.3Vr  reason: invalid class name and case insensitive filesystem */
public class C73153Vr {
    public static final AbstractC02170Ax A04 = C72983Va.A00;
    public final List A00;
    public final AbstractC02170Ax A01;
    public final AbstractC02170Ax A02;
    public final AbstractC02170Ax A03;

    public C73153Vr(AbstractC02170Ax r2, AbstractC02170Ax r3, AbstractC02170Ax r4, AbstractC02170Ax r5) {
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A00 = ((C67793Ag) r2.get()).A00;
    }

    public final void A00(Context context, Intent intent) {
        C73183Vu r1 = (C73183Vu) AnonymousClass3AP.lazy(C73183Vu.class).get();
        AbstractC02170Ax r6 = r1.A01;
        int i = ((AnonymousClass00D) r6.get()).A00.getInt("shops_privacy_notice", -1);
        AbstractC02170Ax r2 = r1.A00;
        C006003a r12 = AbstractC000400g.A3s;
        if (i >= ((AbstractC000400g) ((AnonymousClass3Ah) r2.get()).A00.get()).A06(r12)) {
            ((C02780Dk) this.A01.get()).A06(C02780Dk.A00(context), intent, 475);
            return;
        }
        ((AnonymousClass00D) r6.get()).A00.getInt("shops_privacy_notice", -1);
        ((AbstractC000400g) ((AnonymousClass3Ah) r2.get()).A00.get()).A06(r12);
        AnonymousClass3AP.get().ui();
        ActivityC004902h r8 = (ActivityC004902h) context;
        if (r8 != null) {
            AnonymousClass0LW A042 = r8.A04();
            PrivacyNoticeFragment privacyNoticeFragment = new PrivacyNoticeFragment();
            Bundle bundle = new Bundle();
            bundle.putString("screen_name", "com.bloks.www.minishops.whatsapp.privacy_notice");
            privacyNoticeFragment.A0N(bundle);
            privacyNoticeFragment.A0u(A042, "TOSFragment");
            return;
        }
        throw null;
    }
}
