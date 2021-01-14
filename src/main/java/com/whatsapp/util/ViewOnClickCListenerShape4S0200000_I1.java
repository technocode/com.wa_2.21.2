package com.whatsapp.util;

import X.AbstractC48882Od;
import X.AbstractView$OnClickListenerC08330av;
import X.C40721tj;
import X.C53822dt;
import X.C59592ny;
import android.view.View;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

public class ViewOnClickCListenerShape4S0200000_I1 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape4S0200000_I1(C40721tj r2, View.OnClickListener onClickListener) {
        this.A02 = 3;
        this.A00 = r2;
        this.A01 = onClickListener;
    }

    public ViewOnClickCListenerShape4S0200000_I1(C53822dt r2, C59592ny r3) {
        this.A02 = 28;
        this.A00 = r2;
        this.A01 = r3;
    }

    public ViewOnClickCListenerShape4S0200000_I1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04c4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x073f, code lost:
        if (r6.A02.isChecked() == false) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x094e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x094f, code lost:
        if (r1 != null) goto L_0x0951;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0954, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0957, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x095b, code lost:
        throw r0;
     */
    @Override // X.AbstractView$OnClickListenerC08330av
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.view.View r21) {
        /*
        // Method dump skipped, instructions count: 2572
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1.A00(android.view.View):void");
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void onClick(View view) {
        C59592ny r1;
        AbstractC48882Od r0;
        if (28 - this.A02 != 0) {
            super.onClick(view);
            return;
        }
        MediaGalleryFragmentBase mediaGalleryFragmentBase = ((C53822dt) this.A00).A01;
        if (!mediaGalleryFragmentBase.A0w() || (r0 = (r1 = (C59592ny) this.A01).A04) == null) {
            super.onClick(view);
        } else {
            mediaGalleryFragmentBase.A0t(r0, r1);
        }
    }
}
