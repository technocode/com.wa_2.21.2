package X;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S1100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.PayToolbar;
import com.whatsapp.util.Log;

/* renamed from: X.1PS  reason: invalid class name */
public abstract class AnonymousClass1PS extends AbstractView$OnClickListenerC32271ec {
    public FrameLayout A00;
    public C018809u A01 = C018809u.A00("PaymentCardDetailsActivity", "payment-settings", "COMMON");
    public C63622wj A02;
    public C63632wk A03;
    public final AnonymousClass01K A04 = AnonymousClass01K.A00();
    public final AnonymousClass0GP A05 = AnonymousClass0GP.A00();
    public final C04560Kv A06 = C04560Kv.A00();
    public final C02010Ah A07 = C02010Ah.A00();
    public final C03340Fu A08 = C03340Fu.A00();
    public final AnonymousClass0GQ A09 = AnonymousClass0GQ.A00();
    public final C01970Ad A0A = C01970Ad.A00();
    public final C63842x6 A0B = C63842x6.A00();
    public final AnonymousClass00T A0C = C002101e.A00();

    @Override // X.AbstractView$OnClickListenerC32271ec
    public void A0V(AnonymousClass1VM r5, boolean z) {
        super.A0V(r5, z);
        C43761yu r3 = (C43761yu) r5;
        if (r3 != null) {
            TextView textView = ((AbstractView$OnClickListenerC32271ec) this).A05;
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            textView.setText(C28051Sr.A0u(r2, r3));
            AbstractC43781yw r0 = r3.A06;
            if (r0 != null) {
                if (!r0.A06()) {
                    ((AbstractView$OnClickListenerC32271ec) this).A06.setText(r2.A06(R.string.payment_method_unverified));
                    ((AbstractView$OnClickListenerC32271ec) this).A06.A00 = null;
                    A0X(1);
                    C63622wj r22 = this.A02;
                    if (r22 != null) {
                        r22.setAlertButtonClickListener(new ViewOnClickEBaseShape1S1100000_I1(this, ((AbstractView$OnClickListenerC32271ec) this).A07.A07, 8));
                    }
                } else {
                    ((AbstractView$OnClickListenerC32271ec) this).A06.setVisibility(8);
                }
            }
            AbstractC43781yw r02 = r5.A06;
            if (r02 == null) {
                throw null;
            } else if (r02.A06()) {
                C63622wj r03 = this.A02;
                if (r03 != null) {
                    r03.setVisibility(8);
                    C63632wk r1 = this.A03;
                    if (r1 != null) {
                        r1.setBottomDividerSpaceVisibility(0);
                    }
                }
                ((AbstractView$OnClickListenerC32271ec) this).A06.setVisibility(8);
            }
        } else {
            throw null;
        }
    }

    public final int A0W(int i) {
        TypedArray typedArray;
        try {
            typedArray = obtainStyledAttributes(i, new int[]{16843071});
        } catch (Resources.NotFoundException e) {
            Log.e(e.getMessage());
            typedArray = null;
        }
        if (typedArray == null) {
            return -1;
        }
        return typedArray.getDimensionPixelOffset(0, -1);
    }

    public final void A0X(int i) {
        this.A02 = new C63622wj(this);
        this.A00.removeAllViews();
        this.A00.addView(this.A02);
        C63632wk r0 = this.A03;
        if (r0 != null) {
            r0.setBottomDividerSpaceVisibility(8);
            this.A02.setTopDividerVisibility(8);
        }
        this.A02.setAlertType(i);
    }

    public /* synthetic */ void lambda$addCardRemovedAlertRow$77$PaymentCardDetailsActivity(View view) {
        A0U();
    }

    public /* synthetic */ void lambda$addCardSuspendedAlertRow$76$PaymentCardDetailsActivity(View view) {
        A0U();
    }

    @Override // X.AbstractView$OnClickListenerC32271ec, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.A01.A07(null, "onActivityResult 1", null);
            this.A0C.ANF(new RunnableEBaseShape11S0100000_I1_6(this, 36));
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AnonymousClass2C0, X.AbstractView$OnClickListenerC32271ec, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.payment_card_details_title));
            AnonymousClass0S2 A093 = A09();
            if (A093 != null) {
                A093.A0A(true);
                int currentContentInsetRight = ((AbstractView$OnClickListenerC32271ec) this).A08.getCurrentContentInsetRight();
                int A0W = A0W(2131952400);
                PayToolbar payToolbar = ((AbstractView$OnClickListenerC32271ec) this).A08;
                payToolbar.A0A();
                payToolbar.A0P.A00(A0W, currentContentInsetRight);
            }
            int A0W2 = A0W(2131952335);
            int currentContentInsetLeft = ((AbstractView$OnClickListenerC32271ec) this).A08.getCurrentContentInsetLeft();
            PayToolbar payToolbar2 = ((AbstractView$OnClickListenerC32271ec) this).A08;
            payToolbar2.A0A();
            payToolbar2.A0P.A00(currentContentInsetLeft, A0W2);
        }
        if (!TextUtils.isEmpty(null)) {
            ((TextView) findViewById(R.id.footer_processed_by_psp)).setText((CharSequence) null);
        }
        this.A00 = (FrameLayout) findViewById(R.id.method_details_alert_container);
    }
}
