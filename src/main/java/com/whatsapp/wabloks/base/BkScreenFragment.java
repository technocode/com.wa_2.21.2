package com.whatsapp.wabloks.base;

import X.AbstractC02170Ax;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass037;
import X.AnonymousClass3AP;
import X.AnonymousClass3Ah;
import X.C009205v;
import X.C010706m;
import X.C06170Sb;
import X.C37441oE;
import X.C67763Ad;
import X.C67783Af;
import X.C72753Ud;
import X.C72773Uf;
import X.C72793Uh;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.HashMap;

public final class BkScreenFragment extends WaDialogFragment {
    public View A00;
    public WebView A01;
    public FrameLayout A02;
    public FrameLayout A03;
    public C37441oE A04;
    public C06170Sb A05;
    public final AbstractC02170Ax A06 = C72793Uh.A00;
    public final AbstractC02170Ax A07;

    public BkScreenFragment() {
        C67783Af.A01(AnonymousClass3Ah.class);
        this.A07 = C72773Uf.A00;
        this.A05 = C06170Sb.A00();
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        C009205v.A00();
        C009205v.A01(this.A02);
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_bloks, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            View currentFocus = A0A.getCurrentFocus();
            if (currentFocus != null) {
                this.A05.A02(currentFocus);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        this.A02 = (FrameLayout) view.findViewById(R.id.bloks_container);
        this.A01 = (WebView) view.findViewById(R.id.error_view);
        this.A00 = view.findViewById(R.id.bloks_dialogfragment_progressbar);
        this.A03 = (FrameLayout) view.findViewById(R.id.bloks_dialogfragment);
        A0x();
        FrameLayout frameLayout = this.A03;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        View view2 = this.A00;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        C67763Ad r3 = (C67763Ad) AnonymousClass3AP.lazy(C67763Ad.class).get();
        String string = ((AnonymousClass037) this).A06.getString("screen_name");
        if (string != null) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                r3.A00(string, (HashMap) bundle2.getSerializable("screen_params"), new C72753Ud(this));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Dialog A0p = super.A0p(bundle);
        A0p.setCanceledOnTouchOutside(false);
        Window window = A0p.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        return A0p;
    }

    public final void A0x() {
        if (this.A04 != null) {
            ActivityC004702f r4 = (ActivityC004702f) A0A();
            if (r4 != null) {
                r4.onConfigurationChanged(r4.getResources().getConfiguration());
            }
            C009205v.A00().A02(new C010706m(this.A0H, r4, this.A05), this.A04, this.A02);
        }
    }
}
