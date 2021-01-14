package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0BF  reason: invalid class name */
public class AnonymousClass0BF {
    public static final AnonymousClass0BM A0J = new AnonymousClass0BM();
    public NotificationManager A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Handler A03;
    public final AnonymousClass02M A04;
    public final C000300f A05;
    public final AnonymousClass0BP A06;
    public final AnonymousClass08B A07;
    public final C014308b A08;
    public final AnonymousClass03P A09;
    public final AnonymousClass00S A0A;
    public final AnonymousClass00G A0B;
    public final AnonymousClass03S A0C;
    public final AnonymousClass00D A0D;
    public final AnonymousClass01X A0E;
    public final C006903j A0F;
    public final AnonymousClass0AQ A0G;
    public final AnonymousClass0BR A0H;
    public final AnonymousClass0A8 A0I;

    public static int A00(boolean z) {
        return z ? 3 : 4;
    }

    public AnonymousClass0BF(AnonymousClass00S r4, AnonymousClass02M r5, AnonymousClass00G r6, C006903j r7, C000300f r8, AnonymousClass03P r9, C014308b r10, AnonymousClass01X r11, AnonymousClass08B r12, AnonymousClass03S r13, AnonymousClass00D r14, AnonymousClass0A8 r15, AnonymousClass0AQ r16) {
        AnonymousClass0BO r0;
        boolean z = AnonymousClass0BB.A0Q;
        AnonymousClass0BQ r1 = null;
        if (z) {
            r0 = new AnonymousClass0BO(this);
        } else {
            r0 = null;
        }
        this.A06 = r0;
        this.A0H = z ? new AnonymousClass0BQ(this) : r1;
        this.A0A = r4;
        this.A04 = r5;
        this.A0B = r6;
        this.A0F = r7;
        this.A05 = r8;
        this.A09 = r9;
        this.A08 = r10;
        this.A0E = r11;
        this.A07 = r12;
        this.A0C = r13;
        this.A0D = r14;
        this.A0I = r15;
        this.A0G = r16;
        if (Build.VERSION.SDK_INT >= 26) {
            HandlerThread handlerThread = new HandlerThread("notif-update-channel-names", 10);
            handlerThread.start();
            this.A03 = new Handler(handlerThread.getLooper(), new C29191Xl(this));
        }
    }

    public static NotificationChannel A01(AnonymousClass0BF r3, String str) {
        if (r3 != null) {
            AnonymousClass0BM r2 = A0J;
            if (r2.A04(str)) {
                return AnonymousClass0BN.A00(r3.A08(), r2.A00(str));
            }
            return null;
        }
        throw null;
    }

    public static ContentValues A02(NotificationChannel notificationChannel, String str, String str2, String str3, boolean z) {
        ContentValues contentValues = new ContentValues();
        Integer A042 = AnonymousClass0BS.A04(str);
        if (A042 != null) {
            if (!notificationChannel.shouldShowLights()) {
                contentValues.put("message_light", "000000");
            } else if (!A042.equals(Integer.valueOf(notificationChannel.getLightColor()))) {
                contentValues.put("message_light", AnonymousClass0BS.A05(notificationChannel.getLightColor()).toUpperCase(Locale.US));
            }
        } else if (notificationChannel.shouldShowLights()) {
            contentValues.put("message_light", "FFFFFF");
        }
        if (AnonymousClass0BS.A0B(str2) != null) {
            if (!notificationChannel.shouldVibrate()) {
                contentValues.put("message_vibrate", "0");
            }
        } else if (notificationChannel.shouldVibrate()) {
            contentValues.put("message_vibrate", "1");
        }
        if (!TextUtils.isEmpty(str3)) {
            if (notificationChannel.getSound() == null) {
                contentValues.put("message_tone", "");
            } else if (!str3.equals(notificationChannel.getSound().toString())) {
                contentValues.put("message_tone", notificationChannel.getSound().toString());
            }
        } else if (notificationChannel.getSound() != null && !TextUtils.isEmpty(notificationChannel.getSound().toString())) {
            contentValues.put("message_tone", notificationChannel.getSound().toString());
        }
        int i = 4;
        if (z) {
            i = 3;
        }
        int importance = notificationChannel.getImportance();
        if (importance != i && importance >= 3) {
            boolean z2 = false;
            if (importance == 3) {
                z2 = true;
            }
            contentValues.put("low_pri_notifications", Boolean.valueOf(z2));
        }
        return contentValues;
    }

