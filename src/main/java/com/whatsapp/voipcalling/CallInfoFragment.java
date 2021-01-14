package com.whatsapp.voipcalling;

import X.AbstractC16300pa;
import X.ActivityC004902h;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0L2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QY;
import X.AnonymousClass0YX;
import X.AnonymousClass31y;
import X.AnonymousClass3TS;
import X.C000300f;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C06470Tj;
import X.C674138m;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Map;

public class CallInfoFragment extends WaFragment {
    public Toolbar A00;
    public AnonymousClass0YX A01;
    public AnonymousClass3TS A02;
    public final View.OnClickListener A03;
    public final AnonymousClass01I A04 = AnonymousClass01I.A00();
    public final C000300f A05 = C000300f.A00();
    public final AnonymousClass01A A06 = AnonymousClass01A.A00();
    public final C014308b A07 = C014308b.A00();
    public final AnonymousClass0L2 A08 = AnonymousClass0L2.A01();
    public final AnonymousClass01X A09 = AnonymousClass01X.A00();
    public final AnonymousClass31y A0A = AnonymousClass31y.A00();

    public CallInfoFragment(View.OnClickListener onClickListener) {
        this.A03 = onClickListener;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.voip_call_info_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) AnonymousClass0Q7.A0D(inflate, R.id.toolbar);
        this.A00 = toolbar;
        AnonymousClass01X r4 = this.A09;
        toolbar.setTitle(r4.A06(R.string.voip_call_info_fragment_title));
        this.A00.setNavigationIcon(new C06470Tj(r4, C004302a.A03(A0A(), R.drawable.ic_back)));
        this.A00.setNavigationOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 23));
        this.A01 = this.A08.A03(A00());
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0Q7.A0D(inflate, R.id.participant_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        AnonymousClass3TS r0 = new AnonymousClass3TS(this);
        this.A02 = r0;
        recyclerView.setAdapter(r0);
        A0n();
        return inflate;
    }

    public void A0n() {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.w("MaximizedParticipantVideoDialogFragment can not get callInfo");
            ActivityC004902h A0A2 = A0A();
            if (A0A2 != null) {
                A0A2.onBackPressed();
                return;
            }
            return;
        }
        Map map = callInfo.participants;
        if (map.size() <= 2) {
            ActivityC004902h A0A3 = A0A();
            if (A0A3 != null) {
                A0A3.onBackPressed();
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (!((AnonymousClass0QY) entry.getValue()).A0D) {
                C007003k A0A4 = this.A06.A0A((AnonymousClass02N) entry.getKey());
                if (((AnonymousClass0QY) entry.getValue()).A01 == 1) {
                    arrayList.add(new C674138m(1, A0A4));
                } else {
                    arrayList2.add(new C674138m(3, A0A4));
                }
            }
        }
        if (arrayList.size() > 0) {
            arrayList.add(0, new C674138m(this.A09.A0A(R.plurals.voip_call_info_joined_participants_title, (long) arrayList.size(), Integer.valueOf(arrayList.size()))));
        }
        arrayList2.add(0, new C674138m(this.A09.A0A(R.plurals.voip_call_info_invited_participants_title, (long) arrayList2.size(), Integer.valueOf(arrayList2.size()))));
        arrayList2.add(1, new C674138m(this.A03));
        arrayList2.add(0, new C674138m());
        arrayList.addAll(arrayList2);
        AnonymousClass3TS r0 = this.A02;
        r0.A00 = arrayList;
        ((AbstractC16300pa) r0).A01.A00();
    }
}
