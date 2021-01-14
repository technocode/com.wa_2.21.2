package X;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.2tM  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC61552tM {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass2bX A05;
    public final AnonymousClass2bX A06;
    public final UserJid A07;
    public final UserJid A08;
    public final AnonymousClass0GP A09;
    public final C03340Fu A0A;
    public final C01970Ad A0B;
    public final C61202sf A0C;
    public final C61572tO A0D;
    public final C61762th A0E;
    public final C018809u A0F = C018809u.A00("PaymentPrecheckAction", "network", "COMMON");
    public final C61902tv A0G;
    public final C61942tz A0H;
    public final C61962u1 A0I;
    public final C63842x6 A0J;
    public final AnonymousClass00T A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;

    public AbstractC61552tM(AnonymousClass00S r13, Context context, AnonymousClass02M r15, AnonymousClass01I r16, AnonymousClass00T r17, C61202sf r18, C63842x6 r19, C01970Ad r20, AnonymousClass04j r21, C61942tz r22, C03340Fu r23, AnonymousClass0GP r24, C61902tv r25, C61762th r26, String str, UserJid userJid, String str2, String str3, AnonymousClass2bX r31, AnonymousClass2bX r32, String str4, String str5) {
        this.A04 = r13;
        this.A00 = context;
        this.A01 = r15;
        this.A02 = r16;
        this.A0K = r17;
        this.A0C = r18;
        this.A0J = r19;
        this.A0B = r20;
        this.A03 = r21;
        this.A0H = r22;
        this.A0A = r23;
        this.A09 = r24;
        this.A0G = r25;
        this.A0E = r26;
        this.A0I = new C61962u1(r13, r23);
        this.A0D = new C61572tO(context, r15, r21, r23, r24, r26, "PIN");
        this.A0M = str;
        r16.A04();
        this.A08 = r16.A03;
        this.A07 = userJid;
        this.A05 = r31;
        this.A06 = r32;
        this.A0L = str2;
        this.A0Q = str3;
        this.A0R = str4;
        this.A0N = "BR";
        this.A0P = "FB";
        this.A0O = str5;
    }

    public static void A00(AbstractC61552tM r11, String str, AnonymousClass0M5 r13, AbstractC61542tL r14) {
        AbstractC07650Yy r2;
        if (r11 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AnonymousClass0OS("action", "pay-precheck", null, (byte) 0));
            String str2 = r11.A0N;
            arrayList.add(new AnonymousClass0OS("country", str2, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("credential-id", r11.A0M, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("nonce", str, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("receiver", r11.A07));
            arrayList.add(new AnonymousClass0OS("amount", r11.A0L, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("total-amount", r11.A0Q, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("device-id", r11.A0J.A02(), null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("transaction-type", r11.A0R, null, (byte) 0));
            String str3 = r11.A0O;
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new AnonymousClass0OS("payment-rails", str3, null, (byte) 0));
            }
            if (!TextUtils.isEmpty(null)) {
                arrayList.add(new AnonymousClass0OS("request-id", null, null, (byte) 0));
            }
            AnonymousClass1X1 A022 = r11.A0B.A02(str2);
            if (A022 != null) {
                r2 = A022.A8I(r11.A05.A01.A5e());
            } else {
                r2 = null;
            }
            r11.A0A.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), new AnonymousClass0M5[]{r13, new AnonymousClass0M5("amount", new AnonymousClass0OS[0], r2.A7Z(r11.A05)), new AnonymousClass0M5("total-amount", new AnonymousClass0OS[0], r2.A7Z(r11.A06))}, null), new C73563Xv(r11, r11.A00, r11.A01, r11.A03, r11.A09, r14), 30000);
            return;
        }
        throw null;
    }

    public final void A01(C61952u0 r12, C04080Iy r13, AnonymousClass3YB r14) {
        AnonymousClass00S r2 = this.A04;
        byte[] A0x = AnonymousClass0FI.A0x(r2, this.A02, false);
        if (A0x != null) {
            String A032 = C007603r.A03(A0x);
            long A052 = r2.A05() / 1000;
            if (!this.A0G.A06(C61932ty.A01(this.A07.user, this.A0L, Long.valueOf(A052), A032), r13, new AnonymousClass3ER(this, r14, A032, r12, A052))) {
                AnonymousClass3YC r1 = r14.A01;
                r1.A02.A0q();
                AnonymousClass0MB r4 = new AnonymousClass0MB(r1.A01);
                AnonymousClass01X r15 = r1.A04;
                String A062 = r15.A06(R.string.payments_biometric_invalidated_key_title);
                AnonymousClass0MC r22 = r4.A01;
                r22.A0I = A062;
                r22.A0E = r15.A06(R.string.payments_biometric_invalidated_key_error);
                r4.A07(r15.A06(R.string.ok), new DialogInterface$OnClickListenerC61872ts(r14));
                r22.A0J = false;
                r4.A00().show();
                return;
            }
            return;
        }
        throw null;
    }
}
