package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0QM  reason: invalid class name */
public class AnonymousClass0QM {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public DeviceJid A04;
    public GroupJid A05;
    public AnonymousClass0Oo A06;
    public String A07;
    public final long A08;
    public final C09260ca A09;
    public final Map A0A = new LinkedHashMap();
    public final boolean A0B;
    public final boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public transient boolean A0F;

    public AnonymousClass0QM(C09260ca r5, AnonymousClass0Oo r6, long j, long j2, boolean z, int i, int i2, long j3, boolean z2, boolean z3, GroupJid groupJid, boolean z4, Collection collection, DeviceJid deviceJid, String str) {
        this.A09 = r5;
        this.A06 = r6;
        this.A03 = j;
        this.A08 = j2;
        this.A0E = z;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j3;
        this.A0C = z2;
        this.A0B = z3;
        this.A05 = groupJid;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass0QP r2 = (AnonymousClass0QP) it.next();
            this.A0A.put(r2.A02, r2);
        }
        this.A0D = z4;
        this.A04 = deviceJid;
        this.A07 = str;
    }

    public static AnonymousClass0QM A00(AnonymousClass0Oo r17, long j, int i, long j2, boolean z, int i2, int i3, long j3, boolean z2, GroupJid groupJid, boolean z3, List list) {
        C007303n r3 = r17.A0n;
        AnonymousClass02N r1 = r3.A00;
        UserJid of = UserJid.of(r1);
        if (AnonymousClass1VY.A0e(of)) {
            return new AnonymousClass0QM(new C09260ca(of, r3.A02, r3.A01, i), r17, j, j2, z, i2, i3, j3, false, z2, groupJid, z3, list, null, null);
        }
        StringBuilder A0S = AnonymousClass008.A0S("CallLog/fromFMessage V1 bad UserJid: ");
        A0S.append(r1);
        Log.e(A0S.toString());
        return null;
    }

    public static AnonymousClass0QM A01(AnonymousClass0Oo r20, boolean z, int i, int i2, long j, boolean z2) {
        C007303n r4 = r20.A0n;
        AnonymousClass02N r1 = r4.A00;
        UserJid of = UserJid.of(r1);
        if (AnonymousClass1VY.A0e(of)) {
            return new AnonymousClass0QM(new C09260ca(of, r4.A02, r4.A01, -1), r20, -1, r20.A0E, z, i, i2, j, true, z2, null, false, Collections.emptyList(), null, null);
        }
        StringBuilder A0S = AnonymousClass008.A0S("CallLog/fromFMessage Legacy bad UserJid: ");
        A0S.append(r1);
        Log.e(A0S.toString());
        return null;
    }

    public synchronized long A02() {
        return this.A03;
    }

    public C09260ca A03() {
        C09260ca r0 = this.A09;
        return new C09260ca(r0.A01, r0.A03, r0.A02, r0.A00);
    }

    public List A04() {
        return new ArrayList(this.A0A.values());
    }

    public synchronized void A05() {
        this.A0F = false;
    }

    public synchronized void A06(int i) {
        if (this.A00 != i) {
            this.A0F = true;
        }
        this.A00 = i;
    }

    public synchronized void A07(long j) {
        if (this.A02 != j) {
            this.A0F = true;
        }
        this.A02 = j;
    }

    public synchronized void A08(long j) {
        this.A03 = j;
    }

    public synchronized void A09(DeviceJid deviceJid) {
        if (this.A04 != deviceJid) {
            this.A0F = true;
        }
        this.A04 = deviceJid;
    }

    public synchronized void A0A(GroupJid groupJid) {
        if (this.A05 != groupJid) {
            this.A0F = true;
        }
        this.A05 = groupJid;
    }

    public synchronized void A0B(UserJid userJid, int i) {
        Map map = this.A0A;
        AnonymousClass0QP r1 = (AnonymousClass0QP) map.get(userJid);
        if (r1 != null) {
            synchronized (r1) {
                r1.A00 = i;
                r1.A03 = true;
            }
        } else {
            AnonymousClass0QP r12 = new AnonymousClass0QP(-1, userJid, i);
            map.put(r12.A02, r12);
            this.A0F = true;
        }
    }

    public synchronized void A0C(boolean z) {
        if (this.A0E != z) {
            this.A0F = true;
        }
        this.A0E = z;
    }

    public boolean A0D() {
        return this.A0A.size() >= 2;
    }

    public boolean A0E() {
        return !this.A09.A03 && this.A00 == 2;
    }

    public synchronized boolean A0F() {
        if (this.A0F || this.A03 == -1) {
            return true;
        }
        for (AnonymousClass0QP r0 : this.A0A.values()) {
            if (r0.A01()) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0QM.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0QM r7 = (AnonymousClass0QM) obj;
        if (this.A03 == r7.A03 && this.A09.equals(r7.A09) && this.A08 == r7.A08 && this.A0E == r7.A0E && this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00 && this.A0C == r7.A0C && this.A0B == r7.A0B && C006803i.A0q(this.A05, r7.A05) && this.A0D == r7.A0D && this.A0A.equals(r7.A0A) && C006803i.A0q(this.A04, r7.A04) && C006803i.A0q(this.A07, r7.A07)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A03), this.A09, Long.valueOf(this.A08), Boolean.valueOf(this.A0E), Integer.valueOf(this.A01), Long.valueOf(this.A02), Integer.valueOf(this.A00), Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0B), this.A0A, this.A05, Boolean.valueOf(this.A0D), this.A04, this.A07});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallLog[rowId=");
        A0S.append(this.A03);
        A0S.append(", key=");
        A0S.append(this.A09);
        A0S.append(", timestamp=");
        A0S.append(this.A08);
        A0S.append(", videoCall=");
        A0S.append(this.A0E);
        A0S.append(", duration=");
        A0S.append(this.A01);
        A0S.append(", bytesTransferred=");
        A0S.append(this.A02);
        A0S.append(", callResult=");
        A0S.append(this.A00);
        A0S.append(", isLegacy=");
        A0S.append(this.A0C);
        A0S.append(", fromMissedCall=");
        A0S.append(this.A0B);
        A0S.append(", groupJid=");
        A0S.append(this.A05);
        A0S.append(", isJoinableGroupCall=");
        A0S.append(this.A0D);
        A0S.append(", participants.size=");
        A0S.append(this.A0A.size());
        A0S.append(", callCreatorDeviceJid=");
        A0S.append(this.A04);
        A0S.append(", callRandomId=");
        return AnonymousClass008.A0O(A0S, this.A07, "]");
    }
}
