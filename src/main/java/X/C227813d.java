package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.13d  reason: invalid class name and case insensitive filesystem */
public final class C227813d {
    public static int A00 = -1;
    public static final SparseIntArray A01;
    public static final SparseIntArray A02;
    public static final SparseIntArray A03;
    public static final HashMap A04 = new HashMap();
    public static final Map A05;
    public static final Pattern A06 = Pattern.compile("^\\D?(\\d+)$");

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A02 = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        A01 = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("L30", 1);
        Map map = A05;
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", Integer.valueOf((int) EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING));
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        A03 = sparseIntArray3;
        sparseIntArray3.put(1, 1);
        sparseIntArray3.put(2, 2);
        sparseIntArray3.put(3, 3);
        sparseIntArray3.put(4, 4);
        sparseIntArray3.put(5, 5);
        sparseIntArray3.put(6, 6);
        sparseIntArray3.put(17, 17);
        sparseIntArray3.put(20, 20);
        sparseIntArray3.put(23, 23);
        sparseIntArray3.put(29, 29);
        sparseIntArray3.put(39, 39);
        sparseIntArray3.put(42, 42);
    }

    public static int A00() {
        AnonymousClass13V r0;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2 = A00;
        if (i2 == -1) {
            i2 = 0;
            List A032 = A03("video/avc", false);
            if (!A032.isEmpty() && (r0 = (AnonymousClass13V) A032.get(0)) != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = r0.A00;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                int i5 = 172800;
                if (AnonymousClass0W2.A00 >= 21) {
                    i5 = 345600;
                }
                i2 = Math.max(i3, i5);
            }
            A00 = i2;
        }
        return i2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r0 == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0 == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r0 == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r0 == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r0 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227813d.A01(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0204, code lost:
        if ("OMX.MTK.AUDIO.DECODER.DSPAC3".equals(r5) == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x025f, code lost:
        if (r22.A01 == false) goto L_0x0261;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020d A[Catch:{ Exception -> 0x02f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0254 A[Catch:{ Exception -> 0x0259 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x025d A[SYNTHETIC, Splitter:B:156:0x025d] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02d5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02d0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(X.AnonymousClass13Y r22, X.AbstractC227513a r23, java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 767
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227813d.A02(X.13Y, X.13a, java.lang.String):java.util.ArrayList");
    }

    public static synchronized List A03(String str, boolean z) {
        AbstractC227513a r7;
        synchronized (C227813d.class) {
            AnonymousClass13Y r4 = new AnonymousClass13Y(str, z);
            HashMap hashMap = A04;
            List list = (List) hashMap.get(r4);
            if (list != null) {
                return list;
            }
            int i = AnonymousClass0W2.A00;
            if (i >= 21) {
                r7 = new C34091ht(z);
            } else {
                r7 = new C34081hs();
            }
            ArrayList A022 = A02(r4, r7, str);
            if (z && A022.isEmpty() && 21 <= i && i <= 23) {
                r7 = new C34081hs();
                A022 = A02(r4, r7, str);
                if (!A022.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(((AnonymousClass13V) A022.get(0)).A02);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                A022.addAll(A02(new AnonymousClass13Y("audio/eac3", r4.A01), r7, str));
            }
            if ("audio/raw".equals(str)) {
                Collections.sort(A022, new C227713c());
            } else if (i < 21 && A022.size() > 1) {
                String str2 = ((AnonymousClass13V) A022.get(0)).A02;
                if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                    Collections.sort(A022, new C227613b());
                }
            }
            List unmodifiableList = Collections.unmodifiableList(A022);
            hashMap.put(r4, unmodifiableList);
            return unmodifiableList;
        }
    }
}
