package X;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.ExecutionIdle;
import com.facebook.msys.mci.FileManager;
import com.facebook.msys.mci.JsonSerialization;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.Proxies;
import com.facebook.msys.mci.TaskTracker;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0CQ  reason: invalid class name */
public class AnonymousClass0CQ {
    public static volatile AnonymousClass0CQ A08;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final C001200r A04;
    public final JniBridge A05;
    public final AnonymousClass0CR A06;
    public final AnonymousClass0CS A07;

    public AnonymousClass0CQ(JniBridge jniBridge, C001200r r2, AnonymousClass0CR r3, AnonymousClass0CS r4) {
        this.A05 = jniBridge;
        this.A04 = r2;
        this.A06 = r3;
        this.A07 = r4;
    }

    public static AnonymousClass0CQ A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0CQ.class) {
                JniBridge instance = JniBridge.getInstance();
                C001200r A002 = C001200r.A00();
                if (AnonymousClass0CR.A01 == null) {
                    synchronized (AnonymousClass0CR.class) {
                        if (AnonymousClass0CR.A01 == null) {
                            AnonymousClass0CR.A01 = new AnonymousClass0CR();
                        }
                    }
                }
                AnonymousClass0CR r2 = AnonymousClass0CR.A01;
                if (AnonymousClass0CS.A01 == null) {
                    synchronized (AnonymousClass0CS.class) {
                        if (AnonymousClass0CS.A01 == null) {
                            AnonymousClass0CS.A01 = new AnonymousClass0CS();
                        }
                    }
                }
                A08 = new AnonymousClass0CQ(instance, A002, r2, AnonymousClass0CS.A01);
            }
        }
        return A08;
    }

    public synchronized void A01() {
        if (this.A02) {
            JniBridge jniBridge = this.A05;
            if (jniBridge != null) {
                JniBridge.jvidispatchI();
                if (jniBridge.jniCallbacks != null) {
                    Log.d("wamsys/JniBridge java -> wamsys crossing for WAJContextDeinit");
                    JniBridge.jvidispatchIO(0, jniBridge.getWajContext());
                    this.A02 = false;
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    public synchronized void A02(Application application) {
        if (!this.A00) {
            Log.i("WaMsysSetup/bootstrap");
            com.facebook.msys.mci.Log.registerLogger(new AnonymousClass0MQ());
            Proxies.configure(new AnonymousClass0MR());
            synchronized (Execution.class) {
                C002601j.A01("Execution.initialize");
                try {
                    int i = 0;
                    if (!Execution.sInitialized) {
                        int[] iArr = {1, 2, 3, 4};
                        String[] strArr = {"Main", "Disk", "Network", "Decoding", "Crypto"};
                        Execution.nativeInitializeExecutors(iArr);
                        do {
                            int i2 = iArr[i];
                            String str = strArr[i];
                            AnonymousClass0MV r3 = new AnonymousClass0MV(i2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append("Context");
                            new Thread(r3, sb.toString()).start();
                            i++;
                        } while (i < 4);
                        Execution.nativeInitialize();
                        synchronized (ExecutionIdle.class) {
                            if (!ExecutionIdle.sInitialized) {
                                C002601j.A01("ExecutionIdle.initialize");
                                try {
                                    ExecutionIdle.nativeInitialize();
                                    Looper.getMainLooper().getQueue().addIdleHandler(new AnonymousClass0MZ());
                                    new Thread(new RunnableC04840Ma()).start();
                                    ExecutionIdle.sInitialized = true;
                                } finally {
                                    C002601j.A00();
                                }
                            }
                        }
                        synchronized (TaskTracker.class) {
                            int i3 = 0;
                            if (!TaskTracker.sInitialized) {
                                TaskTracker[] taskTrackerArr = {TaskTracker.TRACKER_MAIN, TaskTracker.TRACKER_DISK_IO, TaskTracker.TRACKER_NETWORK, TaskTracker.TRACKER_DECODING, TaskTracker.TRACKER_CRYPTO};
                                do {
                                    TaskTracker taskTracker = taskTrackerArr[i3];
                                    taskTracker.mNativeHolder = TaskTracker.initNativeHolder(taskTracker.mExecutionContext, taskTracker.mQueueName);
                                    i3++;
                                } while (i3 < 5);
                                TaskTracker.sInitialized = true;
                            }
                        }
                        Execution.sInitialized = true;
                        C002601j.A00();
                    }
                } finally {
                    C002601j.A00();
                }
            }
            FileManager.initialize(application.getCacheDir());
            this.A05.initWajContext();
            this.A00 = true;
        }
    }

    public final synchronized void A03(Context context, AnonymousClass03A r6, AnonymousClass00T r7, AnonymousClass03U r8) {
        NotificationCenter notificationCenter;
        if (!this.A03) {
            AnonymousClass0CS r1 = this.A07;
            NotificationCenter notificationCenter2 = new NotificationCenter();
            synchronized (r1) {
                r1.A00 = notificationCenter2;
            }
            String A022 = r6.A02();
            synchronized (r1) {
                notificationCenter = r1.A00;
                if (notificationCenter == null) {
                    throw null;
                }
            }
            NetworkSession networkSession = new NetworkSession(A022, notificationCenter, new AnonymousClass3W0(r6, r7, r8, context.getCacheDir()));
            AnonymousClass0CR r12 = this.A06;
            synchronized (r12) {
                r12.A00 = networkSession;
            }
            this.A03 = true;
        }
    }

    public synchronized void A04(AnonymousClass00G r10, AnonymousClass03A r11, AnonymousClass00T r12, AnonymousClass01X r13, AnonymousClass03U r14, AnonymousClass00D r15, String str) {
        NetworkSession networkSession;
        if (!this.A02) {
            Log.i("WaMsysSetup/bootstrapForReg");
            A02(r10.A00);
            A03(r10.A00, r11, r12, r14);
            JniBridge jniBridge = this.A05;
            AnonymousClass0CR r2 = this.A06;
            synchronized (r2) {
                networkSession = r2.A00;
                if (networkSession == null) {
                    throw null;
                }
            }
            if (jniBridge.jniCallbacks != null) {
                Log.d("wamsys/JniBridge java -> wamsys crossing for WAJContextInitWCRManager");
                if (0 != JniBridge.jvidispatchIOO(networkSession, jniBridge.getWajContext())) {
                    JniBridge.jvidispatchIIOOOOO((long) 1, r13.A04(), r13.A03(), str, r15.A0E(), jniBridge.getWajContext());
                    JsonSerialization.initialize();
                    this.A02 = true;
                    return;
                }
                throw new IllegalStateException("wa-msys/failed to initialize WCRManager");
            }
            throw null;
        }
    }
}
