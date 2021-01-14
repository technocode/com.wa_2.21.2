package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.01B  reason: invalid class name */
public class AnonymousClass01B extends AnonymousClass01C {
    public static final String[] A07 = {"wa_contacts._id", "wa_contacts.jid", "is_whatsapp_user", "status", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "unseen_msg_count", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name", "status_timestamp", "nickname", "company", "title", "status_autodownload_disabled", "keep_timestamp", "is_spam_reported", "is_sidelist_synced", "is_business_synced", "verified_name", "expires", "verified_level", "description", "identity_unconfirmed_since", "description_id_string", "description_time", "description_setter_jid", "restrict_mode", "announcement_group", "no_frequently_forwarded", "ephemeral_duration", "creator_jid", "in_app_support"};
    public static final String[] A08 = {"count(wa_contacts._id) AS _count"};
    public static final String[] A09 = {"wa_contacts.jid", "number"};
    public static final String[] A0A = {"_id", "jid", "serial", "issuer", "expires", "verified_name", "industry", "city", "country", "verified_level", "cert_blob", "identity_unconfirmed_since", "host_storage", "actual_actors", "privacy_mode_ts"};
    public static volatile AnonymousClass01B A0B;
    public Integer A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass01F A02;
    public final AnonymousClass03P A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass01X A05;
    public final Object A06 = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass01B(AnonymousClass00S r3, AnonymousClass01I r4, AnonymousClass03P r5, AnonymousClass01X r6, AnonymousClass08H r7) {
        super(r7);
        AnonymousClass01F r1 = new AnonymousClass01F();
        this.A04 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A02 = r1;
        r1.A00(new AnonymousClass08P(this, r4));
    }

    public static AnonymousClass01B A00() {
        if (A0B == null) {
            synchronized (AnonymousClass01B.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass01B(AnonymousClass00S.A00(), AnonymousClass01I.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), AnonymousClass08H.A00());
                }
            }
        }
        return A0B;
    }

    public static boolean A01(C007003k r1) {
        AnonymousClass0QW r0;
        return (r1.A09 == null || (r0 = r1.A08) == null || TextUtils.isEmpty(r0.A01)) ? false : true;
    }

    public final int A09(C06020Rk r9, C007003k r10) {
        AnonymousClass00E.A07(r9.A01());
        Jid jid = r10.A09;
        String A0D = AnonymousClass1VY.A0D(jid);
        A06("wa_contacts", "_id = ?", new String[]{String.valueOf(r10.A01())});
        A06("wa_contact_storage_usage", "jid = ? AND NOT EXISTS (SELECT 1 FROM wa_contacts WHERE jid = ?)", new String[]{A0D, A0D});
        int i = 3;
        if (jid instanceof AnonymousClass02U) {
            i = 3 + A0A(r9, (AnonymousClass02U) jid, null);
        }
        A06("wa_group_admin_settings", "jid = ?", new String[]{A0D});
        return i;
    }

    public final int A0A(C06020Rk r7, AnonymousClass02U r8, C11220fu r9) {
        AnonymousClass00E.A07(r7.A01());
        if (r8 == null) {
            return 0;
        }
        String A0D = AnonymousClass1VY.A0D(r8);
        if (r9 == null) {
            A06("wa_group_descriptions", "jid = ?", new String[]{A0D});
            return 1;
        }
        String str = r9.A02;
        if (str == null) {
            return 0;
        }
        A06("wa_group_descriptions", "jid = ?", new String[]{A0D});
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("jid", A0D);
        contentValues.put("description", str);
        String str2 = r9.A03;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        contentValues.put("description_id_string", str2);
        contentValues.put("description_time", Long.valueOf(r9.A00));
        UserJid userJid = r9.A01;
        if (userJid != null) {
            str3 = AnonymousClass1VY.A0D(userJid);
        }
        contentValues.put("description_setter_jid", str3);
        A04("wa_group_descriptions", contentValues);
        return 2;
    }

    public Cursor A0B() {
        return A07("wa_contact_storage_usage", new String[]{"jid", "conversation_size", "conversation_message_count"}, "jid != ?", new String[]{C12060hU.A00.getRawString()}, "conversation_size DESC, conversation_message_count DESC", "CONTACT_STORAGE_USAGES");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0J9 A0C(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            r5 = 0
            if (r8 != 0) goto L_0x0009
            java.lang.String r0 = "contact-mgr-db/cannot get verified name details by null jid"
            com.whatsapp.util.Log.w(r0)
            return r5
        L_0x0009:
            java.lang.String[] r2 = X.AnonymousClass01B.A0A
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = r8.getRawString()
            r4[r1] = r0
            java.lang.String r1 = "wa_vnames"
            java.lang.String r3 = "jid = ?"
            java.lang.String r6 = "CONTACT_VNAMES"
            r0 = r7
            android.database.Cursor r1 = r0.A07(r1, r2, r3, r4, r5, r6)
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002b
            X.0J9 r5 = X.C002001d.A0s(r1)     // Catch:{ all -> 0x002f }
        L_0x002b:
            r1.close()
            return r5
        L_0x002f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            if (r1 == 0) goto L_0x0037
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0C(com.whatsapp.jid.UserJid):X.0J9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r2 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0D() {
        /*
            r12 = this;
            X.0Kz r4 = X.AnonymousClass01C.A02()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String[] r7 = X.AnonymousClass01B.A07
            java.lang.String r6 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String r8 = "wa_contacts.jid LIKE '%@g.us' OR wa_contacts.jid LIKE '%@temp'"
            r9 = 0
            java.lang.String r11 = "CONTACTS"
            r5 = r12
            r10 = r9
            android.database.Cursor r2 = r5.A07(r6, r7, r8, r9, r10, r11)
            if (r2 != 0) goto L_0x0022
            java.lang.String r0 = "contact-mgr-db/unable to get all group chats"
            com.whatsapp.util.Log.e(r0)     // Catch:{ all -> 0x005a }
            return r3
        L_0x0022:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0034
            X.03k r1 = X.C001801b.A0C(r2)     // Catch:{ all -> 0x005a }
            com.whatsapp.jid.Jid r0 = r1.A09     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0022
            r3.add(r1)     // Catch:{ all -> 0x005a }
            goto L_0x0022
        L_0x0034:
            r2.close()
            java.lang.String r0 = "returned "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = r3.size()
            r2.append(r0)
            java.lang.String r0 = " group chats | time: "
            r2.append(r0)
            long r0 = r4.A00()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.d(r0)
            return r3
        L_0x005a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0D():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (r4 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0E(X.AnonymousClass02N r14) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0E(X.02N):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        if (r5 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection A0F(boolean r13) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0F(boolean):java.util.Collection");
    }

    public final void A0G(ContentValues contentValues, Jid jid) {
        try {
            A05("wa_contacts", contentValues, "jid = ?", new String[]{AnonymousClass1VY.A0D(jid)});
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("contact-mgr-db/unable to update contact by jid ");
            sb.append(jid);
            String obj = sb.toString();
            if (obj != null) {
                Log.e(obj, e);
                return;
            }
            throw null;
        }
    }

    public final void A0H(C06020Rk r7, UserJid userJid) {
        AnonymousClass00E.A07(r7.A01());
        String A0D = AnonymousClass1VY.A0D(userJid);
        A06("wa_vnames", "jid = ?", new String[]{A0D});
        A06("wa_vnames_localized", "jid = ?", new String[]{A0D});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.AnonymousClass1VD r11) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0I(X.1VD):void");
    }

    public void A0J(C007003k r6) {
        C04600Kz A022 = AnonymousClass01C.A02();
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("display_name", r6.A0F);
        contentValues.put("phone_label", r6.A0J);
        contentValues.put("is_whatsapp_user", Boolean.valueOf(r6.A0X));
        A0G(contentValues, r6.A09);
        A0L(r6, (AnonymousClass02U) r6.A02(AnonymousClass02U.class));
        StringBuilder sb = new StringBuilder("updated group info for jid=");
        sb.append(r6.A09);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(A022.A00());
        Log.i(sb.toString());
        this.A02.A02(Collections.singleton(r6));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0028, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(X.C007003k r6) {
        /*
            r5 = this;
            X.0Kz r4 = X.AnonymousClass01C.A02()
            X.08H r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0029 }
            X.0OQ r2 = r0.A03()     // Catch:{ IllegalArgumentException -> 0x0029 }
            X.0Rk r1 = r2.A01()     // Catch:{ all -> 0x0022 }
            r5.A09(r1, r6)     // Catch:{ all -> 0x001b }
            r1.A00()     // Catch:{ all -> 0x001b }
            r1.close()
            r2.close()
            goto L_0x0041
        L_0x001b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0021 }
        L_0x0021:
            throw r0
        L_0x0022:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0028 }
        L_0x0028:
            throw r0
        L_0x0029:
            r3 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to delete contact "
            java.lang.StringBuilder r2 = X.AnonymousClass008.A0S(r0)
            long r0 = r6.A01()
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            r0 = 0
            if (r1 == 0) goto L_0x0054
            com.whatsapp.util.Log.e(r1, r3)
        L_0x0041:
            java.lang.String r0 = "contact-mgr-db/delete contact "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " | time : "
            r1.append(r0)
            X.AnonymousClass008.A0r(r4, r1)
            return
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0K(X.03k):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.C007003k r12, X.AnonymousClass02U r13) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0L(X.03k, X.02U):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (r8 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.C007003k r16, java.util.Locale r17) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0M(X.03k, java.util.Locale):void");
    }

    public void A0N(UserJid userJid, int i) {
        ArrayList A0E;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("verified_level", Integer.valueOf(i));
        try {
            if (A05("wa_vnames", contentValues, "jid = ?", new String[]{AnonymousClass1VY.A0D(userJid)}) > 0 && (A0E = A0E(userJid)) != null && !A0E.isEmpty()) {
                this.A02.A02(A0E);
            }
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("wadbhelper/update-verified-level/unable to update verified level");
            sb.append(userJid);
            sb.append(", ");
            sb.append(i);
            String obj = sb.toString();
            if (obj != null) {
                Log.e(obj, e);
            } else {
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("contact-mgr-db/wadbhelper/update-verified-level/updated verified level jid=");
        sb2.append(userJid);
        sb2.append(", ");
        sb2.append(i);
        Log.d(sb2.toString());
    }

    public void A0O(UserJid userJid, long j, String str) {
        C04600Kz A022 = AnonymousClass01C.A02();
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("status", str);
        contentValues.put("status_timestamp", Long.valueOf(j));
        boolean z = false;
        try {
            A05("wa_contacts", contentValues, "jid = ?", new String[]{userJid.getRawString()});
        } catch (IllegalArgumentException e) {
            StringBuilder A0X = AnonymousClass008.A0X("contact-mgr-db/unable to update contact status ", userJid, ", statusNull=");
            if (str == null) {
                z = true;
            }
            A0X.append(z);
            String obj = A0X.toString();
            if (obj != null) {
                Log.e(obj, e);
            } else {
                throw null;
            }
        }
        AnonymousClass008.A0r(A022, AnonymousClass008.A0X("contact-mgr-db/updated contact status jid=", userJid, " | time: "));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r25 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(com.whatsapp.jid.UserJid r15, long r16, java.lang.String r18, java.lang.String r19, java.util.List r20, int r21, X.AnonymousClass0OB r22, byte[] r23, boolean r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0P(com.whatsapp.jid.UserJid, long, java.lang.String, java.lang.String, java.util.List, int, X.0OB, byte[], boolean, boolean):void");
    }

    public void A0Q(List list) {
        IllegalArgumentException e;
        Throwable th;
        Throwable th2;
        ContentValues contentValues = new ContentValues();
        try {
            AnonymousClass0OQ A032 = super.A00.A03();
            try {
                C06020Rk A002 = A032.A00();
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            AnonymousClass02N r0 = (AnonymousClass02N) it.next();
                            if (r0 != null) {
                                contentValues.put("jid", r0.getRawString());
                                contentValues.put("conversation_size", (Integer) 0);
                                contentValues.put("conversation_message_count", (Integer) 0);
                                A08("wa_contact_storage_usage", contentValues);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    A002.A00();
                    try {
                        A002.close();
                        try {
                            A032.close();
                            return;
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            throw th;
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    throw th2;
                }
                throw th;
                throw th;
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            Log.e("contact-mgr-db/unable to insert batch to storage usage table", e);
        }
    }

    public final void A0R(List list) {
        Locale A0I = this.A05.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0M((C007003k) it.next(), A0I);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x02c8 A[Catch:{ all -> 0x036f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(java.util.List r26, int r27, boolean r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 961
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01B.A0S(java.util.List, int, boolean, boolean):void");
    }
}
