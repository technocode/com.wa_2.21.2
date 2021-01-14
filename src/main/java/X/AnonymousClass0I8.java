package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: X.0I8  reason: invalid class name */
public class AnonymousClass0I8 {
    public static volatile AnonymousClass0I8 A0D;
    public WeakHashMap A00;
    public boolean A01 = true;
    public final AnonymousClass009 A02;
    public final AnonymousClass01I A03;
    public final AnonymousClass04v A04;
    public final AnonymousClass00S A05;
    public final C001000o A06;
    public final AnonymousClass01N A07;
    public final C02430Bz A08;
    public final AnonymousClass01L A09;
    public final C002701k A0A;
    public final C015808q A0B;
    public final AnonymousClass0AR A0C;

    public AnonymousClass0I8(AnonymousClass00S r2, C002701k r3, AnonymousClass009 r4, AnonymousClass01I r5, AnonymousClass0AR r6, C015808q r7, C001000o r8, AnonymousClass01L r9, AnonymousClass01N r10, AnonymousClass04v r11, C02430Bz r12) {
        this.A05 = r2;
        this.A0A = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A0C = r6;
        this.A0B = r7;
        this.A06 = r8;
        this.A09 = r9;
        this.A07 = r10;
        this.A04 = r11;
        this.A08 = r12;
        this.A00 = new WeakHashMap();
    }

    public static C05770Qa A00(byte[] bArr, byte b) {
        try {
            return C001801b.A08(C05360Of.A08(new byte[]{b}, bArr));
        } catch (AnonymousClass1UK e) {
            Log.e("DeviceADVInfoManager/generatePublicIdentityKey invalidKeyException", e);
            return null;
        }
    }

    public static AnonymousClass0I8 A01() {
        if (A0D == null) {
            synchronized (AnonymousClass0I8.class) {
                if (A0D == null) {
                    A0D = new AnonymousClass0I8(AnonymousClass00S.A00(), C002701k.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass0AR.A00(), C015808q.A00(), C001000o.A00(), AnonymousClass01L.A00(), AnonymousClass01N.A00(), AnonymousClass04v.A00(), C02430Bz.A00());
                }
            }
        }
        return A0D;
    }

