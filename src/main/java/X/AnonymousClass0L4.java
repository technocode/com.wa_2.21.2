package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0L4  reason: invalid class name */
public class AnonymousClass0L4 implements Application.ActivityLifecycleCallbacks {
    public static volatile AnonymousClass0L4 A0K;
    public int A00;
    public boolean A01;
    public boolean A02 = true;
    public final AnonymousClass0C2 A03;
    public final AnonymousClass0L9 A04;
    public final AnonymousClass02M A05;
    public final AnonymousClass03B A06;
    public final AnonymousClass1Pw A07;
    public final AnonymousClass0IW A08;
    public final AnonymousClass08D A09;
    public final AnonymousClass03P A0A;
    public final C001901c A0B;
    public final AnonymousClass0ET A0C;
    public final AnonymousClass0L5 A0D;
    public final C03160Fa A0E;
    public final AnonymousClass0L6 A0F;
    public final AnonymousClass010 A0G;
    public final AnonymousClass0L7 A0H;
    public final C03350Fv A0I;
    public final AnonymousClass0JL A0J;

    public AnonymousClass0L4(AnonymousClass08D r2, AnonymousClass02M r3, AnonymousClass0L5 r4, AnonymousClass03B r5, AnonymousClass1Pw r6, AnonymousClass0IW r7, C03160Fa r8, AnonymousClass010 r9, AnonymousClass03P r10, AnonymousClass0JL r11, AnonymousClass0L6 r12, AnonymousClass0ET r13, AnonymousClass0L7 r14, AnonymousClass0C2 r15, AnonymousClass0L9 r16, C03350Fv r17, C001901c r18) {
        this.A09 = r2;
        this.A05 = r3;
        this.A0D = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = r7;
        this.A0E = r8;
        this.A0G = r9;
        this.A0A = r10;
        this.A0J = r11;
        this.A0F = r12;
        this.A0C = r13;
        this.A0H = r14;
        this.A03 = r15;
        this.A04 = r16;
        this.A0I = r17;
        this.A0B = r18;
        this.A00 = 0;
    }

    public static AnonymousClass0L4 A00() {
        if (A0K == null) {
            synchronized (AnonymousClass0L4.class) {
                if (A0K == null) {
                    AnonymousClass08D A002 = AnonymousClass08D.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    if (AnonymousClass0L5.A00 == null) {
                        synchronized (AnonymousClass0L5.class) {
                            if (AnonymousClass0L5.A00 == null) {
                                AnonymousClass0L5.A00 = new AnonymousClass0L5();
                            }
                        }
                    }
                    A0K = new AnonymousClass0L4(A002, A003, AnonymousClass0L5.A00, AnonymousClass03B.A00(), AnonymousClass1Pw.A00(), AnonymousClass0IW.A00(), C03160Fa.A00(), AnonymousClass010.A00(), AnonymousClass03P.A00(), AnonymousClass0JL.A00(), AnonymousClass0L6.A00(), AnonymousClass0ET.A00(), AnonymousClass0L7.A00(), AnonymousClass0C2.A00(), AnonymousClass0L9.A01, C03350Fv.A00(), C001901c.A00());
                }
            }
        }
        return A0K;
    }

    public final void A01(Activity activity, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append(".on");
        sb.append(str);
        Log.i(sb.toString());
        this.A0B.A03(activity, str2);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        A01(activity, "Create", "Create");
        if (this.A00 == 0) {
            this.A0G.A06 = true;
        }
        if (activity instanceof ActivityC004902h) {
            ((ActivityC004902h) activity).A04().A0P.A01.add(new AnonymousClass0WW(this.A04));
        }
        Window window = activity.getWindow();
        window.setCallback(new AnonymousClass0WX(window.getCallback(), this.A0J));
    }

    public void onActivityDestroyed(Activity activity) {
        A01(activity, "Destroy", "Destroy");
        AnonymousClass0L5 r1 = this.A0D;
        AnonymousClass02M r0 = this.A05;
        if (r1 != null) {
            r0.A02.postDelayed(new RunnableEBaseShape3S0100000_I0_3(activity), 60000);
            return;
        }
        throw null;
    }

    public void onActivityPaused(Activity activity) {
        if (!(activity instanceof Main)) {
            this.A0G.A02();
        }
        if (!(activity instanceof Conversation)) {
            this.A0F.A01();
        }
        A01(activity, "Pause", "Pause");
    }

