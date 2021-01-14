package X;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.os.Environment;
import android.preference.PreferenceManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0Gk  reason: invalid class name and case insensitive filesystem */
public class C03480Gk {
    public static volatile C03480Gk A0k;
    public GoogleBackupService A00;
    public final AnonymousClass0GG A01;
    public final C03510Gn A02;
    public final C03500Gm A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass01I A05;
    public final C03490Gl A06;
    public final C000300f A07;
    public final AbstractC26951Ni A08;
    public final C03170Fb A09;
    public final AnonymousClass0HI A0A;
    public final AnonymousClass0HQ A0B;
    public final C03550Gr A0C;
    public final AnonymousClass0HL A0D;
    public final AnonymousClass0DH A0E;
    public final AnonymousClass00G A0F;
    public final AnonymousClass03S A0G;
    public final AnonymousClass00D A0H;
    public final C001000o A0I;
    public final C02290Bk A0J;
    public final AnonymousClass094 A0K;
    public final C014508d A0L;
    public final AnonymousClass0GY A0M;
    public final C03540Gq A0N;
    public final C016308v A0O;
    public final C018709t A0P;
    public final C03910Ig A0Q;
    public final C03400Ga A0R;
    public final AnonymousClass01S A0S;
    public final AnonymousClass0Ci A0T;
    public final AnonymousClass0CH A0U;
    public final C03160Fa A0V;
    public final AnonymousClass0AR A0W;
    public final AnonymousClass0FE A0X;
    public final AnonymousClass0GQ A0Y;
    public final AnonymousClass0HM A0Z;
    public final AnonymousClass0BB A0a;
    public final AnonymousClass324 A0b;
    public final C03570Gt A0c;
    public final AnonymousClass0HE A0d;
    public final AnonymousClass00T A0e;
    public final C04020Ir A0f;
    public final AnonymousClass0CQ A0g;
    public final AnonymousClass0C4 A0h;
    public final AnonymousClass0C6 A0i;
    public final CopyOnWriteArrayList A0j = new CopyOnWriteArrayList();

    public C03480Gk(AnonymousClass00G r2, AnonymousClass02M r3, C03490Gl r4, AnonymousClass01I r5, C03170Fb r6, AnonymousClass00T r7, C03500Gm r8, C03400Ga r9, AnonymousClass0C4 r10, AnonymousClass0AR r11, C000300f r12, AnonymousClass0DH r13, AnonymousClass0CQ r14, C018709t r15, AbstractC26951Ni r16, C03160Fa r17, AnonymousClass0GG r18, AnonymousClass0C6 r19, C03510Gn r20, AnonymousClass0BB r21, C03540Gq r22, C03550Gr r23, AnonymousClass0Ci r24, C001000o r25, C03570Gt r26, AnonymousClass0HE r27, AnonymousClass0HI r28, C02290Bk r29, AnonymousClass0HL r30, AnonymousClass0FE r31, C014508d r32, AnonymousClass0HM r33, AnonymousClass03S r34, AnonymousClass00D r35, C016308v r36, C03910Ig r37, AnonymousClass0CH r38, C04020Ir r39, AnonymousClass01S r40, AnonymousClass324 r41, AnonymousClass0GQ r42, AnonymousClass0GY r43, AnonymousClass0HQ r44, AnonymousClass094 r45) {
        this.A0F = r2;
        this.A04 = r3;
        this.A06 = r4;
        this.A05 = r5;
        this.A09 = r6;
        this.A0e = r7;
        this.A03 = r8;
        this.A0R = r9;
        this.A0h = r10;
        this.A0W = r11;
        this.A07 = r12;
        this.A0E = r13;
        this.A0g = r14;
        this.A0P = r15;
        this.A08 = r16;
        this.A0V = r17;
        this.A0i = r19;
        this.A01 = r18;
        this.A02 = r20;
        this.A0a = r21;
        this.A0N = r22;
        this.A0C = r23;
        this.A0T = r24;
        this.A0I = r25;
        this.A0c = r26;
        this.A0d = r27;
        this.A0A = r28;
        this.A0J = r29;
        this.A0D = r30;
        this.A0X = r31;
        this.A0L = r32;
        this.A0Z = r33;
        this.A0G = r34;
        this.A0H = r35;
        this.A0O = r36;
        this.A0Q = r37;
        this.A0U = r38;
        this.A0f = r39;
        this.A0S = r40;
        this.A0b = r41;
        this.A0Y = r42;
        this.A0M = r43;
        this.A0B = r44;
        this.A0K = r45;
    }

