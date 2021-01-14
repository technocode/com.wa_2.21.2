package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ms  reason: invalid class name and case insensitive filesystem */
public class C58992ms extends AnonymousClass2ZC {
    public final C47262Hc A00;

    public C58992ms(ActivityC004802g r4, AnonymousClass02M r5, C002301g r6, AnonymousClass00T r7, C02590Cr r8, AnonymousClass0HJ r9, C09050cD r10, C014308b r11, AnonymousClass01X r12, AnonymousClass1PN r13, AnonymousClass08B r14, AnonymousClass31y r15, AnonymousClass0HK r16, AnonymousClass0AQ r17, AnonymousClass0OP r18, C007003k r19) {
        super(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        this.A00 = new C47262Hc(r7, r11, r18, new AnonymousClass2Z1(this));
    }

    @Override // X.AnonymousClass2ZC
    public void A00() {
        super.A00();
        this.A00.A00();
    }

    @Override // X.AnonymousClass1PD, X.AnonymousClass2ZC
    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        TextView textView = this.A08;
        AnonymousClass01X r3 = this.A0Q;
        textView.setText(r3.A06(R.string.tap_for_list_info));
        this.A03.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, activity, 31));
        C002001d.A2w(r3, this.A03, R.string.accessibility_action_click_conversation_title_for_broadcast_list_info);
    }

    @Override // X.AnonymousClass1PD, X.AnonymousClass2ZC
    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        C47262Hc r1 = this.A00;
        C10750f8 r0 = r1.A00;
        if (r0 != null) {
            r0.A04();
            r1.A00 = null;
        }
    }
}
