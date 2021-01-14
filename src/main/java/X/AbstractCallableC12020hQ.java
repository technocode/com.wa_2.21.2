package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.search.verification.client.R;
import java.text.BreakIterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.0hQ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractCallableC12020hQ implements Callable {
    public final C04080Iy A00 = new C04080Iy();

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0040 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: X.0hT */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: android.graphics.Paint */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.2Of] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.2Jj] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.0hn] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        CharSequence subSequence;
        Object r6;
        int length;
        C007003k A0A;
        int length2;
        C007003k A0A2;
        C04080Iy r4 = this.A00;
        if (!r4.A03()) {
            if (this instanceof C12030hR) {
                C12030hR r3 = (C12030hR) this;
                AbstractC007503q r2 = r3.A06;
                int i = r3.A00;
                AnonymousClass01X r8 = r3.A03;
                C48872Oc A002 = C48872Oc.A00(r2, i, r8, r3.A04);
                C04080Iy r62 = ((AbstractCallableC12020hQ) r3).A00;
                r62.A02();
                String str = A002.A01;
                if (str == null) {
                    subSequence = r8.A06(R.string.view_message);
                } else {
                    Context context = r3.A01;
                    CharSequence A02 = AbstractC11890hA.A02(context, C002001d.A1H(str, context, r3.A02.getPaint(), r3.A05), r3.A07, r8);
                    subSequence = A02.subSequence(0, Math.min(200, A02.length()));
                }
                r62.A02();
                String str2 = A002.A03;
                String str3 = A002.A02;
                StringBuilder sb = new StringBuilder();
                String str4 = "";
                String str5 = str2;
                if (str2 == null) {
                    str5 = str4;
                }
                sb.append(str5);
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb2 = new StringBuilder();
                    if (str2 != null) {
                        str4 = "\n";
                    }
                    str4 = AnonymousClass008.A0O(sb2, str4, str3);
                }
                sb.append(str4);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                if (!TextUtils.isEmpty(str3)) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C004302a.A00(r3.A01, R.color.secondary_text));
                    if (str2 == null) {
                        length = 0;
                    } else {
                        length = str2.length();
                    }
                    spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 0);
                }
                r62.A02();
                r62.A02();
                r6 = new C48902Of(A002, subSequence, (SpannableStringBuilder) AbstractC11890hA.A02(r3.A01, spannableStringBuilder, r3.A07, r8));
            } else if (this instanceof C12040hS) {
                C12040hS r32 = (C12040hS) this;
                AnonymousClass01A r5 = r32.A00;
                AbstractC007503q r22 = r32.A01;
                AnonymousClass02N r0 = r22.A0n.A00;
                if (r0 != null) {
                    C007003k A0A3 = r5.A0A(r0);
                    ((AbstractCallableC12020hQ) r32).A00.A02();
                    AnonymousClass02N A0e = C28051Sr.A0e(r22, A0A3);
                    if (A0e == null) {
                        A0A = null;
                    } else {
                        A0A = r5.A0A(A0e);
                    }
                    r6 = new C47742Jj(A0A3, A0A, r22);
                } else {
                    throw null;
                }
            } else if (!(this instanceof C12050hT)) {
                C12010hP r33 = (C12010hP) this;
                C11980hM r23 = r33.A01;
                AnonymousClass01A r63 = r23.A03;
                AnonymousClass02N r1 = r33.A00;
                C007003k A0A4 = r63.A0A(r1);
                AbstractC007503q A022 = r23.A08.A02(r1);
                AnonymousClass0BG A08 = r23.A09.A08(r1);
                AnonymousClass02N A0e2 = C28051Sr.A0e(A022, A0A4);
                if (A0e2 == null) {
                    A0A2 = null;
                } else {
                    A0A2 = r63.A0A(A0e2);
                }
                ((AbstractCallableC12020hQ) r33).A00.A02();
                r6 = new C12250hn(A0A4, A022, A08, A0A2);
            } else {
                C12050hT r34 = (C12050hT) this;
                CharSequence charSequence = r34.A08;
                if (TextUtils.isEmpty(charSequence)) {
                    r6 = "";
                } else {
                    CharSequence A1C = C002001d.A1C(r34.A04, r34.A07, charSequence.toString().replace("\n", " "));
                    Context context2 = r34.A02;
                    List list = r34.A09;
                    AnonymousClass01X r52 = r34.A05;
                    AnonymousClass02R A003 = AbstractC11890hA.A00(context2, A1C, list, AbstractC11890hA.A02, true, r52);
                    C04080Iy r11 = ((AbstractCallableC12020hQ) r34).A00;
                    r11.A02();
                    CharSequence charSequence2 = (CharSequence) A003.A00;
                    Object obj = A003.A01;
                    if (obj != null) {
                        List list2 = (List) obj;
                        if (charSequence2 == null) {
                            length2 = 0;
                        } else {
                            length2 = charSequence2.length();
                        }
                        C06200Se r12 = new C06200Se(1, 460, length2);
                        if (TextUtils.isEmpty(charSequence2) || list2.isEmpty()) {
                            r6 = C002001d.A1I(charSequence2, context2, r34.A03, r12, r34.A06);
                        } else {
                            Paint paint = r34.A03;
                            float measureText = paint.measureText(charSequence2, 0, charSequence2.length());
                            float f = (float) (r34.A00 * r34.A01);
                            if (measureText <= f) {
                                r6 = C002001d.A1I(charSequence2, context2, paint, r12, r34.A06);
                            } else {
                                BreakIterator A023 = AnonymousClass1YB.A02(r52);
                                A023.setText(charSequence2.toString());
                                List A004 = C12050hT.A00(list2, 20, A023, charSequence2.length());
                                r6 = new SpannableStringBuilder();
                                r34.A01(charSequence2, A004, r6);
                                r11.A02();
                                int i2 = 10;
                                while (paint.measureText((CharSequence) r6, 0, r6.length()) <= f && r6.length() < charSequence2.length()) {
                                    r11.A02();
                                    r6.clear();
                                    A004 = C12050hT.A00(A004, i2, A023, charSequence2.length());
                                    r34.A01(charSequence2, A004, r6);
                                    r11.A02();
                                    i2 += 10;
                                }
                            }
                        }
                    } else {
                        throw null;
                    }
                }
            }
            if (!r4.A03()) {
                return r6;
            }
        }
        throw new C14750mp();
    }
}
