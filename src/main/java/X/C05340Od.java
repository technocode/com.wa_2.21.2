package X;

import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Od  reason: invalid class name and case insensitive filesystem */
public class C05340Od {
    public String A00;
    public Map A01 = new ConcurrentHashMap();
    public final AnonymousClass02X A02;

    public C05340Od(AnonymousClass02X r2) {
        if (r2 != null) {
            this.A02 = r2;
            return;
        }
        throw null;
    }

    public static String A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jid) it.next()).getRawString());
        }
        Collections.sort(arrayList);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                instance.update(((String) it2.next()).getBytes());
            }
            byte[] digest = instance.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder sb = new StringBuilder("1:");
            sb.append(Base64.encodeToString(bArr, 2));
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static Set A01(Collection collection) {
        AnonymousClass00E.A07(!collection.isEmpty());
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(new AnonymousClass1M4((DeviceJid) it.next(), false));
        }
        return hashSet;
    }

    public final AnonymousClass1M5 A02(UserJid userJid, Collection collection, int i, boolean z, boolean z2) {
        AnonymousClass1M5 r1 = (AnonymousClass1M5) this.A01.get(userJid);
        if (r1 != null) {
            r1.A01 = i;
            r1.A02 = z;
        } else {
            r1 = new AnonymousClass1M5(userJid, A01(collection), i, z);
            r1.A00 = this.A01.size();
            this.A01.put(userJid, r1);
            if (z2) {
                A06();
                return r1;
            }
        }
        return r1;
    }

    public C05350Oe A03() {
        return C05350Oe.A01(this.A01.keySet());
    }

    public C05350Oe A04() {
        return C05350Oe.A01(this.A01.values());
    }

    public ArrayList A05() {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1M5 r1 : this.A01.values()) {
            if (r1.A01 != 0) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public void A06() {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.A01.entrySet()) {
            Iterator it = ((AnonymousClass1M5) entry.getValue()).A00().iterator();
            while (true) {
                C28351Tz r1 = (C28351Tz) it;
                if (r1.hasNext()) {
                    hashSet.add(((AnonymousClass1M4) r1.next()).A01);
                }
            }
        }
        this.A00 = C001801b.A18(hashSet);
        StringBuilder A0S = AnonymousClass008.A0S("computed participant hash for ");
        A0S.append(this.A02);
        A0S.append(" as ");
        AnonymousClass008.A1S(A0S, this.A00);
    }

    public final void A07() {
        for (AnonymousClass1M5 r0 : this.A01.values()) {
            for (AnonymousClass1M4 r1 : r0.A04.values()) {
                r1.A00 = false;
            }
        }
    }

    public void A08(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1M5 r1 = (AnonymousClass1M5) it.next();
            A02(r1.A03, C05350Oe.A01(r1.A04.keySet()).A02(), r1.A01, r1.A02, false);
        }
        A06();
    }

    public void A09(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (this.A01.remove(obj) != null) {
                z = true;
            }
        }
        if (z) {
            A06();
        }
    }

    public boolean A0A(AnonymousClass01I r3) {
        r3.A04();
        UserJid userJid = r3.A03;
        return userJid != null && this.A01.containsKey(userJid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C05340Od.class != obj.getClass()) {
            return false;
        }
        C05340Od r5 = (C05340Od) obj;
        if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
            return false;
        }
        String str = this.A00;
        String str2 = r5.A00;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.A01.hashCode() + (this.A02.hashCode() * 31)) * 31;
        String str = this.A00;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("GroupParticipants{groupJid='");
        A0S.append(this.A02);
        A0S.append('\'');
        A0S.append(", participants=");
        A0S.append(this.A01);
        A0S.append(", participantHash='");
        A0S.append(this.A00);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
