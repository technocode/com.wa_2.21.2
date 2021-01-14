package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0OT  reason: invalid class name */
public class AnonymousClass0OT {
    public static final Set A0d = new HashSet(Arrays.asList("offer", "accept", "reject", "enc_rekey"));
    public static final AnonymousClass0OS[] A0e = new AnonymousClass0OS[0];
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final AnonymousClass009 A04;
    public final AnonymousClass01I A05;
    public final C000300f A06;
    public final C03170Fb A07;
    public final C017009c A08;
    public final AnonymousClass01A A09;
    public final AnonymousClass00S A0A;
    public final AnonymousClass00G A0B;
    public final AnonymousClass01X A0C;
    public final C014508d A0D;
    public final C002701k A0E;
    public final AnonymousClass0EO A0F;
    public final AnonymousClass01S A0G;
    public final C03240Fj A0H;
    public final C015808q A0I;
    public final C11300g3 A0J;
    public final C03230Fi A0K;
    public final C28991Wn A0L;
    public final AnonymousClass2VK A0M;
    public final C03340Fu A0N;
    public final C01970Ad A0O;
    public final C03100Eu A0P;
    public final C03300Fq A0Q;
    public final AnonymousClass0GM A0R;
    public final AnonymousClass0GM A0S;
    public final AnonymousClass0GO A0T;
    public final AnonymousClass0GO A0U;
    public final AnonymousClass0AL A0V;
    public final C03260Fm A0W;
    public final AbstractC29211Xn A0X;
    public final C03190Fd A0Y;
    public final AnonymousClass3WM A0Z;
    public final LinkedHashMap A0a = new LinkedHashMap();
    public final Map A0b = new ConcurrentHashMap();
    public final Map A0c = new HashMap();

