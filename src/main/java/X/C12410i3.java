package X;

import java.text.Collator;
import java.util.Locale;

/* renamed from: X.0i3  reason: invalid class name and case insensitive filesystem */
public final class C12410i3 extends ThreadLocal {
    public final /* synthetic */ Locale A00;

    public C12410i3(Locale locale) {
        this.A00 = locale;
    }

    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        Collator instance = Collator.getInstance(this.A00);
        instance.setDecomposition(1);
        instance.setStrength(0);
        return instance;
    }
}
