package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.0aR  reason: invalid class name and case insensitive filesystem */
public class C08080aR {
    public C07660Za A00;
    public C07660Za A01;
    public final ImageView A02;

    public C08080aR(ImageView imageView) {
        this.A02 = imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08080aR.A00():void");
    }

    public void A01(int i) {
        if (i != 0) {
            ImageView imageView = this.A02;
            Drawable A012 = AnonymousClass05p.A01(imageView.getContext(), i);
            if (A012 != null) {
                AnonymousClass0WQ.A02(A012);
            }
            imageView.setImageDrawable(A012);
        } else {
            this.A02.setImageDrawable(null);
        }
        A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[Catch:{ all -> 0x0055 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.util.AttributeSet r7, int r8) {
        /*
            r6 = this;
            android.widget.ImageView r3 = r6.A02
            android.content.Context r1 = r3.getContext()
            int[] r0 = X.AnonymousClass0T3.A0A
            X.0TL r4 = X.AnonymousClass0TL.A00(r1, r7, r0, r8)
            android.graphics.drawable.Drawable r0 = r3.getDrawable()     // Catch:{ all -> 0x0055 }
            r5 = -1
            if (r0 != 0) goto L_0x0029
            r1 = 1
            android.content.res.TypedArray r0 = r4.A02     // Catch:{ all -> 0x0055 }
            int r1 = r0.getResourceId(r1, r5)     // Catch:{ all -> 0x0055 }
            if (r1 == r5) goto L_0x002c
            android.content.Context r0 = r3.getContext()     // Catch:{ all -> 0x0055 }
            android.graphics.drawable.Drawable r0 = X.AnonymousClass05p.A01(r0, r1)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002c
            r3.setImageDrawable(r0)     // Catch:{ all -> 0x0055 }
        L_0x0029:
            X.AnonymousClass0WQ.A02(r0)     // Catch:{ all -> 0x0055 }
        L_0x002c:
            r0 = 2
            android.content.res.TypedArray r2 = r4.A02     // Catch:{ all -> 0x0055 }
            boolean r0 = r2.hasValue(r0)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003d
            r0 = 2
            android.content.res.ColorStateList r0 = r4.A01(r0)     // Catch:{ all -> 0x0055 }
            X.AnonymousClass0N2.A1E(r3, r0)     // Catch:{ all -> 0x0055 }
        L_0x003d:
            r0 = 3
            boolean r0 = r2.hasValue(r0)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0051
            r0 = 3
            int r1 = r2.getInt(r0, r5)     // Catch:{ all -> 0x0055 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass0WQ.A00(r1, r0)     // Catch:{ all -> 0x0055 }
            X.AnonymousClass0N2.A1F(r3, r0)     // Catch:{ all -> 0x0055 }
        L_0x0051:
            r2.recycle()
            return
        L_0x0055:
            r1 = move-exception
            android.content.res.TypedArray r0 = r4.A02
            r0.recycle()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08080aR.A02(android.util.AttributeSet, int):void");
    }

    public boolean A03() {
        return Build.VERSION.SDK_INT < 21 || !(this.A02.getBackground() instanceof RippleDrawable);
    }
}
