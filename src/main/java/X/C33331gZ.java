package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;

/* renamed from: X.1gZ  reason: invalid class name and case insensitive filesystem */
public class C33331gZ extends AbstractC22030zj {
    public C33351gb A00;
    public C22000zg A01;

    public C33331gZ(Camera camera, Camera.Parameters parameters, C33351gb r4, C33361gc r5) {
        this.A00 = r4;
        this.A01 = new C22000zg(camera, parameters, r4, r5);
    }

    public void A00() {
        A02(super.A00.A00());
    }

    public void A01() {
        List list = (List) this.A00.A00(AnonymousClass0VO.A0W);
        int i = 4;
        if (!list.contains(4)) {
            i = 1;
            if (!list.contains(1)) {
                i = 6;
                if (!list.contains(6)) {
                    return;
                }
            }
        }
        super.A00.A01(AnonymousClass0VN.A0B, Integer.valueOf(i));
    }

    public void A02(C22020zi r42) {
        boolean z;
        String str;
        super.A00 = new C22010zh();
        C22000zg r2 = this.A01;
        C33361gc r17 = null;
        if (r2 != null) {
            try {
                r17 = (C33361gc) r2.A03.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("ParametersModificationApplier", "Could not clone the camera settings", e);
            }
            boolean z2 = r42.A0p;
            if (z2) {
                z = r2.A01(AnonymousClass0VN.A0B, Integer.valueOf(r42.A0A));
            } else {
                z = false;
            }
            boolean z3 = r42.A0U;
            if (z3) {
                z |= r2.A01(AnonymousClass0VN.A00, Integer.valueOf(r42.A04));
            }
            boolean z4 = r42.A0h;
            if (z4) {
                z |= r2.A01(AnonymousClass0VN.A05, Integer.valueOf(r42.A06));
            }
            boolean z5 = r42.A0b;
            if (z5) {
                z |= r2.A01(AnonymousClass0VN.A0K, Boolean.valueOf(r42.A0a));
            }
            boolean z6 = r42.A0d;
            if (z6) {
                z |= r2.A01(AnonymousClass0VN.A0L, Boolean.valueOf(r42.A0c));
            }
            boolean z7 = r42.A0n;
            if (z7) {
                z |= r2.A01(AnonymousClass0VN.A09, Integer.valueOf(r42.A09));
            }
            boolean z8 = r42.A0j;
            if (z8) {
                z |= r2.A01(AnonymousClass0VN.A07, Integer.valueOf(r42.A08));
            }
            boolean z9 = r42.A0o;
            if (z9) {
                z |= r2.A01(AnonymousClass0VN.A0A, r42.A0S);
            }
            boolean z10 = r42.A10;
            if (z10) {
                z |= r2.A01(AnonymousClass0VN.A0S, Integer.valueOf(r42.A0C));
            }
            boolean z11 = r42.A11;
            if (z11) {
                z |= r2.A01(AnonymousClass0VN.A0T, Integer.valueOf(r42.A0D));
            }
            boolean z12 = r42.A12;
            if (z12) {
                z |= r2.A01(AnonymousClass0VN.A0U, r42.A0N);
            }
            boolean z13 = r42.A13;
            if (z13) {
                z |= r2.A01(AnonymousClass0VN.A0V, r42.A0T);
            }
            boolean z14 = r42.A17;
            if (z14) {
                z |= r2.A01(AnonymousClass0VN.A0Y, Integer.valueOf(r42.A0F));
            }
            boolean z15 = r42.A18;
            if (z15) {
                z |= r2.A01(AnonymousClass0VN.A0Z, r42.A0O);
            }
            boolean z16 = r42.A19;
            if (z16) {
                z |= r2.A01(AnonymousClass0VN.A0a, Integer.valueOf(r42.A0G));
            }
            boolean z17 = r42.A1B;
            if (z17) {
                z |= r2.A01(AnonymousClass0VN.A0c, Integer.valueOf(r42.A0H));
            }
            boolean z18 = r42.A1A;
            if (z18) {
                z |= r2.A01(AnonymousClass0VN.A0b, r42.A1N);
            }
            boolean z19 = r42.A1C;
            if (z19) {
                z |= r2.A01(AnonymousClass0VN.A0e, r42.A0P);
            }
            boolean z20 = r42.A1F;
            if (z20) {
                z |= r2.A01(AnonymousClass0VN.A0g, Integer.valueOf(r42.A0I));
            }
            boolean z21 = r42.A1I;
            if (z21) {
                z |= r2.A01(AnonymousClass0VN.A0R, Boolean.valueOf(r42.A1H));
            }
            boolean z22 = r42.A1G;
            if (z22) {
                z |= r2.A01(AnonymousClass0VN.A0i, r42.A0Q);
            }
            boolean z23 = r42.A1J;
            if (z23) {
                z |= r2.A01(AnonymousClass0VN.A0j, Integer.valueOf(r42.A0J));
            }
            boolean z24 = r42.A1K;
            if (z24) {
                z |= r2.A01(AnonymousClass0VN.A0k, Integer.valueOf(r42.A0K));
            }
            boolean z25 = r42.A0y;
            if (z25) {
                z |= r2.A01(AnonymousClass0VN.A0P, Boolean.valueOf(r42.A0x));
            }
            boolean z26 = r42.A1E;
            if (z26) {
                z |= r2.A01(AnonymousClass0VN.A0f, Boolean.valueOf(r42.A1D));
            }
            boolean z27 = r42.A0s;
            if (z27) {
                z |= r2.A01(AnonymousClass0VN.A0C, Double.valueOf(r42.A00));
            }
            boolean z28 = r42.A0t;
            if (z28) {
                z |= r2.A01(AnonymousClass0VN.A0D, Double.valueOf(r42.A01));
            }
            boolean z29 = r42.A0u;
            if (z29) {
                z |= r2.A01(AnonymousClass0VN.A0E, Double.valueOf(r42.A02));
            }
            boolean z30 = r42.A0v;
            if (z30) {
                z |= r2.A01(AnonymousClass0VN.A0F, r42.A0R);
            }
            boolean z31 = r42.A0w;
            if (z31) {
                z |= r2.A01(AnonymousClass0VN.A0G, Long.valueOf(r42.A0M));
            }
            boolean z32 = r42.A16;
            if (z32) {
                z |= r2.A01(AnonymousClass0VN.A0W, Integer.valueOf(r42.A0E));
            }
            boolean z33 = r42.A0z;
            if (z33) {
                z |= r2.A01(AnonymousClass0VN.A0H, Integer.valueOf(r42.A0B));
            }
            if (z) {
                try {
                    r2.A01.setParameters(r2.A00);
                } catch (RuntimeException e2) {
                    Object[] objArr = new Object[4];
                    if (r17 != null) {
                        str = r17.A01();
                    } else {
                        str = "null";
                    }
                    objArr[0] = str;
                    objArr[1] = r2.A03.A01();
                    objArr[2] = r2.A00.flatten();
                    StringBuilder sb = new StringBuilder();
                    if (z2) {
                        sb.append("focusMode=");
                        sb.append(r42.A0A);
                    }
                    if (z3) {
                        sb.append(",antibanding=");
                        sb.append(r42.A04);
                    }
                    if (z4) {
                        sb.append(",colorEffect=");
                        sb.append(r42.A06);
                    }
                    if (z5) {
                        sb.append(",autoExposureLock=");
                        sb.append(r42.A0a);
                    }
                    if (z6) {
                        sb.append(",autoWhiteBalanceLock=");
                        sb.append(r42.A0c);
                    }
                    if (z7) {
                        sb.append(",flashMode=");
                        sb.append(r42.A09);
                    }
                    if (z8) {
                        sb.append(",exposureCompensation=");
                        sb.append(r42.A08);
                    }
                    if (z9) {
                        sb.append(",focusAreas=");
                        sb.append(C21990zf.A01(r42.A0S));
                    }
                    if (z10) {
                        sb.append(",jpegQuality=");
                        sb.append(r42.A0C);
                    }
                    if (z11) {
                        sb.append(",jpegThumbnailQuality=");
                        sb.append(r42.A0D);
                    }
                    if (z12) {
                        sb.append(",jpegThumbnailSize=");
                        C07070Vu r1 = r42.A0N;
                        sb.append(r1.A01);
                        sb.append('x');
                        sb.append(r1.A00);
                    }
                    if (z13) {
                        sb.append(",meteringAreas=");
                        sb.append(C21990zf.A01(r42.A0T));
                    }
                    if (z14) {
                        sb.append(",pictureFormat=");
                        sb.append(r42.A0F);
                    }
                    if (z15) {
                        sb.append(",pictureSize=");
                        C07070Vu r12 = r42.A0O;
                        sb.append(r12.A01);
                        sb.append('x');
                        sb.append(r12.A00);
                    }
                    if (z16) {
                        sb.append(",previewFormat=");
                        sb.append(r42.A0G);
                    }
                    if (z17) {
                        sb.append(",previewFrameRate=");
                        sb.append(r42.A0H);
                    }
                    if (z18) {
                        sb.append(",previewFrameRateRange=");
                        int[] iArr = r42.A1N;
                        sb.append(iArr[0]);
                        sb.append('-');
                        sb.append(iArr[1]);
                    }
                    if (z19) {
                        sb.append(",previewSize=");
                        C07070Vu r13 = r42.A0P;
                        sb.append(r13.A01);
                        sb.append('x');
                        sb.append(r13.A00);
                    }
                    if (z20) {
                        sb.append(",sceneMode=");
                        sb.append(r42.A0I);
                    }
                    if (z21) {
                        sb.append(",videoStabilizationEnabled=");
                        sb.append(r42.A1H);
                    }
                    if (r42.A15) {
                        sb.append(",opticalStabilizationEnabled=");
                        sb.append(r42.A14);
                    }
                    if (z22) {
                        sb.append(",videoSize=");
                        C07070Vu r14 = r42.A0Q;
                        sb.append(r14.A01);
                        sb.append('x');
                        sb.append(r14.A00);
                    }
                    if (z23) {
                        sb.append(",whiteBalance=");
                        sb.append(r42.A0J);
                    }
                    if (z24) {
                        sb.append(",zoom=");
                        sb.append(r42.A0K);
                    }
                    if (z25) {
                        sb.append(",hdrEnabled=");
                        sb.append(r42.A0x);
                    }
                    if (z26) {
                        sb.append(",recordingHint=");
                        sb.append(r42.A1D);
                    }
                    if (z27) {
                        sb.append(",gpsAltitude=");
                        sb.append(r42.A00);
                    }
                    if (z28) {
                        sb.append(",gpsLatitude=");
                        sb.append(r42.A01);
                    }
                    if (z29) {
                        sb.append(",gpsLongitude=");
                        sb.append(r42.A02);
                    }
                    if (z30) {
                        sb.append(",gpsProcessingMethod=");
                        sb.append(r42.A0R);
                    }
                    if (z31) {
                        sb.append(",gpsTimestamp=");
                        sb.append(r42.A0M);
                    }
                    if (z32) {
                        sb.append(",photoRotation=");
                        sb.append(r42.A0E);
                    }
                    if (z33) {
                        sb.append(",isoSensitivity=");
                        sb.append(r42.A0B);
                    }
                    if (r42.A0m) {
                        sb.append(",exposureTime=");
                        sb.append(r42.A0L);
                    }
                    if (r42.A0i) {
                        sb.append(",control3aMode=");
                        sb.append(r42.A07);
                    }
                    if (r42.A0V) {
                        sb.append(",aperture=");
                        sb.append(r42.A03);
                    }
                    if (r42.A0e) {
                        sb.append(",colorCorrectionGains=");
                        sb.append(r42.A1L);
                    }
                    if (r42.A0f) {
                        sb.append(",colorCorrectionMode=");
                        sb.append(r42.A05);
                    }
                    if (r42.A0g) {
                        sb.append(",colorCorrectionTransform=");
                        sb.append(r42.A1M);
                    }
                    if (r42.A0r) {
                        sb.append(",frameMetaDataEnabled=");
                        sb.append(r42.A0q);
                    }
                    if (r42.A0X) {
                        sb.append(",arCoreEnabled=");
                        sb.append(r42.A0W);
                    }
                    objArr[3] = sb.toString();
                    throw new RuntimeException(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", objArr), e2);
                }
            }
        } else {
            throw null;
        }
    }
}
