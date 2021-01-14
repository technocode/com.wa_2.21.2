package X;

import android.view.ViewTreeObserver;
import com.whatsapp.companiondevice.optin.OptInActivity;

/* renamed from: X.2FO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2FO implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ OptInActivity A00;

    public /* synthetic */ AnonymousClass2FO(OptInActivity optInActivity) {
        this.A00 = optInActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if ((!r5.A03.canScrollVertically(1)) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r6 = this;
            com.whatsapp.companiondevice.optin.OptInActivity r5 = r6.A00
            android.widget.ScrollView r4 = r5.A03
            r3 = 0
            android.view.View r0 = r4.getChildAt(r3)
            if (r0 == 0) goto L_0x0020
            int r0 = r0.getHeight()
            int r2 = r4.getHeight()
            int r1 = r4.getPaddingTop()
            int r1 = r1 + r0
            int r0 = r4.getPaddingBottom()
            int r0 = r0 + r1
            if (r2 >= r0) goto L_0x0020
            r3 = 1
        L_0x0020:
            r2 = 0
            if (r3 == 0) goto L_0x002d
            android.widget.ScrollView r0 = r5.A03
            r1 = 1
            boolean r0 = r0.canScrollVertically(r1)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            android.view.View r0 = r5.A02
            if (r1 != 0) goto L_0x0033
            r2 = 4
        L_0x0033:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FO.onGlobalLayout():void");
    }
}
