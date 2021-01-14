package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.0f5  reason: invalid class name and case insensitive filesystem */
public final class C10720f5 extends AnonymousClass0JW {
    public final C52122ac A00;
    public final AnonymousClass02N A01;
    public final AnonymousClass02J A02;
    public final WeakReference A03;

    public C10720f5(AnonymousClass02N r2, Context context, AnonymousClass02J r4, C52122ac r5) {
        this.A03 = new WeakReference(context);
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        this.A00.A00.A01((Drawable) obj);
    }
}
