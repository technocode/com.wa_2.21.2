package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.178  reason: invalid class name */
public abstract class AnonymousClass178 {
    public static final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public AbstractC457025y A00(AbstractC457025y r6) {
        String str;
        if (this instanceof AnonymousClass263) {
            ((AnonymousClass263) this).A00.A02(r6);
            return r6;
        } else if (!(this instanceof C34881jN)) {
            throw new UnsupportedOperationException();
        } else {
            C34881jN r4 = (C34881jN) this;
            C236316w r2 = r6.A00;
            boolean z = false;
            if (r2 != null) {
                z = true;
            }
            C001801b.A1a(z, "This task can not be enqueued (it's probably a Batch or malformed)");
            boolean containsKey = r4.A0J.containsKey(r2);
            AnonymousClass16z r0 = r6.A01;
            if (r0 != null) {
                str = r0.A02;
            } else {
                str = "the API";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("GoogleApiClient is not configured to use ");
            sb.append(str);
            sb.append(" required for this call.");
            C001801b.A1a(containsKey, sb.toString());
            Lock lock = r4.A0L;
            lock.lock();
            try {
                AnonymousClass17Y r02 = r4.A03;
                if (r02 == null) {
                    r4.A0K.add(r6);
                    return r6;
                }
                r02.A47(r6);
                lock.unlock();
                return r6;
            } finally {
                lock.unlock();
            }
        }
    }

    public AbstractC457025y A01(AbstractC457025y r7) {
        String str;
        if (this instanceof AnonymousClass263) {
            ((AnonymousClass263) this).A00.A02(r7);
            return r7;
        } else if (!(this instanceof C34881jN)) {
            throw new UnsupportedOperationException();
        } else {
            C34881jN r5 = (C34881jN) this;
            C236316w r2 = r7.A00;
            boolean z = false;
            if (r2 != null) {
                z = true;
            }
            C001801b.A1a(z, "This task can not be executed (it's probably a Batch or malformed)");
            boolean containsKey = r5.A0J.containsKey(r2);
            AnonymousClass16z r0 = r7.A01;
            if (r0 != null) {
                str = r0.A02;
            } else {
                str = "the API";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("GoogleApiClient is not configured to use ");
            sb.append(str);
            sb.append(" required for this call.");
            C001801b.A1a(containsKey, sb.toString());
            Lock lock = r5.A0L;
            lock.lock();
            try {
                if (r5.A03 == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                } else if (r5.A0M) {
                    Queue queue = r5.A0K;
                    queue.add(r7);
                    while (!queue.isEmpty()) {
                        AbstractC457025y r22 = (AbstractC457025y) queue.remove();
                        C236817c r1 = r5.A0D;
                        r1.A02.add(r22);
                        r22.A0B.set(r1.A00);
                        r22.A0B(Status.A05);
                    }
                    return r7;
                } else {
                    AbstractC457025y A4A = r5.A03.A4A(r7);
                    lock.unlock();
                    return A4A;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public void A02() {
        if (!(this instanceof AnonymousClass263)) {
            C34881jN r5 = (C34881jN) this;
            Lock lock = r5.A0L;
            lock.lock();
            try {
                boolean z = false;
                if (r5.A06 >= 0) {
                    if (r5.A04 != null) {
                        z = true;
                    }
                    C001801b.A1b(z, "Sign-in mode should have been set explicitly by auto-manage.");
                } else {
                    Integer num = r5.A04;
                    if (num == null) {
                        r5.A04 = Integer.valueOf(C34881jN.A00(r5.A0J.values(), false));
                    } else if (num.intValue() == 2) {
                        throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                }
                int intValue = r5.A04.intValue();
                lock.lock();
                boolean z2 = true;
                if (!(intValue == 3 || intValue == 1 || intValue == 2)) {
                    z2 = false;
                }
                try {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(intValue);
                    C001801b.A1a(z2, sb.toString());
                    r5.A05(intValue);
                    r5.A0G.A08 = true;
                    r5.A03.connect();
                    lock.unlock();
                } finally {
                    lock.unlock();
                }
            } finally {
                lock.unlock();
            }
        } else {
            throw new UnsupportedOperationException(((AnonymousClass263) this).A01);
        }
    }

    public void A03() {
        boolean z;
        if (!(this instanceof AnonymousClass263)) {
            C34881jN r6 = (C34881jN) this;
            Lock lock = r6.A0L;
            lock.lock();
            try {
                Set set = r6.A0D.A02;
                BasePendingResult[] basePendingResultArr = (BasePendingResult[]) set.toArray(C236817c.A04);
                for (BasePendingResult basePendingResult : basePendingResultArr) {
                    basePendingResult.A0B.set(null);
                    synchronized (basePendingResult.A07) {
                        if (((AnonymousClass178) basePendingResult.A08.get()) == null || !basePendingResult.A05) {
                            basePendingResult.A04();
                        }
                        z = basePendingResult.A03;
                    }
                    if (z) {
                        set.remove(basePendingResult);
                    }
                }
                AnonymousClass17Y r0 = r6.A03;
                if (r0 != null) {
                    r0.A3k();
                }
                Set<AnonymousClass17O> set2 = r6.A0B.A00;
                for (AnonymousClass17O r02 : set2) {
                    r02.A02 = null;
                }
                set2.clear();
                Queue<AbstractC457025y> queue = r6.A0K;
                for (AbstractC457025y r1 : queue) {
                    r1.A0B.set(null);
                    r1.A04();
                }
                queue.clear();
                if (r6.A03 != null) {
                    r6.A07();
                    C238617w r12 = r6.A0G;
                    r12.A08 = false;
                    r12.A07.incrementAndGet();
                    lock.unlock();
                }
            } finally {
                lock.unlock();
            }
        } else {
            throw new UnsupportedOperationException(((AnonymousClass263) this).A01);
        }
    }

    public boolean A04() {
        if (!(this instanceof AnonymousClass263)) {
            AnonymousClass17Y r0 = ((C34881jN) this).A03;
            return r0 != null && r0.isConnected();
        }
        throw new UnsupportedOperationException(((AnonymousClass263) this).A01);
    }
}
