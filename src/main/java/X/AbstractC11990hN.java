package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.WaTextView;
import com.whatsapp.conversationslist.ViewHolder;

/* renamed from: X.0hN  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC11990hN {
    public boolean A00 = false;
    public final Activity A01;
    public final Context A02;
    public final AnonymousClass0GG A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass0Z6 A05;
    public final C000300f A06;
    public final AnonymousClass0Z7 A07;
    public final C017009c A08;
    public final C014308b A09;
    public final AnonymousClass0Y5 A0A;
    public final C09610dF A0B;
    public final ViewHolder A0C;
    public final AnonymousClass00S A0D;
    public final AnonymousClass00G A0E;
    public final AnonymousClass01X A0F;
    public final AnonymousClass0A9 A0G;
    public final C02150Av A0H;
    public final AbstractC11890hA A0I;

    public AbstractC11990hN(ViewHolder viewHolder, Context context, Activity activity, C09610dF r5, AnonymousClass00S r6, AnonymousClass0Z6 r7, AnonymousClass01I r8, AnonymousClass00G r9, C000300f r10, C02150Av r11, AnonymousClass0A9 r12, C014308b r13, AnonymousClass01X r14, AbstractC11890hA r15, AnonymousClass0GG r16, C017009c r17, AnonymousClass0Z7 r18, AnonymousClass0Y5 r19) {
        this.A0C = viewHolder;
        this.A02 = context;
        this.A01 = activity;
        this.A0B = r5;
        this.A0D = r6;
        this.A05 = r7;
        this.A04 = r8;
        this.A0E = r9;
        this.A06 = r10;
        this.A0H = r11;
        this.A0G = r12;
        this.A09 = r13;
        this.A0F = r14;
        this.A0I = r15;
        this.A03 = r16;
        this.A08 = r17;
        this.A07 = r18;
        this.A0A = r19;
    }

    public void A00() {
        if (this instanceof C12000hO) {
            C12000hO r1 = (C12000hO) this;
            ((AbstractC11990hN) r1).A00 = true;
            C12040hS r0 = r1.A00;
            if (r0 != null) {
                ((AbstractCallableC12020hQ) r0).A00.A01();
            }
        } else if (!(this instanceof C11980hM)) {
            this.A00 = true;
        } else {
            C11980hM r12 = (C11980hM) this;
            ((AbstractC11990hN) r12).A00 = true;
            C12010hP r02 = r12.A00;
            if (r02 != null) {
                ((AbstractCallableC12020hQ) r02).A00.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x019e, code lost:
        if (r0 != null) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AbstractC10770fA r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 970
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC11990hN.A01(X.0fA, boolean):void");
    }

    public final void A02(AbstractC007503q r5) {
        Context context;
        AnonymousClass0MH r0 = r5.A0F;
        if (r0 != null && (context = this.A02) != null) {
            CharSequence A032 = C02150Av.A03(context, r0);
            if (!TextUtils.isEmpty(A032)) {
                WaTextView waTextView = this.A0C.A0O;
                waTextView.setVisibility(0);
                waTextView.setTextColor(context.getResources().getColor(C02150Av.A00(r5.A0F)));
                waTextView.setText(A032);
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0094 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v65, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.whatsapp.TextEmojiLabel] */
    /* JADX WARN: Type inference failed for: r15v66, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0Z6] */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
        if (r23.A08 == 6) goto L_0x00c2;
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AbstractC007503q r23, X.C007003k r24, X.C007003k r25) {
        /*
        // Method dump skipped, instructions count: 1874
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC11990hN.A03(X.03q, X.03k, X.03k):void");
    }
}
