package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0IP  reason: invalid class name */
public class AnonymousClass0IP implements AnonymousClass09O {
    public final AnonymousClass009 A00;
    public final AnonymousClass0IN A01;
    public final AnonymousClass09H A02;
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final boolean A04;

    public AnonymousClass0IP(AnonymousClass009 r2, AnonymousClass09H r3, boolean z, AnonymousClass0IN r5) {
        this.A00 = r2;
        this.A02 = r3;
        this.A04 = z;
        this.A01 = r5;
    }

    public static final AnonymousClass2L9 A00(AnonymousClass0M5 r9, String str) {
        Long l;
        String str2;
        String str3;
        if (r9.A0D("error") != null) {
            AnonymousClass0M5 A0E = r9.A0E("error");
            Long valueOf = Long.valueOf(A0E.A07("backoff", 7200) * 1000);
            AnonymousClass0OS A0A = A0E.A0A("text");
            if (A0A != null) {
                str3 = A0A.A03;
            } else {
                str3 = null;
            }
            int A05 = A0E.A05("code", -1);
            long A07 = A0E.A07("backoff", -1);
            StringBuilder A0a = AnonymousClass008.A0a("connection/unisynciq/parse/", str, "/error/", "error_text= ", str3);
            A0a.append(", code: ");
            A0a.append(A05);
            A0a.append(", backoff:");
            A0a.append(A07);
            Log.w(A0a.toString());
            return new AnonymousClass2L9(false, null, valueOf, Integer.valueOf(A05));
        }
        AnonymousClass0OS A0A2 = r9.A0A("refresh");
        if (A0A2 == null || (str2 = A0A2.A03) == null) {
            l = null;
        } else {
            l = Long.valueOf(Long.parseLong(str2) * 1000);
        }
        return new AnonymousClass2L9(true, l, null, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0245 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v39, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0OS[], byte[], X.0M5[]] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0OS[], com.whatsapp.jid.Jid, byte[], X.0M5[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r6v12, types: [X.0OS[], com.whatsapp.jid.Jid, byte[], X.0M5[]] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b0, code lost:
        if (r16 != false) goto L_0x01b2;
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.concurrent.Future A01(java.lang.String r40, X.AnonymousClass2LA r41, long r42) {
        /*
        // Method dump skipped, instructions count: 1012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IP.A01(java.lang.String, X.2LA, long):java.util.concurrent.Future");
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        C47182Gu r0 = (C47182Gu) this.A03.remove(str);
        if (r0 != null) {
            r0.A00.A00(new C64212xo(str));
        } else {
            Log.w("UniSyncProtocolHelper/onDeliveryFailure missing request");
        }
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r12) {
        C47182Gu r3 = (C47182Gu) this.A03.remove(str);
        if (r3 != null) {
            AnonymousClass0M5 A0D = r12.A0D("error");
            long j = -1;
            int i = 0;
            if (A0D != null) {
                String A0G = A0D.A0G("code", null);
                if (A0G != null) {
                    i = Integer.parseInt(A0G);
                }
                String A0G2 = A0D.A0G("backoff", null);
                if (A0G2 != null) {
                    j = Long.parseLong(A0G2) * 1000;
                }
            }
            if (!r3.A02) {
                StringBuilder A0S = AnonymousClass008.A0S("UniSyncProtocolHelper/handleSyncContactError sid=");
                String str2 = r3.A01;
                A0S.append(str2);
                A0S.append(" code=");
                A0S.append(i);
                A0S.append(" backoff=");
                AnonymousClass008.A1P(A0S, j);
                this.A01.AAB(str2, 0, i, j);
            }
            r3.A00.A01(null);
            return;
        }
        Log.w("UniSyncProtocolHelper/onError missing request");
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r44) {
        String str2;
        AnonymousClass2L9 r20;
        AnonymousClass2L9 r22;
        AnonymousClass2L9 r40;
        AnonymousClass2L9 r41;
        int i;
        int i2;
        AnonymousClass0M5 r2;
        boolean z;
        C47162Gs r16;
        AnonymousClass0M5 A0D;
        String str3;
        int i3;
        AnonymousClass0M5[] r0;
        C47182Gu r02 = (C47182Gu) this.A03.remove(str);
        if (r02 != null) {
            AnonymousClass0M5 A0D2 = r44.A0D("usync");
            AnonymousClass2L9 r15 = null;
            if (A0D2 != null) {
                AnonymousClass0M5 A0E = A0D2.A0E("result");
                if (r02.A04) {
                    r20 = A00(A0E.A0E("contact"), "contact");
                    if (!r20.A03 && !r02.A02) {
                        StringBuilder A0S = AnonymousClass008.A0S("UniSyncProtocolHelper/handleSyncContactError sid=");
                        String str4 = r02.A01;
                        A0S.append(str4);
                        A0S.append(" code=");
                        Integer num = r20.A00;
                        A0S.append(num);
                        A0S.append(" backoff=");
                        Long l = r20.A01;
                        A0S.append(l);
                        Log.i(A0S.toString());
                        this.A01.AAB(str4, 0, num.intValue(), l.longValue());
                    }
                    str2 = A0E.A0E("contact").A0G("version", null);
                } else {
                    str2 = null;
                    r20 = null;
                }
                if (r02.A09) {
                    r22 = A00(A0E.A0E("sidelist"), "sidelist");
                    if (!r22.A03 && !r02.A02) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("UniSyncProtocolHelper/handleSyncSidelistError sid=");
                        String str5 = r02.A01;
                        A0S2.append(str5);
                        A0S2.append(" code=");
                        Integer num2 = r22.A00;
                        A0S2.append(num2);
                        A0S2.append(" backoff=");
                        Long l2 = r22.A01;
                        A0S2.append(l2);
                        Log.i(A0S2.toString());
                        this.A01.AAD(str5, 0, num2.intValue(), l2.longValue());
                    }
                } else {
                    r22 = null;
                }
                AnonymousClass2L9 A002 = r02.A08 ? A00(A0E.A0E("status"), "status") : null;
                AnonymousClass2L9 A003 = r02.A07 ? A00(A0E.A0E("picture"), "picture") : null;
                if (r02.A03) {
                    r15 = A00(A0E.A0E("business"), "business");
                }
                if (r02.A05) {
                    r40 = A00(A0E.A0E("devices"), "devices");
                } else {
                    r40 = null;
                }
                if (r02.A06) {
                    r41 = A00(A0E.A0E("pay"), "pay");
                } else {
                    r41 = null;
                }
                AnonymousClass0M5 A0E2 = A0D2.A0E("list");
                AnonymousClass0M5 A0D3 = A0D2.A0D("side_list");
                AnonymousClass0M5[] r03 = A0E2.A03;
                if (r03 != null) {
                    i = r03.length;
                } else {
                    i = 0;
                }
                if (A0D3 == null || (r0 = A0D3.A03) == null) {
                    i2 = 0;
                } else {
                    i2 = r0.length;
                }
                int i4 = i2 + i;
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    if (i5 < i) {
                        r2 = r03[i5];
                        z = false;
                    } else {
                        r2 = A0D3.A03[i5 - i];
                        z = true;
                    }
                    AnonymousClass009 r10 = this.A00;
                    Jid A08 = r2.A08(UserJid.class, "jid", r10);
                    if (A08 == null) {
                        r16 = new C47162Gs();
                        arrayList.add(r16);
                    } else if (hashMap.containsKey(A08)) {
                        r16 = (C47162Gs) hashMap.get(A08);
                    } else {
                        r16 = new C47162Gs();
                        hashMap.put(A08, r16);
                        arrayList.add(r16);
                    }
                    r16.A07 = UserJid.getNullable(r2.A0G("jid", null));
                    String str6 = "contact";
                    if (z) {
                        str6 = "sidelist";
                    }
                    List<AnonymousClass0M5> A0H = r2.A0H(str6);
                    if (!A0H.isEmpty()) {
                        if (r16.A0A == null) {
                            r16.A0A = new ArrayList();
                        }
                        for (AnonymousClass0M5 r8 : A0H) {
                            String A0F = r8.A0F("type");
                            int hashCode = A0F.hashCode();
                            if (hashCode != 3365) {
                                if (hashCode != 110414) {
                                    if (hashCode == 1959784951 && A0F.equals("invalid")) {
                                        i3 = 3;
                                    }
                                    throw new AnonymousClass1XC(AnonymousClass008.A0K("Invalid contact type=", A0F));
                                } else if (A0F.equals("out")) {
                                    i3 = 2;
                                } else {
                                    throw new AnonymousClass1XC(AnonymousClass008.A0K("Invalid contact type=", A0F));
                                }
                            } else if (A0F.equals("in")) {
                                i3 = 1;
                            } else {
                                throw new AnonymousClass1XC(AnonymousClass008.A0K("Invalid contact type=", A0F));
                            }
                            r16.A03 = i3;
                            String A004 = AnonymousClass0M5.A00(r8.A01);
                            if (A004 != null) {
                                r16.A0A.add(A004);
                            }
                        }
                    } else {
                        r16.A03 = 1;
                    }
                    if (r2.A0D("devices") != null) {
                        AnonymousClass0M5 A0E3 = r2.A0E("devices");
                        if (A0E3.A0D("error") != null) {
                            r16.A00 = -1;
                            StringBuilder A0S3 = AnonymousClass008.A0S("UniSyncProtocolHelper/parseUser/partial error code=");
                            A0S3.append(A0E3.A0D("error").A05("code", -1));
                            A0S3.append("; text=");
                            A0S3.append(A0E3.A0D("error").A0G("text", null));
                            A0S3.append("; jid=");
                            A0S3.append(r16.A07);
                            Log.w(A0S3.toString());
                        } else {
                            r16.A00 = 1;
                            if (!this.A04) {
                                StringBuilder A0S4 = AnonymousClass008.A0S("unisyncprotocolhelper/parseDeviceData v1 user=");
                                A0S4.append(r16.A07);
                                Log.i(A0S4.toString());
                                List<AnonymousClass0M5> A0H2 = A0E3.A0H("device");
                                if (!A0H2.isEmpty()) {
                                    if (r16.A0B == null) {
                                        r16.A0B = new HashMap();
                                    }
                                    for (AnonymousClass0M5 r1 : A0H2) {
                                        r16.A0B.put(r1.A08(DeviceJid.class, "jid", r10), 0L);
                                    }
                                }
                            } else {
                                StringBuilder A0S5 = AnonymousClass008.A0S("unisyncprotocolhelper/parseDeviceData v2 user=");
                                A0S5.append(r16.A07);
                                Log.i(A0S5.toString());
                                if (A0E3.A0D("device-list") != null) {
                                    List<AnonymousClass0M5> A0H3 = A0E3.A0D("device-list").A0H("device");
                                    if (!A0H3.isEmpty()) {
                                        if (r16.A0B == null) {
                                            r16.A0B = new HashMap();
                                        }
                                        for (AnonymousClass0M5 r102 : A0H3) {
                                            int A042 = r102.A04("id");
                                            try {
                                                UserJid userJid = r16.A07;
                                                if (userJid != null) {
                                                    r16.A0B.put(DeviceJid.getFromUserJidAndDeviceId(userJid, A042), Long.valueOf(r102.A07("key-index", 0)));
                                                } else {
                                                    throw null;
                                                }
                                            } catch (AnonymousClass02Y unused) {
                                                StringBuilder sb = new StringBuilder("Invalid device id jid=");
                                                sb.append(r16);
                                                sb.append("; id=");
                                                sb.append(A042);
                                                throw new AnonymousClass1XC(sb.toString());
                                            }
                                        }
                                    }
                                }
                                if (A0E3.A0D("key-index-list") != null) {
                                    r16.A04 = A0E3.A0D("key-index-list").A06("ts");
                                    r16.A0E = A0E3.A0D("key-index-list").A01;
                                    StringBuilder A0S6 = AnonymousClass008.A0S("unisyncprotocolhelper/parseDeviceData v2 index list=");
                                    A0S6.append(r16.A07);
                                    A0S6.append("; ts=");
                                    AnonymousClass008.A1P(A0S6, r16.A04);
                                }
                            }
                        }
                    }
                    if (r2.A0D("status") != null) {
                        AnonymousClass0M5 A0E4 = r2.A0E("status");
                        long A07 = A0E4.A07("t", 0) * 1000;
                        String A0G = A0E4.A0G("code", null);
                        String A0G2 = A0E4.A0G("type", null);
                        String A005 = AnonymousClass0M5.A00(A0E4.A01);
                        if (A0G2 == null || !A0G2.equals("fail")) {
                            r16.A02 = 1;
                            r16.A05 = A07;
                            r16.A09 = A005;
                        } else if ("401".equals(A0G) || "403".equals(A0G) || "404".equals(A0G)) {
                            r16.A02 = 2;
                        } else {
                            r16.A02 = 0;
                        }
                    }
                    if (r2.A0D("picture") != null) {
                        r16.A01 = r2.A0E("picture").A05("id", 0);
                    }
                    AnonymousClass0M5 A0D4 = r2.A0D("pay");
                    if (!(A0D4 == null || (A0D = A0D4.A0D("merchant_status")) == null)) {
                        AnonymousClass0OS A0A = A0D.A0A("value");
                        if (A0A != null) {
                            str3 = A0A.A03;
                        } else {
                            str3 = "false";
                        }
                        r16.A0C = "true".equals(str3);
                        r16.A08 = A0D.A0G("dhash", null);
                    }
                    r16.A0D = z;
                    if (r16.A07 != null) {
                        AnonymousClass0M5 A0D5 = r2.A0D("business");
                        if (!(r15 == null || !r15.A03 || A0D5 == null)) {
                            UserJid userJid2 = r16.A07;
                            AnonymousClass2KW r103 = new AnonymousClass2KW();
                            r103.A01 = userJid2;
                            r103.A02 = A0D5;
                            AnonymousClass0M5 A0D6 = A0D5.A0D("verified_name");
                            if (A0D6 != null) {
                                C28461Uk r82 = new C28461Uk();
                                r82.A02 = A0D6.A01;
                                String A0G3 = A0D6.A0G("verified_level", null);
                                if (A0G3 != null) {
                                    r82.A00 = AnonymousClass1VY.A00(A0G3);
                                    r82.A01 = new AnonymousClass0OB(A0D6.A0G("host_storage", null), A0D6.A0G("actual_actors", null), A0D6.A0G("privacy_mode_ts", null));
                                    r103.A00 = r82;
                                } else {
                                    throw null;
                                }
                            } else {
                                r103.A00 = null;
                            }
                            r16.A06 = r103;
                        }
                    }
                }
                AnonymousClass0RO r3 = new AnonymousClass0RO((C47162Gs[]) arrayList.toArray(new C47162Gs[0]), new AnonymousClass2LB(str2, r20, r22, r15, A002, A003, r40, r41));
                StringBuilder A0S7 = AnonymousClass008.A0S("UniSyncProtocolHelper/handleSyncResult sid=");
                String str7 = r02.A01;
                A0S7.append(str7);
                A0S7.append(" querySync=");
                AnonymousClass008.A1a(A0S7, r02.A02);
                this.A01.AAC(str7, 0, r3);
            }
            r02.A00.A01(null);
            return;
        }
        Log.w("UniSyncProtocolHelper/onSuccess missing request");
    }
}
