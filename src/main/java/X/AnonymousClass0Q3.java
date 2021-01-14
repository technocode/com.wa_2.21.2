package X;

import com.whatsapp.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Q3  reason: invalid class name */
public class AnonymousClass0Q3 {
    public final AnonymousClass0Q6 A00;
    public final AnonymousClass0Q4 A01;
    public final AnonymousClass038 A02;
    public final C05600Pi A03;

    public AnonymousClass0Q3(C05600Pi r3, AnonymousClass038 r4) {
        AnonymousClass0Q4 r1 = new AnonymousClass0Q4();
        AnonymousClass0Q6 r0 = new AnonymousClass0Q6();
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r1;
        this.A00 = r0;
    }

    public int A00() {
        return this.A00.A02.size() + this.A01.A02.size();
    }

    public void A01() {
        long seconds;
        Integer num;
        Collection<Number> unmodifiableCollection;
        this.A00.A05();
        C05600Pi r3 = this.A03;
        if (r3.A01 == 2) {
            seconds = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()) * 3600;
        } else {
            seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        AnonymousClass038 r4 = this.A02;
        r4.A02(47, Long.valueOf(seconds), r3.A01);
        long seconds2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) / 86400;
        C05630Pl r8 = r3.A06;
        if (seconds2 != r8.A03) {
            int i = r3.A00;
            if (i == 0) {
                r8.A02 = 0;
                r8.A04 = false;
            } else if (new Random().nextInt(i) == 0) {
                r8.A02 = 0;
                r8.A04 = true;
            } else {
                r8.A02 = 0;
                r8.A04 = false;
            }
            r8.A03 = seconds2;
        }
        boolean z = r8.A04;
        if (z) {
            int i2 = r8.A02 + 1;
            if (i2 <= 0) {
                z = false;
                r8.A02 = 0;
                r8.A04 = false;
            }
            if (z) {
                r8.A02 = i2;
                num = Integer.valueOf(i2);
            } else {
                num = null;
            }
        } else {
            num = null;
        }
        r4.A02(3433, num, r3.A01);
        int i3 = r3.A01;
        if (i3 == 1 || i3 == 0) {
            unmodifiableCollection = Collections.unmodifiableCollection(r4.A00.A00.keySet());
        } else {
            unmodifiableCollection = Collections.unmodifiableCollection(r4.A01.A00.keySet());
        }
        for (Number number : unmodifiableCollection) {
            A02(number.intValue());
        }
        C05740Pw A3X = r3.A02.A3X();
        if (A3X.A03()) {
            for (Number number2 : Collections.unmodifiableCollection(A3X.A03.A00.keySet())) {
                A02(number2.intValue());
            }
            return;
        }
        throw new UnsupportedOperationException("No attribute codes available for rotated buffers");
    }

    public final void A02(int i) {
        AnonymousClass03N A002;
        AnonymousClass038 r3 = this.A02;
        C05600Pi r2 = this.A03;
        int i2 = r2.A01;
        if (i2 == 1 || i2 == 0) {
            A002 = r3.A00.A00(i);
        } else {
            A002 = r3.A01.A00(i);
        }
        C05740Pw A3X = r2.A02.A3X();
        if (A3X.A03()) {
            AnonymousClass03N A003 = A3X.A03.A00(i);
            AnonymousClass0Q6 r4 = this.A00;
            Map map = r4.A00;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf) && !A002.equals(A003)) {
                r4.A06(0, i, A002.A00);
                map.put(valueOf, A002);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("No attribute value available for rotated buffers");
    }

    public void A03(int i, byte[] bArr, int i2) {
        AnonymousClass0Q4 r4 = this.A01;
        r4.A05();
        r4.A06(1, i, Integer.valueOf(i2));
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (wrap.position() < wrap.limit()) {
            try {
                try {
                    AnonymousClass0Q2 A032 = C05760Py.A03(wrap);
                    r4.A06(2, A032.A00, A032.A02);
                } catch (BufferUnderflowException unused) {
                    throw new AnonymousClass2OG("Incomplete buffer");
                }
            } catch (AnonymousClass2OG e) {
                Log.e("EventSerialBuffer/putSerializedEvent Error adding serialized event to buffer", e);
            }
        }
        byte[] A012 = r4.A02.A01();
        int i3 = r4.A00;
        A012[i3] = (byte) (A012[i3] | 4);
    }

    public void A04(AnonymousClass00X r5, int i) {
        AnonymousClass0Q4 r3 = this.A01;
        r3.A05();
        r3.A06(1, r5.code, Integer.valueOf(i));
        r5.serialize(new AnonymousClass0Qr(this));
        byte[] A012 = r3.A02.A01();
        int i2 = r3.A00;
        A012[i2] = (byte) (A012[i2] | 4);
    }
}
