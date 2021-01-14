package X;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0GG  reason: invalid class name */
public class AnonymousClass0GG {
    public static volatile AnonymousClass0GG A0P;
    public C42861xP A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass0GH A03;
    public final AnonymousClass009 A04;
    public final AnonymousClass0EW A05;
    public final AnonymousClass02M A06;
    public final C000300f A07;
    public final AnonymousClass09K A08;
    public final AnonymousClass0GI A09;
    public final AnonymousClass0GJ A0A;
    public final AnonymousClass08B A0B;
    public final AnonymousClass0AI A0C;
    public final C014308b A0D;
    public final AnonymousClass00S A0E;
    public final AnonymousClass00D A0F;
    public final AnonymousClass01X A0G;
    public final AnonymousClass01K A0H;
    public final AnonymousClass0AP A0I;
    public final AnonymousClass095 A0J;
    public final AnonymousClass09H A0K;
    public final AnonymousClass01R A0L;
    public final AnonymousClass00T A0M;
    public final AnonymousClass0C4 A0N;
    public final Set A0O = new HashSet();

    public AnonymousClass0GG(AnonymousClass00S r3, AnonymousClass0GH r4, AnonymousClass02M r5, AnonymousClass009 r6, AnonymousClass00T r7, AnonymousClass095 r8, AnonymousClass0C4 r9, C000300f r10, AnonymousClass09H r11, C014308b r12, AnonymousClass01X r13, AnonymousClass0EW r14, AnonymousClass08B r15, AnonymousClass01K r16, AnonymousClass0AP r17, AnonymousClass08H r18, AnonymousClass09K r19, AnonymousClass00D r20, AnonymousClass01R r21, AnonymousClass0AI r22, AnonymousClass0GI r23) {
        AnonymousClass0GJ r1 = new AnonymousClass0GJ(r18);
        this.A0E = r3;
        this.A03 = r4;
        this.A06 = r5;
        this.A04 = r6;
        this.A0M = r7;
        this.A0J = r8;
        this.A0N = r9;
        this.A07 = r10;
        this.A0K = r11;
        this.A0D = r12;
        this.A0G = r13;
        this.A05 = r14;
        this.A0B = r15;
        this.A0H = r16;
        this.A0I = r17;
        this.A08 = r19;
        this.A0F = r20;
        this.A0L = r21;
        this.A0C = r22;
        this.A09 = r23;
        this.A0A = r1;
    }

