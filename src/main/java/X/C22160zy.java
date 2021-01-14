package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0zy  reason: invalid class name and case insensitive filesystem */
public class C22160zy extends FutureTask {
    public final String A00;
    public final ArrayList A01 = new ArrayList();
    public final UUID A02;
    public final /* synthetic */ C22170zz A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22160zy(C22170zz r3, UUID uuid, Callable callable, String str) {
        super(callable);
        this.A03 = r3;
        if (str == null) {
            throw new NullPointerException("OpticFutureTask cannot have a null name.");
        } else if (uuid != null) {
            this.A02 = uuid;
            this.A00 = str;
        } else {
            throw new NullPointerException(AnonymousClass008.A0K("SessionId is null! Attempting to schedule task: ", str));
        }
    }

    public void done() {
        C22170zz r7 = this.A03;
        super.done();
        synchronized (this) {
            ArrayList arrayList = this.A01;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            try {
                Object obj = get();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.A03.A05(this.A02, new RunnableEBaseShape1S0310000_I1(true, arrayList2, (Exception) null, obj));
            } catch (CancellationException e) {
                this.A03.A05(this.A02, new RunnableEBaseShape1S0310000_I1(false, arrayList2, (Exception) e, (Object) null));
            } catch (InterruptedException | ExecutionException e2) {
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    this.A03.A05(this.A02, new RunnableEBaseShape1S0310000_I1(false, arrayList2, e2, (Object) null));
                } else if (r7.A04.getLooper().getThread() != Thread.currentThread()) {
                    if (!r7.A06) {
                        this.A03.A05(this.A02, new RunnableEBaseShape1S0310000_I1(false, arrayList2, e2, (Object) null));
                    } else {
                        C22100zr.A00();
                    }
                }
            }
            synchronized (this) {
            }
        }
    }

    public void run() {
        synchronized (this) {
        }
        super.run();
    }

    public boolean runAndReset() {
        synchronized (this) {
        }
        return super.runAndReset();
    }
}
