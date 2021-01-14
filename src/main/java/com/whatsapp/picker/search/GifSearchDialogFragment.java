package com.whatsapp.picker.search;

import X.AbstractC49282Pv;
import X.AbstractC49292Px;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.AnonymousClass0Eg;
import X.AnonymousClass202;
import X.AnonymousClass3Z5;
import X.C000300f;
import X.C06170Sb;
import X.C49262Ps;
import X.C54492f0;
import X.C54672fJ;
import X.C69833Is;
import X.C69843It;
import X.C69853Iu;
import X.C69863Iv;
import X.C69873Iw;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;

public class GifSearchDialogFragment extends PickerSearchDialogFragment implements AbstractC49292Px {
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public WaEditText A04;
    public C54492f0 A05;
    public AbstractC49282Pv A06;
    public String A07;
    public final C000300f A08 = C000300f.A00();
    public final AnonymousClass03P A09 = AnonymousClass03P.A00();
    public final AnonymousClass01X A0A = AnonymousClass01X.A00();
    public final AnonymousClass00Y A0B = AnonymousClass00Y.A00();
    public final AnonymousClass0Eg A0C = AnonymousClass0Eg.A00();
    public final AnonymousClass022 A0D = AnonymousClass022.A00();
    public final C06170Sb A0E = C06170Sb.A00();

    public static void A00(GifSearchDialogFragment gifSearchDialogFragment, CharSequence charSequence) {
        if (gifSearchDialogFragment.A06 != null) {
            gifSearchDialogFragment.A01.setVisibility(8);
            gifSearchDialogFragment.A02.setVisibility(8);
            gifSearchDialogFragment.A00.setVisibility(0);
            if (TextUtils.isEmpty(charSequence)) {
                gifSearchDialogFragment.A05.A09(null);
                C54492f0 A0y = gifSearchDialogFragment.A0y();
                gifSearchDialogFragment.A05 = A0y;
                gifSearchDialogFragment.A03.setAdapter(A0y);
                gifSearchDialogFragment.A05.A09(gifSearchDialogFragment.A06.A01());
            } else {
                gifSearchDialogFragment.A05.A09(gifSearchDialogFragment.A06.A02(charSequence, false));
            }
            gifSearchDialogFragment.A07 = charSequence.toString();
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        C54492f0 r1 = this.A05;
        if (r1 != null) {
            r1.A09(null);
            this.A05 = null;
        }
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int i;
        this.A06 = AbstractC49282Pv.A00();
        View inflate = layoutInflater.inflate(R.layout.gif_search_dialog, viewGroup, false);
        this.A01 = inflate.findViewById(R.id.no_results);
        this.A02 = inflate.findViewById(R.id.retry_panel);
        this.A03 = (RecyclerView) inflate.findViewById(R.id.search_result);
        int dimensionPixelSize = A02().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.A01 = new C69833Is(this, gridLayoutManager);
        this.A03.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView = this.A03;
        recyclerView.A0i = true;
        recyclerView.A0j(new C69843It(dimensionPixelSize));
        inflate.findViewById(R.id.retry_button).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 37));
        this.A00 = inflate.findViewById(R.id.progress_container);
        WaEditText waEditText = (WaEditText) inflate.findViewById(R.id.search_bar);
        this.A04 = waEditText;
        AnonymousClass01X r5 = this.A0A;
        Object[] objArr = new Object[1];
        if (!(this.A06 instanceof C54672fJ)) {
            str = "Giphy";
        } else {
            str = "Tenor";
        }
        objArr[0] = str;
        waEditText.setHint(r5.A0D(R.string.gif_search_hint, objArr));
        this.A03.A0l(new C69853Iu(this));
        View findViewById = inflate.findViewById(R.id.clear_search_btn);
        findViewById.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 38));
        this.A04.addTextChangedListener(new C69863Iv(this, findViewById));
        inflate.findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 39));
        this.A00.setVisibility(8);
        this.A01.setVisibility(8);
        this.A02.setVisibility(8);
        this.A00.setVisibility(0);
        C54492f0 A0y = A0y();
        this.A05 = A0y;
        this.A03.setAdapter(A0y);
        this.A05.A09(this.A06.A01());
        this.A07 = "";
        this.A04.setText("");
        this.A04.requestFocus();
        this.A04.A01(false);
        AnonymousClass00Y r2 = this.A0B;
        AbstractC49282Pv r0 = this.A06;
        AnonymousClass202 r1 = new AnonymousClass202();
        if (!(r0 instanceof C54672fJ)) {
            i = 0;
        } else {
            i = 1;
        }
        r1.A00 = Integer.valueOf(i);
        r2.A0B(r1, null, false);
        return inflate;
    }

    @Override // com.whatsapp.base.WaDialogFragment, X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        this.A04.A01(false);
    }

    public final C54492f0 A0y() {
        return new AnonymousClass3Z5(this, this.A0C, this.A0B, this.A08, this.A09, this.A0A, this, this.A0D, A02().getDimensionPixelSize(R.dimen.gif_trend_preview_size));
    }

    @Override // X.AbstractC49292Px
    public void AGa(C49262Ps r3) {
        AbstractC49292Px r0;
        this.A0E.A02(this.A04);
        C69873Iw r02 = ((PickerSearchDialogFragment) this).A00;
        if (r02 != null && (r0 = r02.A01) != null) {
            r0.AGa(r3);
        }
    }
}