    public static C03480Gk A00() {
        if (A0k == null) {
            synchronized (C03480Gk.class) {
                if (A0k == null) {
                    AnonymousClass00G r5 = AnonymousClass00G.A01;
                    AnonymousClass02M A002 = AnonymousClass02M.A00();
                    C03490Gl A003 = C03490Gl.A00();
                    AnonymousClass01I A004 = AnonymousClass01I.A00();
                    C03170Fb A005 = C03170Fb.A00();
                    AnonymousClass00T A006 = C002101e.A00();
                    C03500Gm A007 = C03500Gm.A00();
                    C03400Ga A008 = C03400Ga.A00();
                    AnonymousClass0C4 A009 = AnonymousClass0C4.A00();
                    AnonymousClass0AR A0010 = AnonymousClass0AR.A00();
                    C000300f A0011 = C000300f.A00();
                    AnonymousClass0DH A0012 = AnonymousClass0DH.A00();
                    AnonymousClass0CQ A0013 = AnonymousClass0CQ.A00();
                    C018709t A012 = C018709t.A01();
                    if (AnonymousClass3PG.A00 == null) {
                        synchronized (AnonymousClass3PG.class) {
                            if (AnonymousClass3PG.A00 == null) {
                                AnonymousClass3PG.A00 = new AnonymousClass3PG();
                            }
                        }
                    }
                    AnonymousClass3PG r19 = AnonymousClass3PG.A00;
                    C03160Fa A0014 = C03160Fa.A00();
                    AnonymousClass0GG A0015 = AnonymousClass0GG.A00();
                    AnonymousClass0C6 A0016 = AnonymousClass0C6.A00();
                    C03510Gn A0017 = C03510Gn.A00();
                    AnonymousClass0BB A0018 = AnonymousClass0BB.A00();
                    C03540Gq A0019 = C03540Gq.A00();
                    C03550Gr A0020 = C03550Gr.A00();
                    AnonymousClass0Ci A0021 = AnonymousClass0Ci.A00();
                    C001000o A0022 = C001000o.A00();
                    C03570Gt A0023 = C03570Gt.A00();
                    AnonymousClass0HE A0024 = AnonymousClass0HE.A00();
                    AnonymousClass0HI A0025 = AnonymousClass0HI.A00();
                    C02290Bk A022 = C02290Bk.A02();
                    AnonymousClass0HL A0026 = AnonymousClass0HL.A00();
                    AnonymousClass0FE A0027 = AnonymousClass0FE.A00();
                    C014508d A0028 = C014508d.A00();
                    AnonymousClass0HM A0029 = AnonymousClass0HM.A00();
                    AnonymousClass03S A0030 = AnonymousClass03S.A00();
                    AnonymousClass00D A0031 = AnonymousClass00D.A00();
                    C016308v A0032 = C016308v.A00();
                    C03910Ig A0033 = C03910Ig.A00();
                    AnonymousClass0CH A0034 = AnonymousClass0CH.A00();
                    if (C04020Ir.A01 == null) {
                        synchronized (C04020Ir.class) {
                            if (C04020Ir.A01 == null) {
                                C04020Ir.A01 = new C04020Ir(AnonymousClass08H.A00());
                            }
                        }
                    }
                    A0k = new C03480Gk(r5, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A012, r19, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A022, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, C04020Ir.A01, AnonymousClass01S.A00(), AnonymousClass324.A00(), AnonymousClass0GQ.A00(), AnonymousClass0GY.A00(), AnonymousClass0HQ.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A0k;
    }

    public void A01() {
        this.A0Z.A0C(6);
        Iterator it = this.A0j.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1P5) it.next()).AHJ();
        }
        AnonymousClass0CH r4 = this.A0U;
        synchronized (r4.A0R) {
            Iterator it2 = ((ArrayList) r4.A04()).iterator();
            while (it2.hasNext()) {
                r4.A08((AnonymousClass0M3) it2.next(), true, true);
            }
        }
        this.A0X.A0C(false);
        AnonymousClass0HL r1 = this.A0D;
        synchronized (r1) {
            r1.A00.clear();
            r1.A01.clear();
            r1.A02.clear();
        }
        ConditionVariable conditionVariable = new ConditionVariable(false);
        C459327c r11 = new C459327c(conditionVariable);
        ConditionVariable conditionVariable2 = new ConditionVariable(false);
        AnonymousClass1P4 r2 = new AnonymousClass1P4(this, conditionVariable2, r11);
        Application application = this.A0F.A00;
        application.bindService(new Intent(application, GoogleBackupService.class), r2, 1);
        AnonymousClass01I r0 = this.A05;
        r0.A04();
        if (r0.A00 != null) {
            Intent intent = new Intent("action_delete");
            intent.putExtra("account_name", this.A0H.A0D());
            AnonymousClass01I r02 = this.A05;
            r02.A04();
            UserJid userJid = r02.A03;
            if (userJid != null) {
                intent.putExtra("jid_user", userJid.user);
                this.A0e.ANF(new RunnableEBaseShape0S0300000_I0_0(conditionVariable2, application, intent, 16));
            } else {
                throw null;
            }
        } else {
            Log.i("deleteacctconfirm/app.me is null/no google drive backup deletion");
        }
        File filesDir = application.getFilesDir();
        filesDir.toString();
        String[] fileList = application.fileList();
        for (String str : fileList) {
        }
        C006803i.A0a(filesDir);
        this.A0e.ANF(AnonymousClass1P3.A00);
        this.A0A.A03();
        C03510Gn r22 = this.A02;
        synchronized (r22) {
            SharedPreferences sharedPreferences = r22.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r22.A09.A01("chatCounts");
                r22.A00 = sharedPreferences;
            }
            sharedPreferences.edit().clear().commit();
        }
        String externalStorageState = Environment.getExternalStorageState();
        AnonymousClass008.A18("deleteacctconfirm/externalmedia-state ", externalStorageState);
        if (this.A0G.A0A(externalStorageState)) {
            C02290Bk r7 = this.A0J;
            if (r7 != null) {
                for (AnonymousClass1Y3 r03 : AnonymousClass1Y3.values()) {
                    AnonymousClass0HY.A0G(r7.A0E(r03), -1, "", false, false);
                }
                AnonymousClass0HY.A0G(r7.A0W, -1, "", false, false);
            } else {
                throw null;
            }
        }
        this.A0W.A05();
        this.A0V.A09(false);
        this.A0e.ANC(new C11070ff(this, conditionVariable2, conditionVariable, r11, application), new Void[0]);
    }

    public void A02() {
        Application application = this.A0F.A00;
        PreferenceManager.setDefaultValues(application, R.xml.preferences_account, true);
        PreferenceManager.setDefaultValues(application, R.xml.preferences_chat, true);
        PreferenceManager.setDefaultValues(application, R.xml.preferences_chat_history, true);
        PreferenceManager.setDefaultValues(application, R.xml.preferences_contacts, true);
        PreferenceManager.setDefaultValues(application, R.xml.preferences_data_usage, true);
    }
}
