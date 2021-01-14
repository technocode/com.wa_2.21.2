package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.Me;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0HM  reason: invalid class name */
public class AnonymousClass0HM {
    public static volatile AnonymousClass0HM A0o;
    public GoogleBackupService A00;
    public AnonymousClass0Ht A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final AnonymousClass0C2 A03;
    public final AnonymousClass0GG A04;
    public final C03290Fp A05;
    public final C03500Gm A06;
    public final AnonymousClass02M A07;
    public final AnonymousClass01I A08;
    public final C03250Fl A09;
    public final C03490Gl A0A;
    public final C000300f A0B;
    public final C03170Fb A0C;
    public final AnonymousClass01J A0D;
    public final AnonymousClass0HI A0E;
    public final AnonymousClass0HQ A0F;
    public final AnonymousClass0EV A0G;
    public final AnonymousClass0HN A0H;
    public final AnonymousClass03P A0I;
    public final AnonymousClass00S A0J;
    public final AnonymousClass00G A0K;
    public final AnonymousClass03C A0L;
    public final AnonymousClass03S A0M;
    public final AnonymousClass00D A0N;
    public final AnonymousClass01X A0O;
    public final AnonymousClass0DG A0P;
    public final AnonymousClass0HO A0Q;
    public final AnonymousClass094 A0R;
    public final C014508d A0S;
    public final AnonymousClass0GY A0T;
    public final AnonymousClass01P A0U;
    public final C02430Bz A0V;
    public final AnonymousClass0EO A0W;
    public final AnonymousClass018 A0X;
    public final AnonymousClass09H A0Y;
    public final C03160Fa A0Z;
    public final AnonymousClass0AR A0a;
    public final AnonymousClass0GQ A0b;
    public final AnonymousClass022 A0c;
    public final C03200Fe A0d;
    public final C014708f A0e;
    public final AnonymousClass0HP A0f;
    public final AbstractC658731w A0g;
    public final AnonymousClass3P5 A0h;
    public final AnonymousClass321 A0i;
    public final AnonymousClass324 A0j;
    public final AnonymousClass0HE A0k;
    public final AnonymousClass00T A0l;
    public final AnonymousClass0C4 A0m;
    public final List A0n = new CopyOnWriteArrayList();

    public AnonymousClass0HM(AnonymousClass00G r3, AnonymousClass00S r4, AbstractC658731w r5, AnonymousClass02M r6, C03490Gl r7, AnonymousClass01I r8, C03170Fb r9, AnonymousClass00T r10, C03500Gm r11, AnonymousClass3P5 r12, AnonymousClass0C4 r13, AnonymousClass0DG r14, AnonymousClass0AR r15, C000300f r16, C03200Fe r17, AnonymousClass01J r18, AnonymousClass09H r19, C03160Fa r20, AnonymousClass03P r21, AnonymousClass01X r22, AnonymousClass0GG r23, AnonymousClass0EO r24, C03250Fl r25, AnonymousClass0HE r26, AnonymousClass0HI r27, AnonymousClass0HN r28, AnonymousClass0HO r29, C03290Fp r30, AnonymousClass0EV r31, C014508d r32, AnonymousClass01P r33, AnonymousClass03S r34, AnonymousClass00D r35, AnonymousClass0HP r36, AnonymousClass03C r37, C02430Bz r38, AnonymousClass321 r39, AnonymousClass324 r40, AnonymousClass018 r41, AnonymousClass0GQ r42, C014708f r43, AnonymousClass022 r44, AnonymousClass0C2 r45, AnonymousClass0GY r46, AnonymousClass0HQ r47, AnonymousClass094 r48) {
        this.A0K = r3;
        this.A0J = r4;
        this.A0g = r5;
        this.A07 = r6;
        this.A0A = r7;
        this.A08 = r8;
        this.A0C = r9;
        this.A0l = r10;
        this.A06 = r11;
        this.A0h = r12;
        this.A0m = r13;
        this.A0P = r14;
        this.A0a = r15;
        this.A0B = r16;
        this.A0d = r17;
        this.A0D = r18;
        this.A0Y = r19;
        this.A0Z = r20;
        this.A0I = r21;
        this.A0O = r22;
        this.A04 = r23;
        this.A0W = r24;
        this.A0k = r26;
        this.A0E = r27;
        this.A0H = r28;
        this.A09 = r25;
        this.A05 = r30;
        this.A0G = r31;
        this.A0Q = r29;
        this.A0S = r32;
        this.A0U = r33;
        this.A0M = r34;
        this.A0N = r35;
        this.A0f = r36;
        this.A0L = r37;
        this.A0V = r38;
        this.A0i = r39;
        this.A0j = r40;
        this.A0X = r41;
        this.A0b = r42;
        this.A0e = r43;
        this.A0c = r44;
        this.A03 = r45;
        this.A0T = r46;
        this.A0F = r47;
        this.A0R = r48;
    }

