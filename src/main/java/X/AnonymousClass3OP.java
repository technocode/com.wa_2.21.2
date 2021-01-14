package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.emoji.EmojiDescriptor;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3OP  reason: invalid class name */
public abstract class AnonymousClass3OP extends AnonymousClass314 {
    public AnonymousClass02R A00;
    public TextEmojiLabel A01;
    public AnonymousClass2I3 A02;
    public C12050hT A03;
    public C12040hS A04;
    public CharSequence A05;
    public final int A06;
    public final int A07;
    public final AnonymousClass01I A08;
    public final AnonymousClass01A A09;
    public final C014308b A0A;
    public final C09030cB A0B;
    public final C09610dF A0C;
    public final AnonymousClass03P A0D;
    public final AnonymousClass00S A0E;
    public final AnonymousClass01X A0F;
    public final C02590Cr A0G;
    public final AnonymousClass022 A0H;
    public final AnonymousClass31y A0I;

    public abstract CharSequence A01(AbstractC007503q v, C007003k v2);

    public AnonymousClass3OP(Context context, AnonymousClass00S r4, AnonymousClass01I r5, C02590Cr r6, C09610dF r7, AnonymousClass01A r8, AnonymousClass03P r9, C014308b r10, AnonymousClass01X r11, AnonymousClass31y r12, C09030cB r13, AnonymousClass022 r14) {
        super(context);
        boolean z;
        this.A0E = r4;
        this.A08 = r5;
        this.A0G = r6;
        this.A0C = r7;
        this.A09 = r8;
        this.A0D = r9;
        this.A0A = r10;
        this.A0F = r11;
        this.A0I = r12;
        this.A0B = r13;
        this.A0H = r14;
        this.A06 = C004302a.A00(context, R.color.list_item_sub_title);
        this.A07 = C004302a.A00(context, R.color.list_item_title);
        if (!(this instanceof C74953bq)) {
            z = this instanceof C74883bj;
        } else {
            z = true;
        }
        if (!z) {
            A00();
        }
    }

