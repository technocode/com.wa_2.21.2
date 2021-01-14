package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.google.android.search.verification.client.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0hA  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC11890hA {
    public static Map A00 = new ConcurrentHashMap();
    public static final AbstractC11890hA A01 = new C12380i0();
    public static final AbstractC11890hA A02 = new C12390i1();
    public static final AbstractC11890hA A03 = new C12400i2();
    public static final AbstractC11890hA A04 = new C12370hz();

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        if (r5 != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f4, code lost:
        if (r0 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        if ((r14 instanceof android.text.Spannable) == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fa, code lost:
        r0 = (android.text.Spannable) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        r28.A03(r25, r0, r18, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
        r0 = new android.text.SpannableStringBuilder(r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass02R A00(android.content.Context r25, java.lang.CharSequence r26, java.util.List r27, X.AbstractC11890hA r28, boolean r29, X.AnonymousClass01X r30) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC11890hA.A00(android.content.Context, java.lang.CharSequence, java.util.List, X.0hA, boolean, X.01X):X.02R");
    }

    public static CharSequence A01(Context context, CharSequence charSequence, List list, AnonymousClass01X r8) {
        Object obj = A00(context, charSequence, list, A02, true, r8).A00;
        if (obj != null) {
            return (CharSequence) obj;
        }
        throw null;
    }

    public static CharSequence A02(Context context, CharSequence charSequence, List list, AnonymousClass01X r8) {
        return (CharSequence) A00(context, charSequence, list, A04, false, r8).A00;
    }

    public void A03(Context context, Spannable spannable, int i, int i2) {
        if (this instanceof C12400i2) {
            return;
        }
        if (this instanceof C12390i1) {
            spannable.setSpan(new C29261Xt(context), i, i2, 33);
            spannable.setSpan(new ForegroundColorSpan(C004302a.A00(context, R.color.fts_search_highlight_text)), i, i2, 33);
        } else if (!(this instanceof C12380i0)) {
            spannable.setSpan(new ForegroundColorSpan(C004302a.A00(context, R.color.search_text_highlight)), i, i2, 33);
        } else {
            spannable.setSpan(new BackgroundColorSpan(C004302a.A00(context, R.color.conversation_search_highlight)), i, i2, 33);
            spannable.setSpan(new ForegroundColorSpan(C004302a.A00(context, R.color.conversation_search_highlight_text)), i, i2, 33);
        }
    }
}
