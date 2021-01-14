package X;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Ua  reason: invalid class name and case insensitive filesystem */
public class C72733Ua extends VoipPhysicalCamera {
    public static final int[] A0G = {2, 0, 1, 3};
    public int A00 = 0;
    public Point A01;
    public CameraCaptureSession A02;
    public CameraDevice A03;
    public Image A04;
    public Surface A05;
    public Object A06 = new Object();
    public ByteBuffer A07;
    public boolean A08 = false;
    public final int A09;
    public final CameraCharacteristics A0A;
    public final CameraDevice.StateCallback A0B = new AnonymousClass3A9(this);
    public final CameraManager A0C;
    public final ImageReader A0D;
    public final AnonymousClass00G A0E = AnonymousClass00G.A01;
    public final AnonymousClass3AF A0F;

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int getCameraStartMode() {
        return 0;
    }

    public C72733Ua(int i, int i2, int i3, int i4, int i5) {
        StringBuilder A0U = AnonymousClass008.A0U("voip/video/VoipCamera/create idx: ", i, ", size:", i2, "x");
        A0U.append(i3);
        A0U.append(", format: 0x");
        A0U.append(Integer.toHexString(i4));
        A0U.append(", fps * 1000: ");
        A0U.append(i5);
        A0U.append(", api 2, this ");
        A0U.append(this);
        Log.i(A0U.toString());
        CameraManager cameraManager = (CameraManager) this.A0E.A00.getSystemService("camera");
        if (cameraManager != null) {
            this.A0C = cameraManager;
            this.A09 = i;
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(Integer.toString(i));
                this.A0A = cameraCharacteristics;
                Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                if (obj != null) {
                    Number number = (Number) obj;
                    Object obj2 = this.A0A.get(CameraCharacteristics.LENS_FACING);
                    if (obj2 != null) {
                        AnonymousClass3AF r4 = new AnonymousClass3AF(i2, i3, i4, i5, ((Number) obj2).intValue() == 0, number.intValue(), i);
                        this.A0F = r4;
                        ImageReader newInstance = ImageReader.newInstance(r4.A05, r4.A02, r4.A00, 3);
                        this.A0D = newInstance;
                        if (newInstance != null) {
                            newInstance.setOnImageAvailableListener(new C677139x(this), this.cameraThreadHandler);
                            return;
                        }
                        throw new RuntimeException("Unable to create image reader");
                    }
                    throw null;
                }
                throw null;
            } catch (CameraAccessException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r2.equals("LIMITED") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r2.equals("LEVEL_3") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r2.equals("FULL") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2.equals("EXTERNAL") == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r2.equals("LEGACY") != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.lang.String r5, int r6) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72733Ua.A00(java.lang.String, int):boolean");
    }

