package X;

import android.content.Context;
import android.util.Log;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1gg  reason: invalid class name and case insensitive filesystem */
public final class C33401gg implements NativeTraceWriterCallbacks, AnonymousClass10X, AnonymousClass108 {
    public static AtomicReference A0B = new AtomicReference(null);
    public C33391gf A00;
    public AnonymousClass10U A01;
    public AnonymousClass10A[] A02;
    public AnonymousClass10A[] A03;
    public final AnonymousClass25C A04;
    public final Object A05 = new Object();
    public final String A06;
    public final HashMap A07;
    public final Random A08;
    public final boolean A09;
    public volatile C33381ge A0A;

    public C33401gg(Context context, C33391gf r8, AnonymousClass10A[] r9, File file) {
        this.A00 = r8;
        this.A0A = null;
        this.A01 = new AnonymousClass10U(context, file);
        this.A08 = new Random();
        this.A04 = new AnonymousClass25C();
        this.A06 = "main";
        this.A09 = true;
        this.A07 = new HashMap(2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AnonymousClass10A r0 : r9) {
            if (r0 != null) {
                arrayList2.add(r0);
            } else {
                throw null;
            }
        }
        this.A02 = (AnonymousClass10A[]) arrayList2.toArray(new AnonymousClass10A[arrayList2.size()]);
        this.A03 = (AnonymousClass10A[]) arrayList.toArray(new AnonymousClass10A[arrayList.size()]);
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            try {
                String[] list = file.list();
                if (list != null) {
                    for (String str : list) {
                        File file2 = new File(file, str);
                        if (file2.isDirectory()) {
                            A00(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
                file.delete();
            } catch (Exception e) {
                Log.e("ZipHelper", "failed to delete directory", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.io.File r10, java.lang.String r11, java.util.zip.ZipOutputStream r12) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33401gg.A01(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
    }

    @Override // X.AnonymousClass10X
    public void AHM(Throwable th) {
        this.A04.AHM(th);
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteAbort(long j, int i) {
        AnonymousClass10Z r2;
        String str;
        HashMap hashMap = this.A07;
        synchronized (hashMap) {
            Long valueOf = Long.valueOf(j);
            r2 = (AnonymousClass10Z) hashMap.get(valueOf);
            if (r2 != null) {
                hashMap.remove(valueOf);
            } else {
                throw new IllegalStateException("onTraceWriteAbort can't be called without onTraceWriteStart");
            }
        }
        this.A04.onTraceWriteAbort(j, i);
        StringBuilder sb = new StringBuilder("Trace is aborted with code: ");
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "controller_init";
                break;
            case 3:
                str = "missed_event";
                break;
            case 4:
                str = "timeout";
                break;
            case 5:
                str = "new_start";
                break;
            case 6:
                str = "condition_not_met";
                break;
            default:
                str = AnonymousClass008.A0F("UNKNOWN REASON ", i);
                break;
        }
        sb.append(str);
        Log.w("Profilo/TraceOrchestrator", sb.toString());
        AnonymousClass10H r0 = AnonymousClass10H.A07;
        if (r0 != null) {
            r0.A04(j, i);
            if (this.A09) {
                File file = r2.A01;
                if (file.exists()) {
                    File parentFile = file.getParentFile();
                    synchronized (this) {
                    }
                    if (!file.delete()) {
                        Log.e("Profilo/TraceOrchestrator", "Could not delete aborted trace");
                    }
                    A00(parentFile);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("No TraceControl when cleaning up aborted trace");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        throw r0;
     */
    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTraceWriteEnd(long r19) {
        /*
        // Method dump skipped, instructions count: 570
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33401gg.onTraceWriteEnd(long):void");
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteStart(long j, int i, String str) {
        Long valueOf;
        AnonymousClass10Z r0;
        HashMap hashMap = this.A07;
        synchronized (hashMap) {
            valueOf = Long.valueOf(j);
            r0 = (AnonymousClass10Z) hashMap.get(valueOf);
        }
        if (r0 == null) {
            this.A04.onTraceWriteStart(j, i, str);
            synchronized (hashMap) {
                hashMap.put(valueOf, new AnonymousClass10Z(i, new File(str)));
            }
            return;
        }
        throw new IllegalStateException("Trace already registered on start");
    }
}
