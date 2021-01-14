package com.whatsapp.payments.ui;

import X.AbstractC43781yw;
import X.AbstractC60972sI;
import X.AbstractC63112vs;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass1VM;
import X.AnonymousClass3HB;
import X.AnonymousClass3HC;
import X.AnonymousClass3HD;
import X.AnonymousClass3HE;
import X.AnonymousClass3YG;
import X.AnonymousClass3YH;
import X.C002001d;
import X.C004302a;
import X.C01970Ad;
import X.C28051Sr;
import X.C62862vT;
import X.C68433De;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;

public class PaymentMethodsListPickerFragment extends WaFragment implements AnonymousClass3HB {
    public AbstractC60972sI A00 = new AnonymousClass3HD(this);
    public AnonymousClass3HC A01;
    public AnonymousClass3HE A02;
    public final AnonymousClass02M A03 = AnonymousClass02M.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final C68433De A05 = C68433De.A00;
    public final C01970Ad A06 = C01970Ad.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.payment_method_picker_fragment, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        this.A0U = true;
        this.A05.A00(this.A00);
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A05.A01(this.A00);
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        View view2;
        Bundle bundle2 = super.A06;
        if (bundle2 != null) {
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("arg_methods");
            if (parcelableArrayList != null) {
                AnonymousClass3HC r0 = new AnonymousClass3HC(view.getContext(), this.A04, this.A06, this);
                this.A01 = r0;
                ((AbstractC63112vs) r0).A00 = parcelableArrayList;
                r0.notifyDataSetChanged();
                ListView listView = (ListView) view.findViewById(R.id.methods_list);
                View view3 = null;
                if (this.A02 != null) {
                    view2 = A05().inflate(R.layout.add_payment_method_row, (ViewGroup) null);
                    C002001d.A2m((ImageView) view2.findViewById(R.id.add_new_account_icon), C004302a.A00(view.getContext(), R.color.settings_icon));
                    listView.addFooterView(view2);
                } else {
                    view2 = null;
                }
                if (!(this.A02 == null || (view3 = A05().inflate(R.layout.payment_method_picker_header, (ViewGroup) null)) == null)) {
                    listView.addHeaderView(view3);
                }
                listView.setOnItemClickListener(new C62862vT(this, view3, listView, view2));
                listView.setAdapter((ListAdapter) this.A01);
                View findViewById = view.findViewById(R.id.back);
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 26));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass3HB
    public String A7Q(AnonymousClass1VM r2) {
        return null;
    }

    @Override // X.AbstractC63102vr
    public String A7R(AnonymousClass1VM r3) {
        if (this.A02 != null && !TextUtils.isEmpty(null)) {
            return null;
        }
        AbstractC43781yw r0 = r3.A06;
        if (r0 == null) {
            throw null;
        } else if (!r0.A06()) {
            return this.A04.A06(R.string.payment_method_unverified);
        } else {
            AnonymousClass01X r1 = this.A04;
            return C28051Sr.A0v(r1, r3) != null ? C28051Sr.A0v(r1, r3) : "";
        }
    }

    @Override // X.AbstractC63102vr
    public String A7S(AnonymousClass1VM r2) {
        return null;
    }

    @Override // X.AnonymousClass3HB
    public boolean APa() {
        boolean z;
        AnonymousClass3HE r0 = this.A02;
        if (r0 != null) {
            if (!(r0 instanceof AnonymousClass3YH)) {
                z = true;
            } else {
                z = true;
            }
            return z;
        }
    }

    @Override // X.AnonymousClass3HB
    public void APj(AnonymousClass1VM r3, PaymentMethodRow paymentMethodRow) {
        AnonymousClass3HE r1 = this.A02;
        if (r1 == null) {
            return;
        }
        if (!(r1 instanceof AnonymousClass3YH)) {
            AnonymousClass3YG r12 = (AnonymousClass3YG) r1;
            if (C28051Sr.A1s(r3)) {
                r12.A00.A0C.A03(r3, paymentMethodRow);
                return;
            }
            return;
        }
        AnonymousClass3YH r13 = (AnonymousClass3YH) r1;
        if (C28051Sr.A1s(r3)) {
            r13.A01.A01.A0I.A03(r3, paymentMethodRow);
        }
    }
}
