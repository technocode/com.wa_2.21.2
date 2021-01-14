package com.facebook.redex;

import X.AnonymousClass3BR;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.npci.commonlibrary.PinFragment;

public class ViewOnClickEBaseShape0S2300000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05 = 0;

    public ViewOnClickEBaseShape0S2300000_I1(AnonymousClass3BR r2, String str, String str2, Drawable drawable, Drawable drawable2) {
        this.A00 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = drawable;
        this.A02 = drawable2;
    }

    public ViewOnClickEBaseShape0S2300000_I1(PinFragment pinFragment, AnonymousClass3BR r3, String str, String str2, Drawable drawable, Drawable drawable2, int i) {
        this.A00 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = drawable;
        this.A02 = drawable2;
    }

    public void onClick(View view) {
        String str;
        Drawable drawable;
        AnonymousClass3BR r1 = (AnonymousClass3BR) this.A00;
        if (r1.AQg()) {
            str = this.A03;
            drawable = (Drawable) this.A01;
        } else {
            str = this.A04;
            drawable = (Drawable) this.A02;
        }
        r1.AQf(str, drawable, this, 0, true, true);
    }
}
