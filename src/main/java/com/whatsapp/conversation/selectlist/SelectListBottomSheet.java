package com.whatsapp.conversation.selectlist;

import X.AbstractC16300pa;
import X.AnonymousClass037;
import X.AnonymousClass1XR;
import X.AnonymousClass1XS;
import X.AnonymousClass1XT;
import X.AnonymousClass2JE;
import X.AnonymousClass2JF;
import X.AnonymousClass2ZT;
import X.C52032aT;
import X.C52042aU;
import X.C52062aW;
import X.C52072aX;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

public class SelectListBottomSheet extends RoundedBottomSheetDialogFragment {
    public AnonymousClass2ZT A00;
    public AnonymousClass1XT A01;

    public static void A00(SelectListBottomSheet selectListBottomSheet, RecyclerView recyclerView, int i, int i2) {
        if (((AnonymousClass037) selectListBottomSheet).A0A != null) {
            boolean canScrollVertically = recyclerView.canScrollVertically(i);
            View findViewById = ((AnonymousClass037) selectListBottomSheet).A0A.findViewById(i2);
            if (canScrollVertically) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        this.A00 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.conversation_single_select_list_bottom_sheet, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            AnonymousClass1XT r0 = (AnonymousClass1XT) bundle2.getParcelable("arg_select_list_content");
            this.A01 = r0;
            if (r0 == null) {
                A0w(false, false);
            }
            view.findViewById(R.id.close).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 24));
            ((TextEmojiLabel) view.findViewById(R.id.select_list_title)).A02(this.A01.A01);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.select_list_items);
            recyclerView.A0l(new C52042aU(this));
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.A0j(new C52072aX());
            C52062aW r3 = new C52062aW();
            recyclerView.setAdapter(r3);
            List<AnonymousClass1XS> list = this.A01.A04;
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass1XS r2 : list) {
                String str = r2.A00;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new AnonymousClass2JF(str));
                }
                for (AnonymousClass1XR r1 : r2.A01) {
                    arrayList.add(new AnonymousClass2JF(r1));
                }
            }
            List list2 = r3.A02;
            list2.clear();
            list2.addAll(arrayList);
            ((AbstractC16300pa) r3).A01.A00();
            view.findViewById(R.id.select_list_button).setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r3, 39));
            r3.A01 = new C52032aT(view);
            ((DialogFragment) this).A03.setOnShowListener(AnonymousClass2JE.A00);
            return;
        }
        throw null;
    }
}
