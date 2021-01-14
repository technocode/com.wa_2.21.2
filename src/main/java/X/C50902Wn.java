package X;

import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Wn  reason: invalid class name and case insensitive filesystem */
public class C50902Wn implements AbstractC19760vZ {
    public final /* synthetic */ LiteCameraView A00;

    public C50902Wn(LiteCameraView liteCameraView) {
        this.A00 = liteCameraView;
    }

    @Override // X.AbstractC19760vZ
    public void ADj(Exception exc) {
        StringBuilder sb = new StringBuilder("LiteCamera/onCameraError: ");
        sb.append(exc);
        Log.d(sb.toString());
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0E = false;
        if (!liteCameraView.A04) {
            liteCameraView.A04 = true;
            liteCameraView.pause();
            liteCameraView.AN6();
            return;
        }
        AnonymousClass2E5 r0 = liteCameraView.A00;
        if (r0 != null) {
            ((AnonymousClass2WY) r0).A02(1);
        }
    }

    @Override // X.AbstractC19760vZ
    public void ADm() {
        boolean contains;
        List list;
        Log.d("LiteCamera/onCameraInitialised");
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0E = true;
        liteCameraView.A04 = false;
        if (liteCameraView.AB5()) {
            if (liteCameraView.A03.isEmpty()) {
                liteCameraView.A03 = Collections.unmodifiableList(Arrays.asList("off", "on"));
                liteCameraView.A01();
            }
        } else if (liteCameraView.A02.isEmpty()) {
            if (!liteCameraView.AB5()) {
                ArrayList arrayList = new ArrayList(3);
                arrayList.add("off");
                TextureView$SurfaceTextureListenerC32431ew r8 = liteCameraView.A0B;
                int A002 = LiteCameraView.A00("on");
                AnonymousClass0VO A01 = r8.A01();
                boolean z = false;
                if (A01 == null) {
                    contains = false;
                } else {
                    List list2 = (List) A01.A00(AnonymousClass0VO.A0V);
                    if (list2 == null) {
                        contains = false;
                    } else {
                        contains = list2.contains(Integer.valueOf(AnonymousClass0N2.A02(A002)));
                    }
                }
                if (contains) {
                    arrayList.add("on");
                }
                int A003 = LiteCameraView.A00("auto");
                AnonymousClass0VO A012 = r8.A01();
                if (!(A012 == null || (list = (List) A012.A00(AnonymousClass0VO.A0V)) == null)) {
                    z = list.contains(Integer.valueOf(AnonymousClass0N2.A02(A003)));
                }
                if (z) {
                    arrayList.add("auto");
                }
                liteCameraView.A02 = Collections.unmodifiableList(arrayList);
                liteCameraView.A01();
            } else {
                throw new IllegalStateException("Cannot create back camera flash list while in front camera");
            }
        }
        if (!liteCameraView.getFlashModes().contains(liteCameraView.A01)) {
            liteCameraView.A01 = "off";
        }
        liteCameraView.A0B.A02(LiteCameraView.A00(liteCameraView.A01));
        AnonymousClass2E5 r0 = liteCameraView.A00;
        if (r0 != null) {
            ((AnonymousClass2WY) r0).A00();
        }
    }

    @Override // X.AbstractC19760vZ
    public void ADn(String str, String str2) {
        StringBuilder sb = new StringBuilder("LiteCamera/onCameraLocallyEvicted: ");
        sb.append(str);
        sb.append(">");
        sb.append(str2);
        Log.d(sb.toString());
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A0E = false;
        AnonymousClass2E5 r1 = liteCameraView.A00;
        if (r1 != null) {
            ((AnonymousClass2WY) r1).A02(2);
        }
    }

    @Override // X.AbstractC19760vZ
    public void ADp() {
        Log.d("LiteCamera/onCameraSwitched");
        LiteCameraView liteCameraView = this.A00;
        liteCameraView.A06.edit().putInt("camera_facing", liteCameraView.A0B.A00).apply();
    }
}
