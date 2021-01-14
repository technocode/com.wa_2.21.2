package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.0AM  reason: invalid class name */
public class AnonymousClass0AM {
    public static final Pattern A0H = Pattern.compile("((?<= )|(?= ))");
    public static final int[] A0I = {105, 118, 103, 97, 100, AnonymousClass0PW.A03};
    public static volatile AnonymousClass0AM A0J;
    public C43511yV A00;
    public final AnonymousClass01J A01;
    public final AnonymousClass01A A02;
    public final C014308b A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass09V A05;
    public final C014408c A06;
    public final AnonymousClass0AQ A07;
    public final AnonymousClass0AO A08;
    public final C015308l A09;
    public final AnonymousClass0AN A0A;
    public final AnonymousClass094 A0B;
    public final C014508d A0C;
    public final C015408m A0D;
    public final AnonymousClass096 A0E;
    public final C015708p A0F;
    public final Map A0G = new HashMap();

    public AnonymousClass0AM(C015308l r2, C014408c r3, AnonymousClass01J r4, AnonymousClass0AN r5, AnonymousClass01A r6, C014308b r7, AnonymousClass01X r8, C015408m r9, C015708p r10, AnonymousClass09V r11, C014508d r12, AnonymousClass096 r13, AnonymousClass0AO r14, AnonymousClass0AQ r15, AnonymousClass094 r16) {
        this.A09 = r2;
        this.A06 = r3;
        this.A01 = r4;
        this.A0A = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A0D = r9;
        this.A0F = r10;
        this.A05 = r11;
        this.A0C = r12;
        this.A0E = r13;
        this.A08 = r14;
        this.A07 = r15;
        this.A0B = r16;
        A0K(new C01940Aa());
        A0K(new C01960Ac());
    }

