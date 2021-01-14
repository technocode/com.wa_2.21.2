package com.whatsapp.voipcalling;

import X.AbstractC000400g;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass0A5;
import X.AnonymousClass0JG;
import X.AnonymousClass1VY;
import X.C000300f;
import X.C002101e;
import X.C015808q;
import X.C09270cb;
import android.content.SharedPreferences;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Arrays;
import org.wawebrtc.MediaCodecVideoEncoder;

public class JNIUtils {
    public static final String[] H264_BLACKLISTED_DEVICE_BOARD = {"sc7735s", "PXA19x8", "SC7727S", "sc7730s", "SC7715A", "full_oppo6750_15331", "mt6577", "hawaii", "java", "arima89_we_s_jb2", "arima82_w_s_kk", "capri", "mt6572", "P7-L10", "P7-L12"};
    public static final String[] H264_BLACKLISTED_DEVICE_HARDWARE = {"my70ds", "sc8830", "sc8830a", "samsungexynos7580"};
    public static volatile JNIUtils INSTANCE;
    public final AnonymousClass088 fMessageIO;
    public final AnonymousClass01I meManager;
    public final C015808q multiDeviceConfig;
    public int previousAudioSessionId = -1;
    public final C000300f serverProps;
    public final AnonymousClass03P systemServices;
    public final C09270cb voipSharedPreferences;
    public final AnonymousClass00G waContext;
    public final AnonymousClass0A5 waDebugBuildSharedPreferences;
    public final AnonymousClass03S waPermissionsHelper;
    public final AnonymousClass00D waSharedPreferences;
    public final AnonymousClass00T waWorkers;

    private boolean isH265SwCodecSupported() {
        return false;
    }

    public int isAudioVideoSwitchEnabled() {
        return 1;
    }

    public void uploadCrashLog(String str) {
    }

    public JNIUtils(AnonymousClass01I r2, AnonymousClass00G r3, AnonymousClass00T r4, AnonymousClass088 r5, C000300f r6, AnonymousClass03P r7, C015808q r8, AnonymousClass03S r9, AnonymousClass00D r10, C09270cb r11, AnonymousClass0A5 r12) {
        this.meManager = r2;
        this.waContext = r3;
        this.waWorkers = r4;
        this.fMessageIO = r5;
        this.serverProps = r6;
        this.systemServices = r7;
        this.multiDeviceConfig = r8;
        this.waPermissionsHelper = r9;
        this.waSharedPreferences = r10;
        this.voipSharedPreferences = r11;
        this.waDebugBuildSharedPreferences = r12;
    }

    public int allowAlternativeNetworkForAudioCall() {
        if (!this.waSharedPreferences.A00.getBoolean("voip_low_data_usage", false) && this.waSharedPreferences.A00.getInt("autodownload_cellular_mask", 1) != 0) {
            return 1;
        }
        return 0;
    }

    public int allowAlternativeNetworkForVideoCall() {
        if (!this.waSharedPreferences.A00.getBoolean("voip_low_data_usage", false) && (this.waSharedPreferences.A00.getInt("autodownload_cellular_mask", 1) & 4) != 0) {
            return 1;
        }
        return 0;
    }

