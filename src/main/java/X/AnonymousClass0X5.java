package X;

import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.RehydrateHsmJob;
import com.whatsapp.jobqueue.job.RehydrateTemplateJob;
import com.whatsapp.util.Log;

/* renamed from: X.0X5  reason: invalid class name */
public class AnonymousClass0X5 {
    public static volatile AnonymousClass0X5 A0B;
    public final AnonymousClass09G A00;
    public final C000300f A01;
    public final AnonymousClass01J A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass01K A05;
    public final C04480Kn A06;
    public final AnonymousClass098 A07;
    public final AnonymousClass0AR A08;
    public final C02360Br A09;
    public final AnonymousClass0AL A0A;

    public AnonymousClass0X5(AnonymousClass00S r1, AnonymousClass0AR r2, C000300f r3, AnonymousClass098 r4, AnonymousClass09G r5, AnonymousClass01J r6, C02360Br r7, AnonymousClass01X r8, AnonymousClass0AL r9, AnonymousClass01K r10, C04480Kn r11) {
        this.A03 = r1;
        this.A08 = r2;
        this.A01 = r3;
        this.A07 = r4;
        this.A00 = r5;
        this.A02 = r6;
        this.A09 = r7;
        this.A04 = r8;
        this.A0A = r9;
        this.A05 = r10;
        this.A06 = r11;
    }

    public final Pair A00(C02840Dr r22, AnonymousClass1XJ r23, C44281zn r24, AnonymousClass1M7 r25) {
        int A002 = r23.A00();
        if (A002 == 0) {
            r24.A06 = 1;
            try {
                AnonymousClass0OG r3 = r22.A0X;
                if (r3 == null) {
                    r3 = AnonymousClass0OG.A05;
                }
                AnonymousClass0ZG.A0D(r3, r23.A04(), false);
                long A052 = this.A03.A05();
                AnonymousClass01J r4 = this.A02;
                AnonymousClass0AL r8 = this.A0A;
                AnonymousClass01X r9 = this.A04;
                String str = r23.A0c;
                AnonymousClass02N A092 = AnonymousClass1VY.A09(r23.A0Y);
                if (A092 != null) {
                    r4.A00.A01(new RehydrateTemplateJob(r8, r9, r22, str, A092, AnonymousClass1VY.A09(r23.A06), r23.A0X, 86400000 + A052, r23.A0L, r23.A03, r23.A01));
                    return new Pair(Boolean.TRUE, Boolean.FALSE);
                }
                throw null;
            } catch (C64122xf unused) {
                this.A08.A0C(AnonymousClass1VY.A09(r23.A0Y), r23.A0c, AnonymousClass1VY.A09(r23.A06), 1008, "content", null);
                return new Pair(Boolean.FALSE, Boolean.TRUE);
            }
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("decryptioncallbackv2/invalid-edit-version edit=");
            A0S.append(A002);
            A0S.append(", type=hsm, id=");
            A0S.append(r23.A0c);
            Log.e(A0S.toString());
            r25.AFr(19);
            Boolean bool = Boolean.TRUE;
            return new Pair(bool, bool);
        }
    }

    public final AbstractC007503q A01(AnonymousClass0AL r16, AnonymousClass1XJ r17, AnonymousClass0OG r18, C44281zn r19) {
        r19.A06 = 1;
        AnonymousClass0ZG.A0D(r18, r17.A04(), true);
        String str = r17.A0c;
        Jid jid = r17.A0Y;
        AnonymousClass02N A092 = AnonymousClass1VY.A09(jid);
        if (A092 != null) {
            AbstractC007503q A0y = C002001d.A0y(r16, r18, str, A092, r17.A0X, UserJid.of(AnonymousClass1VY.A09(r17.A06)), r17.A0L, r17.A03, false, false, r17.A01);
            if (A0y != null) {
                return A0y;
            }
            this.A08.A0C(AnonymousClass1VY.A09(jid), str, AnonymousClass1VY.A09(r17.A06), null, null, null);
            return null;
        }
        throw null;
    }

    public final boolean A02(C02840Dr r21, AnonymousClass1XJ r22, C44281zn r23, AnonymousClass1M7 r24) {
        int A002 = r22.A00();
        if (A002 == 0) {
            r23.A06 = 1;
            AnonymousClass0ZG.A0E(r21, r22.A04());
            long A052 = this.A03.A05();
            AnonymousClass01J r3 = this.A02;
            AnonymousClass01X r6 = this.A04;
            AnonymousClass0AL r7 = this.A0A;
            String str = r22.A0c;
            AnonymousClass02N A092 = AnonymousClass1VY.A09(r22.A0Y);
            if (A092 != null) {
                r3.A00.A01(new RehydrateHsmJob(r6, r7, r21, str, A092, AnonymousClass1VY.A09(r22.A06), r22.A0X, 86400000 + A052, r22.A0L, r22.A03, null, r22.A01));
                return false;
            }
            throw null;
        }
        StringBuilder A0S = AnonymousClass008.A0S("decryptioncallbackv2/invalid-edit-version edit=");
        A0S.append(A002);
        A0S.append(", type=hsm, id=");
        A0S.append(r22.A0c);
        Log.e(A0S.toString());
        r24.AFr(19);
        return true;
    }
}