    public static AnonymousClass0GG A00() {
        if (A0P == null) {
            synchronized (AnonymousClass0GG.class) {
                if (A0P == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass0GH A003 = AnonymousClass0GH.A00();
                    AnonymousClass02M A004 = AnonymousClass02M.A00();
                    AnonymousClass009 A005 = AnonymousClass009.A00();
                    AnonymousClass00T A006 = C002101e.A00();
                    AnonymousClass095 A007 = AnonymousClass095.A00();
                    AnonymousClass0C4 A008 = AnonymousClass0C4.A00();
                    C000300f A009 = C000300f.A00();
                    AnonymousClass09H A012 = AnonymousClass09H.A01();
                    C014308b A0010 = C014308b.A00();
                    AnonymousClass01X A0011 = AnonymousClass01X.A00();
                    AnonymousClass0EW r16 = AnonymousClass0EW.A01;
                    AnonymousClass08B r17 = AnonymousClass08B.A00;
                    AnonymousClass01K A0012 = AnonymousClass01K.A00();
                    AnonymousClass0AP A0013 = AnonymousClass0AP.A00();
                    AnonymousClass08H A0014 = AnonymousClass08H.A00();
                    AnonymousClass09K r21 = AnonymousClass09K.A07;
                    AnonymousClass00D A0015 = AnonymousClass00D.A00();
                    AnonymousClass01R A013 = AnonymousClass01R.A01();
                    AnonymousClass0AI A0016 = AnonymousClass0AI.A00();
                    if (AnonymousClass0GI.A02 == null) {
                        synchronized (AnonymousClass0GI.class) {
                            if (AnonymousClass0GI.A02 == null) {
                                AnonymousClass0GI.A02 = new AnonymousClass0GI(AnonymousClass022.A00());
                            }
                        }
                    }
                    A0P = new AnonymousClass0GG(A002, A003, A004, A005, A006, A007, A008, A009, A012, A0010, A0011, r16, r17, A0012, A0013, A0014, r21, A0015, A013, A0016, AnonymousClass0GI.A02);
                }
            }
        }
        return A0P;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A01(X.AnonymousClass02N r7) {
        /*
            r6 = this;
            X.0AP r0 = r6.A0I
            X.03q r0 = r0.A02(r7)
            if (r0 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            X.095 r2 = r6.A0J
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            X.08c r0 = r2.A00
            long r0 = r0.A05(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = 0
            r5[r4] = r0
            X.08d r0 = r2.A03
            X.0OQ r3 = r0.A03()
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "SELECT  1 FROM available_message_view WHERE chat_row_id=? AND message_type NOT IN ('7') AND from_me = 1 LIMIT 1"
            java.lang.String r0 = "OUTGOING_MESSAGE_EXISTS_RAW_SQL"
            android.database.Cursor r1 = r2.A07(r1, r5, r0)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x003d
            int r0 = r1.getCount()     // Catch:{ all -> 0x0035 }
            if (r0 <= 0) goto L_0x003d
            goto L_0x003c
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r4 = 1
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()
        L_0x0042:
            r3.close()
            r0 = r4 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GG.A01(X.02N):java.lang.Boolean");
    }

    public synchronized Set A02() {
        return new HashSet(this.A0O);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r6.equals(r1) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r1.equals(r2) == false) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GG.A03():void");
    }

    public synchronized void A04() {
        Set set = this.A0O;
        HashSet hashSet = new HashSet(set);
        set.clear();
        A05();
        AnonymousClass0EW r2 = this.A05;
        r2.A00.post(new RunnableEBaseShape0S0100000_I0_0(this, 39));
        A0E(hashSet);
    }

    public synchronized void A05() {
        AnonymousClass00D r2 = this.A0F;
        AnonymousClass008.A0m(r2, "block_list_v2_dhash", null);
        r2.A00.edit().remove("block_list_receive_time").apply();
    }

    public final void A06(Activity activity, AnonymousClass1KW r5, C27911Sc r6) {
        this.A03.A01(activity, r6.A04, new C38411pp(this, activity, r5, r6));
    }

    public void A07(Activity activity, AnonymousClass1KW r4, UserJid userJid) {
        A06(activity, r4, new C27911Sc(false, userJid));
    }

    public final void A08(Activity activity, AnonymousClass1KW r34, AnonymousClass1Xa r35, boolean z, C27911Sc r37) {
        String A022;
        AnonymousClass0M5 r11;
        AnonymousClass0OS[] r9;
        boolean z2;
        byte b;
        AnonymousClass0M5 r1;
        String str;
        AnonymousClass1KW r6 = r34;
        UserJid userJid = r37.A00;
        boolean z3 = r37.A04;
        if (this.A08.A06) {
            Set A023 = A02();
            AbstractCollection abstractCollection = (AbstractCollection) A023;
            if (z3) {
                abstractCollection.add(userJid);
            } else {
                abstractCollection.remove(userJid);
            }
            if (r35 == null && r34 == null) {
                r6 = new C38401po(this, activity, z3);
            }
            C27891Sa r13 = new C27891Sa(activity, this.A06, this.A04, this.A0N, this.A07, this.A0K, this, this.A0B, this.A0F, r6, z, r35, A023, r37, this.A0C.A01(userJid));
            AnonymousClass1Xa r4 = r13.A0C;
            if (r4 != null) {
                A022 = r4.A01;
            } else {
                A022 = r13.A0B.A02();
            }
            String str2 = "none";
            if (r13.A03.A07.A0D(AbstractC000400g.A1O)) {
                AnonymousClass3L8 r3 = new AnonymousClass3L8(r13.A04, r13.A06, r13.A0B, r13.A0A, new C42851xO(r13));
                C27911Sc r12 = r13.A07;
                C28241Tl r112 = r13.A08;
                Log.i("blocklistv2setprotocolhelper/sendGetBlocklistRequest");
                AnonymousClass09H r0 = r3.A04;
                String string = r3.A03.A00.getString("block_list_v2_dhash", null);
                String str3 = "block";
                String str4 = "unblock";
                if (TextUtils.isEmpty(string)) {
                    r9 = new AnonymousClass0OS[2];
                    z2 = r12.A04;
                    if (z2) {
                        str4 = str3;
                    }
                    r9[0] = new AnonymousClass0OS("action", str4, null, (byte) 0);
                    r9[1] = new AnonymousClass0OS("jid", r12.A00);
                } else {
                    r9 = new AnonymousClass0OS[3];
                    z2 = r12.A04;
                    if (z2) {
                        b = 0;
                    } else {
                        b = 0;
                        str3 = str4;
                    }
                    r9[b] = new AnonymousClass0OS("action", str3, null, b);
                    r9[1] = new AnonymousClass0OS("jid", r12.A00);
                    r9[2] = new AnonymousClass0OS("dhash", string, null, b);
                }
                C000300f r62 = r3.A01;
                if (r62.A0D(AbstractC000400g.A0q) && z2) {
                    Boolean bool = r12.A01;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            str2 = "true";
                        } else {
                            str2 = "false";
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    String str5 = r12.A03;
                    if (!(str5 == null || (str = r12.A02) == null)) {
                        arrayList.add(new AnonymousClass0OS("first_message", str2, null, (byte) 0));
                        arrayList.add(new AnonymousClass0OS("entry_point", str, null, (byte) 0));
                        arrayList.add(new AnonymousClass0OS("reason", str5, null, (byte) 0));
                    }
                    if (r62.A0D(AbstractC000400g.A0s) && r112 != null) {
                        arrayList.add(new AnonymousClass0OS("business_discovery_entry_point", r112.A03, null, (byte) 0));
                        arrayList.add(new AnonymousClass0OS("business_discovery_timestamp", r112.A00));
                        String str6 = r112.A02;
                        if (str6 != null) {
                            AnonymousClass008.A1F("business_discovery_id", str6, arrayList);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        r1 = new AnonymousClass0M5("biz_opt_out", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null);
                        r0.A0B(2, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0), new AnonymousClass0OS("xmlns", "blocklist", null, (byte) 0)}, new AnonymousClass0M5("item", r9, r1)), r3, 20000);
                        return;
                    }
                }
                r1 = null;
                r0.A0B(2, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0), new AnonymousClass0OS("xmlns", "blocklist", null, (byte) 0)}, new AnonymousClass0M5("item", r9, r1)), r3, 20000);
                return;
            }
            AnonymousClass3L7 r32 = new AnonymousClass3L7(r13.A06, r13.A0B, new C42841xN(r13));
            Set<Jid> set = r13.A0G;
            C27911Sc r8 = r13.A07;
            Log.i("blocklistv1setprotocolhelper/sendGetBlocklistRequest");
            AnonymousClass09H r02 = r32.A02;
            String str7 = r8.A03;
            String str8 = r8.A02;
            Boolean bool2 = r8.A01;
            boolean z4 = r8.A04;
            int size = set.size();
            AnonymousClass0M5[] r17 = new AnonymousClass0M5[size];
            if (!r32.A00.A0D(AbstractC000400g.A0q) || !z4 || str8 == null || str7 == null) {
                r11 = null;
            } else {
                if (bool2 != null) {
                    str2 = String.valueOf(bool2);
                }
                r11 = new AnonymousClass0M5("biz_opt_out", new AnonymousClass0OS[]{new AnonymousClass0OS("entry_point", str8, null, (byte) 0), new AnonymousClass0OS("first_message", str2, null, (byte) 0), new AnonymousClass0OS("reason", str7, null, (byte) 0)}, null, null);
            }
            int i = 0;
            for (Jid jid : set) {
                AnonymousClass0OS[] r10 = {new AnonymousClass0OS("type", "jid", null, (byte) 0), new AnonymousClass0OS("value", jid), new AnonymousClass0OS("action", "deny", null, (byte) 0), new AnonymousClass0OS("order", Integer.toString(i), null, (byte) 0)};
                AnonymousClass0M5 r5 = null;
                if (r8.A00.equals(jid)) {
                    r5 = r11;
                }
                r17[i] = new AnonymousClass0M5("item", r10, r5);
                i++;
            }
            AnonymousClass0OS[] r63 = {new AnonymousClass0OS("name", "default", null, (byte) 0)};
            if (size == 0) {
                r17 = null;
            }
            AnonymousClass0M5 r64 = new AnonymousClass0M5("query", (AnonymousClass0OS[]) null, new AnonymousClass0M5("list", r63, r17, null));
            int i2 = 4;
            if (r4 == null) {
                i2 = 3;
            }
            AnonymousClass0OS[] r52 = new AnonymousClass0OS[i2];
            r52[0] = new AnonymousClass0OS("id", A022, null, (byte) 0);
            r52[1] = new AnonymousClass0OS("xmlns", "jabber:iq:privacy", null, (byte) 0);
            r52[2] = new AnonymousClass0OS("type", "set", null, (byte) 0);
            if (r4 != null) {
                r52[3] = new AnonymousClass0OS("web", r4.A00, null, (byte) 0);
            }
            r02.A0B(2, A022, new AnonymousClass0M5("iq", r52, r64), r32, 20000);
        }
    }

    public void A09(Activity activity, C007003k r9, boolean z) {
        A0A(activity, false, null, z, r9, null);
    }

    public final void A0A(Activity activity, boolean z, String str, boolean z2, C007003k r15, String str2) {
        AnonymousClass1KW r0;
        Boolean bool;
        UserJid userJid = (UserJid) r15.A02(UserJid.class);
        if (userJid != null) {
            if (z2) {
                r0 = new AnonymousClass1rT(r15, z, this.A06, this.A0D, this.A0G);
            } else {
                r0 = C38421pq.A00;
            }
            if (!z || str == null) {
                bool = null;
            } else {
                bool = A01(userJid);
            }
            A06(activity, r0, new C27911Sc(z, userJid, str, bool, str2));
            return;
        }
        throw null;
    }

    public final void A0B(UserJid userJid, String str, boolean z) {
        A0C(userJid, z);
        AnonymousClass0GJ r6 = this.A0A;
        if (r6 != null) {
            if (z) {
                try {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("jid", userJid.getRawString());
                    r6.A08("wa_block_list", contentValues);
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder("contact-mgr-db/unable to update blocked state  ");
                    sb.append(userJid);
                    sb.append(", ");
                    sb.append(z);
                    String obj = sb.toString();
                    if (obj != null) {
                        Log.e(obj, e);
                    } else {
                        throw null;
                    }
                }
            } else {
                r6.A06("wa_block_list", "jid = ?", new String[]{userJid.getRawString()});
            }
            AnonymousClass008.A0m(this.A0F, "block_list_v2_dhash", str);
            AnonymousClass02M r2 = this.A06;
            r2.A02.post(new RunnableEBaseShape1S0200000_I0_0(this, userJid, 8));
            return;
        }
        throw null;
    }

    public synchronized void A0C(UserJid userJid, boolean z) {
        if (this.A07.A0D(AbstractC000400g.A0q)) {
            AnonymousClass01R r3 = this.A0L;
            long A052 = this.A0E.A05();
            AnonymousClass0A6 r0 = r3.A04;
            C12160he r2 = (C12160he) AnonymousClass01R.A00(AnonymousClass0FI.A07(r0.A01, r0.A00, userJid, true), A052, 58);
            r2.A00 = z;
            this.A0H.A0e(r2, -1);
        }
    }

    public void A0D(AbstractC03810Hu r21) {
        AnonymousClass0M5 r0;
        AnonymousClass0M5 r3;
        AnonymousClass3L6 r12 = new AnonymousClass3L6(this.A06, this.A04, this.A0K, this, this.A0F, r21);
        Log.i("getblocklistprotocolhelper/sendGetBlocklistRequest");
        AnonymousClass09H r13 = r12.A04;
        String A022 = r13.A02();
        if (r12.A06) {
            String string = r12.A03.A00.getString("block_list_v2_dhash", null);
            if (TextUtils.isEmpty(string)) {
                r3 = null;
            } else {
                r3 = new AnonymousClass0M5("item", new AnonymousClass0OS[]{new AnonymousClass0OS("dhash", string, null, (byte) 0)}, null, null);
            }
            r0 = new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("xmlns", "blocklist", null, (byte) 0)}, r3);
        } else {
            r0 = new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "jabber:iq:privacy", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0)}, new AnonymousClass0M5("query", (AnonymousClass0OS[]) null, new AnonymousClass0M5("list", new AnonymousClass0OS[]{new AnonymousClass0OS("name", "default", null, (byte) 0)}, null, null)));
        }
        r13.A06(198, A022, r0, r12, 0);
    }

    public final void A0E(Collection collection) {
        if (!collection.isEmpty()) {
            this.A0B.A09(collection);
        }
    }

    public synchronized void A0F(Set set, String str) {
        String str2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.addAll(set);
        Set set2 = this.A0O;
        hashSet.removeAll(set2);
        hashSet2.addAll(set2);
        hashSet2.removeAll(set);
        hashSet3.addAll(hashSet);
        hashSet3.addAll(hashSet2);
        boolean z = this.A01;
        boolean A0G2 = A0G();
        this.A01 = true;
        if (!hashSet3.isEmpty()) {
            if (A0G2 && z) {
                StringBuilder sb = new StringBuilder();
                sb.append("old block list: ");
                sb.append(Arrays.toString(set2.toArray()));
                Log.e(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("new block list: ");
                sb2.append(Arrays.toString(set.toArray()));
                Log.e(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("added: ");
                sb3.append(Arrays.toString(hashSet.toArray()));
                Log.e(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("removed: ");
                sb4.append(Arrays.toString(hashSet2.toArray()));
                Log.e(sb4.toString());
                if (hashSet.isEmpty() || hashSet2.isEmpty()) {
                    str2 = !hashSet.isEmpty() ? "Added" : "Removed";
                } else {
                    str2 = "Added/Removed";
                }
                this.A04.A04("block list de-synchronization", str2, true);
            }
            this.A05.A00.post(new RunnableEBaseShape0S1300000_I0(this, set, str, hashSet3, 0));
        } else {
            this.A0F.A00.edit().putLong("block_list_receive_time", this.A0E.A05()).apply();
            if (!A0G2) {
                this.A0B.A09(Collections.emptyList());
            }
        }
    }

    public synchronized boolean A0G() {
        boolean z;
        z = false;
        if (this.A0F.A00.getLong("block_list_receive_time", 0) != 0) {
            z = true;
        }
        return z;
    }

    public synchronized boolean A0H(UserJid userJid) {
        if (userJid == null) {
            return false;
        }
        return this.A0O.contains(userJid);
    }
}
