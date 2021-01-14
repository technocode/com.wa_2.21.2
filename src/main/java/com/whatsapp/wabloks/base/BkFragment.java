package com.whatsapp.wabloks.base;

import X.AbstractC011006p;
import X.AbstractC02170Ax;
import X.AnonymousClass06P;
import X.AnonymousClass1GM;
import X.AnonymousClass36G;
import X.AnonymousClass36H;
import X.AnonymousClass3Ah;
import X.AnonymousClass3V5;
import X.AnonymousClass3V6;
import X.AnonymousClass3V9;
import X.C009205v;
import X.C010406j;
import X.C28051Sr;
import X.C37351o4;
import X.C37441oE;
import X.C67783Af;
import X.C72763Ue;
import X.C72783Ug;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.whatsapp.base.WaDialogFragment;
import java.util.Collections;

public abstract class BkFragment extends WaDialogFragment {
    public FrameLayout A00;
    public C37441oE A01;
    public AbstractC011006p A02;
    public AnonymousClass36G A03;
    public AnonymousClass3V9 A04 = new AnonymousClass3V9();
    public final AbstractC02170Ax A05 = C72783Ug.A00;
    public final AbstractC02170Ax A06 = C72763Ue.A00;

    public BkFragment() {
        C67783Af.A01(AnonymousClass3Ah.class);
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        this.A01 = null;
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            C009205v.A00();
            C009205v.A01(frameLayout);
        }
        AnonymousClass36G r0 = this.A03;
        if (r0 != null) {
            r0.A02(this);
        }
        super.A0X();
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        AnonymousClass36G A012 = ((AnonymousClass36H) this.A06.get()).A01(context);
        AnonymousClass36G r0 = this.A03;
        if (!(r0 == null || r0 == A012)) {
            r0.A02(this);
        }
        this.A03 = A012;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        Context A002 = super.A00();
        if (A002 != null) {
            A0x(A002);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        Context A002 = super.A00();
        if (A002 != null) {
            A0x(A002);
            return;
        }
        throw null;
    }

    public final void A0x(Context context) {
        if (this.A02 == null) {
            C37351o4 r2 = new C37351o4(new AnonymousClass3V6(new AnonymousClass3V5()));
            this.A02 = r2;
            C28051Sr.A1H();
            AnonymousClass06P r3 = new AnonymousClass06P(C28051Sr.A02);
            C28051Sr.A1H();
            C009205v.A05 = new C009205v(context, r2, r3, new AnonymousClass1GM(), Collections.emptyMap());
            C28051Sr.A1H();
            C010406j.A01 = new C010406j(new AnonymousClass06P(C28051Sr.A02));
        }
    }
}
