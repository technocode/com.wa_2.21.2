package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: X.0W2  reason: invalid class name */
public final class AnonymousClass0W2 {
    public static final int A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final byte[] A05 = new byte[0];

    public static boolean A07(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        A00 = i;
        String str = Build.DEVICE;
        A01 = str;
        String str2 = Build.MANUFACTURER;
        A03 = str2;
        String str3 = Build.MODEL;
        A04 = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        A02 = sb.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static int A00(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i != 1073741824) {
            if (i == 2) {
                return i2 << 1;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 << 2;
    }

    public static int A01(String str) {
        int length = str.length();
        boolean z = false;
        if (length <= 4) {
            z = true;
        }
        C002001d.A39(z);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    public static int A02(long[] jArr, long j) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (jArr[binarySearch] == j);
        return binarySearch + 1;
    }

    public static int A03(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            if (z) {
                binarySearch--;
            }
        }
        return z2 ? Math.min(jArr.length - 1, binarySearch) : binarySearch;
    }

    public static long A04(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return (j2 / j3) * j;
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    public static String A05(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        return AnonymousClass008.A0P(sb, Build.VERSION.RELEASE, ") ", "ExoPlayerLib/2.9.6");
    }

    public static void A06(long[] jArr, long j) {
        int i = 0;
        if (j >= SearchActionVerificationClientService.MS_TO_NS && j % SearchActionVerificationClientService.MS_TO_NS == 0) {
            long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
        } else if (j >= SearchActionVerificationClientService.MS_TO_NS || SearchActionVerificationClientService.MS_TO_NS % j != 0) {
            double d = ((double) SearchActionVerificationClientService.MS_TO_NS) / ((double) j);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j3 = SearchActionVerificationClientService.MS_TO_NS / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
        }
    }

    public static boolean A08(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
