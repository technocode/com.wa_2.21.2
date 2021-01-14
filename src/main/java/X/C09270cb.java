package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.voipcalling.JNIUtils;

/* renamed from: X.0cb  reason: invalid class name and case insensitive filesystem */
public final class C09270cb {
    public static volatile C09270cb A02;
    public final SharedPreferences A00;
    public final C002701k A01;

    public C09270cb(AnonymousClass022 r2, C002701k r3) {
        this.A00 = r2.A01("voip_prefs");
        this.A01 = r3;
    }

    public static C09270cb A00() {
        if (A02 == null) {
            synchronized (C09270cb.class) {
                if (A02 == null) {
                    A02 = new C09270cb(AnonymousClass022.A00(), C002701k.A00());
                }
            }
        }
        return A02;
    }

    public static final String A01(int i, int i2) {
        if (i2 == 1) {
            return AnonymousClass008.A0F("voip_camera_info_", i);
        }
        return AnonymousClass008.A0H("voip_camera_info_", i, "_api_", i2);
    }

    public long A02(String str) {
        SharedPreferences sharedPreferences = this.A00;
        StringBuilder sb = new StringBuilder("joinable_");
        sb.append(str);
        return sharedPreferences.getLong(sb.toString(), -1);
    }

    public String A03() {
        String A06 = this.A01.A06(151);
        if (!TextUtils.isEmpty(A06)) {
            return A06;
        }
        return this.A00.getString("camera2_required_hardware_support_level", null);
    }

    public void A04(JNIUtils.H26xSupportResult h26xSupportResult) {
        this.A00.edit().putBoolean("video_codec_h264_hw_supported", h26xSupportResult.isH264HwSupported).putBoolean("video_codec_h264_sw_supported", h26xSupportResult.isH264SwSupported).putBoolean("video_codec_h265_hw_supported", h26xSupportResult.isH265HwSupported).putBoolean("video_codec_h265_sw_supported", h26xSupportResult.isH265SwSupported).apply();
    }

    public void A05(String str, long j) {
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb = new StringBuilder("joinable_");
        sb.append(str);
        edit.putLong(sb.toString(), j).apply();
    }
}
