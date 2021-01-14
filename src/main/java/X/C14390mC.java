package X;

import android.text.Spannable;
import java.util.Comparator;

/* renamed from: X.0mC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C14390mC implements Comparator {
    public final /* synthetic */ Spannable A00;

    public /* synthetic */ C14390mC(Spannable spannable) {
        this.A00 = spannable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Spannable spannable = this.A00;
        if (spannable.getSpanStart(obj) < spannable.getSpanStart(obj2)) {
            return -1;
        }
        if (spannable.getSpanStart(obj) <= spannable.getSpanStart(obj2) && spannable.getSpanEnd(obj) >= spannable.getSpanEnd(obj2)) {
            return spannable.getSpanEnd(obj) > spannable.getSpanEnd(obj2) ? -1 : 0;
        }
        return 1;
    }
}
