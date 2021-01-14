package com.whatsapp.wabloks.ui;

import X.AbstractC02170Ax;
import X.AnonymousClass037;
import X.AnonymousClass1TY;
import X.AnonymousClass36G;
import X.AnonymousClass36H;
import X.AnonymousClass3AP;
import X.AnonymousClass3V8;
import X.AnonymousClass3VJ;
import X.AnonymousClass3VN;
import X.C43191xw;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;

public class BkActionBottomSheet extends RoundedBottomSheetDialogFragment {
    public AnonymousClass36G A00;
    public final AnonymousClass36H A01 = AnonymousClass36H.A00();
    public final AbstractC02170Ax A02 = AnonymousClass3AP.lazy(AnonymousClass3VJ.class);

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List<C43191xw> list;
        AnonymousClass36H r1 = this.A01;
        Context A002 = A00();
        if (A002 != null) {
            AnonymousClass36G A012 = r1.A01(A002);
            this.A00 = A012;
            A012.A01(AnonymousClass3V8.class, this, new AnonymousClass3VN(this));
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.action_bottom_sheet, viewGroup, false);
                TextView textView = (TextView) viewGroup2.findViewById(R.id.bloks_action_sheet_title);
                TextView textView2 = (TextView) viewGroup2.findViewById(R.id.bloks_action_sheet_description);
                String string = bundle2.getString("action_sheet_title", "");
                String string2 = bundle2.getString("action_sheet_message", "");
                if (!TextUtils.isEmpty(string)) {
                    textView.setVisibility(0);
                    textView.setText(bundle2.getString("action_sheet_title"));
                }
                if (!TextUtils.isEmpty(string2)) {
                    textView2.setVisibility(0);
                    textView2.setText(bundle2.getString("action_sheet_message"));
                }
                if (bundle2.getBoolean("action_sheet_has_buttons")) {
                    boolean z = bundle2.getBoolean("action_sheet_has_buttons", false);
                    String string3 = bundle2.getString("action_sheet_buttons", "");
                    if (!z || (list = (List) ((AnonymousClass1TY) this.A02.get()).A01("action_sheet_buttons", string3)) == null) {
                        A0w(false, false);
                    } else {
                        for (C43191xw r3 : list) {
                            TextView textView3 = (TextView) layoutInflater.inflate(R.layout.action_sheet_button, viewGroup, false);
                            textView3.setText(r3.A01);
                            textView3.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r3, 45));
                            viewGroup2.addView(textView3);
                        }
                    }
                }
                return viewGroup2;
            }
            throw null;
        }
        throw null;
    }
}