    public static AnonymousClass0HM A00() {
        if (A0o == null) {
            synchronized (AnonymousClass0HM.class) {
                if (A0o == null) {
                    AnonymousClass00G r4 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AbstractC658731w A003 = AbstractC658731w.A00();
                    AnonymousClass02M A004 = AnonymousClass02M.A00();
                    C03490Gl A005 = C03490Gl.A00();
                    AnonymousClass01I A006 = AnonymousClass01I.A00();
                    C03170Fb A007 = C03170Fb.A00();
                    AnonymousClass00T A008 = C002101e.A00();
                    C03500Gm A009 = C03500Gm.A00();
                    if (AnonymousClass3P5.A00 == null) {
                        synchronized (AnonymousClass3P5.class) {
                            if (AnonymousClass3P5.A00 == null) {
                                AnonymousClass3P5.A00 = new AnonymousClass3P5();
                            }
                        }
                    }
                    AnonymousClass3P5 r13 = AnonymousClass3P5.A00;
                    AnonymousClass0C4 A0010 = AnonymousClass0C4.A00();
                    AnonymousClass0DG A0011 = AnonymousClass0DG.A00();
                    AnonymousClass0AR A0012 = AnonymousClass0AR.A00();
                    C000300f A0013 = C000300f.A00();
                    C03200Fe A0014 = C03200Fe.A00();
                    AnonymousClass01J A0015 = AnonymousClass01J.A00();
                    AnonymousClass09H A012 = AnonymousClass09H.A01();
                    C03160Fa A0016 = C03160Fa.A00();
                    AnonymousClass03P A0017 = AnonymousClass03P.A00();
                    AnonymousClass01X A0018 = AnonymousClass01X.A00();
                    AnonymousClass0GG A0019 = AnonymousClass0GG.A00();
                    AnonymousClass0EO A0020 = AnonymousClass0EO.A00();
                    C03250Fl A0021 = C03250Fl.A00();
                    AnonymousClass0HE A0022 = AnonymousClass0HE.A00();
                    AnonymousClass0HI A0023 = AnonymousClass0HI.A00();
                    AnonymousClass0HN A0024 = AnonymousClass0HN.A00();
                    AnonymousClass0HO A0025 = AnonymousClass0HO.A00();
                    C03290Fp A0026 = C03290Fp.A00();
                    AnonymousClass0EV A0027 = AnonymousClass0EV.A00();
                    C014508d A0028 = C014508d.A00();
                    AnonymousClass01P A0029 = AnonymousClass01P.A00();
                    AnonymousClass03S A0030 = AnonymousClass03S.A00();
                    AnonymousClass00D A0031 = AnonymousClass00D.A00();
                    AnonymousClass0HP A0032 = AnonymousClass0HP.A00();
                    AnonymousClass03C A0033 = AnonymousClass03C.A00();
                    C02430Bz A0034 = C02430Bz.A00();
                    AnonymousClass321 A0035 = AnonymousClass321.A00();
                    AnonymousClass324 A0036 = AnonymousClass324.A00();
                    AnonymousClass018 r42 = AnonymousClass018.A00;
                    if (r42 != null) {
                        A0o = new AnonymousClass0HM(r4, A002, A003, A004, A005, A006, A007, A008, A009, r13, A0010, A0011, A0012, A0013, A0014, A0015, A012, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, r42, AnonymousClass0GQ.A00(), C014708f.A00(), AnonymousClass022.A00(), AnonymousClass0C2.A00(), AnonymousClass0GY.A00(), AnonymousClass0HQ.A00(), AnonymousClass094.A00());
                    } else {
                        throw null;
                    }
                }
            }
        }
        return A0o;
    }

    public static String A01(Context context, Class cls) {
        String packageName = context.getPackageName();
        String name = cls.getName();
        int length = packageName.length();
        return (!name.startsWith(packageName) || name.length() <= length || name.charAt(length) != '.') ? name : name.substring(length + 1);
    }

