package com.whatsapp;

import X.AbstractC16300pa;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02U;
import X.AnonymousClass0L2;
import X.AnonymousClass0Z6;
import X.AnonymousClass1M5;
import X.AnonymousClass1MU;
import X.AnonymousClass1t2;
import X.AnonymousClass2ZA;
import X.AnonymousClass31y;
import X.C014308b;
import X.C28351Tz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

public class MentionPickerView extends AnonymousClass2ZA {
    public RecyclerView A00;
    public AnonymousClass1MU A01;
    public AnonymousClass1t2 A02;
    public AnonymousClass02U A03;
    public UserJid A04;
    public boolean A05;
    public final AnonymousClass01I A06 = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A07 = AnonymousClass0Z6.A00();
    public final AnonymousClass01A A08 = AnonymousClass01A.A00();
    public final C014308b A09 = C014308b.A00();
    public final AnonymousClass0L2 A0A = AnonymousClass0L2.A01();
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();
    public final AnonymousClass01T A0C = AnonymousClass01T.A00();
    public final AnonymousClass31y A0D = AnonymousClass31y.A00();

    public MentionPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A03() {
        ArrayList arrayList = new ArrayList();
        AnonymousClass02U r1 = this.A03;
        if (r1 != null) {
            Iterator it = this.A0C.A01(r1).A04().iterator();
            while (true) {
                C28351Tz r12 = (C28351Tz) it;
                if (!r12.hasNext()) {
                    break;
                }
                AnonymousClass01I r0 = this.A06;
                UserJid userJid = ((AnonymousClass1M5) r12.next()).A03;
                if (!r0.A09(userJid)) {
                    arrayList.add(this.A08.A0A(userJid));
                }
            }
        }
        AnonymousClass1t2 r02 = this.A02;
        r02.A06 = arrayList;
        ((AbstractC16300pa) r02).A01.A00();
    }

    @Override // X.AnonymousClass2ZA
    public View getContentView() {
        return this.A00;
    }

    public void setVisibilityChangeListener(AnonymousClass1MU r1) {
        this.A01 = r1;
    }
}