    public synchronized int[] findAvailableAudioSamplingRate(int i) {
        return findAvailableAudioSamplingRate(new int[]{16000, 24000, 44100, 22050, 8000, 11025, 32000, 48000, 12000}, 2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d3, code lost:
        if (r33 > 64000) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0231, code lost:
        if (0 == 0) goto L_0x0255;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x036b A[LOOP:5: B:142:0x0369->B:143:0x036b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x037a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x035f A[EDGE_INSN: B:159:0x035f->B:141:0x035f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x014c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x014c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0128 A[LOOP:2: B:51:0x0126->B:52:0x0128, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] findAvailableAudioSamplingRate(int[] r31, int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 956
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.findAvailableAudioSamplingRate(int[], int, int):int[]");
    }

    public String getDebugDirectory() {
        this.fMessageIO.A04();
        return this.waContext.A00.getFilesDir().getAbsolutePath();
    }

    public boolean getDebugVoipRecordDecoderVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public boolean getDebugVoipRecordEncoderVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public boolean getDebugVoipRecordPreprocessedCaptureVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public boolean getDebugVoipRecordRawCaptureVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public boolean getDebugVoipRecordRawRenderVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public static JNIUtils getInstance() {
        if (INSTANCE == null) {
            synchronized (JNIUtils.class) {
                if (INSTANCE == null) {
                    INSTANCE = new JNIUtils(AnonymousClass01I.A00(), AnonymousClass00G.A01, C002101e.A00(), AnonymousClass088.A00(), C000300f.A00(), AnonymousClass03P.A00(), C015808q.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00(), C09270cb.A00(), AnonymousClass0A5.A00());
                }
            }
        }
        return INSTANCE;
    }

    public int getJoinableMilestoneVersion() {
        return this.serverProps.A06(AbstractC000400g.A3J);
    }

    public static int getSamplingHash(int i, int[] iArr, int i2, int i3) {
        int length = iArr.length;
        int[] iArr2 = new int[(length + 4)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i2;
        iArr2[length + 1] = i;
        iArr2[length + 2] = Build.VERSION.SDK_INT;
        iArr2[length + 3] = i3;
        return Arrays.hashCode(iArr2);
    }

    public String getSelfJid() {
        AnonymousClass01I r0 = this.meManager;
        r0.A04();
        return AnonymousClass1VY.A0D(r0.A03);
    }

    public final String getVoipCacheDirectory() {
        File cacheDir = this.waContext.A00.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, "voip");
            if (file.exists() || file.mkdirs()) {
                return file.getAbsolutePath();
            }
            Log.e("getVoipCacheDirectory could not init directory");
            return "";
        }
        Log.e("getVoipCacheDirectory Cache Directory is null");
        return "";
    }

    public int isCalleeMessageBufferEnabled() {
        return this.voipSharedPreferences.A00.getInt("call_enable_callee_message_buffer", 0);
    }

    public int isCallerMessageBufferEnabled() {
        return this.voipSharedPreferences.A00.getInt("call_enable_caller_message_buffer", 0);
    }

    public boolean isGcallCodecNegoFixEnabled() {
        return this.voipSharedPreferences.A00.getBoolean("enable_gcall_codec_nego_fix", false);
    }

    private boolean isH264HwCodecSupported() {
        if (Build.VERSION.SDK_INT < 19 || !AnonymousClass0JG.A09()) {
            return false;
        }
        if (Build.VERSION.RELEASE.equals("5.0.1")) {
            String str = Build.DEVICE;
            if (str.equalsIgnoreCase("jflte") || str.equalsIgnoreCase("jfvelte")) {
                return false;
            }
        }
        for (String str2 : H264_BLACKLISTED_DEVICE_BOARD) {
            if (Build.BOARD.equalsIgnoreCase(str2)) {
                return false;
            }
        }
        for (String str3 : H264_BLACKLISTED_DEVICE_HARDWARE) {
            if (Build.HARDWARE.equalsIgnoreCase(str3)) {
                return false;
            }
        }
        return true;
    }

    private boolean isH265HwCodecSupported() {
        return MediaCodecVideoEncoder.isH265HwSupported();
    }

    private synchronized H26xSupportResult isH26XCodecSupported() {
        return new H26xSupportResult(isH264HwCodecSupported(), false, MediaCodecVideoEncoder.isH265HwSupported(), false);
    }

    public synchronized H26xSupportResult isH26XCodecSupportedFromCache() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.voipSharedPreferences.A00;
        return (!sharedPreferences.contains("video_codec_h264_hw_supported") || !sharedPreferences.contains("video_codec_h264_sw_supported") || !sharedPreferences.contains("video_codec_h265_hw_supported") || !sharedPreferences.contains("video_codec_h265_sw_supported")) ? null : new H26xSupportResult(sharedPreferences.getBoolean("video_codec_h264_hw_supported", false), sharedPreferences.getBoolean("video_codec_h264_sw_supported", false), sharedPreferences.getBoolean("video_codec_h265_hw_supported", false), sharedPreferences.getBoolean("video_codec_h265_sw_supported", false));
    }

    public int isLowDataUsageEnabled() {
        return this.waSharedPreferences.A00.getBoolean("voip_low_data_usage", false) ? 1 : 0;
    }

    public boolean isMDCallEnabled() {
        return this.multiDeviceConfig.A03() && this.serverProps.A0D(AbstractC000400g.A1T);
    }

    public boolean isVidQualityManagerEnabled() {
        return this.voipSharedPreferences.A00.getBoolean("enable_vid_quality_manager", false);
    }

    public boolean isVideoConverterMemoryLeakFixEnabled() {
        return this.voipSharedPreferences.A01.A0E(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
    }

    public /* synthetic */ void lambda$updateH26XCodecSupported$811$JNIUtils() {
        this.voipSharedPreferences.A04(isH26XCodecSupported());
    }

    public synchronized void updateH26XCodecSupported(boolean z) {
        if (z) {
            this.waWorkers.ANF(new RunnableEBaseShape4S0100000_I0_4(this, 42));
        } else {
            this.voipSharedPreferences.A04(isH26XCodecSupported());
        }
    }

    public class H26xSupportResult {
        public final boolean isH264HwSupported;
        public final boolean isH264SwSupported;
        public final boolean isH265HwSupported;
        public final boolean isH265SwSupported;

        public H26xSupportResult(boolean z, boolean z2, boolean z3, boolean z4) {
            this.isH264HwSupported = z;
            this.isH264SwSupported = z2;
            this.isH265HwSupported = z3;
            this.isH265SwSupported = z4;
        }
    }
}
