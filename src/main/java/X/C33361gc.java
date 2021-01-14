package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1gc  reason: invalid class name and case insensitive filesystem */
public final class C33361gc extends AnonymousClass0VN implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C07070Vu A02;
    public C07070Vu A03;
    public C07070Vu A04;
    public C07070Vu A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Double A0A;
    public Double A0B;
    public Double A0C;
    public Float A0D;
    public Float A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H = 0;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q = 0;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Long A0U;
    public String A0V;
    public String A0W;
    public List A0X;
    public List A0Y;
    public final C33351gb A0Z;
    public final int[] A0a = new int[2];

    public C33361gc(Camera.Parameters parameters, C33351gb r7) {
        List emptyList;
        int i;
        List emptyList2;
        Camera.Size size;
        C07070Vu r0;
        Camera.Size size2;
        Boolean bool = Boolean.FALSE;
        this.A06 = bool;
        this.A07 = bool;
        this.A09 = bool;
        Double valueOf = Double.valueOf(0.0d);
        this.A0A = valueOf;
        this.A0C = valueOf;
        this.A0B = valueOf;
        this.A0U = 0L;
        this.A0N = 0;
        this.A0K = 0;
        this.A0W = parameters.flatten();
        this.A0Z = r7;
        this.A0J = Integer.valueOf(AnonymousClass0N2.A0K(parameters.getFocusMode()));
        this.A0F = Integer.valueOf(AnonymousClass0N2.A0H(parameters.getAntibanding()));
        this.A0G = Integer.valueOf(AnonymousClass0N2.A0I(parameters.getColorEffect()));
        if (((Boolean) r7.A00(AnonymousClass0VO.A01)).booleanValue()) {
            this.A06 = Boolean.valueOf(parameters.getAutoExposureLock());
        }
        if (((Boolean) r7.A00(AnonymousClass0VO.A03)).booleanValue()) {
            this.A07 = Boolean.valueOf(parameters.getAutoWhiteBalanceLock());
        }
        this.A0I = Integer.valueOf(AnonymousClass0N2.A0J(parameters.getFlashMode()));
        if (((Boolean) r7.A00(AnonymousClass0VO.A05)).booleanValue()) {
            this.A0H = Integer.valueOf(parameters.getExposureCompensation());
        }
        if (((Boolean) r7.A00(AnonymousClass0VO.A0E)).booleanValue()) {
            emptyList = C21980ze.A00(C21990zf.A03(parameters.get("focus-areas")));
        } else {
            emptyList = Collections.emptyList();
        }
        this.A0X = emptyList;
        this.A0D = Float.valueOf(parameters.getHorizontalViewAngle());
        this.A0E = Float.valueOf(parameters.getVerticalViewAngle());
        this.A0L = Integer.valueOf(parameters.getJpegQuality());
        try {
            i = parameters.getJpegThumbnailQuality();
        } catch (NumberFormatException e) {
            StringBuilder A0S2 = AnonymousClass008.A0S("Invalid jpeg thumbnail quality parameter string=");
            A0S2.append(parameters.get("jpeg-thumbnail-quality"));
            Log.e("ParametersHelper", A0S2.toString(), e);
            i = 85;
        }
        this.A0M = Integer.valueOf(i);
        try {
            Camera.Size jpegThumbnailSize = parameters.getJpegThumbnailSize();
            this.A02 = new C07070Vu(jpegThumbnailSize.width, jpegThumbnailSize.height);
        } catch (NumberFormatException unused) {
        }
        if (((Boolean) r7.A00(AnonymousClass0VO.A0F)).booleanValue()) {
            emptyList2 = C21980ze.A00(C21990zf.A03(parameters.get("metering-areas")));
        } else {
            emptyList2 = Collections.emptyList();
        }
        this.A0Y = emptyList2;
        this.A0O = Integer.valueOf(parameters.getPictureFormat());
        C07070Vu r3 = null;
        try {
            size = parameters.getPictureSize();
        } catch (NumberFormatException unused2) {
            size = null;
        }
        AnonymousClass0VP r4 = AnonymousClass0VN.A0Z;
        if (size != null) {
            r0 = new C07070Vu(size.width, size.height);
        } else {
            r0 = null;
        }
        A02(r4, r0);
        this.A0P = Integer.valueOf(parameters.getPreviewFormat());
        parameters.getPreviewFpsRange(this.A0a);
        if (!r7.A0U.isEmpty()) {
            this.A0Q = Integer.valueOf(parameters.getPreviewFrameRate());
        }
        this.A0R = Integer.valueOf(AnonymousClass0N2.A0L(parameters.getSceneMode()));
        this.A08 = Boolean.valueOf(parameters.getVideoStabilization());
        this.A0S = Integer.valueOf(AnonymousClass0N2.A0M(parameters.getWhiteBalance()));
        this.A0T = Integer.valueOf(parameters.getZoom());
        try {
            size2 = parameters.getPreviewSize();
        } catch (NumberFormatException unused3) {
            size2 = null;
        }
        A02(AnonymousClass0VN.A0e, size2 != null ? new C07070Vu(size2.width, size2.height) : r3);
    }

    public String A01() {
        String str;
        StringBuilder sb = new StringBuilder((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        sb.append("mFocusMode");
        sb.append('=');
        sb.append(this.A0J);
        sb.append(",mAntibanding");
        sb.append('=');
        sb.append(this.A0F);
        sb.append(",mColorEffect");
        sb.append('=');
        sb.append(this.A0G);
        sb.append(",mIsAutoExposureLock");
        sb.append('=');
        sb.append(this.A06);
        sb.append(",mIsAutoWhiteBalanceLock");
        sb.append('=');
        sb.append(this.A07);
        sb.append(",mFlashMode");
        sb.append('=');
        sb.append(this.A0I);
        sb.append(",mExposureCompensation");
        sb.append('=');
        sb.append(this.A0H);
        sb.append(",mFocusAreas");
        sb.append('=');
        sb.append(C21990zf.A01(this.A0X));
        sb.append(",mHorizontalViewAngle");
        sb.append('=');
        sb.append(this.A0D);
        sb.append(",mVerticalViewAngle");
        sb.append('=');
        sb.append(this.A0E);
        sb.append(",mJpegQuality");
        sb.append('=');
        sb.append(this.A0L);
        sb.append(",mJpegThumbnailQuality");
        sb.append('=');
        sb.append(this.A0M);
        sb.append(",mJpegThumbnailSize");
        sb.append('=');
        C07070Vu r3 = this.A02;
        String str2 = "null";
        if (r3 != null) {
            sb.append(r3.A01);
            sb.append('x');
            sb.append(r3.A00);
        } else {
            sb.append(str2);
        }
        sb.append(",mMeteringAreas");
        sb.append('=');
        sb.append(C21990zf.A01(this.A0Y));
        sb.append(",mPictureFormat");
        sb.append('=');
        sb.append(this.A0O);
        sb.append(",mPictureSize");
        sb.append('=');
        C07070Vu r32 = this.A03;
        if (r32 != null) {
            sb.append(r32.A01);
            sb.append('x');
            sb.append(r32.A00);
        } else {
            sb.append(str2);
        }
        sb.append(",mPreviewFormat");
        sb.append('=');
        sb.append(this.A0P);
        sb.append(",mPreviewFpsRange");
        sb.append('=');
        int[] iArr = this.A0a;
        sb.append(iArr[0]);
        sb.append('-');
        sb.append(iArr[1]);
        sb.append(",mPreviewSize");
        sb.append('=');
        C07070Vu r33 = this.A04;
        if (r33 != null) {
            sb.append(r33.A01);
            sb.append('x');
            sb.append(r33.A00);
        } else {
            sb.append(str2);
        }
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSceneMode");
        sb.append('=');
        sb.append(this.A0R);
        sb.append(",mIsVideoStabilizationEnabled");
        sb.append('=');
        sb.append(this.A08);
        sb.append(",mVideoSize");
        sb.append('=');
        C07070Vu r4 = this.A05;
        if (r4 != null) {
            sb.append(r4.A01);
            sb.append('x');
            sb.append(r4.A00);
        } else {
            sb.append(str2);
        }
        sb.append(",mWhiteBalance");
        sb.append('=');
        sb.append(this.A0S);
        sb.append(",mZoom");
        sb.append('=');
        sb.append(this.A0T);
        sb.append(",mPreviewRect");
        sb.append("=(");
        Rect rect = this.A01;
        if (rect != null) {
            str = rect.flattenToString();
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(')');
        sb.append(",mPictureRect");
        sb.append("=(");
        Rect rect2 = this.A00;
        if (rect2 != null) {
            str2 = rect2.flattenToString();
        }
        sb.append(str2);
        sb.append(')');
        sb.append(",mRecordingHint");
        sb.append('=');
        sb.append(this.A09);
        sb.append(",mGpsAltitude");
        sb.append('=');
        sb.append(this.A0A);
        sb.append(",mGpsLongitude");
        sb.append('=');
        sb.append(this.A0C);
        sb.append(",mGpsLatitude");
        sb.append('=');
        sb.append(this.A0B);
        sb.append(",mGpsProcessingMethod");
        sb.append('=');
        sb.append(this.A0V);
        sb.append(",mGpsTimestamp");
        sb.append('=');
        sb.append(this.A0U);
        sb.append(",mPhotoRotation");
        sb.append('=');
        sb.append(this.A0N);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSourceConfig");
        sb.append('=');
        sb.append(this.A0W);
        return sb.toString();
    }

    public void A02(AnonymousClass0VP r5, Object obj) {
        int i = r5.A00;
        Rect rect = null;
        int i2 = 0;
        switch (i) {
            case 0:
                this.A06 = (Boolean) obj;
                return;
            case 1:
                this.A07 = (Boolean) obj;
                return;
            case 2:
                if (((Boolean) this.A0Z.A00(AnonymousClass0VO.A07)).booleanValue()) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                        i2 = 17;
                    }
                    A02(AnonymousClass0VN.A0g, Integer.valueOf(i2));
                    if (booleanValue) {
                        A02(AnonymousClass0VN.A0f, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A08 = (Boolean) obj;
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
            case AnonymousClass0PW.A01:
            case 27:
            case 28:
            case 39:
            case 40:
            default:
                StringBuilder A0S2 = AnonymousClass008.A0S("Cannot directly set: ");
                A0S2.append(i);
                throw new RuntimeException(A0S2.toString());
            case 8:
                this.A09 = (Boolean) obj;
                return;
            case 9:
                this.A0J = (Integer) obj;
                return;
            case 10:
                this.A0I = (Integer) obj;
                return;
            case 11:
                this.A0F = (Integer) obj;
                return;
            case 12:
                this.A0G = (Integer) obj;
                return;
            case 13:
                this.A0H = (Integer) obj;
                return;
            case 14:
                this.A0L = (Integer) obj;
                return;
            case 15:
                this.A0M = (Integer) obj;
                return;
            case 17:
                this.A0O = (Integer) obj;
                return;
            case 18:
                this.A0P = (Integer) obj;
                return;
            case 19:
                this.A0Q = (Integer) obj;
                return;
            case 21:
                this.A0N = (Integer) obj;
                return;
            case 22:
                this.A0K = (Integer) obj;
                return;
            case 23:
                this.A0R = (Integer) obj;
                return;
            case 24:
                this.A0S = (Integer) obj;
                return;
            case 25:
                this.A0T = (Integer) obj;
                return;
            case 26:
                this.A0U = (Long) obj;
                return;
            case 29:
                this.A0A = (Double) obj;
                return;
            case 30:
                this.A0C = (Double) obj;
                return;
            case 31:
                this.A0B = (Double) obj;
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                C07070Vu r6 = (C07070Vu) obj;
                this.A04 = r6;
                if (r6 != null) {
                    rect = new Rect(0, 0, r6.A01, r6.A00);
                }
                this.A01 = rect;
                return;
            case 33:
                C07070Vu r62 = (C07070Vu) obj;
                this.A03 = r62;
                if (r62 != null) {
                    rect = new Rect(0, 0, r62.A01, r62.A00);
                }
                this.A00 = rect;
                return;
            case 34:
                this.A05 = (C07070Vu) obj;
                return;
            case 35:
                this.A02 = (C07070Vu) obj;
                return;
            case 36:
                this.A0X = C21980ze.A00((List) obj);
                return;
            case 37:
                this.A0Y = C21980ze.A00((List) obj);
                return;
            case 38:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0a;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case 41:
                this.A0V = (String) obj;
                return;
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }
}
