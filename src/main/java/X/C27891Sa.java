package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.1Sa  reason: invalid class name and case insensitive filesystem */
public class C27891Sa {
    public boolean A00;
    public final Activity A01;
    public final AnonymousClass1KW A02;
    public final AnonymousClass0GG A03;
    public final AnonymousClass009 A04;
    public final AnonymousClass02M A05;
    public final C000300f A06;
    public final C27911Sc A07;
    public final C28241Tl A08;
    public final AnonymousClass08B A09;
    public final AnonymousClass00D A0A;
    public final AnonymousClass09H A0B;
    public final AnonymousClass1Xa A0C;
    public final AnonymousClass0C4 A0D;
    public final Runnable A0E = new RunnableEBaseShape7S0100000_I1_2(this, 47);
    public final Runnable A0F = new RunnableEBaseShape7S0100000_I1_2(this, 48);
    public final Set A0G;
    public final boolean A0H;

    public C27891Sa(Activity activity, AnonymousClass02M r4, AnonymousClass009 r5, AnonymousClass0C4 r6, C000300f r7, AnonymousClass09H r8, AnonymousClass0GG r9, AnonymousClass08B r10, AnonymousClass00D r11, AnonymousClass1KW r12, boolean z, AnonymousClass1Xa r14, Set set, C27911Sc r16, C28241Tl r17) {
        this.A01 = activity;
        this.A05 = r4;
        this.A04 = r5;
        this.A0D = r6;
        this.A06 = r7;
        this.A0B = r8;
        this.A03 = r9;
        this.A09 = r10;
        this.A0A = r11;
        this.A02 = r12;
        this.A0C = r14;
        this.A0G = set;
        this.A0H = z;
        this.A07 = r16;
        this.A08 = r17;
    }

    public void A00() {
        AnonymousClass008.A1Q(AnonymousClass008.A0S("blocklistresponsehandler/general_request_timeout jid="), this.A07.A00);
        AnonymousClass1Xa r0 = this.A0C;
        if (r0 != null) {
            this.A0D.A0E(r0.A01, 500);
        }
        this.A05.A0E(this.A0E);
    }

    public void A01(int i) {
        AnonymousClass008.A1Q(AnonymousClass008.A0T("blocklistresponsehandler/general_request_failed ", i, " | "), this.A07.A00);
        this.A05.A0E(this.A0F);
        AnonymousClass1Xa r0 = this.A0C;
        if (r0 != null) {
            this.A0D.A0E(r0.A01, i);
        }
    }

    public void A02(String str) {
        C27911Sc r0 = this.A07;
        UserJid userJid = r0.A00;
        boolean z = r0.A04;
        AnonymousClass008.A14("blocklistresponsehandler/general_request_success jid=", userJid);
        this.A00 = true;
        if (z) {
            AnonymousClass0GG r1 = this.A03;
            synchronized (r1) {
                if (r1.A0O.add(userJid)) {
                    r1.A0B(userJid, str, true);
                }
            }
        } else {
            AnonymousClass0GG r12 = this.A03;
            synchronized (r12) {
                if (r12.A0O.remove(userJid)) {
                    r12.A0B(userJid, str, false);
                }
            }
        }
        this.A05.A0E(this.A0F);
        AnonymousClass1Xa r02 = this.A0C;
        if (r02 != null) {
            this.A0D.A0E(r02.A01, 200);
        }
    }
}
