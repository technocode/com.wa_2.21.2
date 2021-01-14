package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0z3  reason: invalid class name */
public class AnonymousClass0z3 {
    public static Set A04;
    public final CameraManager A00;
    public final C22170zz A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public AnonymousClass0z3(CameraManager cameraManager, C22170zz r3) {
        this.A00 = cameraManager;
        this.A01 = r3;
    }

    public AnonymousClass0VV A00(String str) {
        Map map = this.A03;
        AnonymousClass0VV r0 = (AnonymousClass0VV) map.get(str);
        if (r0 == null) {
            Number number = (Number) AnonymousClass0VQ.A00(str, this.A00).get(CameraCharacteristics.LENS_FACING);
            if (number == null || number.intValue() != 0) {
                r0 = AnonymousClass0VV.BACK;
            } else {
                r0 = AnonymousClass0VV.FRONT;
            }
            map.put(str, r0);
        }
        return r0;
    }

    public String A01(AnonymousClass0VV r10) {
        Map map = this.A02;
        String str = (String) map.get(r10);
        if (str != null) {
            return str;
        }
        try {
            CameraManager cameraManager = this.A00;
            String[] cameraIdList = cameraManager.getCameraIdList();
            for (String str2 : cameraIdList) {
                Object obj = AnonymousClass0VQ.A00(str2, cameraManager).get(CameraCharacteristics.LENS_FACING);
                if (obj != null) {
                    int i = 1;
                    if (r10 == AnonymousClass0VV.FRONT) {
                        i = 0;
                    }
                    if (obj.equals(Integer.valueOf(i))) {
                        map.put(r10, str2);
                        return str2;
                    }
                }
            }
            StringBuilder A0S = AnonymousClass008.A0S("Could not find Camera ID for Facing: ");
            A0S.append(r10.toString());
            throw new C21620z2(A0S.toString());
        } catch (CameraAccessException e) {
            StringBuilder A0S2 = AnonymousClass008.A0S("Could not get Camera Characteristics for Facing: ");
            A0S2.append(r10.toString());
            throw new C21620z2(A0S2.toString(), e);
        }
    }

    public boolean A02(Integer num) {
        Set set = A04;
        HashSet hashSet = set;
        if (set == null) {
            HashSet hashSet2 = new HashSet();
            CameraManager cameraManager = this.A00;
            for (String str : cameraManager.getCameraIdList()) {
                hashSet2.add(cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING));
            }
            A04 = hashSet2;
            hashSet = hashSet2;
        }
        return hashSet.contains(num);
    }
}
