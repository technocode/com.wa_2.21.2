package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.28h  reason: invalid class name and case insensitive filesystem */
public class C461528h implements AbstractC33411gh {
    @Override // X.AnonymousClass10X
    public void AHM(Throwable th) {
    }

    @Override // X.AbstractC33411gh
    public void AL7(AnonymousClass10P r1) {
    }

    @Override // X.AbstractC33411gh
    public void AL8(File file, long j) {
    }

    @Override // X.AbstractC33411gh
    public void AL9(int i, int i2, int i3, int i4) {
    }

    @Override // X.AbstractC33411gh
    public void ALA(AnonymousClass10P r1) {
    }

    @Override // X.AbstractC33411gh
    public void ALB(AnonymousClass10P r1) {
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteAbort(long j, int i) {
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteEnd(long j) {
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteStart(long j, int i, String str) {
    }

    @Override // X.AbstractC33411gh
    public void AIv() {
        long nanoTime = System.nanoTime();
        Logger.writeBytesEntry(0, 1, 83, Logger.writeStandardEntry(0, 5, 22, nanoTime, 0, 0, 0, 0), "Profilo.ProvidersInitialized");
        Logger.writeStandardEntry(0, 5, 23, nanoTime, 0, 0, 0, 0);
    }

    @Override // X.AbstractC33411gh
    public void AIw(int i) {
        AnonymousClass10B r0 = ProvidersRegistry.A00;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = r0.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                if ((i2 & i) != 0) {
                    hashSet.add(next);
                }
                i2 <<= 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        Logger.writeBytesEntry(0, 1, 57, Logger.writeBytesEntry(0, 1, 56, Logger.writeStandardEntry(0, 7, 52, 0, 0, 8126514, 0, 0), "Active providers"), sb.toString());
    }
}