    public final AnonymousClass071 A02(UserJid userJid) {
        AnonymousClass0QZ A0A2;
        AbstractCollection abstractCollection = (AbstractCollection) this.A09.A06(userJid);
        if (abstractCollection.size() <= 1) {
            return null;
        }
        ArrayList<AnonymousClass0QZ> arrayList = new ArrayList();
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (!deviceJid.isPrimary() || !this.A03.A09(deviceJid.userJid)) {
                A0A2 = this.A06.A0A(C001801b.A0A(deviceJid));
            } else {
                A0A2 = this.A06.A0B().A01;
            }
            if (A0A2 == null) {
                StringBuilder sb = new StringBuilder("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                sb.append(deviceJid);
                Log.e(sb.toString());
                return null;
            }
            arrayList.add(A0A2);
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (AnonymousClass0QZ r0 : arrayList) {
                arrayList2.add(r0.A00.A01);
            }
            Collections.sort(arrayList2, new AnonymousClass3CK());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                instance.update((byte[]) it2.next());
            }
            byte[] A072 = C05360Of.A07(instance.digest(), this.A0A.A03(310));
            return AnonymousClass071.A00(A072, 0, A072.length);
        } catch (NoSuchAlgorithmException e) {
            Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e);
            return null;
        }
    }

    public AnonymousClass2LF A03(UserJid userJid) {
        AnonymousClass071 A022;
        long A012;
        if (!this.A0A.A0E(309)) {
            return null;
        }
        AnonymousClass01I r6 = this.A03;
        r6.A04();
        AnonymousClass071 A023 = A02(r6.A03);
        r6.A04();
        UserJid userJid2 = r6.A03;
        AnonymousClass01L r3 = this.A09;
        long A013 = r3.A01(userJid2);
        if (A023 == null && this.A05.A05() - (1000 * A013) >= 2592000000L) {
            A013 = 0;
        }
        boolean A092 = r6.A09(userJid);
        if (A092) {
            A022 = null;
        } else {
            A022 = A02(userJid);
        }
        if (A092) {
            A012 = 0;
        } else {
            A012 = r3.A01(userJid);
            if (A022 == null && this.A05.A05() - (1000 * A012) >= 2592000000L) {
                A012 = 0;
            }
        }
        if (A023 == null && A013 == 0 && A022 == null && A012 == 0) {
            return null;
        }
        return new AnonymousClass2LF(A023, A013, A022, A012);
    }

    public C75133cQ A04(UserJid userJid, byte[] bArr) {
        AnonymousClass0QZ A0A2 = this.A06.A0A(C001801b.A0A(userJid.getPrimaryDevice()));
        if (A0A2 == null) {
            StringBuilder sb = new StringBuilder("DeviceADVInfoHandler/checkPrimaryIdentity/no primary identity. userJid=");
            sb.append(userJid);
            Log.w(sb.toString());
            this.A0C.A0R(Collections.singletonList(userJid.getPrimaryDevice()));
            return null;
        }
        try {
            C75193cW r7 = (C75193cW) AnonymousClass078.A02(C75193cW.A03, bArr);
            byte[] A012 = r7.A02.A01();
            if (!C001801b.A1o(A0A2.A00, C05360Of.A08(AnonymousClass020.A06, A012), r7.A01.A01())) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/fail to verify account signature");
                this.A0C.A0R(Collections.singletonList(userJid.getPrimaryDevice()));
                return null;
            }
            try {
                return (C75133cQ) AnonymousClass078.A02(C75133cQ.A06, A012);
            } catch (C04190Jk e) {
                StringBuilder A0S = AnonymousClass008.A0S("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVKeyIndexList invalidProto:");
                A0S.append(e.getMessage());
                Log.e(A0S.toString());
                AnonymousClass009 r2 = this.A02;
                StringBuilder A0X = AnonymousClass008.A0X("invalidProto of ADVKeyIndexList, userJid=", userJid, "; exception=");
                A0X.append(e.getMessage());
                r2.A04("adv-data-error", A0X.toString(), true);
                return null;
            }
        } catch (C04190Jk e2) {
            StringBuilder A0S2 = AnonymousClass008.A0S("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVSignedKeyIndexList invalidProto:");
            A0S2.append(e2.getMessage());
            Log.e(A0S2.toString());
            AnonymousClass009 r22 = this.A02;
            StringBuilder A0X2 = AnonymousClass008.A0X("signed invalidProto of ADVSignedKeyIndexList, userJid=", userJid, "; exception=");
            A0X2.append(e2.getMessage());
            r22.A04("adv-data-error", A0X2.toString(), true);
            return null;
        }
    }

    public final void A05(DeviceJid deviceJid, C75113cO r11, C05770Qa r12) {
        this.A06.A0N(C001801b.A0A(deviceJid.userJid.getPrimaryDevice()), new AnonymousClass0QZ(r12));
        AnonymousClass01L r6 = this.A09;
        long A012 = r6.A01(deviceJid.userJid);
        UserJid userJid = deviceJid.userJid;
        HashMap hashMap = new HashMap();
        hashMap.put(userJid.getPrimaryDevice(), 0L);
        hashMap.put(deviceJid, Long.valueOf((long) r11.A01));
        r6.A0A(userJid, new AnonymousClass0PU(hashMap, null), new AnonymousClass1VG(r11.A02, A012));
    }

    public void A06(DeviceJid deviceJid, boolean z) {
        boolean z2;
        AnonymousClass00E.A07(!deviceJid.isPrimary());
        this.A06.A0H.A00();
        if (z) {
            if (this.A03.A08(deviceJid)) {
                this.A08.A09(deviceJid);
            } else {
                this.A09.A0B(deviceJid.userJid, C05350Oe.A00(deviceJid));
            }
        }
        this.A07.A06(Collections.singleton(deviceJid));
        boolean z3 = false;
        for (AxolotlMultiDeviceSessionRequirement axolotlMultiDeviceSessionRequirement : this.A00.keySet()) {
            synchronized (axolotlMultiDeviceSessionRequirement.A05) {
                Collection collection = axolotlMultiDeviceSessionRequirement.A06;
                if (collection == null || !collection.contains(deviceJid)) {
                    z2 = false;
                } else {
                    axolotlMultiDeviceSessionRequirement.A08 = false;
                    z2 = true;
                }
            }
            z3 |= z2;
        }
        if (z3) {
            AnonymousClass04v r0 = this.A04;
            r0.A02.A01(new AnonymousClass1Q3(deviceJid));
        }
    }

    public boolean A07() {
        return this.A0B.A03();
    }

    public boolean A08(DeviceJid deviceJid, byte[] bArr, AnonymousClass02P r7) {
        byte[] bArr2;
        this.A06.A0H.A00();
        if (deviceJid == null || deviceJid.isPrimary() || r7 == null || r7.A00 != 1) {
            return true;
        }
        byte[] bArr3 = r7.A02;
        try {
            bArr2 = C001801b.A08(C05360Of.A02(((C77573ge) AnonymousClass078.A00(C77573ge.A07, AnonymousClass071.A00(bArr3, 1, bArr3.length - 1))).A05.A01()).A00()).A01;
        } catch (C04190Jk e) {
            Log.e("DeviceADVInfoManager/extractIdentityFromCipherText/fail to get key", e);
        } catch (C29361Ye e2) {
            Log.e("DeviceADVInfoManager/extractIdentityFromCipherText/fail to get key", e2);
        } catch (AnonymousClass1UK e3) {
            Log.e("DeviceADVInfoManager/extractIdentityFromCipherText/fail to get key", e3);
        }
        return A09(deviceJid, bArr, bArr2, (byte) 5);
        bArr2 = null;
        return A09(deviceJid, bArr, bArr2, (byte) 5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0173, code lost:
        if (new X.AnonymousClass0QZ(r1).equals(r3) == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a4, code lost:
        if (((java.lang.Number) r1.get(r21)).longValue() != ((long) r5.A01)) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ee, code lost:
        if (r2 == null) goto L_0x01f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(com.whatsapp.jid.DeviceJid r21, byte[] r22, byte[] r23, byte r24) {
        /*
        // Method dump skipped, instructions count: 758
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0I8.A09(com.whatsapp.jid.DeviceJid, byte[], byte[], byte):boolean");
    }

    public boolean A0A(UserJid userJid, C75133cQ r8, long j) {
        if (r8 == null) {
            StringBuilder sb = new StringBuilder("DeviceADVInfoManager/verifyKeyIndexListData/validate indexList fail, userJid=");
            sb.append(userJid);
            Log.w(sb.toString());
            return false;
        } else if (j != r8.A04) {
            AnonymousClass009 r4 = this.A02;
            StringBuilder sb2 = new StringBuilder("timestamp is different with indexList timestamp, userJid=");
            sb2.append(userJid);
            sb2.append("; synctime=");
            sb2.append(j);
            sb2.append("; listTime=");
            sb2.append(r8.A04);
            r4.A04("adv-data-error", sb2.toString(), true);
            return false;
        } else {
            AnonymousClass01L r2 = this.A09;
            AnonymousClass1VG A032 = r2.A03(userJid);
            if (A032 == null || A032.A00 != r8.A02) {
                r2.A08(userJid);
            }
            return true;
        }
    }
}
