package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Mp4Ops;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.0JG  reason: invalid class name */
public class AnonymousClass0JG implements AnonymousClass0JH {
    public static int A0J;
    public static String A0K;
    public static final byte[] A0L = {102, 116, 121, 112};
    public static final int[] A0M = {19, 20, 21, 39, 2141391872, 2130706688, 25, 2141391876, 2130706433, 2141391875, 2141391873, 11, 2130706944};
    public float A00 = 3.0f;
    public int A01 = 640;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public AnonymousClass1OG A06;
    public AnonymousClass1OK A07;
    public AnonymousClass2Mt A08;
    public AnonymousClass2TO A09;
    public File A0A;
    public File A0B;
    public File A0C;
    public byte[] A0D;
    public final AnonymousClass009 A0E;
    public final C000300f A0F;
    public final AnonymousClass00G A0G;
    public final File A0H;
    public volatile boolean A0I;

    public static int A02(int i) {
        switch (i) {
            case 11:
                return 7;
            case 21:
            case 39:
            case 2130706688:
            case 2141391873:
            case 2141391876:
                return 3;
            case 2130706433:
                return 6;
            case 2130706944:
                return 2;
            case 2141391872:
                return 4;
            case 2141391875:
                return 5;
            default:
                return 1;
        }
    }

    public AnonymousClass0JG(AnonymousClass00G r4, AnonymousClass009 r5, C000300f r6, File file, File file2, long j, long j2) {
        this.A0G = r4;
        this.A0E = r5;
        this.A0F = r6;
        this.A0B = file;
        this.A0H = file2;
        this.A02 = j;
        this.A03 = j2;
        if (j2 > 0 && j == j2) {
            StringBuilder A0V = AnonymousClass008.A0V("timeFrom:", j, " timeTo:");
            A0V.append(j2);
            throw new IllegalArgumentException(A0V.toString());
        }
    }

    public static float A00(int i, int i2) {
        return Math.max(2.0f, Math.min(10.0f, 153600.0f / ((float) (i * i2))));
    }

