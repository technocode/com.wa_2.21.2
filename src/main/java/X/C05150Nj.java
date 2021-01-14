package X;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

/* renamed from: X.0Nj  reason: invalid class name and case insensitive filesystem */
public class C05150Nj {
    public final LinkedList A00 = new LinkedList();
    public final Set A01 = new HashSet();
    public final SynchronousQueue A02 = new SynchronousQueue();
    public final C05160Nk A03;

    public C05150Nj() {
        C05160Nk r0 = new C05160Nk(this);
        this.A03 = r0;
        r0.start();
    }
}
