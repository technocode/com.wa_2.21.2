package org.wawebrtc;

import X.AnonymousClass008;
import X.AnonymousClass0JG;
import X.AnonymousClass1OG;
import X.AnonymousClass1YV;
import X.AnonymousClass3C6;
import X.AnonymousClass3C8;
import X.AnonymousClass3C9;
import X.AnonymousClass3CA;
import X.AnonymousClass3CB;
import X.AnonymousClass3CJ;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoDecoder {
    public static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final long MAX_DECODE_TIME_MS = 500;
    public static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String TAG = "MediaCodecVideoDecoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedDeviceBoard = new String[0];
    public static final String[] blacklistedHwCodecPrefixes = {"OMX.TI.DUCATI1.VIDEO.DECODER"};
    public static final Map cachedCodecCapabilites = new HashMap();
    public static int codecErrors;
    public static AnonymousClass3C9 errorCallback;
    public static Set hwDecoderDisabledTypes = new HashSet();
    public static long lastReleaseTimestamp;
    public static final String[] restartDecoderOnNewSpsPpsPrefixes = {"omx.mtk.", "OMX.SEC.avc.dec"};
    public static MediaCodecVideoDecoder runningInstance;
    public static final String[] spsBaselineProfileHackPrefixes = new String[0];
    public static final String[] spsBitstreamRestrictionsPrefixes = {"omx.qcom.", "omx.nvidia.", "omx.brcm.", "OMX.Exynos."};
    public static final String[] spsConstrainedHighProfilePrefixes = new String[0];
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public final Queue carryAlongInfos = new LinkedList();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public final Queue dequeuedSurfaceOutputBuffers = new LinkedList();
    public int droppedFrames;
    public final List freeInfos = new LinkedList();
    public boolean hasDecodedFirstFrame;
    public int height;
    public ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public boolean needsRestartDecoderOnNewSpsPps;
    public boolean needsSpsBaselineProfileHack;
    public boolean needsSpsBitstreamRestrictions;
    public boolean needsSpsConstrainedHighProfile;
    public boolean needsSpsPpsInCsd;
    public ByteBuffer[] outputBuffers;
    public int sliceHeight;
    public int stride;
    public Surface surface = null;
    public AnonymousClass3CA textureListener;
    public boolean useSurface;
    public int width;

    private void checkOnMediaCodecThread() {
    }

    private int getDequeueOutputTimeout() {
        return 20;
    }

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long decodeTimeMs;
        public long endDecodeTimeMs;
        public int index;
        public long ntpTimeStampMs;
        public long presentationTimeStampMs;
        public long timeStampMs;

        public void set(int i, ByteBuffer byteBuffer, long j, long j2, long j3, int i2, long j4, long j5) {
            this.index = i;
            this.buffer = byteBuffer;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.bitInfo = i2;
            this.decodeTimeMs = j4;
            this.endDecodeTimeMs = j5;
        }
    }

    public class DecodedTextureBuffer {
        public final long decodeTimeMs;
        public final long frameDelayMs;
        public final long ntpTimeStampMs;
        public final long presentationTimeStampMs;
        public final int textureID;
        public final long timeStampMs;
        public final float[] transformMatrix;

        public DecodedTextureBuffer(int i, float[] fArr, long j, long j2, long j3, long j4, long j5) {
            this.textureID = i;
            this.transformMatrix = fArr;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.frameDelayMs = j5;
        }
    }

    public MediaCodecVideoDecoder() {
        int i = 0;
        do {
            this.freeInfos.add(new AnonymousClass3C6());
            i++;
        } while (i < 10);
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (!this.dequeuedSurfaceOutputBuffers.isEmpty()) {
            throw null;
        }
    }

    private BufferInfo dequeueInputBuffer() {
        MediaCodec mediaCodec2 = this.mediaCodec;
        if (mediaCodec2 == null) {
            return null;
        }
        try {
            int dequeueInputBuffer = mediaCodec2.dequeueInputBuffer(500000);
            if (dequeueInputBuffer < 0) {
                return null;
            }
            this.cachedInputBuffer.set(dequeueInputBuffer, getInputBuffer(dequeueInputBuffer), 0, 0, 0, 0, 0, 0);
            return this.cachedInputBuffer;
        } catch (Throwable th) {
            Log.e(th);
            throw th;
        }
    }

    private BufferInfo dequeueOutputBuffer(int i) {
        int dequeueOutputBuffer;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.carryAlongInfos.isEmpty()) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
        while (true) {
            dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros((long) i));
            if (dequeueOutputBuffer != -3) {
                if (dequeueOutputBuffer != -2) {
                    break;
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                StringBuilder A0S = AnonymousClass008.A0S("MediaCodecVideoDecoder Decoder format changed: ");
                A0S.append(outputFormat.toString());
                Log.i(A0S.toString());
                AnonymousClass1OG A05 = AnonymousClass0JG.A05(outputFormat, this.codecName, null);
                int i6 = A05.A09;
                this.width = i6;
                int i7 = A05.A06;
                this.height = i7;
                this.stride = Math.max(i6, A05.A08);
                this.sliceHeight = Math.max(i7, A05.A07);
                int i8 = A05.A00;
                this.colorFormat = i8;
                this.colorId = getFrameConverterColorId(i8, A05.A05);
                this.cropLeft = 0;
                int i9 = this.width;
                this.cropRight = i9 - 1;
                this.cropTop = 0;
                this.cropBottom = this.height - 1;
                int i10 = A05.A02;
                if (i10 >= 0 && i10 < (i4 = A05.A08) && (i5 = A05.A03) >= 0 && i5 < i4 && i10 < i5) {
                    this.cropLeft = i10;
                    this.cropRight = i5;
                    int i11 = (i5 - i10) + 1;
                    if (i11 < i9) {
                        this.width = i11;
                        AnonymousClass008.A1M(AnonymousClass008.A0S("MediaCodecVideoDecoder Decoder format changed, use cropRight and cropLeft to calculate width "), i11);
                    }
                }
                int i12 = A05.A01;
                if (i12 >= 0 && i12 < (i2 = A05.A07) && (i3 = A05.A04) >= 0 && i3 < i2 && i3 < i12) {
                    this.cropTop = i3;
                    this.cropBottom = i12;
                    int i13 = (i12 - i3) + 1;
                    if (i13 < this.height) {
                        this.height = i13;
                        AnonymousClass008.A1M(AnonymousClass008.A0S("MediaCodecVideoDecoder Decoder format changed, use cropBottom and cropTop to calculate height "), i13);
                    }
                }
            } else if (Build.VERSION.SDK_INT < 21) {
                ByteBuffer[] outputBuffers2 = this.mediaCodec.getOutputBuffers();
                this.outputBuffers = outputBuffers2;
                AnonymousClass008.A1L(AnonymousClass008.A0S("MediaCodecVideoDecoder Decoder output buffers changed: "), outputBuffers2.length);
            }
        }
        if (dequeueOutputBuffer == -1) {
            return null;
        }
        this.hasDecodedFirstFrame = true;
        AnonymousClass3C6 r0 = (AnonymousClass3C6) this.carryAlongInfos.remove();
        long elapsedRealtime = SystemClock.elapsedRealtime() - r0.A01;
        ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
        outputBuffer.position(bufferInfo.offset);
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), r0.A03, r0.A02, r0.A00, elapsedRealtime, SystemClock.elapsedRealtime());
        this.freeInfos.add(r0);
        return this.cachedOutputBuffer;
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i) {
        if (this.useSurface) {
            BufferInfo dequeueOutputBuffer = dequeueOutputBuffer(i);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            throw null;
        }
        throw new IllegalStateException("dequeueTexture() called for byte buffer decoding.");
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoDecoder H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoDecoder H.265 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoDecoder VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoDecoder VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018c, code lost:
        if (r17.isFeatureSupported("adaptive-playback") == false) goto L_0x018e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List findDecoder(java.lang.String r23, java.lang.String[] r24, int r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 551
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.findDecoder(java.lang.String, java.lang.String[], int, boolean):java.util.List");
    }

    private int getFrameConverterColorId(int i, int i2) {
        Integer A01 = Voip.A01("vid_driver.decoder_frame_converter_color_format");
        String A06 = Voip.A06("vid_driver.decoder_name");
        Integer A012 = Voip.A01("vid_driver.decoder_color_format");
        return (A01 == null || A06 == null || A012 == null || !A06.equalsIgnoreCase(this.codecName) || i != A012.intValue()) ? i2 : A01.intValue();
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

    private boolean initDecode(AnonymousClass3CB r12, int i, int i2, AnonymousClass3CJ r15, byte[] bArr, byte[] bArr2) {
        String[] strArr;
        String str;
        if (this.mediaCodecThread == null) {
            boolean z = false;
            if (r15 != null) {
                z = true;
            }
            this.useSurface = z;
            if (r12 == AnonymousClass3CB.VIDEO_CODEC_VP8) {
                strArr = supportedVp8HwCodecPrefixes;
                str = "video/x-vnd.on2.vp8";
            } else if (r12 == AnonymousClass3CB.VIDEO_CODEC_VP9) {
                strArr = supportedVp9HwCodecPrefixes;
                str = "video/x-vnd.on2.vp9";
            } else if (r12 == AnonymousClass3CB.VIDEO_CODEC_H264) {
                strArr = null;
                str = "video/avc";
            } else if (r12 == AnonymousClass3CB.VIDEO_CODEC_H265) {
                strArr = null;
                str = "video/hevc";
            } else {
                StringBuilder sb = new StringBuilder("initDecode: Non-supported codec ");
                sb.append(r12);
                throw new RuntimeException(sb.toString());
            }
            boolean z2 = false;
            if (SystemClock.uptimeMillis() - lastReleaseTimestamp > 3000) {
                z2 = true;
            }
            try {
                List<AnonymousClass3C8> findDecoder = findDecoder(str, strArr, -1, z2);
                if (findDecoder == null || findDecoder.isEmpty()) {
                    AnonymousClass008.A17("MediaCodecVideoDecoder Can not find HW decoder for ", str);
                    return false;
                }
                runningInstance = this;
                this.mediaCodecThread = Thread.currentThread();
                this.freeInfos.addAll(this.carryAlongInfos);
                this.carryAlongInfos.clear();
                for (AnonymousClass3C8 r1 : findDecoder) {
                    StringBuilder sb2 = new StringBuilder("MediaCodecVideoDecoder Java initDecode: ");
                    sb2.append(r12);
                    sb2.append(" : ");
                    sb2.append(i);
                    sb2.append(" x ");
                    sb2.append(i2);
                    sb2.append(". Color: 0x");
                    int i3 = r1.A00;
                    sb2.append(Integer.toHexString(i3));
                    sb2.append(". Use Surface: ");
                    sb2.append(this.useSurface);
                    sb2.append(". Decoder: ");
                    String str2 = r1.A02;
                    AnonymousClass008.A1U(sb2, str2);
                    try {
                        this.codecName = str2;
                        this.width = i;
                        this.height = i2;
                        this.stride = i;
                        this.sliceHeight = i2;
                        this.cropLeft = 0;
                        this.cropRight = i - 1;
                        this.cropTop = 0;
                        this.cropBottom = i2 - 1;
                        if (!this.useSurface) {
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
                            if (bArr != null) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("MediaCodecVideoDecoder Java initDecode: csd-0 ");
                                sb3.append(Arrays.toString(bArr));
                                Log.i(sb3.toString());
                                createVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
                            }
                            if (bArr2 != null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("MediaCodecVideoDecoder Java initDecode: csd-1 ");
                                sb4.append(Arrays.toString(bArr2));
                                Log.i(sb4.toString());
                                createVideoFormat.setByteBuffer("csd-1", ByteBuffer.wrap(bArr2));
                            }
                            if (!this.useSurface) {
                                createVideoFormat.setInteger("color-format", i3);
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("MediaCodecVideoDecoder   Format: ");
                            sb5.append(createVideoFormat);
                            Log.i(sb5.toString());
                            MediaCodec createByCodecName = MediaCodecVideoEncoder.createByCodecName(str2);
                            this.mediaCodec = createByCodecName;
                            if (createByCodecName == null) {
                                Log.e("MediaCodecVideoDecoder Can not create media decoder");
                                return false;
                            }
                            createByCodecName.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                            this.mediaCodec.start();
                            AnonymousClass1OG A05 = AnonymousClass0JG.A05(createVideoFormat, this.codecName, null);
                            int i4 = A05.A00;
                            this.colorFormat = i4;
                            this.colorId = getFrameConverterColorId(i4, A05.A05);
                            if (Build.VERSION.SDK_INT < 21) {
                                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                                ByteBuffer[] inputBuffers2 = this.mediaCodec.getInputBuffers();
                                this.inputBuffers = inputBuffers2;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("MediaCodecVideoDecoder Input buffers: ");
                                sb6.append(inputBuffers2.length);
                                sb6.append(". Output buffers: ");
                                sb6.append(this.outputBuffers.length);
                                Log.i(sb6.toString());
                            }
                            this.hasDecodedFirstFrame = false;
                            this.dequeuedSurfaceOutputBuffers.clear();
                            this.droppedFrames = 0;
                            setDecoderFlags(r1);
                            return true;
                        }
                        throw null;
                    } catch (Throwable th) {
                        Log.e("MediaCodecVideoDecoder initDecode failed with Exception", th);
                    }
                }
                return false;
            } catch (Throwable th2) {
                Log.e("MediaCodecVideoDecoder Exception in findDecoder", th2);
                return false;
            }
        } else {
            throw new RuntimeException("initDecode: Forgot to release()?");
        }
    }

    private boolean initH264Decoder(int i, int i2, byte[] bArr, byte[] bArr2) {
        AnonymousClass3C8 r3 = null;
        try {
            List findDecoder = findDecoder("video/avc", null, -1, false);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                r3 = (AnonymousClass3C8) findDecoder.get(0);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(r3);
        return initDecode(AnonymousClass3CB.VIDEO_CODEC_H264, i, i2, null, bArr, bArr2);
    }

    private boolean initH265Decoder(int i, int i2, byte[] bArr, byte[] bArr2) {
        AnonymousClass3C8 r3 = null;
        try {
            List findDecoder = findDecoder("video/hevc", null, -1, true);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                r3 = (AnonymousClass3C8) findDecoder.get(0);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(r3);
        return initDecode(AnonymousClass3CB.VIDEO_CODEC_H265, i, i2, null, bArr, bArr2);
    }

    public static boolean isH264HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/avc") || findDecoder("video/avc", null, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH265HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/hevc") || findDecoder("video/hevc", null, -1, true) == null) {
            return false;
        }
        return true;
    }

    public static boolean isSoftwareCodec(String str) {
        return str.equalsIgnoreCase("OMX.google.h264.decoder") || str.toLowerCase(Locale.US).contains(".sw.");
    }

    public static boolean isVp8HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static void printStackTrace() {
        Thread thread;
        StackTraceElement[] stackTrace;
        int length;
        MediaCodecVideoDecoder mediaCodecVideoDecoder = runningInstance;
        if (!(mediaCodecVideoDecoder == null || (thread = mediaCodecVideoDecoder.mediaCodecThread) == null || (length = (stackTrace = thread.getStackTrace()).length) <= 0)) {
            Log.i("MediaCodecVideoDecoder MediaCodecVideoDecoder stacks trace:");
            for (int i = 0; i < length; i++) {
                Log.i(stackTrace[i].toString());
            }
        }
    }

    private boolean queueInputBuffer(int i, int i2, long j, long j2, int i3) {
        AnonymousClass3C6 r5;
        try {
            ByteBuffer inputBuffer = getInputBuffer(i);
            inputBuffer.position(0);
            inputBuffer.limit(i2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.freeInfos.isEmpty()) {
                r5 = new AnonymousClass3C6(elapsedRealtime, j, j2, i3);
            } else {
                r5 = (AnonymousClass3C6) this.freeInfos.remove(0);
                r5.A01 = elapsedRealtime;
                r5.A03 = j;
                r5.A02 = j2;
                r5.A00 = i3;
            }
            this.carryAlongInfos.add(r5);
            this.mediaCodec.queueInputBuffer(i, 0, i2, 1000 * elapsedRealtime, 0);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoDecoder decode failed", e);
            return false;
        }
    }

    private void release() {
        StringBuilder A0S = AnonymousClass008.A0S("MediaCodecVideoDecoder Java releaseDecoder ");
        A0S.append(this.codecName);
        A0S.append(". Total number of dropped frames: ");
        AnonymousClass008.A1L(A0S, this.droppedFrames);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new RunnableEBaseShape9S0200000_I1_4(this, countDownLatch, 38)).start();
        if (!AnonymousClass1YV.A0a(countDownLatch)) {
            Log.e("MediaCodecVideoDecoder Media decoder release timeout");
            codecErrors++;
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        lastReleaseTimestamp = SystemClock.uptimeMillis();
        if (this.useSurface) {
            this.surface.release();
            this.surface = null;
            throw null;
        }
        Log.i("MediaCodecVideoDecoder Java releaseDecoder done");
    }

    private void reset(int i, int i2) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw new RuntimeException("Incorrect reset call for non-initialized decoder.");
        }
        AnonymousClass008.A0y("MediaCodecVideoDecoder Java reset: ", i, " x ", i2);
        this.mediaCodec.flush();
        this.codecName = null;
        this.width = i;
        this.height = i2;
        this.freeInfos.addAll(this.carryAlongInfos);
        this.carryAlongInfos.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    private void returnDecodedOutputBuffer(int i) {
        if (!this.useSurface) {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        throw new IllegalStateException("returnDecodedOutputBuffer() called for surface decoding.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0160, code lost:
        if (android.os.Build.HARDWARE.matches("mt\\d+") == false) goto L_0x0162;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setDecoderFlags(X.AnonymousClass3C8 r9) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.setDecoderFlags(X.3C8):void");
    }

    public static void setErrorCallback(AnonymousClass3C9 r1) {
        Log.i("MediaCodecVideoDecoder Set error callback");
        errorCallback = r1;
    }
}
