package com.whatsapp.picker.search;

import X.AbstractC16300pa;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0D1;
import X.AnonymousClass33U;
import X.AnonymousClass3J1;
import X.AnonymousClass3QG;
import X.C002701k;
import X.C29241Xq;
import X.C59842oN;
import X.C64022xO;
import X.C69823Ir;
import X.C69873Iw;
import X.C71933Qw;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import java.util.ArrayList;
import java.util.List;

public class StickerSearchTabFragment extends WaFragment implements AnonymousClass33U {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public RecyclerView A01;
    public AnonymousClass3QG A02;
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final C002701k A04 = C002701k.A00();

    @Override // X.AnonymousClass037
    public void A0X() {
        this.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this.A00);
        List list = this.A01.A0b;
        if (list != null) {
            list.clear();
        }
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0D1 r9;
        Context A002 = A00();
        if (A002 != null) {
            View inflate = layoutInflater.inflate(R.layout.sticker_search_tab_results, viewGroup, false);
            this.A01 = (RecyclerView) inflate.findViewById(R.id.tab_result);
            AnonymousClass037 r6 = this.A0D;
            if (r6 instanceof StickerSearchDialogFragment) {
                StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) r6;
                C69873Iw r4 = ((PickerSearchDialogFragment) stickerSearchDialogFragment).A00;
                if (r4 != null) {
                    List arrayList = new ArrayList();
                    Bundle bundle2 = this.A06;
                    if (bundle2 != null) {
                        int i = bundle2.getInt("sticker_category_tab");
                        AnonymousClass3J1 r0 = stickerSearchDialogFragment.A07;
                        if (r0 != null) {
                            r0.A00.A03(A0E(), new C69823Ir(this, stickerSearchDialogFragment, i));
                        }
                        arrayList = stickerSearchDialogFragment.A0y(i);
                    }
                    C59842oN r02 = r4.A00;
                    if (r02 == null) {
                        r9 = null;
                    } else {
                        r9 = r02.A0Y;
                    }
                    AnonymousClass3QG r62 = new AnonymousClass3QG(arrayList, A002, r9, this.A03, this, 1);
                    this.A02 = r62;
                    this.A01.setAdapter(r62);
                    C64022xO r63 = new C64022xO(A002, viewGroup, this.A01, this.A02);
                    this.A00 = r63.A07;
                    inflate.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
                    this.A01.A0l(new C71933Qw(this.A04, A02(), r63.A08));
                    return inflate;
                }
                throw null;
            }
            throw new RuntimeException("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        AnonymousClass3QG r1 = this.A02;
        if (r1 != null) {
            r1.A04 = false;
            ((AbstractC16300pa) r1).A01.A00();
        }
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        AnonymousClass3QG r0 = this.A02;
        if (r0 != null) {
            r0.A04 = true;
            ((AbstractC16300pa) r0).A01.A00();
        }
    }

    @Override // X.AnonymousClass33U
    public void AKY(C29241Xq r3, Integer num) {
        AnonymousClass037 r1 = this.A0D;
        if (r1 instanceof StickerSearchDialogFragment) {
            ((StickerSearchDialogFragment) r1).AKY(r3, num);
            return;
        }
        throw new RuntimeException("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
    }
}
