package X;

import java.text.Format;
import java.text.SimpleDateFormat;

/* renamed from: X.2dv  reason: invalid class name and case insensitive filesystem */
public class C53842dv implements AbstractC48962Ol {
    @Override // X.AbstractC48962Ol
    public Format A6U(AnonymousClass01X r4) {
        try {
            return new SimpleDateFormat("LLLL yyyy", r4.A0I());
        } catch (IllegalArgumentException unused) {
            return new SimpleDateFormat("MMMM yyyy", r4.A0I());
        }
    }
}
