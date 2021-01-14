package com.whatsapp.wabloks.ui;

import X.AbstractC02170Ax;
import X.AnonymousClass037;
import X.AnonymousClass3AP;
import X.AnonymousClass3AZ;
import X.AnonymousClass3V8;
import X.AnonymousClass3VP;
import X.AnonymousClass3VQ;
import X.C67763Ad;
import X.C67783Af;
import X.C72743Uc;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.wabloks.base.BkFragment;
import java.util.HashMap;

public class PrivacyNoticeFragment extends BkFragment {
    public WebView A00;
    public FrameLayout A01;
    public final AbstractC02170Ax A02 = C67783Af.A01(AnonymousClass3AZ.class);

    @Override // com.whatsapp.wabloks.base.BkFragment, X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_bloks, viewGroup, false);
    }

    @Override // com.whatsapp.wabloks.base.BkFragment, X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        ((BkFragment) this).A03.A01(AnonymousClass3V8.class, this, new AnonymousClass3VP(this));
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        this.A01 = (FrameLayout) view.findViewById(R.id.bloks_container);
        this.A00 = (WebView) view.findViewById(R.id.error_view);
        view.findViewById(R.id.bloks_dialogfragment_progressbar);
        view.findViewById(R.id.bloks_dialogfragment);
        ((BkFragment) this).A00 = this.A01;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            String string = bundle2.getString("screen_name");
            if (string != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("params", "{\"params\":{}}");
                ((C67763Ad) AnonymousClass3AP.lazy(C67763Ad.class).get()).A00(string, hashMap, new C72743Uc(this, new AnonymousClass3VQ(this)));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        int i = configuration.orientation;
        if (i == 2) {
            Dialog dialog = ((DialogFragment) this).A03;
            if (dialog == null) {
                throw null;
            } else if (dialog.getWindow() == null) {
                throw null;
            } else if (A0A() != null) {
                ((DialogFragment) this).A03.getWindow().setLayout((int) (((double) A0A().getWindowManager().getDefaultDisplay().getWidth()) * 0.8d), -2);
            } else {
                throw null;
            }
        } else if (i == 1) {
            Dialog dialog2 = ((DialogFragment) this).A03;
            if (dialog2 == null) {
                throw null;
            } else if (dialog2.getWindow() == null) {
                throw null;
            } else if (A0A() != null) {
                ((DialogFragment) this).A03.getWindow().setLayout(-2, (int) (((double) A0A().getWindowManager().getDefaultDisplay().getHeight()) * 0.85d));
            } else {
                throw null;
            }
        }
    }
}
