package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.Editable;
import android.text.Html;
import android.text.ParcelableSpan;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.DescribeProblemActivity;
import com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment;
import com.whatsapp.Main;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import com.whatsapp.voipcalling.Voip;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.01d  reason: invalid class name and case insensitive filesystem */
public final class C002001d {
    public static String A00;
    public static Field A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;

    public static int A00(byte b, int i, boolean z) {
        if (b != 1) {
            if (b == 2) {
                return i == 1 ? 5 : 4;
            }
            if (b != 3) {
                if (b == 4) {
                    return 7;
                }
                if (b == 5) {
                    return 6;
                }
                if (b == 9) {
                    return 8;
                }
                if (b == 16) {
                    return 14;
                }
                if (b == 20) {
                    return 16;
                }
                if (b == 35) {
                    return 21;
                }
                if (b == 51) {
                    return 20;
                }
                switch (b) {
                    case 12:
                        return 12;
                    case 13:
                        return 11;
                    case 14:
                        return 13;
                    default:
                        switch (b) {
                            case 42:
                                break;
                            case 43:
                                break;
                            case 44:
                                return 24;
                            case 45:
                                return 25;
                            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                                return 26;
                            default:
                                return z ? 9 : 1;
                        }
                }
            }
            return 3;
        }
        return 2;
    }

