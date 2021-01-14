package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.10I  reason: invalid class name */
public class AnonymousClass10I extends Handler {
    public final AnonymousClass10F A00 = new AnonymousClass10F();
    public final C33401gg A01;
    public final HashSet A02 = new HashSet();
    public final Random A03 = new Random();

    public AnonymousClass10I(C33401gg r2, Looper looper) {
        super(looper);
        this.A01 = r2;
    }

    public synchronized void A00(AnonymousClass10P r5) {
        HashSet hashSet = this.A02;
        if (hashSet.contains(Long.valueOf(r5.A05))) {
            sendMessage(obtainMessage(3, r5));
            hashSet.remove(Long.valueOf(r5.A05));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Aborted trace ");
        sb.append(r5.A0A);
        sb.append(" for reason ");
        int i = r5.A00;
        sb.append(Integer.MAX_VALUE & i);
        sb.append((i & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE ? " (remote process)" : "");
        Log.d("Profilo/TraceControlThread", sb.toString());
    }

    public synchronized void A01(AnonymousClass10P r4) {
        HashSet hashSet = this.A02;
        if (hashSet.contains(Long.valueOf(r4.A05))) {
            sendMessage(obtainMessage(2, r4));
            hashSet.remove(Long.valueOf(r4.A05));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Stopped trace ");
        sb.append(r4.A0A);
        Log.d("Profilo/TraceControlThread", sb.toString());
    }

    public synchronized void A02(AnonymousClass10P r11, int i) {
        int i2;
        AnonymousClass10A[] r5;
        ArrayList arrayList;
        synchronized (this.A00) {
            AnonymousClass10F r1 = this.A00;
            if (r1 != null) {
                AnonymousClass10E r3 = new AnonymousClass10E(r11);
                if (r3.A01) {
                    r1.A00.put(r11.A05, r3);
                }
            } else {
                throw null;
            }
        }
        this.A02.add(Long.valueOf(r11.A05));
        if (this.A01 != null) {
            C33401gg r6 = this.A01;
            synchronized (TraceEvents.class) {
                if (TraceEvents.sInitialized) {
                    AnonymousClass10B r0 = ProvidersRegistry.A00;
                    ArrayList arrayList2 = r0.A01;
                    int A002 = r0.A00(arrayList2);
                    if (A002 != TraceEvents.sLastNameRefreshProvidersState) {
                        TraceEvents.sLastNameRefreshProvidersState = A002;
                        synchronized (arrayList2) {
                            arrayList = new ArrayList(arrayList2);
                        }
                        int size = arrayList.size();
                        int[] iArr = new int[size];
                        String[] strArr = new String[size];
                        Iterator it = arrayList.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            strArr[i3] = str;
                            iArr[i3] = ProvidersRegistry.A00.A01(str);
                            i3++;
                        }
                        TraceEvents.nativeRefreshProviderNames(iArr, strArr);
                    }
                } else {
                    throw new IllegalStateException("Native library is not initialized.");
                }
            }
            int i4 = r11.A02;
            synchronized (TraceEvents.class) {
                TraceEvents.sProviders = TraceEvents.nativeEnableProviders(i4);
            }
            synchronized (r6) {
                r5 = r6.A03;
            }
            synchronized (r6.A05) {
                for (AnonymousClass10A r2 : r5) {
                    if ((r2.getSupportedProviders() & TraceEvents.sProviders) != 0) {
                        r2.A00();
                        r2.A01(r11);
                        r2.onTraceStarted(r11, r6);
                    }
                }
            }
        }
        sendMessage(obtainMessage(1, r11));
        sendMessageDelayed(obtainMessage(0, r11), (long) i);
    }

    public void handleMessage(Message message) {
        AnonymousClass10A[] r6;
        AnonymousClass10A[] r7;
        int tracingProviders;
        int tracingProviders2;
        int i;
        AnonymousClass10D r11;
        AnonymousClass10A[] r5;
        int i2;
        AnonymousClass10A[] r8;
        AnonymousClass10A[] r9;
        AnonymousClass10P r1 = (AnonymousClass10P) message.obj;
        switch (message.what) {
            case 0:
                long j = r1.A05;
                StringBuilder sb = new StringBuilder("Timing out trace ");
                sb.append(j);
                Log.d("Profilo/TraceControlThread", sb.toString());
                AnonymousClass10H r12 = AnonymousClass10H.A07;
                if (r12.A01(j) != null) {
                    Logger.postFinishTrace(42, j);
                    r12.A04(j, 4);
                    return;
                }
                return;
            case 1:
                StringBuilder A0S = AnonymousClass008.A0S("Started trace ");
                A0S.append(r1.A0A);
                A0S.append("  for controller ");
                A0S.append(r1.A01);
                Log.d("Profilo/TraceControlThread", A0S.toString());
                C33401gg r72 = this.A01;
                if (r72 != null) {
                    AnonymousClass25C r62 = r72.A04;
                    r62.ALA(r1);
                    synchronized (r72) {
                        r5 = r72.A02;
                    }
                    for (AnonymousClass10A r3 : r5) {
                        if ((r3.getSupportedProviders() & TraceEvents.sProviders) != 0) {
                            r3.A00();
                            r3.A01(r1);
                            r3.onTraceStarted(r1, r72);
                        }
                    }
                    r62.AIv();
                    return;
                }
                return;
            case 2:
                synchronized (this) {
                    removeMessages(0, r1);
                    if ((r1.A03 & 2) != 0) {
                        long j2 = r1.A05;
                        if (Logger.sInitialized) {
                            Logger.startWorkerThreadIfNecessary();
                            Logger.loggerWriteAndWakeupTraceWriter(Logger.sTraceWriter, j2, 41, 0, 0, j2);
                        }
                    }
                    sendMessageDelayed(obtainMessage(4, r1), (long) r1.A07.A00("trace_config.post_trace_extension_ms", 0));
                }
                return;
            case 3:
                synchronized (this) {
                    removeMessages(0, r1);
                }
                C33401gg r73 = this.A01;
                if (r73 != null) {
                    synchronized (r73) {
                        r8 = r73.A02;
                        r9 = r73.A03;
                    }
                    r73.A04.AL7(r1);
                    int i3 = r1.A02;
                    synchronized (TraceEvents.class) {
                        TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i3);
                    }
                    synchronized (r73.A05) {
                        for (AnonymousClass10A r2 : r9) {
                            if (r2.A00 != 0) {
                                r2.A00();
                                r2.onTraceEnded(r1, r73);
                                r2.A01(r1);
                            }
                        }
                    }
                    for (AnonymousClass10A r22 : r8) {
                        if (r22.A00 != 0) {
                            r22.A00();
                            r22.onTraceEnded(r1, r73);
                            r22.A01(r1);
                        }
                    }
                    return;
                }
                return;
            case 4:
                C33401gg r52 = this.A01;
                if (r52 != null) {
                    synchronized (r52) {
                        r6 = r52.A02;
                        r7 = r52.A03;
                    }
                    if (r52.A09) {
                        C33381ge r0 = r1.A06;
                        Logger.writeStandardEntry(0, 7, 52, 0, 0, 8126470, 0, 0);
                    }
                    int i4 = 0;
                    for (AnonymousClass10A r23 : r6) {
                        if (r23.A02 == null || r23.A03) {
                            tracingProviders2 = r23.getTracingProviders();
                        } else {
                            tracingProviders2 = 0;
                        }
                        i4 |= tracingProviders2;
                    }
                    for (AnonymousClass10A r24 : r7) {
                        if (r24.A02 == null || r24.A03) {
                            tracingProviders = r24.getTracingProviders();
                        } else {
                            tracingProviders = 0;
                        }
                        i4 |= tracingProviders;
                    }
                    int i5 = r1.A02;
                    synchronized (TraceEvents.class) {
                        TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i5);
                    }
                    synchronized (r52.A05) {
                        for (AnonymousClass10A r25 : r7) {
                            if (r25.A00 != 0) {
                                r25.A00();
                                r25.onTraceEnded(r1, r52);
                                r25.A01(r1);
                            }
                        }
                    }
                    for (AnonymousClass10A r26 : r6) {
                        if (r26.A00 != 0) {
                            r26.A00();
                            r26.onTraceEnded(r1, r52);
                            r26.A01(r1);
                        }
                    }
                    AnonymousClass25C r02 = r52.A04;
                    r02.AIw(i4);
                    r02.ALB(r1);
                }
                Logger.postFinishTrace(39, r1.A05);
                return;
            case 5:
                long j3 = (long) message.arg1;
                AnonymousClass10F r4 = this.A00;
                synchronized (r4) {
                    AnonymousClass10E r03 = (AnonymousClass10E) r4.A00.get(r1.A05);
                    if (r03 != null) {
                        AnonymousClass10D r32 = r03.A00;
                        if (r32 == null) {
                            throw new IllegalStateException("We should have set a duration");
                        } else if (j3 > r32.A00) {
                            r32.A00 = j3;
                        }
                    }
                }
                return;
            case 6:
                AnonymousClass10F r42 = this.A00;
                synchronized (r42) {
                    AnonymousClass10E r04 = (AnonymousClass10E) r42.A00.get(r1.A05);
                    if (r04 == null || (r11 = r04.A00) == null) {
                        i = 1;
                    } else {
                        int i6 = -1;
                        i = 0;
                        int i7 = 0;
                        while (true) {
                            int[] iArr = r11.A01;
                            if (i7 < iArr.length) {
                                if (r11.A00 > ((long) iArr[i7]) && iArr[i7] > i6) {
                                    i6 = iArr[i7];
                                    i = r11.A02[i7];
                                }
                                i7++;
                            }
                        }
                    }
                }
                if (i == 0 || this.A03.nextInt(i) != 0) {
                    Logger.postFinishTrace(38, r1.A05);
                    A00(new AnonymousClass10P(r1, 6));
                } else {
                    Logger.writeStandardEntry(0, 7, 95, 0, 0, 0, 0, (long) i);
                    Logger.postFinishTrace(61, r1.A05);
                    A01(r1);
                }
                synchronized (r42) {
                    r42.A00.delete(r1.A05);
                }
                return;
            default:
                return;
        }
    }
}
