package X;

import java.util.ArrayList;

/* renamed from: X.15j  reason: invalid class name and case insensitive filesystem */
public final class C233415j {
    public static final ArrayList A00 = new ArrayList();

    public static String A01(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    default:
                        return null;
                }
        }
    }

    public static int A00(String str) {
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    return 6;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    return 7;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    return 5;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    return 6;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    return 8;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    return 14;
                }
                break;
        }
        return 0;
    }

    public static String A02(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException(AnonymousClass008.A0K("Invalid mime type: ", str));
    }
}
