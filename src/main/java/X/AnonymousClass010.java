package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import com.facebook.profilo.provider.stacktrace.StackFrameThread;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;
import com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider;
import com.facebook.soloader.SoLoader;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.010  reason: invalid class name */
public class AnonymousClass010 {
    public static volatile AnonymousClass010 A0S;
    public int A00;
    public int A01;
    public SharedPreferences A02;
    public AnonymousClass00Z A03;
    public Long A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Handler A0E;
    public final C000300f A0F;
    public final AnonymousClass00G A0G;
    public final AnonymousClass00Y A0H;
    public final AnonymousClass004 A0I;
    public final AnonymousClass1X8 A0J;
    public final AnonymousClass00Z A0K;
    public final AnonymousClass00Z A0L;
    public final AnonymousClass00Z A0M;
    public final AnonymousClass00Z A0N;
    public final AnonymousClass00Z A0O;
    public final AnonymousClass00Z A0P;
    public final AnonymousClass022 A0Q;
    public final AnonymousClass00T A0R;

    public AnonymousClass010(AnonymousClass00G r9, AnonymousClass00T r10, AnonymousClass1X8 r11, AnonymousClass00Y r12, C000300f r13, AnonymousClass004 r14, AnonymousClass022 r15) {
        boolean z = Build.VERSION.SDK_INT < 21;
        int i = 200;
        int i2 = z ? 20 : 200;
        this.A08 = i2;
        i = !z ? 2000 : i;
        this.A0D = i;
        this.A09 = i;
        int i3 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        this.A0K = new AnonymousClass00Z(1, i2, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, false);
        int i4 = SearchActionVerificationClientService.NOTIFICATION_ID;
        this.A0P = new AnonymousClass00Z(10, i, SearchActionVerificationClientService.NOTIFICATION_ID, false);
        this.A0L = new AnonymousClass00Z(10, i, SearchActionVerificationClientService.NOTIFICATION_ID, false);
        i3 = z ? 400 : i3;
        this.A0A = i3;
        i4 = z ? 4000 : i4;
        this.A0C = i4;
        this.A0B = i4;
        this.A0M = new AnonymousClass00Z(10, i3, 25000, false);
        this.A0O = new AnonymousClass00Z(100, i4, 250000, false);
        this.A0N = new AnonymousClass00Z(100, i4, 250000, false);
        this.A0E = new Handler(Looper.getMainLooper());
        this.A00 = -1;
        this.A01 = 1;
        this.A0G = r9;
        this.A0R = r10;
        this.A0J = r11;
        this.A0H = r12;
        this.A0F = r13;
        this.A0I = r14;
        this.A0Q = r15;
    }

    public static AnonymousClass010 A00() {
        if (A0S == null) {
            synchronized (AnonymousClass010.class) {
                if (A0S == null) {
                    AnonymousClass00G r6 = AnonymousClass00G.A01;
                    AnonymousClass00T A002 = C002101e.A00();
                    if (AnonymousClass1X8.A03 == null) {
                        synchronized (AnonymousClass1X8.class) {
                            if (AnonymousClass1X8.A03 == null) {
                                AnonymousClass1X8.A03 = new AnonymousClass1X8(AnonymousClass03P.A00(), AnonymousClass022.A00());
                            }
                        }
                    }
                    A0S = new AnonymousClass010(r6, A002, AnonymousClass1X8.A03, AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass004.A02, AnonymousClass022.A00());
                }
            }
        }
        return A0S;
    }

