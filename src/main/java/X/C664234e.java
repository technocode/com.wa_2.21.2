package X;

import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: X.34e  reason: invalid class name and case insensitive filesystem */
public final class C664234e {
    public int A00 = 4;
    public int A01 = Integer.MAX_VALUE;
    public long A02 = 1048576;
    public Drawable A03;
    public Drawable A04;
    public boolean A05 = false;
    public final AnonymousClass02M A06;
    public final C02660Cy A07;
    public final File A08;

    public C664234e(AnonymousClass02M r3, C02660Cy r4, File file) {
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = file;
    }

    public C664334g A00() {
        return new C664334g(this.A06, this.A07, this, this.A01);
    }
}
