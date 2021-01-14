package org.wawebrtc;

import X.AnonymousClass008;
import X.AnonymousClass0JG;
import X.AnonymousClass1YV;
import X.AnonymousClass3C2;
import X.AnonymousClass3C3;
import X.AnonymousClass3C4;
import X.AnonymousClass3CE;
import X.AnonymousClass3CG;
import X.AnonymousClass3CH;
import X.AnonymousClass3X6;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoEncoder {
    public static final int DEQUEUE_TIMEOUT = 0;
    public static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7"};
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String[] H265_HW_EXCEPTION_MODELS = new String[0];
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int MIN_ENCODER_HEIGHT = 144;
    public static final int MIN_ENCODER_WIDTH = 176;
    public static final String TAG = "MediaCodecVideoEncoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedHwCodecPrefixes = new String[0];
    public static final Map cachedCodecCapabilites = new HashMap();
    public static int codecErrors;
    public static AnonymousClass3CG errorCallback;
    public static final String[] h264BlacklistedBuildHardware = {"sc8830", "sc8830a", "samsungexynos7580"};
    public static final String[] h265BlacklistedBuildHardware = new String[0];
    public static Set hwEncoderDisabledTypes = new HashSet();
    public static long lastReleaseTimestamp;
    public static MediaCodecVideoEncoder runningInstance;
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final int[] supportedSurfaceColorList = {2130708361};
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom."};
    public static final String[] trustedCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.google", "OMX.IMG."};
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public final Queue carryAlongInfos = new LinkedList();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public AnonymousClass3C3 drawer;
    public AnonymousClass3X6 eglBase;
    public final List freeInfos = new LinkedList();
    public int height;
    public ByteBuffer[] inputBuffers;
    public Surface inputSurface;
    public Bundle keyFrameRequestBundle = new Bundle();
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public ByteBuffer[] outputBuffers;
    public AnonymousClass3CH type;
    public int width;

    private void checkOnMediaCodecThread() {
    }

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long encodeTimeMs;
        public int index;
        public boolean isConfigData;
        public boolean isKeyFrame;
        public long timestamp;

        public void set(int i, ByteBuffer byteBuffer, boolean z, long j, long j2, int i2, boolean z2) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.timestamp = j;
            this.encodeTimeMs = j2;
            this.bitInfo = i2;
            this.isConfigData = z2;
        }
    }

    public MediaCodecVideoEncoder() {
        int i = 0;
        do {
            this.freeInfos.add(new AnonymousClass3CE());
            i++;
        } while (i < 10);
        this.keyFrameRequestBundle.putInt("request-sync", 0);
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception e) {
            Log.e(e);
            return null;
        }
    }

    public BufferInfo dequeueInputBuffer() {
        try {
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(0);
            if (dequeueInputBuffer < 0) {
                return null;
            }
            this.cachedInputBuffer.set(dequeueInputBuffer, getInputBuffer(dequeueInputBuffer), false, 0, 0, 0, false);
            return this.cachedInputBuffer;
        } catch (Throwable th) {
            Log.e(th);
            throw th;
        }
    }

    public BufferInfo dequeueOutputBuffer(int i) {
        try {
            MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, (long) i);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                int i2 = bufferInfo.flags;
                if ((i2 & 2) != 0) {
                    this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), false, 0, 0, 0, true);
                    return this.cachedOutputBuffer;
                }
                boolean z = false;
                if ((i2 & 1) != 0) {
                    z = true;
                }
                AnonymousClass3CE r2 = (AnonymousClass3CE) this.carryAlongInfos.remove();
                int i3 = r2.A00;
                this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), z, r2.A02, SystemClock.elapsedRealtime() - r2.A01, i3, false);
                this.freeInfos.add(r2);
                return this.cachedOutputBuffer;
            } else if (dequeueOutputBuffer == -3) {
                if (Build.VERSION.SDK_INT < 21) {
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                }
                return dequeueOutputBuffer(i);
            } else if (dequeueOutputBuffer == -2) {
                return dequeueOutputBuffer(i);
            } else {
                if (dequeueOutputBuffer == -1) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("dequeueOutputBuffer: ");
                sb.append(dequeueOutputBuffer);
                throw new RuntimeException(sb.toString());
            }
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder dequeueOutputBuffer failed", e);
            BufferInfo bufferInfo2 = this.cachedOutputBuffer;
            bufferInfo2.set(-1, null, false, -1, -1, 0, false);
            return bufferInfo2;
        }
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoEncoder H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoEncoder H.265 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoEncoder VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoEncoder VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public boolean encodeBuffer(boolean z, int i, int i2, long j, long j2, int i3) {
        AnonymousClass3CE r3;
        if (z) {
            try {
                if (supportForceKeyFrame()) {
                    Log.i("MediaCodecVideoEncoder Sync frame request");
                    this.mediaCodec.setParameters(this.keyFrameRequestBundle);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaCodecVideoEncoder encodeBuffer failed", e);
                return false;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.freeInfos.isEmpty()) {
            r3 = new AnonymousClass3CE(elapsedRealtime, j, i3);
        } else {
            r3 = (AnonymousClass3CE) this.freeInfos.remove(0);
            r3.A01 = elapsedRealtime;
            r3.A02 = j;
            r3.A00 = i3;
        }
        this.carryAlongInfos.add(r3);
        ByteBuffer inputBuffer = getInputBuffer(i);
        inputBuffer.position(0);
        inputBuffer.limit(i2);
        this.mediaCodec.queueInputBuffer(i, 0, i2, j2, 0);
        return true;
    }

    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        AnonymousClass3C2 r3;
        if (z) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    Log.i("MediaCodecVideoEncoder Sync frame request");
                    this.mediaCodec.setParameters(this.keyFrameRequestBundle);
                }
            } catch (RuntimeException e) {
                Log.e("MediaCodecVideoEncoder encodeTexture failed", e);
                return false;
            }
        }
        this.eglBase.A04();
        GLES20.glClear(16384);
        AnonymousClass3C3 r0 = this.drawer;
        int i2 = this.width;
        int i3 = this.height;
        Map map = r0.A00;
        if (map.containsKey("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n")) {
            r3 = (AnonymousClass3C2) map.get("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        } else {
            r3 = new AnonymousClass3C2();
            map.put("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", r3);
            AnonymousClass3C4 r2 = r3.A01;
            int i4 = r2.A00;
            if (i4 != -1) {
                GLES20.glUseProgram(i4);
                AnonymousClass1YV.A0G("glUseProgram");
                GLES20.glUniform1i(r2.A01("oes_tex"), 0);
                AnonymousClass1YV.A0G("Initialize fragment shader uniform values.");
                r2.A02("in_pos", AnonymousClass3C3.A01);
                r2.A02("in_tc", AnonymousClass3C3.A02);
            } else {
                throw new RuntimeException("The program has been released");
            }
        }
        int i5 = r3.A01.A00;
        if (i5 != -1) {
            GLES20.glUseProgram(i5);
            AnonymousClass1YV.A0G("glUseProgram");
            GLES20.glUniformMatrix4fv(r3.A00, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glViewport(0, 0, i2, i3);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            AnonymousClass3X6 r5 = this.eglBase;
            long nanos = TimeUnit.MICROSECONDS.toNanos(j);
            r5.A0A();
            EGLSurface eGLSurface = r5.A03;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGLExt.eglPresentationTimeANDROID(r5.A02, eGLSurface, nanos);
                EGL14.eglSwapBuffers(r5.A02, r5.A03);
                return true;
            }
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        throw new RuntimeException("The program has been released");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (X.AnonymousClass0JG.A0C(android.os.Build.HARDWARE, org.wawebrtc.MediaCodecVideoEncoder.h265BlacklistedBuildHardware) != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (X.AnonymousClass0JG.A0C(android.os.Build.HARDWARE, org.wawebrtc.MediaCodecVideoEncoder.h264BlacklistedBuildHardware) != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012c, code lost:
        if (r8.startsWith("OMX.google") != false) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List findHwEncoder(java.lang.String r28, java.lang.String[] r29, int[] r30, int r31, boolean r32) {
        /*
        // Method dump skipped, instructions count: 814
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.findHwEncoder(java.lang.String, java.lang.String[], int[], int, boolean):java.util.List");
    }

    private int getCodecKeyFrameInterval() {
        return AnonymousClass0JG.A0C(this.codecName, trustedCodecPrefixes) ? 4 : 2;
    }

    private int getDequeueOutputTimeout() {
        String str = this.codecName;
        boolean A0C = AnonymousClass0JG.A0C(str, trustedCodecPrefixes);
        if ("OMX.google.h264.encoder".equalsIgnoreCase(str)) {
            return 100;
        }
        if (A0C) {
            return 30;
        }
        return SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    private ByteBuffer getInputBuffer(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.mediaCodec.getInputBuffer(i);
        }
        return this.inputBuffers[i];
    }

    private ByteBuffer getOutputBuffer(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.mediaCodec.getOutputBuffer(i);
        }
        return this.outputBuffers[i];
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(X.AnonymousClass3CH r30, int r31, int r32, int r33, int r34, int r35, X.AnonymousClass3X5 r36) {
        /*
        // Method dump skipped, instructions count: 861
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.initEncode(X.3CH, int, int, int, int, int, X.3X5):boolean");
    }

    public boolean initH264Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(AnonymousClass3CH.VIDEO_CODEC_H264, i, i2, i3, i4, i5, null);
    }

    public boolean initH265Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(AnonymousClass3CH.VIDEO_CODEC_H265, i, i2, i3, i4, i5, null);
    }

    public static boolean isH264HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", null, null, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", null, supportedSurfaceColorList, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH265HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", null, null, -1, true) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH265HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", null, supportedSurfaceColorList, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp8HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, null, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, supportedSurfaceColorList, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, null, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, supportedSurfaceColorList, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static void printStackTrace() {
        Thread thread;
        StackTraceElement[] stackTrace;
        int length;
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (!(mediaCodecVideoEncoder == null || (thread = mediaCodecVideoEncoder.mediaCodecThread) == null || (length = (stackTrace = thread.getStackTrace()).length) <= 0)) {
            Log.i("MediaCodecVideoEncoder  stacks trace:");
            for (int i = 0; i < length; i++) {
                Log.i(stackTrace[i].toString());
            }
        }
    }

    public void release() {
        AnonymousClass008.A1U(AnonymousClass008.A0S("MediaCodecVideoEncoder Java releaseEncoder "), this.codecName);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new RunnableEBaseShape9S0200000_I1_4(this, countDownLatch, 39)).start();
        if (!AnonymousClass1YV.A0a(countDownLatch)) {
            Log.e("MediaCodecVideoEncoder Media encoder release timeout");
            codecErrors++;
        }
        this.codecName = null;
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        AnonymousClass3C3 r4 = this.drawer;
        if (r4 != null) {
            for (AnonymousClass3C2 r0 : r4.A00.values()) {
                AnonymousClass3C4 r2 = r0.A01;
                if (r2 != null) {
                    Log.i("GlShader Deleting shader.");
                    int i = r2.A00;
                    if (i != -1) {
                        GLES20.glDeleteProgram(i);
                        r2.A00 = -1;
                    }
                } else {
                    throw null;
                }
            }
            r4.A00.clear();
            this.drawer = null;
        }
        AnonymousClass3X6 r02 = this.eglBase;
        if (r02 != null) {
            r02.A05();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        lastReleaseTimestamp = SystemClock.uptimeMillis();
        Log.i("MediaCodecVideoEncoder Java releaseEncoder done");
    }

    public boolean releaseOutputBuffer(int i) {
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder releaseOutputBuffer failed", e);
            return false;
        }
    }

    public boolean resetEncoderOnFPSChanges() {
        return "OMX.Exynos.AVC.Encoder".equalsIgnoreCase(this.codecName);
    }

    public static void setErrorCallback(AnonymousClass3CG r1) {
        Log.i("MediaCodecVideoEncoder Set error callback");
        errorCallback = r1;
    }

    private boolean setRates(int i, int i2) {
        if (supportUpdateBitrate()) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", i * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
                this.mediaCodec.setParameters(bundle);
                return true;
            } catch (IllegalStateException e) {
                Log.e("MediaCodecVideoEncoder setRates failed", e);
            }
        }
        return false;
    }

    public boolean supportForceKeyFrame() {
        return Build.VERSION.SDK_INT >= 19 && !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportUpdateBitrate() {
        return Build.VERSION.SDK_INT >= 19 && !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }
}
