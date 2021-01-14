package com.whatsapp.authentication;

import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0JE;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass0Z2;
import X.AnonymousClass1Pr;
import X.AnonymousClass1Q1;
import X.C04530Ks;
import X.C05710Pt;
import X.C05720Pu;
import X.C38451pt;
import X.C41271ul;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import java.util.List;

public class VerifyTwoFactorAuthCodeDialogFragment extends WaDialogFragment implements AnonymousClass0Z2 {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public CodeInputField A03;
    public final Handler A04 = new AnonymousClass1Q1(this, Looper.getMainLooper());
    public final AnonymousClass02M A05 = AnonymousClass02M.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final C04530Ks A07 = C04530Ks.A00();
    public final Runnable A08 = new RunnableEBaseShape7S0100000_I1_2(this, 5);

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        List list = this.A07.A05;
        AnonymousClass00E.A07(list.contains(this));
        list.remove(this);
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        List list = this.A07.A05;
        AnonymousClass00E.A07(!list.contains(this));
        list.add(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Dialog dialog = new Dialog(A0A());
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(R.layout.fragment_two_factor_auth_nag);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) dialog.findViewById(R.id.nag_text);
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.setText(AnonymousClass0JE.A06(this.A06.A06(R.string.two_factor_auth_code_nag_explanation), "forgot-pin", new RunnableEBaseShape6S0100000_I1_1(this, 49)));
        this.A02 = (TextView) dialog.findViewById(R.id.error);
        CodeInputField codeInputField = (CodeInputField) dialog.findViewById(R.id.code);
        this.A03 = codeInputField;
        codeInputField.A05(new C41271ul(this), 6, '*', '*', null, new C38451pt(codeInputField.getContext()));
        this.A03.setPasswordTransformationEnabled(true);
        this.A01 = (ProgressBar) dialog.findViewById(R.id.progress_bar_code_input_blocked);
        this.A03.setEnabled(true);
        this.A01.setProgress(100);
        dialog.setOnShowListener(new AnonymousClass1Pr(this));
        return dialog;
    }

    public void A0x() {
        this.A00 = 1;
        AnonymousClass02M r2 = this.A05;
        r2.A05(0, R.string.two_factor_auth_disabling);
        r2.A02.postDelayed(this.A08, 5000);
        C04530Ks r22 = this.A07;
        if (r22 != null) {
            Log.i("twofactorauthmanager/disable-two-factor-auth");
            r22.A01("", null);
            return;
        }
        throw null;
    }

    public final void A0y() {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            AnonymousClass0LW A042 = A0A.A04();
            if (A042 != null) {
                AnonymousClass0QB r1 = new AnonymousClass0QB(A042);
                r1.A03(this);
                r1.A06 = 8194;
                r1.A01();
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass0Z2
    public synchronized void ALK() {
        if (this.A00 == 1) {
            this.A00 = 0;
            AnonymousClass02M r1 = this.A05;
            Runnable runnable = this.A08;
            Handler handler = r1.A02;
            handler.removeCallbacks(runnable);
            handler.postDelayed(new RunnableEBaseShape7S0100000_I1_2(this, 2), 500);
        }
    }

    @Override // X.AnonymousClass0Z2
    public synchronized void ALL() {
        if (this.A00 == 1) {
            this.A00 = 3;
            AnonymousClass02M r1 = this.A05;
            Runnable runnable = this.A08;
            Handler handler = r1.A02;
            handler.removeCallbacks(runnable);
            handler.postDelayed(new RunnableEBaseShape7S0100000_I1_2(this, 1), 500);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        ActivityC004902h A0A;
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        int i = this.A00;
        if (i != 2 && i != 4 && (A0A = A0A()) != null) {
            A0A.finish();
        }
    }
}
