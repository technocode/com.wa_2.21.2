package com.whatsapp.emoji.search;

import X.AbstractC16300pa;
import X.AbstractC48682Nh;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass2Q9;
import X.C02590Cr;
import X.C03930Ii;
import X.C53452dI;
import X.C53492dM;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InterceptingEditText;

public class EmojiSearchContainer extends FrameLayout {
    public Activity A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public InterceptingEditText A04;
    public AnonymousClass01X A05;
    public C02590Cr A06;
    public C03930Ii A07;
    public C53452dI A08;
    public C53492dM A09;
    public AbstractC48682Nh A0A;
    public AnonymousClass022 A0B;
    public String A0C;
    public boolean A0D;

    public EmojiSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A00(String str) {
        C53492dM r0 = this.A09;
        if (r0 != null && r0.A02) {
            this.A02.setVisibility(8);
            this.A01.setVisibility(0);
            C53452dI r3 = this.A08;
            AnonymousClass2Q9 A002 = this.A09.A00(str, true, false);
            synchronized (r3) {
                AnonymousClass2Q9 r1 = r3.A00;
                if (r1 != null) {
                    r1.A00(null);
                }
                r3.A00 = A002;
                A002.A00(r3);
                ((AbstractC16300pa) r3).A01.A00();
            }
            this.A0C = str;
        }
    }
}