    public final synchronized String A01() {
        int i = this.A01;
        if (i == 1) {
            return "cold_start_count_pref";
        }
        if (i == 2) {
            return "warm_start_count_pref";
        }
        if (i == 3) {
            return "lukewarm_start_count_pref";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown wam launch type enum value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A02() {
        if (this.A00 != -1) {
            Log.d("startuptracker/backgrounded abort");
            if (this.A07) {
                int i = this.A00;
                if (AnonymousClass1X7.A00 == 2) {
                    AnonymousClass10H r3 = AnonymousClass10H.A07;
                    if (r3 == null) {
                        Log.d("profilo/control not enabled");
                    } else {
                        r3.A03(C449522h.A00, 0, (long) i, 2);
                    }
                }
            }
            this.A00 = -1;
            this.A05 = null;
            this.A07 = false;
            this.A04 = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.Long */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    public final void A03(int i, String str) {
        AnonymousClass00Z r0;
        boolean A002;
        int A003;
        long abs;
        AnonymousClass10H r02;
        C33381ge r5;
        this.A00 = i;
        this.A05 = str;
        Long l = 0;
        l = 0;
        l = 0;
        if (i != 24772609) {
            AnonymousClass004 r4 = this.A0I;
            if (r4 != null) {
                r4.A00 = SystemClock.elapsedRealtime();
                r4.A01 = SystemClock.uptimeMillis();
                switch (i) {
                    case 24772609:
                        break;
                    case 24772610:
                        r0 = this.A0O;
                        break;
                    case 24772611:
                        r0 = this.A0N;
                        break;
                    default:
                        r0 = this.A0N;
                        break;
                }
                A002 = r0.A00();
                this.A07 = A002;
                if (A002 && this.A0F.A0D(AbstractC000400g.A28)) {
                    Application application = this.A0G.A00;
                    Log.d("ProfiloBridge/start");
                    if (AnonymousClass1X7.A00 == 0) {
                        try {
                            Log.d("ProfiloBridge/init so-load-start");
                            AnonymousClass00b.A00(application);
                            Log.d("ProfiloBridge/init so-load-end");
                            SparseArray sparseArray = new SparseArray(1);
                            sparseArray.put(C449522h.A00, new C449522h());
                            C33401gg r42 = new C33401gg(application, new C33391gf(), new AnonymousClass10A[]{new C449422g(), new SystemCounterThread(), new ThreadMetadataProvider(), new StackFrameThread(application), new C33421gi()}, new File(application.getCacheDir(), "profilo"));
                            if (C33401gg.A0B.compareAndSet(null, r42)) {
                                synchronized (r42) {
                                    if (r42.A00 != null) {
                                        r5 = C33391gf.A00;
                                    } else {
                                        throw null;
                                    }
                                }
                                if (AnonymousClass10H.A07 == null) {
                                    synchronized (AnonymousClass10H.class) {
                                        if (AnonymousClass10H.A07 == null) {
                                            AnonymousClass10H.A07 = new AnonymousClass10H(sparseArray, r5, r42);
                                        } else {
                                            throw new IllegalStateException("TraceControl already initialized");
                                        }
                                    }
                                    synchronized (r42) {
                                        File file = r42.A01.A05;
                                        SoLoader.A03("profilo");
                                        TraceEvents.sInitialized = true;
                                        Logger.sInitialized = true;
                                        Logger.sTraceDirectory = file;
                                        Logger.sFilePrefix = "main";
                                        Logger.sLoggerCallbacks = r42;
                                        Logger.sNativeTraceWriterCallbacks = r42;
                                        Logger.sRingBufferSize = 5000;
                                        Logger.sWorker = new AtomicReference(null);
                                        if (!r5.equals(r42.A0A)) {
                                            r42.A0A = r5;
                                            AnonymousClass10H r03 = AnonymousClass10H.A07;
                                            if (r03 != null) {
                                                AtomicReference atomicReference = r03.A04;
                                                if (!atomicReference.compareAndSet(atomicReference.get(), r5)) {
                                                    android.util.Log.d("Profilo/TraceControl", "Tried to update the config and failed due to CAS");
                                                }
                                            } else {
                                                throw new IllegalStateException("Performing config change before TraceControl has been initialized");
                                            }
                                        }
                                        r42.A01.A01 = TimeUnit.DAYS.toSeconds(1) * 1000;
                                        r42.A01.A00 = 10;
                                        r42.A04.A00.add(new C461528h());
                                    }
                                    AnonymousClass1X7.A00 = 2;
                                } else {
                                    throw new IllegalStateException("TraceControl already initialized");
                                }
                            } else {
                                throw new IllegalStateException("Orchestrator already initialized");
                            }
                        } catch (IOException e) {
                            Log.e("profilo/SoLoader initialization failed", e);
                            AnonymousClass1X7.A00 = 1;
                            Log.d("ProfiloBridge/init so-load-end");
                        } catch (Throwable th) {
                            Log.d("ProfiloBridge/init so-load-end");
                            throw th;
                        }
                    }
                    if (AnonymousClass1X7.A00 == 1) {
                        Log.d("profilo/not enabled");
                    } else {
                        AnonymousClass10H r04 = AnonymousClass10H.A07;
                        if (r04 == null) {
                            Log.d("profilo/control not enabled");
                        } else {
                            int i2 = C449522h.A00;
                            long j = (long) i;
                            AtomicInteger atomicInteger = r04.A03;
                            int i3 = atomicInteger.get() | 1;
                            int i4 = (1 << 2) - 1;
                            if (((i3 ^ -1) & (i3 + 1) & i4) != 0) {
                                Object obj = r04.A01.get(i2);
                                if (obj != null) {
                                    C33381ge r43 = (C33381ge) r04.A04.get();
                                    if (!(r43 == null || r04.A00(i2, j) != null || (A003 = ProvidersRegistry.A00.A00(C449522h.A02)) == 0)) {
                                        do {
                                            abs = Math.abs(((Random) AnonymousClass10H.A06.get()).nextLong());
                                        } while (abs <= 0);
                                        StringBuilder A0S2 = AnonymousClass008.A0S("START PROFILO_TRACEID: ");
                                        A0S2.append(C20200wJ.A00(abs));
                                        android.util.Log.w("Profilo/TraceControl", A0S2.toString());
                                        AnonymousClass10P r14 = new AnonymousClass10P(abs, C20200wJ.A00(abs), r43, i2, obj, null, j, A003, 0, 0, AnonymousClass10O.A03);
                                        while (true) {
                                            int i5 = atomicInteger.get();
                                            int i6 = i5 | 1;
                                            int i7 = (i6 ^ -1) & (i6 + 1) & i4;
                                            if (i7 == 0) {
                                                android.util.Log.d("Profilo/TraceControl", "Tried to start a trace and failed because no free slots were left");
                                            } else if (atomicInteger.compareAndSet(i5, i5 | i7)) {
                                                AtomicReferenceArray atomicReferenceArray = r04.A05;
                                                int i8 = -1;
                                                while (i7 != 0) {
                                                    i8++;
                                                    i7 >>= 1;
                                                }
                                                if (atomicReferenceArray.compareAndSet(i8, null, r14)) {
                                                    int A004 = r14.A07.A00("trace_config.trace_timeout_ms", 30000);
                                                    long j2 = r14.A05;
                                                    if (Logger.sInitialized) {
                                                        Logger.nativeInitRingBuffer(Logger.sRingBufferSize);
                                                        Logger.startWorkerThreadIfNecessary();
                                                        Logger.loggerWriteAndWakeupTraceWriter(Logger.sTraceWriter, j2, 40, A004, 0, j2);
                                                    }
                                                    Logger.writeStandardEntry(0, 7, 94, 0, 0, r14.A07.A00("trace_config.logger_priority", 5), 0, r14.A05);
                                                    synchronized (r04) {
                                                        r04.A02();
                                                        if (r04.A01(r14.A05) != null) {
                                                            r04.A00.A02(r14, A004);
                                                        }
                                                    }
                                                } else {
                                                    throw new RuntimeException("ORDERING VIOLATION - ACQUIRED SLOT BUT SLOT NOT EMPTY");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalArgumentException(AnonymousClass008.A0F("Unregistered controller for id = ", i2));
                                }
                            }
                            Log.d("ProfiloBridge/start done");
                        }
                    }
                    AnonymousClass1X8 r44 = this.A0J;
                    if (r44 != null) {
                        if (!(AnonymousClass1X7.A00 != 2 || (r02 = AnonymousClass10H.A07) == null || r02.A03.get() == 0)) {
                            long nextInt = (((long) r44.A02.nextInt(Integer.MAX_VALUE)) << 16) & 281474976645120L;
                            Logger.writeStandardEntry(0, 7, 46, 0, 0, i, 0, nextInt | 562949953421312L);
                            if (0 != 0 && !l.isEmpty()) {
                                int i9 = 0;
                                for (Map.Entry entry : l.entrySet()) {
                                    if (entry.getKey() != null && !((String) entry.getKey()).isEmpty() && entry.getValue() != null && !((String) entry.getValue()).isEmpty()) {
                                        i9 += ((String) entry.getKey()).length() + ((String) entry.getKey()).length();
                                        if (((long) i9) <= 2048) {
                                            int i10 = C449422g.A00;
                                            if ((TraceEvents.sProviders & i10) != 0) {
                                                String str2 = (String) entry.getKey();
                                                int writeStandardEntry = Logger.writeStandardEntry(i10, 7, 59, 0, 0, i, 0, nextInt);
                                                if (str2 != null) {
                                                    writeStandardEntry = Logger.writeBytesEntry(i10, 1, 56, writeStandardEntry, str2);
                                                }
                                                Logger.writeBytesEntry(i10, 1, 57, writeStandardEntry, (String) entry.getValue());
                                            }
                                        } else {
                                            throw new IllegalArgumentException(String.format(Locale.US, "Maximum Length(%d) of Profilo annotations exceeded %d", 2048L, Integer.valueOf(i9)));
                                        }
                                    }
                                }
                            }
                            l = Long.valueOf(nextInt);
                        }
                        this.A04 = l;
                        return;
                    }
                    throw null;
                }
            }
            throw null;
        }
        r0 = this.A0M;
        A002 = r0.A00();
        this.A07 = A002;
        if (A002) {
        }
    }

    public void A04(View view, String str, int i, Runnable runnable) {
        RunnableEBaseShape0S1201000_I0 runnableEBaseShape0S1201000_I0 = new RunnableEBaseShape0S1201000_I0(this, i, runnable, str, 3);
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC08810bl(this.A0E, runnableEBaseShape0S1201000_I0, view));
    }

    public void A05(View view, String str, int i, Runnable runnable) {
        if (this.A00 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" onRestart");
            A07(sb.toString());
        } else if (!this.A06) {
            this.A06 = true;
            A04(view, str, i, runnable);
            StringBuilder sb2 = new StringBuilder("startuptracker/hot start/");
            sb2.append(str);
            Log.d(sb2.toString());
            this.A01 = 2;
            this.A03 = this.A0L;
            A03(24772611, str);
        }
    }

    public void A06(String str) {
        if (this.A00 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" onCreate");
            A07(sb.toString());
        } else if (!this.A06) {
            this.A06 = true;
            AnonymousClass008.A16("startuptracker/warm start/", str);
            this.A01 = 3;
            this.A03 = this.A0P;
            A03(24772610, str);
        }
    }

    public void A07(String str) {
        Long l;
        if (this.A00 != -1) {
            AnonymousClass008.A16("startuptracker/stage:", str);
            if (this.A07 && (l = this.A04) != null) {
                AnonymousClass1X8 r0 = this.A0J;
                long longValue = l.longValue();
                int i = this.A00;
                if (r0 != null) {
                    int i2 = C449422g.A00;
                    Logger.writeBytesEntry(i2, 1, 83, Logger.writeStandardEntry(i2, 7, 50, 0, 0, i, 0, longValue), str);
                    return;
                }
                throw null;
            }
        }
    }
}
