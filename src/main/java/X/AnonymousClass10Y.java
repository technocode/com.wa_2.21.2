package X;

import android.os.Process;
import com.facebook.profilo.writer.NativeTraceWriter;

/* renamed from: X.10Y  reason: invalid class name */
public class AnonymousClass10Y extends Thread {
    public final NativeTraceWriter A00;

    public AnonymousClass10Y(NativeTraceWriter nativeTraceWriter) {
        super("Prflo:Logger");
        this.A00 = nativeTraceWriter;
    }

    public void run() {
        Process.setThreadPriority(5);
        this.A00.loop();
    }
}
