package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.36A  reason: invalid class name */
public final class AnonymousClass36A extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        return BreakIterator.getWordInstance((Locale) AnonymousClass1YB.A01.get());
    }
}
