package com.whatsapp.ephemeral;

import X.AnonymousClass00D;
import X.AnonymousClass0LW;
import X.AnonymousClass0M9;
import X.AnonymousClass0Q7;
import X.C000300f;
import X.C02780Dk;
import X.DialogInterface$OnKeyListenerC48712Nk;
import X.ViewTreeObserver$OnGlobalLayoutListenerC48722Nl;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class EphemeralNUXDialog extends WaDialogFragment {
    public View A00;
    public ScrollView A01;
    public final C02780Dk A02 = C02780Dk.A02();
    public final AnonymousClass00D A03 = AnonymousClass00D.A00();
    public final AnonymousClass0M9 A04 = AnonymousClass0M9.A01();

    public EphemeralNUXDialog() {
        C000300f.A00();
    }

    public static void A00(AnonymousClass00D r3, AnonymousClass0LW r4, boolean z) {
        if (!r4.A0s() && (!r3.A00.getBoolean("ephemeral_nux", false)) && r4.A0Q.A01("ephemeral_nux") == null) {
            EphemeralNUXDialog ephemeralNUXDialog = new EphemeralNUXDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_settings", z);
            ephemeralNUXDialog.A0N(bundle);
            ephemeralNUXDialog.A0u(r4, "ephemeral_nux");
        }
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        if (this.A03.A00.getBoolean("ephemeral_nux", false)) {
            A0r();
        }
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface$OnKeyListenerC48712Nk(this));
            dialog.setCanceledOnTouchOutside(false);
            A0x(dialog);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC48722Nl(this));
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        boolean z = A03().getBoolean("from_settings");
        View inflate = A0B().getLayoutInflater().inflate(R.layout.ephemeral_nux, (ViewGroup) null, false);
        TextView textView = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.ephemeral_nux_title);
        TextView textView2 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.ephemeral_nux_content);
        TextView textView3 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.ephemeral_nux_finished);
        View A0D = AnonymousClass0Q7.A0D(inflate, R.id.ephemeral_nux_go_to_faq);
        this.A00 = AnonymousClass0Q7.A0D(inflate, R.id.ephemeral_nux_buttons_container);
        this.A01 = (ScrollView) AnonymousClass0Q7.A0D(inflate, R.id.ephemeral_nux_scroller);
        int i = R.string.ephemeral_nux_someone_turned_on_title;
        int i2 = R.string.ephemeral_nux_someone_turned_on_content;
        int i3 = R.string.ok;
        if (z) {
            i = R.string.ephemeral_nux_from_settings_title;
            i2 = R.string.ephemeral_nux_from_settings_content;
            i3 = R.string.ephemeral_nux_finished;
        }
        textView3.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 49));
        A0D.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 0));
        textView.setText(i);
        textView2.setText(i2);
        textView3.setText(i3);
        return new AlertDialog.Builder(A01()).setView(inflate).create();
    }

    public final void A0x(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = Math.min(A02().getDimensionPixelSize(R.dimen.ephemeral_nux_width), A02().getDisplayMetrics().widthPixels);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            A0x(dialog);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC48722Nl(this));
            }
        }
    }
}
