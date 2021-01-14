package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.1HC  reason: invalid class name */
public class AnonymousClass1HC {
    public static final Charset A04 = Charset.forName("UTF-8");
    public final ByteBuffer A00;
    public final AtomicReferenceArray A01;
    public final AtomicReferenceArray A02;
    public final AnonymousClass1HB[] A03;

    public AnonymousClass1HC(ByteBuffer byteBuffer, AnonymousClass1HB[] r2, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        this.A00 = byteBuffer;
        this.A03 = r2;
        this.A01 = atomicReferenceArray;
        this.A02 = atomicReferenceArray2;
    }

    public AbstractC011306t A00(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A02;
        AbstractC011306t r0 = (AbstractC011306t) atomicReferenceArray.get(i);
        if (r0 != null) {
            return r0;
        }
        int i2 = (i << 4) + this.A03[1].A02;
        ByteBuffer byteBuffer = this.A00;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        byteBuffer.getInt(i2 + 8);
        byteBuffer.getInt();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i3);
        duplicate.limit(i3 + i4);
        byte[] bArr = new byte[duplicate.remaining()];
        duplicate.get(bArr);
        AbstractC011306t A0T = C008805h.A0T(new String(bArr, A04));
        if (atomicReferenceArray.compareAndSet(i, null, A0T)) {
            return A0T;
        }
        return (AbstractC011306t) atomicReferenceArray.get(i);
    }

    public AnonymousClass1HA A01(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A01;
        AnonymousClass1HA r0 = (AnonymousClass1HA) atomicReferenceArray.get(i);
        if (r0 != null) {
            return r0;
        }
        int i2 = (i << 4) + this.A03[0].A02;
        ByteBuffer byteBuffer = this.A00;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        byteBuffer.getInt(i2 + 8);
        byteBuffer.getInt(i2 + 12);
        AnonymousClass1HA r1 = new AnonymousClass1HA(this, i3, i4);
        if (atomicReferenceArray.compareAndSet(i, null, r1)) {
            return r1;
        }
        return (AnonymousClass1HA) atomicReferenceArray.get(i);
    }
}
