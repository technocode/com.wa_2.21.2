package com.whatsapp.contact.picker;

import X.AbstractC004502c;
import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass037;
import X.AnonymousClass2Y7;
import X.C006803i;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public class SharedFilePreviewDialogFragment extends BaseSharedPreviewDialogFragment {
    public Uri A00;
    public Bundle A01;
    public File A02;

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        try {
            File file = this.A02;
            if (file != null && ((BaseSharedPreviewDialogFragment) this).A0A.A0L(file)) {
                C006803i.A0m(this.A02);
            }
        } catch (IOException e) {
            Log.e("sharedfilepreviewdialogfragment/ondestroyview exception", e);
        }
    }

    @Override // com.whatsapp.BaseSharedPreviewDialogFragment, X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.A0Z(layoutInflater, viewGroup, bundle);
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            RelativeLayout relativeLayout = (RelativeLayout) A0A.getLayoutInflater().inflate(R.layout.shared_file_preview_layout, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            relativeLayout.setLayoutParams(layoutParams);
            ((BaseSharedPreviewDialogFragment) this).A04.addView(relativeLayout);
            ((BaseSharedPreviewDialogFragment) this).A0G.A0C(this.A00, (AbstractC004502c) A0A(), new AnonymousClass2Y7(this, this.A01.getString("mime_type", ""), relativeLayout));
            ((BaseSharedPreviewDialogFragment) this).A03.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 8));
            return ((BaseSharedPreviewDialogFragment) this).A00;
        }
        throw null;
    }

    @Override // com.whatsapp.BaseSharedPreviewDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        AnonymousClass00E.A04(bundle2, "null arguments");
        String string = bundle2.getString("share_uri");
        AnonymousClass00E.A04(string, "null share uri");
        this.A00 = Uri.parse(string);
        Bundle bundle3 = bundle2.getBundle("extras");
        AnonymousClass00E.A04(bundle3, "null extras");
        this.A01 = bundle3;
        return super.A0p(bundle);
    }
}
