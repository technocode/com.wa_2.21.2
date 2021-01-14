package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.01X  reason: invalid class name */
public class AnonymousClass01X {
    public static final boolean A0B;
    public static volatile AnonymousClass01X A0C;
    public static volatile boolean A0D;
    public Context A00;
    public C05300Nz A01;
    public DateFormat A02;
    public DateFormat A03;
    public Locale A04;
    public Locale A05;
    public boolean A06;
    public final AnonymousClass00G A07;
    public final AnonymousClass00D A08;
    public final Object A09 = new Object();
    public final Set A0A = new HashSet();

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 26) {
            z = true;
        }
        A0B = z;
    }

    public AnonymousClass01X(AnonymousClass00G r2, AnonymousClass00D r3) {
        this.A07 = r2;
        this.A08 = r3;
        Context A012 = A01();
        this.A00 = A012;
        Locale A0I = AnonymousClass1VY.A0I(A012.getResources().getConfiguration());
        this.A05 = A0I;
        this.A04 = A0I;
        C001801b.A1J();
    }

    public static AnonymousClass01X A00() {
        if (A0C == null) {
            synchronized (AnonymousClass01X.class) {
                if (A0C == null) {
                    A0C = new AnonymousClass01X(AnonymousClass00G.A01, AnonymousClass00D.A00());
                }
            }
        }
        return A0C;
    }

    public Context A01() {
        Context baseContext;
        Context baseContext2 = this.A07.A00.getBaseContext();
        while ((baseContext2 instanceof ContextWrapper) && (baseContext = ((ContextWrapper) baseContext2).getBaseContext()) != null) {
            baseContext2 = baseContext;
        }
        return baseContext2;
    }

    public final C05300Nz A02() {
        C05300Nz r0;
        synchronized (this.A09) {
            if (this.A01 == null) {
                C04600Kz r3 = new C04600Kz("WhatsAppLocale/setDerivedFieldsUnderLock/fieldCreationTimer");
                this.A01 = new C05300Nz(this.A00, this.A04);
                r3.A01();
            }
            r0 = this.A01;
        }
        return r0;
    }

    public String A03() {
        String country = A0I().getCountry();
        if (country != null && AbstractC002201f.A03.matcher(country).matches()) {
            return country;
        }
        StringBuilder sb = new StringBuilder("verifynumber/requestcode/invalid-country '");
        sb.append(country);
        sb.append("'");
        Log.i(sb.toString());
        return "ZZ";
    }

    public String A04() {
        String language = A0I().getLanguage();
        if (language != null && AbstractC002201f.A02.matcher(language).matches()) {
            return language;
        }
        StringBuilder sb = new StringBuilder("verifynumber/requestcode/invalid-language '");
        sb.append(language);
        sb.append("'");
        Log.i(sb.toString());
        return "zz";
    }

    public String A05(int i) {
        AnonymousClass0UA r0 = A02().A02.A00;
        if (r0 != null) {
            return AnonymousClass0O0.A02(r0, i);
        }
        Log.e("CldrResources/getString: CLDR data not loaded");
        return "";
    }

    public String A06(int i) {
        C05300Nz A022 = A02();
        if (A022.A07) {
            return this.A00.getResources().getString(i);
        }
        String A023 = A022.A03.A02(i, false, -1);
        return A023 == null ? this.A00.getResources().getString(i) : A023;
    }

    public String A07(int i) {
        return this.A00.getResources().getString(i);
    }

    public String A08(int i, long j) {
        C05300Nz A022 = A02();
        int i2 = 1;
        if (A022.A07) {
            if (j != 1) {
                i2 = 2;
            }
            return this.A00.getResources().getQuantityString(i, i2);
        }
        String A023 = A022.A03.A02(i, true, Long.valueOf(j));
        if (A023 != null) {
            return A023;
        }
        return this.A00.getResources().getQuantityString(i, (int) j);
    }

    public String A09(int i, long j, Object... objArr) {
        return String.format(A0I(), A02().A02.A03(i, Long.valueOf(j)), objArr);
    }

    public String A0A(int i, long j, Object... objArr) {
        return String.format(A0I(), A08(i, j), objArr);
    }

    public String A0B(int i, TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            return A06(resourceId);
        }
        return null;
    }

    public String A0C(int i, Object... objArr) {
        return String.format(A0I(), A05(i), objArr);
    }

    public String A0D(int i, Object... objArr) {
        return String.format(A0I(), A06(i), objArr);
    }

    public String A0E(String str) {
        C06570Tw r1 = A02().A01;
        AbstractC06520Tq r0 = r1.A01;
        if (str == null) {
            return null;
        }
        return r1.A03(str, r0).toString();
    }

    public String A0F(String str) {
        C06570Tw r2 = A02().A01;
        AbstractC06520Tq r1 = C06510Tp.A04;
        if (r2 == null) {
            throw null;
        } else if (str != null) {
            return r2.A03(str, r1).toString();
        } else {
            return null;
        }
    }

    public NumberFormat A0G() {
        return (NumberFormat) A02().A04.clone();
    }

    public NumberFormat A0H() {
        return (NumberFormat) A02().A05.clone();
    }

    public Locale A0I() {
        return AnonymousClass1VY.A0I(this.A00.getResources().getConfiguration());
    }

    public void A0J() {
        if (this.A06) {
            Locale.setDefault(this.A04);
            A0L();
        }
    }

    public final void A0K() {
        synchronized (this.A09) {
            this.A01 = null;
        }
        this.A03 = null;
        this.A02 = null;
        C001801b.A1J();
    }

    public final void A0L() {
        if (!this.A00.getResources().getConfiguration().locale.equals(this.A04)) {
            if (A0B) {
                Context A012 = A01();
                this.A00 = A012;
                Resources resources = A012.getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.locale = this.A04;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            } else {
                Configuration configuration2 = new Configuration();
                configuration2.setLocale(this.A04);
                this.A00 = A01().createConfigurationContext(configuration2);
            }
            A0K();
        }
    }

    public boolean A0M() {
        return !A02().A06;
    }

    public String[] A0N(int[] iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = A06(iArr[i]);
        }
        return strArr;
    }
}
