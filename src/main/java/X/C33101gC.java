package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1gC  reason: invalid class name and case insensitive filesystem */
public class C33101gC {
    public int A00 = 0;
    public C07070Vu A01 = new C07070Vu(0, 0);
    public boolean A02;
    public final Camera.PreviewCallback A03 = new C21440yk(this);
    public final Camera.PreviewCallback A04 = new C21450yl(this);
    public final C21120yD A05 = new C21120yD();
    public final ArrayList A06 = new ArrayList();
    public final HashMap A07 = new HashMap();

    public synchronized void A00() {
        this.A05.A00();
        this.A07.clear();
        this.A06.clear();
    }

    public synchronized void A01(Camera camera) {
        if (!AnonymousClass100.A01()) {
            camera.setPreviewCallbackWithBuffer(null);
            camera.setPreviewCallback(null);
            this.A02 = false;
        } else {
            throw new RuntimeException("Cannot disable listeners on the UI thread");
        }
    }

    public synchronized void A02(Camera camera, C07070Vu r11, int i) {
        int i2;
        if (AnonymousClass100.A01()) {
            throw new RuntimeException("Cannot enable listeners on the UI thread");
        } else if (!this.A02) {
            this.A00 = i;
            this.A01 = r11;
            HashMap hashMap = this.A07;
            if (!hashMap.isEmpty()) {
                camera.setPreviewCallback(null);
                int i3 = 0;
                int i4 = 0;
                for (Integer num : hashMap.values()) {
                    int intValue = num.intValue();
                    if (intValue > i4) {
                        i4 = intValue;
                    }
                }
                if (i != 842094169) {
                    i2 = ImageFormat.getBitsPerPixel(i) * r11.A01 * r11.A00;
                    if (i2 % 8 != 0) {
                        throw new IllegalStateException("Total bits for Frame should be a multiple of 8");
                    }
                } else {
                    int ceil = ((int) Math.ceil(((double) r11.A01) / 16.0d)) << 4;
                    int i5 = r11.A00;
                    i2 = (ceil * i5) + ((((((int) Math.ceil(((double) (ceil >> 1)) / 16.0d)) << 4) * i5) >> 1) << 1);
                }
                int i6 = i2 >> 3;
                ArrayList arrayList = this.A06;
                if (!arrayList.isEmpty()) {
                    if (((byte[]) arrayList.get(0)).length != i6) {
                        arrayList.clear();
                    }
                    int size = arrayList.size();
                    if (i4 > size) {
                        int i7 = i4 - size;
                        while (i3 < i7) {
                            arrayList.add(new byte[i6]);
                            i3++;
                        }
                    } else if (i4 < size) {
                        ArrayList arrayList2 = new ArrayList(i4);
                        while (i3 < i4) {
                            arrayList2.add(arrayList.get(i3));
                            i3++;
                        }
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                    }
                } else {
                    while (i3 < i4) {
                        arrayList.add(new byte[i6]);
                        i3++;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    camera.addCallbackBuffer((byte[]) it.next());
                }
                camera.setPreviewCallbackWithBuffer(this.A04);
            } else {
                camera.setPreviewCallbackWithBuffer(null);
                camera.setPreviewCallback(this.A03);
            }
            this.A02 = true;
        }
    }
}
