package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0hT  reason: invalid class name and case insensitive filesystem */
public class C12050hT extends AbstractCallableC12020hQ {
    public final int A00;
    public final int A01 = 3;
    public final Context A02;
    public final Paint A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass01X A05;
    public final C02590Cr A06;
    public final AnonymousClass022 A07;
    public final CharSequence A08;
    public final List A09;

    public C12050hT(Context context, Paint paint, int i, CharSequence charSequence, List list, C02590Cr r7, AnonymousClass03P r8, AnonymousClass01X r9, AnonymousClass022 r10) {
        this.A02 = context;
        this.A03 = paint;
        this.A00 = i;
        this.A08 = charSequence;
        this.A09 = list;
        this.A06 = r7;
        this.A04 = r8;
        this.A05 = r9;
        this.A07 = r10;
    }

    public static List A00(List list, int i, BreakIterator breakIterator, int i2) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(list.size(), 5);
        for (int i3 = 0; i3 < min; i3++) {
            AnonymousClass02R r1 = (AnonymousClass02R) list.get(i3);
            Object obj = r1.A00;
            if (obj != null) {
                Object obj2 = r1.A01;
                if (obj2 != null) {
                    int max = Math.max(0, breakIterator.preceding(Math.max(0, ((Number) obj).intValue() - i)));
                    int following = breakIterator.following(Math.min(i2, ((Number) obj2).intValue() + i)) - 1;
                    if (following < 0) {
                        following = i2;
                    }
                    AnonymousClass02R r9 = new AnonymousClass02R(Integer.valueOf(max), Integer.valueOf(following));
                    if (arrayList.size() == 0) {
                        arrayList.add(r9);
                    } else {
                        int size = arrayList.size() - 1;
                        AnonymousClass02R r10 = (AnonymousClass02R) arrayList.get(size);
                        Object obj3 = r9.A00;
                        if (obj3 != null) {
                            int intValue = ((Number) obj3).intValue();
                            Object obj4 = r9.A01;
                            if (obj4 != null) {
                                int intValue2 = ((Number) obj4).intValue();
                                Object obj5 = r10.A00;
                                if (obj5 != null) {
                                    int intValue3 = ((Number) obj5).intValue();
                                    Object obj6 = r10.A01;
                                    if (obj6 != null) {
                                        int intValue4 = ((Number) obj6).intValue();
                                        if ((intValue > intValue3 || intValue3 > intValue2) && (intValue3 > intValue || intValue > intValue4)) {
                                            arrayList.add(r9);
                                        } else {
                                            int min2 = Math.min(intValue, intValue3);
                                            int max2 = Math.max(intValue2, intValue4);
                                            arrayList.remove(size);
                                            arrayList.add(new AnonymousClass02R(Integer.valueOf(min2), Integer.valueOf(max2)));
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return arrayList;
    }

    public final void A01(CharSequence charSequence, List list, SpannableStringBuilder spannableStringBuilder) {
        long length = (long) (charSequence.length() - 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass02R r4 = (AnonymousClass02R) it.next();
            super.A00.A02();
            Object obj = r4.A00;
            if (!(obj == null || ((Number) obj).intValue() == 0)) {
                if (spannableStringBuilder.length() == 0) {
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append("…");
                } else if (!"…".equals(String.valueOf(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1)))) {
                    if (!Character.isWhitespace(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1))) {
                        spannableStringBuilder.append(" ");
                    }
                    spannableStringBuilder.append("…");
                    spannableStringBuilder.append(" ");
                }
            }
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                Object obj2 = r4.A01;
                if (obj2 != null) {
                    int intValue2 = ((Number) obj2).intValue();
                    spannableStringBuilder.append(charSequence.subSequence(intValue, intValue2));
                    if (((long) intValue2) < length) {
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.append("…");
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }
}
