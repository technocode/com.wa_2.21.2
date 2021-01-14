package com.whatsapp.bloks.ui;

import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass037;
import X.AnonymousClass1T0;
import X.C009205v;
import X.C010706m;
import X.C06170Sb;
import X.C28061Ss;
import X.C37441oE;
import X.C43341yD;
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
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.HashMap;

public class BloksDialogFragment extends WaDialogFragment {
    public WebView A00;
    public FrameLayout A01;
    public C37441oE A02;
    public Boolean A03;
    public final C28061Ss A04 = C28061Ss.A00();
    public final C06170Sb A05 = C06170Sb.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        C009205v.A00();
        C009205v.A01(this.A01);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
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

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        C43341yD r5 = new C43341yD(this);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            String string = bundle2.getString("screen_name");
            if (string != null) {
                Bundle bundle3 = ((AnonymousClass037) this).A06;
                if (bundle3 != null) {
                    Serializable serializable = bundle3.getSerializable("screen_params");
                    if (bundle2.getBoolean("hot_reload")) {
                        C28061Ss r6 = this.A04;
                        AnonymousClass00E.A06(false);
                        try {
                            Class<?> cls = Class.forName("com.whatsapp.bloks.DebugBloksPayloadUtil");
                            Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                            cls.getDeclaredMethod("getSingleBloksLayoutFromServerForHotReloading", String.class, HashMap.class, AnonymousClass1T0.class).invoke(invoke, string, serializable, r5);
                        } catch (Exception e) {
                            Log.e("Error getting Debug Bloks Payload Util", e);
                            r6.A01.ANF(new RunnableEBaseShape1S1200000_I1(r6, r5, string, 20));
                        }
                    } else {
                        C28061Ss r3 = this.A04;
                        r3.A01.ANF(new RunnableEBaseShape1S1200000_I1(r3, r5, string, 20));
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        this.A01 = (FrameLayout) view.findViewById(R.id.bloks_container);
        this.A00 = (WebView) view.findViewById(R.id.error_view);
        view.findViewById(R.id.bloks_dialogfragment_progressbar);
        view.findViewById(R.id.bloks_dialogfragment);
        A0x();
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
        if (this.A02 != null) {
            this.A03 = Boolean.TRUE;
            ActivityC004702f r4 = (ActivityC004702f) A0A();
            if (r4 != null) {
                r4.onConfigurationChanged(r4.getResources().getConfiguration());
            }
            C009205v.A00().A02(new C010706m(this.A0H, r4, this.A05), this.A02, this.A01);
            this.A03 = Boolean.FALSE;
        }
    }
}
