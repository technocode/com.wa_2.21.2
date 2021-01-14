package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0z8  reason: invalid class name and case insensitive filesystem */
public class C21670z8 {
    public static final int[] A00 = new int[0];

    public static List A00(int i, StreamConfigurationMap streamConfigurationMap) {
        Size[] sizeArr = null;
        if (i == 0) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
            return AnonymousClass0N2.A0w(sizeArr);
        } else if (i == 1) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(256);
            }
            return AnonymousClass0N2.A0w(sizeArr);
        } else if (i == 2) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            }
            return AnonymousClass0N2.A0w(sizeArr);
        } else if (i == 3) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(35);
            }
            return AnonymousClass0N2.A0w(sizeArr);
        } else {
            throw new RuntimeException(AnonymousClass008.A0F("Invalid supported size type: ", i));
        }
    }

    public static List A01(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static boolean A02(CameraCharacteristics cameraCharacteristics, int i) {
        int intValue = ((Number) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        return intValue == 2 ? i == intValue : intValue >= i;
    }
}
