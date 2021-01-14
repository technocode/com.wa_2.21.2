package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0BB  reason: invalid class name */
public class AnonymousClass0BB {
    public static final long A0P = TimeUnit.DAYS.toMillis(60);
    public static final boolean A0Q;
    public static volatile AnonymousClass0BB A0R;
    public AnonymousClass0BJ A00;
    public final AnonymousClass02M A01;
    public final C000300f A02;
    public final AnonymousClass01A A03;
    public final AnonymousClass08B A04;
    public final C014308b A05;
    public final AnonymousClass03R A06;
    public final AnonymousClass00C A07;
    public final AnonymousClass03P A08;
    public final AnonymousClass00S A09;
    public final AnonymousClass00G A0A;
    public final AnonymousClass03S A0B;
    public final AnonymousClass00D A0C;
    public final AnonymousClass01X A0D;
    public final AnonymousClass0BD A0E;
    public final C006903j A0F;
    public final AnonymousClass0AQ A0G;
    public final AnonymousClass0A8 A0H;
    public final AnonymousClass04q A0I;
    public final AnonymousClass0AS A0J;
    public final AnonymousClass0BE A0K;
    public final AnonymousClass0BF A0L;
    public final AnonymousClass0BC A0M;
    public final String A0N;
    public final Map A0O = new ConcurrentHashMap();

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        A0Q = z;
    }

    public AnonymousClass0BB(AnonymousClass00G r15, AnonymousClass00S r16, AnonymousClass02M r17, AnonymousClass0BC r18, C006903j r19, AnonymousClass03R r20, C000300f r21, AnonymousClass04q r22, AnonymousClass01A r23, AnonymousClass03P r24, C014308b r25, AnonymousClass01X r26, AnonymousClass0BD r27, AnonymousClass0AS r28, AnonymousClass08B r29, AnonymousClass00C r30, AnonymousClass03S r31, AnonymousClass00D r32, AnonymousClass0A8 r33, AnonymousClass0BE r34, AnonymousClass0AQ r35, String str) {
        this.A0A = r15;
        this.A09 = r16;
        this.A01 = r17;
        this.A0M = r18;
        this.A0F = r19;
        this.A06 = r20;
        this.A02 = r21;
        this.A0I = r22;
        this.A03 = r23;
        this.A08 = r24;
        this.A05 = r25;
        this.A0D = r26;
        this.A0E = r27;
        this.A0J = r28;
        this.A04 = r29;
        this.A07 = r30;
        this.A0B = r31;
        this.A0C = r32;
        this.A0H = r33;
        this.A0K = r34;
        this.A0G = r35;
        this.A0N = str;
        this.A0L = new AnonymousClass0BF(r16, r17, r15, r19, r21, r24, r25, r26, r29, r31, r32, r33, r35);
    }

    public static AnonymousClass0BB A00() {
        if (A0R == null) {
            synchronized (AnonymousClass0BB.class) {
                if (A0R == null) {
                    A0R = new AnonymousClass0BB(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass0BC.A00(), C006903j.A00(), AnonymousClass03R.A00(), C000300f.A00(), AnonymousClass04q.A00(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass0BD.A00(), AnonymousClass0AS.A00(), AnonymousClass08B.A00, AnonymousClass00C.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00(), AnonymousClass0A8.A00, AnonymousClass0BE.A01(), AnonymousClass0AQ.A00(), "chatsettings.db");
                }
            }
        }
        return A0R;
    }

    public static String A01(String str) {
        Pair A032 = AnonymousClass0BF.A03(str);
        if (A032 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1VY.A0E((String) A032.first, Jid.class));
        sb.append("_");
        sb.append(A032.second);
        return sb.toString();
    }

    public static final boolean A02(AnonymousClass0BG r6) {
        String str = r6.A0C;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str) || r6.A02 != 0 || r6.A0H || r6.A0G) {
            return false;
        }
        AnonymousClass0BG A022 = r6.A02();
        if (!TextUtils.equals(r6.A07(), A022.A07()) || !TextUtils.equals(r6.A08(), A022.A08()) || !TextUtils.equals(r6.A06(), A022.A06()) || !TextUtils.equals(r6.A05(), A022.A05()) || !TextUtils.equals(r6.A03(), A022.A03()) || !TextUtils.equals(r6.A04(), A022.A04()) || r6.A0B() != A022.A0B() || r6.A00 != 0 || r6.A05 != null || r6.A04 != null || r6.A0E) {
            return false;
        }
        return true;
    }

    public long A03(AnonymousClass02N r3) {
        AnonymousClass0BG A082 = A08(r3);
        if (A082.A0E) {
            return A082.A03;
        }
        return 0;
    }

    public AnonymousClass0BG A04() {
        AnonymousClass0BG A092 = A09("group_chat_defaults");
        if (A092.A0A == null) {
            A092.A0A = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A092.A0B)) {
            A092.A0B = "1";
        }
        if (TextUtils.isEmpty(A092.A09)) {
            A092.A09 = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A092.A08)) {
            A092.A08 = "FFFFFF";
        }
        return A092;
    }

    public AnonymousClass0BG A05() {
        AnonymousClass0BG A092 = A09("individual_chat_defaults");
        if (A092.A0A == null) {
            A092.A0A = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A092.A0B)) {
            A092.A0B = "1";
        }
        if (TextUtils.isEmpty(A092.A09)) {
            A092.A09 = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A092.A08)) {
            A092.A08 = "FFFFFF";
        }
        if (A092.A06 == null) {
            A092.A06 = Settings.System.DEFAULT_RINGTONE_URI.toString();
        }
        if (TextUtils.isEmpty(A092.A07)) {
            A092.A07 = "1";
        }
        return A092;
    }

    public final AnonymousClass0BG A06() {
        if (Build.VERSION.SDK_INT >= 26) {
            return new AnonymousClass0BI(this.A09, this.A02, this.A08, this.A0B, this.A0L);
        }
        return new AnonymousClass0BG(this.A09, this.A02, this.A08, this.A0B, this.A0L);
    }

    public final AnonymousClass0BG A07(Cursor cursor) {
        AnonymousClass0BG A062 = A06();
        A062.A0C = cursor.getString(0);
        boolean z = true;
        A062.A02 = cursor.getLong(1);
        boolean z2 = false;
        if (cursor.getInt(2) == 1) {
            z2 = true;
        }
        A062.A0F = z2;
        boolean z3 = false;
        if (cursor.getInt(3) == 1) {
            z3 = true;
        }
        A062.A0H = z3;
        A062.A0A = cursor.getString(4);
        A062.A0B = cursor.getString(5);
        A062.A09 = cursor.getString(6);
        A062.A08 = cursor.getString(7);
        A062.A06 = cursor.getString(8);
        A062.A07 = cursor.getString(9);
        boolean z4 = false;
        if (cursor.getInt(10) == 1) {
            z4 = true;
        }
        A062.A0G = z4;
        boolean z5 = false;
        if (cursor.getInt(11) == 1) {
            z5 = true;
        }
        A062.A0E = z5;
        A062.A03 = cursor.getLong(12);
        if (cursor.getInt(13) != 1) {
            z = false;
        }
        A062.A0D = z;
        A062.A00 = cursor.getInt(14);
        if ("0".equals(A062.A08)) {
            A062.A08 = "000000";
        }
        if (this.A02.A0D(AbstractC000400g.A2e)) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_light_type"));
            if (string != null) {
                A062.A05 = new AnonymousClass0BH(string, cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_light_value")), 0);
            }
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_dark_type"));
            if (string2 != null) {
                A062.A04 = new AnonymousClass0BH(string2, cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_dark_value")), Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("wallpaper_dark_opacity"))));
            }
        }
        return A062;
    }

    public AnonymousClass0BG A08(AnonymousClass02N r2) {
        return A09(r2.getRawString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0BG A09(java.lang.String r11) {
        /*
            r10 = this;
            java.util.Map r2 = r10.A0O
            java.lang.Object r0 = r2.get(r11)
            X.0BG r0 = (X.AnonymousClass0BG) r0
            if (r0 != 0) goto L_0x0056
            X.0BJ r0 = r10.A0A()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0041 }
            X.0BK r3 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0041 }
            java.lang.String r4 = "settings"
            java.lang.String[] r5 = X.AnonymousClass0BL.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0041 }
            java.lang.String r6 = "jid = ?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0041 }
            r0 = 0
            r7[r0] = r11     // Catch:{ SQLiteDatabaseCorruptException -> 0x0041 }
            r8 = 0
            java.lang.String r9 = "getSettings/QUERY_CHAT_SETTINGS"
            android.database.Cursor r1 = r3.A08(r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0041 }
            if (r1 == 0) goto L_0x004d
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0036
            X.0BG r0 = r10.A07(r1)     // Catch:{ all -> 0x003a }
            r1.close()
            goto L_0x004b
        L_0x0036:
            r1.close()
            goto L_0x004d
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        L_0x0041:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/get"
            com.whatsapp.util.Log.e(r0, r1)
            r10.A0G()
            throw r1
        L_0x004b:
            if (r0 != 0) goto L_0x0051
        L_0x004d:
            X.0BG r0 = r10.A06()
        L_0x0051:
            r0.A0C = r11
            r2.put(r11, r0)
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BB.A09(java.lang.String):X.0BG");
    }

    public final synchronized AnonymousClass0BJ A0A() {
        AnonymousClass0BJ r4;
        r4 = this.A00;
        if (r4 == null) {
            r4 = new AnonymousClass0BJ(this.A0A.A00, this.A0N, this.A0I, this.A0L);
            this.A00 = r4;
        }
        return r4;
    }

    public Long A0B(AnonymousClass02N r5, long j) {
        boolean z = false;
        if (j > 0) {
            z = true;
        }
        AnonymousClass00E.A08(z, "Pinned time should be strictly positive");
        return A0C(r5, true, j);
    }

    public final Long A0C(AnonymousClass02N r14, boolean z, long j) {
        if (z) {
            this.A0J.A01(7, r14);
        }
        AnonymousClass0BG A082 = A08(r14);
        boolean z2 = A082.A0E;
        long j2 = A082.A03;
        try {
            A082.A0E = z;
            if (z) {
                A082.A03 = j;
            } else {
                A082.A03 = 0;
            }
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("pinned", Boolean.valueOf(A082.A0E));
            contentValues.put("pinned_time", Long.valueOf(A082.A03));
            boolean z3 = true;
            if (A0A().A02().A00("settings", contentValues, "jid =?", new String[]{r14.getRawString()}, "ChatSettingsStore/setPin/UPDATE_CHAT_SETTINGS") == 0) {
                contentValues.put("jid", r14.getRawString());
                A0A().A02().A02("settings", contentValues, "ChatSettingsStore/setPin/INSERT_CHAT_SETTINGS");
            }
            if (z2 == z && j2 == A082.A03) {
                z3 = false;
            }
            this.A0H.A02();
            if (z3) {
                return Long.valueOf(j2);
            }
            return null;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/set-pin", e);
            A0G();
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (r6 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0D() {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BB.A0D():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0E() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BB.A0E():java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0F() {
        /*
            r11 = this;
            r0 = 3
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r0)
            X.0BJ r0 = r11.A0A()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0047 }
            X.0BK r4 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0047 }
            java.lang.String r5 = "settings"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0047 }
            java.lang.String r0 = "jid"
            r2 = 0
            r6[r2] = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0047 }
            java.lang.String r7 = "pinned != 0"
            r8 = 0
            java.lang.String r9 = "pinned_time DESC"
            java.lang.String r10 = "getPinnedJids/QUERY_CHAT_SETTINGS"
            android.database.Cursor r1 = r4.A08(r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0047 }
        L_0x0024:
            if (r1 == 0) goto L_0x0041
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x003a }
            X.02N r0 = X.AnonymousClass02N.A01(r0)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            r3.add(r0)     // Catch:{ all -> 0x003a }
            goto L_0x0024
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1.close()
        L_0x0046:
            return r3
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/get-pinned-jids"
            com.whatsapp.util.Log.i(r0, r1)
            r11.A0G()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BB.A0F():java.util.Set");
    }

    public void A0G() {
        this.A0O.clear();
        A0A().A03();
        A0R = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00f9, code lost:
        if (r13.A01() == 0) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(X.AnonymousClass0BG r13) {
        /*
        // Method dump skipped, instructions count: 508
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BB.A0H(X.0BG):void");
    }

    public final void A0I(String str, String str2) {
        AnonymousClass0BG A092 = A09(str);
        if (!TextUtils.equals(str2, A092.A08)) {
            A092.A08 = str2;
            A0H(A092);
        }
    }

    public final void A0J(String str, String str2) {
        AnonymousClass0BG A092 = A09(str);
        if (!TextUtils.equals(str2, A092.A09)) {
            A092.A09 = str2;
            A0H(A092);
        }
    }

    public final void A0K(String str, String str2) {
        AnonymousClass0BG A092 = A09(str);
        if (!TextUtils.equals(str2, A092.A0A)) {
            A092.A0A = str2;
            A0H(A092);
        }
    }

    public final void A0L(String str, String str2) {
        AnonymousClass0BG A092 = A09(str);
        if (!TextUtils.equals(str2, A092.A0B)) {
            A092.A0B = str2;
            A0H(A092);
        }
    }

    public boolean A0M(AnonymousClass02N r13) {
        boolean z;
        AnonymousClass0BF r8;
        NotificationChannel A012;
        AnonymousClass0BG A082 = A08(r13);
        if (!A0Q || !A082.A0H || (A012 = AnonymousClass0BF.A01((r8 = this.A0L), r13.getRawString())) == null || A012.getImportance() >= 3) {
            z = false;
        } else {
            Log.i("chat-settings-store//cancelMute unmuting channel");
            String rawString = r13.getRawString();
            int A002 = AnonymousClass0BF.A00(A082.A0B());
            synchronized (r8) {
                AnonymousClass00D r7 = r8.A0D;
                int i = r7.A00.getInt("num_notification_channels_created", 0);
                AnonymousClass008.A0t("wa-shared-prefs/getNumNotificationChannelsCreated ", i);
                int i2 = i + 1;
                StringBuilder sb = new StringBuilder();
                sb.append(rawString);
                sb.append("_");
                sb.append(String.valueOf(i2));
                String obj = sb.toString();
                NotificationChannel notificationChannel = new NotificationChannel(obj, r8.A0A(rawString), A002);
                notificationChannel.setGroup("channel_group_chats");
                notificationChannel.enableLights(A012.shouldShowLights());
                notificationChannel.setLightColor(A012.getLightColor());
                notificationChannel.enableVibration(A012.shouldVibrate());
                notificationChannel.setVibrationPattern(A012.getVibrationPattern());
                notificationChannel.setSound(A012.getSound(), A012.getAudioAttributes());
                notificationChannel.setLockscreenVisibility(A012.getLockscreenVisibility());
                notificationChannel.setShowBadge(A012.canShowBadge());
                notificationChannel.setBypassDnd(A012.canBypassDnd());
                AnonymousClass0BM r2 = AnonymousClass0BF.A0J;
                r2.A03(rawString, A012.getId());
                AnonymousClass0BN.A03(r8.A08(), A012.getId());
                AnonymousClass0BN.A02(r8.A08(), notificationChannel);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("chat-settings-store/unMuteChannelBySettingsId creating new channel:");
                sb2.append(notificationChannel);
                Log.i(sb2.toString());
                r2.A02(rawString, obj);
                r7.A0S(i2);
            }
            z = true;
        }
        boolean A0N2 = A0N(r13, 0, A082.A0F);
        StringBuilder sb3 = new StringBuilder("chat-settings-store//cancelMute for jid:");
        sb3.append(r13);
        sb3.append(" channelChanged:");
        sb3.append(z);
        sb3.append(" dbchanged:");
        AnonymousClass008.A1a(sb3, A0N2);
        if (z || A0N2) {
            return true;
        }
        return false;
    }

    public boolean A0N(AnonymousClass02N r13, long j, boolean z) {
        AnonymousClass0BG A082 = A08(r13);
        if (j == A082.A02 && z == A082.A0F) {
            return false;
        }
        try {
            A082.A02 = j;
            if (A02(A082)) {
                A0A().A02().A01("settings", "jid = ?", new String[]{r13.getRawString()}, "ChatSettingsStore/setMute/DELETE_CHAT_SETTINGS");
                this.A0O.remove(r13.getRawString());
            } else {
                A082.A0F = z;
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("mute_end", Long.valueOf(j));
                contentValues.put("muted_notifications", Boolean.valueOf(z));
                if (A0A().A02().A00("settings", contentValues, "jid = ?", new String[]{r13.getRawString()}, "ChatSettingsStore/setMute/UPDATE_CHAT_SETTINGS") == 0) {
                    contentValues.put("jid", r13.getRawString());
                    A0A().A02().A02("settings", contentValues, "ChatSettingsStore/setMute/INSERT_CHAT_SETTINGS");
                }
            }
            AnonymousClass02M r2 = this.A01;
            r2.A02.post(new RunnableEBaseShape4S0200000_I0_3(this, r13, 2));
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/setmute", e);
            A0G();
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chat-settings-store/is-message-tone-accessible checking "
            X.AnonymousClass008.A18(r0, r11)
            X.03P r0 = r10.A08
            android.content.ContentResolver r4 = r0.A06()
            r3 = 0
            if (r4 == 0) goto L_0x0032
            android.net.Uri r5 = android.net.Uri.parse(r11)     // Catch:{ SecurityException -> 0x0032 }
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ SecurityException -> 0x0032 }
            if (r2 == 0) goto L_0x002b
            int r1 = r2.getCount()     // Catch:{ all -> 0x0024 }
            r0 = 1
            if (r1 > 0) goto L_0x002e
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            throw r0
        L_0x002b:
            r0 = 0
            if (r2 == 0) goto L_0x0031
        L_0x002e:
            r2.close()
        L_0x0031:
            return r0
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BB.A0O(java.lang.String):boolean");
    }

    public final boolean A0P(String str) {
        if (!A0Q) {
            return false;
        }
        AnonymousClass0BK A022 = A0A().A02();
        AnonymousClass0BM r3 = AnonymousClass0BF.A0J;
        String A002 = r3.A00(str);
        if (A002 == null) {
            return false;
        }
        NotificationManager notificationManager = (NotificationManager) this.A0A.A00.getSystemService("notification");
        if (notificationManager != null) {
            if (!AnonymousClass0BF.A07(this.A0L, A022, AnonymousClass0BN.A00(notificationManager, A002))) {
                return false;
            }
            this.A0O.remove(r3.A01(A002));
            return true;
        }
        throw null;
    }
}
