package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.format.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.0Nz  reason: invalid class name and case insensitive filesystem */
public final class C05300Nz {
    public boolean A00;
    public final C06570Tw A01;
    public final AnonymousClass0O0 A02;
    public final C04700Lk A03;
    public final NumberFormat A04;
    public final NumberFormat A05;
    public final boolean A06;
    public final boolean A07;

    public C05300Nz(Context context, Locale locale) {
        C06570Tw r0;
        this.A06 = C06560Tv.A00(locale) != 1 ? false : true;
        this.A07 = AbstractC002201f.A0A(locale);
        if (Build.VERSION.SDK_INT >= 21 && "sr".equals(locale.getLanguage())) {
            locale.getScript();
        }
        boolean z = false;
        this.A00 = (AbstractC002201f.A00(locale) == 0 || DateFormat.is24HourFormat(context)) ? true : z;
        boolean z2 = this.A06;
        AbstractC06520Tq r1 = C06570Tw.A05;
        if (r1 != r1) {
            r0 = new C06570Tw(z2, r1);
        } else if (z2) {
            r0 = C06570Tw.A04;
        } else {
            r0 = C06570Tw.A03;
        }
        this.A01 = r0;
        this.A05 = NumberFormat.getPercentInstance(locale);
        this.A04 = NumberFormat.getInstance(locale);
        AnonymousClass0O0.A06 = AnonymousClass01X.A0D;
        this.A02 = new AnonymousClass0O0(context, context.getResources(), locale);
        C04700Lk.A05 = AnonymousClass01X.A0D;
        Resources resources = context.getResources();
        AnonymousClass0O0 r02 = this.A02;
        this.A03 = new C04700Lk(context, resources, r02.A02, r02.A01);
    }
}
