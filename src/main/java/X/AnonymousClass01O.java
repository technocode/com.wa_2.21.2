package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.01O  reason: invalid class name */
public class AnonymousClass01O {
    public static volatile AnonymousClass01O A0B;
    public final AnonymousClass01I A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass00D A02;
    public final C001000o A03;
    public final C001400w A04;
    public final AnonymousClass01Q A05;
    public final AnonymousClass01K A06;
    public final AnonymousClass01T A07;
    public final AnonymousClass01L A08;
    public final C015808q A09;
    public final AnonymousClass01R A0A;

    public AnonymousClass01O(AnonymousClass00S r1, AnonymousClass01I r2, C001400w r3, AnonymousClass01K r4, C015808q r5, C001000o r6, AnonymousClass01L r7, AnonymousClass00D r8, AnonymousClass01Q r9, AnonymousClass01R r10, AnonymousClass01T r11) {
        this.A01 = r1;
        this.A00 = r2;
        this.A04 = r3;
        this.A06 = r4;
        this.A09 = r5;
        this.A03 = r6;
        this.A08 = r7;
        this.A02 = r8;
        this.A05 = r9;
        this.A0A = r10;
        this.A07 = r11;
    }

    public static AnonymousClass01O A00() {
        if (A0B == null) {
            synchronized (AnonymousClass01O.class) {
                if (A0B == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass01I A003 = AnonymousClass01I.A00();
                    C000300f.A00();
                    A0B = new AnonymousClass01O(A002, A003, C001400w.A02, AnonymousClass01K.A00(), C015808q.A00(), C001000o.A00(), AnonymousClass01L.A00(), AnonymousClass00D.A00(), AnonymousClass01Q.A00(), AnonymousClass01R.A01(), AnonymousClass01T.A00());
                }
            }
        }
        return A0B;
    }

    public final Set A01(UserJid userJid) {
        if (this.A00.A09(userJid)) {
            return new HashSet(this.A05.A06());
        }
        return this.A07.A02(userJid);
    }

    public void A02(UserJid userJid, C05350Oe r16, C05350Oe r17, C05350Oe r18) {
        Set set = r18.A00;
        if (!set.isEmpty()) {
            C001400w r2 = this.A04;
            r2.A00.execute(new RunnableEBaseShape2S0200000_I0_1(this, r18, 47));
        }
        if (this.A09.A03()) {
            Set set2 = r17.A00;
            if (!set2.isEmpty() && !set.isEmpty()) {
                AnonymousClass01T r6 = this.A07;
                HashSet hashSet = new HashSet();
                Iterator it = r16.iterator();
                while (true) {
                    C28351Tz r22 = (C28351Tz) it;
                    if (!r22.hasNext()) {
                        break;
                    }
                    hashSet.add(r22.next());
                }
                Iterator it2 = r18.iterator();
                while (true) {
                    C28351Tz r23 = (C28351Tz) it2;
                    if (!r23.hasNext()) {
                        break;
                    }
                    hashSet.remove(r23.next());
                }
                Iterator it3 = r17.iterator();
                while (true) {
                    C28351Tz r24 = (C28351Tz) it3;
                    if (!r24.hasNext()) {
                        break;
                    }
                    hashSet.add(r24.next());
                }
                C05350Oe r3 = new C05350Oe(hashSet, null);
                C015208k r25 = r6.A08;
                if (!r25.A0G()) {
                    return;
                }
                if (r25 == null) {
                    throw null;
                } else if (!r3.A00.isEmpty()) {
                    StringBuilder sb = new StringBuilder("participant-user-store/onDevicesRefreshed/");
                    sb.append(userJid);
                    sb.append("/");
                    sb.append(r3);
                    Log.i(sb.toString());
                    Iterator it4 = ((AbstractCollection) r25.A06(userJid)).iterator();
                    while (it4.hasNext()) {
                        r25.A0D(userJid, r25.A03((AnonymousClass02X) it4.next()), r3);
                    }
                }
            } else if (!set2.isEmpty()) {
                C015208k r4 = this.A07.A08;
                if (!r4.A0G()) {
                    return;
                }
                if (r4 == null) {
                    throw null;
                } else if (!set2.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder("participant-user-store/onDevicesAdded/");
                    sb2.append(userJid);
                    sb2.append("/");
                    sb2.append(r17);
                    Log.i(sb2.toString());
                    Set A062 = r4.A06(userJid);
                    HashSet<C05340Od> hashSet2 = new HashSet();
                    Iterator it5 = ((AbstractCollection) A062).iterator();
                    while (it5.hasNext()) {
                        C05340Od A032 = r4.A03((AnonymousClass02X) it5.next());
                        AnonymousClass1M5 r11 = (AnonymousClass1M5) A032.A01.get(userJid);
                        if (r11 == null) {
                            StringBuilder sb3 = new StringBuilder("GroupParticipants/addDevices/participant ");
                            sb3.append(userJid);
                            sb3.append(" doesn't exist");
                            Log.w(sb3.toString());
                        } else {
                            Iterator it6 = r17.iterator();
                            while (true) {
                                C28351Tz r1 = (C28351Tz) it6;
                                if (!r1.hasNext()) {
                                    break;
                                }
                                AnonymousClass1M4 r32 = new AnonymousClass1M4((DeviceJid) r1.next(), false);
                                ConcurrentHashMap concurrentHashMap = r11.A04;
                                DeviceJid deviceJid = r32.A01;
                                if (!concurrentHashMap.containsKey(deviceJid)) {
                                    concurrentHashMap.put(deviceJid, r32);
                                }
                            }
                            if (!set2.isEmpty()) {
                                A032.A06();
                            }
                        }
                        hashSet2.add(A032);
                    }
                    for (C05340Od r0 : hashSet2) {
                        r4.A0E(userJid, r0, false);
                    }
                }
            } else if (!set.isEmpty()) {
                C015208k r42 = this.A07.A08;
                if (!r42.A0G()) {
                    return;
                }
                if (r42 == null) {
                    throw null;
                } else if (!set.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder("participant-user-store/onDevicesRemoved/");
                    sb4.append(userJid);
                    sb4.append("/");
                    sb4.append(r18);
                    Log.i(sb4.toString());
                    Set A063 = r42.A06(userJid);
                    HashSet<C05340Od> hashSet3 = new HashSet();
                    Iterator it7 = ((AbstractCollection) A063).iterator();
                    while (it7.hasNext()) {
                        C05340Od A033 = r42.A03((AnonymousClass02X) it7.next());
                        AnonymousClass1M5 r9 = (AnonymousClass1M5) A033.A01.get(userJid);
                        if (r9 == null) {
                            StringBuilder sb5 = new StringBuilder("GroupParticipants/removeDevices/participant ");
                            sb5.append(userJid);
                            sb5.append(" doesn't exist");
                            Log.w(sb5.toString());
                        } else {
                            Iterator it8 = r18.iterator();
                            while (true) {
                                C28351Tz r12 = (C28351Tz) it8;
                                if (!r12.hasNext()) {
                                    break;
                                }
                                r9.A04.remove(r12.next());
                            }
                            if (!set.isEmpty()) {
                                A033.A07();
                                A033.A06();
                            }
                        }
                        hashSet3.add(A033);
                    }
                    for (C05340Od r02 : hashSet3) {
                        r42.A0E(userJid, r02, true);
                    }
                }
            }
        }
    }

