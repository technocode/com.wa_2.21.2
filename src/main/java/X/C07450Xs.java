package X;

import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.SettingsPrivacy;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Xs  reason: invalid class name and case insensitive filesystem */
public class C07450Xs implements AnonymousClass0C0 {
    public static volatile C07450Xs A0C;
    public final AnonymousClass0GG A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass01I A03;
    public final C03490Gl A04;
    public final AnonymousClass0I4 A05;
    public final AnonymousClass0EV A06;
    public final AnonymousClass00D A07;
    public final C02430Bz A08;
    public final AnonymousClass0I8 A09;
    public final AnonymousClass0AR A0A;
    public final C04510Kq A0B;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{203};
    }

    public C07450Xs(AnonymousClass02M r1, C03490Gl r2, AnonymousClass009 r3, AnonymousClass01I r4, AnonymousClass0AR r5, AnonymousClass0GG r6, C04510Kq r7, AnonymousClass0EV r8, AnonymousClass00D r9, AnonymousClass0I8 r10, AnonymousClass0I4 r11, C02430Bz r12) {
        this.A02 = r1;
        this.A04 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A0A = r5;
        this.A00 = r6;
        this.A0B = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A09 = r10;
        this.A05 = r11;
        this.A08 = r12;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        long A062;
        if (i != 203) {
            return false;
        }
        AnonymousClass0M5 r2 = (AnonymousClass0M5) message.obj;
        AnonymousClass1XX r5 = (AnonymousClass1XX) message.getData().getParcelable("stanzaKey");
        if (r5 != null) {
            AnonymousClass0M5 A0B2 = r2.A0B();
            String str = A0B2.A00;
            if ("status".equals(str)) {
                if ("modify".equals(A0B2.A0G("action", null))) {
                    C04510Kq r3 = this.A0B;
                    C64512yJ r0 = new C64512yJ();
                    r0.A05 = true;
                    r3.A01(new C64522yK(r0), false, true);
                } else {
                    String A0G = A0B2.A0G("dhash", null);
                    String A002 = AnonymousClass0M5.A00(A0B2.A01);
                    AnonymousClass02M r22 = this.A02;
                    r22.A02.post(new RunnableEBaseShape0S2100000_I0(this, A002, A0G, 1));
                }
            } else if ("picture".equals(str)) {
                if ("modify".equals(A0B2.A0G("action", null))) {
                    C04510Kq r32 = this.A0B;
                    C64512yJ r02 = new C64512yJ();
                    r02.A03 = true;
                    r32.A01(new C64522yK(r02), false, true);
                } else if (A0B2.A0D("delete") != null) {
                    AnonymousClass0EV r1 = this.A06;
                    AnonymousClass01I r03 = this.A03;
                    r03.A04();
                    r1.A03(r03.A03);
                }
            } else if ("devices".equals(str)) {
                if ("modify".equals(A0B2.A0G("action", null))) {
                    C04510Kq r33 = this.A0B;
                    C64512yJ r04 = new C64512yJ();
                    r04.A02 = true;
                    r33.A01(new C64522yK(r04), false, true);
                } else if (!A0B2.A0H("device").isEmpty()) {
                    AnonymousClass0M5 A0D = A0B2.A0D("key-index-list");
                    if (A0D == null) {
                        A062 = 0;
                    } else {
                        A062 = A0D.A06("ts");
                    }
                    if (this.A07.A00.getLong("adv_timestamp_sec", -1) <= A062) {
                        this.A08.A05(C002001d.A0t(this.A01, A0B2), this.A09.A07());
                    }
                }
            } else if ("privacy".equals(str)) {
                if ("modify".equals(A0B2.A0G("action", null))) {
                    C04510Kq r34 = this.A0B;
                    C64512yJ r05 = new C64512yJ();
                    r05.A04 = true;
                    r34.A01(new C64522yK(r05), false, true);
                } else if (!A0B2.A0H("category").isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (AnonymousClass0M5 r23 : A0B2.A0H("category")) {
                        hashMap.put(r23.A0F("name"), r23.A0F("value"));
                    }
                    AnonymousClass0I4 r35 = this.A05;
                    SettingsPrivacy.A07(r35.A00, r35.A01, r35.A02, r35, hashMap);
                }
            } else if ("blocklist".equals(str)) {
                String string = this.A07.A00.getString("block_list_v2_dhash", null);
                String A0G2 = A0B2.A0G("prev_dhash", null);
                if ("modify".equals(A0B2.A0G("action", null)) || !TextUtils.equals(string, A0G2)) {
                    C04510Kq r36 = this.A0B;
                    C64512yJ r06 = new C64512yJ();
                    r06.A01 = true;
                    r36.A01(new C64522yK(r06), false, true);
                } else if (!A0B2.A0H("item").isEmpty()) {
                    AnonymousClass009 r6 = this.A01;
                    HashMap hashMap2 = new HashMap();
                    for (AnonymousClass0M5 r37 : A0B2.A0H("item")) {
                        hashMap2.put(r37.A09(UserJid.class, "jid", r6), Boolean.valueOf("block".equals(r37.A0F("action"))));
                    }
                    HashSet<UserJid> hashSet = new HashSet();
                    HashSet<UserJid> hashSet2 = new HashSet();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                        Object key = entry.getKey();
                        if (booleanValue) {
                            hashSet.add(key);
                        } else {
                            hashSet2.add(key);
                        }
                    }
                    AnonymousClass0GG r4 = this.A00;
                    String A0G3 = A0B2.A0G("dhash", null);
                    synchronized (r4) {
                        Set set = r4.A0O;
                        hashSet.removeAll(set);
                        hashSet2.retainAll(set);
                        if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
                            for (UserJid userJid : hashSet) {
                                r4.A0C(userJid, true);
                            }
                            for (UserJid userJid2 : hashSet2) {
                                r4.A0C(userJid2, false);
                            }
                            set.addAll(hashSet);
                            set.removeAll(hashSet2);
                            r4.A0A.A09(r4.A02());
                            r4.A0F.A00.edit().putString("block_list_v2_dhash", A0G3).apply();
                            HashSet hashSet3 = new HashSet(hashSet);
                            hashSet3.addAll(hashSet2);
                            AnonymousClass02M r24 = r4.A06;
                            r24.A02.post(new RunnableEBaseShape1S0200000_I0_0(r4, hashSet3, 9));
                        }
                    }
                }
            }
            this.A0A.A0M(r5);
            return true;
        }
        throw null;
    }
}
