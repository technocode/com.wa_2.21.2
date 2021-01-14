package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.3Rp  reason: invalid class name and case insensitive filesystem */
public class C72123Rp implements AnonymousClass1RQ {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final AnonymousClass34f A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    @Override // X.AnonymousClass1RQ
    public boolean A4C() {
        return false;
    }

    @Override // X.AnonymousClass1RQ
    public int A4n() {
        return 1;
    }

    @Override // X.AnonymousClass1RQ
    public Integer A7j() {
        return null;
    }

    public C72123Rp(String str, String str2, ImageView imageView, Drawable drawable, Drawable drawable2, int i, int i2, AnonymousClass34f r9) {
        WeakReference weakReference;
        if (imageView != null) {
            weakReference = new WeakReference(imageView);
        } else {
            weakReference = null;
        }
        this.A07 = weakReference;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r9;
    }

    @Override // X.AnonymousClass1RQ
    public int A7F() {
        return this.A00;
    }

    @Override // X.AnonymousClass1RQ
    public int A7H() {
        return this.A01;
    }

    @Override // X.AnonymousClass1RQ
    public String A9c() {
        return this.A06;
    }

    @Override // X.AnonymousClass1RQ
    public String getId() {
        return this.A05;
    }
}
