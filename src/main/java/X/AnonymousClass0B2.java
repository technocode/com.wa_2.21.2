package X;

import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0B2  reason: invalid class name */
public class AnonymousClass0B2 {
    public static volatile AnonymousClass0B2 A05;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass01T A02;
    public final AnonymousClass01N A03;
    public final AnonymousClass01L A04;

    public AnonymousClass0B2(AnonymousClass009 r1, AnonymousClass01I r2, AnonymousClass01L r3, AnonymousClass01N r4, AnonymousClass01T r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public static AnonymousClass0B2 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0B2.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0B2(AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass01L.A00(), AnonymousClass01N.A00(), AnonymousClass01T.A00());
                }
            }
        }
        return A05;
    }

    public final Set A01(AnonymousClass02N r5) {
        if (r5 instanceof UserJid) {
            AnonymousClass01L r1 = this.A04;
            HashSet A022 = r1.A02().A02();
            if (!this.A01.A09(r5)) {
                UserJid of = UserJid.of(r5);
                if (of != null) {
                    A022.addAll(r1.A06(of));
                } else {
                    throw null;
                }
            }
            return A022;
        }
        HashSet hashSet = new HashSet();
        AnonymousClass01T r12 = this.A02;
        if (r5 instanceof AnonymousClass02X) {
            AnonymousClass02X r52 = (AnonymousClass02X) r5;
            if (r52 != null) {
                Iterator it = r12.A01(r52).A04().iterator();
                while (true) {
                    C28351Tz r13 = (C28351Tz) it;
                    if (r13.hasNext()) {
                        hashSet.addAll(C05350Oe.A01(((AnonymousClass1M5) r13.next()).A04.keySet()).A02());
                    } else {
                        AnonymousClass01I r0 = this.A01;
                        r0.A04();
                        hashSet.remove(r0.A02);
                        return hashSet;
                    }
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public Set A02(AbstractC007503q r8) {
        C007303n r0 = r8.A0n;
        AnonymousClass02N r6 = r0.A00;
        if (!r0.A02) {
            return null;
        }
        Set A032 = A03(r8);
        if (!(A032 == null || !(r6 instanceof AnonymousClass02X) || r8.A0C == 0)) {
            A032.addAll(A01(r6));
        }
        return A032;
    }

    public final Set A03(AbstractC007503q r6) {
        C007303n r2 = r6.A0n;
        AnonymousClass02N r1 = r2.A00;
        if (r1 instanceof AnonymousClass02X) {
            Set A032 = this.A03.A03(r2);
            HashSet hashSet = new HashSet(A032);
            AnonymousClass009 r22 = this.A00;
            HashSet<UserJid> hashSet2 = new HashSet(A032.size());
            AnonymousClass1VY.A0M(r22, A032, hashSet2);
            for (UserJid userJid : hashSet2) {
                hashSet.addAll(this.A04.A06(userJid));
            }
            hashSet.addAll(this.A04.A02().A02());
            AnonymousClass01I r0 = this.A01;
            r0.A04();
            hashSet.remove(r0.A02);
            return hashSet;
        } else if (r1 instanceof UserJid) {
            return A01(r1);
        } else {
            return null;
        }
    }
}
