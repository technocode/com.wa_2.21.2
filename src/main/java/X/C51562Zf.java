package X;

import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2Zf  reason: invalid class name and case insensitive filesystem */
public class C51562Zf extends AnonymousClass0JW {
    public final AnonymousClass01X A00;
    public final AnonymousClass0CP A01;
    public final WeakReference A02;
    public final List A03;

    public C51562Zf(AnonymousClass0CP r2, AnonymousClass01X r3, TextView textView, List list) {
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = list;
        this.A02 = new WeakReference(textView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ((r1 instanceof java.util.List) != false) goto L_0x0014;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.ref.WeakReference r0 = r4.A02
            java.lang.Object r3 = r0.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x002a
            java.lang.Object r1 = r3.getTag()
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x002a
        L_0x0014:
            java.util.List r0 = r4.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            X.01X r2 = r4.A00
            long r0 = r5.longValue()
            java.lang.String r0 = X.AnonymousClass0FI.A0A(r2, r0)
            r3.setText(r0)
        L_0x0029:
            return
        L_0x002a:
            r1 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51562Zf.A03(java.lang.Object):void");
    }
}