    public void onActivityResumed(Activity activity) {
        A01(activity, "Resume", "Resume");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        A01(activity, "SaveInstanceState", "Save");
    }

    public void onActivityStarted(Activity activity) {
        A01(activity, "Start", "Start");
        this.A09.A09(null);
        if (this.A00 == 0 && !this.A01) {
            Log.i("app-init/application foregrounded");
            MessageService.A01(activity, this.A0I);
            AnonymousClass03B r1 = this.A06;
            if (!r1.A04() && !r1.A03()) {
                this.A0E.A0E(true, false, false, false, 1);
            }
            AnonymousClass0IW r3 = this.A08;
            r3.A09.execute(new RunnableEBaseShape2S0100000_I0_2(r3, 8));
            AnonymousClass0C2 r0 = this.A03;
            if (r0 != null) {
                AnonymousClass00E.A01();
                r0.A00 = true;
                Iterator it = ((AbstractC003401r) r0).A00.iterator();
                while (true) {
                    AnonymousClass0AY r12 = (AnonymousClass0AY) it;
                    if (!r12.hasNext()) {
                        break;
                    }
                    ((AnonymousClass0CU) r12.next()).ACt();
                }
            } else {
                throw null;
            }
        }
        int i = this.A00;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        this.A02 = z;
        this.A00 = i + 1;
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (!(callback instanceof AnonymousClass0WX)) {
            window.setCallback(new AnonymousClass0WX(callback, this.A0J));
        }
        AnonymousClass1Pw r32 = this.A07;
        if (!r32.A03()) {
            AnonymousClass00D r2 = r32.A03;
            if (r2.A00.getBoolean("privacy_fingerprint_enabled", false)) {
                Log.i("AppAuthManager/resetAppAuthSettingIfNecessary: no biometrics enrolled and setting was enabled");
                AnonymousClass008.A0n(r2, "privacy_fingerprint_enabled", false);
                r32.A02(false);
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        A01(activity, "Stop", "Stop");
        this.A09.A09(null);
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.A01 = isChangingConfigurations;
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0 && !isChangingConfigurations) {
            C001901c r3 = this.A0B;
            r3.A02.execute(new RunnableEBaseShape0S1100000_I0(r3, "App backgrounded", 3));
            Log.i("app-init/application backgrounded");
            AnonymousClass010 r0 = this.A0G;
            r0.A02();
            r0.A06 = false;
            AnonymousClass0ET r32 = this.A0C;
            r32.A0C.ANF(new RunnableEBaseShape3S0200000_I0_2(r32, this.A0A, 3));
            AnonymousClass1Pw r2 = this.A07;
            AnonymousClass00D r33 = r2.A03;
            if (!r33.A00.getBoolean("fingerprint_authentication_needed", false)) {
                Log.i("AppAuthManager/onApplicationBackground");
                r2.A02(true);
                AnonymousClass008.A0l(r33, "app_background_time", r2.A02.A03());
            }
            AnonymousClass0L7 r8 = this.A0H;
            C09690dN r7 = r8.A01;
            if (r7 != null) {
                for (Map.Entry entry : r7.A05.entrySet()) {
                    C44021zN r6 = new C44021zN();
                    C63932xF r13 = (C63932xF) entry.getValue();
                    r6.A03 = Long.valueOf(r13.A03);
                    r6.A02 = (Integer) entry.getKey();
                    long j = r13.A03;
                    if (j > 0) {
                        double d = (double) j;
                        r6.A00 = Double.valueOf((r13.A01 * 60000.0d) / d);
                        r6.A01 = Double.valueOf((r13.A00 * 60000.0d) / d);
                    }
                    if (r7.A04 != null) {
                        r7.A03.A08(r6, r7.A01);
                    } else {
                        throw null;
                    }
                }
                r7.A05.clear();
                r8.A02 = Boolean.FALSE;
                r8.A01 = null;
            }
            AnonymousClass0IW r34 = this.A08;
            r34.A09.execute(new RunnableEBaseShape2S0100000_I0_2(r34, 7));
            AnonymousClass0C2 r02 = this.A03;
            if (r02 != null) {
                AnonymousClass00E.A01();
                r02.A00 = false;
                Iterator it = ((AbstractC003401r) r02).A00.iterator();
                while (true) {
                    AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                    if (r1.hasNext()) {
                        ((AnonymousClass0CU) r1.next()).ACs();
                    } else {
                        this.A02 = true;
                        return;
                    }
                }
            } else {
                throw null;
            }
        }
    }
}
