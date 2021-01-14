package X;

import com.whatsapp.VideoFrameConverter;
import java.nio.ByteBuffer;

/* renamed from: X.2Wm  reason: invalid class name and case insensitive filesystem */
public class C50892Wm implements AbstractC46582Ea {
    public final /* synthetic */ AnonymousClass2EV A00;

    public C50892Wm(AnonymousClass2EV r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC46582Ea
    public AnonymousClass2EZ A4b() {
        AnonymousClass2EV r4 = this.A00;
        if (!r4.A08) {
            return null;
        }
        Object obj = r4.A06;
        synchronized (obj) {
            try {
                r4.A07 = true;
                while (!r4.A09 && r4.A08) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (!r4.A08) {
                    r4.A07 = false;
                } else {
                    AnonymousClass2EU r5 = r4.A02;
                    byte[] bArr = r5.A02;
                    if (bArr != null) {
                        AnonymousClass2EZ r1 = r4.A04;
                        r1.A02 = bArr;
                        r1.A01 = r5.A01;
                        r1.A00 = r5.A00;
                    } else if (r5.A03 != null) {
                        int[] iArr = AnonymousClass2EV.A0A;
                        int i = 480;
                        int i2 = 640;
                        for (int i3 : iArr) {
                            i2 = (r5.A01 * i3) / 8;
                            i = (i3 * r5.A00) / 8;
                            if (i2 >= 640 && i >= 480) {
                                break;
                            }
                        }
                        if (r4.A08) {
                            int i4 = i2 * i;
                            ByteBuffer byteBuffer = r4.A00;
                            if (byteBuffer == null || byteBuffer.capacity() != i4) {
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i4);
                                r4.A00 = allocateDirect;
                                AnonymousClass2EZ r12 = r4.A04;
                                r12.A02 = allocateDirect.array();
                                r12.A01 = i2;
                                r12.A00 = i;
                            }
                            C32441ex r0 = (C32441ex) r5.A03[0];
                            VideoFrameConverter.scalePlane(r0.A01, r0.A00, r5.A01, r5.A00, r4.A00, i2, i2, i);
                        } else {
                            r4.A07 = false;
                        }
                    }
                    return r4.A04;
                }
                obj.notify();
                return null;
            } finally {
                r4.A07 = false;
                obj.notify();
            }
        }
    }
}
