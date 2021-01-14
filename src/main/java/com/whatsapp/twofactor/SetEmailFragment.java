package com.whatsapp.twofactor;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0JE;
import X.AnonymousClass0MB;
import X.AnonymousClass34h;
import X.C004302a;
import X.C05710Pt;
import X.C05720Pu;
import X.C72173Ru;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.base.WaFragment;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import java.util.HashMap;

public class SetEmailFragment extends WaFragment {
    public int A00;
    public TextWatcher A01 = new C72173Ru(this);
    public Button A02;
    public EditText A03;
    public TextView A04;
    public TwoFactorAuthActivity A05;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public class ConfirmSkipEmailDialog extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A00());
            AnonymousClass01X r2 = this.A00;
            r3.A01.A0E = r2.A06(R.string.two_factor_auth_email_skip_confirm);
            r3.A07(r2.A06(R.string.ok), new AnonymousClass34h(this));
            return AnonymousClass008.A03(r2, R.string.cancel, r3);
        }
    }

    @Override // X.AnonymousClass037
    public void A0X() {
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_two_factor_auth_email, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        String str;
        this.A0U = true;
        this.A03.removeTextChangedListener(this.A01);
        EditText editText = this.A03;
        if (this.A00 == 1) {
            str = this.A05.A03;
        } else {
            str = this.A05.A04;
        }
        editText.setText(str);
        this.A03.addTextChangedListener(this.A01);
        A0n();
        this.A03.requestFocus();
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A00 = super.A06.getInt("type", 1);
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        AnonymousClass01X r6;
        this.A05 = (TwoFactorAuthActivity) A0A();
        Button button = (Button) view.findViewById(R.id.submit);
        this.A02 = button;
        button.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 16));
        this.A03 = (EditText) view.findViewById(R.id.email);
        this.A04 = (TextView) view.findViewById(R.id.error);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.description);
        int i = this.A00;
        int i2 = 0;
        int i3 = 1;
        if (i == 1) {
            if (this.A05.A05[0] != 2) {
                textEmojiLabel.A07 = new C05710Pt();
                textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
                r6 = this.A06;
                String A062 = r6.A06(R.string.two_factor_auth_email_info_with_skip);
                int A002 = C004302a.A00(A00(), R.color.link_color);
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(A00(), R.style.SettingsInlineLink);
                RunnableEBaseShape13S0100000_I1_8 runnableEBaseShape13S0100000_I1_8 = new RunnableEBaseShape13S0100000_I1_8(this, 16);
                HashMap hashMap = new HashMap();
                hashMap.put("skip", runnableEBaseShape13S0100000_I1_8);
                textEmojiLabel.setText(AnonymousClass0JE.A07(A062, hashMap, A002, textAppearanceSpan));
            } else {
                r6 = this.A06;
                textEmojiLabel.setText(r6.A06(R.string.two_factor_auth_email_info));
            }
            this.A02.setText(r6.A06(R.string.next));
        } else if (i == 2) {
            AnonymousClass01X r2 = this.A06;
            textEmojiLabel.setText(r2.A06(R.string.two_factor_auth_email_confirmation));
            this.A02.setText(r2.A06(R.string.two_factor_auth_submit));
            i2 = 1;
        }
        TwoFactorAuthActivity twoFactorAuthActivity = this.A05;
        if (!twoFactorAuthActivity.A0X(this) || twoFactorAuthActivity.A05.length == 1) {
            i3 = i2;
        }
        twoFactorAuthActivity.A0V(view, i3);
    }

    public final void A0n() {
        Button button = this.A02;
        if (button != null) {
            String A0B = AnonymousClass008.A0B(this.A03);
            int indexOf = A0B.indexOf(64);
            boolean z = true;
            if (indexOf <= 0 || indexOf >= A0B.length() - 1 || indexOf != A0B.lastIndexOf(64)) {
                z = false;
            }
            button.setEnabled(z);
        }
    }
}