    public AnonymousClass0OT(AnonymousClass00S r3, C002701k r4, AnonymousClass009 r5, AnonymousClass01I r6, C03170Fb r7, AnonymousClass00G r8, C000300f r9, C03190Fd r10, C03230Fi r11, AnonymousClass01A r12, AnonymousClass01X r13, C03240Fj r14, AnonymousClass0AL r15, C01970Ad r16, C03100Eu r17, AnonymousClass0EO r18, C015808q r19, C03260Fm r20, C28991Wn r21, C014508d r22, C03300Fq r23, C03310Fr r24, AbstractC29211Xn r25, AnonymousClass2VK r26, C03340Fu r27, C017009c r28, AnonymousClass01S r29, C11300g3 r30, AnonymousClass0GM r31, AnonymousClass0GO r32, AnonymousClass3WM r33, AnonymousClass0GM r34, AnonymousClass0GO r35) {
        this.A0A = r3;
        this.A0E = r4;
        if (r5 != null) {
            this.A04 = r5;
            if (r6 != null) {
                this.A05 = r6;
                if (r7 != null) {
                    this.A07 = r7;
                    this.A0B = r8;
                    if (r9 != null) {
                        this.A06 = r9;
                        if (r10 != null) {
                            this.A0Y = r10;
                            if (r11 != null) {
                                this.A0K = r11;
                                if (r12 != null) {
                                    this.A09 = r12;
                                    if (r13 != null) {
                                        this.A0C = r13;
                                        if (r14 != null) {
                                            this.A0H = r14;
                                            if (r15 != null) {
                                                this.A0V = r15;
                                                if (r16 != null) {
                                                    this.A0O = r16;
                                                    if (r17 != null) {
                                                        this.A0P = r17;
                                                        if (r18 != null) {
                                                            this.A0F = r18;
                                                            if (r19 != null) {
                                                                this.A0I = r19;
                                                                if (r20 != null) {
                                                                    this.A0W = r20;
                                                                    if (r21 != null) {
                                                                        this.A0L = r21;
                                                                        this.A0D = r22;
                                                                        if (r23 != null) {
                                                                            this.A0Q = r23;
                                                                            if (r25 != null) {
                                                                                this.A0X = r25;
                                                                                if (r26 != null) {
                                                                                    this.A0M = r26;
                                                                                    if (r27 != null) {
                                                                                        this.A0N = r27;
                                                                                        if (r28 != null) {
                                                                                            this.A08 = r28;
                                                                                            if (r29 != null) {
                                                                                                this.A0G = r29;
                                                                                                this.A0J = r30;
                                                                                                this.A0S = r31;
                                                                                                this.A0U = r32;
                                                                                                this.A0Z = r33;
                                                                                                if (r24 != null) {
                                                                                                    this.A0R = r34;
                                                                                                    this.A0T = r35;
                                                                                                    return;
                                                                                                }
                                                                                                throw null;
                                                                                            }
                                                                                            throw null;
                                                                                        }
                                                                                        throw null;
                                                                                    }
                                                                                    throw null;
                                                                                }
                                                                                throw null;
                                                                            }
                                                                            throw null;
                                                                        }
                                                                        throw null;
                                                                    }
                                                                    throw null;
                                                                }
                                                                throw null;
                                                            }
                                                            throw null;
                                                        }
                                                        throw null;
                                                    }
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static final int A00(String str) {
        switch (str.hashCode()) {
            case -1073880421:
                if (str.equals("missed")) {
                    return 2;
                }
                break;
            case -934710369:
                if (str.equals("reject")) {
                    return 4;
                }
                break;
            case -665462704:
                if (str.equals("unavailable")) {
                    return 3;
                }
                break;
            case -579210487:
                if (str.equals("connected")) {
                    return 5;
                }
                break;
            case -123173735:
                if (str.equals("canceled")) {
                    return 1;
                }
                break;
        }
        return 0;
    }

    public static long A01(AnonymousClass0M5 r3) {
        String str;
        AnonymousClass0OS A0A2 = r3.A0A("last");
        if (A0A2 == null || (str = A0A2.A03) == null) {
            return System.currentTimeMillis();
        }
        if ("deny".equals(str) || "error".equals(str) || "none".equals(str)) {
            return 0;
        }
        return Long.parseLong(str) * 1000;
    }

    public static AnonymousClass0M5 A02(AnonymousClass02P r3, int i, String str, Integer num) {
        String str2;
        int i2 = r3.A01;
        int i3 = r3.A00;
        if (i3 == 0) {
            str2 = "msg";
        } else if (i3 == 1) {
            str2 = "pkmsg";
        } else if (i3 == 2) {
            str2 = "skmsg";
        } else if (i3 == 3) {
            str2 = "frskmsg";
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Unsupported ciphertext type ", i3));
        }
        return new AnonymousClass0M5("enc", (AnonymousClass0OS[]) ((AbstractCollection) A06(i2, str2, i, str, num)).toArray(A0e), null, r3.A02);
    }

    public static final AnonymousClass0M5 A03(AnonymousClass1XZ r12) {
        int i;
        int i2 = r12.A01;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                ArrayList arrayList = new ArrayList();
                Jid jid = r12.A06;
                if (jid == null) {
                    jid = AnonymousClass0QU.A00;
                }
                arrayList.add(new AnonymousClass0OS("jid", jid));
                switch (i2) {
                    case 1:
                        AnonymousClass008.A1F("type", "clear", arrayList);
                        if (r12 instanceof AnonymousClass3L3) {
                            String str = ((AnonymousClass3L3) r12).A00;
                            if (!TextUtils.isEmpty(str)) {
                                AnonymousClass008.A1F("kind", str, arrayList);
                                break;
                            }
                        }
                        break;
                    case 2:
                        AnonymousClass008.A1F("type", "delete", arrayList);
                        break;
                    case 3:
                        AnonymousClass008.A1F("type", "archive", arrayList);
                        break;
                    case 4:
                        AnonymousClass008.A1F("type", "unarchive", arrayList);
                        break;
                    case 5:
                        AnonymousClass008.A1F("type", "mute", arrayList);
                        long j = r12.A02;
                        if (j != -1) {
                            arrayList.add(new AnonymousClass0OS("mute", Long.toString(j / 1000), null, (byte) 0));
                            break;
                        } else {
                            AnonymousClass008.A1F("mute", "-1", arrayList);
                            break;
                        }
                    case 6:
                        AnonymousClass008.A1F("type", "mute", arrayList);
                        break;
                    case 7:
                    default:
                        AnonymousClass00E.A07(false);
                        break;
                    case 8:
                        AnonymousClass008.A1F("type", "unstar", arrayList);
                        break;
                    case 9:
                        arrayList.add(new AnonymousClass0OS("type", "spam", null, (byte) 0));
                        AnonymousClass008.A1F("spam", "false", arrayList);
                        break;
                    case 10:
                        AnonymousClass008.A1F("type", "modify_tag", arrayList);
                        break;
                    case 11:
                        arrayList.add(new AnonymousClass0OS("type", "pin", null, (byte) 0));
                        arrayList.add(new AnonymousClass0OS("pin", String.valueOf(r12.A03 / 1000), null, (byte) 0));
                        break;
                    case 12:
                        AnonymousClass008.A1F("type", "pin", arrayList);
                        break;
                    case 13:
                        AnonymousClass008.A1F("type", "modify", arrayList);
                        UserJid userJid = r12.A07;
                        if (userJid != null) {
                            AnonymousClass008.A15("new_jid", userJid, arrayList);
                        }
                        UserJid userJid2 = r12.A08;
                        if (userJid2 != null) {
                            AnonymousClass008.A15("old_jid", userJid2, arrayList);
                            break;
                        }
                        break;
                    case 14:
                        AnonymousClass008.A1F("type", "ephemeral", arrayList);
                        break;
                }
                long j2 = r12.A05;
                if (j2 != 0) {
                    arrayList.add(new AnonymousClass0OS("t", Long.toString(j2 / 1000), null, (byte) 0));
                }
                long j3 = r12.A02;
                if (j3 != 0 && r12.A01 == 1) {
                    arrayList.add(new AnonymousClass0OS("before", Long.toString(j3 / 1000), null, (byte) 0));
                }
                int i3 = r12.A01;
                if ((i3 == 1 || i3 == 2 || i3 == 10 || i3 == 14) && (i = r12.A00) > 0 && i < 1000000) {
                    arrayList.add(new AnonymousClass0OS("modify_tag", Integer.toString(i), null, (byte) 0));
                }
                if (r12.A0A) {
                    AnonymousClass008.A1F("star", "true", arrayList);
                }
                return new AnonymousClass0M5("chat", (AnonymousClass0OS[]) arrayList.toArray(A0e), null, null);
            case 7:
            default:
                return null;
        }
    }

    public static final AnonymousClass0M5 A04(String str, List list) {
        int size = list.size();
        AnonymousClass0M5[] r7 = new AnonymousClass0M5[size];
        for (int i = 0; i < size; i++) {
            r7[i] = new AnonymousClass0M5("participant", new AnonymousClass0OS[]{new AnonymousClass0OS("jid", (Jid) list.get(i))}, null, null);
        }
        return new AnonymousClass0M5(str, null, r7, null);
    }

    public static AnonymousClass0M5 A05(byte[] bArr) {
        C04970Mo A082 = C02840Dr.A08();
        AbstractC04160Jh A0B2 = C75763dS.A02.AQb();
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        A0B2.A02();
        C75763dS r1 = (C75763dS) A0B2.A00;
        r1.A00 |= 1;
        r1.A01 = A002;
        A082.A02();
        C02840Dr r12 = (C02840Dr) A082.A00;
        if (r12 != null) {
            r12.A05 = (C75763dS) A0B2.A01();
            r12.A00 |= 512;
            return new AnonymousClass0M5("call", null, null, A082.A01().A09());
        }
        throw null;
    }

    public static List A06(int i, String str, int i2, String str2, Integer num) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("v", Integer.toString(i), null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("type", str, null, (byte) 0));
        if (i2 != 0) {
            arrayList.add(new AnonymousClass0OS("count", String.valueOf(i2), null, (byte) 0));
        }
        if (str2 != null) {
            arrayList.add(new AnonymousClass0OS("mediatype", str2, null, (byte) 0));
        }
        if (num != null && num.intValue() > 0) {
            arrayList.add(new AnonymousClass0OS("duration", String.valueOf(num), null, (byte) 0));
        }
        return arrayList;
    }

    public static List A07(Map map, Map map2, List list, Map map3, int i, String str, Integer num, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                DeviceJid deviceJid = (DeviceJid) entry.getKey();
                String str2 = (String) map.get(DeviceJid.of(deviceJid.userJid));
                if (str2 == null || str2.trim().length() == 0) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("Connection/createParticipantsListWithEnc:empty ephemeral setting ephemeralSetting=");
                    boolean z2 = false;
                    if (str2 == null) {
                        z2 = true;
                    }
                    A0S2.append(z2);
                    Log.w(A0S2.toString());
                }
                AnonymousClass02P r2 = (AnonymousClass02P) entry.getValue();
                String str3 = null;
                Integer num2 = null;
                if (z) {
                    str3 = str;
                    num2 = num;
                }
                arrayList.add(new AnonymousClass0M5("to", A0B(deviceJid, str2), A02(r2, i, str3, num2)));
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid2 = (DeviceJid) it.next();
                arrayList.add(new AnonymousClass0M5("to", A0B(deviceJid2, (String) map.get(DeviceJid.of(deviceJid2.userJid))), null, null));
            }
        }
        if (map3 != null) {
            for (Map.Entry entry2 : map3.entrySet()) {
                arrayList.add(new AnonymousClass0M5("to", A0B((DeviceJid) entry2.getKey(), null), A02((AnonymousClass02P) entry2.getValue(), i, str, num)));
            }
        }
        return arrayList;
    }

    public static final void A08(AnonymousClass1XJ r5, AnonymousClass0M5 r6) {
        AnonymousClass02P r0;
        String str;
        AnonymousClass02P A0f = C28051Sr.A0f(r6);
        if (A0f.A00 == 2) {
            r5.A08 = A0f;
        } else {
            r5.A07 = A0f;
        }
        int A052 = r6.A05("count", 0);
        if (r5.A0H == null || r5.A01() == A052) {
            r5.A0H = Integer.valueOf(A052);
            String str2 = null;
            AnonymousClass0OS A0A2 = r6.A0A("mediareason");
            if (!(A0A2 == null || (str = A0A2.A03) == null)) {
                if (str.equals("retry")) {
                    Boolean bool = r5.A0C;
                    if (bool == null || bool.booleanValue()) {
                        r5.A0C = Boolean.TRUE;
                    } else {
                        throw new AnonymousClass1XC("mediareason retry may not mismatch between two enc nodes in the same message");
                    }
                } else {
                    throw new AnonymousClass1XC(AnonymousClass008.A0K("unknown mediareason ", str));
                }
            }
            int A053 = r6.A05("duration", -1);
            if (A053 >= 0) {
                r5.A0D = Integer.valueOf(A053);
            }
            AnonymousClass02P r2 = r5.A08;
            if (r2 == null || (r0 = r5.A07) == null || r2.A01 == r0.A01) {
                AnonymousClass0OS A0A3 = r6.A0A("decrypt-fail");
                if (A0A3 != null) {
                    str2 = A0A3.A03;
                }
                if ("hide".equals(str2)) {
                    r5.A00 = 1;
                } else {
                    r5.A00 = 0;
                }
            } else {
                throw new AnonymousClass1XC("ciphertext version may not mismatch between two enc nodes in the same message");
            }
        } else {
            throw new AnonymousClass1XC("retry count may not mismatch between two enc nodes in the same message");
        }
    }

    public static final boolean A09(Jid jid) {
        return jid != null && "broadcast".equals(jid.getServer()) && !AnonymousClass1VY.A0b(jid);
    }

    public static final AnonymousClass0OS[] A0A(AnonymousClass02N r5, AnonymousClass02N r6, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("to", r5));
        arrayList.add(new AnonymousClass0OS("id", str, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("type", str2, null, (byte) 0));
        if (r6 != null) {
            arrayList.add(new AnonymousClass0OS("participant", r6));
        }
        return (AnonymousClass0OS[]) arrayList.toArray(A0e);
    }

    public static AnonymousClass0OS[] A0B(DeviceJid deviceJid, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("jid", deviceJid));
        if (str != null) {
            arrayList.add(new AnonymousClass0OS("eph_setting", str, null, (byte) 0));
        }
        return (AnonymousClass0OS[]) arrayList.toArray(A0e);
    }

    public static final AnonymousClass0OS[] A0C(String str, String str2, Jid jid, Jid jid2, UserJid userJid) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("to", jid));
        AnonymousClass008.A1F("id", str, arrayList);
        if (str2 != null) {
            AnonymousClass008.A1F("type", str2, arrayList);
        }
        if (jid2 != null) {
            arrayList.add(new AnonymousClass0OS("participant", jid2));
        }
        if (userJid != null) {
            AnonymousClass008.A15("recipient", userJid, arrayList);
        }
        return (AnonymousClass0OS[]) arrayList.toArray(A0e);
    }

    public final AnonymousClass1XX A0D(AnonymousClass0M5 r14) {
        String str;
        String str2;
        ArrayList arrayList;
        AnonymousClass009 r2 = this.A04;
        Jid A082 = r14.A08(Jid.class, "participant", r2);
        HashMap hashMap = new HashMap();
        Jid A083 = r14.A08(Jid.class, "from", r2);
        AnonymousClass0OS A0A2 = r14.A0A("id");
        if (A0A2 != null) {
            str = A0A2.A03;
        } else {
            str = null;
        }
        AnonymousClass0OS A0A3 = r14.A0A("type");
        if (A0A3 != null) {
            str2 = A0A3.A03;
        } else {
            str2 = null;
        }
        if (hashMap.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(hashMap.values());
        }
        return new AnonymousClass1XX(A083, "notification", str, str2, null, A082, null, null, 0, arrayList);
    }

    public void A0E() {
        this.A0T.ARM(new AnonymousClass0M5("presence", new AnonymousClass0OS[]{new AnonymousClass0OS("type", "available", null, (byte) 0)}, null, null));
    }

    public final void A0F(long j, AnonymousClass0M5 r10) {
        C28991Wn r1 = this.A0L;
        AbstractC28981Wm A012 = r1.A01(0, j);
        if (!(A012 == null && (A012 = r1.A01(1, j)) == null)) {
            int i = A012.A00;
            if (i != 0) {
                A012.A02(i, A012.A06.A04() - A012.A01);
            }
            A012.A02(0, A012.A06.A04() - A012.A02);
            StringBuilder sb = new StringBuilder("LoggableStanza/onProcessingDone ");
            sb.append(A012);
            Log.i(sb.toString());
            C28991Wn r3 = A012.A08;
            synchronized (r3) {
                r3.A02(A012.A03).remove(Long.valueOf(A012.A04));
            }
        }
        this.A0T.ARM(r10);
    }

    public final void A0G(AnonymousClass02N r8, String str, AnonymousClass02N r10, Integer num, String str2, String str3) {
        AnonymousClass02N r5 = r8;
        if (A09(r10)) {
            r5 = r10;
            r10 = r8;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("type", str3, null, (byte) 0));
        if (num != null) {
            arrayList.add(new AnonymousClass0OS("reason", String.valueOf(num), null, (byte) 0));
        }
        if (str2 != null) {
            arrayList.add(new AnonymousClass0OS("sub-type", str2, null, (byte) 0));
        }
        this.A0T.ARM(new AnonymousClass0M5("receipt", A0C(str, "error", r5, r10, null), new AnonymousClass0M5("error", (AnonymousClass0OS[]) arrayList.toArray(A0e), null, null)));
    }

    public void A0H(AnonymousClass02U r8, String str, AnonymousClass0OS[] r10, Runnable runnable, AnonymousClass1XK r12, AnonymousClass1Xa r13) {
        String hexString;
        if (r13 != null) {
            hexString = r13.A01;
        } else {
            int i = this.A00 + 1;
            this.A00 = i;
            hexString = Integer.toHexString(i);
        }
        this.A0b.put(hexString, new AnonymousClass3KJ(str, runnable, r12));
        AnonymousClass0M5 r3 = new AnonymousClass0M5(str, r10, null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("id", hexString, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("xmlns", "w:g2", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("type", "set", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("to", r8));
        if (r13 != null) {
            arrayList.add(new AnonymousClass0OS("web", r13.A00, null, (byte) 0));
        }
        this.A0T.ARM(new AnonymousClass0M5("iq", (AnonymousClass0OS[]) arrayList.toArray(A0e), r3));
    }

    public final void A0I(AnonymousClass02U r10, List list, String str, String str2, AnonymousClass1Xa r14) {
        int size = list.size();
        AnonymousClass0M5[] r3 = new AnonymousClass0M5[size];
        for (int i = 0; i < size; i++) {
            r3[i] = new AnonymousClass0M5("participant", new AnonymousClass0OS[]{new AnonymousClass0OS("jid", (Jid) list.get(i))}, null, null);
        }
        AnonymousClass0M5 r4 = new AnonymousClass0M5(str2, null, r3, null);
        int i2 = 5;
        if (r14 == null) {
            i2 = 4;
        }
        AnonymousClass0OS[] r32 = new AnonymousClass0OS[i2];
        r32[0] = new AnonymousClass0OS("id", str, null, (byte) 0);
        r32[1] = new AnonymousClass0OS("xmlns", "w:g2", null, (byte) 0);
        r32[2] = new AnonymousClass0OS("type", "set", null, (byte) 0);
        r32[3] = new AnonymousClass0OS("to", r10);
        if (r14 != null) {
            r32[4] = new AnonymousClass0OS("web", r14.A00, null, (byte) 0);
        }
        this.A0T.ARM(new AnonymousClass0M5("iq", r32, r4));
    }

    public final void A0J(UserJid userJid, AnonymousClass0M5 r10) {
        if (r10 != null) {
            AnonymousClass0M5 A0C2 = r10.A0C(0);
            if (A0C2 == null || !"enc".equals(A0C2.A00)) {
                throw new AnonymousClass1XC("invalid location node");
            }
            AnonymousClass02P A0f = C28051Sr.A0f(A0C2);
            String A0G2 = r10.A0G("elapsed", null);
            long j = 0;
            if (A0G2 != null) {
                j = (long) Integer.parseInt(A0G2);
            }
            C11300g3 r1 = this.A0J;
            AnonymousClass008.A14("xmpp/reader/on-location-update jid: ", userJid);
            AbstractC11290g2 r5 = r1.A00;
            Message obtain = Message.obtain(null, 0, 117, 0, A0f);
            Bundle data = obtain.getData();
            data.putParcelable("jid", userJid);
            data.putLong("elapsed", j);
            ((HandlerC11280g1) r5).A00(obtain);
            return;
        }
        throw new AnonymousClass1XC("Missing location node");
    }

    public final void A0K(C007303n r12, String str, AnonymousClass02N r14, DeviceJid deviceJid, UserJid userJid, String[] strArr, long j) {
        AnonymousClass0M5[] r3;
        Pair A012 = AnonymousClass0ZG.A01(r12.A00, r14, deviceJid);
        if (strArr != null) {
            int length = strArr.length;
            AnonymousClass0M5[] r7 = new AnonymousClass0M5[length];
            for (int i = 0; i < length; i++) {
                r7[i] = new AnonymousClass0M5("item", new AnonymousClass0OS[]{new AnonymousClass0OS("id", strArr[i], null, (byte) 0)}, null, null);
            }
            r3 = new AnonymousClass0M5[]{new AnonymousClass0M5("list", null, r7, null)};
        } else {
            r3 = null;
        }
        A0F(j, new AnonymousClass0M5("receipt", A0C(r12.A01, str, (Jid) A012.first, (Jid) A012.second, userJid), r3, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v103, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:1256:0x1c27, code lost:
        if (r1 == false) goto L_0x1bd3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1258:0x1c31, code lost:
        if (r1 == false) goto L_0x1bd3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1260:0x1c3b, code lost:
        if (r1 == false) goto L_0x1bd3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1262:0x1c43, code lost:
        if (r1 == false) goto L_0x1bd3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:680:0x0dba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(X.AnonymousClass0M5 r48) {
        /*
        // Method dump skipped, instructions count: 8834
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OT.A0L(X.0M5):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.whatsapp.jid.Jid, X.02N] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r4.equals("sender") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r4.equals("delivery") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if ("sender".equals(r4) != false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0222  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.AnonymousClass0M5 r21, java.lang.String r22, X.AnonymousClass1XX r23, boolean r24, X.C448521x r25) {
        /*
        // Method dump skipped, instructions count: 574
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OT.A0M(X.0M5, java.lang.String, X.1XX, boolean, X.21x):void");
    }

    public final void A0N(AnonymousClass1XX r9, AnonymousClass0M5 r10) {
        String str;
        Jid jid = r9.A01;
        String str2 = r9.A05;
        if (!"receipt".equals(str2) || !"delivery".equals(r9.A08)) {
            str = r9.A08;
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        String str3 = r9.A07;
        if (str3 != null) {
            AnonymousClass008.A1D("id", str3, arrayList);
        } else {
            AnonymousClass00E.A08(false, "received stanza with null id");
        }
        if (jid != null) {
            arrayList.add(new AnonymousClass0OS("to", jid));
        } else {
            AnonymousClass00E.A08(false, "received stanza with null to");
        }
        if (str2 != null) {
            AnonymousClass008.A1D("class", str2, arrayList);
        } else {
            AnonymousClass00E.A08(false, "received stanza with null class");
        }
        if (str != null) {
            AnonymousClass008.A1D("type", str, arrayList);
        }
        String str4 = r9.A04;
        if (str4 != null) {
            AnonymousClass008.A1D("category", str4, arrayList);
        }
        Jid jid2 = r9.A02;
        if (jid2 != null) {
            arrayList.add(new AnonymousClass0OS("participant", jid2));
        }
        UserJid userJid = r9.A03;
        if (userJid != null) {
            AnonymousClass008.A15("recipient", userJid, arrayList);
        }
        String str5 = r9.A06;
        if (!TextUtils.isEmpty(str5) && !"0".equals(str5)) {
            arrayList.add(new AnonymousClass0OS("edit", str5));
        }
        List list = r9.A09;
        if (list != null) {
            arrayList.addAll(list);
        }
        AnonymousClass0OS[] r3 = (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]);
        AnonymousClass0M5[] r1 = null;
        if (r10 != null) {
            r1 = new AnonymousClass0M5[]{r10};
        }
        A0F(r9.A00, new AnonymousClass0M5("ack", r3, r1, null));
    }

    public final void A0O(String str, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, String str3) {
        AnonymousClass0M5[] r5 = {new AnonymousClass0M5(str3, new AnonymousClass0OS[]{new AnonymousClass0OS("call-id", str2, null, (byte) 0), new AnonymousClass0OS("call-creator", deviceJid2)}, null, null)};
        this.A0T.ARM(new AnonymousClass0M5("receipt", new AnonymousClass0OS[]{new AnonymousClass0OS("to", deviceJid), new AnonymousClass0OS("id", str, null, (byte) 0)}, r5, null));
    }

    public void A0P(String str, C007303n r8, UserJid userJid, String str2, AnonymousClass1XK r11, AnonymousClass1XD r12) {
        if (str == null) {
            int i = this.A00 + 1;
            this.A00 = i;
            str = Integer.toHexString(i);
        }
        this.A0b.put(str, new C70313Ko(r11, r12));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("kind", "status", null, (byte) 0));
        AnonymousClass02N r2 = r8.A00;
        if (r2 != null) {
            arrayList.add(new AnonymousClass0OS("jid", r2));
            arrayList.add(new AnonymousClass0OS("index", r8.A01, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("owner", String.valueOf(r8.A02), null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("chat", userJid));
            arrayList.add(new AnonymousClass0OS("checksum", str2, null, (byte) 0));
            A0S(str, "d", new AnonymousClass0M5("read", (AnonymousClass0OS[]) arrayList.toArray(A0e), null, null));
            return;
        }
        throw null;
    }

    public final void A0Q(String str, String str2) {
        String str3;
        if ("11".equals(str)) {
            StringBuilder A0S2 = AnonymousClass008.A0S(str2);
            if (this.A0D.A0A.isWriteLocked()) {
                str3 = "-db-locked";
            } else {
                str3 = "";
            }
            A0S2.append(str3);
            this.A04.A04("offline-count-11", A0S2.toString(), false);
        }
    }

    public final void A0R(String str, String str2, Jid jid, Integer num, List list, List list2, AnonymousClass1XK r19, AnonymousClass1XD r20) {
        AnonymousClass0M5[] r0;
        String str3;
        int intValue;
        String str4;
        if (str2 == null) {
            int i = this.A00 + 1;
            this.A00 = i;
            str2 = Integer.toHexString(i);
        }
        this.A0b.put(str2, new C70373Ku(r19, r20));
        if (list != null) {
            int size = list.size();
            r0 = new AnonymousClass0M5[size];
            for (int i2 = 0; i2 < size; i2++) {
                C007303n r5 = (C007303n) list.get(i2);
                AnonymousClass0OS[] r4 = new AnonymousClass0OS[2];
                r4[0] = new AnonymousClass0OS("index", r5.A01, null, (byte) 0);
                if (r5.A02) {
                    str4 = "true";
                } else {
                    str4 = "false";
                }
                r4[1] = new AnonymousClass0OS("owner", str4, null, (byte) 0);
                r0[i2] = new AnonymousClass0M5("item", r4, null, null);
            }
        } else {
            r0 = null;
        }
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(this.A0K.A02((C64392y7) it.next()));
            }
            r0 = (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AnonymousClass0OS("type", str, null, (byte) 0));
        arrayList2.add(new AnonymousClass0OS("jid", jid));
        if (num != null && (intValue = num.intValue()) > 0 && intValue < 1000000) {
            arrayList2.add(new AnonymousClass0OS("modify_tag", num.toString(), null, (byte) 0));
        }
        AnonymousClass0M5 r1 = new AnonymousClass0M5("action", (AnonymousClass0OS[]) null, new AnonymousClass0M5("chat", (AnonymousClass0OS[]) arrayList2.toArray(A0e), r0, null));
        if ("clear".equals(str)) {
            str3 = "f";
        } else {
            str3 = "m";
        }
        A0S(str2, str3, r1);
    }

    public final void A0S(String str, String str2, AnonymousClass0M5 r4) {
        A0U(str, str2, this.A0U.ARO(r4));
    }

    public void A0T(String str, String str2, boolean z, AnonymousClass02N r14, AnonymousClass02N r15) {
        AbstractC04160Jh A0B2 = AnonymousClass0Ms.A0T.AQb();
        AnonymousClass0NK r1 = (AnonymousClass0NK) AnonymousClass0N3.A05.AQb();
        r1.A06(r14.getRawString());
        r1.A07(z);
        r1.A02();
        AnonymousClass0N3.A08((AnonymousClass0N3) r1.A00, str);
        A0B2.A02();
        AnonymousClass0Ms.A08((AnonymousClass0Ms) A0B2.A00, (AnonymousClass0N3) r1.A01());
        if (r15 != null) {
            String rawString = r15.getRawString();
            A0B2.A02();
            AnonymousClass0Ms r12 = (AnonymousClass0Ms) A0B2.A00;
            if (rawString != null) {
                r12.A01 |= 16;
                r12.A0H = rawString;
            } else {
                throw null;
            }
        }
        AnonymousClass0ZJ r0 = new AnonymousClass0ZJ(new C007303n(r14, z, str), str2);
        C04970Mo A082 = C02840Dr.A08();
        AnonymousClass0ZG.A0F(r0, new C64552yN(this.A05, A082, true, false, null, null));
        C02840Dr r02 = (C02840Dr) A082.A01();
        A0B2.A02();
        AnonymousClass0Ms r13 = (AnonymousClass0Ms) A0B2.A00;
        if (r02 != null) {
            r13.A0D = r02;
            r13.A01 |= 2;
            A0U(str, "v", this.A0U.ARO(new AnonymousClass0M5("action", new AnonymousClass0OS[]{new AnonymousClass0OS("add", "relay", null, (byte) 0)}, new AnonymousClass0M5("message", null, null, A0B2.A01().A09()))));
            return;
        }
        throw null;
    }

    public final void A0U(String str, String str2, byte[] bArr) {
        AnonymousClass3WM r4 = this.A0Z;
        AnonymousClass0JK r0 = r4.A00;
        byte[] bArr2 = r0.A05;
        byte[] bArr3 = r0.A06;
        if (bArr2 != null && bArr3 != null && bArr != null) {
            try {
                byte[] bArr4 = new byte[16];
                r4.A01.nextBytes(bArr4);
                byte[] A022 = AnonymousClass3WM.A02(bArr2, bArr4, bArr);
                if (A022 == null) {
                    Log.e("qr encrypt aes fail");
                    return;
                }
                byte[] A002 = AnonymousClass3WM.A00(bArr4, A022);
                byte[] A012 = AnonymousClass3WM.A01(bArr3, A002);
                if (A012 == null) {
                    Log.e("qr encrypt mac fail");
                    return;
                }
                byte[] A003 = AnonymousClass3WM.A00(A012, A002);
                if (A003 != null) {
                    AnonymousClass0M5 r1 = new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("type", "set", null, (byte) 0), new AnonymousClass0OS("xmlns", "w:web", null, (byte) 0), new AnonymousClass0OS("id", str, null, (byte) 0)}, new AnonymousClass0M5("enc", str2 != null ? new AnonymousClass0OS[]{new AnonymousClass0OS("type", str2, null, (byte) 0)} : null, null, A003));
                    AnonymousClass008.A18("connection/sendWebEncrypted id=", str);
                    this.A0T.ARM(r1);
                }
            } catch (Exception e) {
                Log.e("qr encrypt fail ", e);
            }
        }
    }

    public void A0V(boolean z) {
        SharedPreferences sharedPreferences;
        String string;
        String str;
        int i = this.A00 + 1;
        this.A00 = i;
        String hexString = Integer.toHexString(i);
        this.A0b.put(hexString, new AnonymousClass3KE(this));
        C002701k r5 = this.A0E;
        synchronized (r5) {
            sharedPreferences = r5.A0K;
            string = sharedPreferences.getString("ab_props:sys:config_hash", null);
        }
        if (string == null || z) {
            str = "";
        } else {
            synchronized (r5) {
                str = sharedPreferences.getString("ab_props:sys:config_hash", null);
            }
        }
        AnonymousClass0M5 r52 = new AnonymousClass0M5("props", new AnonymousClass0OS[]{new AnonymousClass0OS("protocol", 1), new AnonymousClass0OS("hash", str, null, (byte) 0)}, null, null);
        this.A0T.ARM(new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("id", hexString, null, (byte) 0), new AnonymousClass0OS("xmlns", "abt", null, (byte) 0)}, r52));
    }

    public void A0W(boolean z) {
        int i = this.A00 + 1;
        this.A00 = i;
        String hexString = Integer.toHexString(i);
        this.A0b.put(hexString, new AnonymousClass3KD(this));
        String str = AbstractC000400g.A0J;
        if (str == null || z) {
            str = "";
        }
        AnonymousClass0M5 r5 = new AnonymousClass0M5("props", new AnonymousClass0OS[]{new AnonymousClass0OS("protocol", "2", null, (byte) 0), new AnonymousClass0OS("hash", str, null, (byte) 0)}, null, null);
        this.A0T.ARM(new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", hexString, null, (byte) 0), new AnonymousClass0OS("xmlns", "w", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, r5));
    }
}
