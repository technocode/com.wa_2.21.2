package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0ZG  reason: invalid class name */
public final class AnonymousClass0ZG {
    public static final Field A00;
    public static final Field A01;

    static {
        try {
            Field declaredField = AnonymousClass078.class.getDeclaredField("unknownFields");
            A01 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = AnonymousClass07A.class.getDeclaredField("count");
            A00 = declaredField2;
            declaredField2.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.e("MessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw new AssertionError(e);
        }
    }

    public static int A00(C02840Dr r1) {
        try {
            return A00.getInt(A01.get(r1));
        } catch (IllegalAccessException e) {
            Log.e("MessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw new AssertionError(e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.whatsapp.jid.DeviceJid */
    /* JADX WARN: Multi-variable type inference failed */
    public static Pair A01(AnonymousClass02N r1, AnonymousClass02N r2, DeviceJid deviceJid) {
        if (AnonymousClass1VY.A0Y(r1) || AnonymousClass1VY.A0T(r1)) {
            if (deviceJid != 0) {
                r2 = deviceJid;
            }
        } else if (AnonymousClass1VY.A0T(r2)) {
            if (deviceJid != 0) {
                r1 = deviceJid;
            }
            r2 = r1;
            r1 = r2;
        } else if (deviceJid != 0) {
            r1 = deviceJid;
        }
        return new Pair(r1, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fb, code lost:
        if (android.text.TextUtils.isEmpty(r12.A0V) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a3, code lost:
        if (X.AnonymousClass1VY.A0U(r12.A0n.A00) == false) goto L_0x01a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C75423cu A02(X.AnonymousClass01I r11, X.AbstractC007503q r12, boolean r13, X.C007103l r14, byte[] r15) {
        /*
        // Method dump skipped, instructions count: 747
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZG.A02(X.01I, X.03q, boolean, X.03l, byte[]):X.3cu");
    }

    public static C75423cu A03(C02840Dr r15) {
        C02840Dr A05 = A05(r15);
        int i = A05.A00;
        boolean z = false;
        if ((i & 8) == 8) {
            z = true;
        }
        if (z) {
            C75823dY r1 = A05.A08;
            if (r1 == null) {
                r1 = C75823dY.A04;
            }
            if ((r1.A00 & 4) != 4) {
                return null;
            }
            C75423cu r3 = r1.A01;
            if (r3 == null) {
                return C75423cu.A0H;
            }
            return r3;
        } else if ((i & 16) == 16) {
            C76313eL r2 = A05.A0N;
            if (r2 == null) {
                r2 = C76313eL.A0D;
            }
            if ((r2.A04 & 2048) != 2048) {
                return null;
            }
            C75423cu r32 = r2.A07;
            if (r32 == null) {
                return C75423cu.A0H;
            }
            return r32;
        } else {
            boolean z2 = false;
            if ((i & 65536) == 65536) {
                z2 = true;
            }
            if (z2) {
                C02890Dw r12 = A05.A0M;
                if (r12 == null) {
                    r12 = C02890Dw.A0B;
                }
                if ((r12.A04 & 512) != 512) {
                    return null;
                }
                C75423cu r33 = r12.A09;
                if (r33 == null) {
                    return C75423cu.A0H;
                }
                return r33;
            }
            boolean z3 = false;
            if ((i & 32) == 32) {
                z3 = true;
            }
            if (z3) {
                C75943dk r13 = A05.A0D;
                if (r13 == null) {
                    r13 = C75943dk.A0D;
                }
                if ((r13.A01 & 1024) != 1024) {
                    return null;
                }
                C75423cu r34 = r13.A06;
                if (r34 == null) {
                    return C75423cu.A0H;
                }
                return r34;
            }
            boolean z4 = false;
            if ((i & 4) == 4) {
                z4 = true;
            }
            if (z4) {
                C76143e4 r14 = A05.A0I;
                if (r14 == null) {
                    r14 = C76143e4.A0N;
                }
                if ((r14.A00 & 4096) != 4096) {
                    return null;
                }
                C75423cu r35 = r14.A0H;
                if (r35 == null) {
                    return C75423cu.A0H;
                }
                return r35;
            } else if ((i & 128) == 128) {
                C75663dI r16 = A05.A02;
                if (r16 == null) {
                    r16 = C75663dI.A0D;
                }
                if ((r16.A00 & 1024) != 1024) {
                    return null;
                }
                C75423cu r36 = r16.A08;
                if (r36 == null) {
                    return C75423cu.A0H;
                }
                return r36;
            } else {
                boolean z5 = false;
                if ((i & 256) == 256) {
                    z5 = true;
                }
                if (z5) {
                    C76563ek r17 = A05.A0Y;
                    if (r17 == null) {
                        r17 = C76563ek.A0K;
                    }
                    if ((r17.A00 & 16384) != 16384) {
                        return null;
                    }
                    C75423cu r37 = r17.A0D;
                    if (r37 == null) {
                        return C75423cu.A0H;
                    }
                    return r37;
                } else if ((i & 64) == 64) {
                    C75923di r18 = A05.A0C;
                    if (r18 == null) {
                        r18 = C75923di.A0K;
                    }
                    if ((r18.A00 & 65536) != 65536) {
                        return null;
                    }
                    C75423cu r38 = r18.A0C;
                    if (r38 == null) {
                        return C75423cu.A0H;
                    }
                    return r38;
                } else if ((i & 4096) == 4096) {
                    C75843da r22 = A05.A09;
                    if (r22 == null) {
                        r22 = C75843da.A04;
                    }
                    if ((r22.A00 & 2) != 2) {
                        return null;
                    }
                    C75423cu r39 = r22.A02;
                    if (r39 == null) {
                        return C75423cu.A0H;
                    }
                    return r39;
                } else if ((i & 2097152) == 2097152) {
                    C76493ed r19 = A05.A0V;
                    if (r19 == null) {
                        r19 = C76493ed.A0G;
                    }
                    if ((r19.A00 & 16384) != 16384) {
                        return null;
                    }
                    C75423cu r310 = r19.A0B;
                    if (r310 == null) {
                        return C75423cu.A0H;
                    }
                    return r310;
                } else if ((i & 32768) == 32768) {
                    C76453eZ r110 = A05.A0S;
                    if (r110 == null) {
                        r110 = C76453eZ.A03;
                    }
                    if ((r110.A00 & 1) != 1) {
                        return null;
                    }
                    C02840Dr r111 = r110.A01;
                    if (r111 == null) {
                        r111 = C02840Dr.A0b;
                    }
                    if ((r111.A00 & 32) != 32) {
                        return null;
                    }
                    C75943dk r112 = r111.A0D;
                    if (r112 == null) {
                        r112 = C75943dk.A0D;
                    }
                    if ((r112.A01 & 1024) != 1024) {
                        return null;
                    }
                    C75423cu r311 = r112.A06;
                    if (r311 == null) {
                        return C75423cu.A0H;
                    }
                    return r311;
                } else if ((i & 131072) == 131072) {
                    C76433eX r113 = A05.A0R;
                    if (r113 == null) {
                        r113 = C76433eX.A06;
                    }
                    if ((r113.A00 & 1) != 1) {
                        return null;
                    }
                    C02840Dr r0 = r113.A03;
                    if (r0 == null) {
                        r0 = C02840Dr.A0b;
                    }
                    C75943dk r114 = r0.A0D;
                    if (r114 == null) {
                        r114 = C75943dk.A0D;
                    }
                    if ((r114.A01 & 1024) != 1024) {
                        return null;
                    }
                    C75423cu r312 = r114.A06;
                    if (r312 == null) {
                        return C75423cu.A0H;
                    }
                    return r312;
                } else if ((i & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
                    C76393eT r115 = A05.A0P;
                    if (r115 == null) {
                        r115 = C76393eT.A05;
                    }
                    if ((r115.A00 & 8) != 8) {
                        return null;
                    }
                    C75423cu r313 = r115.A01;
                    if (r313 == null) {
                        return C75423cu.A0H;
                    }
                    return r313;
                } else if ((i & 4194304) == 4194304) {
                    C75983do r116 = A05.A0G;
                    if (r116 == null) {
                        r116 = C75983do.A08;
                    }
                    if ((r116.A00 & 64) != 64) {
                        return null;
                    }
                    C75423cu r314 = r116.A03;
                    if (r314 == null) {
                        return C75423cu.A0H;
                    }
                    return r314;
                } else if ((i & 8388608) == 8388608) {
                    C76513ef r117 = A05.A0W;
                    if (r117 == null) {
                        r117 = C76513ef.A05;
                    }
                    if ((r117.A00 & 4) != 4) {
                        return null;
                    }
                    C75423cu r315 = r117.A02;
                    if (r315 == null) {
                        return C75423cu.A0H;
                    }
                    return r315;
                } else if ((i & 268435456) == 268435456) {
                    C75963dm r02 = A05.A0F;
                    if (r02 == null) {
                        r02 = C75963dm.A02;
                    }
                    C02840Dr r23 = r02.A01;
                    if (r23 == null) {
                        r23 = C02840Dr.A0b;
                    }
                    int i2 = r23.A00;
                    if ((i2 & 4) == 4) {
                        C76143e4 r118 = r23.A0I;
                        if (r118 == null) {
                            r118 = C76143e4.A0N;
                        }
                        if ((r118.A00 & 4096) != 4096) {
                            return null;
                        }
                        C75423cu r316 = r118.A0H;
                        if (r316 == null) {
                            return C75423cu.A0H;
                        }
                        return r316;
                    } else if ((i2 & 256) != 256) {
                        return null;
                    } else {
                        C76563ek r119 = r23.A0Y;
                        if (r119 == null) {
                            r119 = C76563ek.A0K;
                        }
                        if ((r119.A00 & 16384) != 16384) {
                            return null;
                        }
                        C75423cu r317 = r119.A0D;
                        if (r317 == null) {
                            return C75423cu.A0H;
                        }
                        return r317;
                    }
                } else if ((i & 536870912) == 536870912) {
                    C76333eN r120 = A05.A0O;
                    if (r120 == null) {
                        r120 = C76333eN.A0B;
                    }
                    if ((r120.A00 & 512) != 512) {
                        return null;
                    }
                    C75423cu r318 = r120.A05;
                    if (r318 == null) {
                        return C75423cu.A0H;
                    }
                    return r318;
                } else if ((i & 1073741824) != 1073741824) {
                    return null;
                } else {
                    C76283eI r121 = A05.A0L;
                    if (r121 == null) {
                        r121 = C76283eI.A06;
                    }
                    if ((r121.A00 & 8) != 8) {
                        return null;
                    }
                    C75423cu r319 = r121.A02;
                    if (r319 == null) {
                        return C75423cu.A0H;
                    }
                    return r319;
                }
            }
        }
    }

    public static C02840Dr A04(C02840Dr r3) {
        int i = r3.A00;
        if ((i & 268435456) == 268435456) {
            C75963dm r0 = r3.A0F;
            if (r0 == null) {
                r0 = C75963dm.A02;
            }
            C02840Dr r02 = r0.A01;
            if (r02 == null) {
                return C02840Dr.A0b;
            }
            return r02;
        } else if ((i & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != Integer.MIN_VALUE) {
            return null;
        } else {
            C75963dm r03 = r3.A0E;
            if (r03 == null) {
                r03 = C75963dm.A02;
            }
            C02840Dr r04 = r03.A01;
            if (r04 == null) {
                return C02840Dr.A0b;
            }
            return r04;
        }
    }

    public static C02840Dr A05(C02840Dr r2) {
        if ((r2.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            C75963dm r0 = r2.A0E;
            if (r0 == null) {
                r0 = C75963dm.A02;
            }
            r2 = r0.A01;
            if (r2 == null) {
                r2 = C02840Dr.A0b;
            }
        }
        C02840Dr A04 = A04(r2);
        return A04 != null ? A04 : r2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:346:0x059c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0035 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x00fe */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.0ZP] */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.0hi] */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.0ZI] */
    /* JADX WARN: Type inference failed for: r0v60, types: [X.0ZN] */
    /* JADX WARN: Type inference failed for: r0v64, types: [X.0ZA] */
    /* JADX WARN: Type inference failed for: r0v65, types: [X.0ZF] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.0hj] */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.0Z9] */
    /* JADX WARN: Type inference failed for: r0v75, types: [X.03q] */
    /* JADX WARN: Type inference failed for: r0v78, types: [X.0Ot, X.03q] */
    /* JADX WARN: Type inference failed for: r0v93, types: [X.0ZE] */
    /* JADX WARN: Type inference failed for: r0v98, types: [X.0ZM] */
    /* JADX WARN: Type inference failed for: r0v105, types: [X.0ZK] */
    /* JADX WARN: Type inference failed for: r0v114, types: [X.288] */
    /* JADX WARN: Type inference failed for: r0v117, types: [X.287] */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.0hh] */
    /* JADX WARN: Type inference failed for: r0v125, types: [X.0ZJ] */
    /* JADX WARN: Type inference failed for: r0v127, types: [X.0M1] */
    /* JADX WARN: Type inference failed for: r0v128, types: [X.0M2] */
    /* JADX WARN: Type inference failed for: r0v132, types: [X.0ZC] */
    /* JADX WARN: Type inference failed for: r0v134, types: [X.0ML, X.0MK] */
    /* JADX WARN: Type inference failed for: r0v135, types: [X.0ZB] */
    /* JADX WARN: Type inference failed for: r0v137, types: [X.0MP] */
    /* JADX WARN: Type inference failed for: r0v140, types: [X.0MI] */
    /* JADX WARN: Type inference failed for: r0v142, types: [X.0MN] */
    /* JADX WARN: Type inference failed for: r0v144, types: [X.0Ot] */
    /* JADX WARN: Type inference failed for: r0v145, types: [X.0Ds] */
    /* JADX WARN: Type inference failed for: r0v146, types: [X.0Or] */
    /* JADX WARN: Type inference failed for: r0v147, types: [X.0Lz] */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153, types: [X.0Ot] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r0 == null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03a8, code lost:
        if (r6 == 2) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x059c, code lost:
        if (r41 != null) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r48 != false) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0676  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AbstractC007503q A06(X.AnonymousClass00G r30, X.AnonymousClass009 r31, X.AnonymousClass01X r32, X.AnonymousClass01A r33, X.C017009c r34, X.AnonymousClass01I r35, X.C000300f r36, X.AnonymousClass0AL r37, X.C01970Ad r38, X.C02840Dr r39, X.C75423cu r40, X.AnonymousClass0MH r41, X.C007303n r42, X.AnonymousClass02N r43, long r44, boolean r46, boolean r47, boolean r48, int r49) {
        /*
        // Method dump skipped, instructions count: 2137
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZG.A06(X.00G, X.009, X.01X, X.01A, X.09c, X.01I, X.00f, X.0AL, X.0Ad, X.0Dr, X.3cu, X.0MH, X.03n, X.02N, long, boolean, boolean, boolean, int):X.03q");
    }

    public static AbstractC007503q A07(AnonymousClass0AL r4, AbstractC007503q r5) {
        C007303n r3 = r5.A0I;
        if (r3 != null) {
            return r4.A02(r3, r5.A0E, r5.A0m);
        }
        throw null;
    }

    public static String A08(AnonymousClass01X r12, AnonymousClass0M1 r13) {
        List list;
        int size;
        List A0u = r13.A0u();
        int size2 = A0u.size() - 1;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= A0u.size() || i >= 100) {
                int size3 = A0u.size();
            } else {
                String str2 = (String) A0u.get(i);
                if (str2 != null) {
                    AnonymousClass01A.A00();
                    AnonymousClass3D0 A04 = AnonymousClass1Z4.A04(str2);
                    if (A04 != null) {
                        Iterator it = A04.A02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                continue;
                                break;
                            }
                            C68373Cy r4 = (C68373Cy) it.next();
                            String str3 = r4.A01;
                            if (!TextUtils.isEmpty(r4.A02)) {
                                if (str3.equals("N") && (size = (list = r4.A03).size()) > 1) {
                                    list.get(0);
                                    str = (String) list.get(1);
                                    if (size > 2 && ((String) list.get(2)).length() > 0) {
                                        list.get(2);
                                    }
                                    if (size > 3 && ((String) list.get(3)).length() > 0) {
                                        list.get(3);
                                    }
                                    if (size > 4 && ((String) list.get(4)).length() > 0) {
                                        list.get(4);
                                    }
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    if (str != null) {
                                        return r12.A0A(R.plurals.contacts_array_title, (long) size2, str, Integer.valueOf(size2));
                                    }
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
        }
        int size32 = A0u.size();
        return r12.A0A(R.plurals.n_contacts_message_title, (long) size32, Integer.valueOf(size32));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r9 = X.C75523d4.A04.AQb();
        r0 = r2.serializableLocation.latitude;
        r9.A02();
        r10 = (X.C75523d4) r9.A00;
        r10.A02 |= 1;
        r10.A00 = r0;
        r0 = r2.serializableLocation.longitude;
        r9.A02();
        r11 = (X.C75523d4) r9.A00;
        r11.A02 |= 2;
        r11.A01 = r0;
        r2 = r2.serializableLocation.name;
        r9.A02();
        r1 = (X.C75523d4) r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00aa, code lost:
        if (r2 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ac, code lost:
        r1.A02 |= 4;
        r1.A03 = r2;
        r1 = r9.A01();
        r4.A02();
        r0 = (X.C75503d2) r4.A00;
        r0.A03 = r1;
        r0.A00 = 2;
        r6.add(r4.A01());
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d0, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A09(X.AnonymousClass0M4 r11) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZG.A09(X.0M4):java.util.List");
    }

    public static List A0A(C02840Dr r9) {
        ArrayList arrayList = new ArrayList();
        int A002 = A00(r9);
        for (int i = 0; i < A002; i++) {
            arrayList.add(0);
        }
        int i2 = r9.A00;
        if ((i2 & 8) == 8) {
            arrayList.add(1);
        }
        boolean z = false;
        if ((i2 & 1) == 1) {
            z = true;
        }
        if (z) {
            arrayList.add(2);
        }
        if ((i2 & 4) == 4) {
            arrayList.add(3);
        }
        if ((i2 & 16) == 16) {
            arrayList.add(4);
        }
        if ((i2 & 65536) == 65536) {
            arrayList.add(5);
        }
        if ((i2 & 32) == 32) {
            arrayList.add(6);
        }
        if ((i2 & 64) == 64) {
            arrayList.add(7);
        }
        if ((i2 & 128) == 128) {
            arrayList.add(8);
        }
        if ((i2 & 256) == 256) {
            arrayList.add(9);
        }
        if ((i2 & 1024) == 1024) {
            arrayList.add(10);
        }
        if ((i2 & 2048) == 2048) {
            arrayList.add(11);
        }
        if ((i2 & 4096) == 4096) {
            arrayList.add(12);
        }
        if ((i2 & 8192) == 8192) {
            arrayList.add(13);
        }
        if ((i2 & 32768) == 32768) {
            arrayList.add(14);
        }
        if ((i2 & 131072) == 131072) {
            arrayList.add(15);
        }
        if ((i2 & 2097152) == 2097152) {
            arrayList.add(16);
        }
        if ((i2 & 262144) == 262144) {
            arrayList.add(17);
        }
        if ((i2 & 524288) == 524288) {
            arrayList.add(18);
        }
        if ((i2 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            arrayList.add(19);
        }
        if ((i2 & 134217728) == 134217728) {
            arrayList.add(20);
        }
        if ((i2 & 536870912) == 536870912) {
            arrayList.add(21);
        }
        if ((i2 & 4194304) == 4194304) {
            arrayList.add(22);
        }
        if ((i2 & 1048576) == 1048576) {
            arrayList.add(23);
        }
        if ((i2 & 8388608) == 8388608) {
            arrayList.add(24);
        }
        if ((i2 & 268435456) == 268435456) {
            arrayList.add(25);
        }
        if ((i2 & 1073741824) == 1073741824) {
            arrayList.add(26);
        }
        if ((i2 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            arrayList.add(27);
        }
        int i3 = r9.A01;
        if ((i3 & 1) == 1) {
            arrayList.add(28);
        }
        if ((i3 & 2) == 2) {
            arrayList.add(29);
        }
        if ((i3 & 4) == 4) {
            arrayList.add(30);
        }
        return arrayList;
    }

    public static void A0B(AnonymousClass0M4 r17, List list) {
        C75523d4 r0;
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C75503d2 r8 = (C75503d2) it.next();
                SerializablePoint[] serializablePointArr = new SerializablePoint[r8.A02.size()];
                int i = 0;
                while (true) {
                    if (i < r8.A02.size()) {
                        C76603eo r7 = (C76603eo) r8.A02.get(i);
                        int i2 = r7.A02;
                        if ((i2 & 1) == 1 || (i2 & 2) == 2) {
                            Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
                        } else {
                            serializablePointArr[i] = new SerializablePoint(r7.A00, r7.A01);
                            i++;
                        }
                    } else {
                        if (r8.A00 == 2) {
                            r0 = (C75523d4) r8.A03;
                        } else {
                            r0 = C75523d4.A04;
                        }
                        arrayList.add(new InteractiveAnnotation(serializablePointArr, new SerializableLocation(r0.A00, r0.A01, r0.A03)));
                    }
                }
                Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
            }
            r17.A0V = (InteractiveAnnotation[]) arrayList.toArray(new InteractiveAnnotation[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r0 != 0) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C04970Mo r12, X.AnonymousClass2LF r13) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZG.A0C(X.0Mo, X.2LF):void");
    }

    public static void A0D(AnonymousClass0OG r5, String str, boolean z) {
        C76103e0 r0;
        if (!z) {
            if (r5.A01 != 1) {
                throw new C64122xf(0);
            }
        } else if ((r5.A00 & 8) != 8) {
            throw new C64122xf(0);
        }
        if (!z) {
            C76543ei A0I = r5.A0I();
            if (A0I.A0I() == EnumC69913Ja.HIGHLY_STRUCTURED_MESSAGE) {
                if (A0I.A01 == 2) {
                    r0 = (C76103e0) A0I.A05;
                } else {
                    r0 = C76103e0.A0A;
                }
                A0H(str, r0);
            }
            if ((A0I.A00 & 32) == 32) {
                C76103e0 r02 = A0I.A03;
                if (r02 == null) {
                    r02 = C76103e0.A0A;
                }
                A0H(str, r02);
                if ((A0I.A00 & 64) == 64) {
                    C76103e0 r03 = A0I.A03;
                    if (r03 == null) {
                        r03 = C76103e0.A0A;
                    }
                    A0H(str, r03);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("MessageUtils/validateTemplateMessage/error no content for template message, message key=");
            sb.append(str);
            Log.e(sb.toString());
            throw new C64122xf(0);
        }
        AnonymousClass0OH r3 = r5.A03;
        if (r3 == null) {
            r3 = AnonymousClass0OH.A07;
        }
        if (r3.A0I() == EnumC69923Jb.HYDRATED_TITLE_TEXT && r3.A01 != 2) {
            StringBuilder sb2 = new StringBuilder("MessageUtil/validateHydratedTemplateMessage/error no title with text title, message key=");
            sb2.append(str);
            Log.w(sb2.toString());
            throw new C64122xf(0);
        } else if ((r3.A00 & 32) != 32) {
            StringBuilder sb3 = new StringBuilder("MessageUtil/validateHydratedTemplateMessage/error no content, message key=");
            sb3.append(str);
            Log.w(sb3.toString());
            throw new C64122xf(0);
        }
    }

    public static void A0E(C02840Dr r3, String str) {
        if ((r3.A00 & 8192) == 8192) {
            C76103e0 r0 = r3.A0H;
            if (r0 == null) {
                r0 = C76103e0.A0A;
            }
            A0H(str, r0);
            return;
        }
        throw new C64122xf(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(X.AbstractC007503q r11, X.C64552yN r12) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZG.A0F(X.03q, X.2yN):void");
    }

    public static void A0G(AnonymousClass0M3 r3, AnonymousClass0M4 r4, byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            AnonymousClass2KK A0c = C28051Sr.A0c(C002001d.A3o(bArr, AnonymousClass1XO.A02(r3).A03, 80));
            r4.A0U = bArr;
            r4.A0Q = A0c.A00;
            r4.A0S = A0c.A02;
            r4.A0T = A0c.A01;
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("MessageUtils/setMediaKeyForMediaData/media key incorrect length; length=");
        A0S.append(length);
        A0S.append("; message.key=");
        A0S.append(r3.A0n);
        Log.w(A0S.toString());
        throw new C64122xf(16);
    }

    public static void A0H(String str, C76103e0 r3) {
        if ((r3.A00 & 1) != 1 || TextUtils.isEmpty(r3.A09)) {
            StringBuilder sb = new StringBuilder("MessageUtil/validateHSM/error missing namespace for hsm, message.key=");
            sb.append(str);
            Log.w(sb.toString());
            throw new C64122xf(20);
        } else if ((r3.A00 & 2) != 2 || TextUtils.isEmpty(r3.A06)) {
            StringBuilder sb2 = new StringBuilder("MessageUtil/validateHSM/error missing element for hsm, message.key");
            sb2.append(str);
            Log.w(sb2.toString());
            throw new C64122xf(21);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if ((r5 & 268435456) == 268435456) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0I(X.AnonymousClass009 r9, X.C02840Dr r10, java.util.List r11) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZG.A0I(X.009, X.0Dr, java.util.List):boolean");
    }

    public static boolean A0J(C02840Dr r4, C000300f r5) {
        int A002 = A00(r4);
        if (A002 > 0) {
            AnonymousClass008.A0u("MessageUtil/isUnknown/unknown tags=", A002);
            return true;
        } else if ((r4.A00 & 268435456) == 268435456 && !r5.A0D(AbstractC000400g.A2b)) {
            Log.e("MessageUtil/isUnknown/viewOnce");
            return true;
        } else if ((r4.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE && !r5.A0D(AbstractC000400g.A0t)) {
            Log.e("MessageUtil/isUnknown/ephemeralMessage");
            return true;
        } else if ((r4.A00 & 134217728) == 134217728 && r5.A0D(AbstractC000400g.A1M)) {
            Log.e("MessageUtil/isUnknown/listMessage");
            return true;
        } else if ((r4.A01 & 1) != 1) {
            return false;
        } else {
            Log.e("MessageUtil/isUnknown/invoiceMessage");
            return true;
        }
    }

    public static boolean A0K(AbstractC007503q r2) {
        byte b = r2.A0m;
        return b == 11 || b == 31;
    }

    public static boolean A0L(AbstractC007503q r4, C007103l r5) {
        if (r5 == null) {
            return false;
        }
        AnonymousClass02N r2 = r4.A0n.A00;
        if (AnonymousClass1VY.A0e(r2) || AnonymousClass1VY.A0Y(r2)) {
            return true;
        }
        if (!AnonymousClass1VY.A0U(r2) || C12080hW.A00(r4.A08, 4) < 0) {
            return false;
        }
        return true;
    }

    public static boolean A0M(AbstractC007503q r3, C007103l r4, byte[] bArr) {
        if (r3.A09() != null || r3.A0s(1024) || r3.A0s(1) || ((!TextUtils.isEmpty(r3.A0W) && !TextUtils.isEmpty(r3.A0V)) || r3.A0r() || A0L(r3, r4) || (bArr != null && AnonymousClass1VY.A0U(r3.A0n.A00)))) {
            return true;
        }
        return false;
    }

    public static byte[] A0N(byte[] bArr, C44281zn r5) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            Log.w("MessageUtil/removePadding/ axolotl derived null or empty plaintext from message");
            return null;
        }
        int i = bArr[length - 1] & 255;
        if (i == 0) {
            Log.w("MessageUtil/removePadding/ axolotl derived plaintext has invalid padding");
            if (r5 != null) {
                r5.A00 = Boolean.FALSE;
                r5.A04 = 10;
            }
            return null;
        } else if (i >= length) {
            Log.w("MessageUtil/removePadding/ axolotl derived entire plaintext as padding");
            if (r5 != null) {
                r5.A00 = Boolean.FALSE;
                r5.A04 = 10;
            }
            return null;
        } else {
            int i2 = length - i;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            return bArr2;
        }
    }
}
