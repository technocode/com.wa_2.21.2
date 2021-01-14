package X;

import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.25C  reason: invalid class name */
public class AnonymousClass25C implements AbstractC33411gh {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    @Override // X.AnonymousClass10X
    public void AHM(Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass10X) it.next()).AHM(th);
        }
    }

    @Override // X.AbstractC33411gh
    public void AIv() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC33411gh) it.next()).AIv();
        }
    }

    @Override // X.AbstractC33411gh
    public void AIw(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC33411gh) it.next()).AIw(i);
        }
    }

    @Override // X.AbstractC33411gh
    public void AL7(AnonymousClass10P r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC33411gh) it.next()).AL7(r3);
        }
    }

    @Override // X.AbstractC33411gh
    public void AL8(File file, long j) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC33411gh) it.next()).AL8(file, j);
        }
    }

    @Override // X.AbstractC33411gh
    public void AL9(int i, int i2, int i3, int i4) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC33411gh) it.next()).AL9(i, i2, i3, i4);
        }
    }

    @Override // X.AbstractC33411gh
    public void ALA(AnonymousClass10P r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC33411gh) it.next()).ALA(r3);
        }
    }

    @Override // X.AbstractC33411gh
    public void ALB(AnonymousClass10P r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC33411gh) it.next()).ALB(r3);
        }
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteAbort(long j, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((NativeTraceWriterCallbacks) it.next()).onTraceWriteAbort(j, i);
        }
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteEnd(long j) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((NativeTraceWriterCallbacks) it.next()).onTraceWriteEnd(j);
        }
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteStart(long j, int i, String str) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((NativeTraceWriterCallbacks) it.next()).onTraceWriteStart(j, i, str);
        }
    }
}
