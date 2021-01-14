package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2AC  reason: invalid class name */
public final class AnonymousClass2AC extends AnonymousClass07C {
    public Boolean A00;
    public Float A01;
    public final int A02;
    public final int A03;

    public AnonymousClass2AC() {
        AtomicInteger atomicInteger = AnonymousClass1GL.A00;
        this.A02 = atomicInteger.incrementAndGet();
        this.A03 = atomicInteger.incrementAndGet();
    }
}