    public static Pair A03(String str) {
        int lastIndexOf = str.lastIndexOf(95);
        if (lastIndexOf == -1) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
            String substring = str.substring(0, lastIndexOf);
            if (TextUtils.isEmpty(substring)) {
                return null;
            }
            return new Pair(substring, Integer.valueOf(parseInt));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String A04(String str) {
        Pair A032 = A03(str);
        if (A032 != null) {
            return (String) A032.first;
        }
        return null;
    }

    public static final void A05(NotificationChannel notificationChannel, AnonymousClass02N r4) {
        String A002;
        String rawString = r4.getRawString();
        if (AnonymousClass1VY.A0Y(r4)) {
            A002 = A0J.A00("group_chat_defaults");
        } else {
            A002 = A0J.A00("individual_chat_defaults");
        }
        if (A002 != null) {
            notificationChannel.setConversationId(A002, rawString);
            AnonymousClass0BB.A01(A002);
        }
    }

    public static void A06(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                if (!AnonymousClass0BT.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId())) {
                    StringBuilder A0S = AnonymousClass008.A0S("chat-settings-store/deleteAllNotificationChannels/Deleting notification channel: ");
                    A0S.append(notificationChannel.getId());
                    Log.i(A0S.toString());
                    notificationManager.deleteNotificationChannel(notificationChannel.getId());
                }
            }
            AnonymousClass0BM r1 = A0J;
            synchronized (r1) {
                r1.A01.clear();
                r1.A00.clear();
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0183, code lost:
        if (r9 != null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018d, code lost:
        if (r9 != null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0192, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(X.AnonymousClass0BF r20, X.AnonymousClass0BK r21, android.app.NotificationChannel r22) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BF.A07(X.0BF, X.0BK, android.app.NotificationChannel):boolean");
    }

    public final synchronized NotificationManager A08() {
        NotificationManager notificationManager;
        notificationManager = this.A00;
        if (notificationManager == null) {
            notificationManager = (NotificationManager) this.A0B.A00.getSystemService("notification");
            this.A00 = notificationManager;
        }
        return notificationManager;
    }

    public final Uri A09(String str) {
        Uri parse;
        if (str == null) {
            parse = Uri.EMPTY;
        } else {
            parse = Uri.parse(str);
        }
        return (TextUtils.isEmpty(str) || C006803i.A0l(this.A09, this.A0C, parse, true)) ? parse : Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final CharSequence A0A(String str) {
        if ("individual_chat_defaults".equals(str)) {
            return this.A0E.A06(R.string.settings_notification);
        }
        if ("group_chat_defaults".equals(str)) {
            return this.A0E.A06(R.string.settings_group_notification);
        }
        if ("silent_notifications".equals(str)) {
            return this.A0E.A06(R.string.category_silent_notifications);
        }
        if ("voip_notification".equals(str)) {
            return this.A0E.A06(R.string.category_voip);
        }
        AnonymousClass02N A012 = AnonymousClass02N.A01(str);
        if (A012 == null) {
            return null;
        }
        return this.A08.A08(this.A0G.A02(A012), false);
    }

    public final String A0B() {
        return A0C("voip_notification", A0A("voip_notification"), 4, null, null, null, null);
    }

    public final synchronized String A0C(String str, CharSequence charSequence, int i, String str2, String str3, Uri uri, String str4) {
        AnonymousClass0BM r5 = A0J;
        if (r5.A04(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/addNotificationChannel channel already exists for settingsId:");
            sb.append(AnonymousClass1VY.A0E(str, Jid.class));
            Log.e(sb.toString());
            return r5.A00(str);
        }
        AnonymousClass00D r4 = this.A0D;
        int i2 = r4.A00.getInt("num_notification_channels_created", 0);
        AnonymousClass008.A0t("wa-shared-prefs/getNumNotificationChannelsCreated ", i2);
        int i3 = i2 + 1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(String.valueOf(i3));
        String obj = sb2.toString();
        NotificationChannel notificationChannel = new NotificationChannel(obj, charSequence, i);
        if (!TextUtils.isEmpty(str4)) {
            notificationChannel.setGroup(str4);
        }
        Integer A042 = AnonymousClass0BS.A04(str2);
        if (A042 != null) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(A042.intValue());
        } else {
            notificationChannel.enableLights(false);
        }
        long[] A0B2 = AnonymousClass0BS.A0B(str3);
        if (A0B2 != null) {
            notificationChannel.setVibrationPattern(A0B2);
            notificationChannel.enableVibration(true);
        } else {
            notificationChannel.enableVibration(false);
        }
        notificationChannel.setSound(uri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        notificationChannel.setLockscreenVisibility(0);
        if (!"group_chat_defaults".equals(str) && !"individual_chat_defaults".equals(str)) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(str);
            if (Build.VERSION.SDK_INT >= 30 && A012 != null) {
                A05(notificationChannel, A012);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("chat-settings-store/addNotificationChannel adding channel with id:");
        sb3.append(AnonymousClass0BB.A01(obj));
        sb3.append(" importance:");
        sb3.append(i);
        sb3.append(" lights:");
        sb3.append(notificationChannel.shouldShowLights());
        sb3.append(" color:");
        sb3.append(AnonymousClass0BS.A05(notificationChannel.getLightColor()));
        sb3.append(" vibrate:");
        sb3.append(notificationChannel.shouldVibrate());
        sb3.append(" sounduri:");
        sb3.append(notificationChannel.getSound());
        Log.i(sb3.toString());
        A08().createNotificationChannel(notificationChannel);
        r4.A0S(i3);
        r5.A02(str, obj);
        return obj;
    }

    public synchronized void A0D() {
        Handler handler = this.A03;
        boolean z = false;
        if (handler != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        if (!handler.hasMessages(1)) {
            handler.sendEmptyMessageDelayed(1, 3000);
        }
    }

    public synchronized void A0E() {
        if (this.A01) {
            for (NotificationChannel notificationChannel : A08().getNotificationChannels()) {
                if (!AnonymousClass0BT.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && "channel_group_chats".equals(notificationChannel.getGroup())) {
                    String A042 = A04(notificationChannel.getId());
                    if (A042 != null) {
                        CharSequence name = notificationChannel.getName();
                        CharSequence A0A2 = A0A(A042);
                        if (!TextUtils.equals(name, A0A2)) {
                            notificationChannel.getId();
                            A08().createNotificationChannel(new NotificationChannel(notificationChannel.getId(), A0A2, notificationChannel.getImportance()));
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("chat-settings-store/updateChannelNames ignoring channel:");
                        sb.append(notificationChannel.getId());
                        Log.i(sb.toString());
                    }
                }
            }
        }
    }

    public synchronized void A0F(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        String A042;
        AnonymousClass0BM r1 = A0J;
        synchronized (r1) {
            r1.A01.clear();
            r1.A00.clear();
        }
        this.A01 = false;
        AnonymousClass00G r7 = this.A0B;
        AnonymousClass0BT.A00(r7.A00, this.A0E);
        List<NotificationChannel> notificationChannels = A08().getNotificationChannels();
        StringBuilder sb = new StringBuilder();
        sb.append("chat-settings-store/fullSync channels schema current: ");
        AnonymousClass00D r15 = this.A0D;
        SharedPreferences sharedPreferences = r15.A00;
        sb.append(sharedPreferences.getInt("notification_channels_schema_version", 0));
        sb.append("  desired:");
        sb.append(2);
        Log.d(sb.toString());
        if (sharedPreferences.getInt("notification_channels_schema_version", 0) >= 2) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (NotificationChannel notificationChannel : notificationChannels) {
                if (!AnonymousClass0BT.A01.contains(notificationChannel.getId())) {
                    String A043 = A04(notificationChannel.getId());
                    if ("individual_chat_defaults".equals(A043)) {
                        z = true;
                    } else if ("group_chat_defaults".equals(A043)) {
                        z2 = true;
                    } else if ("silent_notifications".equals(A043)) {
                        z3 = true;
                    }
                }
            }
            if (z && z2 && z3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("chat-settings-store/Num notification channels in system:");
                sb2.append(notificationChannels.size());
                sb2.append(" num dynamic channels created:");
                int i = sharedPreferences.getInt("num_notification_channels_created", 0);
                AnonymousClass008.A0t("wa-shared-prefs/getNumNotificationChannelsCreated ", i);
                sb2.append(i);
                Log.d(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("chat-settings-store/fullSyncNotificationChannels/existing channel groups:");
                sb3.append(A08().getNotificationChannelGroups());
                Log.d(sb3.toString());
                for (NotificationChannel notificationChannel2 : notificationChannels) {
                    if (!AnonymousClass0BT.A01.contains(notificationChannel2.getId()) && !"miscellaneous".equals(notificationChannel2.getId()) && (A042 = A04(notificationChannel2.getId())) != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("chat-settings-store/Adding channel to map settingsId:");
                        sb4.append(AnonymousClass1VY.A0E(A042, Jid.class));
                        sb4.append(" channel:");
                        sb4.append(notificationChannel2);
                        Log.d(sb4.toString());
                        r1.A02(A042, notificationChannel2.getId());
                    }
                }
                this.A01 = true;
                this.A04.A0E(new RunnableEBaseShape4S0100000_I0_4(this, 19));
                return;
            }
        }
        A06(r7.A00);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("chat-settings-store/fullSyncNotificationChannels/full-sync: existing channels: ");
        sb5.append(notificationChannels);
        Log.d(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("chat-settings-store/fullSyncNotificationChannels/full-sync: existing channel groups:");
        sb6.append(A08().getNotificationChannelGroups());
        Log.d(sb6.toString());
        try {
            Cursor query = sQLiteDatabase.query("settings", new String[]{"jid", "message_light", "message_vibrate", "message_tone", "use_custom_notifications", "low_pri_notifications"}, null, null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        String string4 = query.getString(3);
                        boolean z4 = false;
                        if (query.getInt(4) == 1) {
                            z4 = true;
                        }
                        AnonymousClass02N A012 = AnonymousClass02N.A01(string);
                        if (!"individual_chat_defaults".equals(string) && !"group_chat_defaults".equals(string)) {
                            if (z4 && A012 != null) {
                                C006903j r12 = this.A0F;
                                if (r12.A0C(A012)) {
                                    if (r12.A04(A012) <= this.A0A.A01() - AnonymousClass0BB.A0P) {
                                    }
                                }
                            }
                        }
                        boolean z5 = false;
                        if (query.getInt(5) == 1) {
                            z5 = true;
                        }
                        CharSequence A0A2 = A0A(string);
                        int i2 = 4;
                        if (z5) {
                            i2 = 3;
                        }
                        try {
                            A0C(string, A0A2, i2, string2, string3, A09(string4), "channel_group_chats");
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable unused) {
                        }
                    }
                }
                query.close();
            }
        } catch (Exception e) {
            Log.e("chat-settings-store/syncNotificationChannels", e);
        }
        if (!r1.A04("individual_chat_defaults")) {
            A0C("individual_chat_defaults", A0A("individual_chat_defaults"), 4, "FFFFFF", "1", Settings.System.DEFAULT_NOTIFICATION_URI, "channel_group_chats");
        }
        if (!r1.A04("group_chat_defaults")) {
            A0C("group_chat_defaults", A0A("group_chat_defaults"), 4, "FFFFFF", "1", Settings.System.DEFAULT_NOTIFICATION_URI, "channel_group_chats");
        }
        if (!r1.A04("silent_notifications")) {
            A0C("silent_notifications", A0A("silent_notifications"), 2, null, null, null, null);
        }
        this.A01 = true;
        if (r15 != null) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("wa-shared-prefs/setNotificationChannelsSchemaVersion ");
            sb7.append(2);
            Log.d(sb7.toString());
            sharedPreferences.edit().putInt("notification_channels_schema_version", 2).apply();
            this.A04.A0E(new RunnableEBaseShape4S0100000_I0_4(this, 19));
            return;
        }
        throw null;
        throw th;
    }

    public final void A0G(String str) {
        AnonymousClass0BM r1 = A0J;
        String A002 = r1.A00(str);
        if (A002 != null && !AnonymousClass0BT.A01.contains(A002)) {
            A08().deleteNotificationChannel(A002);
            r1.A03(str, A002);
            StringBuilder sb = new StringBuilder("chat-settings-store/deleteNotificationChannel/deleting channelId:");
            sb.append(AnonymousClass0BB.A01(A002));
            sb.append(" for settingsId:");
            sb.append(AnonymousClass1VY.A0E(str, Jid.class));
            Log.i(sb.toString());
        }
    }

    public final void A0H(String str, CharSequence charSequence, String str2, String str3, Uri uri, boolean z, boolean z2) {
        StringBuilder A0S = AnonymousClass008.A0S("chat-settings-store/addOrUpdateChannel settingsId:");
        A0S.append(AnonymousClass1VY.A0E(str, Jid.class));
        A0S.append(" notifyLight:");
        A0S.append(str2);
        A0S.append(" notfifyVibrate:");
        A0S.append(str3);
        A0S.append(" sound:");
        A0S.append(uri);
        A0S.append(" isLowPri:");
        A0S.append(z);
        Log.d(A0S.toString());
        String A002 = A0J.A00(str);
        if (!AnonymousClass0BT.A01.contains(A002)) {
            if (A002 != null) {
                NotificationChannel notificationChannel = A08().getNotificationChannel(A002);
                boolean z3 = false;
                Integer A042 = AnonymousClass0BS.A04(str2);
                if (A042 == null ? notificationChannel.shouldShowLights() : !(notificationChannel.shouldShowLights() && A042.equals(Integer.valueOf(notificationChannel.getLightColor())))) {
                    z3 = true;
                }
                if (AnonymousClass0BS.A0B(str3) == null ? notificationChannel.shouldVibrate() : !notificationChannel.shouldVibrate()) {
                    z3 = true;
                }
                Uri sound = notificationChannel.getSound();
                if (uri != sound && (uri == null || !uri.equals(sound))) {
                    z3 = true;
                }
                int importance = notificationChannel.getImportance();
                int i = 4;
                if (z) {
                    i = 3;
                }
                if (importance != i) {
                    if (importance >= 3 || (!this.A05.A0D(AbstractC000400g.A1n) && ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str)))) {
                        z3 = true;
                    } else {
                        StringBuilder A0S2 = AnonymousClass008.A0S("chat-settings-store/addOrUpdateChannel not updating channel importance for settingsId:");
                        A0S2.append(AnonymousClass1VY.A0E(str, Jid.class));
                        A0S2.append(" currentImportance:");
                        A0S2.append(importance);
                        Log.d(A0S2.toString());
                        if ((Build.VERSION.SDK_INT >= 30 || !z2 || !TextUtils.isEmpty(notificationChannel.getConversationId())) && !z3) {
                            StringBuilder A0S3 = AnonymousClass008.A0S("chat-settings-store/addOrUpdateChannel update not needed for settingsId:");
                            A0S3.append(AnonymousClass1VY.A0E(str, Jid.class));
                            Log.d(A0S3.toString());
                            return;
                        }
                        A0G(str);
                        A0C(str, charSequence, importance, str2, str3, uri, "channel_group_chats");
                        return;
                    }
                }
                importance = i;
                if (Build.VERSION.SDK_INT >= 30) {
                }
                StringBuilder A0S32 = AnonymousClass008.A0S("chat-settings-store/addOrUpdateChannel update not needed for settingsId:");
                A0S32.append(AnonymousClass1VY.A0E(str, Jid.class));
                Log.d(A0S32.toString());
                return;
            }
            int i2 = 4;
            if (z) {
                i2 = 3;
            }
            A0C(str, charSequence, i2, str2, str3, uri, "channel_group_chats");
        }
    }
}