    public Intent A02() {
        A0A();
        C03490Gl r0 = this.A0A;
        r0.A01 = false;
        r0.A00 = null;
        r0.A06.A0X(null, null);
        AnonymousClass0GG r6 = this.A04;
        r6.A04();
        this.A0Z.A09(false);
        AnonymousClass01I r7 = this.A08;
        r7.A04();
        AnonymousClass0HR r2 = r7.A01;
        if (r2 != null) {
            AnonymousClass0EV r1 = this.A0G;
            r1.A05.A04(r2);
            r1.A01(r2, 0, 0);
        }
        AnonymousClass00G r12 = this.A0K;
        File file = new File(r12.A00.getFilesDir(), "me");
        if (file.exists()) {
            AnonymousClass008.A1G("registrationmanager/reregister/rm-me ", file.delete());
        }
        Log.i("memanager/clearMe");
        r7.A04();
        r7.A05(null);
        A0E(null, null, null);
        this.A0T.A01();
        Intent intent = new Intent(r12.A00, RegisterPhone.class);
        intent.putExtra("com.whatsapp.registration.RegisterPhone.resetstate", true);
        intent.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        intent.addFlags(32768);
        A0C(1);
        this.A0C.A04();
        this.A06.A06();
        AnonymousClass0HE r02 = this.A0k;
        r02.A02();
        r02.A03();
        this.A0S.A00 = false;
        this.A0Q.A00 = true;
        AnonymousClass0HY.A08(r12.A00);
        AnonymousClass00D r13 = this.A0N;
        AnonymousClass008.A0k(r13, "gdrive_successive_backup_failed_count", 0);
        this.A0m.A07();
        r6.A05();
        r13.A0d(true);
        this.A0d.A01(false);
        r13.A0f(false);
        r13.A0e(false);
        r13.A00.edit().putString("contact_qr_code", null).apply();
        Conversation.A0C((AnonymousClass02N) null);
        return intent;
    }

    public final AnonymousClass03E A03(String str, String str2, String str3) {
        Application application = this.A0K.A00;
        AnonymousClass03E A002 = AnonymousClass0BS.A00(application);
        A002.A0J = "critical_app_alerts@1";
        A002.A03 = 1;
        A002.A07.tickerText = AnonymousClass03E.A00(str3);
        A002.A07.when = this.A0J.A05();
        A002.A04(3);
        A002.A06(16, true);
        A002.A0A(str);
        A002.A09(str2);
        C03800Hr r0 = new C03800Hr();
        r0.A07(str2);
        A002.A08(r0);
        A002.A09 = PendingIntent.getActivity(application, 1, new Intent(application, Main.class), 0);
        A002.A07.icon = R.drawable.notifybar;
        return A002;
    }

    public Me A04() {
        AnonymousClass00D r0 = this.A0N;
        return new Me(r0.A0F(), r0.A0H(), r0.A0G());
    }

