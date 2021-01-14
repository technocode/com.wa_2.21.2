package com.whatsapp.payments.pin.ui;

import X.AbstractC61982u3;
import X.ActivityC004902h;
import X.AnonymousClass00S;
import X.AnonymousClass01X;
import X.AnonymousClass3F1;
import X.AnonymousClass3F2;
import X.AnonymousClass3F3;
import X.C004302a;
import X.C61942tz;
import X.CountDownTimerC61972u2;
import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.components.Button;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;

public class PinBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public long A00;
    public CountDownTimer A01;
    public View A02;
    public ProgressBar A03;
    public TextView A04;
    public CodeInputField A05;
    public Button A06;
    public AnonymousClass3F3 A07;
    public AbstractC61982u3 A08;
    public boolean A09;
    public final AnonymousClass00S A0A = AnonymousClass00S.A00();
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();
    public final C61942tz A0C = C61942tz.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        View inflate = layoutInflater.inflate(R.layout.pin_bottom_sheet, viewGroup, false);
        Dialog dialog = ((DialogFragment) this).A03;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(3);
        }
        this.A02 = inflate.findViewById(R.id.pin_text_container);
        this.A03 = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.A04 = (TextView) inflate.findViewById(R.id.error_text);
        View findViewById = inflate.findViewById(R.id.forgot_pin_button);
        if (findViewById != null) {
            Button button = (Button) findViewById;
            this.A06 = button;
            AnonymousClass01X r4 = this.A0B;
            String A062 = r4.A06(R.string.payment_pin_term_default);
            if (this.A07 != null) {
                String A063 = r4.A06(R.string.payment_pin_term_default);
                if (!TextUtils.isEmpty(A063)) {
                    A062 = A063;
                }
            }
            button.setText(r4.A0D(R.string.payment_forgot_pin, A062));
            this.A06.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 2));
            boolean z = this.A09;
            this.A09 = z;
            Button button2 = this.A06;
            if (button2 != null) {
                if (z) {
                    button2.setVisibility(8);
                } else {
                    button2.setVisibility(0);
                }
            }
            CodeInputField codeInputField = (CodeInputField) inflate.findViewById(R.id.code);
            this.A05 = codeInputField;
            codeInputField.A04(6, new AnonymousClass3F1(this), A02().getColor(R.color.fb_pay_input_color));
            ((NumberEntryKeyboard) inflate.findViewById(R.id.number_entry_keyboard)).A06 = this.A05;
            if (this.A07 != null) {
                ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.title_view);
                if (this.A07 != null) {
                    layoutInflater.inflate(R.layout.pay_header, viewGroup2, true);
                    TextView textView = (TextView) inflate.findViewById(R.id.header_text);
                    if (this.A07 != null) {
                        textView.setText(r4.A06(R.string.payment_pin_bottom_sheet_title));
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            return inflate;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            A0A2.setRequestedOrientation(10);
        }
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        long A012 = this.A0C.A01() * 1000;
        if (A012 > this.A0A.A05() || this.A01 != null) {
            A12(A012, false);
        }
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            A0A2.setRequestedOrientation(1);
        }
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment
    public void A0y(View view) {
        super.A0y(view);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        A002.A0E = new AnonymousClass3F2(A002);
    }

    public void A0z() {
        A0v(true);
        this.A02.setVisibility(0);
        this.A03.setVisibility(8);
        this.A05.setEnabled(true);
    }

    public void A10() {
        A0v(false);
        this.A02.setVisibility(4);
        this.A04.setVisibility(4);
        this.A03.setVisibility(0);
        this.A05.setEnabled(false);
    }

    public void A11(int i) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A05.setErrorState(true);
        this.A05.A03();
        this.A04.setText(this.A0B.A0A(R.plurals.payment_pin_retry_attempts, (long) i, Integer.valueOf(i)));
        TextView textView = this.A04;
        textView.setTextColor(C004302a.A00(textView.getContext(), R.color.code_input_error));
        this.A04.setVisibility(0);
    }

    public final void A12(long j, boolean z) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A00 = j;
        TextView textView = this.A04;
        textView.setTextColor(C004302a.A00(textView.getContext(), R.color.secondary_text));
        this.A04.setVisibility(0);
        this.A05.setErrorState(true);
        this.A05.setEnabled(false);
        if (z) {
            this.A05.A03();
        }
        this.A01 = new CountDownTimerC61972u2(this, j - this.A0A.A05()).start();
    }
}
