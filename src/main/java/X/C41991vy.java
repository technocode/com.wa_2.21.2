package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1vy  reason: invalid class name and case insensitive filesystem */
public class C41991vy extends AnonymousClass0SD {
    public boolean A00;
    public boolean A01;
    public final C02270Bi A02 = new C02270Bi();
    public final C02270Bi A03 = new C02270Bi();
    public final C02270Bi A04 = new C02270Bi();
    public final C02270Bi A05 = new C02270Bi();
    public final C02270Bi A06 = new C02270Bi();
    public final C02270Bi A07 = new C02270Bi();
    public final C02270Bi A08 = new C02270Bi();
    public final C02270Bi A09 = new C02270Bi();
    public final C02270Bi A0A;
    public final C04360Kb A0B;
    public final AnonymousClass01J A0C;
    public final C27701Rb A0D;
    public final C27741Rf A0E;
    public final C27831Rq A0F;
    public final C42681x6 A0G;
    public final C014308b A0H;
    public final AnonymousClass01P A0I;
    public final UserJid A0J;

    public C41991vy(C27741Rf r3, UserJid userJid, C04360Kb r5, C27701Rb r6, AnonymousClass01J r7, C42681x6 r8, C014308b r9, AnonymousClass01P r10, C27831Rq r11) {
        C02270Bi r1 = new C02270Bi();
        this.A0A = r1;
        this.A01 = true;
        this.A0E = r3;
        this.A0J = userJid;
        this.A0D = r6;
        this.A0B = r5;
        this.A0C = r7;
        this.A0G = r8;
        this.A0H = r9;
        this.A0I = r10;
        this.A0F = r11;
        r6.A04 = this.A06;
        r6.A00 = this.A02;
        r6.A07 = this.A09;
        r6.A06 = this.A08;
        r6.A02 = this.A04;
        r6.A05 = this.A07;
        r6.A03 = this.A05;
        r6.A08 = r1;
        r6.A01 = this.A03;
    }

    public final void A02(String str, String str2, C41831vi r13, ActivityC004802g r14, AnonymousClass1S0 r15) {
        C48072Ku r2;
        AnonymousClass1SH r6 = (AnonymousClass1SH) this.A09.A01();
        if (!r13.A00.isEmpty()) {
            try {
                List list = ((C27711Rc) r13.A00.get(0)).A01.A0A;
                if (!(list.isEmpty() || (r2 = (C48072Ku) list.get(0)) == null || r6 == null || r6.A01 == null)) {
                    C41981vx r3 = new C41981vx(this, str, r6, r13.A08(), str2, r14);
                    C42681x6 r4 = this.A0G;
                    r4.A00 = r3;
                    r15.A02(r2, 3, r4, C42671x5.A00, new C42661x4(r4), null);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        this.A08.A08(Boolean.TRUE);
    }
}
