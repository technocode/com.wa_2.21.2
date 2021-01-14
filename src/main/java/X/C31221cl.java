package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.search.verification.client.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cl  reason: invalid class name and case insensitive filesystem */
public class C31221cl extends AbstractC17680ry {
    public static C31221cl A09;
    public static C31221cl A0A;
    public static final Object A0B = new Object();
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public AnonymousClass01Z A02;
    public C31091cX A03;
    public WorkDatabase A04;
    public C18120sp A05;
    public AnonymousClass0t5 A06;
    public List A07;
    public boolean A08;

    public C31221cl(Context context, AnonymousClass01Z r13, AnonymousClass0t5 r14) {
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        ExecutorC18130sq r4 = ((C31581dS) r14).A01;
        WorkDatabase A002 = WorkDatabase.A00(applicationContext, r4, z);
        Context applicationContext2 = context.getApplicationContext();
        C30991cL r0 = new C30991cL(r13.A00);
        synchronized (AbstractC17610rq.class) {
            AbstractC17610rq.A00 = r0;
        }
        List asList = Arrays.asList(AnonymousClass0s6.A00(applicationContext2, this), new C31231cm(applicationContext2, r14, this));
        C31091cX r5 = new C31091cX(context, r13, r14, A002, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.A01 = applicationContext3;
        this.A02 = r13;
        this.A06 = r14;
        this.A04 = A002;
        this.A07 = asList;
        this.A03 = r5;
        this.A05 = new C18120sp(A002);
        this.A08 = false;
        r4.execute(new RunnableC18090sm(applicationContext3, this));
    }

    public static C31221cl A00(Context context) {
        C31221cl r0;
        synchronized (A0B) {
            r0 = A0A;
            if (r0 == null) {
                r0 = A09;
            }
            if (r0 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof AnonymousClass003) {
                    AnonymousClass01Z workManagerConfiguration = ((AnonymousClass003) applicationContext).getWorkManagerConfiguration();
                    C31221cl r1 = A0A;
                    if (r1 == null || A09 == null) {
                        if (r1 == null) {
                            Context applicationContext2 = applicationContext.getApplicationContext();
                            C31221cl r12 = A09;
                            if (r12 == null) {
                                r12 = new C31221cl(applicationContext2, workManagerConfiguration, new C31581dS(workManagerConfiguration.A07));
                                A09 = r12;
                            }
                            A0A = r12;
                        }
                        r0 = A00(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return r0;
    }

    public final C31101cY A03(String str, EnumC17560rk r8, C31061cT r9) {
        EnumC17570rl r3;
        if (r8 == EnumC17560rk.KEEP) {
            r3 = EnumC17570rl.KEEP;
        } else {
            r3 = EnumC17570rl.REPLACE;
        }
        return new C31101cY(this, str, r3, Collections.singletonList(r9), null);
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 23) {
            C31281cv.A03(this.A01);
        }
        C31481dI r0 = (C31481dI) this.A04.A09();
        AbstractC16780qQ r4 = r0.A01;
        r4.A01();
        AbstractC16810qT r3 = r0.A05;
        AbstractC30751bt A002 = r3.A00();
        r4.A02();
        AnonymousClass248 r1 = (AnonymousClass248) A002;
        try {
            r1.A00.executeUpdateDelete();
            r4.A04();
            r4.A03();
            if (r1 == r3.A02) {
                r3.A01.set(false);
            }
            AnonymousClass0s6.A01(this.A04, this.A07);
        } catch (Throwable th) {
            r4.A03();
            r3.A02(A002);
            throw th;
        }
    }

    public void A05(String str) {
        AnonymousClass0t5 r2 = this.A06;
        ((C31581dS) r2).A01.execute(new RunnableEBaseShape0S1110000_I1(this, str, false, 0));
    }

    public void A06(String str, C17700s2 r5) {
        AnonymousClass0t5 r2 = this.A06;
        ((C31581dS) r2).A01.execute(new RunnableEBaseShape1S1200000_I1(r5, this, str, 5));
    }
}