    public CharSequence A02(AbstractC007503q r11, List list) {
        String A0u;
        String str;
        if (this instanceof C73863Zc) {
            C05490Ot r112 = (C05490Ot) r11;
            if (!(((C73863Zc) this) instanceof C74943bp)) {
                String str2 = "";
                if (r112.A0A().A00 != null) {
                    AnonymousClass1XN r1 = r112.A0A().A00;
                    if (!TextUtils.isEmpty(r1.A00)) {
                        str2 = r1.A00;
                    }
                    if (TextUtils.isEmpty(r112.A0D())) {
                        return str2;
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("*");
                    A0S.append(r112.A0D());
                    A0S.append("*");
                    A0S.append("\n");
                    A0S.append("\n");
                    A0S.append(str2);
                    return A0S.toString();
                } else if (r112.A0u() != null) {
                    return r112.A0u();
                } else {
                    return str2;
                }
            } else {
                if (r112.A0u() == null) {
                    A0u = "";
                } else {
                    A0u = r112.A0u();
                }
                if (list == null || "".equals(A0u)) {
                    return A0u;
                }
                String str3 = C64192xm.A00(r112).A02;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.isEmpty() || !A0u.contains(str3)) {
                    return A0u;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (str3.contains((String) it.next())) {
                        int indexOf = A0u.indexOf(str3);
                        if (indexOf != 0 && indexOf != A0u.length() - str3.length()) {
                            return A0u;
                        }
                        String[] strArr = {r112.A04, r112.A02, AnonymousClass2IW.A00(str3)};
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            int i = 0;
                            while (true) {
                                String str5 = strArr[i];
                                if (str5 != null && str5.contains(str4)) {
                                    return A0u.replace(str3, "");
                                }
                                i++;
                                if (i >= 3) {
                                }
                            }
                        }
                        return A0u;
                    }
                }
                return A0u;
            }
        } else if (this instanceof AnonymousClass3Za) {
            AnonymousClass3Za r2 = (AnonymousClass3Za) this;
            AnonymousClass0M3 r113 = (AnonymousClass0M3) r11;
            AnonymousClass1XN r12 = r113.A0A().A00;
            if (r12 != null && !TextUtils.isEmpty(r12.A00)) {
                return r12.A00;
            }
            String A0v = r113.A0v();
            if (A0v == null) {
                return r2.getDefaultMessageText();
            }
            return A0v;
        } else if (!(((AnonymousClass3ZW) this) instanceof C74953bq)) {
            return "";
        } else {
            AbstractC02860Dt r114 = (AbstractC02860Dt) r11;
            if (!(r114 instanceof C02850Ds) || (str = ((C02850Ds) r114).A03) == null) {
                return "";
            }
            return str;
        }
    }

    public void A03(C007003k r7, C007003k r8, AbstractC007503q r9, List list) {
        AnonymousClass02R r0;
        this.A00 = new AnonymousClass02R(Boolean.TRUE, r8);
        this.A02.A01(r7, list, AbstractC11890hA.A02);
        this.A02.A00.A02(r7);
        setTitleColorBasedOnQuery(list);
        if (!(this instanceof AnonymousClass3Za)) {
            AnonymousClass01X r5 = this.A0F;
            AnonymousClass00S r4 = this.A0E;
            r0 = new AnonymousClass02R(C002001d.A1e(r5, r4.A06(r9.A0E), false), C002001d.A1e(r5, r4.A06(r9.A0E), true));
        } else {
            r0 = null;
        }
        if (r0 != null) {
            AnonymousClass2I3 r3 = this.A02;
            r3.A01.A01.setText((CharSequence) r0.A00);
            r3.A01.A01.setContentDescription((CharSequence) r0.A01);
            this.A02.A01.A01.setVisibility(0);
        } else {
            this.A02.A01.A01.setVisibility(8);
        }
        A05(r9, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1 == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AbstractC007503q r7, java.util.List r8) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OP.A04(X.03q, java.util.List):void");
    }

    public final void A05(AbstractC007503q r5, List list) {
        AnonymousClass02R r2 = this.A00;
        if (r2 != null && Boolean.TRUE.equals(r2.A00) && this.A05 != null) {
            CharSequence A0k = C28051Sr.A0k(AbstractC11890hA.A01(getContext(), A01(r5, (C007003k) r2.A01), list, this.A0F), this.A05);
            this.A01.setPlaceholder(0);
            if (TextUtils.isEmpty(A0k)) {
                this.A01.setVisibility(8);
                return;
            }
            this.A01.setVisibility(0);
            this.A01.A02(A0k);
        }
    }

    public final void A06(AbstractC007503q r14, List list, CharSequence charSequence) {
        this.A03 = new C12050hT(getContext(), this.A01.getPaint(), ((View) this.A01.getParent()).getMeasuredWidth(), charSequence, list, this.A0G, this.A0D, this.A0F, this.A0H);
        AnonymousClass3OC r5 = new AnonymousClass3OC(this, r14, list);
        if (charSequence.length() <= 768) {
            AnonymousClass0M6 r6 = new AnonymousClass0M6(charSequence);
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                r6.A00 = i;
                int A002 = EmojiDescriptor.A00(r6, false);
                int A012 = r6.A01(i, A002);
                if (A002 == -1) {
                    i += A012;
                }
            }
            C09030cB r1 = this.A0B;
            C12050hT r0 = this.A03;
            if (r1 != null) {
                try {
                    r5.AER(r0.call());
                    return;
                } catch (C14750mp unused) {
                    return;
                }
            } else {
                throw null;
            }
        }
        this.A01.setPlaceholder(80);
        C09030cB r4 = this.A0B;
        r4.A01.execute(new RunnableEBaseShape0S0300000_I0_0(r4, this.A03, r5, 20));
    }

    public Paint getMessageViewPaint() {
        return this.A01.getPaint();
    }

    private void setTitleColorBasedOnQuery(List list) {
        if (list == null || list.isEmpty()) {
            AnonymousClass2I3 r0 = this.A02;
            r0.A01.A00.setTextColor(this.A07);
            return;
        }
        AnonymousClass2I3 r02 = this.A02;
        r02.A01.A00.setTextColor(this.A06);
    }
}
