package X;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.0U9  reason: invalid class name */
public final class AnonymousClass0U9 implements AnonymousClass0U1 {
    public final LocaleList A00;

    public AnonymousClass0U9(LocaleList localeList) {
        this.A00 = localeList;
    }

    @Override // X.AnonymousClass0U1
    public Locale A4c(int i) {
        return this.A00.get(i);
    }

    @Override // X.AnonymousClass0U1
    public Object A7A() {
        return this.A00;
    }

    @Override // X.AnonymousClass0U1
    public String AQc() {
        return this.A00.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.A00.equals(((AnonymousClass0U1) obj).A7A());
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
