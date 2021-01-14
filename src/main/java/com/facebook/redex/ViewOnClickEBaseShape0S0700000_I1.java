package com.facebook.redex;

import X.AbstractC004502c;
import X.ActivityC004702f;
import X.ActivityC004802g;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass098;
import X.AnonymousClass0GG;
import X.AnonymousClass0Q7;
import X.AnonymousClass0T8;
import X.AnonymousClass2J9;
import X.AnonymousClass3G6;
import X.AnonymousClass3G7;
import X.C000300f;
import X.C004302a;
import X.C007003k;
import X.C018809u;
import X.C13380k9;
import X.C63832x5;
import X.C71503Pf;
import X.C71513Pg;
import X.ViewTreeObserver$OnGlobalLayoutListenerC659032a;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

public class ViewOnClickEBaseShape0S0700000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public ViewOnClickEBaseShape0S0700000_I1(Context context, View view, AnonymousClass01X r6, StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A07 = 2;
        this.A00 = new int[2];
        this.A01 = new int[2];
        this.A02 = new ViewTreeObserver$OnGlobalLayoutListenerC659032a(this);
        this.A05 = new C13380k9(context, view, r6.A0M() ? 5 : 3, R.attr.actionOverflowMenuStyle);
        this.A04 = view;
        this.A03 = statusPlaybackBaseFragment;
    }

    public ViewOnClickEBaseShape0S0700000_I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
        this.A06 = obj7;
    }

    public final void A00(int i) {
        IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = (IndiaUpiSendPaymentToVpaDialogFragment) this.A00;
        C018809u r2 = indiaUpiSendPaymentToVpaDialogFragment.A0B;
        StringBuilder sb = new StringBuilder("showErrorText: ");
        sb.append(i);
        r2.A07(null, sb.toString(), null);
        TextView textView = (TextView) this.A02;
        textView.setVisibility(0);
        textView.setText(indiaUpiSendPaymentToVpaDialogFragment.A03.A06(i));
        ActivityC004902h A0A = indiaUpiSendPaymentToVpaDialogFragment.A0A();
        if (A0A != null) {
            AnonymousClass0Q7.A0a((View) this.A06, C004302a.A02(A0A, R.color.red_button_text));
        }
    }

    public final void A01(String str) {
        ProgressBar progressBar = (ProgressBar) this.A04;
        progressBar.setVisibility(0);
        Button button = (Button) this.A03;
        button.setEnabled(false);
        EditText editText = (EditText) this.A06;
        editText.setEnabled(false);
        ((IndiaUpiSendPaymentToVpaDialogFragment) this.A00).A00.A00(str, null, new AnonymousClass3G7(this, progressBar, button, editText, str));
    }

    public final void A02(String str, String str2, String str3) {
        IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = (IndiaUpiSendPaymentToVpaDialogFragment) this.A00;
        indiaUpiSendPaymentToVpaDialogFragment.A0D.A02((View) this.A05);
        ((Dialog) this.A01).dismiss();
        Intent A012 = indiaUpiSendPaymentToVpaDialogFragment.A07.A01(indiaUpiSendPaymentToVpaDialogFragment.A0A(), false, true);
        A012.putExtra("extra_payment_handle", str);
        A012.putExtra("extra_payment_handle_id", str2);
        A012.putExtra("extra_payee_name", str3);
        ((ActivityC004702f) indiaUpiSendPaymentToVpaDialogFragment.A0A()).A0I(A012, false);
        indiaUpiSendPaymentToVpaDialogFragment.A0A().finish();
    }

    public final void A03(String str, String str2, String str3) {
        ((View) this.A02).setVisibility(4);
        AnonymousClass0Q7.A0a((View) this.A06, C004302a.A02(((AnonymousClass037) this.A00).A0A(), R.color.primary));
        if (TextUtils.isEmpty(str3)) {
            A01(str);
        } else {
            A02(str, str2, str3);
        }
    }

    public final void onClick(View view) {
        switch (this.A07) {
            case 0:
                ((AnonymousClass2J9) this.A00).A01((C007003k) this.A01, (C000300f) this.A02, (AnonymousClass0GG) this.A03, (AnonymousClass098) this.A04, (AbstractC004502c) this.A05, (ActivityC004802g) this.A06);
                return;
            case 1:
                String A0B = AnonymousClass008.A0B((EditText) this.A06);
                IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = (IndiaUpiSendPaymentToVpaDialogFragment) this.A00;
                String lowerCase = A0B.toLowerCase(indiaUpiSendPaymentToVpaDialogFragment.A03.A0I());
                if (!C63832x5.A00(lowerCase)) {
                    A00(R.string.payment_invalid_vpa_error_text);
                    return;
                } else if (lowerCase.equalsIgnoreCase(indiaUpiSendPaymentToVpaDialogFragment.A06.A05())) {
                    A00(R.string.payment_self_vpa_error_text);
                    return;
                } else if (indiaUpiSendPaymentToVpaDialogFragment.A04.A03(lowerCase)) {
                    A00(R.string.payment_blocked_vpa_error_text);
                    indiaUpiSendPaymentToVpaDialogFragment.A09.A01(indiaUpiSendPaymentToVpaDialogFragment.A0A(), null, lowerCase, false, false, new AnonymousClass3G6(this, lowerCase));
                    return;
                } else {
                    A01(lowerCase);
                    return;
                }
            case 2:
                if (this.A06 == null) {
                    ViewTreeObserver viewTreeObserver = ((View) this.A04).getViewTreeObserver();
                    this.A06 = viewTreeObserver;
                    viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.A02);
                }
                int[] iArr = (int[]) this.A00;
                ((View) this.A04).getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) this.A01;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                C13380k9 r3 = (C13380k9) this.A05;
                AnonymousClass0T8 r6 = r3.A02;
                r6.clear();
                StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) this.A03;
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) statusPlaybackBaseFragment;
                if (statusPlaybackContactFragment.A0P.A08(statusPlaybackContactFragment.A03).A0G) {
                    r6.add(0, R.id.menuitem_conversations_unmute, 0, statusPlaybackContactFragment.A0L.A06(R.string.unmute_status));
                } else {
                    r6.add(0, R.id.menuitem_conversations_mute, 0, statusPlaybackContactFragment.A0L.A06(R.string.mute_status));
                }
                r3.A00 = new C71513Pg(this);
                r3.A01 = new C71503Pf(statusPlaybackBaseFragment);
                r3.A00();
                if (1 != 0) {
                    statusPlaybackBaseFragment.A03 = true;
                    statusPlaybackBaseFragment.A0o();
                    return;
                }
                statusPlaybackBaseFragment.A03 = false;
                AnonymousClass02M r4 = statusPlaybackBaseFragment.A04;
                r4.A02.postDelayed(new RunnableEBaseShape12S0100000_I1_7(statusPlaybackBaseFragment, 41), 200);
                return;
            default:
                return;
        }
    }
}