    public final int A01() {
        Log.i("voip/video/VoipCamera/ starting camera");
        if (this.A03 == null || this.videoPort == null) {
            return -5;
        }
        createTexture();
        AnonymousClass39I r0 = this.textureHolder;
        if (r0 == null) {
            return -1;
        }
        SurfaceTexture surfaceTexture = r0.A01;
        AnonymousClass3AF r02 = this.A0F;
        surfaceTexture.setDefaultBufferSize(r02.A05, r02.A02);
        this.A05 = new Surface(this.textureHolder.A01);
        A02();
        try {
            CaptureRequest.Builder createCaptureRequest = this.A03.createCaptureRequest(1);
            createCaptureRequest.addTarget(this.A05);
            ImageReader imageReader = this.A0D;
            createCaptureRequest.addTarget(imageReader.getSurface());
            this.A03.createCaptureSession(Arrays.asList(this.A05, imageReader.getSurface()), new AnonymousClass3A8(this, createCaptureRequest), this.cameraThreadHandler);
            return 0;
        } catch (CameraAccessException e) {
            Log.e("startCaptureSessionOnCameraThread", e);
            return -2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r1.getRotation() == 2) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r5 = this;
            X.00G r0 = r5.A0E
            android.app.Application r1 = r0.A00
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L_0x003f
            android.view.Display r1 = r0.getDefaultDisplay()
            X.3AF r4 = r5.A0F
            int r0 = r4.A04
            int r0 = r0 % 180
            r3 = 0
            if (r0 != 0) goto L_0x001d
            r3 = 1
        L_0x001d:
            int r0 = r1.getRotation()
            if (r0 == 0) goto L_0x002b
            int r2 = r1.getRotation()
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r3 != r0) goto L_0x003a
            int r2 = r4.A05
            int r1 = r4.A02
        L_0x0032:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.A01 = r0
            return
        L_0x003a:
            int r2 = r4.A02
            int r1 = r4.A05
            goto L_0x0032
        L_0x003f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72733Ua.A02():void");
    }

    public void A03(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            for (Map.Entry entry : this.virtualCameras.entrySet()) {
                if (((VoipCamera) entry.getValue()).started) {
                    updateCameraCallbackCheck();
                    Image.Plane plane = acquireLatestImage.getPlanes()[0];
                    Image.Plane plane2 = acquireLatestImage.getPlanes()[1];
                    Image.Plane plane3 = acquireLatestImage.getPlanes()[2];
                    ((VoipCamera) entry.getValue()).framePlaneCallback(plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride());
                }
            }
            synchronized (this.A06) {
                Image image = this.A04;
                if (image != null) {
                    image.close();
                }
                this.A04 = acquireLatestImage;
            }
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int closeOnCameraThread() {
        boolean z = false;
        if (this.A00 == 0) {
            z = true;
        }
        AnonymousClass00E.A08(z, "closing camera while still open");
        AnonymousClass3AD r3 = this.cameraEventsDispatcher;
        Iterator it = r3.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass3AE) it.next()).AEG(r3.A01);
        }
        this.A0D.close();
        synchronized (this.A06) {
            Image image = this.A04;
            if (image != null) {
                image.close();
                this.A04 = null;
            }
        }
        return 0;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public Point getAdjustedPreviewSize() {
        return this.A01;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public AnonymousClass3AF getCameraInfo() {
        return this.A0F;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public AnonymousClass3AG getLastCachedFrame() {
        synchronized (this.A06) {
            Image image = this.A04;
            if (image == null) {
                return null;
            }
            int width = ((image.getWidth() * 3) * this.A04.getHeight()) / 2;
            ByteBuffer byteBuffer = this.A07;
            if (byteBuffer == null || byteBuffer.capacity() != width) {
                this.A07 = ByteBuffer.allocateDirect(width);
            }
            Image.Plane plane = this.A04.getPlanes()[0];
            Image.Plane plane2 = this.A04.getPlanes()[1];
            Image.Plane plane3 = this.A04.getPlanes()[2];
            VideoFrameConverter.convertAndroid420toI420(plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride(), this.A04.getWidth(), this.A04.getHeight(), this.A07);
            byte[] bArr = new byte[width];
            this.A07.rewind();
            this.A07.get(bArr);
            AnonymousClass3AG r2 = new AnonymousClass3AG();
            r2.A05 = bArr;
            AnonymousClass3AF r1 = this.A0F;
            r2.A03 = r1.A05;
            r2.A01 = r1.A02;
            r2.A00 = r1.A00;
            r2.A02 = r1.A04;
            r2.A04 = r1.A06;
            return r2;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int getLatestFrame(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("VoipCameraApi2 does not support this operation ATM");
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public void onFrameAvailableOnCameraThread() {
        boolean z = false;
        if (this.videoPort != null) {
            z = true;
        }
        AnonymousClass00E.A08(z, "videoport should not be null while receiving frames");
        AnonymousClass39I r3 = this.textureHolder;
        if (r3 != null) {
            VideoPort videoPort = this.videoPort;
            AnonymousClass3AF r0 = this.A0F;
            videoPort.renderTexture(r3, r0.A05, r0.A02);
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        int i;
        int i2;
        VideoPort videoPort2 = this.videoPort;
        if (videoPort2 == videoPort) {
            return 0;
        }
        StringBuilder A0S = AnonymousClass008.A0S("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
        if (videoPort != null) {
            i = videoPort.hashCode();
        } else {
            i = 0;
        }
        A0S.append(i);
        A0S.append(" from ");
        if (videoPort2 != null) {
            i2 = videoPort2.hashCode();
        } else {
            i2 = 0;
        }
        A0S.append(i2);
        A0S.append(", status: ");
        AnonymousClass008.A1L(A0S, this.A00);
        if (videoPort != null) {
            this.videoPort = videoPort;
            videoPort.setScaleType(0);
            int i3 = this.A00;
            if (i3 == 2) {
                if (videoPort2 != null) {
                    releaseTexture();
                }
                return A01();
            } else if (i3 == 0 || i3 == 1) {
                return startOnCameraThread();
            } else {
                return 0;
            }
        } else {
            stopOnCameraThread();
            this.videoPort = null;
            return 0;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int startOnCameraThread() {
        int i = this.A00;
        if (i == 2 || i == 3 || this.videoPort == null) {
            return 0;
        }
        if (i == 1) {
            Log.i("voip/video/VoipCamera/ Camera device is not fully closed, create camera device on close");
            this.A08 = true;
            return 0;
        }
        try {
            Log.i("voip/video/VoipCamera/ opening camera");
            this.A0C.openCamera(Integer.toString(this.A09), this.A0B, this.cameraThreadHandler);
            this.A00 = 3;
            return 0;
        } catch (CameraAccessException e) {
            Log.e("voip/video/VoipCamera/ failed to open camera ", e);
            return -4;
        } catch (IllegalArgumentException e2) {
            Log.e("voip/video/VoipCamera/ failed to open camera due to crashed HAL ", e2);
            return -4;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        CameraCaptureSession cameraCaptureSession = this.A02;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A02 = null;
        }
        CameraDevice cameraDevice = this.A03;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.A03 = null;
            this.A00 = 1;
        }
        Surface surface = this.A05;
        if (surface != null) {
            surface.release();
        }
        releaseTexture();
        return 0;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public void updatePreviewOrientation() {
        if (this.videoPort != null) {
            A02();
        }
    }
}
