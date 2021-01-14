package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.01L  reason: invalid class name */
public class AnonymousClass01L {
    public static volatile AnonymousClass01L A06;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass00D A02;
    public final C016508x A03;
    public final C015908r A04;
    public final C015808q A05;

    public AnonymousClass01L(AnonymousClass009 r1, AnonymousClass01I r2, C015908r r3, C015808q r4, AnonymousClass00D r5, C016508x r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    public static AnonymousClass01L A00() {
        if (A06 == null) {
            synchronized (AnonymousClass01L.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass01L(AnonymousClass009.A00(), AnonymousClass01I.A00(), C015908r.A00(), C015808q.A00(), AnonymousClass00D.A00(), C016508x.A00);
                }
            }
        }
        return A06;
    }

    public long A01(UserJid userJid) {
        AnonymousClass1VG A032 = A03(userJid);
        if (A032 == null) {
            return 0;
        }
        return A032.A01;
    }

    public C05350Oe A02() {
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        if (r0.A03 == null) {
            return C05350Oe.A01;
        }
        return this.A04.A01().A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        if (r6 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1VG A03(com.whatsapp.jid.UserJid r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01L.A03(com.whatsapp.jid.UserJid):X.1VG");
    }

    public String A04(UserJid userJid) {
        if (userJid == null) {
            return "";
        }
        HashSet hashSet = new HashSet(A07(userJid));
        if (!hashSet.isEmpty()) {
            return C001801b.A18(hashSet);
        }
        return "";
    }

    public Map A05(UserJid userJid) {
        AnonymousClass00E.A07(!this.A01.A09(userJid));
        HashMap hashMap = new HashMap(this.A04.A02(userJid).A00);
        DeviceJid of = DeviceJid.of(userJid);
        if (of != null) {
            hashMap.put(of, 0L);
            return hashMap;
        }
        throw null;
    }

    public Set A06(UserJid userJid) {
        if (this.A05.A03()) {
            return A07(userJid);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(userJid.getPrimaryDevice());
        return hashSet;
    }

    public Set A07(UserJid userJid) {
        AnonymousClass01I r2 = this.A01;
        r2.A04();
        if (userJid.equals(r2.A03)) {
            HashSet A022 = A02().A02();
            r2.A04();
            DeviceJid deviceJid = r2.A02;
            if (deviceJid != null) {
                A022.add(deviceJid);
                return A022;
            }
            throw null;
        }
        HashSet A023 = this.A04.A02(userJid).A02().A02();
        DeviceJid of = DeviceJid.of(userJid);
        if (of != null) {
            A023.add(of);
            return A023;
        }
        throw null;
    }

    public void A08(UserJid userJid) {
        AnonymousClass00E.A07(!this.A01.A09(userJid));
        HashSet A022 = this.A04.A02(userJid).A02().A02();
        A022.remove(userJid.getPrimaryDevice());
        A0B(userJid, C05350Oe.A01(A022));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(com.whatsapp.jid.UserJid r14, X.AnonymousClass0PU r15) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01L.A09(com.whatsapp.jid.UserJid, X.0PU):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0163, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0167, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0188, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0193, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0196, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(com.whatsapp.jid.UserJid r26, X.AnonymousClass0PU r27, X.AnonymousClass1VG r28) {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01L.A0A(com.whatsapp.jid.UserJid, X.0PU, X.1VG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(com.whatsapp.jid.UserJid r20, X.C05350Oe r21) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01L.A0B(com.whatsapp.jid.UserJid, X.0Oe):void");
    }

    public void A0C(UserJid userJid, HashMap hashMap) {
        String str;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!((DeviceJid) entry.getKey()).userJid.equals(userJid)) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2.size() > 0) {
            AnonymousClass009 r3 = this.A00;
            StringBuilder A0X = AnonymousClass008.A0X("userJid=", userJid, "; deviceJids=");
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                sb.append(",");
                sb.append(entry2.getKey());
                sb.append(":");
                sb.append(entry2.getValue());
            }
            if (sb.length() > 0) {
                str = sb.substring(1);
            } else {
                str = "no-data-found";
            }
            A0X.append(str);
            r3.A04("userdevicemanager/invalid_devices", A0X.toString(), false);
            for (Object obj : hashMap2.keySet()) {
                hashMap.remove(obj);
            }
        }
    }

    public boolean A0D(UserJid[] userJidArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (UserJid userJid : userJidArr) {
            hashSet.addAll(A07(userJid));
        }
        return C001801b.A18(hashSet).equals(str);
    }
}
