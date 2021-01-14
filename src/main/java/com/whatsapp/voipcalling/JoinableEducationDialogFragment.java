package com.whatsapp.voipcalling;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0V9;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.lang.ref.WeakReference;

public class JoinableEducationDialogFragment extends WaDialogFragment {
    public WeakReference A00;
    public boolean A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public static JoinableEducationDialogFragment A00(boolean z, DialogInterface.OnDismissListener onDismissListener) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_param_voice_call", z);
        JoinableEducationDialogFragment joinableEducationDialogFragment = new JoinableEducationDialogFragment();
        joinableEducationDialogFragment.A0N(bundle);
        if (onDismissListener != null) {
            joinableEducationDialogFragment.A00 = new WeakReference(onDismissListener);
        }
        return joinableEducationDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        if (bundle != null) {
            this.A01 = bundle.getBoolean("bundle_param_voice_call", false);
        } else {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                this.A01 = bundle2.getBoolean("bundle_param_voice_call", false);
            }
        }
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(A0A);
            View inflate = LayoutInflater.from(A0A).inflate(R.layout.voip_call_joinable_education_dialog, (ViewGroup) null, false);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.voip_call_joinable_education_dialog_icon);
            if (this.A01) {
                AnonymousClass0V9 A002 = AnonymousClass0V9.A00(A02(), R.drawable.ic_voip_joinable_calls_education_stars_voice, null);
                if (A002 != null) {
                    imageView.setImageDrawable(A002);
                    imageView.setContentDescription(this.A02.A06(R.string.voip_joinable_education_icon_content_description_voice));
                } else {
                    throw null;
                }
            }
            AnonymousClass0MC r0 = r4.A01;
            r0.A0C = inflate;
            r0.A01 = 0;
            r4.A07(this.A02.A06(R.string.ok), null);
            return r4.A00();
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener;
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        WeakReference weakReference = this.A00;
        if (weakReference != null && (onDismissListener = (DialogInterface.OnDismissListener) weakReference.get()) != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
