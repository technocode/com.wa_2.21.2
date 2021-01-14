package X;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.0mT  reason: invalid class name and case insensitive filesystem */
public class C14550mT {
    public int A00;
    public PendingIntent A01;
    public IconCompat A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Bundle A07;
    public final C14630mc[] A08;
    public final C14630mc[] A09;

    public C14550mT(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(IconCompat.A03(null, "", i), charSequence, pendingIntent, new Bundle(), null, null, 0, true);
    }

    public C14550mT(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C14630mc[] r8, C14630mc[] r9, int i, boolean z) {
        this.A05 = true;
        this.A02 = iconCompat;
        if (iconCompat != null && iconCompat.A05() == 2) {
            this.A00 = iconCompat.A04();
        }
        this.A03 = AnonymousClass03E.A00(charSequence);
        this.A01 = pendingIntent;
        this.A07 = bundle == null ? new Bundle() : bundle;
        this.A09 = r8;
        this.A08 = r9;
        this.A04 = true;
        this.A06 = i;
        this.A05 = z;
    }

    public IconCompat A00() {
        int i;
        IconCompat iconCompat = this.A02;
        if (iconCompat != null || (i = this.A00) == 0) {
            return iconCompat;
        }
        IconCompat A032 = IconCompat.A03(null, "", i);
        this.A02 = A032;
        return A032;
    }
}
