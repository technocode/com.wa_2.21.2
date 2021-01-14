package org.pjsip;

import X.AnonymousClass008;
import X.AnonymousClass3A5;
import X.AnonymousClass3A6;
import X.C09270cb;
import X.C677039w;
import X.C67943Bc;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class PjCameraInfo {
    public static final Comparator CAMERA_SIZE_COMPARATOR = C67943Bc.A00;
    public final int facing;
    public final int orient;
    public final int[] supportedFormat;
    public final int[] supportedSize;

    public PjCameraInfo(int i, int i2, int[] iArr, int[] iArr2) {
        this.facing = i;
        this.orient = i2;
        this.supportedSize = iArr;
        this.supportedFormat = iArr2;
    }

    public static int[] SizeListToIntArray(List list) {
        int[] iArr = new int[(list.size() << 1)];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass3A6 r2 = (AnonymousClass3A6) it.next();
            int i2 = i + 1;
            iArr[i] = r2.A01;
            i = i2 + 1;
            iArr[i2] = r2.A00;
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static PjCameraInfo createFromRawInfo(AnonymousClass3A5 r13) {
        int[] iArr;
        C09270cb A00 = C09270cb.A00();
        int[] iArr2 = r13.A05;
        int[] copyOf = Arrays.copyOf(iArr2, iArr2.length);
        int[] encoderSupportedColorFormats = getEncoderSupportedColorFormats(A00);
        boolean z = false;
        for (int i = 0; i < encoderSupportedColorFormats.length && !z; i++) {
            int i2 = encoderSupportedColorFormats[i];
            int i3 = 0;
            while (true) {
                if (i3 >= copyOf.length) {
                    break;
                } else if (copyOf[i3] == i2) {
                    copyOf[i3] = copyOf[0];
                    copyOf[0] = i2;
                    StringBuilder A0S = AnonymousClass008.A0S("voip/video/PJCameraInfo preferred formats ");
                    A0S.append(Arrays.toString(encoderSupportedColorFormats));
                    A0S.append(", ");
                    A0S.append(i2);
                    A0S.append(" is available .");
                    Log.i(A0S.toString());
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        boolean z2 = r13.A04;
        List list = r13.A03;
        Pair pair = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.isEmpty()) {
                int i4 = 640;
                int i5 = 480;
                if (C677039w.A00) {
                    i4 = 320;
                    i5 = 240;
                }
                SharedPreferences sharedPreferences = A00.A00;
                if (!sharedPreferences.getBoolean("disable_device_specific_camera_size", false) && (pair = deviceSpecificSize(z2)) != null) {
                    i4 = ((Number) pair.first).intValue();
                    i5 = ((Number) pair.second).intValue();
                }
                if (z2) {
                    if (sharedPreferences.contains("video_call_front_camera_width") || sharedPreferences.contains("video_call_front_camera_height")) {
                        i4 = sharedPreferences.getInt("video_call_front_camera_width", i4);
                        i5 = sharedPreferences.getInt("video_call_front_camera_height", i5);
                    }
                } else if (sharedPreferences.contains("video_call_back_camera_width") || sharedPreferences.contains("video_call_back_camera_height")) {
                    i4 = sharedPreferences.getInt("video_call_back_camera_width", i4);
                    i5 = sharedPreferences.getInt("video_call_back_camera_height", i5);
                }
                AnonymousClass3A6 r10 = r13.A02;
                AnonymousClass3A6 r102 = r10;
                if (r10 != null) {
                    int i6 = r10.A00 * r10.A01;
                    r102 = r10;
                    if (i6 <= 307200) {
                        r102 = arrayList.get(0);
                    }
                }
                Collections.sort(arrayList, CAMERA_SIZE_COMPARATOR);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((AnonymousClass3A6) it.next()).A01 == 720) {
                        it.remove();
                    }
                }
                int i7 = -1;
                int i8 = -1;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    AnonymousClass3A6 r1 = (AnonymousClass3A6) arrayList.get(i9);
                    if (r1.equals(r102)) {
                        i8 = i9;
                    }
                    if (r1.A01 == i4 && (i7 < 0 || Math.abs(r1.A00 - i5) < Math.abs(((AnonymousClass3A6) arrayList.get(i7)).A00 - i5))) {
                        i7 = i9;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (i7 >= 0) {
                    arrayList2.add(arrayList.get(i7));
                } else if (i8 >= 0) {
                    arrayList2.add(r102);
                } else {
                    arrayList2.addAll(arrayList);
                }
                if (!arrayList2.isEmpty() && pair == null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        AnonymousClass3A6 r3 = (AnonymousClass3A6) arrayList.get(i10);
                        if (r3.A01 * ((AnonymousClass3A6) arrayList2.get(0)).A00 == r3.A00 * ((AnonymousClass3A6) arrayList2.get(0)).A01) {
                            arrayList2.add(r3);
                        }
                    }
                }
                iArr = SizeListToIntArray(arrayList2);
                return new PjCameraInfo(z2 ? 1 : 0, r13.A01, iArr, copyOf);
            }
        }
        Log.i("voip/video/PJCameraInfo previewSizes is null, use 640x480 by default.");
        iArr = new int[]{640, 480};
        return new PjCameraInfo(z2 ? 1 : 0, r13.A01, iArr, copyOf);
    }

    public static Pair deviceSpecificSize(boolean z) {
        String str = Build.MANUFACTURER;
        if ("asus".equalsIgnoreCase(str)) {
            if (!z || Build.VERSION.SDK_INT != 19) {
                return null;
            }
            return new Pair(1024, 768);
        } else if ("samsung".equalsIgnoreCase(str)) {
            return new Pair(1280, 720);
        } else {
            return null;
        }
    }

    public static PjCameraInfo getCameraInfo(int i) {
        VoipCameraManager instance = VoipCameraManager.getInstance();
        if (i < 0 || i >= instance.getCameraCount()) {
            AnonymousClass008.A0u("voip/video/PJCameraInfo bad idx: ", i);
            return null;
        }
        AnonymousClass3A5 rawCameraInfo = instance.getRawCameraInfo(i);
        if (rawCameraInfo == null) {
            return null;
        }
        PjCameraInfo createFromRawInfo = createFromRawInfo(rawCameraInfo);
        StringBuilder sb = new StringBuilder("voip/video/PJCameraInfo camera ");
        sb.append(i);
        sb.append(" info: ");
        sb.append(createFromRawInfo);
        Log.i(sb.toString());
        return createFromRawInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r1.startsWith("hwG") != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r1.equalsIgnoreCase("ks01lte") == false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] getEncoderSupportedColorFormats(X.C09270cb r4) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.getEncoderSupportedColorFormats(X.0cb):int[]");
    }

    public static /* synthetic */ int lambda$static$2841(AnonymousClass3A6 r3, AnonymousClass3A6 r4) {
        int i = r3.A01;
        int i2 = r4.A01;
        if (i > i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        int i3 = r4.A00;
        int i4 = r3.A00;
        if (i3 == i4) {
            return 0;
        }
        return i3 < i4 ? -1 : 1;
    }

    public String toString() {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("facing ");
        if (this.facing == 0) {
            str = "back";
        } else {
            str = "front";
        }
        A0S.append(str);
        A0S.append(", orientation: ");
        A0S.append(this.orient);
        A0S.append(", returned preview formats: ");
        A0S.append(Arrays.toString(this.supportedFormat));
        A0S.append(", returned preview size: ");
        A0S.append(Arrays.toString(this.supportedSize));
        return A0S.toString();
    }
}