    public static synchronized int A01() {
        int i;
        synchronized (AnonymousClass0JG.class) {
            i = A0J;
            if (i == 0) {
                i = 1;
                String str = null;
                if (!A09()) {
                    i = 3;
                    StringBuilder sb = new StringBuilder();
                    sb.append("videotranscoder/istranscodesupported/unsupported model ");
                    sb.append(Build.MANUFACTURER);
                    sb.append("-");
                    sb.append(Build.MODEL);
                    Log.w(sb.toString());
                } else {
                    int codecCount = MediaCodecList.getCodecCount();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("videotranscoder/istranscodesupported/number of codecs: ");
                    sb2.append(codecCount);
                    Log.i(sb2.toString());
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        if (i2 < codecCount) {
                            if (z) {
                                break;
                            }
                            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                            if (codecInfoAt.isEncoder() && A0B(codecInfoAt.getName())) {
                                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                                int i3 = 0;
                                while (true) {
                                    if (i3 < supportedTypes.length) {
                                        if (z) {
                                            break;
                                        }
                                        if (supportedTypes[i3].equals("video/avc")) {
                                            z = true;
                                        }
                                        i3++;
                                    } else if (!z) {
                                    }
                                }
                                str = codecInfoAt.getName();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("videotranscoder/istranscodesupported/found ");
                                sb3.append(codecInfoAt.getName());
                                Log.i(sb3.toString());
                            }
                            i2++;
                        } else if (!z) {
                            i = 4;
                            Log.w("videotranscoder/istranscodesupported/no encoder found");
                        }
                    }
                }
                A08(str);
                A0J = i;
            }
        }
        return i;
    }

    public static int A03(MediaCodecInfo mediaCodecInfo) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        AnonymousClass008.A1L(AnonymousClass008.A0S("videotranscoder/transcode/color formats: "), capabilitiesForType.colorFormats.length);
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i >= iArr.length || i2 != 0) {
                return i2;
            }
            int i3 = iArr[i];
            if (!(i3 == 39 || i3 == 2130706688)) {
                switch (i3) {
                    case 19:
                    case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                    case 21:
                        break;
                    default:
                        AnonymousClass008.A0v("videotranscoder/transcode/skipping unsupported color format ", i3);
                        continue;
                        i++;
                }
            }
            if (!"OMX.SEC.avc.enc".equals(mediaCodecInfo.getName()) || i3 != 19) {
                i2 = i3;
                i++;
            } else {
                StringBuilder sb = new StringBuilder("videotranscoder/transcode/skipping ");
                sb.append(i3);
                sb.append(" for OMX.SEC.avc.enc");
                Log.i(sb.toString());
                i++;
            }
        }
        return i2;
    }

    public static MediaCodecInfo A04() {
        int codecCount = MediaCodecList.getCodecCount();
        AnonymousClass008.A0v("videotranscoder/transcode/number of codecs: ", codecCount);
        MediaCodecInfo mediaCodecInfo = null;
        for (int i = 0; i < codecCount && mediaCodecInfo == null; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder() && A0B(codecInfoAt.getName())) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 < supportedTypes.length) {
                        if (z) {
                            break;
                        }
                        if (supportedTypes[i2].equals("video/avc")) {
                            z = true;
                        }
                        i2++;
                    } else if (!z) {
                    }
                }
                mediaCodecInfo = codecInfoAt;
            }
        }
        return mediaCodecInfo;
    }

    public static AnonymousClass1OG A05(MediaFormat mediaFormat, String str, AnonymousClass1OK r6) {
        String str2;
        int i;
        StringBuilder sb = new StringBuilder("videotranscoder/transcode/getDecoderFormat output format has changed to ");
        sb.append(mediaFormat);
        Log.i(sb.toString());
        AnonymousClass1OG r2 = new AnonymousClass1OG();
        r2.A0A = str;
        r2.A00 = mediaFormat.getInteger("color-format");
        r2.A09 = mediaFormat.getInteger("width");
        r2.A06 = mediaFormat.getInteger("height");
        try {
            r2.A02 = mediaFormat.getInteger("crop-left");
        } catch (Exception unused) {
        }
        try {
            r2.A03 = mediaFormat.getInteger("crop-right");
        } catch (Exception unused2) {
        }
        try {
            r2.A04 = mediaFormat.getInteger("crop-top");
        } catch (Exception unused3) {
        }
        try {
            r2.A01 = mediaFormat.getInteger("crop-bottom");
        } catch (Exception unused4) {
        }
        try {
            r2.A07 = mediaFormat.getInteger("slice-height");
        } catch (Exception unused5) {
        }
        if (str.startsWith("OMX.Nvidia.")) {
            r2.A07 = ((r2.A06 + 16) - 1) & -16;
        } else if (str.equalsIgnoreCase("OMX.SEC.avc.dec")) {
            r2.A07 = r2.A06;
            r2.A08 = r2.A09;
        }
        try {
            r2.A08 = mediaFormat.getInteger("stride");
        } catch (Exception unused6) {
        }
        if (Build.VERSION.SDK_INT < 21 && r2.A01 == 1079 && r2.A06 == 1088 && A0A(str)) {
            Log.i("videotranscoder/transcode/decoder workaround samsung incorrect height");
            r2.A06 = 1080;
        }
        A08(str);
        if (r6 != null) {
            int i2 = r2.A00;
            String str3 = r6.A04;
            if (str3 != null && i2 > 0 && (i = r6.A00) > 0 && str3.equals(str) && i == i2) {
                StringBuilder A0S = AnonymousClass008.A0S("videotranscoder/parseDecoderFormat/forcing frame convert color id=");
                int i3 = r6.A02;
                AnonymousClass008.A1L(A0S, i3);
                r2.A05 = i3;
                return r2;
            }
        }
        int i4 = r2.A00;
        r2.A05 = A02(i4);
        if (i4 == 25) {
            if ("OMX.k3.video.encoder.avc".equals(str) || "OMX.k3.video.decoder.avc".equals(str)) {
                Log.i("videotranscoder/transcode/decoder color format for Huaiwei is VideoFrameConverter.FRAMECONV_COLOR_FORMAT_NV12");
                r2.A05 = 3;
                return r2;
            }
        } else if (i4 == 2141391876) {
            r2.A05 = 3;
            return r2;
        } else if (i4 == 2130706433 && ((str2 = A0K) == null || !str2.toLowerCase(Locale.US).startsWith("mt6589"))) {
            r2.A05 = 1;
            return r2;
        }
        return r2;
    }

    public static AnonymousClass1OG A06(String str, int i, int i2, int i3, int i4, int i5, int i6, AnonymousClass1OK r19) {
        String str2;
        int i7;
        int i8;
        AnonymousClass1OH r8 = AnonymousClass1OH.Horizontal;
        AnonymousClass1OH r5 = AnonymousClass1OH.None;
        AnonymousClass1OH r4 = AnonymousClass1OH.Vertical;
        AnonymousClass1OG r7 = new AnonymousClass1OG(i, i2, i3);
        r7.A0A = str;
        int i9 = (i4 - 1) ^ -1;
        int i10 = ((i6 + i4) - 1) & i9;
        int i11 = ((i5 + i4) - 1) & i9;
        float f = ((float) i2) / (((float) i3) + 0.0f);
        int i12 = r7.A09;
        if (i12 >= i11 && r7.A06 >= i10) {
            r8 = r5;
        } else if ((i12 >= i11 || r7.A06 < i10) && ((i12 >= i11 && r7.A06 < i10) || f > ((float) i11) / (((float) i10) + 0.0f))) {
            r8 = r4;
        }
        if (r8 != r5) {
            if (r8 == r4) {
                r7.A06 = i10;
                int i13 = (int) ((((float) (i10 - r7.A06)) * f) + ((float) i12));
                r7.A09 = i13;
                int i14 = (((i4 >> 1) + i13) - 1) & i9;
                r7.A09 = i14;
                r7.A09 = Math.max(i14, i11);
            } else {
                r7.A09 = i11;
                int i15 = (int) ((((float) (i11 - i12)) / f) + ((float) r7.A06));
                r7.A06 = i15;
                int i16 = (((i4 >> 1) + i15) - 1) & i9;
                r7.A06 = i16;
                r7.A06 = Math.max(i16, i10);
            }
            StringBuilder sb = new StringBuilder("videotranscoder/transcode/encoder parseEncoderFormat expand direction is ");
            sb.append(r8);
            sb.append(", input size: ");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append(", after expansion: ");
            sb.append(r7.A09);
            sb.append("x");
            AnonymousClass008.A1L(sb, r7.A06);
        }
        int i17 = i4 >> 1;
        int i18 = i9 & ((r7.A06 + i17) - 1);
        r7.A06 = i18;
        int i19 = i9 & ((i17 + r7.A09) - 1);
        r7.A09 = i19;
        if (str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && Build.MANUFACTURER.equals("motorola") && Build.VERSION.SDK_INT < 18 && (i8 = i19 * i18) > 306176) {
            double sqrt = Math.sqrt(306176.0d / ((double) i8));
            int i20 = (int) (sqrt * ((double) i19));
            r7.A09 = i20;
            int i21 = (int) (sqrt * ((double) i18));
            r7.A06 = i21;
            int i22 = i20 & -16;
            r7.A09 = i22;
            int i23 = i21 & -8;
            r7.A06 = i23;
            StringBuilder A0S = AnonymousClass008.A0S("videotranscoder/transcode/force frame dimensions for motorola to ");
            A0S.append(i22);
            A0S.append("x");
            AnonymousClass008.A1L(A0S, i23);
        }
        int i24 = r7.A09;
        r7.A08 = i24;
        int i25 = r7.A06;
        r7.A07 = i25;
        if (str.startsWith("OMX.Nvidia.")) {
            r7.A08 = ((i24 + 15) / 16) << 4;
            r7.A07 = ((i25 + 15) / 16) << 4;
        }
        A08(str);
        if (r19 == null || (str2 = r19.A05) == null || i <= 0 || (i7 = r19.A01) <= 0 || !str2.equals(str) || i7 != i) {
            r7.A05 = A02(i);
            int i26 = Build.VERSION.SDK_INT;
            if (i26 == 16 && r7.A00 == 21) {
                String str3 = Build.MODEL;
                if (!str3.equals("GT-N7000") && !str3.equals("SAMSUNG-SGH-I777") && !str3.startsWith("GT-I9100") && !str3.startsWith("SHV-E210") && "OMX.SEC.avc.enc".equals(str)) {
                    r7.A05 = 4;
                    Log.i("videotranscoder/transcode/encoder workaround wrong color format for samsung to FRAMECONV_COLOR_FORMAT_NV21");
                    return r7;
                }
            }
            if ((i26 == 16 || i26 == 17) && i == 21 && ("OMX.k3.video.encoder.avc".equals(str) || "OMX.k3.video.decoder.avc".equals(str))) {
                r7.A05 = 4;
                Log.i("videotranscoder/transcode/encoder workaround wrong color format for huawei to FRAMECONV_COLOR_FORMAT_NV21");
                return r7;
            }
            String str4 = A0K;
            if (str4 != null && str4.toLowerCase(Locale.US).startsWith("mt6572")) {
                r7.A05 = 2;
                Log.i("workaround wrong color format for mt6572 to FRAMECONV_COLOR_FORMAT_YV12");
                return r7;
            }
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S("videotranscoder/parseEncoderFormat/forcing frame conver color id=");
            int i27 = r19.A03;
            AnonymousClass008.A1L(A0S2, i27);
            r7.A05 = i27;
        }
        return r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A07(java.lang.String r4) {
        /*
            java.lang.String r3 = ""
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ IOException -> 0x003e }
            r1 = 0
            java.lang.String r0 = "/system/bin/getprop"
            r2[r1] = r0     // Catch:{ IOException -> 0x003e }
            r1 = 1
            r2[r1] = r4     // Catch:{ IOException -> 0x003e }
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x003e }
            r0.<init>(r2)     // Catch:{ IOException -> 0x003e }
            java.lang.ProcessBuilder r0 = r0.redirectErrorStream(r1)     // Catch:{ IOException -> 0x003e }
            java.lang.Process r2 = r0.start()     // Catch:{ IOException -> 0x003e }
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x003e }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003e }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003e }
            r1.<init>(r0)     // Catch:{ IOException -> 0x003e }
        L_0x0028:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            r3 = r0
            goto L_0x0028
        L_0x0030:
            r1.close()
            r2.destroy()
            return r3
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
            r1 = move-exception
            java.lang.String r0 = "getsystemproperty/"
            com.whatsapp.util.Log.w(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JG.A07(java.lang.String):java.lang.String");
    }

    public static void A08(String str) {
        if (A0K == null && "OMX.MTK.VIDEO.ENCODER.AVC".equals(str)) {
            String A072 = A07("ro.board.platform");
            A0K = A072;
            if (TextUtils.isEmpty(A072)) {
                A0K = A07("ro.mediatek.platform");
            }
            AnonymousClass008.A1U(AnonymousClass008.A0S("videotranscoder/setHwBoardPlatform/board/"), A0K);
        }
    }

    public static boolean A09() {
        int i = Build.VERSION.SDK_INT;
        if (i == 16 && Build.MANUFACTURER.equals("samsung")) {
            String str = Build.MODEL;
            if (str.equals("GT-P3100") || str.equals("GT-P3110") || str.equals("GT-P3113") || str.equals("GT-P5100") || str.equals("GT-P5110") || str.equals("GT-P5113") || str.equals("GT-I9100G") || str.startsWith("GT-I8550") || str.startsWith("GT-I8552") || str.startsWith("GT-I8262") || str.startsWith("GT-I8260") || str.startsWith("GT-S6310") || str.startsWith("GT-S6312") || str.startsWith("GT-S6313")) {
                return false;
            }
        }
        if (i == 19) {
            if (Build.MANUFACTURER.equals("alps")) {
                return false;
            }
        } else if (i == 17 && Build.MANUFACTURER.equals("samsung")) {
            String str2 = Build.MODEL;
            if (str2.startsWith("GT-S7270") || str2.startsWith("GT-S7272") || str2.startsWith("GT-S7273") || str2.startsWith("GT-S7275")) {
                return false;
            }
        }
        String str3 = Build.MANUFACTURER;
        if (str3.equals("bq") && Build.DEVICE.startsWith("bq_Aquaris5")) {
            return false;
        }
        if (str3.equals("samsung") && Build.MODEL.equals("SM-G386F")) {
            return false;
        }
        if (!str3.equals("Fly") || !Build.MODEL.equals("FS504")) {
            return true;
        }
        return false;
    }

    public static boolean A0A(String str) {
        return "OMX.SEC.avc.enc".equals(str) || "OMX.SEC.avc.dec".equals(str) || "OMX.Exynos.AVC.Encoder".equals(str) || "OMX.Exynos.AVC.Decoder".equals(str);
    }

    public static boolean A0B(String str) {
        if (str == null || str.equals("OMX.google.h264.encoder") || str.equals("OMX.ST.VFM.H264Enc") || str.equals("OMX.Exynos.avc.enc")) {
            return false;
        }
        if ((str.equals("OMX.MARVELL.VIDEO.HW.CODA7542ENCODER") && Build.VERSION.SDK_INT < 21) || str.equals("OMX.MARVELL.VIDEO.H264ENCODER")) {
            return false;
        }
        if (str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && "QMobile".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT < 23) {
            Log.i("videotranscoder/ OMX.MTK.VIDEO.ENCODER.AVC on QMobile is not supported");
            return false;
        } else if (!str.equals("OMX.allwinner.video.encoder.avc") && !str.equals("AVCEncoder")) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder("videotranscoder/ ");
            sb.append(str);
            sb.append(" not supported");
            Log.i(sb.toString());
            return false;
        }
    }

    public static boolean A0C(String str, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        for (String str2 : strArr) {
            if (lowerCase.startsWith(str2.toLowerCase(locale))) {
                return true;
            }
        }
        return false;
    }

    public static int[] A0D(String str, int i) {
        if (i <= 0) {
            if (!(str.equals("OMX.MTK.VIDEO.ENCODER.AVC") || str.equals("OMX.MTK.VIDEO.DECODER.AVC"))) {
                return A0M;
            }
            i = 2130706944;
        }
        int[] iArr = A0M;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        iArr2[0] = i;
        for (int i2 = 1; i2 < length; i2++) {
            int i3 = iArr[i2 - 1];
            iArr2[i2] = i3;
            if (i3 == i) {
                iArr2[i2] = 0;
            }
        }
        return iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x04c6, code lost:
        if (r82.A09.AIt(r7) != false) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x059d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x059f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05ad, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05c9, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05ca, code lost:
        r10 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x075c, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x09f1, code lost:
        if (r8 < 0) goto L_0x1671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x09f3, code lost:
        r13 = r46.getTrackFormat(r8);
        r9 = r13.getString("mime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0a04, code lost:
        if ("video/unknown".equals(r9) != false) goto L_0x1656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0a06, code lost:
        r46.selectTrack(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0a0f, code lost:
        if (r13.containsKey("durationUs") == false) goto L_0x0a39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0a11, code lost:
        r22 = r13.getLong("durationUs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0a15, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder format:");
        r2.append(r13.toString());
        r2.append(" duration:");
        r2.append(r22);
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0a39, code lost:
        r22 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        r21 = android.media.MediaCodec.createDecoderByType(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0a40, code lost:
        if (r21 == null) goto L_0x1621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0a42, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder created");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0a4c, code lost:
        if (android.os.Build.VERSION.SDK_INT != 17) goto L_0x0aab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0a4e, code lost:
        r2 = android.os.Build.MANUFACTURER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0a56, code lost:
        if (r2.equals("LGE") == false) goto L_0x0a8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0a58, code lost:
        r2 = android.os.Build.MODEL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0a60, code lost:
        if (r2.startsWith("LG-D80") != false) goto L_0x0a7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0a68, code lost:
        if (r2.startsWith("LG-VS980") != false) goto L_0x0a7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0a70, code lost:
        if (r2.startsWith("VS980_4G") != false) goto L_0x0a7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0a78, code lost:
        if (r2.startsWith("LG-F320") == false) goto L_0x0aab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0a7a, code lost:
        r10 = new X.AnonymousClass1OB(r1, r1);
        com.whatsapp.util.Log.i("videotranscoder/transcode/videooutputsurface created");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0a90, code lost:
        if (r2.equals("Amazon") == false) goto L_0x0aab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0a9a, code lost:
        if (android.os.Build.MODEL.startsWith("SD4930UR") == false) goto L_0x0aab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0a9c, code lost:
        r10 = new X.AnonymousClass1OB(r1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:?, code lost:
        r1 = r10.A01;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0aa9, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0aab, code lost:
        r10 = null;
        r2 = null;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:?, code lost:
        r21.configure(r13, r1, r2, 0);
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder configured");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0ac3, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0b01, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder ");
        r2.append(r6.getName());
        r2.append(": ");
        r2.append(java.util.Arrays.deepToString(r3));
        com.whatsapp.util.Log.i(r2.toString());
        r8.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0bd4, code lost:
        if (r21 != null) goto L_0x0c01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/can't create decoder for ");
        r2.append(r9);
        com.whatsapp.util.Log.e(r2.toString());
        r2 = new java.lang.StringBuilder();
        r2.append("Can't create decoder for ");
        r2.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0c00, code lost:
        throw new java.io.FileNotFoundException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x10b2, code lost:
        if (r82.A09.AIt(r6) != false) goto L_0x10b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x1168, code lost:
        if (r63 == false) goto L_0x1187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x1621, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/can't create decoder for ");
        r2.append(r9);
        com.whatsapp.util.Log.e(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x163a, code lost:
        throw new X.AnonymousClass3SE();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x163b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x163c, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/can't create decoder for ");
        r2.append(r9);
        com.whatsapp.util.Log.e(r2.toString(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x1655, code lost:
        throw new X.AnonymousClass3SE();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x1656, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/mime ");
        r2.append(r9);
        com.whatsapp.util.Log.e(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x1670, code lost:
        throw new X.AnonymousClass3SE();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x167d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x05c9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:69:0x0344] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0640 A[LOOP:7: B:213:0x063e->B:214:0x0640, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x06f0  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x075c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:114:0x0466] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x076d A[LOOP:8: B:245:0x076b->B:246:0x076d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:652:0x133d A[Catch:{ all -> 0x138f }] */
    /* JADX WARNING: Removed duplicated region for block: B:717:0x1580 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:720:0x1587  */
    /* JADX WARNING: Removed duplicated region for block: B:812:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
        // Method dump skipped, instructions count: 5821
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JG.A0E():void");
    }

    public void A0F() {
        try {
            File file = this.A0B;
            File file2 = this.A0H;
            long j = this.A02;
            long j2 = this.A03;
            StringBuilder A0V = AnonymousClass008.A0V("mp4ops/trim/start from ", j, " to ");
            A0V.append(j2);
            A0V.append(" size:");
            A0V.append(file.length());
            Log.i(A0V.toString());
            if ((j > 0 || j2 > 0) && j != j2) {
                float f = ((float) j) / 1000.0f;
                try {
                    Mp4Ops.LibMp4OperationResult mp4mux = Mp4Ops.mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, f, ((float) (j2 - j)) / 1000.0f, -1.0f, -1, file.getAbsolutePath(), f);
                    AnonymousClass008.A1a(AnonymousClass008.A0S("mp4ops/trim/result: "), mp4mux.success);
                    if (!mp4mux.success) {
                        AnonymousClass008.A1T(AnonymousClass008.A0S("mp4ops/trim/error_message/"), mp4mux.errorMessage);
                        if (mp4mux.ioException) {
                            throw new IOException("No space");
                        }
                        StringBuilder A0S = AnonymousClass008.A0S("invalid result, error_code: ");
                        int i = mp4mux.errorCode;
                        A0S.append(i);
                        throw new C26791Mo(i, A0S.toString(), new Throwable());
                    }
                    Log.i("mp4ops/trim/finished: size");
                    Mp4Ops.A05(file2, true);
                } catch (Error e) {
                    Log.e("mp4ops/trim/failed: mp4mux error, exiting", e);
                    throw new C26791Mo(0, e.getMessage(), new Throwable());
                }
            } else {
                StringBuilder A0V2 = AnonymousClass008.A0V("timeFrom:", j, " timeTo:");
                A0V2.append(j2);
                throw new IllegalArgumentException(A0V2.toString());
            }
        } catch (C26791Mo e2) {
            Log.e("videotranscodequeue/libmp4muxexception", e2);
            Mp4Ops.A01(this.A0G.A00, this.A0E, this.A0B, e2, "trim");
            throw e2;
        }
    }

    public void A0G(MediaCodec mediaCodec, ByteBuffer[] byteBufferArr, VideoFrameConverter videoFrameConverter, AbstractC04880Me r17, ByteBuffer byteBuffer, int i, long j, int i2) {
        StringBuilder sb = new StringBuilder("videotranscoder/handleLastFrame/");
        sb.append(i);
        Log.i(sb.toString());
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(SearchActionVerificationClientService.MS_TO_NS);
        ByteBuffer byteBuffer2 = byteBufferArr[dequeueInputBuffer];
        byteBuffer2.clear();
        VideoFrameConverter.convertFrame(videoFrameConverter.A00, byteBuffer, byteBuffer2);
        int i3 = ((C04900Mh) r17).A01.getFrameDurations()[i];
        if (i3 < 70) {
            i3 = 70;
        }
        long j2 = j + ((long) (i3 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i2, j2, 4);
        this.A04++;
        this.A05 = j2 - (this.A02 * 1000);
    }

    @Override // X.AnonymousClass0JH
    public boolean AAL() {
        return this.A0C != null;
    }

    @Override // X.AnonymousClass0JH
    public void cancel() {
        this.A0I = true;
    }
}
