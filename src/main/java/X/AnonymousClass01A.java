package X;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: X.01A  reason: invalid class name */
public class AnonymousClass01A {
    public static volatile AnonymousClass01A A0B;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass01I A01;
    public final AnonymousClass08R A02;
    public final AnonymousClass08Q A03 = new AnonymousClass08Q();
    public final AnonymousClass01B A04;
    public final AnonymousClass08B A05;
    public final AnonymousClass08C A06;
    public final AnonymousClass00S A07;
    public final AnonymousClass03S A08;
    public final AnonymousClass00D A09;
    public final AnonymousClass01X A0A;

    public AnonymousClass01A(AnonymousClass00S r3, AnonymousClass01I r4, AnonymousClass01X r5, AnonymousClass08B r6, AnonymousClass08C r7, AnonymousClass03S r8, AnonymousClass00D r9, AnonymousClass01B r10) {
        this.A07 = r3;
        this.A01 = r4;
        this.A0A = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A08 = r8;
        this.A09 = r9;
        this.A04 = r10;
        this.A02 = new AnonymousClass08R(r5);
    }

    public static AnonymousClass01A A00() {
        if (A0B == null) {
            synchronized (AnonymousClass01A.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass01A(AnonymousClass00S.A00(), AnonymousClass01I.A00(), AnonymousClass01X.A00(), AnonymousClass08B.A00, AnonymousClass08C.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00(), AnonymousClass01B.A00());
                }
            }
        }
        return A0B;
    }

    public static ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C007003k r1 = (C007003k) it.next();
            if (r1 != null && !(r1.A09 instanceof AnonymousClass2A1) && !r1.A09()) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public static void A02(Collection collection, String str) {
        int size = collection.size();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/count ");
        sb.append(size);
        Log.i(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (r6 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03() {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A03():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[SYNTHETIC, Splitter:B:16:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri A04(X.C007003k r7, android.content.ContentResolver r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 != 0) goto L_0x0004
            return r5
        L_0x0004:
            X.03S r1 = r6.A08
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x000f
            return r5
        L_0x000f:
            X.0QW r0 = r7.A08
            if (r0 == 0) goto L_0x002a
            long r1 = r0.A00
            r3 = -2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x002a
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r1)
        L_0x0027:
            if (r0 != 0) goto L_0x002c
            return r5
        L_0x002a:
            r0 = r5
            goto L_0x0027
        L_0x002c:
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.getContactLookupUri(r8, r0)     // Catch:{ SecurityException -> 0x0038, NullPointerException -> 0x0031 }
            return r0
        L_0x0031:
            r1 = move-exception
            java.lang.String r0 = "contactmanager/NPE"
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        L_0x0038:
            r2 = move-exception
            java.lang.String r1 = "contactmanager/permission problem:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A04(X.03k, android.content.ContentResolver):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r5 = r12.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r5 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r4 = X.AnonymousClass01C.A02();
        r2 = r5.A07("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", X.AnonymousClass01B.A07, "wa_contacts._id = ?", new java.lang.String[]{java.lang.String.valueOf(r13)}, null, "CONTACT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r2 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contact-mgr-db/unable to get contact by id ");
        r1.append(r13);
        X.AnonymousClass00E.A08(false, r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r2.moveToNext() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        r10 = X.C001801b.A0C(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r1 = r2.getCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        r2.close();
        r5.A0M(r10, r5.A05.A0I());
        r2 = new java.lang.StringBuilder("fetched ");
        r2.append(r1);
        r2.append(" contacts by id=");
        r2.append(r13);
        r2.append(' ');
        r2.append(r10);
        r2.append(" | time: ");
        r2.append(r4.A00());
        com.whatsapp.util.Log.d(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        if (r2 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C007003k A05(long r13) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A05(long):X.03k");
    }

    public C007003k A06(AnonymousClass0OP r13, String str, long j) {
        return A0B(r13, str, j, C11220fu.A04, false, false, false, false, 0, null);
    }

    public C007003k A07(AnonymousClass02N r3) {
        AnonymousClass01I r1 = this.A01;
        if (r1.A09(r3)) {
            r1.A04();
            return r1.A01;
        }
        boolean A0a = AnonymousClass1VY.A0a(r3);
        if (A0a) {
            return this.A02.A00;
        }
        AnonymousClass08R r0 = this.A02;
        if (r0 == null) {
            throw null;
        } else if (A0a) {
            return r0.A00;
        } else {
            return (C007003k) r0.A01.get(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0178, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0179, code lost:
        if (r11 != null) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0181, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0185, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0188, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x018c, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x008b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C007003k A08(X.AnonymousClass02N r23) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A08(X.02N):X.03k");
    }

    public C007003k A09(AnonymousClass02N r3) {
        AnonymousClass01I r1 = this.A01;
        if (r1.A09(r3)) {
            r1.A04();
            return r1.A01;
        } else if (AnonymousClass1VY.A0a(r3)) {
            return this.A02.A00;
        } else {
            return A08(r3);
        }
    }

    public C007003k A0A(AnonymousClass02N r9) {
        C007003k A092 = A09(r9);
        if (A092 != null) {
            return A092;
        }
        C007003k r3 = new C007003k(r9);
        AnonymousClass01B r6 = this.A04;
        if (r6 != null) {
            C04600Kz A022 = AnonymousClass01C.A02();
            Jid jid = r3.A09;
            if (jid == null) {
                Log.w("contact-mgr-db/unable to add unknown contact with null jid");
                return r3;
            }
            AnonymousClass01I r1 = r6.A01;
            r1.A04();
            if (r1.A03 == null) {
                Log.w("contact-mgr-db/unable to add unknown contact due to null me record");
                return r3;
            } else if (r3.A09() || !r1.A09(jid)) {
                ContentValues contentValues = new ContentValues(4);
                contentValues.put("jid", jid.getRawString());
                contentValues.put("is_whatsapp_user", Boolean.TRUE);
                contentValues.put("status", r3.A0L);
                contentValues.put("status_timestamp", Long.valueOf(r3.A07));
                try {
                    long A042 = r6.A04("wa_contacts", contentValues);
                    if (!(r3 instanceof AnonymousClass08S)) {
                        r3.A04 = A042;
                    } else {
                        StringBuilder sb = new StringBuilder("Attempting to set the id of the server contact to=");
                        sb.append(A042);
                        Log.e(sb.toString());
                    }
                    r6.A02.A02(Collections.singletonList(r3));
                    StringBuilder sb2 = new StringBuilder("contact-mgr-db/unknown contact added: ");
                    sb2.append(r3);
                    sb2.append(" | time: ");
                    AnonymousClass008.A0r(A022, sb2);
                    return r3;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb3 = new StringBuilder("contact-mgr-db/unable to add unknown contact ");
                    sb3.append(r3);
                    String obj = sb3.toString();
                    if (obj != null) {
                        Log.e(obj, e);
                        return r3;
                    }
                    throw null;
                }
            } else {
                Log.i("contact-mgr-db/unable to add unknown contact due to matching jid prefix");
                return r3;
            }
        } else {
            throw null;
        }
    }

    public C007003k A0B(AnonymousClass02W r9, String str, long j, C11220fu r13, boolean z, boolean z2, boolean z3, boolean z4, int i, UserJid userJid) {
        Log.i("addGroupChatContact");
        C007003k r3 = new C007003k(r9);
        r3.A0F = str;
        r3.A0J = Long.toString(j);
        r3.A0S = z;
        r3.A0Z = z2;
        r3.A0Q = z3;
        r3.A0Y = z4;
        r3.A00 = i;
        r3.A0A = userJid;
        if (r13.A02 != null) {
            r3.A0B = r13;
        }
        AnonymousClass01B r2 = this.A04;
        if (r2 != null) {
            C04600Kz A022 = AnonymousClass01C.A02();
            Jid jid = r3.A09;
            if (jid == null) {
                Log.w("contact-mgr-db/unable to add group chat with null jid");
                return r3;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("jid", jid.getRawString());
            contentValues.put("is_whatsapp_user", Boolean.TRUE);
            contentValues.put("status", r3.A0L);
            contentValues.put("status_timestamp", Long.valueOf(r3.A07));
            contentValues.put("display_name", r3.A0F);
            contentValues.put("phone_label", r3.A0J);
            try {
                long A042 = r2.A04("wa_contacts", contentValues);
                if (!(r3 instanceof AnonymousClass08S)) {
                    r3.A04 = A042;
                } else {
                    StringBuilder sb = new StringBuilder("Attempting to set the id of the server contact to=");
                    sb.append(A042);
                    Log.e(sb.toString());
                }
                r2.A0L(r3, (AnonymousClass02U) r3.A02(AnonymousClass02U.class));
            } catch (IllegalArgumentException e) {
                StringBuilder sb2 = new StringBuilder("contact-mgr-db/unable to add group chat ");
                sb2.append(r3);
                String obj = sb2.toString();
                if (obj != null) {
                    Log.e(obj, e);
                } else {
                    throw null;
                }
            }
            StringBuilder sb3 = new StringBuilder("contact-mgr-db/group chat added: ");
            sb3.append(r3);
            sb3.append(" | time: ");
            AnonymousClass008.A0r(A022, sb3);
            return r3;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r5 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C007003k A0C(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0C(java.lang.String):X.03k");
    }

    public UserJid A0D(GroupJid groupJid) {
        UserJid userJid;
        String str;
        int indexOf;
        String substring;
        C007003k A092;
        if (groupJid == null || (A092 = A09(groupJid)) == null || (userJid = A092.A0A) == null) {
            userJid = null;
            if (!(groupJid == null || (str = groupJid.user) == null || (indexOf = str.indexOf("-")) == -1 || (substring = str.substring(0, indexOf)) == null)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append("@");
                    sb.append("s.whatsapp.net");
                    return UserJid.get(sb.toString());
                } catch (AnonymousClass02Y unused) {
                    StringBuilder A0S = AnonymousClass008.A0S("jids/failed to get group creator jid from group jid: ");
                    A0S.append(AnonymousClass1VY.A0D(groupJid));
                    Log.w(A0S.toString());
                    return null;
                }
            }
        }
        return userJid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0E() {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0E():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        if (r1 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0F() {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0F():java.util.ArrayList");
    }

    public Collection A0G(Set set) {
        long currentTimeMillis = System.currentTimeMillis();
        Collection<C007003k> A0F = this.A04.A0F(false);
        ArrayList arrayList = new ArrayList();
        for (C007003k r1 : A0F) {
            if (r1.A08() || set.contains(r1.A09)) {
                arrayList.add(r1);
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("returned ");
        A0S.append(arrayList.size());
        A0S.append(" sidelist sync pending contacts | time: ");
        A0S.append(System.currentTimeMillis() - currentTimeMillis);
        Log.i(A0S.toString());
        return arrayList;
    }

    public void A0H() {
        byte[] bArr = new byte[12];
        new Random().nextBytes(bArr);
        AnonymousClass008.A0m(this.A09, "web_contact_checksum", Base64.encodeToString(bArr, 8));
    }

    public void A0I(C007003k r6) {
        AnonymousClass01B r2 = this.A04;
        if (r2 != null) {
            C04600Kz A022 = AnonymousClass01C.A02();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("status_autodownload_disabled", Integer.valueOf(r6.A0a ? 1 : 0));
            r2.A0G(contentValues, r6.A09);
            StringBuilder sb = new StringBuilder("updated contact status autodownload jid=");
            sb.append(r6.A09);
            sb.append(' ');
            sb.append(contentValues);
            sb.append(" | time: ");
            sb.append(A022.A00());
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A0J(C007003k r6) {
        AnonymousClass01B r2 = this.A04;
        if (r2 != null) {
            C04600Kz A022 = AnonymousClass01C.A02();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("wa_name", r6.A0O);
            r2.A0G(contentValues, r6.A09);
            StringBuilder sb = new StringBuilder("updated whatsapp name for contact jid=");
            sb.append(r6.A09);
            sb.append(' ');
            sb.append(contentValues);
            sb.append(" | time: ");
            sb.append(A022.A00());
            Log.i(sb.toString());
            this.A02.A00(r6);
            A0H();
            return;
        }
        throw null;
    }

    public void A0K(C007003k r5) {
        this.A04.A0J(r5);
        this.A02.A00(r5);
        this.A00.post(new RunnableEBaseShape2S0100000_I0_2(this.A05, 24));
    }

    public void A0L(C007003k r6) {
        AnonymousClass01B r2 = this.A04;
        if (r2 != null) {
            C04600Kz A022 = AnonymousClass01C.A02();
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("photo_ts", Integer.valueOf(r6.A01));
            contentValues.put("thumb_ts", Integer.valueOf(r6.A02));
            contentValues.put("photo_id_timestamp", Long.valueOf(r6.A06));
            r2.A0G(contentValues, r6.A09);
            StringBuilder sb = new StringBuilder("updated photo id for contact jid=");
            sb.append(r6.A09);
            sb.append(' ');
            sb.append(contentValues);
            sb.append(" | time: ");
            sb.append(A022.A00());
            Log.i(sb.toString());
            this.A02.A00(r6);
            return;
        }
        throw null;
    }

    public void A0M(UserJid userJid, long j, String str) {
        this.A04.A0O(userJid, j, str);
        this.A02.A01.remove(userJid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0178, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0183, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(java.util.Collection r14) {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0N(java.util.Collection):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(java.util.Collection r16) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0O(java.util.Collection):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0145, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(java.util.Collection r19) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0P(java.util.Collection):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0169, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0162, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0165, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r3.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(java.util.List r17) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0Q(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0283, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0284, code lost:
        if (r9 != null) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0289, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(java.util.Map r30) {
        /*
        // Method dump skipped, instructions count: 661
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01A.A0R(java.util.Map):void");
    }

    public boolean A0S(UserJid userJid) {
        AnonymousClass0QW r0;
        C007003k A092 = A09(userJid);
        return (A092 == null || (r0 = A092.A08) == null || TextUtils.isEmpty(r0.A01)) ? false : true;
    }
}
