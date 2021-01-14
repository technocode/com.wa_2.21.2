package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2EQ  reason: invalid class name */
public class AnonymousClass2EQ {
    public boolean A00;
    public boolean A01;
    public final int A02 = 9;
    public final TreeMap A03 = new TreeMap();
    public volatile AnonymousClass2EP A04;

    public final synchronized AnonymousClass2EP A00(long j) {
        AnonymousClass2EP r1;
        TreeMap treeMap = this.A03;
        Long valueOf = Long.valueOf(j);
        r1 = (AnonymousClass2EP) treeMap.get(valueOf);
        if (r1 == null) {
            r1 = new AnonymousClass2EP(true);
            treeMap.put(valueOf, r1);
        }
        return r1;
    }

    public synchronized void A01() {
        if (this.A04 != null) {
            this.A04.A00();
        }
        this.A04 = null;
    }

    public synchronized void A02() {
        if (this.A01) {
            TreeMap treeMap = this.A03;
            if (treeMap.size() > 9) {
                Long l = (Long) treeMap.firstKey();
                Object obj = treeMap.get(l);
                if (obj != null) {
                    ((AnonymousClass2EP) obj).A00();
                    treeMap.remove(l);
                } else {
                    throw null;
                }
            }
        }
    }

    public synchronized void A03(AnonymousClass2WQ r15) {
        int intValue;
        int intValue2;
        if (this.A01) {
            TreeMap treeMap = this.A03;
            ArrayList arrayList = new ArrayList(treeMap.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass2EP r5 = (AnonymousClass2EP) it.next();
                if (r15 != null) {
                    AtomicInteger atomicInteger = r5.A01;
                    if (atomicInteger.getAndIncrement() > 0 && r5.A02 != null) {
                        AnonymousClass2Wh r7 = r15.A01;
                        AtomicBoolean atomicBoolean = r15.A02;
                        AnonymousClass2WW r3 = r15.A00;
                        if (!atomicBoolean.get()) {
                            TotalCaptureResult totalCaptureResult = r5.A00;
                            Integer num = 0;
                            if (totalCaptureResult != null) {
                                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.LENS_STATE);
                                Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                                Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                Integer num5 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
                                if (num2 == null) {
                                    num2 = num;
                                }
                                if (num3 == null) {
                                    num3 = num;
                                }
                                if (num4 == null) {
                                    num4 = num;
                                }
                                if (num5 != null) {
                                    num = num5;
                                }
                                if (!(num2.intValue() == 1 || (intValue = num3.intValue()) == 1 || intValue == 5 || (intValue2 = num4.intValue()) == 3 || intValue2 == 1 || num.intValue() == 1)) {
                                    StringBuilder A0S = AnonymousClass008.A0S("cameraview/found-zsl-capture: ");
                                    A0S.append(atomicInteger);
                                    Log.i(A0S.toString());
                                    Image image = r5.A02;
                                    if (image != null) {
                                        r3.A00(r7.A0X(image), r7.A0V);
                                        atomicBoolean.set(true);
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    r5.A00();
                }
                r5.A00();
            }
            treeMap.clear();
        }
    }
}
