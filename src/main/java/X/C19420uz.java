package X;

import android.os.Process;

/* renamed from: X.0uz  reason: invalid class name and case insensitive filesystem */
public final class C19420uz extends Thread {
    public final /* synthetic */ C32181eT A00;

    public C19420uz(C32181eT r1) {
        this.A00 = r1;
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ((AbstractRunnableC19430v0) this.A00.A00.take()).run();
            } catch (InterruptedException unused) {
            }
        }
    }
}