    public static AnonymousClass0AM A00() {
        if (A0J == null) {
            synchronized (AnonymousClass0AM.class) {
                if (A0J == null) {
                    AnonymousClass00S.A00();
                    C015308l A002 = C015308l.A00();
                    C014408c A003 = C014408c.A00();
                    C000300f.A00();
                    A0J = new AnonymousClass0AM(A002, A003, AnonymousClass01J.A00(), AnonymousClass0AN.A00(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00(), C015408m.A00(), C015708p.A00(), AnonymousClass09V.A00(), C014508d.A00(), AnonymousClass096.A00(), AnonymousClass0AO.A00(), AnonymousClass0AQ.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A0J;
    }

    public static C08680bX A01(AnonymousClass02N r3) {
        C08680bX r2 = new C08680bX();
        r2.A05 = r3;
        if (AnonymousClass1VY.A0Y(r3)) {
            List singletonList = Collections.singletonList(new C40191sm());
            if (r2.A0B != null) {
                Log.e("FtsQuery/cannot re-set contactPreFilter");
                return r2;
            }
            r2.A0B = singletonList;
            return r2;
        }
        r2.A0C = Collections.emptyList();
        return r2;
    }

    public static final String A02(String str, AnonymousClass1XN r5) {
        String str2;
        String str3 = "";
        if (r5 == null) {
            str2 = str3;
        } else {
            str2 = r5.A00;
            str3 = r5.A01;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = AnonymousClass008.A0L(str, " ", str2);
        }
        return !TextUtils.isEmpty(str3) ? AnonymousClass008.A0L(str2, " ", str3) : str2;
    }

    public static boolean A03(C04080Iy r1) {
        return r1 != null && r1.A03();
    }

    public static final boolean A04(AbstractC007503q r1) {
        AnonymousClass02N r0 = r1.A0n.A00;
        return r0 == null || AnonymousClass1VY.A0b(r0) || (r1 instanceof AnonymousClass28D) || (r1 instanceof AnonymousClass0Oo) || (r1 instanceof C12190hh) || (r1 instanceof AnonymousClass0ZE) || (r1 instanceof C05390Oi);
    }

    public long A05() {
        long parseLong;
        String A012 = this.A0D.A01("fts_ready");
        if (A012 == null) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(A012);
        }
        if (parseLong == 0 || parseLong == 1 || parseLong == 3) {
            return 1;
        }
        if (parseLong == 2 || parseLong == 5) {
            return 5;
        }
        AnonymousClass00E.A08(false, "Unknown Fts version, falling back to V1");
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r0 = r6.A0F.A01("UPDATE messages_fts SET content=? WHERE docid=?", "UPDATE_FTS_DEPRECATED_MESSAGE");
        r0.A07(1, r9);
        r0.A06(2, r7);
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        return r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A06(long r7, java.lang.String r9) {
        /*
            r6 = this;
            X.08d r0 = r6.A0C
            X.0OQ r5 = r0.A04()
            r4 = 2
            r3 = 1
            X.08p r2 = r6.A0F     // Catch:{ SQLiteConstraintException -> 0x0020 }
            java.lang.String r1 = "INSERT INTO messages_fts (docid, content) VALUES(? , ?)"
            java.lang.String r0 = "INSERT_FTS_DEPRECATED_MESSAGE"
            X.1VB r0 = r2.A01(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x0020 }
            r0.A06(r3, r7)     // Catch:{ SQLiteConstraintException -> 0x0020 }
            r0.A07(r4, r9)     // Catch:{ SQLiteConstraintException -> 0x0020 }
            long r0 = r0.A01()     // Catch:{ SQLiteConstraintException -> 0x0020 }
            r5.close()
            return r0
        L_0x0020:
            X.08p r2 = r6.A0F     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = "UPDATE messages_fts SET content=? WHERE docid=?"
            java.lang.String r0 = "UPDATE_FTS_DEPRECATED_MESSAGE"
            X.1VB r0 = r2.A01(r1, r0)     // Catch:{ all -> 0x0037 }
            r0.A07(r3, r9)     // Catch:{ all -> 0x0037 }
            r0.A06(r4, r7)     // Catch:{ all -> 0x0037 }
            r0.A00()     // Catch:{ all -> 0x0037 }
            r5.close()
            return r7
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AM.A06(long, java.lang.String):long");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x008c */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [long] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1 = r15.A0F.A01("UPDATE message_ftsv2 SET content=?, fts_jid=?, fts_namespace=? WHERE docid=?", "UPDATE_FTS_MESSAGE");
        r1.A07(1, r12);
        r0 = new java.lang.StringBuilder();
        r0.append(r9);
        r0.append(" ");
        r0.append(r8);
        r1.A07(2, r0.toString());
        r1.A07(r6 == true ? 1 : 0, r11);
        r1.A06(4, r2);
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e7, code lost:
        r14.close();
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0102, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bc */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A07(X.AbstractC007503q r16, boolean r17, long r18, java.util.Map r20) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AM.A07(X.03q, boolean, long, java.util.Map):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        ((android.database.CursorWrapper) r8).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r0.isEmpty() != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x046a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x046b, code lost:
        if (r6 != null) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0470, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0473, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0477, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x047c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x047d, code lost:
        if (r1 != null) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0482, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0485, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0489, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019b, code lost:
        if (java.lang.Long.parseLong(r0) != 1) goto L_0x019d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A08(X.C08680bX r20, X.C04080Iy r21) {
        /*
        // Method dump skipped, instructions count: 1162
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AM.A08(X.0bX, X.0Iy):android.util.Pair");
    }

    public final Pair A09(C08680bX r5, C04080Iy r6) {
        return new Pair(AnonymousClass008.A0O(new StringBuilder(), AbstractC05370Og.A16, " ORDER BY docid DESC"), new String[]{A0B(r5, r6)});
    }

    public AbstractC007503q A0A(int i, int i2, Cursor cursor) {
        try {
            long j = cursor.getLong(i2);
            AnonymousClass02N A082 = this.A06.A08(cursor.getLong(i));
            if (AnonymousClass1VY.A0b(A082) || A082 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/missing cursor chatjid; rowId=");
                sb.append(j);
                Log.e(sb.toString());
                return null;
            }
            try {
                AbstractC007503q A042 = this.A05.A04(cursor, A082, false, true);
                if (A042 != null) {
                    return A042;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/null message; rowId=");
                sb2.append(j);
                Log.e(sb2.toString());
                return null;
            } catch (AssertionError | ClassCastException e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/bad message; rowId=");
                sb3.append(j);
                Log.e(sb3.toString(), e);
                return null;
            }
        } catch (Exception e2) {
            Log.e("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/failed on cursor", e2);
            return null;
        }
    }

    public String A0B(C08680bX r13, C04080Iy r14) {
        String str = "";
        if (r13.A05()) {
            if (!r13.A0F || !C002001d.A3S(this)) {
                StringBuilder A0S = AnonymousClass008.A0S(str);
                List<String> A032 = r13.A03();
                ArrayList arrayList = new ArrayList(A032.size());
                for (String str2 : A032) {
                    StringBuilder sb = new StringBuilder("content:");
                    sb.append(str2);
                    arrayList.add(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(TextUtils.join(" ", arrayList));
                sb2.append("*");
                A0S.append(sb2.toString());
                str = A0S.toString();
            } else {
                StringBuilder A0S2 = AnonymousClass008.A0S(str);
                if (!r13.A03().isEmpty()) {
                    List A0I2 = A0I(r13, r14);
                    StringBuilder sb3 = new StringBuilder();
                    int size = A0I2.size();
                    for (int i = 0; i < size && !A03(r14); i++) {
                        boolean z = false;
                        if (i == size - 1) {
                            z = true;
                        }
                        sb3.append(" ");
                        Pair pair = (Pair) A0I2.get(i);
                        StringBuilder A0S3 = AnonymousClass008.A0S("content:");
                        A0S3.append((String) pair.first);
                        if (z) {
                            A0S3.append('*');
                        }
                        for (int i2 = 0; i2 < ((List) pair.second).size(); i2++) {
                            AnonymousClass02N r11 = (AnonymousClass02N) ((List) pair.second).get(i2);
                            if (AnonymousClass1VY.A0e(r11)) {
                                A0S3.append(" OR ");
                                A0S3.append("fts_jid:");
                                A0S3.append(A0D(r11));
                            } else if (AnonymousClass1VY.A0Y(r11)) {
                                A0S3.append(" OR ");
                                A0S3.append("fts_jid:");
                                A0S3.append(A0D(r11));
                            }
                        }
                        sb3.append(A0S3.toString());
                    }
                    str = sb3.toString().trim();
                }
                A0S2.append(str);
                str = A0S2.toString();
            }
        }
        AnonymousClass02N r4 = r13.A05;
        if (r4 != null) {
            if (r4 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" ");
                boolean z2 = r13.A0G;
                StringBuilder A0S4 = AnonymousClass008.A0S("fts_jid:");
                A0S4.append(A0D(r4));
                String obj = A0S4.toString();
                if (z2 && !AnonymousClass1VY.A0Y(r4)) {
                    obj = AnonymousClass008.A0K(obj, " fts_jid:0 OR fts_jid:1");
                }
                sb4.append(obj);
                str = sb4.toString();
            } else {
                throw null;
            }
        }
        return A0C(r13, str, r14);
    }

    public final String A0C(C08680bX r11, String str, C04080Iy r13) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry entry : this.A0G.entrySet()) {
            if (A03(r13)) {
                break;
            }
            String str2 = (String) entry.getKey();
            AnonymousClass1V2 A7b = ((AbstractC01950Ab) entry.getValue()).A7b(r11);
            if (A7b != null) {
                for (String str3 : A7b.A00) {
                    if (A03(r13)) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder("fts_namespace:");
                    sb.append(str2);
                    sb.append(str3);
                    arrayList.add(sb.toString());
                    z2 = true;
                }
                for (String str4 : A7b.A01) {
                    if (A03(r13)) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder("fts_namespace:-");
                    sb2.append(str2);
                    sb2.append(str4);
                    arrayList.add(sb2.toString());
                    z = true;
                }
            }
        }
        if (A03(r13) || !z || z2 || !TextUtils.isEmpty(str)) {
            String join = TextUtils.join(" ", arrayList);
            return !TextUtils.isEmpty(join) ? AnonymousClass008.A0L(str, " ", join) : str;
        }
        throw new IllegalStateException("Compiled FTS query comprised entirely of NOTs");
    }

    public String A0D(AnonymousClass02N r5) {
        return Long.toString(this.A09.A02(r5) + 10, 36);
    }

    public String A0E(AbstractC007503q r8) {
        String A0v;
        AnonymousClass0ZN r82;
        AnonymousClass1XT r0;
        AnonymousClass02N r1;
        C007003k A0A2;
        int i;
        UserJid userJid;
        C05900Qy r02;
        if (r8 == null) {
            return "";
        }
        if (r8 instanceof AnonymousClass0Z8) {
            A0v = ((AnonymousClass0Z8) r8).A6W();
        } else if (r8 instanceof C05490Ot) {
            C05490Ot r83 = (C05490Ot) r8;
            if (r83.A0q()) {
                A0v = A02(r83.A0D(), r83.A0A().A00);
            } else {
                A0v = r83.A0D();
                if (!TextUtils.isEmpty(r83.A04)) {
                    StringBuilder A0Y = AnonymousClass008.A0Y(A0v, " ");
                    A0Y.append(r83.A04);
                    A0v = A0Y.toString();
                }
                if (!TextUtils.isEmpty(r83.A02)) {
                    StringBuilder A0Y2 = AnonymousClass008.A0Y(A0v, " ");
                    A0Y2.append(r83.A02);
                    A0v = A0Y2.toString();
                }
                if (!TextUtils.isEmpty(r83.A05)) {
                    StringBuilder A0Y3 = AnonymousClass008.A0Y(A0v, " ");
                    A0Y3.append(r83.A05);
                    A0v = A0Y3.toString();
                }
                AnonymousClass0MH r4 = r83.A0F;
                if (!(r4 == null || (r02 = r4.A06) == null)) {
                    String A0H2 = A0H(r02.A00, r4.A0E);
                    if (!TextUtils.isEmpty(A0H2)) {
                        A0v = AnonymousClass008.A0L(A0v, " ", A0H2);
                    }
                }
            }
        } else if (r8 instanceof C05390Oi) {
            C05390Oi r84 = (C05390Oi) r8;
            if (TextUtils.isEmpty(r84.A0D())) {
                A0v = "";
            } else {
                A0v = r84.A0D();
            }
            if ((r84 instanceof C12130hb) && (userJid = ((C12130hb) r84).A01) != null) {
                StringBuilder A0Y4 = AnonymousClass008.A0Y(A0v, " ");
                A0Y4.append(userJid.getRawString());
                A0v = A0Y4.toString();
            }
            if (r84 instanceof C12110hZ) {
                C12110hZ r5 = (C12110hZ) r84;
                if (!TextUtils.isEmpty(r5.A00) && (r1 = r84.A0n.A00) != null && (A0A2 = this.A02.A0A(r1)) != null && (!A0A2.A08() || !((i = A0A2.A03) == 2 || i == 1))) {
                    StringBuilder A0Y5 = AnonymousClass008.A0Y(A0v, " ");
                    A0Y5.append(r5.A00);
                    A0v = A0Y5.toString();
                }
            }
        } else if ((r8 instanceof AnonymousClass0MI) || (r8 instanceof AnonymousClass0MO)) {
            if (r8 instanceof AnonymousClass0Z9) {
                AnonymousClass0Z9 r85 = (AnonymousClass0Z9) r8;
                A0v = r85.A07;
                if (!TextUtils.isEmpty(r85.A03)) {
                    StringBuilder A0Y6 = AnonymousClass008.A0Y(A0v, " ");
                    A0Y6.append(r85.A03);
                    A0v = A0Y6.toString();
                }
                String A0H3 = A0H(r85.A08, r85.A02);
                if (!TextUtils.isEmpty(A0H3)) {
                    A0v = AnonymousClass008.A0L(A0v, " ", A0H3);
                }
            } else if (r8.A0q()) {
                A0v = A02(r8.A0D(), r8.A0A().A00);
            } else {
                A0v = ((AnonymousClass0M3) r8).A0v();
            }
        } else if (r8 instanceof C02850Ds) {
            A0v = ((C02850Ds) r8).A03;
        } else if (r8 instanceof AnonymousClass0M2) {
            A0v = ((AnonymousClass0M3) r8).A0w();
        } else if (r8 instanceof C05470Or) {
            A0v = ((C05470Or) r8).A0x();
        } else if (r8 instanceof C04830Lz) {
            A0v = ((C04830Lz) r8).A00;
        } else if (r8 instanceof AnonymousClass0M1) {
            List<AnonymousClass1Z5> list = ((AnonymousClass0M1) r8).A02;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                for (AnonymousClass1Z5 r03 : list) {
                    sb.append(r03.A01.A07());
                    sb.append(" ");
                }
                A0v = sb.toString();
            }
            return "";
        } else if (r8 instanceof AnonymousClass0ZF) {
            A0v = r8.A0F();
        } else if (r8 instanceof AnonymousClass0ZA) {
            AnonymousClass0ZA r86 = (AnonymousClass0ZA) r8;
            if (!TextUtils.isEmpty(r86.A06)) {
                A0v = r86.A06;
            } else {
                A0v = "";
            }
            if (!TextUtils.isEmpty(r86.A04)) {
                StringBuilder A0Y7 = AnonymousClass008.A0Y(A0v, " ");
                A0Y7.append(r86.A04);
                A0v = A0Y7.toString();
            }
        } else {
            if ((r8 instanceof AnonymousClass0ZN) && (r0 = (r82 = (AnonymousClass0ZN) r8).A00) != null) {
                if (!TextUtils.isEmpty(r0.A03)) {
                    StringBuilder A0S = AnonymousClass008.A0S("");
                    A0S.append(r82.A00.A03);
                    A0v = A0S.toString();
                } else {
                    A0v = "";
                }
                if (!TextUtils.isEmpty(r82.A00.A02)) {
                    StringBuilder A0Y8 = AnonymousClass008.A0Y(A0v, " ");
                    A0Y8.append(r82.A00.A02);
                    A0v = A0Y8.toString();
                }
            }
            return "";
        }
        if (A0v != null) {
            return A0v;
        }
        return "";
    }

    public final String A0F(AbstractC007503q r7) {
        Set<String> A7P;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A0G.entrySet()) {
            if (!(entry == null || entry.getValue() == null || (A7P = ((AbstractC01950Ab) entry.getValue()).A7P(r7)) == null)) {
                String str = (String) entry.getKey();
                for (String str2 : A7P) {
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        return TextUtils.join(" ", arrayList);
    }

    public String A0G(String str) {
        boolean z;
        String A0K;
        String trim = AnonymousClass1YB.A01(5, str, this.A04).trim();
        int length = trim.length();
        if (length == 0) {
            return trim;
        }
        if (!trim.startsWith("\"") || !trim.endsWith("\"") || length <= 2) {
            z = false;
        } else {
            z = true;
            trim = trim.substring(1, length - 1);
        }
        String trim2 = AnonymousClass1YB.A02.matcher(trim).replaceAll(" ").trim();
        if (trim2.length() == 0) {
            return trim2;
        }
        if (z) {
            A0K = AnonymousClass008.A0L("\"", trim2, "\"");
        } else {
            A0K = AnonymousClass008.A0K(trim2, "*");
        }
        if (A0K.indexOf(105) == -1) {
            return A0K;
        }
        if (z) {
            StringBuilder A0Y = AnonymousClass008.A0Y(A0K, " OR ");
            A0Y.append(A0K.replace('i', (char) 305));
            return A0Y.toString();
        }
        String[] split = A0H.split(A0K);
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (str2.indexOf(105) == -1) {
                sb.append(str2);
            } else {
                sb.append(str2);
                sb.append(" OR ");
                sb.append(str2.replace('i', (char) 305));
            }
        }
        return sb.toString();
    }

    public final String A0H(BigDecimal bigDecimal, String str) {
        if (bigDecimal == null || TextUtils.isEmpty(bigDecimal.toPlainString()) || TextUtils.isEmpty(str)) {
            return null;
        }
        String plainString = bigDecimal.toPlainString();
        try {
            C05910Qz r3 = new C05910Qz(str);
            StringBuilder sb = new StringBuilder();
            sb.append(plainString);
            sb.append(" ");
            sb.append(r3.A03(this.A04, bigDecimal, true));
            return sb.toString();
        } catch (IllegalArgumentException unused) {
            Log.d("FtsMessageStore/formatAmount/currencyParseError");
            return plainString;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b6, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        if (r20.A0A == null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ba, code lost:
        r3 = new java.util.ArrayList();
        r2 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        if (r2.hasNext() == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c9, code lost:
        r1 = (X.AnonymousClass02N) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d5, code lost:
        if (X.AnonymousClass0AQ.A01(r20.A0A, r1) == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d7, code lost:
        r3.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00db, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00dc, code lost:
        r7.add(android.util.Pair.create(r8, r9));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0I(X.C08680bX r20, X.C04080Iy r21) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AM.A0I(X.0bX, X.0Iy):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J() {
        /*
            r7 = this;
            java.lang.String r0 = "FtsMessageStore/drop"
            X.0Kz r6 = new X.0Kz
            r6.<init>(r0)
            X.08d r3 = r7.A0C
            X.0OQ r4 = r3.A04()
            X.0Rk r5 = r4.A00()     // Catch:{ all -> 0x004c }
            X.0BK r2 = r4.A04     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "DROP TABLE IF EXISTS messages_fts"
            java.lang.String r0 = "DROP_TABLE_MESSAGES_FTS_DEPRECATED"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "DROP TABLE IF EXISTS message_ftsv2"
            java.lang.String r0 = "DROP_TABLE_MESSAGE_FTS"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0045 }
            r3.A05()     // Catch:{ all -> 0x0045 }
            X.08j r0 = r3.A07     // Catch:{ all -> 0x0045 }
            r0.A0B()     // Catch:{ all -> 0x0045 }
            X.08m r3 = r7.A0D     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "fts_index_start"
            r0 = 0
            r3.A03(r1, r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "fts_ready"
            r0 = 0
            r3.A04(r2, r0)     // Catch:{ all -> 0x0045 }
            r5.A00()     // Catch:{ all -> 0x0045 }
            r5.close()
            r4.close()
            r6.A01()
            return
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AM.A0J():void");
    }

    public void A0K(AbstractC01950Ab r5) {
        String A7a = r5.A7a();
        Map map = this.A0G;
        if (map.containsKey(A7a)) {
            AnonymousClass00E.A08(false, "Namespace already registered");
        }
        map.put(A7a, r5);
    }

    public void A0L(C08680bX r3) {
        try {
            A0M(r3);
        } catch (IllegalStateException e) {
            Log.e("FtsMessageStore/safeWarm/failed to warm contact list", e);
        }
    }

    public void A0M(C08680bX r6) {
        if (r6.A0C == null) {
            synchronized (r6.A0H) {
                if (r6.A0C == null) {
                    C04600Kz r4 = new C04600Kz("FtsMessageStore/getSearchableContacts");
                    LinkedList linkedList = new LinkedList(this.A07.A05().values());
                    r6.A0C = linkedList;
                    if (!(r6.A0B == null || linkedList == null)) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            AnonymousClass02N r1 = (AnonymousClass02N) ((C007003k) it.next()).A02(AnonymousClass02N.class);
                            if (r1 == null || !AnonymousClass0AQ.A01(r6.A0B, r1)) {
                                it.remove();
                            }
                        }
                    }
                    List list = r6.A0C;
                    if (list != null) {
                        list.size();
                        r4.A01();
                        return;
                    }
                    throw null;
                }
            }
        }
    }

    public void A0N(AbstractC007503q r7, List list) {
        A07(r7, false, A05(), Collections.emptyMap());
    }

    public boolean A0O() {
        long parseLong;
        String A012 = this.A0D.A01("fts_ready");
        if (A012 == null) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(A012);
        }
        return parseLong % 2 != 0;
    }
}
