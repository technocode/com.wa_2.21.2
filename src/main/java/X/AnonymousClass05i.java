package X;

import android.graphics.Color;
import android.widget.ImageView;
import java.text.NumberFormat;
import java.text.ParseException;

/* renamed from: X.05i  reason: invalid class name */
public final class AnonymousClass05i {
    public static final ThreadLocal A00 = new AnonymousClass1GZ("#dp");
    public static final ThreadLocal A01 = new AnonymousClass1GZ("#%");
    public static final ThreadLocal A02 = new AnonymousClass1GZ("#px");
    public static final ThreadLocal A03 = new AnonymousClass1GZ("#sp");

    public static float A00(String str) {
        try {
            return ((NumberFormat) A01.get()).parse(str).floatValue() * 100.0f;
        } catch (ParseException e) {
            throw new AnonymousClass060(AnonymousClass008.A0K("can't parse pixel value: ", str), e);
        }
    }

    public static float A01(String str) {
        try {
            if (str.endsWith("px")) {
                return ((NumberFormat) A02.get()).parse(str).floatValue();
            }
            if (str.endsWith("sp")) {
                return (float) Math.round(((NumberFormat) A03.get()).parse(str).floatValue() * C009205v.A00().A00.getResources().getDisplayMetrics().scaledDensity);
            }
            return (float) Math.round((((float) C009205v.A00().A00.getResources().getDisplayMetrics().densityDpi) / 160.0f) * ((NumberFormat) A00.get()).parse(str).floatValue());
        } catch (ParseException e) {
            throw new AnonymousClass060(AnonymousClass008.A0K("can't parse pixel value: ", str), e);
        }
    }

    public static float A02(String str) {
        try {
            return ((NumberFormat) A03.get()).parse(str).floatValue();
        } catch (ParseException e) {
            throw new AnonymousClass060(AnonymousClass008.A0K("can't parse scaled pixel value: ", str), e);
        }
    }

    public static int A03(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new AnonymousClass060(AnonymousClass008.A0K("can't parse color value: ", str), e);
        }
    }

    public static int A04(String str) {
        switch (str.hashCode()) {
            case -2141169668:
                if (str.equals("cap_words")) {
                    return 139265;
                }
                break;
            case -1413853096:
                if (str.equals("amount")) {
                    return 12290;
                }
                break;
            case -1034364087:
                if (str.equals("number")) {
                    return 2;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    return 20;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return 131073;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return 33;
                }
                break;
            case 260133443:
                if (str.equals("cap_sentences")) {
                    return 180225;
                }
                break;
            case 1216389502:
                if (str.equals("passcode")) {
                    return 18;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    return 129;
                }
                break;
        }
        throw new AnonymousClass060(AnonymousClass008.A0K("can't parse unknown inputType: ", str));
    }

    public static int A05(String str) {
        switch (str.hashCode()) {
            case -1178781136:
                if (str.equals("italic")) {
                    return 2;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    return 0;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    return 1;
                }
                break;
            case 1734741290:
                if (str.equals("bold_italic")) {
                    return 3;
                }
                break;
        }
        throw new AnonymousClass060(AnonymousClass008.A0K("can't parse unknown typeface: ", str));
    }

    public static ImageView.ScaleType A06(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1881872635) {
            if (hashCode != 94852023) {
                if (hashCode == 951526612 && str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
            } else if (str.equals("cover")) {
                return ImageView.ScaleType.CENTER_CROP;
            }
        } else if (str.equals("stretch")) {
            return ImageView.ScaleType.FIT_XY;
        }
        throw new AnonymousClass060(AnonymousClass008.A0K("can't parse unknown scaleType: ", str));
    }

    public static C25251Gc A07(String str) {
        if ("auto".equalsIgnoreCase(str)) {
            return C25251Gc.A02;
        }
        if (str.endsWith("%")) {
            return new C25251Gc(Float.parseFloat(str.substring(0, str.length() - 1)), EnumC25241Gb.PERCENT);
        }
        return new C25251Gc(A01(str), EnumC25241Gb.PIXEL);
    }

    public static AnonymousClass05n A08(AnonymousClass06K r2, AnonymousClass06P r3) {
        return (AnonymousClass05n) ((C42901xT) r3.A00.get(AnonymousClass05n.class)).A03(r2, r3);
    }
}
