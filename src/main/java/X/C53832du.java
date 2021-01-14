package X;

import android.icu.text.DisplayContext;
import android.icu.text.SimpleDateFormat;
import java.text.Format;

/* renamed from: X.2du  reason: invalid class name and case insensitive filesystem */
public class C53832du implements AbstractC48962Ol {
    @Override // X.AbstractC48962Ol
    public Format A6U(AnonymousClass01X r4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL yyyy", r4.A0I());
        simpleDateFormat.setContext(DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
        return simpleDateFormat;
    }
}