    public void A03(UserJid userJid, C05350Oe r6, C05350Oe r7, C05350Oe r8) {
        if (!r8.A00.isEmpty() && this.A09.A03()) {
            Set A012 = A01(userJid);
            C001400w r2 = this.A04;
            r2.A00.execute(new RunnableEBaseShape0S0300000_I0_0(this, A012, r8, 35));
        }
        A04(userJid, r6, r7, r8);
    }

    public void A04(UserJid userJid, C05350Oe r21, C05350Oe r22, C05350Oe r23) {
        boolean z = this.A02.A00.getBoolean("security_notifications", false);
        if (this.A08.A05.A03() && z) {
            StringBuilder A0S = AnonymousClass008.A0S("device-change-manager/showDeviceChangeSecurityNotifications/device-added:");
            A0S.append(r22.toString());
            A0S.append(", device-removed:");
            A0S.append(r23.toString());
            Log.d(A0S.toString());
            AnonymousClass01I r1 = this.A00;
            if (r1.A09(userJid)) {
                Iterator it = ((AbstractCollection) this.A05.A0A()).iterator();
                while (it.hasNext()) {
                    AnonymousClass02N r8 = (AnonymousClass02N) it.next();
                    if (!r1.A09(r8)) {
                        this.A06.A0d(this.A0A.A02(r8, this.A01.A05(), userJid, r22.A00.size(), r23.A00.size()));
                    }
                }
            } else if (!r21.A00.isEmpty()) {
                if (this.A05.A0E(userJid)) {
                    this.A06.A0d(this.A0A.A02(userJid, this.A01.A05(), userJid, r22.A00.size(), r23.A00.size()));
                }
                r1.A04();
                UserJid userJid2 = r1.A03;
                if (userJid2 != null) {
                    Set A012 = A01(userJid2);
                    Iterator it2 = ((AbstractCollection) A01(userJid)).iterator();
                    while (it2.hasNext()) {
                        AnonymousClass02X r13 = (AnonymousClass02X) it2.next();
                        if (((AbstractCollection) A012).contains(r13)) {
                            Set set = this.A07.A01(r13).A03().A00;
                            if (set.contains(userJid)) {
                                r1.A04();
                                if (set.contains(r1.A03) || AnonymousClass1VY.A0T(r13)) {
                                    this.A06.A0d(this.A0A.A02(r13, this.A01.A05(), userJid, r22.A00.size(), r23.A00.size()));
                                }
                            }
                        }
                    }
                    return;
                }
                throw null;
            }
        }
    }
}