    public static int A01(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 10:
            case 15:
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
            case 17:
            default:
                return 2;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 11:
                return 17;
            case 12:
                return 18;
            case 13:
                return 11;
            case 14:
                return 1;
            case 18:
                return 20;
            case 19:
                return 21;
        }
    }

    public static int A02(int i, int i2, int i3) {
        float f = (float) i3;
        int i4 = ((int) (1.402f * f)) + i;
        float f2 = (float) i2;
        int i5 = i - ((int) ((f * 0.714f) + (0.344f * f2)));
        int i6 = i + ((int) (f2 * 1.772f));
        if (i4 > 255) {
            i4 = 255;
        } else if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > 255) {
            i5 = 255;
        } else if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > 255) {
            i6 = 255;
        } else if (i6 < 0) {
            i6 = 0;
        }
        return i6 | -16777216 | (i4 << 16) | (i5 << 8);
    }

    public static String A1N(int i) {
        switch (i) {
            case 0:
                return "success";
            case 1:
                return "cancel";
            case 2:
                return "failed_insufficient_space";
            case 3:
                return "failed_io";
            case 4:
                return "failed_oom";
            case 5:
                return "failed_bad_media";
            case 6:
                return "failed_no_permissions";
            case 7:
                return "failed_fnf";
            case 8:
                return "failed_server";
            case 9:
                return "failed_request";
            case 10:
                return "failed_request_timeout";
            case 11:
                return "failed_not_finalized";
            case 12:
                return "failed_optimistic_hash";
            case 13:
                return "failed_media_conn";
            case 14:
                return "failed_optimistic_network_unsafe";
            case 15:
                return "failed_throttle";
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return "failed_no_such_algorithm";
            case 17:
                return "failed_network";
            case 18:
                return "failed_watls";
            case 19:
                return "failed_url";
            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                return "failed_transcoding_unknown";
            case 21:
                return "failed_file_format_unsupported";
            case 22:
                return "failed_dns_lookup";
            case 23:
                return "failed_wamsys";
            case 24:
                return "failed_too_large";
            default:
                return "undefined";
        }
    }

    public static int A03(int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i - 1) / i5) + 1;
        int i7 = ((i2 - 1) / i5) + 1;
        while (((i6 - 1) / 2) + 1 >= i3 && ((i7 - 1) / 2) + 1 >= i4) {
            i6 = ((i6 - 1) / 2) + 1;
            i7 = ((i7 - 1) / 2) + 1;
            i5 <<= 1;
        }
        return i5;
    }

    public static int A04(int i, int i2, AnonymousClass02K r13) {
        int i3 = 1;
        StringBuilder sb = new StringBuilder("bitmaputils/wrong raw image/");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        String obj = sb.toString();
        if (1 == 0) {
            Log.e(new AssertionError(obj));
        }
        int i4 = r13.A02.inSampleSize;
        Long l = r13.A03;
        if (l != null) {
            int i5 = i;
            int i6 = i2;
            while (((long) i5) * ((long) i6) > l.longValue()) {
                i5 = ((i5 - 1) / 2) + 1;
                i6 = ((i6 - 1) / 2) + 1;
                i3 <<= 1;
            }
        }
        if (r13.A04) {
            i = Math.max(i, i2);
            i2 = i;
        }
        return A03(i, i2, r13.A01, r13.A00, Math.max(i4, i3));
    }

    public static int A05(int i, AnonymousClass352 r3) {
        if (i == 0) {
            return 1;
        }
        if (i < 2 && r3.A01 != null) {
            return 2;
        }
        if (i < 3 && r3.A03 != null) {
            return 3;
        }
        if (i >= 4 || r3.A02 == null) {
            return 5;
        }
        return 4;
    }

    public static int A06(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        try {
            return C004302a.A00(context, typedValue.resourceId);
        } catch (Resources.NotFoundException unused) {
            return C004302a.A00(context, i2);
        }
    }

    public static int A07(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!A07) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    A02 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    android.util.Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                A07 = true;
            }
            Method method = A02;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    android.util.Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    A02 = null;
                }
            }
        }
        return 0;
    }

    public static int A08(AnonymousClass03P r9) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int A012 = AnonymousClass0Lx.A01();
        int i3 = 2011;
        if (A012 >= 1) {
            if (A012 == 1) {
                i2 = 2008;
            } else {
                i2 = 2012;
                if (A012 <= 3) {
                    i2 = 2011;
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        long A002 = (long) AnonymousClass0Lx.A00();
        if (A002 != -1) {
            if (A002 <= 528000) {
                i = 2008;
            } else if (A002 <= 620000) {
                i = 2009;
            } else if (A002 <= 1020000) {
                i = 2010;
            } else if (A002 <= 1220000) {
                i = 2011;
            } else if (A002 <= 1520000) {
                i = 2012;
            } else {
                i = 2014;
                if (A002 <= 2020000) {
                    i = 2013;
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager A013 = r9.A01();
        if (A013 == null) {
            Log.w("deviceinfo/get-total-memory am=null");
        } else {
            A013.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0) {
                if (j <= 201326592) {
                    i3 = 2008;
                } else if (j <= 304087040) {
                    i3 = 2009;
                } else if (j <= 536870912) {
                    i3 = 2010;
                } else if (j > 1073741824) {
                    if (j <= 1610612736) {
                        i3 = 2012;
                    } else {
                        i3 = 2014;
                        if (j <= 2147483648L) {
                            i3 = 2013;
                        }
                    }
                }
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Number) arrayList.get(arrayList.size() >> 1)).intValue();
        }
        int size = (arrayList.size() >> 1) - 1;
        return ((((Number) arrayList.get(size + 1)).intValue() - ((Number) arrayList.get(size)).intValue()) >> 1) + ((Number) arrayList.get(size)).intValue();
    }

    public static int A09(AnonymousClass00D r1, int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return r1.A00.getInt("autodownload_wifi_mask", 15);
        }
        if (i == 2) {
            return r1.A00.getInt("autodownload_cellular_mask", 1);
        }
        if (i == 3) {
            return r1.A00.getInt("autodownload_roaming_mask", 0);
        }
        throw new IllegalArgumentException("network_type not valid");
    }

    public static int A0A(AnonymousClass022 r3, AnonymousClass03P r4) {
        SharedPreferences A012 = r3.A01(AnonymousClass020.A02);
        int i = A012.getInt("year_class_cached_value_pref", -1);
        if (i != -1) {
            return i;
        }
        int A082 = A08(r4);
        A012.edit().putInt("year_class_cached_value_pref", A082).apply();
        return A082;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (X.AnonymousClass0Lx.A00() >= 1300000) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (X.AnonymousClass0Lx.A00() < 1800000) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A0B(X.AnonymousClass022 r7, X.AnonymousClass03P r8) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0B(X.022, X.03P):int");
    }

    public static int A0C(AbstractC007503q r1) {
        if (r1 instanceof C04830Lz) {
            return 1;
        }
        if (r1 instanceof AnonymousClass0M1) {
            return ((AnonymousClass0M1) r1).A0u().size();
        }
        if (!AnonymousClass0FI.A0g(r1)) {
            return 0;
        }
        AnonymousClass0M2 r12 = (AnonymousClass0M2) r1;
        AnonymousClass0M4 r0 = ((AnonymousClass0M3) r12).A02;
        if (r0 != null) {
            return r0.A01;
        }
        return r12.A00;
    }

    public static int A0D(AnonymousClass0M5 r4) {
        try {
            AnonymousClass0M5 A0D = r4.A0D("ephemeral");
            if (A0D != null) {
                return A0D.A05("expiration", 0);
            }
        } catch (Exception e) {
            StringBuilder A0S = AnonymousClass008.A0S("GroupProtocolTreeNodeHelper/getEphemeralDuration ");
            A0S.append(e.getMessage());
            Log.e(A0S.toString(), e);
        }
        return 0;
    }

    public static int A0E(AnonymousClass0M5 r0) {
        Pair A0j = A0j(r0);
        if (A0j != null) {
            return ((Number) A0j.first).intValue();
        }
        return 0;
    }

    public static int A0F(CharSequence charSequence) {
        AnonymousClass0M6 r5 = new AnonymousClass0M6(charSequence);
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            r5.A00 = i;
            int A002 = EmojiDescriptor.A00(r5, false);
            if (A002 == -1) {
                return 0;
            }
            i += r5.A02(i, A002);
            i2++;
            if (i2 > 3) {
                return 0;
            }
        }
        return i2;
    }

    public static int A0G(Exception exc) {
        if (exc instanceof UnknownHostException) {
            return 2;
        }
        if (exc instanceof SocketTimeoutException) {
            return 3;
        }
        return exc instanceof ConnectException ? 19 : 18;
    }

    public static int A0H(String str) {
        if (str == null) {
            Log.d("BspUtil/parseActualActors: input null");
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode != 49) {
            if (hashCode != 50 || !str.equals("2")) {
                return 0;
            }
            return 2;
        } else if (str.equals("1")) {
            return 1;
        }
        return 0;
    }

    public static int A0I(String str) {
        if (str == null) {
            Log.d("BspUtil/parseHostStorage: input null");
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode != 49) {
            if (hashCode != 50 || !str.equals("2")) {
                return 0;
            }
            return 2;
        } else if (str.equals("1")) {
            return 1;
        }
        return 0;
    }

    public static int A0J(String str, AnonymousClass1RH r9, AnonymousClass03R r10, AnonymousClass03S r11) {
        File file = new File(str);
        if (!file.exists()) {
            return 1;
        }
        if (r9 == null) {
            return 2;
        }
        if (file.length() != r9.A00) {
            return 4;
        }
        String A09 = AnonymousClass0JJ.A09(r10, r11, file, file.length());
        if (A09 == null) {
            StringBuilder sb = new StringBuilder("gdrive/v2/utils/is-local-sameas-remote/md5-is-null/ ");
            sb.append(file);
            Log.i(sb.toString());
            return 1;
        } else if (A09.equals(r9.A02)) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int A0K(Object... objArr) {
        int i = Build.VERSION.SDK_INT;
        int hashCode = Arrays.hashCode(objArr);
        if (i >= 19) {
            return hashCode;
        }
        return hashCode;
    }

    public static long A0L(Context context, String str) {
        PackageInfo A0T = A0T(context, str);
        if (A0T == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return A0T.getLongVersionCode();
        }
        return (long) A0T.versionCode;
    }

    public static Dialog A0M(Context context, C02780Dk r11, AnonymousClass0M9 r12, AnonymousClass01X r13, AnonymousClass00D r14, AnonymousClass0MA r15) {
        AnonymousClass0MB r4 = new AnonymousClass0MB(context);
        DialogInterface$OnClickListenerC14400mD r3 = new DialogInterface$OnClickListenerC14400mD(r15, r14);
        DialogInterface$OnClickListenerC14440mH r5 = new DialogInterface$OnClickListenerC14440mH(r15, r14, r12, r11, context);
        DialogInterface$OnCancelListenerC14340m6 r2 = new DialogInterface$OnCancelListenerC14340m6(r15, r14);
        String A062 = r13.A06(R.string.revoke_nux);
        AnonymousClass0MC r1 = r4.A01;
        r1.A0E = A062;
        r4.A07(r13.A06(R.string.ok), r3);
        r4.A06(r13.A06(R.string.learn_more), r5);
        r1.A0J = true;
        r1.A02 = r2;
        return r4.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r32.A00.getBoolean("pref_revoke_nux", true) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Dialog A0N(android.content.Context r25, X.AnonymousClass02M r26, X.AnonymousClass00S r27, X.AnonymousClass00T r28, X.C02590Cr r29, X.C04360Kb r30, X.AnonymousClass01X r31, X.AnonymousClass00D r32, java.util.Collection r33, X.AnonymousClass0MF r34, boolean r35, X.AnonymousClass0MG r36, java.lang.String r37) {
        /*
        // Method dump skipped, instructions count: 388
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0N(android.content.Context, X.02M, X.00S, X.00T, X.0Cr, X.0Kb, X.01X, X.00D, java.util.Collection, X.0MF, boolean, X.0MG, java.lang.String):android.app.Dialog");
    }

    public static Context A0O(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Intent A0P(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String A1O = A1O(activity, activity.getComponentName());
            if (A1O == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, A1O);
            try {
                if (A1O(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
                sb.append(A1O);
                sb.append("' in manifest");
                android.util.Log.e("NavUtils", sb.toString());
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent A0Q(Context context, ComponentName componentName) {
        String A1O = A1O(context, componentName);
        if (A1O == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), A1O);
        if (A1O(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static Intent A0R(Context context, String str, String str2, Integer num, ArrayList arrayList, ArrayList arrayList2, Bundle bundle) {
        Intent intent;
        if (!A3C() || C28051Sr.A1x(str)) {
            intent = new Intent(context, DescribeProblemActivity.class);
            intent.putExtra("com.whatsapp.DescribeProblemActivity.from", str);
            intent.putExtra("com.whatsapp.DescribeProblemActivity.serverstatus", str2);
            if (num != null) {
                intent.putExtra("com.whatsapp.DescribeProblemActivity.type", num);
            }
            if (arrayList != null) {
                intent.putStringArrayListExtra("com.whatsapp.DescribeProblemActivity.description.paymentSupportTopicIDs", arrayList);
            }
            if (arrayList2 != null) {
                intent.putStringArrayListExtra("com.whatsapp.DescribeProblemActivity.description.paymentSupportTopicTitles", arrayList2);
            }
            if (bundle != null) {
                intent.putExtras(bundle);
                return intent;
            }
        } else {
            intent = new Intent(context, ContactUsActivity.class);
            intent.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from", str);
            intent.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", str2);
            if (bundle != null) {
                Bundle bundle2 = new Bundle();
                String string = bundle.getString("com.whatsapp.DescribeProblemActivity.from");
                String string2 = bundle.getString("com.whatsapp.DescribeProblemActivity.serverstatus");
                String string3 = bundle.getString("com.whatsapp.DescribeProblemActivity.emailAddress");
                String string4 = bundle.getString("com.whatsapp.DescribeProblemActivity.description");
                if (!TextUtils.isEmpty(string)) {
                    bundle2.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.from", string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    bundle2.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", string2);
                }
                if (!TextUtils.isEmpty(string3)) {
                    bundle2.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.emailAddress", string3);
                }
                if (!TextUtils.isEmpty(string4)) {
                    bundle2.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.description", string4);
                }
                intent.putExtras(bundle2);
            }
        }
        return intent;
    }

    public static Intent A0S(List list, CharSequence charSequence, IntentSender intentSender) {
        Intent intent;
        int i;
        int i2 = 0;
        Intent intent2 = (Intent) list.get(0);
        if (Build.VERSION.SDK_INT < 22 || intentSender == null) {
            intent = Intent.createChooser(intent2, charSequence);
        } else {
            intent = Intent.createChooser(intent2, charSequence, intentSender);
        }
        int size = list.size() - 1;
        if (size > 0) {
            Parcelable[] parcelableArr = new Intent[size];
            do {
                i = i2 + 1;
                parcelableArr[i2] = list.get(i);
                i2 = i;
            } while (i < size);
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", parcelableArr);
        }
        return intent;
    }

    public static PackageInfo A0T(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(str, 0);
            }
            return null;
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Log.e("Failed to get package info", e);
            return null;
        }
    }

    public static Bitmap A0U(ActivityC004702f r8, C007003k r9, boolean z, String str, String str2) {
        ContactQrContactCardView contactQrContactCardView;
        Resources resources = r8.getResources();
        AnonymousClass0MW r6 = (AnonymousClass0MW) r8.A0A();
        int i = r6.A01;
        if (Build.VERSION.SDK_INT < 17) {
            if (i != 1) {
                r6.A01 = 1;
                r6.A0W(true);
            }
            contactQrContactCardView = new ContactQrContactCardView(r8);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(resources.getDimension(R.dimen.contact_qr_corner_radius));
            gradientDrawable.setColor(resources.getColor(R.color.contact_qr_card_background));
            contactQrContactCardView.findViewById(R.id.qr_card).setBackgroundDrawable(gradientDrawable);
        } else {
            Configuration configuration = new Configuration();
            configuration.uiMode = (new Configuration().uiMode & -49) | 16;
            C04850Mb r1 = new C04850Mb(r8);
            if (r1.A03 != null) {
                throw new IllegalStateException("getResources() or getAssets() has already been called");
            } else if (r1.A01 == null) {
                r1.A01 = new Configuration(configuration);
                contactQrContactCardView = new ContactQrContactCardView(r1);
            } else {
                throw new IllegalStateException("Override configuration has already been set");
            }
        }
        contactQrContactCardView.setGravity(17);
        contactQrContactCardView.setStyle(1);
        contactQrContactCardView.A01(r9, z);
        contactQrContactCardView.setPrompt(str2);
        contactQrContactCardView.setQrCode(str);
        contactQrContactCardView.measure(View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(R.dimen.contact_qr_share_card_width), 1073741824), View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(R.dimen.contact_qr_share_card_height), 1073741824));
        contactQrContactCardView.layout(0, 0, contactQrContactCardView.getMeasuredWidth(), contactQrContactCardView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(contactQrContactCardView.getWidth(), contactQrContactCardView.getHeight(), Bitmap.Config.ARGB_8888);
        contactQrContactCardView.draw(new Canvas(createBitmap));
        if (Build.VERSION.SDK_INT < 17 && r6.A01 != i) {
            r6.A01 = i;
            r6.A0W(true);
        }
        return createBitmap;
    }

    public static Bitmap A0V(File file) {
        return A0X(file, new C04860Mc(-1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A0W(java.io.File r3, long r4) {
        /*
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000b
            android.graphics.Bitmap r2 = A0V(r3)
        L_0x000a:
            return r2
        L_0x000b:
            r2 = 0
            X.0Md r1 = new X.0Md
            r1.<init>()
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0020 }
            r1.setDataSource(r0)     // Catch:{ all -> 0x0020 }
            android.graphics.Bitmap r2 = r1.getFrameAtTime(r4)     // Catch:{ all -> 0x0020 }
            r1.close()     // Catch:{ Exception | NoSuchMethodError -> 0x000a }
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0W(java.io.File, long):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A0X(java.io.File r12, X.C04860Mc r13) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0X(java.io.File, X.0Mc):android.graphics.Bitmap");
    }

    public static Bitmap A0Y(InputStream inputStream, BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT >= 21) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        return A0o(inputStream, new AnonymousClass02K(Integer.MAX_VALUE, Integer.MAX_VALUE, null, false, options)).A02;
    }

    public static Typeface A0Z(Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return A0a(context, R.font.payment_icons_regular, new TypedValue(), 0, null, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d9, code lost:
        if (r34 == null) goto L_0x01db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6 A[Catch:{ XmlPullParserException -> 0x032a, IOException -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01de A[Catch:{ XmlPullParserException -> 0x032a, IOException -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e1 A[Catch:{ XmlPullParserException -> 0x032a, IOException -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0207 A[Catch:{ XmlPullParserException -> 0x032a, IOException -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020e A[Catch:{ XmlPullParserException -> 0x032a, IOException -> 0x0313 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface A0a(android.content.Context r30, int r31, android.util.TypedValue r32, int r33, X.AbstractC04990Mq r34, boolean r35) {
        /*
        // Method dump skipped, instructions count: 883
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0a(android.content.Context, int, android.util.TypedValue, int, X.0Mq, boolean):android.graphics.Typeface");
    }

    public static Drawable A0b(Context context, int i, int i2) {
        Integer num;
        Drawable A032 = C004302a.A03(context, i);
        if (A032 != null) {
            Drawable mutate = A032.mutate();
            try {
                num = Integer.valueOf(C004302a.A00(context, i2));
            } catch (Resources.NotFoundException unused) {
                num = null;
            }
            return (num == null || num.intValue() == 0) ? mutate : A0e(mutate, C004302a.A00(context, i2));
        }
        throw null;
    }

    public static Drawable A0c(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static Drawable A0d(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        return i >= 21 ? !(drawable instanceof AbstractC05200No) ? new C05210Np(drawable) : drawable : !(drawable instanceof AbstractC05200No) ? new C05220Nq(drawable) : drawable;
    }

    public static Drawable A0e(Drawable drawable, int i) {
        if (i == 0) {
            return drawable;
        }
        Drawable A0d = A0d(drawable);
        A2Z(A0d, i);
        return A0d;
    }

    public static PowerManager.WakeLock A0f(PowerManager powerManager, int i, String str) {
        StringBuilder sb = new StringBuilder("com.whatsapp");
        sb.append(":");
        sb.append(str);
        return powerManager.newWakeLock(i, sb.toString());
    }

    public static SpannableStringBuilder A0g(CharSequence charSequence, Context context, Paint paint, float f, AbstractC05230Ns r5, C02590Cr r6) {
        C05240Nt r0;
        if (paint == null) {
            r0 = C05310Oa.A01(context.getApplicationContext());
        } else {
            r0 = new C05240Nt(context, paint, f);
        }
        return A0h(charSequence, context, r0, r5, r6);
    }

    public static SpannableStringBuilder A0h(CharSequence charSequence, Context context, C05240Nt r24, AbstractC05230Ns r25, C02590Cr r26) {
        int i;
        Object imageSpan;
        SpannableStringBuilder spannableStringBuilder = null;
        if (charSequence == null) {
            return null;
        }
        AnonymousClass0M6 r8 = new AnonymousClass0M6(charSequence);
        int length = charSequence.length();
        Paint paint = new Paint();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            r8.A00 = i2;
            int A002 = EmojiDescriptor.A00(r8, false);
            int A012 = r8.A01(i2, A002);
            if (A002 != -1) {
                if (spannableStringBuilder == null) {
                    if (charSequence instanceof SpannableStringBuilder) {
                        spannableStringBuilder = (SpannableStringBuilder) charSequence;
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    }
                }
                BitmapDrawable A013 = r26.A01(context, A002, r8);
                if (A013 != null) {
                    if (AnonymousClass0M7.A00) {
                        StringBuilder sb = new StringBuilder(A012);
                        for (int i4 = 0; i4 < A012; i4++) {
                            sb.append((char) 65535);
                        }
                        spannableStringBuilder.replace(i3, i3 + A012, (CharSequence) sb, 0, A012);
                    }
                    int i5 = i3 + A012;
                    CharSequence subSequence = spannableStringBuilder.subSequence(i3, i5);
                    Paint paint2 = r24.A02;
                    Paint.FontMetricsInt A003 = C05250Nu.A00(paint2);
                    if (A003 != null) {
                        int textSize = (int) ((paint2.getTextSize() * r24.A00 * 1.1f) + 0.5f);
                        A013.setBounds(0, 0, textSize, textSize);
                        imageSpan = new C05260Nv(r24.A01, A013, A003, subSequence);
                    } else {
                        if (paint2.getFontMetrics() != null) {
                            i = (int) ((paint2.getTextSize() * r24.A00 * 1.1f) + 0.5f);
                        } else {
                            i = (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f);
                        }
                        A013.setBounds(0, 0, i, i);
                        imageSpan = new ImageSpan(A013, 0);
                    }
                    spannableStringBuilder.setSpan(imageSpan, i3, i5, 33);
                    if (r25 != null && !r25.AKq(true, i2)) {
                        return spannableStringBuilder;
                    }
                } else if (!C05280Nx.A00(paint, charSequence.subSequence(i2, i2 + A012).toString())) {
                    spannableStringBuilder.setSpan(new C05290Ny(), i3, i3 + A012, 33);
                }
            } else if (r25 != null && !r25.AKq(false, i2)) {
                return spannableStringBuilder;
            }
            i3 += A012;
            i2 += A012;
        }
        return charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : spannableStringBuilder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A0i(X.AnonymousClass01X r13, long r14, boolean r16) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0i(X.01X, long, boolean):android.util.Pair");
    }

    public static Pair A0j(AnonymousClass0M5 r4) {
        for (AnonymousClass0M5 r1 : r4.A0H("error")) {
            if (r1 != null) {
                String A0G = r1.A0G("code", null);
                String A0G2 = r1.A0G("text", null);
                if (A0G != null) {
                    return new Pair(Integer.valueOf(C006803i.A02(A0G, 0)), A0G2);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0055 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055 A[SYNTHETIC, Splitter:B:27:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0O3 A0k(android.content.Context r6, X.AnonymousClass0O1 r7, X.AnonymousClass037 r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0k(android.content.Context, X.0O1, X.037, boolean):X.0O3");
    }

    public static AnonymousClass0O6 A0l(ActivityC004902h r1, AnonymousClass0O4 r2) {
        return new AnonymousClass0O6(r1.A9n(), r2);
    }

    public static AnonymousClass02L A0m(AnonymousClass0O7 r1, AnonymousClass02K r2) {
        try {
            return A0p(r1.A35(), r2);
        } catch (IOException e) {
            Log.e("bitmaputils/decoder failed", e);
            return new AnonymousClass02L(null, 0, 0);
        }
    }

    public static AnonymousClass02L A0n(File file, AnonymousClass02K r6) {
        if (Build.VERSION.SDK_INT < 21) {
            return A0m(new AnonymousClass0O8(file), r6);
        }
        BitmapFactory.Options options = r6.A02;
        if (!options.inJustDecodeBounds) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i <= 0 || i2 <= 0) {
            Log.e("bitmapcache/decode bad image");
            return new AnonymousClass02L(null, i, i2);
        }
        options.inSampleSize = A04(i, i2, r6);
        options.inJustDecodeBounds = false;
        return new AnonymousClass02L(BitmapFactory.decodeFile(file.getAbsolutePath(), options), i, i2);
    }

    public static AnonymousClass02L A0o(InputStream inputStream, AnonymousClass02K r2) {
        return A0m(new AnonymousClass0O9(inputStream), r2);
    }

    public static AnonymousClass02L A0p(byte[] bArr, AnonymousClass02K r8) {
        BitmapFactory.Options options = r8.A02;
        if (!options.inJustDecodeBounds) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i <= 0 || i2 <= 0) {
            Log.e("bitmaputils/decode bad image");
            return new AnonymousClass02L(null, i, i2);
        }
        options.inSampleSize = A04(i, i2, r8);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return new AnonymousClass02L(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[Catch:{ NumberFormatException -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138 A[Catch:{ NumberFormatException -> 0x013e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C28211Ti A0q(X.AnonymousClass0M5 r11) {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0q(X.0M5):X.1Ti");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        if ("catalog_exists".equals(r1.A0G("status", null)) == false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C28231Tk A0r(com.whatsapp.jid.UserJid r14, X.AnonymousClass0M5 r15) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0r(com.whatsapp.jid.UserJid, X.0M5):X.1Tk");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r1 == 3) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0J9 A0s(android.database.Cursor r12) {
        /*
            r0 = 1
            java.lang.String r0 = r12.getString(r0)
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.getNullable(r0)
            if (r4 != 0) goto L_0x000d
            r0 = 0
            return r0
        L_0x000d:
            r0 = 0
            r12.getLong(r0)
            r0 = 2
            long r5 = r12.getLong(r0)
            r0 = 3
            java.lang.String r7 = r12.getString(r0)
            r0 = 5
            java.lang.String r8 = r12.getString(r0)
            r0 = 9
            int r1 = r12.getInt(r0)
            r0 = 1
            if (r1 == r0) goto L_0x0030
            r0 = 2
            if (r1 == r0) goto L_0x0030
            r0 = 3
            r9 = 0
            if (r1 != r0) goto L_0x0031
        L_0x0030:
            r9 = r0
        L_0x0031:
            r0 = 10
            byte[] r10 = r12.getBlob(r0)
            r0 = 11
            int r11 = r12.getInt(r0)
            r0 = 12
            java.lang.String r0 = r12.getString(r0)
            int r3 = A0I(r0)
            r0 = 13
            java.lang.String r0 = r12.getString(r0)
            int r2 = A0H(r0)
            r0 = 14
            long r0 = r12.getLong(r0)
            X.0OB r12 = new X.0OB
            r12.<init>(r3, r2, r0)
            X.0J9 r3 = new X.0J9
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0s(android.database.Cursor):X.0J9");
    }

    public static AnonymousClass0PU A0t(AnonymousClass009 r7, AnonymousClass0M5 r8) {
        HashMap hashMap = new HashMap();
        if (r8 != null) {
            for (AnonymousClass0M5 r4 : r8.A0H("device")) {
                hashMap.put(r4.A09(DeviceJid.class, "jid", r7), Long.valueOf(r4.A07("key-index", 0)));
            }
        }
        return new AnonymousClass0PU(hashMap, null);
    }

    public static AnonymousClass0E6 A0u(AnonymousClass0OC r3) {
        return new AnonymousClass0E6(r3.A01, r3.A00);
    }

    public static AnonymousClass0OE A0v(AnonymousClass0OD r3) {
        return new AnonymousClass0OE(r3.A00, A0u(r3.A01));
    }

    public static C03960Il A0w(String str) {
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(str, i);
            i += Character.charCount(codePointAt);
            iArr[i2] = codePointAt;
            i2++;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return new C03960Il(iArr2);
    }

    public static AnonymousClass0OI A0x(C04970Mo r7, AnonymousClass0OF r8) {
        AnonymousClass0OH r0 = r7.A04().A03;
        if (r0 == null) {
            r0 = AnonymousClass0OH.A07;
        }
        AnonymousClass0OI r3 = (AnonymousClass0OI) r0.AQb();
        String str = r8.A00;
        r3.A02();
        AnonymousClass0OH r1 = (AnonymousClass0OH) r3.A00;
        if (str != null) {
            r1.A00 |= 32;
            r1.A04 = str;
            String str2 = r8.A01;
            if (!TextUtils.isEmpty(str2)) {
                r3.A02();
                AnonymousClass0OH r12 = (AnonymousClass0OH) r3.A00;
                if (str2 != null) {
                    r12.A00 |= 64;
                    r12.A05 = str2;
                } else {
                    throw null;
                }
            }
            List<AnonymousClass0OJ> list = r8.A02;
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (AnonymousClass0OJ r72 : list) {
                    AbstractC04160Jh A0B = AnonymousClass0OK.A04.AQb();
                    int i = r72.A03;
                    if (i == 1) {
                        AbstractC04160Jh A0B2 = AnonymousClass0OL.A03.AQb();
                        String str3 = r72.A05;
                        A0B2.A02();
                        AnonymousClass0OL r13 = (AnonymousClass0OL) A0B2.A00;
                        if (str3 != null) {
                            r13.A00 |= 2;
                            r13.A02 = str3;
                            String str4 = r72.A04;
                            A0B2.A02();
                            AnonymousClass0OL r14 = (AnonymousClass0OL) A0B2.A00;
                            if (str4 != null) {
                                r14.A00 |= 1;
                                r14.A01 = str4;
                                A0B.A02();
                                AnonymousClass0OK r15 = (AnonymousClass0OK) A0B.A00;
                                if (r15 != null) {
                                    r15.A03 = A0B2.A01();
                                    r15.A01 = 1;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else if (i == 3) {
                        AbstractC04160Jh A0B3 = AnonymousClass0OM.A03.AQb();
                        String str5 = r72.A04;
                        A0B3.A02();
                        AnonymousClass0OM r16 = (AnonymousClass0OM) A0B3.A00;
                        if (str5 != null) {
                            r16.A00 |= 1;
                            r16.A01 = str5;
                            String str6 = r72.A05;
                            A0B3.A02();
                            AnonymousClass0OM r17 = (AnonymousClass0OM) A0B3.A00;
                            if (str6 != null) {
                                r17.A00 |= 2;
                                r17.A02 = str6;
                                A0B.A02();
                                AnonymousClass0OK r18 = (AnonymousClass0OK) A0B.A00;
                                if (r18 != null) {
                                    r18.A03 = A0B3.A01();
                                    r18.A01 = 3;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else if (i == 2) {
                        AbstractC04160Jh A0B4 = AnonymousClass0ON.A03.AQb();
                        String str7 = r72.A04;
                        A0B4.A02();
                        AnonymousClass0ON r19 = (AnonymousClass0ON) A0B4.A00;
                        if (str7 != null) {
                            r19.A00 |= 1;
                            r19.A01 = str7;
                            String str8 = r72.A05;
                            A0B4.A02();
                            AnonymousClass0ON r110 = (AnonymousClass0ON) A0B4.A00;
                            if (str8 != null) {
                                r110.A00 |= 2;
                                r110.A02 = str8;
                                AnonymousClass078 A012 = A0B4.A01();
                                A0B.A02();
                                AnonymousClass0OK r111 = (AnonymousClass0OK) A0B.A00;
                                if (A012 != null) {
                                    r111.A03 = A012;
                                    r111.A01 = 2;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        continue;
                    }
                    int i2 = r72.A02;
                    A0B.A02();
                    AnonymousClass0OK r112 = (AnonymousClass0OK) A0B.A00;
                    r112.A00 |= 8;
                    r112.A02 = i2;
                    arrayList.add(A0B.A01());
                }
                r3.A02();
                AnonymousClass0OH r2 = (AnonymousClass0OH) r3.A00;
                AbstractC04120Jd r113 = r2.A02;
                if (!((AbstractC05040Mx) r113).A00) {
                    r2.A02 = AnonymousClass078.A04(r113);
                }
                AnonymousClass079.A07(arrayList, r2.A02);
            }
            return r3;
        }
        throw null;
    }

    public static AbstractC007503q A0y(AnonymousClass0AL r21, AnonymousClass0OG r22, String str, AnonymousClass02N r24, long j, UserJid userJid, Long l, int i, boolean z, boolean z2, int i2) {
        String str2;
        char c;
        AnonymousClass0OL r0;
        String str3;
        int i3;
        AnonymousClass0OL r02;
        AnonymousClass0ON r03;
        AnonymousClass0OM r04;
        AnonymousClass0ON r05;
        AnonymousClass0OM r06;
        AnonymousClass0OH r7 = r22.A03;
        if (r7 == null) {
            r7 = AnonymousClass0OH.A07;
        }
        String str4 = r7.A04;
        boolean z3 = false;
        if ((r7.A00 & 64) == 64) {
            z3 = true;
        }
        String str5 = z3 ? r7.A05 : null;
        int i4 = r7.A01;
        if (i4 != 2) {
            str2 = null;
        } else if (i4 == 2) {
            str2 = (String) r7.A03;
        } else {
            str2 = "";
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < r7.A02.size(); i5++) {
            AnonymousClass0OK r8 = (AnonymousClass0OK) r7.A02.get(i5);
            int i6 = r8.A01;
            if (i6 == 1) {
                c = 1;
            } else {
                c = 2;
                if (i6 != 2) {
                    c = 3;
                }
            }
            String str6 = "";
            if (c == 1) {
                if (i6 == 1) {
                    r0 = (AnonymousClass0OL) r8.A03;
                } else {
                    r0 = AnonymousClass0OL.A03;
                }
                str3 = r0.A01;
            } else if (c == 2) {
                if (i6 == 2) {
                    r05 = (AnonymousClass0ON) r8.A03;
                } else {
                    r05 = AnonymousClass0ON.A03;
                }
                str3 = r05.A01;
            } else if (c != 3) {
                str3 = str6;
            } else {
                if (i6 == 3) {
                    r06 = (AnonymousClass0OM) r8.A03;
                } else {
                    r06 = AnonymousClass0OM.A03;
                }
                str3 = r06.A01;
            }
            String A082 = C003701u.A08(str3, 50);
            if (!TextUtils.isEmpty(A082)) {
                int i7 = r8.A01;
                if (i7 == 1) {
                    i3 = 1;
                } else {
                    i3 = 3;
                    if (i7 == 2) {
                        i3 = 2;
                    }
                }
                if (i3 == 1) {
                    if (i7 == 1) {
                        r02 = (AnonymousClass0OL) r8.A03;
                    } else {
                        r02 = AnonymousClass0OL.A03;
                    }
                    str6 = r02.A02;
                } else if (i3 == 2) {
                    if (i7 == 2) {
                        r03 = (AnonymousClass0ON) r8.A03;
                    } else {
                        r03 = AnonymousClass0ON.A03;
                    }
                    str6 = r03.A02;
                } else if (i3 == 3) {
                    if (i7 == 3) {
                        r04 = (AnonymousClass0OM) r8.A03;
                    } else {
                        r04 = AnonymousClass0OM.A03;
                    }
                    str6 = r04.A02;
                }
                arrayList.add(new AnonymousClass0OJ(A082, str6, i3, false, i5));
            }
        }
        ArrayList arrayList2 = null;
        if (arrayList.size() > 0) {
            arrayList2 = arrayList;
            if (arrayList.size() > 5) {
                return null;
            }
        }
        return A0z(r21, r22, str2, str4, str5, arrayList2, str, r24, j, userJid, l, i, z, z2, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: X.0ML */
    /* JADX DEBUG: Multi-variable search result rejected for r14v5, resolved type: X.0ML */
    /* JADX DEBUG: Multi-variable search result rejected for r14v7, resolved type: X.0M2 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: X.0MJ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d1, code lost:
        if (r22.A0I().A0I() == X.EnumC69913Ja.A04) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d3, code lost:
        r3 = (X.C05470Or) r21.A02(new X.C007303n(r28, false, r27), r29, (byte) 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e2, code lost:
        if (r22.A01 != 1) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e4, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01e6, code lost:
        if (r7 == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e8, code lost:
        r1 = r22.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ee, code lost:
        if (r1.A01 != 5) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f0, code lost:
        r0 = (X.C76313eL) r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01f4, code lost:
        r3.A0z(r0, r35);
        A2y(r3, r24, r25, r26, r31, r32, r33);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0206, code lost:
        r0 = X.C76313eL.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0209, code lost:
        r1 = r22.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x020b, code lost:
        if (r1 != null) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x020d, code lost:
        r1 = X.AnonymousClass0OH.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r0.A0I() == X.EnumC69923Jb.A03) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0211, code lost:
        if (r1.A01 != 5) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0213, code lost:
        r0 = (X.C76313eL) r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0218, code lost:
        r0 = X.C76313eL.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0225, code lost:
        com.whatsapp.util.Log.e("HSMTemplateMessageUtil/buildFMessage/error cannot build any message.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x022a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r22.A0I().A0I() == X.EnumC69913Ja.A01) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r22.A0I().A0I() == X.EnumC69913Ja.A03) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x011d, code lost:
        if (r13.A0I() == X.EnumC69923Jb.A04) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x012b, code lost:
        if (r22.A0I().A0I() == X.EnumC69913Ja.A02) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x014b, code lost:
        if (r3 != null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0159, code lost:
        if (r22.A0I().A0I() == X.EnumC69913Ja.A05) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x016d, code lost:
        if (r22.A0I().A0I() == X.EnumC69913Ja.A06) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018f A[Catch:{ 2xf -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01a9 A[Catch:{ 2xf -> 0x01c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AbstractC007503q A0z(X.AnonymousClass0AL r21, X.AnonymousClass0OG r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.lang.String r27, X.AnonymousClass02N r28, long r29, com.whatsapp.jid.UserJid r31, java.lang.Long r32, int r33, boolean r34, boolean r35, int r36) {
        /*
        // Method dump skipped, instructions count: 555
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A0z(X.0AL, X.0OG, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, X.02N, long, com.whatsapp.jid.UserJid, java.lang.Long, int, boolean, boolean, int):X.03q");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11220fu A10(X.AnonymousClass009 r6, X.AnonymousClass0M5 r7, X.AnonymousClass0M5 r8) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A10(X.009, X.0M5, X.0M5):X.0fu");
    }

    public static VoipStanzaChildNode A11(VoipStanzaChildNode voipStanzaChildNode, AnonymousClass02P r9, byte b) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        VoipStanzaChildNode voipStanzaChildNode2 = null;
        if (r9 != null) {
            voipStanzaChildNode2 = VoipStanzaChildNode.fromProtocolTreeNode(AnonymousClass0OT.A02(r9, b, null, null));
        }
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode3 : childrenCopy) {
                if ("enc".equals(voipStanzaChildNode3.tag)) {
                    voipStanzaChildNode3 = voipStanzaChildNode2;
                }
                if (voipStanzaChildNode3 != null) {
                    builder.addChild(voipStanzaChildNode3);
                }
            }
        }
        return builder.build();
    }

    public static VoipStanzaChildNode A12(VoipStanzaChildNode voipStanzaChildNode, String str) {
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy == null) {
            return null;
        }
        for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
            if (str.equals(voipStanzaChildNode2.tag)) {
                return voipStanzaChildNode2;
            }
        }
        return null;
    }

    public static VoipStanzaChildNode A13(VoipStanzaChildNode voipStanzaChildNode, VoipStanzaChildNode[] voipStanzaChildNodeArr) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("destination".equals(voipStanzaChildNode2.tag)) {
                    if (voipStanzaChildNodeArr != null) {
                        VoipStanzaChildNode.Builder builder2 = new VoipStanzaChildNode.Builder("destination");
                        builder2.addChildren(voipStanzaChildNodeArr);
                        voipStanzaChildNode2 = builder2.build();
                    }
                }
                if (voipStanzaChildNode2 != null) {
                    builder.addChild(voipStanzaChildNode2);
                }
            }
        }
        return builder.build();
    }

    public static VoipStanzaChildNode A14(AnonymousClass0OU r9, Map map) {
        ArrayList arrayList;
        boolean z = false;
        AnonymousClass02P r4 = null;
        VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
        r4 = null;
        if (r9.A02 != null) {
            Set keySet = r9.A06.keySet();
            VoipStanzaChildNode voipStanzaChildNode = r9.A03;
            if (map == null) {
                AnonymousClass00E.A08(true ^ keySet.isEmpty(), "no destination jids");
                arrayList = new ArrayList(keySet);
            } else {
                AnonymousClass00E.A08(map.keySet().equals(keySet), "some device are not encrypted!");
                arrayList = null;
            }
            AbstractList abstractList = (AbstractList) AnonymousClass0OT.A07(Collections.emptyMap(), null, arrayList, map, 0, null, null, false);
            if (!abstractList.isEmpty()) {
                voipStanzaChildNodeArr = new VoipStanzaChildNode[abstractList.size()];
                for (int i = 0; i < abstractList.size(); i++) {
                    voipStanzaChildNodeArr[i] = VoipStanzaChildNode.fromProtocolTreeNode((AnonymousClass0M5) abstractList.get(i));
                }
            }
            return A13(voipStanzaChildNode, voipStanzaChildNodeArr);
        }
        if (map == null || map.size() == 1) {
            z = true;
        }
        AnonymousClass00E.A08(z, "cannot have multiple encrypted messages in old format!");
        if (map != null && map.size() == 1) {
            DeviceJid of = DeviceJid.of(r9.A01);
            if (of != null) {
                Object obj = map.get(of);
                if (obj != null) {
                    r4 = (AnonymousClass02P) obj;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return A11(r9.A03, r4, r9.A00);
    }

    public static C29141Xf A15(C29241Xq r13, AnonymousClass0H3 r14, AnonymousClass08D r15) {
        String str;
        C49932St A012;
        if (!r13.A01() || (A012 = r14.A01(r13.A0A)) == null) {
            int i = r13.A00;
            if (i == 0 && (str = r13.A07) != null) {
                i = (int) new File(str).length();
            }
            String str2 = r13.A0D;
            String str3 = r13.A06;
            String str4 = r13.A05;
            String str5 = r13.A0A;
            C29141Xf r3 = new C29141Xf(str2, str3, str4, str5, r13.A09, r13.A08, i, r13.A03, r13.A02);
            synchronized (r15.A0F) {
                AnonymousClass08V r1 = r15.A01;
                if (r1 == null) {
                    r1 = new AnonymousClass08V(60);
                    r15.A01 = r1;
                }
                r1.A07(str5, r13);
            }
            return r3;
        }
        String str6 = null;
        byte[] bArr = A012.A00;
        if (bArr != null && bArr.length > 0) {
            str6 = Base64.encodeToString(bArr, 3);
        }
        return new C29141Xf(A012.A09, A012.A05, A012.A04, A012.A06, A012.A08, str6, A012.A01, A012.A03, A012.A02);
    }

    public static AnonymousClass352 A16(InputStream inputStream) {
        AnonymousClass3S1 r5;
        try {
            JSONObject A0Q = C006803i.A0Q(inputStream);
            if (A0Q != null) {
                int i = A0Q.getInt("policyVersion");
                JSONObject optJSONObject = A0Q.optJSONObject("banner");
                if (optJSONObject == null) {
                    r5 = null;
                } else {
                    String string = optJSONObject.getString("text");
                    String string2 = optJSONObject.getString("iconDescription");
                    String string3 = optJSONObject.getString("action");
                    JSONObject jSONObject = optJSONObject.getJSONObject("icon");
                    r5 = new AnonymousClass3S1(string, jSONObject.getString("light"), jSONObject.getString("dark"), string2, string3, A18(optJSONObject.getJSONObject("timing")));
                }
                return new AnonymousClass352(i, r5, A19(A0Q.optJSONObject("modal"), true), A19(A0Q.optJSONObject("blocking-modal"), false));
            }
            throw null;
        } catch (IOException | JSONException e) {
            Log.e("Failed to parse user notice content", e);
            return null;
        }
    }

    public static AnonymousClass355 A17(int i, AnonymousClass352 r3) {
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                AnonymousClass3S1 r0 = r3.A01;
                if (r0 != null) {
                    return r0.A00;
                }
            } else if (i == 3) {
                AnonymousClass3S4 r02 = r3.A03;
                if (r02 != null) {
                    return r02.A00;
                }
                return null;
            } else if (i == 4) {
                AnonymousClass3S4 r03 = r3.A02;
                if (r03 != null) {
                    return r03.A00;
                }
                return null;
            } else if (i != 5) {
                throw new IllegalStateException(AnonymousClass008.A0F("Unexpected value: ", i));
            }
        }
        return null;
    }

    public static AnonymousClass355 A18(JSONObject jSONObject) {
        AnonymousClass354 r6;
        AnonymousClass354 r2;
        JSONObject optJSONObject = jSONObject.optJSONObject("start");
        if (optJSONObject == null) {
            r6 = null;
        } else {
            r6 = new AnonymousClass354(optJSONObject.getString("reference"), optJSONObject.getString("time"));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("duration");
        AnonymousClass353 r9 = null;
        long[] jArr = null;
        if (optJSONObject2 != null) {
            int optInt = optJSONObject2.optInt("static", -1);
            long j = -1;
            if (optInt != -1) {
                j = ((long) optInt) * 3600000;
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("repeat");
            if (optJSONArray != null) {
                jArr = new long[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    jArr[i] = ((long) optJSONArray.getInt(i)) * 3600000;
                }
            }
            r9 = new AnonymousClass353(j, jArr);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("end");
        if (optJSONObject3 == null) {
            r2 = null;
        } else {
            r2 = new AnonymousClass354(optJSONObject3.getString("reference"), optJSONObject3.getString("time"));
        }
        return new AnonymousClass355(r6, r9, r2);
    }

    public static AnonymousClass3S4 A19(JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("iconDescription");
        String string3 = jSONObject.getString("buttonText");
        JSONObject jSONObject2 = jSONObject.getJSONObject("icon");
        String string4 = jSONObject2.getString("light");
        String string5 = jSONObject2.getString("dark");
        AnonymousClass355 A18 = A18(jSONObject.getJSONObject("timing"));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("bullets");
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            String string6 = jSONObject3.getString("text");
            JSONObject optJSONObject = jSONObject3.optJSONObject("icon");
            if (optJSONObject != null) {
                str3 = optJSONObject.getString("light");
                str2 = optJSONObject.getString("dark");
            } else {
                str2 = str3;
            }
            arrayList.add(new AnonymousClass358(string6, str3, str2));
            i++;
            str3 = null;
        }
        String optString = jSONObject.optString("body");
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        String optString2 = jSONObject.optString("footer");
        if (TextUtils.isEmpty(optString2)) {
            optString2 = null;
        }
        if (z) {
            str = jSONObject.getString("dismissText");
        } else {
            str = null;
        }
        return new AnonymousClass3S4(string4, string5, string2, string, arrayList, string3, A18, optString, optString2, str);
    }

    public static AnonymousClass0OV A1A(AnonymousClass01X r17, long j) {
        String format;
        double d = (double) j;
        int i = 0;
        while (i < 3 && d > 1000.0d) {
            d /= 1000.0d;
            i++;
        }
        Locale A0I = r17.A0I();
        String str = "";
        int i2 = 279;
        boolean z = true;
        if (j == 0) {
            format = String.format(A0I, "%d", 0);
            str = String.format(Locale.US, "%d", 0);
        } else if (i == 0) {
            Double valueOf = Double.valueOf(d / 1000.0d);
            format = String.format(A0I, "%1$.1f", valueOf);
            str = String.format(Locale.US, "%1$.1f", valueOf);
        } else if (i == 1) {
            Double valueOf2 = Double.valueOf(d);
            format = String.format(A0I, "%1$.0f", valueOf2);
            str = String.format(Locale.US, "%1$.0f", valueOf2);
        } else if (i == 2) {
            Double valueOf3 = Double.valueOf(d);
            format = String.format(A0I, "%1$.1f", valueOf3);
            str = String.format(Locale.US, "%1$.1f", valueOf3);
            i2 = 280;
        } else if (i != 3) {
            format = str;
        } else {
            Double valueOf4 = Double.valueOf(d);
            format = String.format(A0I, "%1$.1f", valueOf4);
            str = String.format(Locale.US, "%1$.1f", valueOf4);
            i2 = 275;
        }
        String A032 = r17.A02().A02.A03(i2, str);
        int indexOf = A032.indexOf("%1$s");
        if (indexOf == -1) {
            z = false;
        }
        AnonymousClass00E.A07(z);
        return new AnonymousClass0OV(A032.substring(0, indexOf), format, A032.substring(indexOf + 4));
    }

    public static Byte A1B(VoipStanzaChildNode voipStanzaChildNode) {
        AnonymousClass0OS[] attributesCopy = voipStanzaChildNode.getAttributesCopy();
        byte b = 0;
        if (attributesCopy == null) {
            return (byte) 0;
        }
        int length = attributesCopy.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AnonymousClass0OS r2 = attributesCopy[i];
            if ("count".equals(r2.A02)) {
                try {
                    b = Byte.parseByte(r2.A03);
                    break;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    public static CharSequence A1C(AnonymousClass03P r2, AnonymousClass022 r3, CharSequence charSequence) {
        return A1D(r2, r3, charSequence, false, -16777216);
    }

    public static CharSequence A1D(AnonymousClass03P r16, AnonymousClass022 r17, CharSequence charSequence, boolean z, int i) {
        int i2;
        int i3;
        ParcelableSpan styleSpan;
        int codePointAt;
        int[] iArr = null;
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        Editable editable = null;
        ArrayList arrayList = null;
        int i4 = 0;
        char c = ' ';
        char c2 = ' ';
        int i5 = -1;
        int i6 = -1;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '*' && i4 < length - 1 && ((codePointAt = Character.codePointAt(charSequence, i4 + 1)) == 8419 || codePointAt == 65039)) {
                charAt = ' ';
            } else if (charAt == '*' || charAt == '_' || charAt == '~') {
                if (iArr == null) {
                    iArr = new int[3];
                    int i7 = 0;
                    do {
                        iArr[i7] = -1;
                        i7++;
                    } while (i7 < 3);
                }
                if (charAt == '*') {
                    i2 = 0;
                } else {
                    i2 = 2;
                    if (charAt == '_') {
                        i2 = 1;
                    }
                }
                if (iArr[i2] < 0 && c != charAt && (Character.isWhitespace(c) || c == '_' || c == '~' || c == '*')) {
                    int i8 = i4 + 1;
                    if (i8 < length && !Character.isWhitespace(charSequence.charAt(i8))) {
                        iArr[i2] = i8;
                    }
                } else if (iArr[i2] >= 0 && !Character.isWhitespace(c) && (i4 == length - 1 || !Character.isLetterOrDigit(Character.codePointAt(charSequence, i4 + 1)))) {
                    if (iArr[i2] < i4) {
                        if (editable == null) {
                            if (charSequence instanceof Editable) {
                                editable = (Editable) charSequence;
                            } else {
                                editable = new SpannableStringBuilder(charSequence);
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        int i9 = iArr[i2];
                        if (charAt != '*') {
                            if (charAt == '_') {
                                styleSpan = new StyleSpan(2);
                            } else if (charAt != '~') {
                                styleSpan = null;
                            } else {
                                styleSpan = new StrikethroughSpan();
                            }
                            i3 = 1;
                        } else {
                            i3 = 1;
                            styleSpan = new StyleSpan(1);
                        }
                        arrayList.add(new AnonymousClass0OW(i9, i4, i3, styleSpan));
                        int size = arrayList.size();
                        int i10 = 1024;
                        if (A0A(r17, r16) < 2011) {
                            i10 = 512;
                        }
                        if (size >= i10) {
                            break;
                        }
                    }
                    for (int i11 = 0; i11 < iArr.length; i11++) {
                        if (i11 != i2 && iArr[i2] < iArr[i11]) {
                            iArr[i11] = -1;
                        }
                    }
                    if (iArr[i2] < i6) {
                        i6 = -1;
                    }
                    iArr[i2] = -1;
                }
            } else if (charAt == '`') {
                if (c == '`' && c2 == '`' && (i5 < 0 || i5 < i4 - 2)) {
                    if (i6 < 0) {
                        i6 = i4 + 1;
                    } else {
                        int i12 = i4 - 2;
                        if (i6 >= i12) {
                            continue;
                        } else {
                            if (editable == null) {
                                if (charSequence instanceof Editable) {
                                    editable = (Editable) charSequence;
                                } else {
                                    editable = new SpannableStringBuilder(charSequence);
                                }
                            }
                            int i13 = i6;
                            while (true) {
                                if (i13 >= i12) {
                                    continue;
                                    break;
                                } else if (!Character.isWhitespace(charSequence.charAt(i13))) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(new AnonymousClass0OW(i6, i12, 3, new TypefaceSpan("monospace")));
                                    A2e(editable, i6 - 3, i4 + 1, AnonymousClass0OX.class);
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        AnonymousClass0OW r4 = (AnonymousClass0OW) it.next();
                                        if (r4.A00 > i6 - 1 && r4.A01 < i12) {
                                            arrayList2.add(r4);
                                        }
                                    }
                                    arrayList.removeAll(arrayList2);
                                    if (iArr != null) {
                                        for (int i14 = 0; i14 < iArr.length; i14++) {
                                            iArr[i14] = -1;
                                        }
                                    }
                                    int size2 = arrayList.size();
                                    int i15 = 1024;
                                    if (A0A(r17, r16) < 2011) {
                                        i15 = 512;
                                    }
                                    if (size2 >= i15) {
                                        break;
                                    }
                                    i5 = i4;
                                    i6 = -1;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                }
            } else if (charAt == '\n' && iArr != null) {
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    iArr[i16] = -1;
                }
            }
            i4++;
            c2 = c;
            c = charAt;
        }
        if (editable == null) {
            return charSequence;
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AnonymousClass0OW r6 = (AnonymousClass0OW) it2.next();
                if (z) {
                    int i17 = 855638016 | (i & 16777215);
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i17);
                    int i18 = r6.A00;
                    int i19 = r6.A02;
                    editable.setSpan(foregroundColorSpan, i18 - i19, i18, 18);
                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i17);
                    int i20 = r6.A01;
                    editable.setSpan(foregroundColorSpan2, i20, i19 + i20, 18);
                } else {
                    int i21 = r6.A00;
                    int i22 = r6.A02;
                    editable.replace(i21 - i22, i21, "");
                    A38(arrayList, r6.A00 - i22, i22);
                    int i23 = r6.A01;
                    editable.replace(i23, i22 + i23, "");
                    A38(arrayList, r6.A01, i22);
                }
                editable.setSpan(r6.A03, r6.A00, r6.A01, 17);
            }
        }
        return editable;
    }

    public static CharSequence A1E(AnonymousClass01X r6, long j) {
        int i;
        String A0e;
        int A002 = AnonymousClass0OY.A00(System.currentTimeMillis(), j);
        if (A002 == 0) {
            i = R.string.web_session_last_today_at;
        } else if (A002 == 1) {
            i = R.string.web_session_last_yesterday_at;
        } else {
            if (AnonymousClass0OY.A07(System.currentTimeMillis(), j)) {
                A0e = C001801b.A0a(r6, j);
            } else {
                A0e = C001801b.A0e(r6, j);
            }
            return r6.A0D(R.string.web_session_last_date, AnonymousClass0OY.A05(r6, A0e, AnonymousClass0OZ.A00(r6, j)));
        }
        return AnonymousClass0OZ.A01(r6, r6.A0D(i, AnonymousClass0OZ.A00(r6, j)), j);
    }

    public static CharSequence A1F(AnonymousClass01X r8, long j) {
        String str;
        int A002 = AnonymousClass0OY.A00(System.currentTimeMillis(), j);
        if (A002 == 0) {
            int currentTimeMillis = (int) ((System.currentTimeMillis() - j) / 60000);
            if (currentTimeMillis < 1) {
                return r8.A06(R.string.just_now);
            }
            if (currentTimeMillis < 60) {
                return r8.A09(269, (long) currentTimeMillis, String.format(r8.A0I(), "%d", Integer.valueOf(currentTimeMillis)));
            }
            str = C001801b.A0Y(r8);
        } else if (A002 == 1) {
            str = C001801b.A0Z(r8);
        } else if (AnonymousClass0OY.A07(System.currentTimeMillis(), j)) {
            str = C001801b.A0a(r8, j);
        } else {
            str = C001801b.A0e(r8, j);
        }
        return AnonymousClass0OY.A05(r8, str, AnonymousClass0OZ.A00(r8, j));
    }

    public static CharSequence A1G(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        AnonymousClass0M6 r3 = new AnonymousClass0M6(charSequence);
        int i4 = 0;
        int i5 = i;
        while (i5 < i2) {
            r3.A00 = i5;
            i5 += r3.A01(i5, EmojiDescriptor.A00(r3, false));
            i4++;
            if (i4 >= i3) {
                return charSequence.subSequence(i, i5);
            }
        }
        return null;
    }

    public static CharSequence A1H(CharSequence charSequence, Context context, Paint paint, C02590Cr r8) {
        SpannableStringBuilder A0g = A0g(charSequence, context, paint, 1.0f, null, r8);
        return A0g != null ? A0g : charSequence;
    }

    public static CharSequence A1I(CharSequence charSequence, Context context, Paint paint, AbstractC05230Ns r7, C02590Cr r8) {
        SpannableStringBuilder A0g = A0g(charSequence, context, paint, 1.0f, r7, r8);
        int A77 = r7.A77();
        if (A77 <= 0) {
            return A0g != null ? A0g : charSequence;
        }
        if (A0g == null) {
            A0g = new SpannableStringBuilder(charSequence);
        }
        SpannableStringBuilder delete = A0g.delete((Character.charCount(Character.codePointAt(charSequence, A77 - 1)) - 1) + A77, A0g.length());
        delete.append((CharSequence) "…");
        return delete;
    }

    public static CharSequence A1J(CharSequence charSequence, Context context, C02590Cr r4) {
        SpannableStringBuilder A0h = A0h(charSequence, context, C05310Oa.A01(context.getApplicationContext()), null, r4);
        return A0h != null ? A0h : charSequence;
    }

    public static Double A1K(AnonymousClass0M5 r0, String str) {
        AnonymousClass0M5 A0D = r0.A0D(str);
        if (A0D == null) {
            return null;
        }
        byte[] bArr = A0D.A01;
        if (AnonymousClass0M5.A00(bArr) != null) {
            return Double.valueOf(Double.parseDouble(AnonymousClass0M5.A00(bArr)));
        }
        return null;
    }

    public static Integer A1L(AnonymousClass0J9 r3) {
        if (r3 == null) {
            return null;
        }
        String str = r3.A07;
        if (str != null && str.startsWith("smb:")) {
            return 2;
        }
        if (r3.A01()) {
            return 3;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A1M(X.AnonymousClass03P r1, X.AnonymousClass03S r2) {
        /*
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r0 = r2.A02(r0)
            r2 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "phonebook/getCount/permission_denied"
            com.whatsapp.util.Log.i(r0)
            return r2
        L_0x000f:
            java.lang.String r0 = "phonebook/get_count/"
            android.database.Cursor r1 = X.AnonymousClass0RQ.A00(r1, r0)
            if (r1 == 0) goto L_0x0027
            int r0 = r1.getCount()     // Catch:{ all -> 0x0020 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A1M(X.03P, X.03S):java.lang.Integer");
    }

    public static String A1O(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = 640;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else if (i2 >= 24) {
            i = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(string);
        return sb.toString();
    }

    public static String A1P(AnonymousClass009 r1, File file) {
        try {
            return A1Q(r1, file, MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A1Q(X.AnonymousClass009 r1, java.io.File r2, java.security.MessageDigest r3) {
        /*
            java.io.FileInputStream r0 = X.C02230Bd.A0M(r1, r2)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r0)
            A32(r2, r3)     // Catch:{ all -> 0x0019 }
            byte[] r1 = r3.digest()     // Catch:{ all -> 0x0019 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0019 }
            r2.close()
            return r0
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A1Q(X.009, java.io.File, java.security.MessageDigest):java.lang.String");
    }

    public static String A1R(AnonymousClass00S r8, C05320Ob r9) {
        if (r9 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("auth_token", r9.A08);
            jSONObject.put("conn_ttl", r9.A05);
            jSONObject.put("auth_ttl", r9.A03);
            jSONObject.put("max_buckets", r9.A06);
            List<C05330Oc> list = r9.A0A;
            JSONArray jSONArray = new JSONArray();
            for (C05330Oc r5 : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("hostname", r5.A04);
                jSONObject2.put("ip4", r5.A05);
                jSONObject2.put("ip6", r5.A06);
                jSONObject2.put("class", r5.A07);
                jSONObject2.put("fallback_hostname", r5.A00);
                jSONObject2.put("fallback_ip4", r5.A01);
                jSONObject2.put("fallback_ip6", r5.A02);
                jSONObject2.put("fallback_class", r5.A03);
                jSONObject2.put("upload", A2K(r5.A0B));
                jSONObject2.put("download", A2K(r5.A09));
                jSONObject2.put("download_buckets", A2K(r5.A0A));
                jSONObject2.put("type", r5.A08);
                jSONObject2.put("force_ip", r5.A0C);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("hosts", jSONArray);
            jSONObject.put("send_time_abs_ms", r8.A05() + (r9.A07 - r8.A03()));
            jSONObject.put("last_id", r9.A09);
            jSONObject.put("is_new", r9.A0B);
            jSONObject.put("max_autodownload_retry", r9.A00);
            jSONObject.put("max_manual_retry", r9.A01);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e("routingresponse/can't serialize json", e);
            return null;
        }
    }

    public static String A1S(AnonymousClass01X r8, int i, int i2) {
        int i3;
        if (i2 != 7) {
            switch (i2) {
                case 0:
                    i3 = 287;
                    return r8.A09(i3, (long) i, String.format(r8.A0I(), "%d", Integer.valueOf(i)));
                case 1:
                    i3 = 281;
                    return r8.A09(i3, (long) i, String.format(r8.A0I(), "%d", Integer.valueOf(i)));
                case 2:
                    i3 = 276;
                    return r8.A09(i3, (long) i, String.format(r8.A0I(), "%d", Integer.valueOf(i)));
                case 3:
                    i3 = 273;
                    return r8.A09(i3, (long) i, String.format(r8.A0I(), "%d", Integer.valueOf(i)));
                case 4:
                    i3 = 290;
                    return r8.A09(i3, (long) i, String.format(r8.A0I(), "%d", Integer.valueOf(i)));
                case 5:
                    i3 = 284;
                    return r8.A09(i3, (long) i, String.format(r8.A0I(), "%d", Integer.valueOf(i)));
                case 6:
                    i3 = 292;
                    return r8.A09(i3, (long) i, String.format(r8.A0I(), "%d", Integer.valueOf(i)));
            }
        } else if (i == -1) {
            return r8.A06(R.string.mute_always);
        }
        throw new IllegalArgumentException("Invalid duration unit");
    }

    public static String A1T(AnonymousClass01X r8, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = 283;
        } else if (i2 == 2) {
            i3 = 278;
        } else {
            throw new IllegalArgumentException("Invalid or unsupported duration unit");
        }
        return r8.A09(i3, (long) i, String.format(r8.A0I(), "%d", Integer.valueOf(i)));
    }

    public static String A1U(AnonymousClass01X r5, int i, long j) {
        String A042 = r5.A04();
        if ("en".equals(A042) || "de".equals(A042) || "es".equals(A042)) {
            if (i <= 30) {
                return r5.A0D(R.string.time_and_date, AnonymousClass0OY.A05(r5, C001801b.A0b(r5, j), AnonymousClass0OZ.A00(r5, j)));
            }
            return r5.A0D(R.string.date, C001801b.A1C(r5).format(new Date(j)));
        } else if (i <= 30) {
            return r5.A0D(R.string.time_and_date, AnonymousClass0OY.A05(r5, C001801b.A0e(r5, j), AnonymousClass0OZ.A00(r5, j)));
        } else {
            return r5.A0D(R.string.date, C001801b.A0e(r5, j));
        }
    }

    public static String A1V(AnonymousClass01X r6, int i, long j, boolean z) {
        String A022;
        Pair A0i = A0i(r6, j, z);
        String str = (String) A0i.second;
        int i2 = 1;
        Object[] objArr = {A0i.first};
        Locale A0I = r6.A0I();
        C05300Nz A023 = r6.A02();
        if (A023.A07) {
            if (!str.equals("1")) {
                i2 = 2;
            }
            A022 = r6.A00.getResources().getQuantityString(i, i2);
        } else {
            A022 = A023.A03.A02(i, true, str);
            if (A022 == null) {
                try {
                    i2 = (int) Double.parseDouble(str);
                } catch (NumberFormatException unused) {
                }
                A022 = r6.A00.getResources().getQuantityString(i, i2);
            }
        }
        return String.format(A0I, A022, objArr);
    }

    public static String A1W(AnonymousClass01X r15, long j) {
        long j2;
        long j3;
        String A052;
        String str;
        int i;
        if (j >= 3600) {
            j2 = j / 3600;
            j -= 3600 * j2;
        } else {
            j2 = 0;
        }
        if (j >= 60) {
            j3 = j / 60;
            j -= 60 * j3;
        } else {
            j3 = 0;
        }
        if (j2 > 0) {
            A052 = r15.A05(220);
        } else {
            A052 = r15.A05(221);
        }
        int length = A052.length();
        StringBuilder sb = new StringBuilder(length);
        Locale A0I = r15.A0I();
        int i2 = 0;
        while (i2 < length) {
            char charAt = A052.charAt(i2);
            if (charAt == 'h' || charAt == 'm' || charAt == 's') {
                int i3 = i2 + 1;
                if (i3 >= length || A052.charAt(i3) != charAt) {
                    str = "%d";
                    i3 = i2;
                } else {
                    str = "%02d";
                }
                if (charAt == 'h') {
                    i = 1;
                    sb.append(String.format(A0I, str, Long.valueOf(j2)));
                } else if (charAt != 'm') {
                    i = 1;
                    if (charAt == 's') {
                        sb.append(String.format(A0I, str, Long.valueOf(j)));
                    }
                } else {
                    i = 1;
                    sb.append(String.format(A0I, str, Long.valueOf(j3)));
                }
                i2 = i3;
            } else {
                sb.append(charAt);
                i = 1;
            }
            i2 += i;
        }
        return sb.toString();
    }

    public static String A1X(AnonymousClass01X r10, long j) {
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        int i = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i2 = (int) (j2 / 60000);
        String A1S = A1S(r10, (int) ((j2 % 60000) / 1000), 0);
        if (i > 0) {
            return r10.A0C(237, r10.A0C(242, A1S(r10, i, 2), A1S(r10, i2, 1)), A1S);
        } else if (i2 <= 0) {
            return A1S;
        } else {
            return r10.A0C(243, A1S(r10, i2, 1), A1S);
        }
    }

    public static String A1Y(AnonymousClass01X r1, long j) {
        return (String) A0i(r1, j, false).first;
    }

    public static String A1Z(AnonymousClass01X r13, long j) {
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        if (j3 - (60000 * j4) > 0) {
            j4++;
        }
        if (j4 == 60) {
            j2++;
            j4 = 0;
        }
        if (j2 == 0) {
            int i = (int) j4;
            return r13.A0A(R.plurals.time_left, (long) i, A1S(r13, i, 1));
        }
        Object[] objArr = {A1T(r13, (int) j2, 2), A1T(r13, (int) j4, 1)};
        return r13.A0A(R.plurals.time_left, (long) ((int) (j2 + j4)), r13.A0C(238, objArr));
    }

    public static String A1a(AnonymousClass01X r12, long j) {
        long j2 = j / 3600000;
        long j3 = (j - (3600000 * j2)) / 60000;
        if (j2 == 0) {
            if (j3 == 0) {
                return A1S(r12, (int) (j / 1000), 0);
            }
            return A1S(r12, (int) j3, 1);
        } else if (j3 == 0) {
            return A1S(r12, (int) j2, 2);
        } else {
            return r12.A0C(243, A1S(r12, (int) j2, 2), A1S(r12, (int) j3, 1));
        }
    }

    public static String A1b(AnonymousClass01X r0, long j) {
        AnonymousClass0OV A1A = A1A(r0, j);
        StringBuilder sb = new StringBuilder();
        sb.append(A1A.A01);
        sb.append(A1A.A02);
        sb.append(A1A.A00);
        return sb.toString();
    }

    public static String A1c(AnonymousClass01X r2, long j) {
        int A002 = AnonymousClass0OY.A00(System.currentTimeMillis(), j);
        if (A002 == 0) {
            return C001801b.A0Y(r2);
        }
        if (A002 == 1) {
            return C001801b.A0Z(r2);
        }
        return C001801b.A0d(r2, j);
    }

    public static String A1d(AnonymousClass01X r5, long j, int i, int i2, int i3, Object... objArr) {
        Object[] copyOf;
        String A0e;
        int A002 = AnonymousClass0OY.A00(System.currentTimeMillis(), j);
        int length = objArr.length;
        if (length == 0) {
            copyOf = new String[1];
        } else {
            copyOf = Arrays.copyOf(objArr, length + 1);
        }
        if (A002 == 0 || A002 == 1) {
            copyOf[length] = r5.A0E(AnonymousClass0OZ.A00(r5, j));
            if (A002 != 0) {
                i = i2;
            }
            return AnonymousClass0OZ.A01(r5, r5.A0D(i, copyOf), j);
        }
        if (A002 <= 30) {
            A0e = AnonymousClass0OY.A05(r5, C001801b.A0e(r5, j), AnonymousClass0OZ.A00(r5, j));
        } else {
            A0e = C001801b.A0e(r5, j);
        }
        copyOf[length] = r5.A0E(A0e);
        return String.format(r5.A0I(), r5.A06(i3), copyOf);
    }

    public static String A1e(AnonymousClass01X r2, long j, boolean z) {
        int A002 = AnonymousClass0OY.A00(System.currentTimeMillis(), j);
        if (A002 == 0) {
            return AnonymousClass0OZ.A00(r2, j);
        }
        if (A002 == 1) {
            return C001801b.A0Z(r2);
        }
        if (z) {
            return C001801b.A1A(r2).format(new Date(j));
        }
        return C001801b.A0e(r2, j);
    }

    public static String A1f(AnonymousClass01X r2, AbstractC007503q r3) {
        if (!AnonymousClass0FI.A0g(r3)) {
            return null;
        }
        String A0w = ((AnonymousClass0M3) r3).A0w();
        if (TextUtils.isEmpty(A0w)) {
            return r2.A06(R.string.conversations_most_recent_contact);
        }
        return C006803i.A0L(A0w);
    }

    public static String A1g(AnonymousClass01X r9, boolean z, List list) {
        int size = list.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return r9.A0E((String) list.get(0));
        }
        if (size != 2) {
            String A0C = r9.A0C(235, r9.A0E((String) list.get(0)), r9.A0E((String) list.get(1)));
            for (int i = 2; i < list.size() - 1; i++) {
                A0C = r9.A0C(234, A0C, r9.A0E((String) list.get(i)));
            }
            if (z) {
                return r9.A0C(233, A0C, r9.A0E((String) list.get(size - 1)));
            }
            return r9.A0D(R.string.list_end_short, A0C, r9.A0E((String) list.get(size - 1)));
        } else if (z) {
            return r9.A0C(236, r9.A0E((String) list.get(0)), r9.A0E((String) list.get(1)));
        } else {
            return r9.A0D(R.string.list_two_items_short, r9.A0E((String) list.get(0)), r9.A0E((String) list.get(1)));
        }
    }

    public static String A1h(GroupJid groupJid, List list, AnonymousClass01A r8, AnonymousClass01T r9, C014308b r10) {
        C007003k A082;
        AnonymousClass02X r0;
        if (groupJid == null || (A082 = r8.A08(groupJid)) == null || (r0 = (AnonymousClass02X) A082.A02(AnonymousClass02U.class)) == null) {
            return null;
        }
        C05350Oe A032 = r9.A01(r0).A03();
        for (Object obj : list) {
            if (!A032.A00.contains(obj)) {
                return null;
            }
        }
        return r10.A04(A082);
    }

    public static String A1i(AnonymousClass0M5 r0, String str) {
        AnonymousClass0M5 A0D = r0.A0D(str);
        if (A0D != null) {
            return AnonymousClass0M5.A00(A0D.A01);
        }
        return null;
    }

    public static String A1j(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        AnonymousClass0M6 r6 = new AnonymousClass0M6(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            r6.A00 = i;
            int A002 = EmojiDescriptor.A00(r6, false);
            int A012 = r6.A01(i, A002);
            if (A002 != -1) {
                for (int i2 = 0; i2 < ((A002 >> 12) & 7); i2++) {
                    sb.append(' ');
                }
            } else {
                sb.append(charSequence.subSequence(i, i + A012));
            }
            i += A012;
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ae, code lost:
        if (r8.equals("sr-BA") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b8, code lost:
        if (r8.equals("sr-XK") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c5, code lost:
        if (r8.equals("ta-MY") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c7, code lost:
        return "ta-IN";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        return "ar-EG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        return "fr-FR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        return "fr-FR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        return "sq-AL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        return "sq-AL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        return "sr-RS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        return "sr-RS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r0 != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        switch(r8.hashCode()) {
            case 93023040: goto L_0x007f;
            case 93023074: goto L_0x0088;
            case 93023138: goto L_0x0091;
            case 93023177: goto L_0x009a;
            case 93023295: goto L_0x00a3;
            case 93023358: goto L_0x00ac;
            case 93023368: goto L_0x00b5;
            case 93023378: goto L_0x00be;
            case 93023482: goto L_0x00c7;
            case 93023532: goto L_0x00d0;
            case 93023594: goto L_0x00d9;
            case 93827654: goto L_0x00e4;
            case 96597995: goto L_0x00ef;
            case 96598097: goto L_0x00f8;
            case 96598208: goto L_0x0101;
            case 96598215: goto L_0x010a;
            case 96598274: goto L_0x0113;
            case 96598350: goto L_0x011c;
            case 96598352: goto L_0x0125;
            case 96598431: goto L_0x012e;
            case 96598505: goto L_0x0137;
            case 96598522: goto L_0x0140;
            case 96598532: goto L_0x0149;
            case 96598570: goto L_0x0152;
            case 96598582: goto L_0x015b;
            case 97640743: goto L_0x0166;
            case 97641233: goto L_0x016f;
            case 99487714: goto L_0x017a;
            case 104135123: goto L_0x0185;
            case 109617005: goto L_0x0190;
            case 109617346: goto L_0x019a;
            case 109646445: goto L_0x01a7;
            case 109647137: goto L_0x01b1;
            case 110063884: goto L_0x01be;
            default: goto L_0x007e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (r8.equals("ar-AE") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        if (r8.equals("ar-BH") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r8.equals("ar-DJ") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        if (r8.equals("ar-ER") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (r8.equals("ar-IL") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (r8.equals("ar-KM") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bb, code lost:
        if (r8.equals("ar-KW") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c4, code lost:
        if (r8.equals("ar-LB") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        if (r8.equals("ar-OM") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r8.equals("ar-QA") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        if (r8.equals("ar-SA") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        if (r8.equals("bn-IN") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ec, code lost:
        return "bn-BD";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f5, code lost:
        if (r8.equals("en-BI") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fe, code lost:
        if (r8.equals("en-ER") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0107, code lost:
        if (r8.equals("en-IE") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0110, code lost:
        if (r8.equals("en-IL") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0119, code lost:
        if (r8.equals("en-KI") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0122, code lost:
        if (r8.equals("en-MW") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012b, code lost:
        if (r8.equals("en-MY") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        if (r8.equals("en-PK") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013d, code lost:
        if (r8.equals("en-RW") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0146, code lost:
        if (r8.equals("en-SI") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014f, code lost:
        if (r8.equals("en-SS") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0158, code lost:
        if (r8.equals("en-TZ") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0161, code lost:
        if (r8.equals("en-UG") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016c, code lost:
        if (r8.equals("fr-DJ") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0175, code lost:
        if (r8.equals("fr-TD") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0180, code lost:
        if (r8.equals("hr-BA") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0182, code lost:
        return "hr-HR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x018b, code lost:
        if (r8.equals("ms-BN") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018d, code lost:
        return "ms-MY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0197, code lost:
        if (r8.equals("sq-MK") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a1, code lost:
        if (r8.equals("sq-XK") == false) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A1k(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 746
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A1k(java.lang.String):java.lang.String");
    }

    public static String A1l(String str) {
        if (!AnonymousClass0M7.A00) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int i2 = 0 | charAt;
            if (C28051Sr.A1o(i2)) {
                sb.append(Character.toChars(i2));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A1m(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 784
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A1m(java.lang.String):java.lang.String");
    }

    public static String A1n(String str) {
        if (str == null) {
            return null;
        }
        return AnonymousClass008.A0K("call:", str);
    }

    public static String A1o(String str) {
        Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str);
        return matcher.find() ? AnonymousClass008.A0K(matcher.group(1), matcher.group(2)) : str;
    }

    public static String A1p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }

    public static String A1q(String str, long j) {
        return !TextUtils.isEmpty(str) ? AbstractC450522r.A00(Uri.parse(str).buildUpon(), "_nc_hot", String.valueOf(j / 1000)).build().toString() : str;
    }

    public static String A1r(String str, String str2, String str3, String str4) {
        String A0K = AnonymousClass008.A0K("https://static.whatsapp.net/downloadable?category=", str);
        if (str2 != null) {
            A0K = AnonymousClass008.A0L(A0K, "&locale=", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A0K = AnonymousClass008.A0L(A0K, "&existing_id=", str3);
        }
        return !TextUtils.isEmpty(str4) ? AnonymousClass008.A0L(A0K, "&version=", str4) : A0K;
    }

    public static String A1s(String str, List list) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            byte[] A3l = A3l(list);
            byte[] bArr = new byte[2];
            byte b = (byte) 0;
            bArr[1] = b;
            bArr[0] = b;
            byte[] A082 = C05360Of.A08(bArr, A3l, str.getBytes());
            for (int i = 0; i < 5200; i++) {
                instance.update(A082);
                A082 = instance.digest(A3l);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A20(A082, 0));
            sb.append(A20(A082, 5));
            sb.append(A20(A082, 10));
            sb.append(A20(A082, 15));
            sb.append(A20(A082, 20));
            sb.append(A20(A082, 25));
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String A1t(Collection collection, AnonymousClass01A r7, C014308b r8, AnonymousClass02N r9, AnonymousClass01X r10) {
        String str;
        C007003k r2 = null;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        if (r9 != null) {
            r2 = r7.A0A(r9);
        }
        if (collection.size() == 1) {
            AbstractC007503q r1 = (AbstractC007503q) collection.iterator().next();
            if (r1.A0n.A02 || r2 == null) {
                return r10.A06(R.string.delete_confirmation_self);
            }
            if (r2.A09()) {
                AnonymousClass02N A072 = r1.A07();
                if (A072 != null) {
                    str = r8.A08(r7.A0A(A072), false);
                }
                str = "";
            } else {
                if (r8.A08(r2, false) != null) {
                    str = r8.A08(r2, false);
                }
                str = "";
            }
            return r10.A0D(R.string.delete_confirmation, str);
        }
        return r10.A0A(R.plurals.delete_confirmation_multiple, (long) collection.size(), Integer.valueOf(collection.size()));
    }

    public static String A1u(List list) {
        if (list.size() == 0) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29241Xq r0 = (C29241Xq) it.next();
                if (r0 != null) {
                    String str = r0.A0A;
                    String str2 = r0.A07;
                    if (str != null) {
                        instance.update(str.getBytes());
                    } else if (str2 != null) {
                        instance.update(str2.getBytes());
                    }
                }
            }
            return C003701u.A05(Base64.encodeToString(instance.digest(), 2));
        } catch (NoSuchAlgorithmException unused) {
            Log.e("StickerUtils/handleSHA256ErrorForStickersChecksum/could not get MD5 message digest");
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                C29241Xq r02 = (C29241Xq) list.get(i);
                if (r02 != null) {
                    String str3 = r02.A0A;
                    String str4 = r02.A07;
                    if (str3 != null) {
                        strArr[i] = str3;
                    } else if (str4 != null) {
                        strArr[i] = str4;
                    }
                }
            }
            return String.valueOf(Arrays.hashCode(strArr));
        }
    }

    public static String A1v(List list) {
        if (list.size() == 0) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null) {
                    Object obj = pair.first;
                    if (obj != null) {
                        C29241Xq r0 = (C29241Xq) obj;
                        String str = r0.A0A;
                        String str2 = r0.A07;
                        if (str != null) {
                            instance.update(str.getBytes());
                        } else if (str2 != null) {
                            instance.update(str2.getBytes());
                        }
                    }
                    Object obj2 = pair.second;
                    if (obj2 != null) {
                        instance.update(String.valueOf(obj2).getBytes());
                    }
                }
            }
            return C003701u.A05(Base64.encodeToString(instance.digest(), 2));
        } catch (NoSuchAlgorithmException unused) {
            Log.e("StickerUtils/handleSHA256ErrorForWeightedStickersChecksum/could not get MD5 message digest");
            int size = list.size() << 1;
            String[] strArr = new String[size];
            for (int i = 0; i < size; i += 2) {
                Pair pair2 = (Pair) list.get(i >> 1);
                if (pair2 != null) {
                    Object obj3 = pair2.first;
                    if (obj3 != null) {
                        C29241Xq r02 = (C29241Xq) obj3;
                        String str3 = r02.A0A;
                        String str4 = r02.A07;
                        if (str3 != null) {
                            strArr[i] = str3;
                        } else if (str4 != null) {
                            strArr[i] = str4;
                        }
                    }
                    Object obj4 = pair2.second;
                    if (obj4 != null) {
                        strArr[i + 1] = String.valueOf(obj4);
                    }
                }
            }
            return String.valueOf(Arrays.hashCode(strArr));
        }
    }

    public static String A1w(List list, List list2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder A0S = AnonymousClass008.A0S("SELECT ");
        A0S.append(AbstractC05370Og.A11);
        A0S.append(" FROM ");
        A0S.append("message_view AS message JOIN ( ");
        sb.append(A0S.toString());
        sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name=?");
        list2.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(" INTERSECT ");
            sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name=?");
            list2.add(list.get(i));
        }
        sb.append(") ON message._id = message_row_id");
        return sb.toString();
    }

    public static String A1x(Locale locale) {
        String str = (String) AbstractC05380Oh.A01.get(AbstractC002201f.A01(locale));
        return str == null ? locale.getDisplayLanguage(locale) : str;
    }

    public static String A1y(Map map) {
        if (map == null || map.isEmpty()) {
            return "https://static.whatsapp.net/downloadable?";
        }
        Uri.Builder buildUpon = Uri.parse("https://static.whatsapp.net/downloadable?").buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public static String A1z(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static String A20(byte[] bArr, int i) {
        return String.format("%05d", Long.valueOf(((((long) bArr[i + 4]) & 255) | (((((((long) bArr[i]) & 255) << 32) | ((((long) bArr[i + 1]) & 255) << 24)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 8))) % 100000));
    }

    public static String A21(int[] iArr) {
        int length = iArr.length;
        StringBuilder sb = new StringBuilder(length);
        for (int i : iArr) {
            if (!AnonymousClass0M7.A00 || !C28051Sr.A1o(i)) {
                sb.append(Character.toChars(i));
            } else {
                sb.append(Character.toChars(i & 65535));
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A22(android.text.Spannable r12) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A22(android.text.Spannable):java.util.ArrayList");
    }

    public static List A23(AbstractC007503q r7, AbstractC007503q r8, Set set) {
        String obj;
        String obj2;
        if (r7 == r8) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (!set.contains("status") && r7.A08 != r8.A08) {
            arrayList.add("status");
        }
        if (!set.contains("sendRetryReceipt") && r7.A0i != r8.A0i) {
            arrayList.add("sendRetryReceipt");
        }
        if (!set.contains("retryCount") && r7.A07 != r8.A07) {
            arrayList.add("retryCount");
        }
        if (!set.contains("encoding") && r7.A01 != r8.A01) {
            arrayList.add("encoding");
        }
        if (!set.contains("timestamp") && r7.A0E != r8.A0E) {
            arrayList.add("timestamp");
        }
        if (!set.contains("receivedIncomingTimestamp") && r7.A0C != r8.A0C) {
            arrayList.add("receivedIncomingTimestamp");
        }
        if (!set.contains("origin") && r7.A04 != r8.A04) {
            arrayList.add("origin");
        }
        if (!set.contains("forwardingScore") && r7.A03 != r8.A03) {
            arrayList.add("forwardingScore");
        }
        if (!set.contains("media_wa_type") && r7.A0m != r8.A0m) {
            arrayList.add("media_wa_type");
        }
        if (!set.contains("broadcast") && r7.A0f != r8.A0f) {
            arrayList.add("broadcast");
        }
        if (!set.contains("recipient_count") && r7.A06 != r8.A06) {
            arrayList.add("recipient_count");
        }
        if (!set.contains("server_receipt_timestamp") && r7.A0D != r8.A0D) {
            arrayList.add("server_receipt_timestamp");
        }
        if (!set.contains("row_id") && r7.A0p != r8.A0p) {
            arrayList.add("row_id");
        }
        if (!set.contains("sort_id") && r7.A0q != r8.A0q) {
            arrayList.add("sort_id");
        }
        if (!set.contains("starred") && r7.A0j != r8.A0j) {
            arrayList.add("starred");
        }
        if (!set.contains("quoted_row_id") && r7.A0B != r8.A0B) {
            arrayList.add("quoted_row_id");
        }
        if (!set.contains("messageDecorator") && !C006803i.A0q(r7.A0A(), r8.A0A())) {
            arrayList.add("messageDecorator");
        }
        if (!set.contains("origination_flags") && r7.A04() != r8.A04()) {
            arrayList.add("origination_flags");
        }
        if (!set.contains("verified_level") && r7.A0A != r8.A0A) {
            arrayList.add("verified_level");
        }
        if (!set.contains("verifiedNameInSync") && r7.A0k != r8.A0k) {
            arrayList.add("verified_level");
        }
        if (!set.contains("privacy_mode") && r7.A0O != r8.A0O) {
            arrayList.add("verified_level");
        }
        if (!set.contains("chat_active") && r7.A0g != r8.A0g) {
            arrayList.add("chat_active");
        }
        if (!set.contains("edited_version") && r7.A00 != r8.A00) {
            arrayList.add("edited_version");
        }
        set.contains("conversion_tuple_interaction_delay_in_sec");
        if (!set.contains("deleted") && r7.A0r != r8.A0r) {
            arrayList.add("deleted");
        }
        if (!set.contains("storageType") && r7.A09 != r8.A09) {
            arrayList.add("storageType");
        }
        if (!set.contains("expirationDuration") && r7.A02 != r8.A02) {
            arrayList.add("expirationDuration");
        }
        if (!set.contains("isFromLegacyEphemeralClient") && r7.A0h != r8.A0h) {
            arrayList.add("isFromLegacyEphemeralClient");
        }
        if (!set.contains("key") && !r7.A0n.equals(r8.A0n)) {
            arrayList.add("key");
        }
        if (!set.contains("senderJid") && !C006803i.A0q(r7.A07(), r8.A07())) {
            arrayList.add("senderJid");
        }
        if (!set.contains("entVerifiedNameOnPrivacyConflict") && r7.A0Y != r8.A0Y) {
            arrayList.add("entVerifiedNameOnPrivacyConflict");
        }
        if ((!(r7 instanceof C05390Oi) || (r7 instanceof C05400Oj)) && !set.contains("participantList") && !A3g(r7.A0M(), r8.A0M())) {
            List A0M = r7.A0M();
            List A0M2 = r8.A0M();
            if (A0M == null) {
                obj = "before:null";
            } else {
                StringBuilder A0Y = AnonymousClass008.A0Y("before:", "size:");
                A0Y.append(A0M.size());
                obj = A0Y.toString();
            }
            if (A0M2 == null) {
                obj2 = "after:null";
            } else {
                StringBuilder A0Y2 = AnonymousClass008.A0Y("after:", "size:");
                A0Y2.append(A0M2.size());
                obj2 = A0Y2.toString();
            }
            StringBuilder sb = new StringBuilder("{");
            sb.append(obj);
            sb.append("}{");
            sb.append(obj2);
            sb.append("}");
            String obj3 = sb.toString();
            StringBuilder sb2 = new StringBuilder("participantList");
            sb2.append(obj3);
            arrayList.add(sb2.toString());
        }
        if (!set.contains("participant_hash") && !C003701u.A0F(r7.A0a, r8.A0a)) {
            arrayList.add("participant_hash");
        }
        if (!set.contains("broadcastParticipantEphemeralSettings") && !C006803i.A0q(r7.A0e, r8.A0e)) {
            arrayList.add("broadcastParticipantEphemeralSettings");
        }
        if (!set.contains("data") && !C003701u.A0F(r7.A0D(), r8.A0D())) {
            arrayList.add("data");
        }
        if (!set.contains("dataBytes") && !Arrays.equals(r7.A0t(), r8.A0t())) {
            arrayList.add("dataBytes");
        }
        if (!set.contains("from_name") && !C003701u.A0F(r7.A0Z, r8.A0Z)) {
            arrayList.add("from_name");
        }
        if (!set.contains("web") && r7.A0J != r8.A0J) {
            arrayList.add("web");
        }
        if (!set.contains("mentionedJids") && !A3g(r7.A0c, r8.A0c)) {
            arrayList.add("mentionedJids");
        }
        if (!set.contains("offline") && !C006803i.A0q(r7.A0P, r8.A0P)) {
            arrayList.add("offline");
        }
        if (!set.contains("quotedMessage") && !C006803i.A0q(r7.A09(), r8.A09())) {
            arrayList.add("quotedMessage");
        }
        if (!set.contains("externalAdContentInfo") && !C006803i.A0q(r7.A0H, r8.A0H)) {
            arrayList.add("externalAdContentInfo");
        }
        if (!set.contains("mmsThumbnailMetadata") && !C006803i.A0q(r7.A0N, r8.A0N)) {
            arrayList.add("mmsThumbnailMetadata");
        }
        if (!set.contains("verified_name") && !C006803i.A0q(r7.A0U, r8.A0U)) {
            arrayList.add("verified_name");
        }
        if (!set.contains("triggred_block_expiration_ts") && !C006803i.A0q(r7.A0T, r8.A0T)) {
            arrayList.add("triggred_block_expiration_ts");
        }
        if (!set.contains("triggred_block_cooldown") && !C006803i.A0q(r7.A0S, r8.A0S)) {
            arrayList.add("triggred_block_cooldown");
        }
        if (!set.contains("conversion_tuple_source") && !C003701u.A0F(r7.A0W, r8.A0W)) {
            arrayList.add("conversion_tuple_source");
        }
        if (!set.contains("conversion_tuple_data") && !C003701u.A0F(r7.A0V, r8.A0V)) {
            arrayList.add("conversion_tuple_data");
        }
        if (!set.contains("thumbnail") && !C006803i.A0q(r7.A0B(), r8.A0B())) {
            arrayList.add("thumbnail");
        }
        if (!set.contains("payment_transaction_id") && !C003701u.A0F(r7.A0b, r8.A0b)) {
            arrayList.add("payment_transaction_id");
        }
        if (!set.contains("paymentTransactionInfo") && !C006803i.A0q(r7.A0F, r8.A0F)) {
            arrayList.add("paymentTransactionInfo");
        }
        if (!set.contains("backFillMessageKey") && !C006803i.A0q(r7.A0I, r8.A0I)) {
            arrayList.add("backFillMessageKey");
        }
        if (!set.contains("ephemeralSettingTimestamp") && !C006803i.A0q(r7.A0Q, r8.A0Q)) {
            arrayList.add("ephemeralSettingTimestamp");
        }
        if (!set.contains("expirationExpireTimestamp") && !C006803i.A0q(r7.A0R, r8.A0R)) {
            arrayList.add("expirationExpireTimestamp");
        }
        return arrayList;
    }

    public static List A24(AnonymousClass0Oo r4, AnonymousClass0Oo r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A23(r4, r5, set));
        if (!set.contains("isLegacy") && r4.A00 != r5.A00) {
            arrayList.add("isLegacy");
        }
        if (!set.contains("isVideoCall") && !C003701u.A0F(r4.A0F(), r5.A0F())) {
            arrayList.add("isVideoCall");
        }
        if (!set.contains("callLogs") && !A3g(r4.A0v(), r5.A0v())) {
            arrayList.add("callLogs");
        }
        return arrayList;
    }

    public static List A25(AnonymousClass0M2 r4, AnonymousClass0M2 r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A27(r4, r5, set));
        if (!set.contains("pageCount") && r4.A00 != r5.A00) {
            arrayList.add("pageCount");
        }
        return arrayList;
    }

    public static List A26(AbstractC02860Dt r6, AbstractC02860Dt r7, Set set) {
        if (r6 == r7) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A23(r6, r7, set));
        if (!set.contains("latitude") && Double.compare(r6.A00, r7.A00) != 0) {
            arrayList.add("latitude");
        }
        if (!set.contains("longitude") && Double.compare(r6.A01, r7.A01) != 0) {
            arrayList.add("longitude");
        }
        if (!set.contains("downloadStatus") && r6.A02 != r7.A02) {
            arrayList.add("downloadStatus");
        }
        return arrayList;
    }

    public static List A27(AnonymousClass0M3 r7, AnonymousClass0M3 r8, Set set) {
        if (r7 == r8) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A23(r7, r8, set));
        if (!set.contains("media_duration_seconds") && r7.A00 != r8.A00) {
            arrayList.add("media_duration_seconds");
        }
        if (!set.contains("media_size") && r7.A01 != r8.A01) {
            arrayList.add("media_size");
        }
        if (!set.contains("mediaDataV2") && !C006803i.A0q(r7.A02, r8.A02)) {
            arrayList.add("mediaDataV2");
        }
        if (!set.contains("media_caption") && !C003701u.A0F(r7.A0v(), r8.A0v())) {
            arrayList.add("media_caption");
        }
        if (!set.contains("media_enc_hash") && !C003701u.A0F(r7.A05, r8.A05)) {
            arrayList.add("media_enc_hash");
        }
        if (!set.contains("media_hash") && !C003701u.A0F(r7.A06, r8.A06)) {
            arrayList.add("media_hash");
        }
        if (!set.contains("media_mime_type") && !C003701u.A0F(r7.A07, r8.A07)) {
            arrayList.add("media_mime_type");
        }
        if (!set.contains("media_name") && !C003701u.A0F(r7.A0w(), r8.A0w())) {
            arrayList.add("media_name");
        }
        if (!set.contains("media_url") && !C003701u.A0F(r7.A09, r8.A09)) {
            arrayList.add("media_url");
        }
        if (!set.contains("original_file_hash") && !C003701u.A0F(r7.A0B, r8.A0B)) {
            arrayList.add("original_file_hash");
        }
        if (!set.contains("multicast_id") && !C003701u.A0F(r7.A0A, r8.A0A)) {
            arrayList.add("multicast_id");
        }
        if (!set.contains("sidecar") && !C006803i.A0q(r7.A0u(), r8.A0u())) {
            arrayList.add("sidecar");
        }
        return arrayList;
    }

    public static List A28(AbstractC05460Oq r4, AbstractC05460Oq r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A23(r4, r5, set));
        if (!set.contains("recipient") && !C006803i.A0q(r4.A00, r5.A00)) {
            arrayList.add("recipient");
        }
        return arrayList;
    }

    public static List A29(C05470Or r4, C05470Or r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A26(r4, r5, set));
        if (!set.contains("placeName") && !C003701u.A0F(r4.A01, r5.A01)) {
            arrayList.add("placeName");
        }
        if (!set.contains("address") && !C003701u.A0F(r4.A00, r5.A00)) {
            arrayList.add("address");
        }
        if (!set.contains("url") && !C003701u.A0F(r4.A02, r5.A02)) {
            arrayList.add("url");
        }
        return arrayList;
    }

    public static List A2A(C05390Oi r4, C05390Oi r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A23(r4, r5, set));
        if (!set.contains("action") && r4.A00 != r5.A00) {
            arrayList.add("action");
        }
        return arrayList;
    }

    public static List A2B(C05400Oj r4, C05400Oj r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A2A(r4, r5, set));
        if (!set.contains("isCurrentUserJoined") && r4.A00 != r5.A00) {
            arrayList.add("isCurrentUserJoined");
        }
        if (!set.contains("groupParticipants") && !C006803i.A0q(r4.A02, r5.A02)) {
            arrayList.add("groupParticipants");
        }
        return arrayList;
    }

    public static List A2C(C05480Os r4, C05480Os r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A2A(r4, r5, set));
        if (!set.contains("senderUserJid") && !C006803i.A0q(r4.A01, r5.A01)) {
            arrayList.add("senderUserJid");
        }
        if (!set.contains("receiverUserJid") && !C006803i.A0q(r4.A00, r5.A00)) {
            arrayList.add("receiverUserJid");
        }
        if (!set.contains("amountWithSymbol") && !C003701u.A0F(r4.A03, r5.A03)) {
            arrayList.add("amountWithSymbol");
        }
        if (!set.contains("referenceMsgKey") && !C006803i.A0q(r4.A02, r5.A02)) {
            arrayList.add("referenceMsgKey");
        }
        return arrayList;
    }

    public static List A2D(C05490Ot r7, C05490Ot r8, Set set) {
        byte[] A0y;
        byte[] A0y2;
        String obj;
        String obj2;
        if (r7 == r8) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A23(r7, r8, set));
        if (!set.contains("previewType") && r7.A00 != r8.A00) {
            arrayList.add("previewType");
        }
        if (!set.contains("description") && !C003701u.A0F(r7.A02, r8.A02)) {
            arrayList.add("description");
        }
        if (!set.contains("pageTitle") && !C003701u.A0F(r7.A04, r8.A04)) {
            arrayList.add("pageTitle");
        }
        if (!set.contains("url") && !C003701u.A0F(r7.A05, r8.A05)) {
            arrayList.add("url");
        }
        if (!set.contains("textData") && !C006803i.A0q(r7.A01, r8.A01)) {
            arrayList.add("textData");
        }
        if (!set.contains("thumbData") && (A0y = r7.A0y()) != (A0y2 = r8.A0y()) && (A0y == null ? A0y2.length != 0 : A0y2 != null ? !Arrays.equals(A0y, A0y2) : A0y.length != 0)) {
            byte[] A0y3 = r7.A0y();
            byte[] A0y4 = r8.A0y();
            if (A0y3 == null) {
                obj = "before:null";
            } else {
                StringBuilder A0Y = AnonymousClass008.A0Y("before:", "size:");
                A0Y.append(A0y3.length);
                obj = A0Y.toString();
            }
            if (A0y4 == null) {
                obj2 = "after:null";
            } else {
                StringBuilder A0Y2 = AnonymousClass008.A0Y("after:", "size:");
                A0Y2.append(A0y4.length);
                obj2 = A0Y2.toString();
            }
            StringBuilder sb = new StringBuilder("{");
            sb.append(obj);
            sb.append("}{");
            sb.append(obj2);
            sb.append("}");
            String obj3 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("thumbData");
            sb2.append(obj3);
            arrayList.add(sb2.toString());
        }
        if (!set.contains("mimeType") && !C003701u.A0F(r7.A03, r8.A03)) {
            arrayList.add("mimeType");
        }
        return arrayList;
    }

    public static List A2E(AnonymousClass0CN r3, AbstractC007503q r4) {
        if (r4 instanceof C04830Lz) {
            return Collections.singletonList(((C04830Lz) r4).A0u());
        }
        if (r4 instanceof AnonymousClass0M1) {
            return ((AnonymousClass0M1) r4).A0u();
        }
        if (AnonymousClass0FI.A0g(r4)) {
            AnonymousClass0M4 r0 = ((AnonymousClass0M3) r4).A02;
            if (r0 != null) {
                File file = r0.A0F;
                if (file != null) {
                    Uri fromFile = Uri.fromFile(file);
                    if (r3 != null) {
                        try {
                            return C05500Ov.A00(r3.A02(fromFile));
                        } catch (IOException e) {
                            Log.e("vcardloader/splitvcards/exception", e);
                        }
                    } else {
                        throw null;
                    }
                }
            } else {
                throw null;
            }
        }
        return null;
    }

    public static List A2F(MessageDigest messageDigest, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C007003k r1 = (C007003k) it.next();
            if (!A3V(r1.A09) && A3T(r1, list, messageDigest)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public static List A2G(HashSet hashSet, List list) {
        C03960Il[] r3;
        if (hashSet == null) {
            return new ArrayList(0);
        }
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29241Xq r4 = (C29241Xq) it.next();
            C29251Xr r0 = r4.A04;
            if (r0 != null && (r3 = r0.A06) != null) {
                int length = r3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (hashSet.contains(r3[i])) {
                        arrayList.add(r4);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }

    public static List A2H(int[] iArr, Long l) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                break;
            }
            j += (long) iArr[i];
            if (i != length - 1 || l == null) {
                if (j > j2) {
                    int i2 = (int) ((((j - j2) + 15) / 16) * 16);
                    arrayList.add(Integer.valueOf(i2));
                    j3 = j2;
                    j2 = ((long) i2) + j2;
                }
                i++;
            } else if (j > j2) {
                arrayList.add(Integer.valueOf((int) (l.longValue() - j2)));
            } else {
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(Integer.valueOf((int) (l.longValue() - j3)));
                return arrayList;
            }
        }
        return arrayList;
    }

    public static Map A2I(AnonymousClass1RA r6, AbstractC03860Ib r7, boolean z) {
        HashMap hashMap = new HashMap((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        String str = null;
        do {
            Pair pair = (Pair) AnonymousClass1R1.A00(r7, new C46462Am(r6, str, z), "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            for (AnonymousClass1RH r1 : (List) pair.first) {
                hashMap.put(r1.A05, r1);
            }
        } while (str != null);
        StringBuilder A0S = AnonymousClass008.A0S("gdrive/v2/load-files result ");
        A0S.append(hashMap.size());
        Log.i(A0S.toString());
        return Collections.unmodifiableMap(hashMap);
    }

    public static Set A2J(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    public static JSONArray A2K(Set set) {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : set) {
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public static AnonymousClass0OD A2L(AnonymousClass0OE r3) {
        AnonymousClass0E6 r0 = r3.A00;
        return new AnonymousClass0OD(r3.A01, new AnonymousClass0OC(r0.A01, r0.A00));
    }

    public static void A2M(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void A2N(Activity activity, int i) {
        if (!A3D(activity)) {
            activity.removeDialog(i);
        }
    }

    public static void A2O(Activity activity, int i) {
        if (!A3D(activity)) {
            activity.showDialog(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06e6, code lost:
        if (r11 != null) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06eb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06f4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06fa, code lost:
        if (r2 != null) goto L_0x06fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06ff, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0702, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0706, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08d5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0b3e, code lost:
        if (r2 == null) goto L_0x0b40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0b40, code lost:
        r1 = new X.C04280Jt(r5, r6.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0b47, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:?, code lost:
        ((X.AnonymousClass028) r1).A02.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0b4d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0b4e, code lost:
        r4.add(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A2P(android.app.Application r77) {
        /*
        // Method dump skipped, instructions count: 2941
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A2P(android.app.Application):void");
    }

    public static void A2Q(Context context, AnonymousClass02M r11, C02780Dk r12, AnonymousClass03P r13, TextEmojiLabel textEmojiLabel, String str, Uri uri) {
        AnonymousClass365 r0 = new AnonymousClass365(uri);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : r0.entrySet()) {
            hashMap.put(entry.getKey(), new C05690Pr(context, r11, r13, r12, entry.getValue().toString()));
        }
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                Object obj = hashMap.get(uRLSpan.getURL());
                if (obj != null) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.setText(spannableStringBuilder);
    }

    public static void A2R(Context context, AnonymousClass03P r4, CharSequence charSequence) {
        AccessibilityManager A0G = r4.A0G();
        if (A0G != null && A0G.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName("android.widget.Button");
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            A0G.sendAccessibilityEvent(obtain);
        }
    }

    public static void A2S(Context context, AnonymousClass03C r6, String str, String str2, int i) {
        Log.i("errorreporter/reporterror");
        PendingIntent activity = PendingIntent.getActivity(context, 1, new Intent(context, Main.class), 0);
        AnonymousClass03E A002 = AnonymousClass0BS.A00(context);
        A002.A0J = "critical_app_alerts@1";
        A002.A0I = "err";
        A002.A03 = 1;
        A002.A07.tickerText = AnonymousClass03E.A00(str);
        A002.A0A(str);
        A002.A09(str2);
        A002.A09 = activity;
        A002.A07.icon = R.drawable.notifybar_error;
        if (Build.VERSION.SDK_INT >= 21) {
            A002.A06 = 1;
        }
        r6.A03(null, i, A002.A01());
    }

    public static void A2T(Context context, AnonymousClass01X r3, AnonymousClass03C r4, String str) {
        A2S(context, r4, r3.A06(R.string.error_notification_title), str, 2);
    }

    public static void A2U(Context context, C02590Cr r5, AnonymousClass03P r6, AnonymousClass022 r7, Editable editable, Paint paint, float f) {
        A2f(editable, context, paint, f, r5);
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class);
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            if (!(foregroundColorSpan instanceof AnonymousClass0Q1)) {
                editable.removeSpan(foregroundColorSpan);
            }
        }
        A2e(editable, 0, editable.length(), StyleSpan.class);
        A2e(editable, 0, editable.length(), StrikethroughSpan.class);
        A2e(editable, 0, editable.length(), TypefaceSpan.class);
        A1D(r6, r7, editable, true, paint.getColor());
    }

    public static void A2V(Context context, Class cls, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ComponentName componentName = new ComponentName(context, cls);
            int i = 2;
            if (z) {
                i = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("PackageManagerUtils/setActivityRegisteredState/error: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public static void A2W(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                A2W(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof AnonymousClass0Nr) {
                A2W(((AnonymousClass0Nr) drawable).A9v());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        A2W(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static void A2X(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static void A2Y(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            drawable.setLayoutDirection(i);
        } else if (i2 >= 17) {
            if (!A08) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    A03 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    android.util.Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                A08 = true;
            }
            Method method = A03;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                } catch (Exception e2) {
                    android.util.Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    A03 = null;
                }
            }
        }
    }

    public static void A2Z(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof AbstractC05200No) {
            ((AbstractC05200No) drawable).setTint(i);
        }
    }

    public static void A2a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void A2b(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof AbstractC05200No) {
            ((AbstractC05200No) drawable).setTintList(colorStateList);
        }
    }

    public static void A2c(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof AbstractC05200No) {
            ((AbstractC05200No) drawable).setTintMode(mode);
        }
    }

    public static void A2d(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static void A2e(Editable editable, int i, int i2, Class cls) {
        Object[] spans = editable.getSpans(i, i2, cls);
        if (spans != null) {
            for (Object obj : spans) {
                editable.removeSpan(obj);
            }
        }
    }

    public static void A2f(Editable editable, Context context, Paint paint, float f, C02590Cr r15) {
        BitmapDrawable A012;
        Object imageSpan;
        Paint.FontMetricsInt A002;
        String str;
        if (!A04) {
            A04 = true;
            String obj = editable.toString();
            int length = obj.length();
            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, length, ImageSpan.class)) {
                editable.removeSpan(imageSpan2);
            }
            boolean z = AnonymousClass0M7.A00;
            if (z) {
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int codePointAt = obj.codePointAt(i);
                    int charCount = Character.charCount(codePointAt);
                    if (charCount > 1 && C28051Sr.A1o(codePointAt)) {
                        int i3 = i2 + charCount;
                        if (!z || !C28051Sr.A1o(codePointAt)) {
                            str = new String(Character.toChars(codePointAt));
                        } else {
                            str = new String(Character.toChars(codePointAt & 65535));
                        }
                        editable.replace(i2, i3, str);
                        i2 -= charCount - 1;
                    }
                    i += charCount;
                    i2 += charCount;
                }
                obj = editable.toString();
            }
            AnonymousClass0M6 r5 = new AnonymousClass0M6(obj);
            int length2 = obj.length();
            int i4 = 0;
            while (i4 < length2) {
                r5.A00 = i4;
                int A003 = EmojiDescriptor.A00(r5, false);
                int A013 = r5.A01(i4, A003);
                if (!(A003 == -1 || (A012 = r15.A01(context, A003, r5)) == null)) {
                    if (paint == null || (A002 = C05250Nu.A00(paint)) == null) {
                        A012.setBounds(0, 0, (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f), (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f));
                        imageSpan = new ImageSpan(A012, 0);
                    } else {
                        int textSize = (int) ((paint.getTextSize() * f) + 0.5f);
                        A012.setBounds(0, 0, textSize, textSize);
                        imageSpan = new C05260Nv(context, A012, A002, obj.substring(i4, i4 + A013));
                    }
                    editable.setSpan(imageSpan, i4, i4 + A013, 33);
                }
                i4 += A013;
            }
            A04 = false;
        }
    }

    public static void A2g(JsonWriter jsonWriter, Map map) {
        jsonWriter.beginObject();
        for (Map.Entry entry : map.entrySet()) {
            jsonWriter.name((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof Number) {
                jsonWriter.value((Number) value);
            } else if (value instanceof String) {
                jsonWriter.value((String) value);
            } else if (value instanceof Boolean) {
                jsonWriter.value(((Boolean) value).booleanValue());
            } else if (value instanceof Map) {
                A2g(jsonWriter, (Map) value);
            } else {
                StringBuilder sb = new StringBuilder("Unexpected value type ");
                sb.append(value);
                sb.append(" for ");
                sb.append((String) entry.getKey());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        jsonWriter.endObject();
    }

    public static void A2h(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!A06) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder A0S = AnonymousClass008.A0S("forceSetFactory2 Could not find field 'mFactory2' on class ");
                A0S.append(LayoutInflater.class.getName());
                A0S.append("; inflation may have unexpected results.");
                android.util.Log.e("LayoutInflaterCompatHC", A0S.toString(), e);
            }
            A06 = true;
        }
        Field field = A01;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                StringBuilder sb = new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb.append(layoutInflater);
                sb.append("; inflation may have unexpected results.");
                android.util.Log.e("LayoutInflaterCompatHC", sb.toString(), e2);
            }
        }
    }

    public static void A2i(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                A2h(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                A2h(layoutInflater, factory2);
            }
        }
    }

    public static void A2j(View view) {
        AnonymousClass0Q7.A0d(view, new AnonymousClass0Q0());
    }

    public static void A2k(Window window, boolean z) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & -8193;
        if (z) {
            i = systemUiVisibility | 8192;
        }
        window.getDecorView().setSystemUiVisibility(i);
    }

    public static void A2l(EditText editText, int[] iArr, int i) {
        int charCount;
        int max = Math.max(0, editText.getSelectionStart());
        int max2 = Math.max(0, editText.getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder(editText.getText().toString());
            sb.replace(max, max2, A21(iArr));
            if (C28051Sr.A0B(sb) > i) {
                return;
            }
        }
        editText.getText().replace(max, max2, A21(iArr));
        int i2 = 0;
        for (int i3 : iArr) {
            if (AnonymousClass0M7.A00) {
                charCount = 1;
            } else {
                charCount = Character.charCount(i3);
            }
            i2 += charCount;
        }
        if (max <= editText.length() - i2) {
            editText.setSelection(max + i2);
        }
    }

    public static void A2m(ImageView imageView, int i) {
        ColorStateList valueOf;
        AnonymousClass0N2.A1F(imageView, PorterDuff.Mode.SRC_IN);
        if (i == 0) {
            valueOf = null;
        } else {
            valueOf = ColorStateList.valueOf(i);
        }
        AnonymousClass0N2.A1E(imageView, valueOf);
    }

    public static void A2n(TextView textView, int i) {
        if (i != 0) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        }
    }

    public static void A2o(AnonymousClass0LW r2, DialogFragment dialogFragment) {
        String name = dialogFragment.getClass().getName();
        if (r2.A0Q.A01(name) == null) {
            A2p(r2, dialogFragment, name);
        }
    }

    public static void A2p(AnonymousClass0LW r3, DialogFragment dialogFragment, String str) {
        if (r3 != null) {
            AnonymousClass0QB r2 = new AnonymousClass0QB(r3);
            r2.A0A(0, dialogFragment, str, 1);
            r2.A01();
            return;
        }
        throw null;
    }

    public static void A2q(AnonymousClass009 r13, AnonymousClass0M5 r14, C64502yI r15, String str) {
        int i;
        Pair pair;
        AnonymousClass0M5 A0D = r14.A0D(str);
        if (A0D != null) {
            List<AnonymousClass0M5> A0H = A0D.A0H("participant");
            ArrayList arrayList = new ArrayList();
            A2t(r13, UserJid.class, A0D, arrayList, "participant", "jid");
            ArrayList arrayList2 = new ArrayList();
            A2z(A0D, arrayList2, "participant", "type");
            ArrayList arrayList3 = new ArrayList();
            A2z(A0D, arrayList3, "participant", "error");
            ArrayList arrayList4 = new ArrayList();
            for (AnonymousClass0M5 r1 : A0H) {
                AnonymousClass0M5 A0D2 = r1.A0D("add_request");
                String str2 = null;
                if (A0D2 == null) {
                    arrayList4.add(null);
                } else {
                    AnonymousClass0OS A0A = A0D2.A0A("code");
                    String str3 = A0A != null ? A0A.A03 : null;
                    AnonymousClass0OS A0A2 = A0D2.A0A("expiration");
                    if (A0A2 != null) {
                        str2 = A0A2.A03;
                    }
                    arrayList4.add(new Pair(str3, str2));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                String str4 = (String) arrayList3.get(i2);
                if (str4 != null) {
                    try {
                        i = Integer.valueOf(str4).intValue();
                    } catch (Exception unused) {
                        i = 499;
                    }
                    r15.A01.put(obj, Integer.valueOf(i));
                    if (i == 403 && (pair = (Pair) arrayList4.get(i2)) != null) {
                        try {
                            r15.A02.put(obj, new C64482yG((String) pair.first, Long.valueOf((String) pair.second).longValue()));
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    Object obj2 = arrayList2.get(i2);
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    r15.A03.put(obj, obj2);
                }
            }
            return;
        }
        throw null;
    }

    public static void A2r(AnonymousClass009 r4, AnonymousClass0M5 r5, Map map) {
        String str;
        for (AnonymousClass0M5 r2 : r5.A0H("participant")) {
            Jid A082 = r2.A08(UserJid.class, "jid", r4);
            if (A082 != null) {
                AnonymousClass0OS A0A = r2.A0A("type");
                if (A0A != null) {
                    str = A0A.A03;
                    if (str == null) {
                        throw null;
                    }
                } else {
                    str = "";
                }
                map.put(A082, str);
            }
        }
    }

    public static void A2s(AnonymousClass009 r9, AnonymousClass0M5 r10, Map map, Map map2, String str) {
        int i;
        AnonymousClass0M5 A0D = r10.A0D(str);
        if (A0D != null) {
            ArrayList arrayList = new ArrayList();
            A2t(r9, UserJid.class, A0D, arrayList, "participant", "jid");
            ArrayList arrayList2 = new ArrayList();
            A2z(A0D, arrayList2, "participant", "type");
            ArrayList arrayList3 = new ArrayList();
            A2z(A0D, arrayList3, "participant", "error");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                String str2 = (String) arrayList3.get(i2);
                if (str2 != null) {
                    try {
                        i = Integer.valueOf(str2);
                    } catch (Exception unused) {
                        i = 499;
                    }
                    map2.put(obj, i);
                } else {
                    Object obj2 = arrayList2.get(i2);
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    map.put(obj, obj2);
                }
            }
            return;
        }
        throw null;
    }

    public static void A2t(AnonymousClass009 r2, Class cls, AnonymousClass0M5 r4, List list, String str, String str2) {
        for (AnonymousClass0M5 r0 : r4.A0H(str)) {
            list.add(r0.A08(cls, str2, r2));
        }
    }

    public static void A2u(AnonymousClass009 r1, String str) {
        Log.e(str);
        r1.A03(str, -1);
    }

    public static void A2v(AnonymousClass01A r4, GroupJid groupJid, List list, List list2, ActivityC004902h r8, boolean z, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (r4.A0S(userJid) || !z) {
                arrayList.add(userJid);
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int size = list.size() - arrayList.size();
            Integer valueOf = Integer.valueOf(i);
            AnonymousClass00E.A08(!arrayList.isEmpty(), "List must be non empty");
            Intent intent = new Intent(r8, GroupCallParticipantPickerSheet.class);
            intent.putStringArrayListExtra("jids", AnonymousClass1VY.A0F(arrayList));
            if (list2 != null && !list2.isEmpty()) {
                intent.putStringArrayListExtra("selected", AnonymousClass1VY.A0F(list2));
            }
            if (groupJid != null) {
                intent.putExtra("source_group_jid", groupJid);
            }
            intent.putExtra("hidden_jids", size);
            intent.putExtra("call_from_ui", valueOf);
            r8.startActivity(intent);
        } else {
            int size2 = list.size() - arrayList.size();
            Intent intent2 = new Intent(r8, GroupCallParticipantPicker.class);
            if (arrayList != null) {
                intent2.putStringArrayListExtra("jids", AnonymousClass1VY.A0F(arrayList));
            }
            if (groupJid != null) {
                intent2.putExtra("source_group_jid", groupJid);
            }
            intent2.putExtra("hidden_jids", size2);
            if (list2 != null && !list2.isEmpty()) {
                intent2.putStringArrayListExtra("selected", AnonymousClass1VY.A0F(list2));
            }
            intent2.putExtra("call_from_ui", i);
            r8.startActivity(intent2);
        }
        r8.overridePendingTransition(0, 0);
    }

    public static void A2w(AnonymousClass01X r3, View view, int i) {
        AnonymousClass0Q7.A0d(view, new AnonymousClass0Q9(new AnonymousClass0Q8[]{new AnonymousClass0Q8(16, i)}, r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 != 2) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        if (r1 == 0) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A2x(X.AnonymousClass00Y r8, int r9, java.lang.Integer r10, X.AnonymousClass0QJ r11, X.AnonymousClass0QK r12, X.AnonymousClass0J9 r13, java.lang.Boolean r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A2x(X.00Y, int, java.lang.Integer, X.0QJ, X.0QK, X.0J9, java.lang.Boolean, boolean):void");
    }

    public static void A2y(AbstractC007503q r1, String str, String str2, List list, AnonymousClass02N r5, Long l, int i) {
        r1.A0Y(r5);
        if (l != null) {
            r1.A0U = l;
        }
        r1.A0A = i;
        ((AnonymousClass0Z8) r1).APA(new AnonymousClass0OF(str, str2, list));
    }

    public static void A2z(AnonymousClass0M5 r2, List list, String str, String str2) {
        for (AnonymousClass0M5 r1 : r2.A0H(str)) {
            String str3 = null;
            AnonymousClass0OS A0A = r1.A0A(str2);
            if (A0A != null) {
                str3 = A0A.A03;
            }
            list.add(str3);
        }
    }

    public static void A30(AnonymousClass0QM r6, AnonymousClass01A r7, ActivityC004902h r8, int i) {
        AbstractCollection abstractCollection = (AbstractCollection) r6.A04();
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            UserJid of = UserJid.of(((AnonymousClass0QP) it.next()).A02);
            if (of != null) {
                arrayList.add(of);
            }
        }
        ArrayList arrayList2 = null;
        if (arrayList.size() <= 8) {
            arrayList2 = new ArrayList(arrayList);
        }
        A2v(r7, null, arrayList, arrayList2, r8, false, i);
    }

    public static void A31(File file, C002701k r9, C000300f r10, WebpUtils webpUtils, Boolean bool, String str) {
        String absolutePath = file.getAbsolutePath();
        if (webpUtils != null) {
            WebpInfo verifyWebpFileIntegrity = WebpUtils.verifyWebpFileIntegrity(absolutePath);
            int length = (int) (file.length() / 1024);
            boolean A0E = r9.A0E(290);
            int A062 = r10.A06(AbstractC000400g.A2n);
            int A063 = r10.A06(AbstractC000400g.A2p);
            int A064 = r10.A06(AbstractC000400g.A2o);
            if (verifyWebpFileIntegrity == null) {
                throw new AnonymousClass3QI("sticker file might be corrupted or invalid");
            } else if (verifyWebpFileIntegrity.height != 512) {
                throw new AnonymousClass3QI("sticker height should be 512");
            } else if (verifyWebpFileIntegrity.width == 512) {
                int i = verifyWebpFileIntegrity.numFrames;
                if (i > 1) {
                    if (!A0E) {
                        throw new AnonymousClass3QI("animated stickers are not supported yet.");
                    } else if (bool != null && !bool.booleanValue()) {
                        throw new AnonymousClass3QI(AnonymousClass008.A0K("pack is not marked as animated pack but contains animated stickers. sticker: ", str));
                    } else if (verifyWebpFileIntegrity.minFrameDurationMS < A063) {
                        StringBuilder sb = new StringBuilder("frame duration for any frame should exceed ");
                        sb.append(A063);
                        sb.append(" ms. sticker: ");
                        sb.append(str);
                        throw new AnonymousClass3QI(sb.toString());
                    } else if (verifyWebpFileIntegrity.totalAnimationDurationMS > A064) {
                        StringBuilder sb2 = new StringBuilder("total animation duration should be under ");
                        sb2.append(A064);
                        sb2.append(" ms. sticker: ");
                        sb2.append(str);
                        throw new AnonymousClass3QI(sb2.toString());
                    }
                } else if (bool != null && bool.booleanValue()) {
                    throw new AnonymousClass3QI(AnonymousClass008.A0K("pack is marked as animated pack but contains non animated stickers. All stickers in animated pack should be animated sticker. check sticker: ", str));
                }
                long j = (long) length;
                long j2 = (i <= 1 || !A0E) ? 100 : (long) A062;
                if (j > j2) {
                    StringBuilder sb3 = new StringBuilder("sticker file should be less than ");
                    sb3.append(j2);
                    sb3.append(" kB, file: ");
                    sb3.append(str);
                    throw new AnonymousClass3QI(sb3.toString());
                }
            } else {
                throw new AnonymousClass3QI("sticker width should be  512");
            }
        } else {
            throw null;
        }
    }

    public static void A32(InputStream inputStream, MessageDigest messageDigest) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                messageDigest.update(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A33(String str, String str2, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
            return;
        }
        try {
            editor.putFloat(str, Float.parseFloat(str2));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid number format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            editor.remove(str);
        }
    }

    public static void A34(String str, String str2, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
            return;
        }
        try {
            editor.putInt(str, Integer.parseInt(str2));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid number format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            editor.remove(str);
        }
    }

    public static void A35(String str, String str2, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
        } else {
            editor.putString(str, str2);
        }
    }

    public static void A36(String str, String str2, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
            return;
        }
        try {
            boolean z = false;
            if (Integer.parseInt(str2) != 0) {
                z = true;
            }
            editor.putBoolean(str, z);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid number format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            editor.remove(str);
        }
    }

    public static void A37(String str, String str2, String str3, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str3)) {
            editor.remove(str);
        } else {
            str2 = str3;
        }
        try {
            new JSONObject(str2);
            editor.putString(str, str2);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid json format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str3);
            Log.w(sb.toString(), e);
            editor.remove(str);
            throw new IllegalArgumentException(AnonymousClass008.A0M("PropsCommon/invalid json format for property; prefKey=", str, "; value=", str2), e);
        }
    }

    public static void A38(ArrayList arrayList, int i, int i2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0OW r1 = (AnonymousClass0OW) it.next();
            int i3 = r1.A00;
            if (i3 > i) {
                r1.A00 = i3 - i2;
            }
            int i4 = r1.A01;
            if (i4 > i) {
                r1.A01 = i4 - i2;
            }
        }
    }

    public static void A39(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A3A(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A3B(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static boolean A3C() {
        C002701k A002 = C002701k.A00();
        return A002.A0F(233) && A002.A0E(233);
    }

    public static boolean A3D(Activity activity) {
        if (activity.isFinishing() || activity.isChangingConfigurations()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && activity.isDestroyed();
    }

    public static boolean A3E(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean A3F(Context context) {
        try {
            if (AnonymousClass0LP.A00.A00(context, 12451000) != 0) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("google-utils/checkGooglePlayServicesStatus/unexpected exception/");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public static boolean A3G(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static boolean A3H(AccessibilityManager accessibilityManager) {
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean A3I(AbstractC004502c r2) {
        if (r2.AB1() || !(r2 instanceof ActivityC004702f)) {
            return false;
        }
        ((ActivityC004702f) r2).A0J("DoNotShareCodeDialogTag");
        r2.APm(new DisplayExceptionDialogFactory$LoginFailedDialogFragment());
        return true;
    }

    public static boolean A3J(AbstractC004502c r2, C03160Fa r3, AnonymousClass0FE r4) {
        if (r2.AB1() || !(r2 instanceof ActivityC004702f)) {
            return false;
        }
        r4.A03 = true;
        r3.A09(true);
        r2.APm(new DisplayExceptionDialogFactory$ClockWrongDialogFragment());
        return true;
    }

    public static boolean A3K(AbstractC004502c r2, C03160Fa r3, AnonymousClass0FE r4) {
        if (r2.AB1() || !(r2 instanceof ActivityC004702f)) {
            return false;
        }
        r4.A03 = true;
        r3.A09(true);
        r2.APm(new DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment());
        return true;
    }

    public static boolean A3L(C000300f r3) {
        return r3.A06(AbstractC000400g.A3I) >= 2 && r3.A06(AbstractC000400g.A3J) >= 2;
    }

    public static boolean A3M(C000300f r2) {
        return r2.A06(AbstractC000400g.A3I) >= 2;
    }

    public static boolean A3N(C000300f r2, AnonymousClass03P r3) {
        return Build.VERSION.SDK_INT >= 26 && r3.A0H.A00.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && r2.A0D(AbstractC000400g.A25);
    }

    public static boolean A3O(C000300f r3, AnonymousClass00D r4) {
        if (!A3L(r3) || r4.A00.getInt("joinable_call_education_shown_count", 0) >= 1) {
            return false;
        }
        return true;
    }

    public static boolean A3P(C000300f r0, CallInfo callInfo) {
        return A3M(r0) && callInfo.isInLonelyState();
    }

    public static boolean A3Q(AnonymousClass1RF r2, AbstractC03860Ib r3, int i) {
        Boolean bool = (Boolean) AnonymousClass1R1.A01(r3, new AnonymousClass2C7(r2), "gdrive-backup-util/fetch-token", i);
        return bool != null && bool.booleanValue();
    }

    public static boolean A3R(AnonymousClass03P r0, AnonymousClass022 r1, CharSequence charSequence) {
        return charSequence != null && !C003701u.A0E(A1C(r0, r1, charSequence));
    }

    public static boolean A3S(AnonymousClass0AM r5) {
        return r5.A05() == 5;
    }

    public static boolean A3T(C007003k r6, List list, MessageDigest messageDigest) {
        Jid jid = r6.A09;
        if (jid == null) {
            throw null;
        } else if (jid.equals(AnonymousClass0QU.A00)) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(jid.user);
            sb.append("WA_ADD_NOTIF");
            String obj = sb.toString();
            messageDigest.reset();
            messageDigest.update(obj.getBytes());
            byte[] digest = messageDigest.digest();
            for (int i = 0; i < list.size(); i++) {
                byte[] bArr = (byte[]) list.get(i);
                if (digest.length >= bArr.length) {
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        if (digest[i2] == bArr[i2]) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean A3U(C007003k r1, boolean z) {
        AnonymousClass0QW r0 = r1.A08;
        if (r0 == null || TextUtils.isEmpty(r0.A01)) {
            return true;
        }
        Jid jid = r1.A09;
        return jid == null ? !z : A3V(jid);
    }

    public static boolean A3V(Jid jid) {
        return !AnonymousClass1VY.A0Z(jid) || AnonymousClass1VY.A0a(jid);
    }

    public static boolean A3W(AnonymousClass0M3 r3) {
        if (r3 == null) {
            return false;
        }
        AnonymousClass0M4 r1 = r3.A02;
        if (TextUtils.isEmpty(r3.A05) || r1 == null || r1.A0U != null) {
            return false;
        }
        AnonymousClass0M4 r0 = r3.A02;
        if (r0 == null) {
            throw null;
        } else if (r0.A0F == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A3X(CallInfo callInfo) {
        if (!Voip.A09(callInfo)) {
            return false;
        }
        if (callInfo.videoEnabled || (Build.MODEL.equals("Nokia 3.1 Plus") && Build.VERSION.SDK_INT == 28)) {
            return true;
        }
        return false;
    }

    public static boolean A3Y(CallInfo callInfo, C000300f r6) {
        if (callInfo.callState != Voip.CallState.ACTIVE) {
            return false;
        }
        int i = 0;
        for (Map.Entry entry : callInfo.participants.entrySet()) {
            if (((AnonymousClass0QY) entry.getValue()).A01 == 1) {
                i++;
            }
        }
        if (i >= 8 || callInfo.participants.size() >= r6.A06(AbstractC000400g.A39)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r3 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A3Z(java.io.File r5) {
        /*
            r4 = 0
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x0043 }
            if (r0 != 0) goto L_0x0008
            return r4
        L_0x0008:
            java.lang.String r2 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0043 }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r1, r0)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r0 = "PRAGMA integrity_check"
            java.lang.String r2 = android.database.DatabaseUtils.stringForQuery(r3, r0, r1)     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "msgstore/fieldstat/isdatabaseintegrityok "
            r1.append(r0)     // Catch:{ all -> 0x003a }
            r1.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x003a }
            com.whatsapp.util.Log.i(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "ok"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0039
            r3.close()
        L_0x0039:
            return r0
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "msgstore/fieldstat/isdatabaseintegrityok/error "
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A3Z(java.io.File):boolean");
    }

    public static boolean A3a(File file, AnonymousClass1RH r7, AbstractC03860Ib r8, AbstractC27521Qi r9, AnonymousClass1RF r10) {
        C41671vR r2 = new C41671vR(r10, file, r7, r9, r8);
        StringBuilder A0S = AnonymousClass008.A0S("gdrive/restore/file ");
        A0S.append(file.getAbsolutePath());
        Boolean bool = (Boolean) AnonymousClass1R1.A00(r8, r2, A0S.toString());
        return bool != null && bool.booleanValue();
    }

    public static boolean A3b(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            if (obj == obj2) {
                return true;
            }
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        } else if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        } else {
            return true;
        }
    }

    public static boolean A3c(String str) {
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (!(Character.isLetterOrDigit(c) || c == '-' || c == '_')) {
                return false;
            }
        }
        return true;
    }

    public static boolean A3d(String str) {
        String queryParameter;
        if (TextUtils.isEmpty(str) || (queryParameter = Uri.parse(str).getQueryParameter("src")) == null || !queryParameter.equals("qr")) {
            return false;
        }
        return true;
    }

    public static boolean A3e(String str, String str2) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str2);
        sb.append("/");
        if (!str.startsWith(sb.toString())) {
            StringBuilder sb2 = new StringBuilder("http://");
            sb2.append(str2);
            sb2.append("/");
            return str.startsWith(sb2.toString());
        }
    }

    public static boolean A3f(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A3g(List list, List list2) {
        if (list != null) {
            if (list2 == null) {
                return list.isEmpty();
            }
            if (!list.isEmpty() && !list2.isEmpty()) {
                return new HashSet(list).equals(new HashSet(list2));
            }
            if (!list.isEmpty() || !list2.isEmpty()) {
                return false;
            }
            return true;
        } else if (list2 == null || list2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A3h(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A3i(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
            if (!(obj == null || obj2 == null || !obj.equals(obj2))) {
                return true;
            }
        }
        return false;
    }

    public static byte[] A3j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder A0S = AnonymousClass008.A0S("orig_thumbnail/width:");
        A0S.append(bitmap.getWidth());
        A0S.append("/height:");
        A0S.append(bitmap.getHeight());
        Log.i(A0S.toString());
        if (bitmap.getWidth() > 100 || bitmap.getHeight() > 100) {
            float max = Math.max(((float) bitmap.getWidth()) / 100.0f, ((float) bitmap.getHeight()) / 100.0f);
            Rect rect = new Rect(0, 0, (int) (((float) bitmap.getWidth()) / max), (int) (((float) bitmap.getHeight()) / max));
            rect.right = Math.max(rect.right, 1);
            rect.bottom = Math.max(rect.bottom, 1);
            Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Bitmap.Config config = bitmap.getConfig();
            try {
                int width = rect.width();
                int height = rect.height();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                canvas.drawBitmap(bitmap, rect2, rect, paint);
                bitmap.recycle();
                StringBuilder sb = new StringBuilder("rescaled_thumbnail/width:");
                sb.append(createBitmap.getWidth());
                sb.append("/height:");
                sb.append(createBitmap.getHeight());
                Log.i(sb.toString());
                bitmap = createBitmap;
            } catch (OutOfMemoryError e) {
                Log.e("video-thumbnail/scale/out-of-memory", e);
                bitmap.recycle();
                throw e;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        return byteArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A3k(java.io.File r2) {
        /*
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            byte[] r0 = X.C006803i.A0s(r1)     // Catch:{ all -> 0x000d }
            r1.close()
            return r0
        L_0x000d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000f }
        L_0x000f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0013 }
        L_0x0013:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002001d.A3k(java.io.File):byte[]");
    }

    public static byte[] A3l(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass0QZ) it.next()).A00.A00());
        }
        Collections.sort(arrayList, new AnonymousClass3CK());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] A3m(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static byte[] A3n(byte[] bArr, List list, byte[] bArr2, boolean z) {
        int i;
        boolean z2 = false;
        if (bArr.length == 128) {
            z2 = true;
        }
        AnonymousClass00E.A09(z2, "Current hash array must be of size 128");
        byte[] bArr3 = new byte[128];
        System.arraycopy(bArr, 0, bArr3, 0, 128);
        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr4 = (byte[]) it.next();
            if (bArr4 != null) {
                ByteBuffer wrap2 = ByteBuffer.wrap(A3o(bArr4, bArr2, 128));
                wrap2.order(ByteOrder.LITTLE_ENDIAN);
                wrap.mark();
                while (wrap.hasRemaining()) {
                    int position = wrap.position();
                    int i2 = wrap.getShort() & 65535;
                    int i3 = wrap2.getShort() & 65535;
                    if (z) {
                        i = i2 + i3;
                    } else {
                        i = i2 - i3;
                    }
                    int position2 = wrap.position();
                    wrap.position(position);
                    wrap.putShort((short) (((short) i) & 65535));
                    wrap.position(position2);
                }
                wrap.reset();
            } else {
                throw null;
            }
        }
        return wrap.array();
    }

    public static byte[] A3o(byte[] bArr, byte[] bArr2, int i) {
        return A3p(bArr, new byte[32], bArr2, i);
    }

    public static byte[] A3p(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            byte[] doFinal = instance.doFinal(bArr);
            try {
                int ceil = (int) Math.ceil(((double) i) / 32.0d);
                byte[] bArr4 = new byte[0];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int i2 = 1; i2 < ceil + 1; i2++) {
                    Mac instance2 = Mac.getInstance("HmacSHA256");
                    instance2.init(new SecretKeySpec(doFinal, "HmacSHA256"));
                    instance2.update(bArr4);
                    if (bArr3 != null) {
                        instance2.update(bArr3);
                    }
                    instance2.update((byte) i2);
                    bArr4 = instance2.doFinal();
                    int min = Math.min(i, bArr4.length);
                    byteArrayOutputStream.write(bArr4, 0, min);
                    i -= min;
                }
                return byteArrayOutputStream.toByteArray();
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static int[] A3q(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = bArr[i4] & 255;
            int i7 = i4 + 1;
            int i8 = bArr[i7] & 255;
            int i9 = i + i4;
            int i10 = bArr[i9] & 255;
            int i11 = i9 + 1;
            int i12 = bArr[i11] & 255;
            int i13 = i3 + i5;
            int i14 = bArr[i13] & 255;
            int i15 = bArr[(i3 >> 2) + i13] & 255;
            if (!z) {
                i14 = i15;
                i15 = i14;
            }
            int i16 = i14 - 128;
            int i17 = i15 - 128;
            iArr[i4] = A02(i6, i16, i17);
            iArr[i7] = A02(i8, i16, i17);
            iArr[i9] = A02(i10, i16, i17);
            iArr[i11] = A02(i12, i16, i17);
            if (i4 != 0 && (i4 + 2) % i == 0) {
                i4 = i9;
            }
            i4 += 2;
            i5++;
        }
        return iArr;
    }

    public static Signature[] A3r(Context context) {
        String packageName = context.getPackageName();
        if (context.getPackageManager() == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
