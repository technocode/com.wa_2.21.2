package X;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.util.Range;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.0yt  reason: invalid class name and case insensitive filesystem */
public class CallableC21530yt implements Callable {
    public final /* synthetic */ C33171gJ A00;
    public final /* synthetic */ C22020zi A01;

    public CallableC21530yt(C33171gJ r1, C22020zi r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        AnonymousClass0VO r1;
        C33251gR r12;
        Range create;
        C33171gJ r4 = this.A00;
        if (r4.A0B == null || r4.A05 == null || r4.A0f == null || r4.A0D == null) {
            throw new IllegalStateException("Cannot modify settings, camera was closed.");
        }
        AnonymousClass0VM r0 = r4.A0B;
        AnonymousClass0VP r5 = AnonymousClass0VN.A0I;
        boolean booleanValue = ((Boolean) r0.A00(r5)).booleanValue();
        if (r4.A0B.A02(this.A01)) {
            C21780zJ r3 = r4.A0W;
            if (r3.A0P) {
                boolean booleanValue2 = ((Boolean) r4.A0B.A00(r5)).booleanValue();
                if (r4.A0A != null && booleanValue != booleanValue2) {
                    return r4.A0B;
                }
                r4.A0j = ((Boolean) r4.A0B.A00(AnonymousClass0VN.A0O)).booleanValue();
                r3.A05();
                AnonymousClass0N2.A12(r4.A05, r4.A0B, r4.A0D);
                AnonymousClass0N2.A14(r4.A05, r4.A0B, r4.A0D);
                AnonymousClass0N2.A16(r4.A05, r4.A0B, r4.A0D);
                AnonymousClass0N2.A15(r4.A05, r4.A0B, r4.A0D);
                CaptureRequest.Builder builder = r4.A05;
                if (r4.A0B == null || (r1 = r4.A0D) == null) {
                    throw new IllegalStateException("Trying to update builder for auto exposure lock after camera closed.");
                }
                if (((Boolean) r1.A00(AnonymousClass0VO.A01)).booleanValue()) {
                    builder.set(CaptureRequest.CONTROL_AE_LOCK, r4.A0B.A00(AnonymousClass0VN.A0K));
                }
                CaptureRequest.Builder builder2 = r4.A05;
                AnonymousClass0VM r13 = r4.A0B;
                if (r13 == null || r4.A0D == null) {
                    throw new IllegalStateException("Trying to update builder for preview frame rate after camera closed.");
                }
                int[] iArr = (int[]) r13.A00(AnonymousClass0VN.A0b);
                if (C21780zJ.A01((List) r4.A0D.A00(AnonymousClass0VO.A0b), iArr)) {
                    if (((Boolean) r4.A0D.A00(AnonymousClass0VO.A0P)).booleanValue()) {
                        create = Range.create(Integer.valueOf(iArr[0] / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS), Integer.valueOf(iArr[1] / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                    } else {
                        create = Range.create(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                    }
                    builder2.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, create);
                }
                AnonymousClass0N2.A09(r4.A0L, r4.A0f.getId(), r4.A05, r4.A0B, r4.A0D);
                AnonymousClass0N2.A13(r4.A05, r4.A0B, r4.A0D);
                CaptureRequest.Builder builder3 = r4.A05;
                AnonymousClass0VM r2 = r4.A0B;
                AnonymousClass0VO r02 = r4.A0D;
                if (r2 == null || r02 == null) {
                    throw new IllegalStateException("Trying to update builder for Control Mode after camera closed.");
                }
                CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
                AnonymousClass0VP r52 = AnonymousClass0VN.A06;
                builder3.set(key, r2.A00(r52));
                CaptureRequest.Builder builder4 = r4.A05;
                AnonymousClass0VM r7 = r4.A0B;
                AnonymousClass0VO r14 = r4.A0D;
                if (r7 == null || r14 == null) {
                    throw new IllegalStateException("Trying to update builder for iso after camera closed.");
                }
                if (((Boolean) r14.A00(AnonymousClass0VO.A08)).booleanValue() && (((Number) r7.A00(r52)).intValue() == 0 || ((Number) r7.A00(r52)).intValue() == 3)) {
                    builder4.set(CaptureRequest.SENSOR_SENSITIVITY, r7.A00(AnonymousClass0VN.A0H));
                }
                CaptureRequest.Builder builder5 = r4.A05;
                AnonymousClass0VM r72 = r4.A0B;
                AnonymousClass0VO r15 = r4.A0D;
                if (r72 == null || r15 == null) {
                    throw new IllegalStateException("Trying to update builder for exposure time after camera closed.");
                }
                if (((Boolean) r15.A00(AnonymousClass0VO.A06)).booleanValue() && (((Number) r72.A00(r52)).intValue() == 0 || ((Number) r72.A00(r52)).intValue() == 3)) {
                    builder5.set(CaptureRequest.SENSOR_EXPOSURE_TIME, r72.A00(AnonymousClass0VN.A08));
                }
                CaptureRequest.Builder builder6 = r4.A05;
                AnonymousClass0VM r73 = r4.A0B;
                AnonymousClass0VO r16 = r4.A0D;
                if (r73 == null || r16 == null) {
                    throw new IllegalStateException("Trying to update builder for aperture after camera closed.");
                }
                if (((Boolean) r16.A00(AnonymousClass0VO.A00)).booleanValue() && (((Number) r73.A00(r52)).intValue() == 0 || ((Number) r73.A00(r52)).intValue() == 3)) {
                    builder6.set(CaptureRequest.LENS_APERTURE, r73.A00(AnonymousClass0VN.A01));
                }
                CaptureRequest.Builder builder7 = r4.A05;
                AnonymousClass0VM r53 = r4.A0B;
                AnonymousClass0VO r03 = r4.A0D;
                if (r53 == null || r03 == null) {
                    throw new IllegalStateException("Trying to update builder for color correction mode after camera closed.");
                }
                AnonymousClass0W3 r8 = AnonymousClass0VO.A04;
                if (((Boolean) r03.A00(r8)).booleanValue()) {
                    builder7.set(CaptureRequest.COLOR_CORRECTION_MODE, r53.A00(AnonymousClass0VN.A03));
                }
                CaptureRequest.Builder builder8 = r4.A05;
                AnonymousClass0VM r17 = r4.A0B;
                AnonymousClass0VO r04 = r4.A0D;
                if (r17 == null || r04 == null) {
                    throw new IllegalStateException("Trying to update builder for color correction gains after camera closed.");
                }
                if (((Boolean) r04.A00(r8)).booleanValue() && ((Number) r17.A00(AnonymousClass0VN.A03)).intValue() == 0) {
                    float[] fArr = (float[]) r17.A00(AnonymousClass0VN.A02);
                    builder8.set(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(fArr[0], fArr[1], fArr[2], fArr[3]));
                }
                CaptureRequest.Builder builder9 = r4.A05;
                AnonymousClass0VM r18 = r4.A0B;
                AnonymousClass0VO r05 = r4.A0D;
                if (r18 == null || r05 == null) {
                    throw new IllegalStateException("Trying to update builder for color correction gains after camera closed.");
                }
                if (((Boolean) r05.A00(r8)).booleanValue() && ((Number) r18.A00(AnonymousClass0VN.A03)).intValue() == 0) {
                    builder9.set(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform((int[]) r18.A00(AnonymousClass0VN.A04)));
                }
                CaptureRequest.Builder builder10 = r4.A05;
                AnonymousClass0VM r19 = r4.A0B;
                AnonymousClass0VO r22 = r4.A0D;
                if (r19 == null || r22 == null) {
                    throw new IllegalStateException("Trying to update builder for antibanding mode after camera closed.");
                }
                Integer valueOf = Integer.valueOf(((Number) r19.A00(AnonymousClass0VN.A00)).intValue());
                if (((List) r22.A00(AnonymousClass0VO.A0Q)).contains(valueOf)) {
                    builder10.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, valueOf);
                }
                AnonymousClass0VM r23 = r3.A0A;
                if (!(r23 == null || (r12 = r3.A08) == null)) {
                    r12.A0D = ((Boolean) r23.A00(AnonymousClass0VN.A0M)).booleanValue();
                }
                r3.A04();
            }
        }
        return r4.A0B;
    }
}