    public final AnonymousClass0Ht A05() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = new AnonymousClass0Ht(this.A0K, this.A0I, this.A0M, this.A0N, this.A0e);
                }
            }
        }
        return this.A01;
    }

    public void A06() {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A0K.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_RETRY").setPackage("com.whatsapp"), 536870912);
        if (broadcast != null) {
            AlarmManager A022 = this.A0I.A02();
            if (A022 != null) {
                A022.cancel(broadcast);
            } else {
                Log.w("RegistrationManager/cancelRegistrationRetryAlarm AlarmManager is null");
            }
            broadcast.cancel();
        }
    }

    public void A07() {
        AnonymousClass01I r0 = this.A08;
        Me A012 = r0.A01();
        if (A012 != null) {
            r0.A03();
            this.A05.A01();
            AnonymousClass280 r1 = (AnonymousClass280) this.A0X;
            if (r1.A03.A01()) {
                Log.d("InstrumentationObserverImpl/onChangeNumberSuccess");
                r1.A04.A01();
            }
            this.A06.A06();
            AnonymousClass0GG r12 = this.A04;
            r12.A05();
            r12.A0D(null);
            this.A0W.A0M(true, true, 3);
            this.A02.post(new RunnableEBaseShape3S0200000_I0_2(this, A012, 48));
            return;
        }
        Log.w("registrationmanager/response/ok already changed?");
    }

    public void A08() {
        this.A0E.A03();
        if (!this.A0e.A02()) {
            Log.i("registrationmanager/loginfailed/ignore as registration not verified");
            return;
        }
        Application application = this.A0K.A00;
        AbstractC004502c r0 = this.A07.A00;
        if (r0 == null || !C002001d.A3I(r0)) {
            this.A0l.ANF(new RunnableEBaseShape3S0200000_I0_2(this, application, 47));
        }
    }

    public void A09() {
        AnonymousClass01I r1 = this.A08;
        r1.A04();
        if (r1.A00 != null) {
            Log.i("xmpp/service/reset-registered/updateparams");
            r1.A04();
            UserJid userJid = r1.A03;
            C03160Fa r12 = this.A0Z;
            if (r12.A1W) {
                r12.A07 = userJid;
            }
        }
    }

    public void A0A() {
        AnonymousClass022 r3 = this.A0c;
        AnonymousClass00G r2 = this.A0K;
        r3.A01(A01(r2.A00, RegisterPhone.class)).edit().clear().apply();
        r3.A01(A01(r2.A00, VerifySms.class)).edit().clear().apply();
    }

    public void A0B() {
        AnonymousClass01I r1 = this.A08;
        Log.i("memanager/clearMe");
        r1.A04();
        r1.A05(null);
        SharedPreferences sharedPreferences = this.A0N.A00;
        sharedPreferences.edit().remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        sharedPreferences.edit().remove("registration_wipe_info_timestamp").apply();
        A0C(1);
    }

    public void A0C(int i) {
        AnonymousClass00D r3 = this.A0N;
        if (r3.A00.getInt("registration_state", -1) != i) {
            AnonymousClass0HP r1 = this.A0f;
            r1.A00 = null;
            r1.A01 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A06 = false;
            r1.A07 = false;
            r1.A04 = false;
            r1.A05 = true;
            r3.A0K();
        }
        this.A0e.A00.A00.edit().putInt("registration_state", i).apply();
        StringBuilder sb = new StringBuilder("registrationmanager/setregstate ");
        sb.append(i);
        Log.d(sb.toString());
    }

    public void A0D(long j) {
        if (j >= 60000) {
            PendingIntent broadcast = PendingIntent.getBroadcast(this.A0K.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_RETRY").setPackage("com.whatsapp"), 134217728);
            AlarmManager A022 = this.A0I.A02();
            if (A022 != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    A022.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, broadcast);
                } else if (i >= 19) {
                    A022.setExact(2, SystemClock.elapsedRealtime() + j, broadcast);
                } else {
                    A022.set(2, SystemClock.elapsedRealtime() + j, broadcast);
                }
            } else {
                Log.w("RegistrationManager/startRegistrationRetryAlarm AlarmManager is null");
            }
        }
    }

    public void A0E(String str, String str2, String str3) {
        AnonymousClass00D r2 = this.A0N;
        SharedPreferences sharedPreferences = r2.A00;
        sharedPreferences.edit().putString("registration_jid", str3).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        sharedPreferences.edit().remove("registration_wipe_info_timestamp").apply();
        r2.A0Z(str, str2);
    }

    public boolean A0F() {
        AnonymousClass0AR r4 = this.A0a;
        r4.A05();
        C03160Fa r13 = this.A0Z;
        r13.A09(false);
        Log.i("registrationmanager/complete-change-number");
        Me A042 = A04();
        boolean z = false;
        if (A042.jabber_id != null) {
            z = true;
        }
        Log.a(z);
        AnonymousClass01I r1 = this.A08;
        r1.A04();
        if (r1.A07(A042, "me")) {
            r1.A04();
            r1.A05(A042);
            C014508d r0 = this.A0S;
            r0.A05();
            boolean z2 = r0.A01;
            if (!z2) {
                AnonymousClass094 r12 = this.A0R;
                if (r12.A01.A08(false)) {
                    Log.i("registration-manager/complete-change-number/msgstoredb/healthy");
                    this.A0P.A04(false);
                    r12.A01();
                }
            }
            A09();
            r13.A01();
            if (!z2) {
                this.A0H.A04();
            }
            A0C(3);
            this.A0Q.A00 = true;
            AnonymousClass00G r9 = this.A0K;
            AnonymousClass0HY.A08(r9.A00);
            Log.i("registration-manager/complete-change-number/changenumber/setregverified");
            AnonymousClass0HN r5 = this.A0H;
            AnonymousClass0Hz r02 = new AnonymousClass0Hz(EnumC03840Hy.BACKGROUND_FULL);
            r02.A02();
            r02.A06 = true;
            r5.A02(r02.A01(), true);
            this.A0b.A02(true, false);
            Log.i("registration-manager/complete-change-number/reinitalized-payments");
            C000300f r6 = this.A0B;
            if (r6 != null) {
                synchronized (AbstractC000400g.class) {
                    AbstractC000400g.A07 = 0;
                    r6.A00.edit().putLong("groups_server_props_last_refresh_time", 0).apply();
                }
                this.A0m.A07();
                AnonymousClass00T r10 = this.A0l;
                r10.ANF(new RunnableEBaseShape4S0100000_I0_4(this.A0V, 6));
                if (AnonymousClass0I2.A03(r6)) {
                    new AnonymousClass0I3(this.A0J, r9, r10, this.A0Y, this.A0N).A00();
                }
                r4.A05();
                this.A04.A05();
                this.A0N.A0P(3);
                r13.A0E(true, false, false, false, 0);
                return true;
            }
            throw null;
        }
        Log.i("registration-manager/complete-change-number/error-saving");
        return false;
    }
}
