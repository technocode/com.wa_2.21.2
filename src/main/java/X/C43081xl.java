package X;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Handler;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.whatsapp.bloks.BloksCameraOverlay;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.1xl  reason: invalid class name and case insensitive filesystem */
public class C43081xl extends AbstractC25311Gi {
    public static final C43081xl A0I = new C43081xl();
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public Camera A04;
    public MediaRecorder A05;
    public AnonymousClass05q A06;
    public AbstractC009505y A07;
    public BloksCameraOverlay A08;
    public AnonymousClass27q A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public final AnonymousClass02M A0G = AnonymousClass02M.A00();
    public final AnonymousClass00T A0H = C002101e.A00();

    public static final File A00(String str, boolean z) {
        StringBuilder A0Y;
        String str2;
        AnonymousClass1TL A002 = AnonymousClass1TL.A00();
        if (!TextUtils.isEmpty(str)) {
            return A002.A01(str);
        }
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        if (z) {
            A0Y = AnonymousClass008.A0Y("VID_", format);
            str2 = ".mp4";
        } else {
            A0Y = AnonymousClass008.A0Y("IMG_", format);
            str2 = ".png";
        }
        A0Y.append(str2);
        return A002.A01(A0Y.toString());
    }

    public final void A01() {
        MediaRecorder mediaRecorder = this.A05;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A05.release();
            this.A05 = null;
            this.A04.lock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r4.equals("video") == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        if (r4.equals("image") == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r4.equals("image_and_video") == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass05q r8, X.C46472Ap r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43081xl.A02(X.05q, X.2Ap):void");
    }

    public final void A03(C46472Ap r6, SurfaceView surfaceView) {
        CamcorderProfile camcorderProfile;
        if (this.A0E) {
            this.A05.stop();
            A01();
            this.A04.lock();
            this.A0E = false;
        } else {
            this.A05 = new MediaRecorder();
            this.A04.unlock();
            this.A05.setCamera(this.A04);
            this.A05.setVideoSource(1);
            if (CamcorderProfile.hasProfile(this.A00, 4)) {
                camcorderProfile = CamcorderProfile.get(this.A00, 4);
            } else if (CamcorderProfile.hasProfile(this.A00, 5)) {
                camcorderProfile = CamcorderProfile.get(this.A00, 5);
            } else {
                camcorderProfile = CamcorderProfile.get(this.A00, 1);
            }
            this.A05.setOutputFormat(camcorderProfile.fileFormat);
            this.A05.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A05.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A05.setVideoEncodingBitRate(256000);
            this.A05.setVideoEncoder(camcorderProfile.videoCodec);
            this.A05.setOutputFile(A00(r6.A06, true).getPath());
            this.A05.setOrientationHint(360 - this.A09.getDisplayOrientation());
            this.A05.setPreviewDisplay(surfaceView.getHolder().getSurface());
            try {
                this.A05.prepare();
                this.A05.start();
                this.A0E = true;
            } catch (IllegalStateException e) {
                StringBuilder A0S = AnonymousClass008.A0S("IllegalStateException preparing MediaRecorder: ");
                A0S.append(e.getMessage());
                Log.d(A0S.toString());
                A01();
                A01();
                new Handler().postDelayed(new RunnableEBaseShape7S0200000_I1_2(this, r6, 2), (long) Integer.parseInt(r6.A05));
            } catch (IOException e2) {
                StringBuilder A0S2 = AnonymousClass008.A0S("IOException preparing MediaRecorder: ");
                A0S2.append(e2.getMessage());
                Log.d(A0S2.toString());
                A01();
                A01();
                new Handler().postDelayed(new RunnableEBaseShape7S0200000_I1_2(this, r6, 2), (long) Integer.parseInt(r6.A05));
            }
        }
        new Handler().postDelayed(new RunnableEBaseShape7S0200000_I1_2(this, r6, 2), (long) Integer.parseInt(r6.A05));
    }
}
